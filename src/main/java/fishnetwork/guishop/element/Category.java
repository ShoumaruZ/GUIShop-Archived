package fishnetwork.guishop.element;

import java.util.HashMap;
import java.util.Map;

import cn.nukkit.Player;
import cn.nukkit.block.BlockID;
import cn.nukkit.item.Item;
import cn.nukkit.utils.DyeColor;
import ru.ragnok123.menuAPI.inventory.InventoryCategory;
import ru.ragnok123.menuAPI.inventory.item.ItemClick;
import ru.ragnok123.menuAPI.inventory.item.ItemData;

public class Category extends ItemClick {


    private static final Item SPACE_ITEM = Item.getBlock(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getWoolData());
    
    private static final int SHOP_SIZE = 54;


    private InventoryCategory inventory_category = new InventoryCategory();


    private Map<Integer, ItemClick> contents = new HashMap<Integer, ItemClick>();


    private Item item;

    private String id;


    public Category(String id, Item item) {
        for(int i = 0; i < SHOP_SIZE; i++) inventory_category.addElement(i, ItemData.fromItem(SPACE_ITEM));
        this.id = id;
        this.item = item;
    }


    public String getId() {
        return id;
    }


    public Item getItem() {
        return item;
    }


    public Category addCategory(int x, int y, Category category) {
        int slot = x + y * 9;
        ItemData item = ItemData.fromItem(category.getItem());
        contents.put(slot, category);
        item.lores = new String[]{"", "§dタップして開く"};
        inventory_category.addElement(slot, item, category);
        return this;
    }


    public Category addContent(int x, int y, Content content) {
        int slot = x + y * 9;
        ItemData item = ItemData.fromItem(content.getItem());
        contents.put(slot, content);
        item.lores = new String[]{"", "§b購入§f: §e$"+content.getBuy(), "§b売却§f: §e$"+content.getSell(), "", "§dタップして開く"};
        inventory_category.addElement(slot, item, content);
        return this;
    }


    public void show(Player player) {
        inventory_category.getMenu().openCategory(getId(), player);
    }


    public InventoryCategory getInventoryCategory() {
        return inventory_category;
    }


    @Override
    public void onClick(Player player, Item item) {
        this.show(player);
    }


}