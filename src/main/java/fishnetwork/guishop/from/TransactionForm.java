package fishnetwork.guishop.from;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import fishnetwork.guishop.element.Content;
import me.onebone.economyapi.EconomyAPI;
import ru.nukkitx.forms.elements.CustomForm;

public class TransactionForm {


    private static final int TYPE = 1;
    private static final int ALL_SELL = 2;
    private static final int AMOUNT = 3;


    public static void sendForm(Player player, Content content) {
        Item item = content.getItem();
        CustomForm form = new CustomForm("Shop")
        .addLabel(
            "§7アイテム§f: "+item.getName()+" - "+item.getId()+":"+item.getDamage()+"\n"+
            "§7個数§f: ×"+item.getCount()+"\n"+
            "§7価格§f: \n"+
            " §f- §7購入§f: §e$"+content.getPrice(Content.BUY_PRICE)+"\n"+
            " §f- §7売却§f: §e$"+content.getPrice(Content.SELL_PRICE)
        )
        .addToggle("購入 / 売却", false)
        .addToggle("全て売却する", false)
        .addInput("取引する個数を入力してください");
        form.send(player, (targetPlayer, targetForm, data) -> {
            if(data == null) return;
            EconomyAPI economy = EconomyAPI.getInstance();
            if((boolean)data.get(ALL_SELL)) {
                int amount = 0;
                int price = content.getPrice(Content.SELL_PRICE);
                for(Item contents: player.getInventory().getContents().values()) {
                    if(contents.equals(Item.get(item.getId(), item.getDamage()))) amount += contents.getCount();
                }
                economy.addMoney(player, amount * price);
                player.getInventory().removeItem(Item.get(item.getId(), item.getDamage(), amount));
                player.sendMessage("§7[§bSHOP§7] §f"+item.getName()+"§bを"+amount+"個売却しました(§e$"+amount * price+"§b)");
                return;
            }
            if(!data.get(AMOUNT).toString().matches("[0-9]+")) {
                player.sendMessage("§7[§bSHOP§7] §c正しい数値を§f入力§cしてください");
                return;
            }
            int amount = Integer.parseInt(data.get(AMOUNT).toString());
            int price = content.getPrice((boolean)data.get(TYPE) ? Content.SELL_PRICE : Content.BUY_PRICE);
            if((boolean)data.get(TYPE)) {
                if(!player.getInventory().contains(Item.get(item.getId(), item.getDamage(), amount))) {
                    player.sendMessage("§7[§bSHOP§7] §cアイテムが§f不足§cしています");
                    return;
                }
                economy.addMoney(player, amount * price);
                player.getInventory().removeItem(Item.get(item.getId(), item.getDamage(), amount));
                player.sendMessage("§7[§bSHOP§7] §f"+item.getName()+"§bを"+amount+"個売却しました(§e$"+amount * price+"§b)");
            }else{
                if(amount * price > economy.myMoney(player)) {
                    player.sendMessage("§7[§bSHOP§7] §c所持金が§f不足§cしています"); 
                    return;
                }
                if(!player.getInventory().canAddItem(Item.get(item.getId(), item.getDamage(), amount))) {
                    player.sendMessage("§7[§bSHOP§7] §cインベントリの空きが§f不足§cしています");
                    return;
                }
                economy.reduceMoney(player, amount * price);
                player.getInventory().addItem(Item.get(item.getId(), item.getDamage(), amount));
                player.sendMessage("§7[§bSHOP§7] §f"+item.getName()+"§bを"+amount+"個購入しました(§e$"+amount * price+"§b)");
            }
        });
    }

    
}
