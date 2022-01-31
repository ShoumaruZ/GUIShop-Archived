package fishnetwork.guishop.util;

import java.util.Map;

import org.bukkit.configuration.ConfigurationSection;

public final class ConfigurationUtil {
    

    public static Map<String, Object> getAll(ConfigurationSection config) {
        Map<String, Object> result = config.getValues(false);
        result.forEach((key, value) -> {
            if(value instanceof ConfigurationSection section) result.put(key, getAll(section));
        });
        return result;
    }


}
