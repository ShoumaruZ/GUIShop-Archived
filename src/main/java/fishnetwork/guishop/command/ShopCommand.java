package fishnetwork.guishop.command;

import java.util.HashMap;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.item.Item;
import fishnetwork.guishop.element.Category;
import fishnetwork.guishop.element.Content;
import ru.ragnok123.menuAPI.inventory.InventoryMenu;
import ru.ragnok123.menuAPI.inventory.item.ItemClick;

public class ShopCommand extends Command {


    public ShopCommand() {
        super("shop", "ショップを開きます");
    }


    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if(!(sender instanceof Player)) {
            Server.getInstance().getLogger().alert("§7[§bSHOP§7] §cゲーム内で使用してください");
            return false;
        }
        Player player = (Player)sender;
        InventoryMenu menu = new InventoryMenu();
        Category category1 = new Category("main", Item.get(1, 2, 3), new HashMap<Integer, ItemClick>(), menu);
        Category category2 = new Category("main/sub", Item.get(9, 2, 3), new HashMap<Integer, ItemClick>(), menu);
        Content content1 = new Content(Item.get(14, 0, 3), new int[]{100, 10});
        Content content2 = new Content(Item.get(2, 0, 3), new int[]{100, 10});
        category1.addContent(1, 1, content1);
        category1.addCategory(2, 1, category2);
        category2.addContent(1, 1, content2);
        category2.addCategory(2, 1, category1);
        menu.setMainCategory(menu.getCategory("main"));
        menu.setDoubleChest();
        menu.show(player);
        menu.openCategory("main", player);
        return true;
    }
    
}
