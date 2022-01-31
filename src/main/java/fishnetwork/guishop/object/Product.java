package fishnetwork.guishop.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fishnetwork.guishop.GUIShop;
import fishnetwork.guishop.language.Language;
import fishnetwork.guishop.util.InventoryUtil;
import fishnetwork.guishop.util.ItemUtil;
import lombok.Value;
import net.milkbowl.vault.economy.Economy;

@Value
public final class Product {


    private final ItemStack item;

    private final Double buy;
    private final Double sell;

    private final GUIShop guiShop;


    @SuppressWarnings("unchecked")
    public static Product deserialize(Map<String, Object> data, GUIShop guiShop) {
        Map<String, Object> price = (Map<String, Object>)data.get("price");
        Double buy = null, sell = null;
        if(price.containsKey("buy")) buy = Double.parseDouble(price.get("buy").toString());
        if(price.containsKey("sell")) sell = Double.parseDouble(price.get("sell").toString());
        return new Product(
            ItemUtil.deserialize((Map<String, Object>)data.get("item")),
            buy, sell, guiShop
        );
    }


    public boolean canBuy() {
        return buy != null;
    }


    public boolean canSell() {
        return sell != null;
    }


    public ItemStack getItem() {
        return item.clone();
    }


    public List<Integer> getChoiceAmounts() {
        List<Integer> amounts = new ArrayList<>();
        for(int i = getItem().getAmount(); i <= getItem().getMaxStackSize(); i *= 2) amounts.add(i);
        if(amounts.size() > 5) amounts.removeAll(amounts.subList(1, amounts.size() - 4));
        return amounts;
    }


    public void buy(Player player, int amount) {
        Inventory inventory = player.getInventory();
        Language language = guiShop.getLanguage();
        Economy economy = guiShop.getEconomy();
        ItemStack item = getItem();
        if(!canBuy()) {
            player.sendMessage(language.getMessage("transaction.error.cantBuy"));
            return;
        }
        double price = buy * amount;
        item.setAmount(item.getAmount() * amount);
        if(!economy.has(player, price)) {
            player.sendMessage(language.getMessage("transaction.error.insufficientMoney"));
            return;
        }
        if(!InventoryUtil.canAddItem(inventory, item)) {
            player.sendMessage(language.getMessage("transaction.error.insufficientSlot"));
            return;
        }
        economy.withdrawPlayer(player, price);
        inventory.addItem(item);
        player.sendMessage(language.getMessage("transaction.success.buy", ItemUtil.getCleanName(item), item.getAmount(), price));
    }


    public void sell(Player player, int amount) {
        Inventory inventory = player.getInventory();
        Language language = guiShop.getLanguage();
        Economy economy = guiShop.getEconomy();
        if(!canSell()) {
            player.sendMessage(language.getMessage("transaction.error.cantSell"));
            return;
        }
        ItemStack item = getItem();
        double price = sell * amount;
        item.setAmount(item.getAmount() * amount);
        if(!inventory.containsAtLeast(item, item.getAmount())) {
            player.sendMessage(language.getMessage("transaction.error.insufficientItem"));
            return;
        }
        economy.depositPlayer(player, price);
        inventory.removeItem(item);
        player.sendMessage(language.getMessage("transaction.success.sell", ItemUtil.getCleanName(item), item.getAmount(), price));
    }


}