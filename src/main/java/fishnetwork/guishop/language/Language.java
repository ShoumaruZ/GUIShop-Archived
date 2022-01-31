package fishnetwork.guishop.language;

import org.bukkit.configuration.Configuration;

import lombok.Value;
import net.md_5.bungee.api.ChatColor;

@Value
public final class Language {


    private final Configuration config;


    public String getMessage(String key, Object ...args) {
        String message = config.getString(key);
        for(int i = 0; i < args.length; i++) {
            message = message.replace("{%"+i+"}", args[i].toString());
        }
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    
}
