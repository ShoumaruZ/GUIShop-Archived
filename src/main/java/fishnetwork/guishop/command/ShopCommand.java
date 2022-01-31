package fishnetwork.guishop.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fishnetwork.guishop.GUIShop;
import fishnetwork.guishop.gui.ShopGui;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class ShopCommand implements CommandExecutor {


    private final GUIShop guiShop;


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) return false;
        Player player = (Player)sender;
        ShopGui gui = guiShop.getGuiManager().openGui(player);
        gui.changeCategory(guiShop.getMainCategory());
        return true;
    }


}
