package fishnetwork.guishop.element;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import fishnetwork.guishop.from.TransactionForm;
import ru.ragnok123.menuAPI.inventory.item.ItemClick;

public class Content extends ItemClick {


    /** Price Type */
    public final static int BUY_PRICE = 0;
    public final static int SELL_PRICE = 1;


    private Item item;


    private int[] price;


    public Content(Item item, int buy, int sell) {
        this.price = new int[]{buy, sell};
        this.item = item;
        this.item.setLore(
            "",
            "§b購入§f: §e$"+price[BUY_PRICE],
            "§b売却§f: §e$"+price[SELL_PRICE],
            "",
            "§dタップして開く"
        );
    }


    public Item getItem() {
        return this.item;
    }


    public int getPrice(int type) {
        return this.price[type];
    }


    @Override
    public void onClick(Player player, Item item) {
        TransactionForm.sendForm(player, this);
    }


}
