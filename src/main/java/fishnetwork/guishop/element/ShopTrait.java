package fishnetwork.guishop.element;

import java.util.Map;

import ru.ragnok123.menuAPI.inventory.item.ItemClick;

public abstract class ShopTrait extends ItemClick {


    public abstract Map<String, Object> toMap();


    public abstract ShopTrait fromMap();


}
