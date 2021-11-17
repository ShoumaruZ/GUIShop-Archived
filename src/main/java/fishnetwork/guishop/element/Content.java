package fishnetwork.guishop.element;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.item.Item;
import fishnetwork.guishop.Main;
import fishnetwork.guishop.from.TransactionForm;
import ru.ragnok123.menuAPI.inventory.InventoryMenuHandler;
import ru.ragnok123.menuAPI.inventory.item.ItemClick;

public class Content extends ItemClick {


    private Item item;


    private int buy;
    private int sell;


    public Content(Item item, int buy, int sell) {
        this.buy = buy;
        this.sell = sell;
        this.item = item;
    }


    public int getBuy() {
        return buy;
    }


    public int getSell() {
        return sell;
    }


    public Item getItem() {
        return item;
    }


    @Override
    public void onClick(Player player, Item item) {
        InventoryMenuHandler.getMenuByPlayer(player.getUniqueId()).forceDestroy(player);
        Server.getInstance().getScheduler().scheduleDelayedTask(Main.getInstance(), () -> {
            TransactionForm.sendForm(player, this);
        }, 10);
    }


}
