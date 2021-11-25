package fishnetwork.officialshop.command;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import fishnetwork.officialshop.shop.MainShop;

public class ShopCommand extends Command {



    public ShopCommand() {
        super("shop", "ショップを開きます");
    }


    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("§cゲーム内で使用してください");
            return false;
        }
        Player player = (Player)sender;
        MainShop.open(player);
        return true;
    }



}
