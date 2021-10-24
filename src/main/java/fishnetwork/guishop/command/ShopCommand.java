package fishnetwork.guishop.command;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import fishnetwork.guishop.language.Lang;
import fishnetwork.guishop.shop.MainShop;

public class ShopCommand extends Command {


    public ShopCommand() {
        super("shop", "ショップを開きます");
    }


    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Lang.get("prefix")+Lang.get("in_server_command"));
            return false;
        }
        Player player = (Player)sender;
        MainShop.open(player);
        return true;
    }
    
}
