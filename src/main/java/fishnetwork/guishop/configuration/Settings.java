package fishnetwork.guishop.configuration;

import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;

import fishnetwork.guishop.util.ItemUtil;
import lombok.Value;

@Value
public final class Settings {


    private final Configuration config;


    public ItemStack getBackgroundItem() {
        return ItemUtil.deserialize(config.getConfigurationSection(Keys.BACKGROUND_ITEM).getValues(true));
    }


    public String getMainCategory() {
        return config.getString(Keys.MAIN_CATEGORY);
    }


    private static interface Keys {

        public static final String BACKGROUND_ITEM = "background_item";
        public static final String MAIN_CATEGORY = "main_category";

    }


}
