package fishnetwork.guishop.from;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import fishnetwork.guishop.element.Content;
import fishnetwork.guishop.language.Lang;
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
            "§7購入§f: §e$"+content.getBuy()+"\n"+
            "§7売却§f: §e$"+content.getSell()
        )
        .addToggle("購入 / 売却", false)
        .addToggle("全て売却する", false)
        .addInput("取引する個数を入力してください");
        form.send(player, (targetPlayer, targetForm, data) -> {
            if(data == null) return;
            EconomyAPI economy = EconomyAPI.getInstance();
            if((boolean)data.get(ALL_SELL)) {
                int amount = 0;
                int price = content.getSell();
                for(Item contents: player.getInventory().getContents().values()) {
                    if(contents.equals(Item.get(item.getId(), item.getDamage()))) amount += contents.getCount();
                }
                economy.addMoney(player, amount * price);
                player.getInventory().removeItem(Item.get(item.getId(), item.getDamage(), amount));
                player.sendMessage(Lang.get("prefix")+Lang.get("item_transaction", item.getName(), amount, "売却", amount * price));
                return;
            }
            if(!data.get(AMOUNT).toString().matches("[0-9]+")) {
                player.sendMessage(Lang.get("prefix")+Lang.get("invalid_value"));
                return;
            }
            int amount = Integer.parseInt(data.get(AMOUNT).toString());
            int price = (boolean)data.get(TYPE) ? content.getSell() : content.getBuy();
            if((boolean)data.get(TYPE)) {
                if(!player.getInventory().contains(Item.get(item.getId(), item.getDamage(), amount))) {
                    player.sendMessage(Lang.get("prefix")+Lang.get("insufficient_error", "アイテム"));
                    return;
                }
                economy.addMoney(player, amount * price);
                player.getInventory().removeItem(Item.get(item.getId(), item.getDamage(), amount));
                player.sendMessage(Lang.get("prefix")+Lang.get("item_transaction", item.getName(), amount, "売却", amount * price));
            }else{
                if(amount * price > economy.myMoney(player)) {
                    player.sendMessage(Lang.get("prefix")+Lang.get("insufficient_error", "所持金"));
                    return;
                }
                if(!player.getInventory().canAddItem(Item.get(item.getId(), item.getDamage(), amount))) {
                    player.sendMessage(Lang.get("prefix")+Lang.get("insufficient_error", "インベントリの空き"));
                    return;
                }
                economy.reduceMoney(player, amount * price);
                player.getInventory().addItem(Item.get(item.getId(), item.getDamage(), amount));
                player.sendMessage(Lang.get("prefix")+Lang.get("item_transaction", item.getName(), amount, "購入", amount * price));
            }
        });
    }

    
}
