package fishnetwork.officialshop.shop;

import cn.nukkit.Player;
import cn.nukkit.block.BlockCoral;
import cn.nukkit.block.BlockID;
import cn.nukkit.block.BlockPrismarine;
import cn.nukkit.block.BlockPurpur;
import cn.nukkit.block.BlockSand;
import cn.nukkit.block.BlockStone;
import cn.nukkit.block.BlockWood;
import cn.nukkit.block.BlockWood2;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.DyeColor;
import fishnetwork.officialshop.element.Category;
import fishnetwork.officialshop.element.Content;
import ru.ragnok123.menuAPI.inventory.InventoryMenu;

public class MainShop {


    private static final InventoryMenu MENU = new InventoryMenu();


    /** Ore Category */
    private static final Content COAL = new Content(Item.get(ItemID.COAL), 20, 10);
    private static final Content REDSTONE = new Content(Item.get(ItemID.REDSTONE_DUST), 30, 15);
    private static final Content LAPIS = new Content(Item.get(ItemID.DYE, DyeColor.BLUE.getDyeData()), 50, 25);
    private static final Content IRON = new Content(Item.get(ItemID.IRON_INGOT), 300, 150);
    private static final Content GOLD = new Content(Item.get(ItemID.GOLD_INGOT), 400, 200);
    private static final Content DIAMOND = new Content(Item.get(ItemID.DIAMOND), 1400, 700);
    private static final Content EMERALD = new Content(Item.get(ItemID.EMERALD), 2000, 1000);
    private static final Content COAL_BLOCK = new Content(Item.get(BlockID.COAL_BLOCK), 160, 100);
    private static final Content REDSTONE_BLOCK = new Content(Item.getBlock(BlockID.REDSTONE_BLOCK), 240, 150);
    private static final Content LAPIS_BLOCK = new Content(Item.getBlock(BlockID.LAPIS_BLOCK), 400, 250);
    private static final Content IRON_BLOCK = new Content(Item.getBlock(BlockID.IRON_BLOCK), 2400, 1500);
    private static final Content GOLD_BLOCK = new Content(Item.getBlock(BlockID.GOLD_BLOCK), 4000, 2500);
    private static final Content DIAMOND_BLOCK = new Content(Item.getBlock(BlockID.DIAMOND_BLOCK), 11200, 7000);
    private static final Content EMERALD_BLOCK = new Content(Item.getBlock(BlockID.EMERALD_BLOCK), 16000, 10000);
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
    private static final Content IRON_SWORD = new Content(Item.get(ItemID.IRON_SWORD), 600, 0);
    private static final Content IRON_PICKAXE = new Content(Item.get(ItemID.IRON_PICKAXE), 900, 0);
    private static final Content IRON_SHOVEL = new Content(Item.get(ItemID.IRON_SHOVEL), 300, 0);
    private static final Content IRON_AXE = new Content(Item.get(ItemID.IRON_AXE), 900, 0);
    private static final Content GOLD_SWORD = new Content(Item.get(ItemID.GOLD_SWORD), 800, 0);
    private static final Content GOLD_PICKAXE = new Content(Item.get(ItemID.GOLD_PICKAXE), 1200, 0);
    private static final Content GOLD_SHOVEL = new Content(Item.get(ItemID.GOLD_SHOVEL), 400, 0);
    private static final Content GOLD_AXE = new Content(Item.get(ItemID.GOLD_AXE), 1200, 0);
    private static final Content DIAMOND_SWORD = new Content(Item.get(ItemID.DIAMOND_SWORD), 2800, 0);
    private static final Content DIAMOND_PICKAXE = new Content(Item.get(ItemID.DIAMOND_PICKAXE), 4200, 0);
    private static final Content DIAMOND_SHOVEL = new Content(Item.get(ItemID.DIAMOND_SHOVEL), 1400, 0);
    private static final Content DIAMOND_AXE = new Content(Item.get(ItemID.DIAMOND_AXE), 4200, 0);


    /** Armor Category */
    private static final Content LEATHER_CAP = new Content(Item.get(ItemID.LEATHER_CAP), 500, 0);
    private static final Content LEATHER_TUNIC = new Content(Item.get(ItemID.LEATHER_TUNIC), 800, 0);
    private static final Content LEATHER_PANTS = new Content(Item.get(ItemID.LEATHER_PANTS), 700, 0);
    private static final Content LEATHER_BOOTS = new Content(Item.get(ItemID.LEATHER_BOOTS), 400, 0);
    private static final Content CHAIN_HELMET = new Content(Item.get(ItemID.CHAIN_HELMET), 1000, 0);
    private static final Content CHAIN_CHESTPLATE = new Content(Item.get(ItemID.CHAIN_CHESTPLATE), 1600, 0);
    private static final Content CHAIN_LEGGINGS = new Content(Item.get(ItemID.CHAIN_LEGGINGS), 1400, 0);
    private static final Content CHAIN_BOOTS = new Content(Item.get(ItemID.CHAIN_BOOTS), 800, 0);
    private static final Content IRON_HELMET = new Content(Item.get(ItemID.IRON_HELMET), 1500, 0);
    private static final Content IRON_CHESTPLATE = new Content(Item.get(ItemID.IRON_CHESTPLATE), 2400, 0);
    private static final Content IRON_LEGGINGS = new Content(Item.get(ItemID.IRON_LEGGINGS), 2100, 0);
    private static final Content IRON_BOOTS = new Content(Item.get(ItemID.IRON_BOOTS), 1200, 0);
    private static final Content GOLD_HELMET = new Content(Item.get(ItemID.GOLD_HELMET), 2000, 0);
    private static final Content GOLD_CHESTPLATE = new Content(Item.get(ItemID.GOLD_CHESTPLATE), 3200, 0);
    private static final Content GOLD_LEGGINGS = new Content(Item.get(ItemID.GOLD_LEGGINGS), 2800, 0);
    private static final Content GOLD_BOOTS = new Content(Item.get(ItemID.GOLD_BOOTS), 1600, 0);
    private static final Content DIAMOND_HELMET = new Content(Item.get(ItemID.DIAMOND_HELMET), 7000, 0);
    private static final Content DIAMOND_CHESTPLATE = new Content(Item.get(ItemID.DIAMOND_CHESTPLATE), 11200, 0);
    private static final Content DIAMOND_LEGGINGS = new Content(Item.get(ItemID.DIAMOND_LEGGINGS), 9800, 0);
    private static final Content DIAMOND_BOOTS = new Content(Item.get(ItemID.DIAMOND_BOOTS), 5600, 0);
    private static final Content BOW = new Content(Item.get(ItemID.BOW), 800, 0);
    private static final Content ARROW = new Content(Item.get(ItemID.ARROW, 0, 16), 200, 0);


    /** Farm Category */
    private static final Content WHEAT = new Content(Item.get(ItemID.WHEAT), 10, 10);
    private static final Content WHEAT_SEEDS = new Content(Item.get(ItemID.WHEAT_SEEDS), 5, 0);
    private static final Content MELON = new Content(Item.getBlock(BlockID.MELON_BLOCK), 30, 5);
    private static final Content MELON_SEEDS = new Content(Item.get(ItemID.MELON_SEEDS), 5, 0);
    private static final Content PUMPKIN = new Content(Item.getBlock(BlockID.PUMPKIN), 30, 5);
    private static final Content PUMPKIN_SEEDS = new Content(Item.get(ItemID.PUMPKIN_SEEDS), 5, 0);
    private static final Content BEETROOT = new Content(Item.get(ItemID.BEETROOT), 10, 10);
    private static final Content BEETROOT_SEEDS = new Content(Item.get(ItemID.BEETROOT_SEEDS), 5, 0);
    private static final Content CARROT = new Content(Item.get(ItemID.CARROT), 15, 10);
    private static final Content POTATO = new Content(Item.get(ItemID.POTATO), 15, 10);
    private static final Content SWEET_BERRIES = new Content(Item.get(ItemID.SWEET_BERRIES), 25, 15);
    private static final Content CACAO = new Content(Item.get(ItemID.DYE, DyeColor.BROWN.getDyeData()), 25, 15);
    private static final Content SUGARCANE = new Content(Item.get(ItemID.SUGARCANE), 25, 5);
    private static final Content BAMBOO = new Content(Item.getBlock(BlockID.BAMBOO), 25, 5);
    private static final Content KELP = new Content(Item.get(ItemID.KELP), 25, 5);
    private static final Content RED_MUSHROOM = new Content(Item.getBlock(BlockID.RED_MUSHROOM), 50, 30);
    private static final Content BROWN_MUSHROOM = new Content(Item.getBlock(BlockID.BROWN_MUSHROOM), 50, 30);
    private static final Content NETHER_WART = new Content(Item.get(ItemID.NETHER_WART), 100, 50);
    private static final Content CHORUS_FRUIT = new Content(Item.get(ItemID.CHORUS_FRUIT), 100, 50);


    /** Food Category */
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
    private static final Content OAK_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.OAK), 15, 10);
    private static final Content SPRUCE_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.SPRUCE), 15, 10);
    private static final Content BIRCH_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.BIRCH), 15, 10);
    private static final Content JUNGLE_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.JUNGLE), 15, 10);
    private static final Content ACACIA_LOG = new Content(Item.getBlock(BlockID.LOG2, BlockWood2.ACACIA), 15, 10);
    private static final Content DARK_OAK_LOG = new Content(Item.getBlock(BlockID.LOG2, BlockWood2.DARK_OAK), 15, 10);
    private static final Content STRIPPED_OAK_LOG = new Content(Item.getBlock(BlockID.STRIPPED_OAK_LOG), 15, 10);
    private static final Content STRIPPED_SPRUCE_LOG = new Content(Item.getBlock(BlockID.STRIPPED_SPRUCE_LOG), 15, 10);
    private static final Content STRIPPED_BIRCH_LOG = new Content(Item.getBlock(BlockID.STRIPPED_BIRCH_LOG), 15, 10);
    private static final Content STRIPPED_JUNGLE_LOG = new Content(Item.getBlock(BlockID.STRIPPED_JUNGLE_LOG), 15, 10);
    private static final Content STRIPPED_ACACIA_LOG = new Content(Item.getBlock(BlockID.STRIPPED_ACACIA_LOG), 15, 10);
    private static final Content STRIPPED_DARK_OAK_LOG = new Content(Item.getBlock(BlockID.STRIPPED_DARK_OAK_LOG), 15, 10);
    private static final Content LADDER = new Content(Item.getBlock(BlockID.LADDER), 10, 0);
    private static final Content SCAFFOLDING = new Content(Item.getBlock(BlockID.SCAFFOLDING), 30, 20);


    /** Block Stone Category */
    private static final Content COBBLE_STONE = new Content(Item.getBlock(BlockID.COBBLESTONE), 10, 5);
    private static final Content STONE = new Content(Item.getBlock(BlockID.STONE), 10, 5);
    private static final Content GRANITE_STONE = new Content(Item.getBlock(BlockID.STONE, BlockStone.GRANITE), 10, 5);
    private static final Content DIORITE_STONE = new Content(Item.getBlock(BlockID.STONE, BlockStone.DIORITE), 10, 5);
    private static final Content ANDESITE_STONE = new Content(Item.getBlock(BlockID.STONE, BlockStone.ANDESITE), 10, 5);
    private static final Content SAND_STONE = new Content(Item.getBlock(BlockID.SANDSTONE), 10, 5);
    private static final Content RED_SAND_STONE = new Content(Item.getBlock(BlockID.RED_SANDSTONE), 10, 5);
    private static final Content GLASS = new Content(Item.getBlock(BlockID.GLASS), 20, 15);
    private static final Content BRICKS = new Content(Item.getBlock(BlockID.BRICKS), 30, 15);
    private static final Content SMOOTH_STONE = new Content(Item.getBlock(BlockID.SMOOTH_STONE), 15, 10);
    private static final Content OBSIDIAN = new Content(Item.getBlock(BlockID.OBSIDIAN), 50, 30);


    /** Block Dirt Category */
    private static final Content GRASS = new Content(Item.getBlock(BlockID.GRASS), 15, 10);
    private static final Content PODZOL = new Content(Item.getBlock(BlockID.PODZOL), 25, 10);
    private static final Content MYCELIUM = new Content(Item.getBlock(BlockID.MYCELIUM), 25, 10);
    private static final Content DIRT = new Content(Item.getBlock(BlockID.DIRT), 10, 5);
    private static final Content SAND = new Content(Item.getBlock(BlockID.SAND), 10, 3);
    private static final Content RED_SAND = new Content(Item.getBlock(BlockID.SAND, BlockSand.RED), 20, 10);
    private static final Content GRAVEL = new Content(Item.getBlock(BlockID.GRAVEL), 10, 3);
    private static final Content CLAY_BLOCK = new Content(Item.getBlock(BlockID.CLAY_BLOCK), 25, 10);
    private static final Content SNOW_BLOCK = new Content(Item.getBlock(BlockID.SNOW_BLOCK), 20, 5);


    /** Block Wool Category */
    private static final Content WHITE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.WHITE.getWoolData()), 30, 15);
    private static final Content LIGHT_GRAY_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.LIGHT_GRAY.getWoolData()), 30, 15);
    private static final Content GRAY_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.GRAY.getWoolData()), 30, 15);
    private static final Content BLACK_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.BLACK.getWoolData()), 30, 15);
    private static final Content BROWN_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.BROWN.getWoolData()), 30, 15);
    private static final Content RED_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.RED.getWoolData()), 30, 15);
    private static final Content ORANGE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.ORANGE.getWoolData()), 30, 15);
    private static final Content YELLOW_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.YELLOW.getWoolData()), 30, 15);
    private static final Content LIME_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.LIME.getWoolData()), 30, 15);
    private static final Content GREEN_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.GREEN.getWoolData()), 30, 15);
    private static final Content CYAN_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.CYAN.getWoolData()), 30, 15);
    private static final Content LIGHT_BLUE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.LIGHT_BLUE.getWoolData()), 30, 15);
    private static final Content BLUE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.BLUE.getWoolData()), 30, 15);
    private static final Content PURPLE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.PURPLE.getWoolData()), 30, 15);
    private static final Content MAGENTA_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.MAGENTA.getWoolData()), 30, 15);
    private static final Content PINK_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.PINK.getWoolData()), 30, 15);


    /** Block Sea Category */
    private static final Content SEA_LANTERN = new Content(Item.getBlock(BlockID.SEA_LANTERN), 50, 25);
    private static final Content PRISMARINE = new Content(Item.getBlock(BlockID.PRISMARINE), 30, 15);
    private static final Content DARK_PRISMARINE = new Content(Item.getBlock(BlockID.PRISMARINE, BlockPrismarine.DARK), 30, 15);
    private static final Content PRISMARINE_BRICKS = new Content(Item.getBlock(BlockID.PRISMARINE, BlockPrismarine.BRICKS), 30, 15);
    private static final Content ICE = new Content(Item.getBlock(BlockID.ICE), 50, 20);
    private static final Content ICE_FROSTED = new Content(Item.getBlock(BlockID.ICE_FROSTED), 50, 20);
    private static final Content BLUE_ICE = new Content(Item.getBlock(BlockID.BLUE_ICE), 50, 20);


    /** Block Coral Category */
    private static final Content TUBE_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_TUBE), 25, 15);
    private static final Content BRAIN_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_BRAIN), 25, 15);
    private static final Content BUBBLE_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_BUBBLE), 25, 15);
    private static final Content FIRE_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_FIRE), 25, 15);
    private static final Content HORN_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_HORN), 25, 15);
    private static final Content TUBE_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_TUBE), 20, 10);
    private static final Content BRAIN_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_BRAIN), 20, 10);
    private static final Content BUBBLE_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_BUBBLE), 20, 10);
    private static final Content FIRE_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_FIRE), 20, 10);
    private static final Content HORN_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_HORN), 20, 10);
    private static final Content TUBE_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_TUBE), 20, 10);
    private static final Content BRAIN_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_BRAIN), 20, 10);
    private static final Content BUBBLE_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_BUBBLE), 20, 10);
    private static final Content FIRE_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_FIRE), 20, 10);
    private static final Content HORN_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_HORN), 20, 10);
    private static final Content SEAGRASS = new Content(Item.getBlock(BlockID.SEAGRASS), 20, 10);


    /** Block Nether Category */
    private static final Content NETHER_RACK = new Content(Item.getBlock(BlockID.NETHERRACK), 10, 3);
    private static final Content SOUL_SAND = new Content(Item.getBlock(BlockID.SOUL_SAND), 20, 10);
    private static final Content SOUL_SOIL = new Content(Item.getBlock(BlockID.SOUL_SOIL), 30, 15);
    private static final Content NETHER_BRICKS = new Content(Item.getBlock(BlockID.NETHER_BRICKS), 30, 15);
    private static final Content RED_NETHER_BRICK = new Content(Item.getBlock(BlockID.RED_NETHER_BRICK), 30, 15);
    private static final Content MAGMA = new Content(Item.getBlock(BlockID.MAGMA), 50, 25);
    private static final Content GLOWSTONE = new Content(Item.getBlock(BlockID.GLOWSTONE), 50, 25);
    private static final Content BASALT = new Content(Item.getBlock(BlockID.BASALT), 30, 15);
    private static final Content BLACKSTONE = new Content(Item.getBlock(BlockID.BLACKSTONE), 30, 15);
    private static final Content GLIDED_BLACKSTONE = new Content(Item.getBlock(BlockID.GILDED_BLACKSTONE), 35, 20);
    private static final Content NETHER_GOLD_ORE = new Content(Item.getBlock(BlockID.NETHER_GOLD_ORE), 400, 200);
    private static final Content CRYING_OBSIDIAN = new Content(Item.getBlock(BlockID.CRYING_OBSIDIAN), 50, 25);
    private static final Content SHROOMLIGHT = new Content(Item.getBlock(BlockID.SHROOMLIGHT), 50, 25);
    private static final Content CRIMSON_STEM = new Content(Item.getBlock(BlockID.CRIMSON_STEM), 30, 15);
    private static final Content CRIMSON_NYLIUM = new Content(Item.getBlock(BlockID.CRIMSON_NYLIUM), 30, 15);
    private static final Content BLOCK_NETHER_WART_BLOCK = new Content(Item.getBlock(BlockID.BLOCK_NETHER_WART_BLOCK), 30, 15);
    private static final Content WEEPING_VINES = new Content(Item.getBlock(BlockID.WEEPING_VINES), 25, 10);
    private static final Content WARPED_STEM = new Content(Item.getBlock(BlockID.WARPED_STEM), 30, 15);
    private static final Content WARPED_NYLIUM = new Content(Item.getBlock(BlockID.WARPED_NYLIUM), 30, 15);
    private static final Content WARPED_WART_BLOCK = new Content(Item.getBlock(BlockID.WARPED_WART_BLOCK), 30, 15);
    private static final Content TWISTING_VINES = new Content(Item.getBlock(BlockID.TWISTING_VINES), 25, 10);


    /** Block End Category */
    private static final Content END_STONE = new Content(Item.getBlock(BlockID.END_STONE), 15, 10);
    private static final Content CHORUS_FLOWER = new Content(Item.getBlock(BlockID.CHORUS_FLOWER), 40, 20);
    private static final Content CHORUS_PLANT = new Content(Item.getBlock(BlockID.CHORUS_PLANT), 40, 20);
    private static final Content PURPUR_BLOCK = new Content(Item.getBlock(BlockID.PURPUR_BLOCK), 30, 15);
    private static final Content PURPUR_PILLAR = new Content(Item.getBlock(BlockID.PURPUR_BLOCK, BlockPurpur.PURPUR_PILLAR), 30, 15);
    private static final Content END_ROD = new Content(Item.getBlock(BlockID.END_ROD), 50, 25);


    /** Dye Category */
    private static final Content WHITE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.WHITE.getItemDyeMeta()), 25, 3);
    private static final Content LIGHT_GRAY_DYE = new Content(Item.get(ItemID.DYE, DyeColor.LIGHT_GRAY.getItemDyeMeta()), 25, 3);
    private static final Content GRAY_DYE = new Content(Item.get(ItemID.DYE, DyeColor.GRAY.getItemDyeMeta()), 25, 3);
    private static final Content BLACK_DYE = new Content(Item.get(ItemID.DYE, DyeColor.BLACK.getItemDyeMeta()), 25, 3);
    private static final Content BROWN_DYE = new Content(Item.get(ItemID.DYE, DyeColor.BROWN.getItemDyeMeta()), 25, 3);
    private static final Content RED_DYE = new Content(Item.get(ItemID.DYE, DyeColor.RED.getItemDyeMeta()), 25, 3);
    private static final Content ORANGE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.ORANGE.getItemDyeMeta()), 25, 3);
    private static final Content YELLOW_DYE = new Content(Item.get(ItemID.DYE, DyeColor.YELLOW.getItemDyeMeta()), 25, 3);
    private static final Content LIME_DYE = new Content(Item.get(ItemID.DYE, DyeColor.LIME.getItemDyeMeta()), 25, 3);
    private static final Content GREEN_DYE = new Content(Item.get(ItemID.DYE, DyeColor.GREEN.getItemDyeMeta()), 25, 3);
    private static final Content CYAN_DYE = new Content(Item.get(ItemID.DYE, DyeColor.CYAN.getItemDyeMeta()), 25, 3);
    private static final Content LIGHT_BLUE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.LIGHT_BLUE.getItemDyeMeta()), 25, 3);
    private static final Content BLUE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.BLUE.getItemDyeMeta()), 25, 3);
    private static final Content PURPLE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.PURPLE.getItemDyeMeta()), 25, 3);
    private static final Content MAGENTA_DYE = new Content(Item.get(ItemID.DYE, DyeColor.MAGENTA.getItemDyeMeta()), 25, 3);
    private static final Content PINK_DYE = new Content(Item.get(ItemID.DYE, DyeColor.PINK.getItemDyeMeta()), 25, 3);


    private static final Category ORE_SHOP = new Category("ore", Item.get(ItemID.DIAMOND).setCustomName("§b鉱石"));

    private static final Category FARM_SHOP = new Category("farm", Item.get(ItemID.WHEAT).setCustomName("§b農業"));

    private static final Category FOOD_SHOP = new Category("food", Item.get(ItemID.COOKED_CHICKEN).setCustomName("§b食料"));

    private static final Category TOOL_SHOP = new Category("tool", Item.get(ItemID.DIAMOND_SWORD).setCustomName("§b武器&道具"));

    private static final Category BLOCK_SHOP = new Category("block", Item.getBlock(BlockID.GRASS).setCustomName("§bブロック"));

    private static final Category BLOCK_WOOD_SHOP = new Category("block_wood", Item.getBlock(BlockID.WOOD, BlockWood.OAK).setCustomName("§b原木類"));

    private static final Category BLOCK_STONE_SHOP = new Category("block_stone", Item.getBlock(BlockID.STONE).setCustomName("§b石類"));

    private static final Category BLOCK_DIRT_SHOP = new Category("block_dirt", Item.getBlock(BlockID.GRASS).setCustomName("§b土類"));

    private static final Category BLOCK_WOOL_SHOP = new Category("block_wool", Item.getBlock(BlockID.WOOL).setCustomName("§b羊毛"));

    private static final Category BLOCK_SEA_SHOP = new Category("block_sea", Item.getBlock(BlockID.SEA_LANTERN).setCustomName("§b海洋系"));

    private static final Category BLOCK_CORAL_SHOP = new Category("block_coral", Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_FIRE).setCustomName("§bサンゴ"));

    private static final Category BLOCK_NETHER_SHOP = new Category("block_nether", Item.getBlock(BlockID.MAGMA).setCustomName("§bネザー系"));

    private static final Category BLOCK_END_SHOP = new Category("block_end", Item.getBlock(BlockID.END_STONE).setCustomName("§bエンド系"));

    private static final Category DYE_SHOP = new Category("dye", Item.get(ItemID.DYE, DyeColor.WHITE.getItemDyeMeta()).setCustomName("§b染料"));

    private static final Category ARMOR_SHOP = new Category("armor", Item.get(ItemID.DIAMOND_CHESTPLATE).setCustomName("§b防具&その他"));

    private static final Category MAIN_SHOP = new Category("main", Item.get(ItemID.COMPASS).setCustomName("§bメインに戻る"));



    static {

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

        BLOCK_DIRT_SHOP
        .addContent(1, 1, GRASS)
        .addContent(2, 1, PODZOL)
        .addContent(3, 1, MYCELIUM)
        .addContent(4, 1, DIRT)
        .addContent(1, 2, SAND)
        .addContent(2, 2, RED_SAND)
        .addContent(3, 2, GRAVEL)
        .addContent(4, 2, CLAY_BLOCK)
        .addContent(1, 4, SNOW_BLOCK)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_WOOL_SHOP
        .addContent(1, 1, WHITE_WOOL)
        .addContent(2, 1, LIGHT_GRAY_WOOL)
        .addContent(3, 1, GRAY_WOOL)
        .addContent(4, 1, BLACK_WOOL)
        .addContent(5, 1, BROWN_WOOL)
        .addContent(6, 1, RED_WOOL)
        .addContent(7, 1, ORANGE_WOOL)
        .addContent(1, 2, YELLOW_WOOL)
        .addContent(2, 2, LIME_WOOL)
        .addContent(3, 2, GREEN_WOOL)
        .addContent(4, 2, CYAN_WOOL)
        .addContent(5, 2, LIGHT_BLUE_WOOL)
        .addContent(6, 2, BLUE_WOOL)
        .addContent(7, 2, PURPLE_WOOL)
        .addContent(1, 3, MAGENTA_WOOL)
        .addContent(2, 3, PINK_WOOL)
        .addCategory(7, 4, MAIN_SHOP);


        BLOCK_SEA_SHOP
        .addContent(1, 1, SEA_LANTERN)
        .addContent(2, 1, PRISMARINE)
        .addContent(3, 1, DARK_PRISMARINE)
        .addContent(4, 1, PRISMARINE_BRICKS)
        .addContent(1, 2, ICE)
        .addContent(2, 2, ICE_FROSTED)
        .addContent(3, 2, BLUE_ICE)
        .addCategory(7, 1, BLOCK_CORAL_SHOP)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_CORAL_SHOP
        .addContent(1, 1, TUBE_CORAL_BLOCK)
        .addContent(1, 2, TUBE_CORAL)
        .addContent(1, 3, TUBE_CORAL_FAN)
        .addContent(2, 1, BRAIN_CORAL_BLOCK)
        .addContent(2, 2, BRAIN_CORAL)
        .addContent(2, 3, BRAIN_CORAL_FAN)
        .addContent(3, 1, BUBBLE_CORAL_BLOCK)
        .addContent(3, 2, BUBBLE_CORAL)
        .addContent(3, 3, BUBBLE_CORAL_FAN)
        .addContent(4, 1, FIRE_CORAL_BLOCK)
        .addContent(4, 2, FIRE_CORAL)
        .addContent(4, 3, FIRE_CORAL_FAN)
        .addContent(5, 1, HORN_CORAL_BLOCK)
        .addContent(5, 2, HORN_CORAL)
        .addContent(5, 3, HORN_CORAL_FAN)
        .addContent(7, 1, SEAGRASS)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_NETHER_SHOP
        .addContent(1, 1, NETHER_RACK)
        .addContent(2, 1, SOUL_SAND)
        .addContent(3, 1, SOUL_SOIL)
        .addContent(4, 1, NETHER_BRICKS)
        .addContent(5, 1, RED_NETHER_BRICK)
        .addContent(6, 1, MAGMA)
        .addContent(7, 1, GLOWSTONE)
        .addContent(1, 2, BASALT)
        .addContent(2, 2, BLACKSTONE)
        .addContent(3, 2, GLIDED_BLACKSTONE)
        .addContent(4, 2, NETHER_GOLD_ORE)
        .addContent(5, 2, CRYING_OBSIDIAN)
        .addContent(6, 2, SHROOMLIGHT)
        .addContent(1, 3, CRIMSON_STEM)
        .addContent(2, 3, CRIMSON_NYLIUM)
        .addContent(3, 3, BLOCK_NETHER_WART_BLOCK)
        .addContent(4, 3, WEEPING_VINES)
        .addContent(1, 4, WARPED_STEM)
        .addContent(2, 4, WARPED_NYLIUM)
        .addContent(3, 4, WARPED_WART_BLOCK)
        .addContent(4, 4, TWISTING_VINES)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_END_SHOP
        .addContent(1, 1, END_STONE)
        .addContent(2, 1, CHORUS_FLOWER)
        .addContent(3, 1, CHORUS_PLANT)
        .addContent(4, 1, PURPUR_BLOCK)
        .addContent(5, 1, PURPUR_PILLAR)
        .addContent(7, 1, END_ROD)
        .addCategory(7, 4, MAIN_SHOP);

        BLOCK_SHOP
        .addCategory(1, 1, BLOCK_WOOD_SHOP)
        .addCategory(3, 1, BLOCK_STONE_SHOP)
        .addCategory(5, 1, BLOCK_DIRT_SHOP)
        .addCategory(7, 1, BLOCK_WOOL_SHOP)
        .addCategory(1, 3, BLOCK_SEA_SHOP)
        .addCategory(3, 3, BLOCK_NETHER_SHOP)
        .addCategory(5, 3, BLOCK_END_SHOP)
        .addCategory(7, 4, MAIN_SHOP);

        DYE_SHOP
        .addContent(1, 1, WHITE_DYE)
        .addContent(2, 1, LIGHT_GRAY_DYE)
        .addContent(3, 1, GRAY_DYE)
        .addContent(4, 1, BLACK_DYE)
        .addContent(5, 1, BROWN_DYE)
        .addContent(6, 1, RED_DYE)
        .addContent(7, 1, ORANGE_DYE)
        .addContent(1, 2, YELLOW_DYE)
        .addContent(2, 2, LIME_DYE)
        .addContent(3, 2, GREEN_DYE)
        .addContent(4, 2, CYAN_DYE)
        .addContent(5, 2, LIGHT_BLUE_DYE)
        .addContent(6, 2, BLUE_DYE)
        .addContent(7, 2, PURPLE_DYE)
        .addContent(1, 3, MAGENTA_DYE)
        .addContent(2, 3, PINK_DYE)
        .addCategory(7, 4, MAIN_SHOP);

        MAIN_SHOP
        .addCategory(1, 1, TOOL_SHOP)
        .addCategory(3, 1, BLOCK_SHOP)
        .addCategory(5, 1, ORE_SHOP)
        .addCategory(7, 1, DYE_SHOP)
        .addCategory(1, 3, FARM_SHOP)
        .addCategory(3, 3, FOOD_SHOP);

        MENU.setDoubleChest();
        MENU.setName("Main-Shop");
        MENU.setMainCategory(MAIN_SHOP.getInventoryCategory());
        MENU.addCategory(MAIN_SHOP.getId(), MAIN_SHOP.getInventoryCategory());
        MENU.addCategory(ORE_SHOP.getId(), ORE_SHOP.getInventoryCategory());
        MENU.addCategory(FARM_SHOP.getId(), FARM_SHOP.getInventoryCategory());
        MENU.addCategory(FOOD_SHOP.getId(), FOOD_SHOP.getInventoryCategory());
        MENU.addCategory(TOOL_SHOP.getId(), TOOL_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_SHOP.getId(), BLOCK_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_WOOD_SHOP.getId(), BLOCK_WOOD_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_STONE_SHOP.getId(), BLOCK_STONE_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_DIRT_SHOP.getId(), BLOCK_DIRT_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_WOOL_SHOP.getId(), BLOCK_WOOL_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_SEA_SHOP.getId(), BLOCK_SEA_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_CORAL_SHOP.getId(), BLOCK_CORAL_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_NETHER_SHOP.getId(), BLOCK_NETHER_SHOP.getInventoryCategory());
        MENU.addCategory(BLOCK_END_SHOP.getId(), BLOCK_END_SHOP.getInventoryCategory());
        MENU.addCategory(DYE_SHOP.getId(), DYE_SHOP.getInventoryCategory());
        MENU.addCategory(ARMOR_SHOP.getId(), ARMOR_SHOP.getInventoryCategory());
        
    }


    public static void open(Player player) {
        MENU.show(player);
    }

    
}
