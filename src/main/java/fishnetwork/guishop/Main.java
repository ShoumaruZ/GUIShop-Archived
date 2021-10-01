package fishnetwork.guishop;

import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;
import fishnetwork.guishop.command.ShopCommand;

public class Main extends PluginBase implements Listener{


    @Override
    public void onEnable() {
        Server server = this.getServer();
        server.getPluginManager().registerEvents(this, this);
        server.getCommandMap().register("shop", new ShopCommand());
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Item item = event.getPlayer().getInventory().getItemInHand();
        event.getPlayer().sendTip(item.getId()+":"+item.getDamage()+":"+item.getCount());
    }
    
}