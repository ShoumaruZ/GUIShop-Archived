package fishnetwork.guishop.manager;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

import fishnetwork.guishop.GUIShop;
import fishnetwork.guishop.gui.ShopGui;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class GuiManager {


    private final Map<Player, ShopGui> guis = new HashMap<>();

    private final GUIShop guiShop;


    public ShopGui openGui(Player player) {
        ShopGui gui = new ShopGui(guiShop);
        guis.put(player, gui);
        gui.show(player);
        return gui;
    }


    public ShopGui getGui(Player player) {
        return guis.get(player);
    }


}
