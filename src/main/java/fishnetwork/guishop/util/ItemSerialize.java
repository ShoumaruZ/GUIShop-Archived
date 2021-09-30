package fishnetwork.guishop.util;

import java.util.Base64;

import cn.nukkit.item.Item;

public class ItemSerialize {


    /**
     * ItemをStringに変換します
     * ID:Damage:Count:NBT
     * @param item
     * @return
     */
    public String serialize(Item item) {
        String tag_base64 = Base64.getEncoder().encodeToString(item.getCompoundTag());
        return item.getId()+":"+item.getDamage()+":"+item.getCount()+":"+tag_base64;
    }


    /**
     * StringをItemに変換します
     * ID:Damage:Count:NBT
     * @param item
     * @return
     */
    public Item unserialize(String item) {
        String[] data = item.split(":", 0);
        byte[] tag = Base64.getDecoder().decode(data[3]);
        return Item.get(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]), tag);
    }
    
}
