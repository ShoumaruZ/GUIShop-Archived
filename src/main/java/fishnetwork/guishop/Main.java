package fishnetwork.guishop;

import cn.nukkit.Server;
import cn.nukkit.plugin.PluginBase;
import fishnetwork.guishop.command.ShopCommand;

public class Main extends PluginBase {


    private static Main instance; 


    @Override
    public void onEnable() {
        instance = this;
        Server server = this.getServer();
        server.getCommandMap().register("shop", new ShopCommand());
    }


    public static Main getInstance() {
        return instance;
    }


}