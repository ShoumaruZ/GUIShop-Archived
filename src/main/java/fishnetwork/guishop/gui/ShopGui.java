package fishnetwork.guishop.gui;

import java.util.List;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fishnetwork.guishop.GUIShop;
import fishnetwork.guishop.language.Language;
import fishnetwork.guishop.object.Category;
import fishnetwork.guishop.object.Product;
import fishnetwork.guishop.util.ItemUtil;
import lombok.Getter;

@Getter
public class ShopGui extends ChestGui {


    private final StaticPane pane = new StaticPane(9, 6);

    private final GUIShop guiShop;

    private Category currentCategory = null;


    public ShopGui(GUIShop guiShop) {
        super(6, "SHOP");
        this.guiShop = guiShop;
        addPane(pane);
        setOnClose(event -> event.getPlayer());
        setOnGlobalClick(event -> event.setCancelled(true));
    }


    public void changeCategory(Category category) {
        currentCategory = category;
        pane.clear();
        category.getElements().forEach((slot, element) -> {
            pane.addItem(element, slot % 9, (int)(slot / 9));
        });
        pane.fillWith(guiShop.getSettings().getBackgroundItem());
        update();
    }


    public void openTransactionMenu(Product product) {
        Language language = guiShop.getLanguage();
        List<Integer> amounts = product.getChoiceAmounts();
        pane.clear();
        pane.addItem(new GuiItem(product.getItem()), 7, 1);
        pane.addItem(new GuiItem(ItemUtil.setDisplayName(
            new ItemStack(Material.BARRIER),
            language.getMessage("transaction.cancel")
        ), event -> {
            guiShop.getGuiManager().getGui((Player)event.getWhoClicked()).changeCategory(currentCategory);
        }), 7, 4);
        for(int i = 0; i < amounts.size(); i++) {
            int amount = amounts.get(i);
            if(product.canBuy()) pane.addItem(
                new GuiItem(ItemUtil.setDisplayName(
                    new ItemStack(Material.LIME_STAINED_GLASS_PANE, amount),
                    language.getMessage("transaction.selector.buy", amount)
                ), event -> product.buy((Player)event.getWhoClicked(), amount)
            ), i + 1, 1);
            if(product.canSell()) pane.addItem(
                new GuiItem(ItemUtil.setDisplayName(
                    new ItemStack(Material.RED_STAINED_GLASS_PANE, amount),
                    language.getMessage("transaction.selector.sell", amount)
                ), event -> product.sell((Player)event.getWhoClicked(), amount)
            ), i + 1, 3);
        }
        pane.fillWith(guiShop.getSettings().getBackgroundItem());
        update();
    }


}
