package fishnetwork.officialshop;

import java.util.ArrayList;
import java.util.List;

import cn.nukkit.Player;
import fishnetwork.officialshop.form.TransactionForm;
import lombok.Getter;
import lombok.Setter;
import ru.nukkitx.forms.elements.ImageType;
import ru.nukkitx.forms.elements.SimpleForm;

@Setter
@Getter
public class Shop implements Element {



    private final String name;
    private final String imagePath;

    private Shop parentShop = null;

    private final List<Element> elements = new ArrayList<Element>();


    public Shop(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
    }


    public Shop addElement(Element element) {
        if(element instanceof Shop shop) {
            shop.setParentShop(this);
            elements.add(element);
            return this;
        }
        elements.add(element);
        return this;
    }


    public void sendForm(Player player) {
        SimpleForm form = new SimpleForm(getShopPath());
        for(Element element: elements) {
            if(element instanceof Content content) {
                String count = content.getItem().getCount() > 1 ? String.format("(×%s)", content.getItem().getCount()) : "";
                form.addButton(String.format("%s%s §7- §e$%s/$%s", content.getName(), count, content.getBuy(), content.getSell()), ImageType.PATH, content.getImagePath());
                continue;
            }
            if(element instanceof Shop shop) {
                form.addButton(shop.getName(), ImageType.PATH, shop.getImagePath());
                continue;
            }
        }
        form.send(player, (targetPlayer, targetForm, data) -> {
            if(data == -1) {
                if(parentShop == null) return;
                parentShop.sendForm(player);
                return;
            }
            Element element = elements.get(data);
            if(element instanceof Content content) {
                TransactionForm.sendForm(player, content, this);
                return;
            }
            if(element instanceof Shop shop) {
                shop.sendForm(player);
                return;
            }
        });
    }


    private String getShopPath() {
        String shopPath = name;
        Shop shop = parentShop;
        while(shop != null) {
            shopPath = String.format("%s > %s", shop.getName(), shopPath);
            shop = shop.getParentShop();
        }
        return shopPath;
    }



}
