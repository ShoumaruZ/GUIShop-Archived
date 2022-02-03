package fishnetwork.guishop;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import fishnetwork.guishop.command.ShopCommand;
import fishnetwork.guishop.configuration.Settings;
import fishnetwork.guishop.language.Language;
import fishnetwork.guishop.manager.GuiManager;
import fishnetwork.guishop.object.Category;
import fishnetwork.guishop.util.ConfigurationUtil;
import fishnetwork.guishop.util.FileUtil;
import lombok.Getter;
import net.milkbowl.vault.economy.Economy;

@Getter
public final class GUIShop {


    private final Economy economy;
    private final Language language;
    private final Settings settings;

    private final JavaPlugin plugin;

    private final GuiManager guiManager = new GuiManager(this);

    private Map<String, Category> categories = new HashMap<>();
    private Category mainCategory;


    public GUIShop(JavaPlugin plugin) {
        this.plugin = plugin;
        plugin.saveDefaultConfig();
        plugin.getCommand("shop").setExecutor(new ShopCommand(this));
        try {
            FileUtil.copyFileFromJar(getClass(), "messages.yml", plugin.getDataFolder(), false);
            FileUtil.copyFolderFromJar(getClass(), "categories", plugin.getDataFolder(), false);
        }catch(IOException exception) {
            exception.printStackTrace();
        }
        RegisteredServiceProvider<Economy> service = plugin.getServer().getServicesManager().getRegistration(Economy.class);
        language = new Language(YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "messages.yml")));
        settings = new Settings(plugin.getConfig());
        economy = service != null ? service.getProvider() : null;
        loadShop();
    }


    public void addCategory(Category category) {
        categories.put(category.getName(), category);
    }


    public Category getCategory(String name) {
        return categories.get(name);
    }


    private void loadShop() {
        File directory = new File(plugin.getDataFolder(), "categories");
        for(File file: FileUtil.loadAllFiles(directory)) {
            Configuration categoryFile = YamlConfiguration.loadConfiguration(file);
            plugin.getLogger().info("loading category "+file.getName());
            Category category = Category.deserialize(ConfigurationUtil.getAll(categoryFile), this);
            addCategory(category);
            if(settings.getMainCategory().equals(category.getName())) {
                mainCategory = category;
            }
        }
    }


}