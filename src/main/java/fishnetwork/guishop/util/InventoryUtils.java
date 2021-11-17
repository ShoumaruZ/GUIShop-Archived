package fishnetwork.guishop.util;

import cn.nukkit.inventory.Inventory;
import cn.nukkit.item.Item;

public class InventoryUtils {



    public static int getItemAllCount(Item item, Inventory inventory) {
        int count = 0;
        for(Item content: inventory.getContents().values()) {
            if(!content.equals(item)) continue;
            count += content.getCount();
        }
        return count;
    }


    
}
