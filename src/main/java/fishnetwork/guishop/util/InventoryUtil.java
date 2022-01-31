package fishnetwork.guishop.util;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class InventoryUtil {


    public static boolean canAddItem(Inventory inventory, ItemStack item) {
        int freeSlots = 0;
        for(int slot = 0; slot < inventory.getSize(); slot++) {
            ItemStack slotItem = inventory.getItem(slot);
            if(slotItem == null || slotItem.getType() == Material.AIR) {
                freeSlots += item.getMaxStackSize();
            }else{
                if(slotItem.isSimilar(item)) {
                    freeSlots += Math.max(0, slotItem.getMaxStackSize() - slotItem.getAmount());
                }
            }
        }
        return freeSlots >= item.getAmount();
    }


}
