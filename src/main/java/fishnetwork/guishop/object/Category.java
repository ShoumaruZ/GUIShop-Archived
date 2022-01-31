package fishnetwork.guishop.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import fishnetwork.guishop.GUIShop;
import fishnetwork.guishop.gui.ShopGui;
import fishnetwork.guishop.language.Language;
import fishnetwork.guishop.object.Category.Element.Type;
import fishnetwork.guishop.util.ItemUtil;
import lombok.Getter;
import lombok.Value;

@Value
public final class Category {


    private final String name;

    private final Map<Integer, Element> elements;

    private final GUIShop guiShop;


    @SuppressWarnings("unchecked")
    public static Category deserialize(Map<String, Object> data, GUIShop guiShop) {
        Map<Integer, Element> elements = new HashMap<>();
        ((Map<String, Object>)data.get("elements")).forEach((slotStr, element) -> {
            int slot = Integer.parseInt(slotStr);
            Map<String, Object> elementData = (Map<String, Object>)element;
            switch(Type.valueOf(elementData.get("type").toString())) {
                case CATEGORY -> elements.put(slot, Element.getCategory(
                    ItemUtil.deserialize((Map<String, Object>)elementData.get("item")),
                    elementData.get("category").toString(), guiShop
                ));
                case PRODUCT -> elements.put(slot, Element.getProduct(
                    ItemUtil.deserialize((Map<String, Object>)elementData.get("item")),
                    Product.deserialize(elementData, guiShop), guiShop
                ));
            }
        });
        return new Category(data.get("name").toString(), elements, guiShop);
    }


    @Getter
    public static final class Element extends GuiItem {


        private final Type type;

        private final Product product;
        private final String categoryName;

        private final GUIShop guiShop;


        public Element(ItemStack item, Type type, Product product, String categoryName, GUIShop guiShop) {
            super(item);
            this.type = type;
            this.product = product;
            this.categoryName = categoryName;
            this.guiShop = guiShop;
        }


        public static Element getCategory(ItemStack item, String categoryName, GUIShop guiShop) {
            Language language = guiShop.getLanguage();
            item = ItemUtil.addLore(item, Arrays.asList(
                language.getMessage("gui.element.lore.separation"),
                "", language.getMessage("gui.element.lore.click")
            ));
            return new Element(item, Type.CATEGORY, null, categoryName, guiShop);
        }


        public static Element getProduct(ItemStack item, Product product, GUIShop guiShop) {
            Language language = guiShop.getLanguage();
            List<String> lore = new ArrayList<>();
            lore.add(language.getMessage("gui.element.lore.separation"));
            if(product.canBuy()) lore.add(language.getMessage("gui.element.lore.buy", product.getBuy()));
            if(product.canSell()) lore.add(language.getMessage("gui.element.lore.sell", product.getSell()));
            lore.addAll(Arrays.asList("", language.getMessage("gui.element.lore.click")));
            item = ItemUtil.addLore(item, lore);
            return new Element(item, Type.PRODUCT, product, null, guiShop);
        }


        @Override
        public void callAction(InventoryClickEvent event) {
            ShopGui gui = guiShop.getGuiManager().getGui((Player)event.getWhoClicked());
            switch(type) {
                case CATEGORY -> gui.changeCategory(guiShop.getCategory(categoryName));
                case PRODUCT -> gui.openTransactionMenu(product);
            }
        }


        public enum Type {

            CATEGORY, PRODUCT

        }


    }


}
