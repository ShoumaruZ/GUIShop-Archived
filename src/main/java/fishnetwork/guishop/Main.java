package fishnetwork.guishop;

import cn.nukkit.Server;
import cn.nukkit.plugin.PluginBase;
import fishnetwork.guishop.command.ShopCommand;

public class Main extends PluginBase {


    @Override
    public void onEnable() {
        Server server = this.getServer();
        server.getCommandMap().register("shop", new ShopCommand());
    }

    
}