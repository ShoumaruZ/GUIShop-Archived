package fishnetwork.officialshop.form;

import cn.nukkit.Player;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.item.Item;
import fishnetwork.officialshop.Content;
import fishnetwork.officialshop.Shop;
import fishnetwork.officialshop.utils.InventoryUtils;
import fishnetwork.userapi.User;
import fishnetwork.userapi.UserAPI;
import fishnetwork.userapi.exception.InsufficientMoneyException;
import ru.nukkitx.forms.elements.CustomForm;

public class TransactionForm {


    private static final int TYPE = 1;
    private static final int ALL_SELL = 2;
    private static final int AMOUNT = 3;


    public static void sendForm(Player player, Content content, Shop parentShop) {
        User user = UserAPI.getUser(player);
        Item item = content.getItem().clone();
        Inventory inventory = player.getInventory();
        CustomForm form = new CustomForm("Shop")
        .addLabel(String.format("""
            §7アイテム§f: %s - %s:%s
            §7個数§f: ×%s
            §7購入§f: §e$%s
            §7売却§f: §e$%s""",
            item.getName(), item.getId(), item.getDamage(), item.getCount(), content.getBuy(), content.getSell()
        ))
        .addToggle("購入 / 売却", false)
        .addToggle("全て売却する", false)
        .addInput("取引する個数を入力してください");
        form.send(player, (targetPlayer, targetForm, data) -> {
            if(data == null) return;
            if((boolean)data.get(ALL_SELL)) {
                int amount = InventoryUtils.getItemAllCount(item, inventory);
                int price = amount * content.getSell();
                user.addMoney(price);
                item.setCount(amount * item.getCount());
                inventory.removeItem(item);
                player.sendMessage(String.format("§7» §3Shop §7| §f%s§bを§f%s§b個売却しました(§e$%s§b)", item.getName(), item.getCount(), price));
                parentShop.sendForm(player);
                return;
            }
            if(!data.get(AMOUNT).toString().matches("[0-9]+")) {
                player.sendMessage("§7» §3Shop §7| §c正しい数値を入力してください");
                return;
            }
            if((boolean)data.get(TYPE) || (boolean)data.get(ALL_SELL)) {
                if(!inventory.contains(item)) {
                    player.sendMessage("§7» §3Shop §7| §cアイテムが不足しています");
                    return;
                }
                int amount = Integer.parseInt(data.get(AMOUNT).toString());
                int price = amount * content.getSell();
                user.addMoney(price);
                item.setCount(amount * item.getCount());
                inventory.removeItem(item);
                player.sendMessage(String.format("§7» §3Shop §7| §f%s§bを§f%s§b個売却しました(§e$%s§b)", item.getName(), item.getCount(), price));
            }else{
                if(!inventory.canAddItem(item)) {
                    player.sendMessage("§7» §3Shop §7| §c空きスロットが不足しています");
                    return;
                }
                int amount = Integer.parseInt(data.get(AMOUNT).toString());
                int price = amount * content.getBuy();
                try {
                    item.setCount(amount * item.getCount());
                    user.reduceMoney(price);
                    inventory.addItem(item);
                    player.sendMessage(String.format("§7» §3Shop §7| §f%s§bを§f%s§b個購入しました(§e$%s§b)", item.getName(), item.getCount(), price));
                }catch(InsufficientMoneyException exception) {
                    player.sendMessage("§7» §3Shop §7| §c所持金が不足しています");
                    return;
                }
            }
            parentShop.sendForm(player);
        });
    }

    
}
