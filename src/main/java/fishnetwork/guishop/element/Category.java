package fishnetwork.guishop.element;

import java.util.HashMap;
import java.util.Map;

import cn.nukkit.Player;
import cn.nukkit.block.BlockID;
import cn.nukkit.item.Item;
import cn.nukkit.utils.DyeColor;
import ru.ragnok123.menuAPI.inventory.InventoryCategory;
import ru.ragnok123.menuAPI.inventory.InventoryMenu;
import ru.ragnok123.menuAPI.inventory.item.ItemClick;
import ru.ragnok123.menuAPI.inventory.item.ItemData;

public class Category extends ItemClick {


    /*		
     *      0 1 2 3 4 5 6 7 8 (x)
	 *    0 x x x x x x x x x
	 *    1 x x x x x x x x x
	 *    2 x x x x x x x x x
	 *    3 x x x x x x x x x
	 *    4 x x x x x x x x x
	 *    5 x x x x x x x x x
     *   (y)
	 */


    /**
     * 空白埋めをするためのアイテム(Airにすれば空白)
     */
    private static final Item SPACE_ITEM = Item.get(BlockID.STAINED_GLASS_PANE, DyeColor.LIGHT_GRAY.getWoolData());

    /**
     * ショップのサイズ
     */
    private static final int SHOP_SIZE = 54;


    /** @var InventoryCategory */
    private InventoryCategory inventory_category = new InventoryCategory();


    /** @var ItemClick[int] */
    private Map<Integer, ItemClick> contents = new HashMap<Integer, ItemClick>();


    /** @var Item */
    private Item item;


    /** @var String */
    private String id;


    /**
     * ショップのカテゴリ
     * InventoryMenuを引数に取り登録も行います
     * @param id
     * @param item
     * @param contents
     * @param inventory_menu
     */
    public Category(String id, Item item, InventoryMenu inventory_menu) {
        for(int i = 0; i < SHOP_SIZE; i++) this.inventory_category.addElement(i, ItemData.fromItem(SPACE_ITEM));
        inventory_menu.addCategory(id, this.inventory_category);
        this.inventory_category.menu = inventory_menu;
        this.id = id;
        this.item = item;
        this.item.setLore(
            "",
            "§dタップして開く"
        );
    }


    /**
     * IDを取得します
     * @return
     */
    public String getId() {
        return this.id;
    }


    /**
     * Itemを取得します
     * @return
     */
    public Item getItem() {
        return this.item;
    }


    /**
     * カテゴリーを追加します
     * @param x
     * @param y
     * @param category
     */
    public Category addCategory(int x, int y, Category category) {
        int slot = x + y * 9;
        this.contents.put(slot, category);
        this.inventory_category.addElement(slot, ItemData.fromItem(category.getItem()), category);
        return this;
    }


    /**
     * コンテンツ(商品)を追加します
     * @param x
     * @param y
     * @param content
     */
    public Category addContent(int x, int y, Content content) {
        int slot = x + y * 9;
        this.contents.put(slot, content);
        this.inventory_category.addElement(slot, ItemData.fromItem(content.getItem()), content);
        return this;
    }


    /**
     * プレイヤーに表示します
     * @param player
     */
    public void show(Player player) {
        this.inventory_category.getMenu().openCategory(this.getId(), player);
    }


    /**
     * InventoryCategoryを取得します
     * @return
     */
    public InventoryCategory getInventoryCategory() {
        return this.inventory_category;
    }


    @Override
    public void onClick(Player player, Item item) {
        this.show(player);
    }


}