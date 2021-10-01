package fishnetwork.guishop.shop;

import cn.nukkit.Player;
import cn.nukkit.block.BlockID;
import cn.nukkit.block.BlockStone;
import cn.nukkit.block.BlockWood;
import cn.nukkit.block.BlockWood2;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.DyeColor;
import fishnetwork.guishop.element.Category;
import fishnetwork.guishop.element.Content;
import ru.ragnok123.menuAPI.inventory.InventoryMenu;

public class MainShop {


    private static final InventoryMenu MENU = new InventoryMenu();


    /** Ore Category */
    private static final Content COAL = new Content(Item.get(ItemID.COAL), 20, 10);
    private static final Content REDSTONE = new Content(Item.get(ItemID.REDSTONE_DUST), 30, 15);
    private static final Content LAPIS = new Content(Item.get(ItemID.DYE, DyeColor.BLUE.getDyeData()), 50, 25);
    private static final Content IRON = new Content(Item.get(ItemID.IRON_INGOT), 300, 150);
    private static final Content GOLD = new Content(Item.get(ItemID.GOLD_INGOT), 500, 250);
    private static final Content DIAMOND = new Content(Item.get(ItemID.DIAMOND), 1400, 700);
    private static final Content EMERALD = new Content(Item.get(ItemID.EMERALD), 2000, 1000);
    private static final Content COAL_BLOCK = new Content(Item.get(BlockID.COAL_BLOCK), 160, 100);
    private static final Content REDSTONE_BLOCK = new Content(Item.get(BlockID.REDSTONE_BLOCK), 240, 150);
    private static final Content LAPIS_BLOCK = new Content(Item.get(BlockID.LAPIS_BLOCK), 400, 250);
    private static final Content IRON_BLOCK = new Content(Item.get(BlockID.IRON_BLOCK), 2400, 1500);
    private static final Content GOLD_BLOCK = new Content(Item.get(BlockID.GOLD_BLOCK), 4000, 2500);
    private static final Content DIAMOND_BLOCK = new Content(Item.get(BlockID.DIAMOND_BLOCK), 11200, 7000);
    private static final Content EMERALD_BLOCK = new Content(Item.get(BlockID.EMERALD_BLOCK), 16000, 10000);
    private static final Content QUARTZ = new Content(Item.get(ItemID.QUARTZ), 15, 10);


    /** Tool Category */
    private static final Content WOODEN_SWORD = new Content(Item.get(ItemID.WOODEN_SWORD), 10, 0);
    private static final Content WOODEN_PICKAXE = new Content(Item.get(ItemID.WOODEN_PICKAXE), 10, 0);
    private static final Content WOODEN_SHOVEL = new Content(Item.get(ItemID.WOODEN_SHOVEL), 10, 0);
    private static final Content WOODEN_AXE = new Content(Item.get(ItemID.WOODEN_AXE), 10, 0);
    private static final Content STONE_SWORD = new Content(Item.get(ItemID.STONE_SWORD), 20, 0);
    private static final Content STONE_PICKAXE = new Content(Item.get(ItemID.STONE_PICKAXE), 20, 0);
    private static final Content STONE_SHOVEL = new Content(Item.get(ItemID.STONE_SHOVEL), 20, 0);
    private static final Content STONE_AXE = new Content(Item.get(ItemID.STONE_AXE), 20, 0);
    private static final Content IRON_SWORD = new Content(Item.get(ItemID.IRON_SWORD), 1200, 0);
    private static final Content IRON_PICKAXE = new Content(Item.get(ItemID.IRON_PICKAXE), 1800, 0);
    private static final Content IRON_SHOVEL = new Content(Item.get(ItemID.IRON_SHOVEL), 600, 0);
    private static final Content IRON_AXE = new Content(Item.get(ItemID.IRON_AXE), 1800, 0);
    private static final Content GOLD_SWORD = new Content(Item.get(ItemID.GOLD_SWORD), 1600, 0);
    private static final Content GOLD_PICKAXE = new Content(Item.get(ItemID.GOLD_PICKAXE), 2400, 0);
    private static final Content GOLD_SHOVEL = new Content(Item.get(ItemID.GOLD_SHOVEL), 800, 0);
    private static final Content GOLD_AXE = new Content(Item.get(ItemID.GOLD_AXE), 2400, 0);
    private static final Content DIAMOND_SWORD = new Content(Item.get(ItemID.DIAMOND_SWORD), 4000, 0);
    private static final Content DIAMOND_PICKAXE = new Content(Item.get(ItemID.DIAMOND_PICKAXE), 6000, 0);
    private static final Content DIAMOND_SHOVEL = new Content(Item.get(ItemID.DIAMOND_SHOVEL), 2000, 0);
    private static final Content DIAMOND_AXE = new Content(Item.get(ItemID.DIAMOND_AXE), 6000, 0);


    /** Armor Category */
    private static final Content LEATHER_CAP = new Content(Item.get(ItemID.LEATHER_CAP), 500, 0);
    private static final Content LEATHER_TUNIC = new Content(Item.get(ItemID.LEATHER_TUNIC), 800, 0);
    private static final Content LEATHER_PANTS = new Content(Item.get(ItemID.LEATHER_PANTS), 700, 0);
    private static final Content LEATHER_BOOTS = new Content(Item.get(ItemID.LEATHER_BOOTS), 400, 0);
    private static final Content CHAIN_HELMET = new Content(Item.get(ItemID.CHAIN_HELMET), 1000, 0);
    private static final Content CHAIN_CHESTPLATE = new Content(Item.get(ItemID.CHAIN_CHESTPLATE), 1600, 0);
    private static final Content CHAIN_LEGGINGS = new Content(Item.get(ItemID.CHAIN_LEGGINGS), 1400, 0);
    private static final Content CHAIN_BOOTS = new Content(Item.get(ItemID.CHAIN_BOOTS), 800, 0);
    private static final Content IRON_HELMET = new Content(Item.get(ItemID.IRON_HELMET), 3000, 0);
    private static final Content IRON_CHESTPLATE = new Content(Item.get(ItemID.IRON_CHESTPLATE), 4800, 0);
    private static final Content IRON_LEGGINGS = new Content(Item.get(ItemID.IRON_LEGGINGS), 4200, 0);
    private static final Content IRON_BOOTS = new Content(Item.get(ItemID.IRON_BOOTS), 2400, 0);
    private static final Content GOLD_HELMET = new Content(Item.get(ItemID.GOLD_HELMET), 4000, 0);
    private static final Content GOLD_CHESTPLATE = new Content(Item.get(ItemID.GOLD_CHESTPLATE), 6400, 0);
    private static final Content GOLD_LEGGINGS = new Content(Item.get(ItemID.GOLD_LEGGINGS), 5600, 0);
    private static final Content GOLD_BOOTS = new Content(Item.get(ItemID.GOLD_BOOTS), 3200, 0);
    private static final Content DIAMOND_HELMET = new Content(Item.get(ItemID.DIAMOND_HELMET), 10000, 0);
    private static final Content DIAMOND_CHESTPLATE = new Content(Item.get(ItemID.DIAMOND_CHESTPLATE), 16000, 0);
    private static final Content DIAMOND_LEGGINGS = new Content(Item.get(ItemID.DIAMOND_LEGGINGS), 14000, 0);
    private static final Content DIAMOND_BOOTS = new Content(Item.get(ItemID.DIAMOND_BOOTS), 8000, 0);
    private static final Content BOW = new Content(Item.get(ItemID.BOW), 1000, 0);
    private static final Content ARROW = new Content(Item.get(ItemID.ARROW, 0, 16), 300, 0);


    /** Farm Category */
    private static final Content WHEAT = new Content(Item.get(ItemID.WHEAT), 10, 10);
    private static final Content WHEAT_SEEDS = new Content(Item.get(ItemID.WHEAT_SEEDS), 5, 0);
    private static final Content MELON = new Content(Item.get(BlockID.MELON_BLOCK), 30, 5);
    private static final Content MELON_SEEDS = new Content(Item.get(ItemID.MELON_SEEDS), 5, 0);
    private static final Content PUMPKIN = new Content(Item.get(BlockID.PUMPKIN), 30, 5);
    private static final Content PUMPKIN_SEEDS = new Content(Item.get(ItemID.PUMPKIN_SEEDS), 5, 0);
    private static final Content BEETROOT = new Content(Item.get(ItemID.BEETROOT), 10, 10);
    private static final Content BEETROOT_SEEDS = new Content(Item.get(ItemID.BEETROOT_SEEDS), 5, 0);
    private static final Content CARROT = new Content(Item.get(ItemID.CARROT), 15, 10);
    private static final Content POTATO = new Content(Item.get(ItemID.POTATO), 15, 10);
    private static final Content SWEET_BERRIES = new Content(Item.get(ItemID.SWEET_BERRIES), 25, 15);
    private static final Content CACAO = new Content(Item.get(ItemID.DYE, DyeColor.BROWN.getDyeData()), 25, 15);
    private static final Content SUGARCANE = new Content(Item.get(ItemID.SUGARCANE), 25, 5);
    private static final Content BAMBOO = new Content(Item.get(-163), 25, 5);
    private static final Content KELP = new Content(Item.get(ItemID.KELP), 25, 5);
    private static final Content RED_MUSHROOM = new Content(Item.get(BlockID.RED_MUSHROOM), 50, 30);
    private static final Content BROWN_MUSHROOM = new Content(Item.get(BlockID.BROWN_MUSHROOM), 50, 30);
    private static final Content NETHER_WART = new Content(Item.get(ItemID.NETHER_WART), 100, 50);
    private static final Content CHORUS_FRUIT = new Content(Item.get(ItemID.CHORUS_FRUIT), 100, 50);


    /** Farm Category */
    private static final Content COOKED_CHICKEN = new Content(Item.get(ItemID.COOKED_CHICKEN), 30, 20);
    private static final Content COOKED_RABBIT = new Content(Item.get(ItemID.COOKED_RABBIT), 30, 20);
    private static final Content COOKED_MUTTON = new Content(Item.get(ItemID.COOKED_MUTTON), 30, 20);
    private static final Content COOKED_PORKCHOP = new Content(Item.get(ItemID.COOKED_PORKCHOP), 35, 20);
    private static final Content COOKED_BEEF = new Content(Item.get(ItemID.COOKED_BEEF), 35, 20);
    private static final Content BREAD = new Content(Item.get(ItemID.BREAD), 25, 20);
    private static final Content BAKED_POTATO = new Content(Item.get(ItemID.BAKED_POTATO), 25, 15);
    private static final Content PUMPKIN_PIE = new Content(Item.get(ItemID.PUMPKIN_PIE), 35, 20);
    private static final Content COOKED_FISH = new Content(Item.get(ItemID.COOKED_FISH), 25, 20);
    private static final Content COOKED_SALMON = new Content(Item.get(ItemID.COOKED_SALMON), 30, 20);
    private static final Content DRIED_KELP = new Content(Item.get(ItemID.DRIED_KELP), 5, 5);
    private static final Content COOKIE = new Content(Item.get(ItemID.COOKIE), 10, 10);
    private static final Content MUSHROOM_STEW = new Content(Item.get(ItemID.MUSHROOM_STEW), 30, 25);
    private static final Content BEETROOT_SOUP = new Content(Item.get(ItemID.BEETROOT_SOUP), 30, 25);
    private static final Content RABBIT_STEW = new Content(Item.get(ItemID.RABBIT_STEW), 30, 30);
    private static final Content CAKE = new Content(Item.get(ItemID.CAKE), 100, 60);


    /** Block Wood Category */
    private static final Content OAK_LOG = new Content(Item.get(BlockID.LOG, BlockWood.OAK), 15, 10);
    private static final Content SPRUCE_LOG = new Content(Item.get(BlockID.LOG, BlockWood.SPRUCE), 15, 10);
    private static final Content BIRCH_LOG = new Content(Item.get(BlockID.LOG, BlockWood.BIRCH), 15, 10);
    private static final Content JUNGLE_LOG = new Content(Item.get(BlockID.LOG, BlockWood.JUNGLE), 15, 10);
    private static final Content ACACIA_LOG = new Content(Item.get(BlockID.LOG2, BlockWood2.ACACIA), 15, 10);
    private static final Content DARK_OAK_LOG = new Content(Item.get(BlockID.LOG2, BlockWood2.DARK_OAK), 15, 10);
    private static final Content STRIPPED_OAK_LOG = new Content(Item.get(-10), 15, 10);
    private static final Content STRIPPED_SPRUCE_LOG = new Content(Item.get(-5), 15, 10);
    private static final Content STRIPPED_BIRCH_LOG = new Content(Item.get(-6), 15, 10);
    private static final Content STRIPPED_JUNGLE_LOG = new Content(Item.get(-7), 15, 10);
    private static final Content STRIPPED_ACACIA_LOG = new Content(Item.get(-8), 15, 10);
    private static final Content STRIPPED_DARK_OAK_LOG = new Content(Item.get(-9), 15, 10);
    private static final Content LADDER = new Content(Item.get(BlockID.LADDER), 10, 0);
    private static final Content SCAFFOLDING = new Content(Item.get(-165), 30, 20);


    /** Block Stone Category */
    private static final Content COBBLE_STONE = new Content(Item.get(BlockID.COBBLESTONE), 10, 5);
    private static final Content STONE = new Content(Item.get(BlockID.STONE), 10, 5);
    private static final Content GRANITE_STONE = new Content(Item.get(BlockID.STONE, BlockStone.GRANITE), 10, 5);
    private static final Content DIORITE_STONE = new Content(Item.get(BlockID.STONE, BlockStone.DIORITE), 10, 5);
    private static final Content ANDESITE_STONE = new Content(Item.get(BlockID.STONE, BlockStone.ANDESITE), 10, 5);
    private static final Content SAND_STONE = new Content(Item.get(BlockID.SANDSTONE), 10, 5);
    private static final Content RED_SAND_STONE = new Content(Item.get(BlockID.RED_SANDSTONE), 10, 5);
    private static final Content GLASS = new Content(Item.get(BlockID.GLASS), 20, 10);
    private static final Content BRICKS = new Content(Item.get(BlockID.BRICKS), 20, 10);
    private static final Content SMOOTH_STONE = new Content(Item.get(-183), 15, 10);
    private static final Content OBSIDIAN = new Content(Item.get(BlockID.OBSIDIAN), 50, 30);


    /** Block Dirt Category */


    private static final Category ORE_SHOP = new Category("ore", Item.get(ItemID.DIAMOND).setCustomName("§b鉱石"), MENU);

    private static final Category FARM_SHOP = new Category("farm", Item.get(ItemID.WHEAT).setCustomName("§b農業"), MENU);

    private static final Category FOOD_SHOP = new Category("food", Item.get(ItemID.COOKED_CHICKEN).setCustomName("§b食料"), MENU);

    private static final Category TOOL_SHOP = new Category("tool", Item.get(ItemID.DIAMOND_SWORD).setCustomName("§b武器&道具"), MENU);

    private static final Category BLOCK_SHOP = new Category("block", Item.get(BlockID.GRASS).setCustomName("§bブロック"), MENU);

    private static final Category BLOCK_WOOD_SHOP = new Category("block_wood", Item.get(BlockID.WOOD, BlockWood.OAK).setCustomName("§b原木類"), MENU);

    private static final Category BLOCK_STONE_SHOP = new Category("block_stone", Item.get(BlockID.STONE).setCustomName("§b石類"), MENU);

    private static final Category ARMOR_SHOP = new Category("armor", Item.get(ItemID.DIAMOND_CHESTPLATE).setCustomName("§b防具&その他"), MENU);

    private static final Category MAIN_SHOP = new Category("main", Item.get(ItemID.COMPASS).setCustomName("§bメインに戻る"), MENU);



    static {
        MENU.setDoubleChest();
        MENU.setName("Main-Shop");
        MENU.setMainCategory(MAIN_SHOP.getInventoryCategory());

        ORE_SHOP
        .addContent(1, 1, COAL)
        .addContent(2, 1, REDSTONE)
        .addContent(3, 1, LAPIS)
        .addContent(4, 1, IRON)
        .addContent(5, 1, GOLD)
        .addContent(6, 1, DIAMOND)
        .addContent(7, 1, EMERALD)
        .addContent(1, 2, COAL_BLOCK)
        .addContent(2, 2, REDSTONE_BLOCK)
        .addContent(3, 2, LAPIS_BLOCK)
        .addContent(4, 2, IRON_BLOCK)
        .addContent(5, 2, GOLD_BLOCK)
        .addContent(6, 2, DIAMOND_BLOCK)
        .addContent(7, 2, EMERALD_BLOCK)
        .addContent(1, 4, QUARTZ)
        .addCategory(7, 4, MAIN_SHOP);

        TOOL_SHOP
        .addContent(1, 1, WOODEN_SWORD)
        .addContent(1, 2, WOODEN_PICKAXE)
        .addContent(1, 3, WOODEN_SHOVEL)
        .addContent(1, 4, WOODEN_AXE)
        .addContent(2, 1, STONE_SWORD)
        .addContent(2, 2, STONE_PICKAXE)
        .addContent(2, 3, STONE_SHOVEL)
        .addContent(2, 4, STONE_AXE)
        .addContent(3, 1, IRON_SWORD)
        .addContent(3, 2, IRON_PICKAXE)
        .addContent(3, 3, IRON_SHOVEL)
        .addContent(3, 4, IRON_AXE)
        .addContent(4, 1, GOLD_SWORD)
        .addContent(4, 2, GOLD_PICKAXE)
        .addContent(4, 3, GOLD_SHOVEL)
        .addContent(4, 4, GOLD_AXE)
        .addContent(5, 1, DIAMOND_SWORD)
        .addContent(5, 2, DIAMOND_PICKAXE)
        .addContent(5, 3, DIAMOND_SHOVEL)
        .addContent(5, 4, DIAMOND_AXE)
        .addCategory(7, 1, ARMOR_SHOP)
        .addCategory(7, 4, MAIN_SHOP);

        FARM_SHOP
        .addContent(1, 1, WHEAT)
        .addContent(2, 1, MELON)
        .addContent(3, 1, PUMPKIN)
        .addContent(4, 1, BEETROOT)
        .addContent(5, 1, CARROT)
        .addContent(6, 1, POTATO)
        .addContent(7, 1, SWEET_BERRIES)
        .addContent(1, 2, WHEAT_SEEDS)
        .addContent(2, 2, MELON_SEEDS)
        .addContent(3, 2, PUMPKIN_SEEDS)
        .addContent(4, 2, BEETROOT_SEEDS)
        .addContent(5, 2, CACAO)
        .addContent(6, 2, SUGARCANE)
        .addContent(7, 2, BAMBOO)
        .addContent(1, 4, KELP)
        .addContent(2, 4, RED_MUSHROOM)
        .addContent(3, 4, BROWN_MUSHROOM)
        .addContent(4, 4, NETHER_WART)
        .addContent(5, 4, CHORUS_FRUIT)
        .addCategory(7, 4, MAIN_SHOP);

        FOOD_SHOP
        .addContent(1, 1, COOKED_CHICKEN)
        .addContent(2, 1, COOKED_RABBIT)
        .addContent(3, 1, COOKED_MUTTON)
        .addContent(4, 1, COOKED_PORKCHOP)
        .addContent(5, 1, COOKED_BEEF)
        .addContent(7, 1, DRIED_KELP)
        .addContent(1, 2, BREAD)
        .addContent(2, 2, BAKED_POTATO)
        .addContent(3, 2, PUMPKIN_PIE)
        .addContent(4, 2, COOKED_FISH)
        .addContent(5, 2, COOKED_SALMON)
        .addContent(7, 2, COOKIE)
        .addContent(1, 4, MUSHROOM_STEW)
        .addContent(2, 4, BEETROOT_SOUP)
        .addContent(3, 4, RABBIT_STEW)
        .addContent(5, 4, CAKE)
        .addCategory(7, 4, MAIN_SHOP);

        ARMOR_SHOP
        .addContent(1, 1, LEATHER_CAP)
        .addContent(1, 2, LEATHER_TUNIC)
        .addContent(1, 3, LEATHER_PANTS)
        .addContent(1, 4, LEATHER_BOOTS)
        .addContent(2, 1, CHAIN_HELMET)
        .addContent(2, 2, CHAIN_CHESTPLATE)
        .addContent(2, 3, CHAIN_LEGGINGS)
        .addContent(2, 4, CHAIN_BOOTS)
        .addContent(3, 1, IRON_HELMET)
        .addContent(3, 2, IRON_CHESTPLATE)
        .addContent(3, 3, IRON_LEGGINGS)
        .addContent(3, 4, IRON_BOOTS)
        .addContent(4, 1, GOLD_HELMET)
        .addContent(4, 2, GOLD_CHESTPLATE)
        .addContent(4, 3, GOLD_LEGGINGS)
        .addContent(4, 4, GOLD_BOOTS)
        .addContent(5, 1, DIAMOND_HELMET)
        .addContent(5, 2, DIAMOND_CHESTPLATE)
        .addContent(5, 3, DIAMOND_LEGGINGS)
        .addContent(5, 4, DIAMOND_BOOTS)
        .addContent(7, 1, BOW)
        .addContent(7, 2, ARROW)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_WOOD_SHOP
        .addContent(1, 1, OAK_LOG)
        .addContent(2, 1, SPRUCE_LOG)
        .addContent(3, 1, BIRCH_LOG)
        .addContent(4, 1, JUNGLE_LOG)
        .addContent(5, 1, ACACIA_LOG)
        .addContent(6, 1, DARK_OAK_LOG)
        .addContent(1, 2, STRIPPED_OAK_LOG)
        .addContent(2, 2, STRIPPED_SPRUCE_LOG)
        .addContent(3, 2, STRIPPED_BIRCH_LOG)
        .addContent(4, 2, STRIPPED_JUNGLE_LOG)
        .addContent(5, 2, STRIPPED_ACACIA_LOG)
        .addContent(6, 2, STRIPPED_DARK_OAK_LOG)
        .addContent(1, 4, LADDER)
        .addContent(5, 4, SCAFFOLDING)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_STONE_SHOP
        .addContent(1, 1, COBBLE_STONE)
        .addContent(2, 1, STONE)
        .addContent(3, 1, GRANITE_STONE)
        .addContent(4, 1, DIORITE_STONE)
        .addContent(5, 1, ANDESITE_STONE)
        .addContent(1, 2, SAND_STONE)
        .addContent(2, 2, RED_SAND_STONE)
        .addContent(1, 4, GLASS)
        .addContent(2, 4, BRICKS)
        .addContent(3, 4, SMOOTH_STONE)
        .addContent(4, 4, OBSIDIAN)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_SHOP
        .addCategory(1, 1, BLOCK_WOOD_SHOP)
        .addCategory(3, 1, BLOCK_STONE_SHOP)
        .addCategory(7, 4, MAIN_SHOP);

        MAIN_SHOP
        .addCategory(1, 1, TOOL_SHOP)
        .addCategory(3, 1, BLOCK_SHOP)
        .addCategory(5, 1, ORE_SHOP)
        .addCategory(7, 1, FARM_SHOP)
        .addCategory(1, 3, FOOD_SHOP);

    }


    public static void open(Player player) {
        MENU.show(player);
    }

    
}
