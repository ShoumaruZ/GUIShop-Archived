package fishnetwork.officialshop;

import cn.nukkit.item.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Content implements Element {



    private final Item item;

    private final String name;
    private final String imagePath;

    private final int buy;
    private final int sell;


    
}
