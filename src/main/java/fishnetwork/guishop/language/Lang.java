package fishnetwork.guishop.language;

import java.io.File;

import cn.nukkit.utils.Config;
import fishnetwork.guishop.Main;

public class Lang {


    private static Config config;


    static {
        Main.getInstance().saveResource("messages.yml", true);
        config = new Config(new File(Main.getInstance().getDataFolder(), "messages.yml"));
    }


    public static String get(String id, Object ...options) {
        String message = config.getString(id);
        for(int i = 0; i < options.length; i++) message = message.replace("%"+i, options[i].toString());
        return message;
    }

    
}
