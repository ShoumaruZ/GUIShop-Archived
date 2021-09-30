package fishnetwork.guishop.from;

import cn.nukkit.Player;
import fishnetwork.guishop.element.Content;

public class TransactionForm {


    public static void sendForm(Player player, Content content) {
        System.out.println(
            "SHOP: "+content.getItem().toString()
        );
    }

    
}
