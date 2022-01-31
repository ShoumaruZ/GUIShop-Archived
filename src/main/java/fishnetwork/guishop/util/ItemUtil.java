package fishnetwork.guishop.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.WordUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public final class ItemUtil {
    

    public static ItemStack addLore(ItemStack item, List<String> lore) {
        ItemMeta meta = item.getItemMeta();
        lore.addAll(0, meta.getLore() == null ? new ArrayList<String>() : meta.getLore());
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }


    public static ItemStack setDisplayName(ItemStack item, String displayName) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        item.setItemMeta(meta);
        return item;
    }


    public static String getCleanName(ItemStack item) {
        return WordUtils.capitalizeFully(item.getType().name().replace("_", " "));
    }


    public static ItemStack getPlayerHead(OfflinePlayer player) {
        ItemStack playerHead = new ItemStack(Material.SKELETON_SKULL, 1);
        SkullMeta skullMeta = (SkullMeta)playerHead.getItemMeta();
        skullMeta.setOwningPlayer(player);
        Damageable meta = (Damageable)playerHead.getItemMeta();
        meta.setDamage(3);
        return playerHead;
    }


    @SuppressWarnings("unchecked")
    public static ItemStack deserialize(Map<String, Object> data) {
        ItemStack item = new ItemStack(Material.valueOf(data.get("material").toString()));
        if(item.getType() == Material.AIR) return item;
        ItemMeta meta = item.getItemMeta();
        if(data.containsKey("amount")) {
            item.setAmount((int)data.get("amount"));
        }
        if(data.containsKey("damage")) {
            ((Damageable)item).setDamage((int)data.get("damage"));
        }
        if(data.containsKey("display_name")) {
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', data.get("display_name").toString()));
        }
        if(data.containsKey("enchantments")) {
            ((Map<String, Integer>)data.get("enchantments")).forEach((enchantment, level) -> {
                meta.addEnchant(Enchantment.getByKey(NamespacedKey.fromString(enchantment)), level, true);
            });
        }
        if(data.containsKey("lore")) {
            meta.setLore(((List<String>)data.get("lore")).stream().map(lore -> ChatColor.translateAlternateColorCodes('&', lore)).collect(Collectors.toList()));
        }
        item.setItemMeta(meta);
        return item;
    }


}
