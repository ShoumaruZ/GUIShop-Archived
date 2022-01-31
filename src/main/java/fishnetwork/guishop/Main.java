package fishnetwork.guishop;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        new GUIShop(this);
    }

    
}