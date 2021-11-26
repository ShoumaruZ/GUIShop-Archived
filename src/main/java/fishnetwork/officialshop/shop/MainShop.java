package fishnetwork.officialshop.shop;

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
import fishnetwork.officialshop.Content;
import fishnetwork.officialshop.Shop;

public class MainShop {


    public static final Shop SHOP = new Shop("ショップ", "");


    /** Ore Shop */
    private static final Content QUARTZ = new Content(Item.get(ItemID.QUARTZ), "ネザークォーツ", "textures/items/quartz", 15, 10);
    private static final Content COAL = new Content(Item.get(ItemID.COAL), "石炭", "textures/items/coal", 20, 10);
    private static final Content COAL_BLOCK = new Content(Item.get(BlockID.COAL_BLOCK), "石炭ブロック", "textures/blocks/coal_block", 160, 100);
    private static final Content REDSTONE = new Content(Item.get(ItemID.REDSTONE_DUST), "レッドストーンダスト", "textures/items/redstone_dust", 30, 15);
    private static final Content REDSTONE_BLOCK = new Content(Item.getBlock(BlockID.REDSTONE_BLOCK), "レッドストーンブロック", "textures/blocks/redstone_block", 240, 150);
    private static final Content LAPIS = new Content(Item.get(ItemID.DYE, DyeColor.BLUE.getDyeData()), "ラピスラズリ", "textures/items/dye_powder_blue", 50, 25);
    private static final Content LAPIS_BLOCK = new Content(Item.getBlock(BlockID.LAPIS_BLOCK), "ラピスラズリブロック", "textures/blocks/lapis_block", 400, 250);
    private static final Content IRON = new Content(Item.get(ItemID.IRON_INGOT), "鉄インゴット", "textures/items/iron_ingot", 300, 150);
    private static final Content IRON_BLOCK = new Content(Item.getBlock(BlockID.IRON_BLOCK), "鉄ブロック", "textures/blocks/iron_block", 2400, 1500);
    private static final Content GOLD = new Content(Item.get(ItemID.GOLD_INGOT), "金インゴット", "textures/items/gold_ingot", 400, 200);
    private static final Content GOLD_BLOCK = new Content(Item.getBlock(BlockID.GOLD_BLOCK), "金ブロック", "textures/blocks/gold_block", 4000, 2500);
    private static final Content DIAMOND = new Content(Item.get(ItemID.DIAMOND), "ダイアモンド", "textures/items/diamond", 1400, 700);
    private static final Content DIAMOND_BLOCK = new Content(Item.getBlock(BlockID.DIAMOND_BLOCK), "ダイアモンドブロック", "textures/blocks/diamond_block", 11200, 7000);
    private static final Content EMERALD = new Content(Item.get(ItemID.EMERALD), "エメラルド", "textures/items/emerald", 2000, 1000);
    private static final Content EMERALD_BLOCK = new Content(Item.getBlock(BlockID.EMERALD_BLOCK), "エメラルドブロック", "textures/blocks/emerald_block", 16000, 10000);


    /** Weapon Tool Shop */
    private static final Content WOODEN_SWORD = new Content(Item.get(ItemID.WOODEN_SWORD), "木の剣", "textures/items/wood_sword", 10, 0);
    private static final Content WOODEN_PICKAXE = new Content(Item.get(ItemID.WOODEN_PICKAXE), "木のつるはし", "textures/items/wood_pickaxe", 10, 0);
    private static final Content WOODEN_SHOVEL = new Content(Item.get(ItemID.WOODEN_SHOVEL), "木のシャベル", "textures/items/wood_shovel", 10, 0);
    private static final Content WOODEN_AXE = new Content(Item.get(ItemID.WOODEN_AXE), "木の斧", "textures/items/wood_axe", 10, 0);
    private static final Content STONE_SWORD = new Content(Item.get(ItemID.STONE_SWORD), "石の剣", "textures/items/stone_sword", 20, 0);
    private static final Content STONE_PICKAXE = new Content(Item.get(ItemID.STONE_PICKAXE), "石のつるはし", "textures/items/stone_pickaxe", 20, 0);
    private static final Content STONE_SHOVEL = new Content(Item.get(ItemID.STONE_SHOVEL), "石のシャベル", "textures/items/stone_shovel", 20, 0);
    private static final Content STONE_AXE = new Content(Item.get(ItemID.STONE_AXE), "石の斧", "textures/items/stone_axe", 20, 0);
    private static final Content IRON_SWORD = new Content(Item.get(ItemID.IRON_SWORD), "鉄の剣", "textures/items/iron_sword", 600, 0);
    private static final Content IRON_PICKAXE = new Content(Item.get(ItemID.IRON_PICKAXE), "鉄のつるはし", "textures/items/iron_pickaxe", 900, 0);
    private static final Content IRON_SHOVEL = new Content(Item.get(ItemID.IRON_SHOVEL), "鉄のシャベル", "textures/items/iron_shovel", 300, 0);
    private static final Content IRON_AXE = new Content(Item.get(ItemID.IRON_AXE), "鉄の斧", "textures/items/iron_axe", 900, 0);
    private static final Content GOLD_SWORD = new Content(Item.get(ItemID.GOLD_SWORD), "金の剣", "textures/items/gold_sword", 800, 0);
    private static final Content GOLD_PICKAXE = new Content(Item.get(ItemID.GOLD_PICKAXE), "金のつるはし", "textures/items/gold_pickaxe", 1200, 0);
    private static final Content GOLD_SHOVEL = new Content(Item.get(ItemID.GOLD_SHOVEL), "金のシャベル", "textures/items/gold_shovel", 400, 0);
    private static final Content GOLD_AXE = new Content(Item.get(ItemID.GOLD_AXE), "金の斧", "textures/items/gold_axe", 1200, 0);
    private static final Content DIAMOND_SWORD = new Content(Item.get(ItemID.DIAMOND_SWORD), "ダイヤモンドの剣", "textures/items/diamond_sword", 2800, 0);
    private static final Content DIAMOND_PICKAXE = new Content(Item.get(ItemID.DIAMOND_PICKAXE), "ダイヤモンドのつるはし", "textures/items/diamond_pickaxe", 4200, 0);
    private static final Content DIAMOND_SHOVEL = new Content(Item.get(ItemID.DIAMOND_SHOVEL), "ダイヤモンドのシャベル", "textures/items/diamond_shovel", 1400, 0);
    private static final Content DIAMOND_AXE = new Content(Item.get(ItemID.DIAMOND_AXE), "ダイヤモンドの斧", "textures/items/diamond_axe", 4200, 0);


    /** Weapon Armor Shop */
    private static final Content LEATHER_CAP = new Content(Item.get(ItemID.LEATHER_CAP), "革の帽子", "", 500, 0);
    private static final Content LEATHER_TUNIC = new Content(Item.get(ItemID.LEATHER_TUNIC), "革の服", "", 800, 0);
    private static final Content LEATHER_PANTS = new Content(Item.get(ItemID.LEATHER_PANTS), "革のパンツ", "", 700, 0);
    private static final Content LEATHER_BOOTS = new Content(Item.get(ItemID.LEATHER_BOOTS), "革のブーツ", "", 400, 0);
    private static final Content CHAIN_HELMET = new Content(Item.get(ItemID.CHAIN_HELMET), "チェーンのヘルメット", "", 1000, 0);
    private static final Content CHAIN_CHESTPLATE = new Content(Item.get(ItemID.CHAIN_CHESTPLATE), "チェーンの胸当て", "", 1600, 0);
    private static final Content CHAIN_LEGGINGS = new Content(Item.get(ItemID.CHAIN_LEGGINGS), "チェーンのレギンス", "", 1400, 0);
    private static final Content CHAIN_BOOTS = new Content(Item.get(ItemID.CHAIN_BOOTS), "チェーンのブーツ", "", 800, 0);
    private static final Content IRON_HELMET = new Content(Item.get(ItemID.IRON_HELMET), "鉄のヘルメット", "", 1500, 0);
    private static final Content IRON_CHESTPLATE = new Content(Item.get(ItemID.IRON_CHESTPLATE), "鉄の胸当て", "", 2400, 0);
    private static final Content IRON_LEGGINGS = new Content(Item.get(ItemID.IRON_LEGGINGS), "鉄のレギンス", "", 2100, 0);
    private static final Content IRON_BOOTS = new Content(Item.get(ItemID.IRON_BOOTS), "鉄のブーツ", "", 1200, 0);
    private static final Content GOLD_HELMET = new Content(Item.get(ItemID.GOLD_HELMET), "金のヘルメット", "", 2000, 0);
    private static final Content GOLD_CHESTPLATE = new Content(Item.get(ItemID.GOLD_CHESTPLATE), "金の胸当て", "", 3200, 0);
    private static final Content GOLD_LEGGINGS = new Content(Item.get(ItemID.GOLD_LEGGINGS), "金のレギンス", "", 2800, 0);
    private static final Content GOLD_BOOTS = new Content(Item.get(ItemID.GOLD_BOOTS), "金のブーツ", "", 1600, 0);
    private static final Content DIAMOND_HELMET = new Content(Item.get(ItemID.DIAMOND_HELMET), "ダイヤモンドのヘルメット", "", 7000, 0);
    private static final Content DIAMOND_CHESTPLATE = new Content(Item.get(ItemID.DIAMOND_CHESTPLATE), "ダイヤモンドの胸当て", "", 11200, 0);
    private static final Content DIAMOND_LEGGINGS = new Content(Item.get(ItemID.DIAMOND_LEGGINGS), "ダイヤモンドのレギンス", "", 9800, 0);
    private static final Content DIAMOND_BOOTS = new Content(Item.get(ItemID.DIAMOND_BOOTS), "ダイヤモンドのブーツ", "", 5600, 0);


    /** Weapon Other Shop */
    private static final Content FISHING_ROD = new Content(Item.get(ItemID.FISHING_ROD), "釣り竿", "textures/items/fishing_rod_uncast", 400, 0);
    private static final Content BOW = new Content(Item.get(ItemID.BOW), "弓", "textures/items/bow_pulling_2", 600, 0);
    private static final Content ARROW = new Content(Item.get(ItemID.ARROW, 0, 16), "矢", "textures/items/arrow", 200, 0);


    /** Farm Shop */
    private static final Content WHEAT_SEEDS = new Content(Item.get(ItemID.WHEAT_SEEDS), "小麦の種", "textures/items/seeds_wheat", 5, 0);
    private static final Content PUMPKIN_SEEDS = new Content(Item.get(ItemID.PUMPKIN_SEEDS), "カボチャの種", "textures/items/seeds_pumpkin", 5, 0);
    private static final Content MELON_SEEDS = new Content(Item.get(ItemID.MELON_SEEDS), "スイカの種", "textures/items/seeds_melon", 5, 0);
    private static final Content BEETROOT_SEEDS = new Content(Item.get(ItemID.BEETROOT_SEEDS), "ビートルートの種", "textures/items/seeds_beetroot", 5, 0);
    private static final Content WHEAT = new Content(Item.get(ItemID.WHEAT), "小麦", "textures/items/wheat", 10, 10);
    private static final Content CARROT = new Content(Item.get(ItemID.CARROT), "ニンジン", "textures/items/carrot", 15, 10);
    private static final Content POTATO = new Content(Item.get(ItemID.POTATO), "ジャガイモ", "textures/items/potato", 15, 10);
    private static final Content PUMPKIN = new Content(Item.getBlock(BlockID.PUMPKIN), "カボチャ", "textures/blocks/pumpkin_side", 30, 5);
    private static final Content MELON = new Content(Item.getBlock(BlockID.MELON_BLOCK), "スイカ", "textures/blocks/melon_side", 30, 5);
    private static final Content BEETROOT = new Content(Item.get(ItemID.BEETROOT), "ビートルート", "textures/items/beetroot", 10, 10);
    private static final Content SUGARCANE = new Content(Item.get(ItemID.SUGARCANE), "サトウキビ", "textures/items/reeds", 25, 5);
    private static final Content BAMBOO = new Content(Item.getBlock(BlockID.BAMBOO), "竹", "textures/items/bamboo", 25, 5);
    private static final Content KELP = new Content(Item.get(ItemID.KELP), "昆布", "textures/items/kelp", 25, 5);
    private static final Content CACAO = new Content(Item.get(ItemID.DYE, DyeColor.BROWN.getDyeData()), "ココアビーンズ", "textures/items/dye_powder_brown", 25, 15);
    private static final Content SWEET_BERRIES = new Content(Item.get(ItemID.SWEET_BERRIES), "スイートベリー", "textures/items/sweet_berries", 25, 15);
    private static final Content RED_MUSHROOM = new Content(Item.getBlock(BlockID.RED_MUSHROOM), "キノコ(赤)", "textures/blocks/mushroom_red", 50, 30);
    private static final Content BROWN_MUSHROOM = new Content(Item.getBlock(BlockID.BROWN_MUSHROOM), "きのこ(茶色)", "textures/blocks/mushroom_brown", 50, 30);
    private static final Content NETHER_WART = new Content(Item.get(ItemID.NETHER_WART), "ネザーウォート", "textures/items/nether_wart", 50, 10);
    private static final Content CHORUS_FRUIT = new Content(Item.get(ItemID.CHORUS_FRUIT), "コーラスフルーツ", "textures/items/chorus_fruit", 50, 20);


    /** Food Shop */
    private static final Content COOKED_CHICKEN = new Content(Item.get(ItemID.COOKED_CHICKEN), "焼き鳥", "textures/items/chicken_cooked", 30, 20);
    private static final Content COOKED_RABBIT = new Content(Item.get(ItemID.COOKED_RABBIT), "調理した兎肉", "textures/items/rabbit_cooked", 30, 20);
    private static final Content COOKED_MUTTON = new Content(Item.get(ItemID.COOKED_MUTTON), "調理した羊肉", "textures/items/mutton_cooked", 30, 20);
    private static final Content COOKED_PORKCHOP = new Content(Item.get(ItemID.COOKED_PORKCHOP), "調理した豚肉", "textures/items/porkchop_cooked", 35, 20);
    private static final Content COOKED_BEEF = new Content(Item.get(ItemID.COOKED_BEEF), "調理した牛肉", "textures/items/beef_cooked", 35, 20);
    private static final Content BREAD = new Content(Item.get(ItemID.BREAD), "パン", "textures/items/bread", 25, 20);
    private static final Content BAKED_POTATO = new Content(Item.get(ItemID.BAKED_POTATO), "ベイクドポテト", "textures/items/potato_baked", 25, 15);
    private static final Content PUMPKIN_PIE = new Content(Item.get(ItemID.PUMPKIN_PIE), "パンプキンパイ", "textures/items/pumpkin_pie", 35, 20);
    private static final Content COOKED_FISH = new Content(Item.get(ItemID.COOKED_FISH), "焼いたタラ", "textures/items/fish_cooked", 25, 20);
    private static final Content COOKED_SALMON = new Content(Item.get(ItemID.COOKED_SALMON), "調理した鮭", "textures/items/fish_salmon_cooked", 30, 20);
    private static final Content DRIED_KELP = new Content(Item.get(ItemID.DRIED_KELP), "乾燥昆布", "textures/items/dried_kelp", 5, 5);
    private static final Content COOKIE = new Content(Item.get(ItemID.COOKIE), "クッキー", "textures/items/cookie", 10, 10);
    private static final Content MUSHROOM_STEW = new Content(Item.get(ItemID.MUSHROOM_STEW), "きのこシチュー", "textures/items/mushroom_stew", 30, 25);
    private static final Content BEETROOT_SOUP = new Content(Item.get(ItemID.BEETROOT_SOUP), "ビートルートスープ", "textures/items/beetroot_soup", 30, 25);
    private static final Content RABBIT_STEW = new Content(Item.get(ItemID.RABBIT_STEW), "ウサギシチュー", "textures/items/rabbit_stew", 30, 30);
    private static final Content CAKE = new Content(Item.get(ItemID.CAKE), "ケーキ", "textures/items/cake", 100, 60);


    /** Block Wood Shop */
    private static final Content OAK_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.OAK), "樫の丸太", "textures/blocks/log_oak_top", 15, 10);
    private static final Content SPRUCE_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.SPRUCE), "トウヒの丸太", "textures/blocks/log_spruce_top", 15, 10);
    private static final Content BIRCH_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.BIRCH), "樺の丸太", "textures/blocks/log_birch_top", 15, 10);
    private static final Content JUNGLE_LOG = new Content(Item.getBlock(BlockID.LOG, BlockWood.JUNGLE), "ジャングルの木の丸太", "textures/blocks/log_jungle_top", 15, 10);
    private static final Content ACACIA_LOG = new Content(Item.getBlock(BlockID.LOG2, BlockWood2.ACACIA), "アカシアの丸太", "textures/blocks/log_acacia_top", 15, 10);
    private static final Content DARK_OAK_LOG = new Content(Item.getBlock(BlockID.LOG2, BlockWood2.DARK_OAK), "黒樫の丸太", "textures/blocks/log_big_oak_top", 15, 10);
    private static final Content STRIPPED_OAK_LOG = new Content(Item.getBlock(BlockID.STRIPPED_OAK_LOG), "皮のはがれた樫の丸太", "textures/blocks/stripped_oak_log_top", 15, 10);
    private static final Content STRIPPED_SPRUCE_LOG = new Content(Item.getBlock(BlockID.STRIPPED_SPRUCE_LOG), "皮のはがれたトウヒの丸太", "textures/blocks/stripped_spruce_log_top", 15, 10);
    private static final Content STRIPPED_BIRCH_LOG = new Content(Item.getBlock(BlockID.STRIPPED_BIRCH_LOG), "皮のはがれた樺の丸太", "textures/blocks/stripped_birch_log_top", 15, 10);
    private static final Content STRIPPED_JUNGLE_LOG = new Content(Item.getBlock(BlockID.STRIPPED_JUNGLE_LOG), "皮のはがれたジャングルの丸太", "textures/blocks/stripped_jungle_log_top", 15, 10);
    private static final Content STRIPPED_ACACIA_LOG = new Content(Item.getBlock(BlockID.STRIPPED_ACACIA_LOG), "皮のはがれたアカシアの丸太", "textures/blocks/stripped_acacia_log_top", 15, 10);
    private static final Content STRIPPED_DARK_OAK_LOG = new Content(Item.getBlock(BlockID.STRIPPED_DARK_OAK_LOG), "皮のはがれた黒樫の丸太", "textures/blocks/stripped_dark_oak_log_top", 15, 10);
    private static final Content LADDER = new Content(Item.getBlock(BlockID.LADDER), "はしご", "textures/blocks/ladder", 10, 0);
    private static final Content SCAFFOLDING = new Content(Item.getBlock(BlockID.SCAFFOLDING), "足場", "textures/blocks/scaffolding_top", 30, 20);


    /** Block Stone Shop */
    private static final Content COBBLE_STONE = new Content(Item.getBlock(BlockID.COBBLESTONE), "丸石", "textures/blocks/cobblestone", 10, 5);
    private static final Content STONE = new Content(Item.getBlock(BlockID.STONE), "石", "textures/blocks/stone", 10, 5);
    private static final Content GRANITE_STONE = new Content(Item.getBlock(BlockID.STONE, BlockStone.GRANITE), "花崗岩", "textures/blocks/stone_granite", 10, 5);
    private static final Content DIORITE_STONE = new Content(Item.getBlock(BlockID.STONE, BlockStone.DIORITE), "閃緑岩", "textures/blocks/stone_diorite", 10, 5);
    private static final Content ANDESITE_STONE = new Content(Item.getBlock(BlockID.STONE, BlockStone.ANDESITE), "安山岩", "textures/blocks/stone_andesite", 10, 5);
    private static final Content SAND_STONE = new Content(Item.getBlock(BlockID.SANDSTONE), "砂岩", "textures/blocks/sandstone_normal", 10, 5);
    private static final Content RED_SAND_STONE = new Content(Item.getBlock(BlockID.RED_SANDSTONE), "赤砂岩", "textures/blocks/red_sandstone_normal", 10, 5);
    private static final Content GLASS = new Content(Item.getBlock(BlockID.GLASS), "ガラス", "textures/blocks/glass", 20, 15);
    private static final Content BRICKS = new Content(Item.getBlock(BlockID.BRICKS), "レンガブロック", "textures/blocks/brick", 30, 15);
    private static final Content SMOOTH_STONE = new Content(Item.getBlock(BlockID.SMOOTH_STONE), "なめらかな石", "textures/blocks/stone_slab_top", 15, 10);
    private static final Content OBSIDIAN = new Content(Item.getBlock(BlockID.OBSIDIAN), "黒曜石", "textures/blocks/obsidian", 50, 30);


    /** Block Dirt Shop */
    private static final Content GRASS = new Content(Item.getBlock(BlockID.GRASS), "草ブロック", "textures/blocks/grass_side_carried", 15, 10);
    private static final Content PODZOL = new Content(Item.getBlock(BlockID.PODZOL), "ポトゾル", "textures/blocks/dirt_podzol_side", 25, 10);
    private static final Content MYCELIUM = new Content(Item.getBlock(BlockID.MYCELIUM), "菌糸", "textures/blocks/mycelium_side", 25, 10);
    private static final Content DIRT = new Content(Item.getBlock(BlockID.DIRT), "土", "textures/blocks/dirt", 10, 5);
    private static final Content SAND = new Content(Item.getBlock(BlockID.SAND), "砂", "textures/blocks/sand", 10, 3);
    private static final Content RED_SAND = new Content(Item.getBlock(BlockID.SAND, BlockSand.RED), "赤砂", "textures/blocks/red_sand", 20, 10);
    private static final Content GRAVEL = new Content(Item.getBlock(BlockID.GRAVEL), "砂利", "textures/blocks/gravel", 10, 3);
    private static final Content CLAY_BLOCK = new Content(Item.getBlock(BlockID.CLAY_BLOCK), "粘土ブロック", "textures/blocks/clay", 25, 10);
    private static final Content SNOW_BLOCK = new Content(Item.getBlock(BlockID.SNOW_BLOCK), "雪", "textures/blocks/snow", 20, 5);


    /** Block Wool Shop */
    private static final Content WHITE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.WHITE.getWoolData()), "白のウール", "textures/blocks/wool_colored_white", 30, 10);
    private static final Content LIGHT_GRAY_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.LIGHT_GRAY.getWoolData()), "薄灰色のウール", "textures/blocks/wool_colored_silver", 30, 10);
    private static final Content GRAY_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.GRAY.getWoolData()), "灰色のウール", "textures/blocks/wool_colored_gray", 30, 10);
    private static final Content BLACK_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.BLACK.getWoolData()), "黒のウール", "textures/blocks/wool_colored_black", 30, 10);
    private static final Content BROWN_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.BROWN.getWoolData()), "茶色のウール", "textures/blocks/wool_colored_brown", 30, 10);
    private static final Content RED_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.RED.getWoolData()), "赤のウール", "textures/blocks/wool_colored_red", 30, 10);
    private static final Content ORANGE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.ORANGE.getWoolData()), "オレンジのウール", "textures/blocks/wool_colored_orange", 30, 10);
    private static final Content YELLOW_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.YELLOW.getWoolData()), "黄色のウール", "textures/blocks/wool_colored_yellow", 30, 10);
    private static final Content LIME_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.LIME.getWoolData()), "黄緑のウール", "textures/blocks/wool_colored_lime", 30, 10);
    private static final Content GREEN_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.GREEN.getWoolData()), "緑のウール", "textures/blocks/wool_colored_green", 30, 10);
    private static final Content CYAN_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.CYAN.getWoolData()), "水色のウール", "textures/blocks/wool_colored_cyan", 30, 10);
    private static final Content LIGHT_BLUE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.LIGHT_BLUE.getWoolData()), "空色のウール", "textures/blocks/wool_colored_light_blue", 30, 10);
    private static final Content BLUE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.BLUE.getWoolData()), "青のウール", "textures/blocks/wool_colored_blue", 30, 10);
    private static final Content PURPLE_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.PURPLE.getWoolData()), "紫のウール", "textures/blocks/wool_colored_purple", 30, 10);
    private static final Content MAGENTA_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.MAGENTA.getWoolData()), "赤紫のウール", "textures/blocks/wool_colored_magenta", 30, 10);
    private static final Content PINK_WOOL = new Content(Item.getBlock(BlockID.WOOL, DyeColor.PINK.getWoolData()), "ピンクのウール", "textures/blocks/wool_colored_pink", 30, 10);


    /** Block Sea Shop */
    private static final Content SEA_LANTERN = new Content(Item.getBlock(BlockID.SEA_LANTERN), "海のランタン", "textures/blocks/sea_lantern", 50, 25);
    private static final Content PRISMARINE = new Content(Item.getBlock(BlockID.PRISMARINE), "海晶ブロック", "textures/blocks/prismarine_rough", 30, 15);
    private static final Content DARK_PRISMARINE = new Content(Item.getBlock(BlockID.PRISMARINE, BlockPrismarine.DARK), "暗海晶ブロック", "textures/blocks/prismarine_dark", 30, 15);
    private static final Content PRISMARINE_BRICKS = new Content(Item.getBlock(BlockID.PRISMARINE, BlockPrismarine.BRICKS), "海晶レンガ", "textures/blocks/prismarine_bricks", 30, 15);
    private static final Content ICE = new Content(Item.getBlock(BlockID.ICE), "氷", "textures/blocks/ice", 50, 20);
    private static final Content ICE_FROSTED = new Content(Item.getBlock(BlockID.ICE_FROSTED), "氷塊", "textures/blocks/ice_packed", 50, 20);
    private static final Content BLUE_ICE = new Content(Item.getBlock(BlockID.BLUE_ICE), "青の氷", "textures/blocks/blue_ice", 50, 20);


    /** Block Coral Shop */
    private static final Content TUBE_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_TUBE), "クダサンゴのブロック", "textures/blocks/coral_blue", 25, 15);
    private static final Content BRAIN_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_BRAIN), "脳サンゴのブロック", "textures/blocks/coral_pink", 25, 15);
    private static final Content BUBBLE_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_BUBBLE), "ミズタマサンゴのブロック", "textures/blocks/coral_purple", 25, 15);
    private static final Content FIRE_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_FIRE), "アナサンゴモドキのブロック", "textures/blocks/coral_red", 25, 15);
    private static final Content HORN_CORAL_BLOCK = new Content(Item.getBlock(BlockID.CORAL_BLOCK, BlockCoral.TYPE_HORN), "四放サンゴのブロック", "textures/blocks/coral_yellow", 25, 15);
    private static final Content TUBE_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_TUBE), "クダサンゴ", "textures/blocks/coral_plant_blue", 20, 10);
    private static final Content BRAIN_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_BRAIN), "脳サンゴ", "textures/blocks/coral_plant_pink", 20, 10);
    private static final Content BUBBLE_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_BUBBLE), "ミズタマサンゴ", "textures/blocks/coral_plant_purple", 20, 10);
    private static final Content FIRE_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_FIRE), "アナサンゴモドキ", "textures/blocks/coral_plant_red", 20, 10);
    private static final Content HORN_CORAL = new Content(Item.getBlock(BlockID.CORAL, BlockCoral.TYPE_HORN), "四放サンゴ", "textures/blocks/coral_plant_yellow", 20, 10);
    private static final Content TUBE_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_TUBE), "軟質クダサンゴ", "textures/blocks/coral_fan_blue", 20, 10);
    private static final Content BRAIN_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_BRAIN), "軟質脳サンゴ", "textures/blocks/coral_fan_pink", 20, 10);
    private static final Content BUBBLE_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_BUBBLE), "軟質ミズタマサンゴ", "textures/blocks/coral_fan_purple", 20, 10);
    private static final Content FIRE_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_FIRE), "軟質アナサンゴ", "textures/blocks/coral_fan_red", 20, 10);
    private static final Content HORN_CORAL_FAN = new Content(Item.getBlock(BlockID.CORAL_FAN, BlockCoral.TYPE_HORN), "軟質四放サンゴ", "textures/blocks/coral_fan_yellow", 20, 10);
    private static final Content SEAGRASS = new Content(Item.getBlock(BlockID.SEAGRASS), "海草", "textures/blocks/seagrass_carried", 20, 10);


    /** Block Nether Shop */
    private static final Content NETHER_RACK = new Content(Item.getBlock(BlockID.NETHERRACK), "ネザーレック", "textures/blocks/netherrack", 10, 3);
    private static final Content SOUL_SAND = new Content(Item.getBlock(BlockID.SOUL_SAND), "ソウルサンド", "textures/blocks/soul_sand", 20, 10);
    private static final Content SOUL_SOIL = new Content(Item.getBlock(BlockID.SOUL_SOIL), "魂の土壌", "textures/blocks/soul_soil", 30, 15);
    private static final Content NETHER_BRICKS = new Content(Item.getBlock(BlockID.NETHER_BRICKS), "ネザーレンガのブロック", "textures/blocks/nether_brick", 30, 15);
    private static final Content RED_NETHER_BRICK = new Content(Item.getBlock(BlockID.RED_NETHER_BRICK), "赤いネザーレンガ", "textures/blocks/red_nether_brick", 30, 15);
    private static final Content MAGMA = new Content(Item.getBlock(BlockID.MAGMA), "マグマブロック", "textures/blocks/magma", 50, 25);
    private static final Content GLOWSTONE = new Content(Item.getBlock(BlockID.GLOWSTONE), "グロウストーン", "textures/blocks/glowstone", 50, 25);
    private static final Content BASALT = new Content(Item.getBlock(BlockID.BASALT), "玄武岩", "textures/blocks/basalt_top", 30, 15);
    private static final Content BLACKSTONE = new Content(Item.getBlock(BlockID.BLACKSTONE), "ブラックストーン", "textures/blocks/blackstone", 30, 15);
    private static final Content GLIDED_BLACKSTONE = new Content(Item.getBlock(BlockID.GILDED_BLACKSTONE), "金色のブラックストーン", "textures/blocks/gilded_blackstone", 300, 150);
    private static final Content NETHER_GOLD_ORE = new Content(Item.getBlock(BlockID.NETHER_GOLD_ORE), "ネザーゴールド鉱石", "textures/blocks/nether_gold_ore", 400, 200);
    private static final Content CRYING_OBSIDIAN = new Content(Item.getBlock(BlockID.CRYING_OBSIDIAN), "泣く黒曜石", "textures/blocks/crying_obsidian", 50, 25);
    private static final Content SHROOMLIGHT = new Content(Item.getBlock(BlockID.SHROOMLIGHT), "きのこライト", "textures/blocks/shroomlight", 50, 25);
    private static final Content CRIMSON_STEM = new Content(Item.getBlock(BlockID.CRIMSON_STEM), "幹(クリムゾン)", "textures/blocks/huge_fungus/crimson_log_top", 30, 15);
    private static final Content CRIMSON_NYLIUM = new Content(Item.getBlock(BlockID.CRIMSON_NYLIUM), "二リウム(クリムゾン)", "textures/blocks/crimson_nylium_side", 30, 15);
    private static final Content BLOCK_NETHER_WART_BLOCK = new Content(Item.getBlock(BlockID.BLOCK_NETHER_WART_BLOCK), "ネザーウォートブロック", "textures/blocks/nether_wart_block", 30, 15);
    private static final Content WEEPING_VINES = new Content(Item.getBlock(BlockID.WEEPING_VINES), "ウィーピングつた", "textures/blocks/weeping_vines_base", 25, 10);
    private static final Content WARPED_STEM = new Content(Item.getBlock(BlockID.WARPED_STEM), "ゆがんだ幹", "textures/blocks/huge_fungus/warped_stem_top", 30, 15);
    private static final Content WARPED_NYLIUM = new Content(Item.getBlock(BlockID.WARPED_NYLIUM), "ゆがんだ二リウム", "textures/blocks/warped_nylium_side", 30, 15);
    private static final Content WARPED_WART_BLOCK = new Content(Item.getBlock(BlockID.WARPED_WART_BLOCK), "ゆがんだウォートブロック", "textures/blocks/warped_wart_block", 30, 15);
    private static final Content TWISTING_VINES = new Content(Item.getBlock(BlockID.TWISTING_VINES), "ねじれたつた", "textures/blocks/twisting_vines_base", 25, 10);


    /** Block End Shop */
    private static final Content END_STONE = new Content(Item.getBlock(BlockID.END_STONE), "エンドストーン", "textures/blocks/end_stone", 15, 10);
    private static final Content CHORUS_FLOWER = new Content(Item.getBlock(BlockID.CHORUS_FLOWER), "コーラスの花", "textures/blocks/chorus_flower", 40, 20);
    private static final Content CHORUS_PLANT = new Content(Item.getBlock(BlockID.CHORUS_PLANT), "コーラスプラント", "textures/blocks/chorus_plant", 40, 20);
    private static final Content PURPUR_BLOCK = new Content(Item.getBlock(BlockID.PURPUR_BLOCK), "プルプァブロック", "textures/blocks/purpur_block", 30, 15);
    private static final Content PURPUR_PILLAR = new Content(Item.getBlock(BlockID.PURPUR_BLOCK, BlockPurpur.PURPUR_PILLAR), "プルプァの柱", "textures/blocks/purpur_pillar", 30, 15);
    private static final Content END_ROD = new Content(Item.getBlock(BlockID.END_ROD), "果てのロッド", "textures/blocks/end_rod", 50, 25);


    /** Dye Shop */
    private static final Content WHITE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.WHITE.getItemDyeMeta()), "白の染料", "textures/items/dye_powder_white_new", 25, 3);
    private static final Content LIGHT_GRAY_DYE = new Content(Item.get(ItemID.DYE, DyeColor.LIGHT_GRAY.getItemDyeMeta()), "薄灰色の染料", "textures/items/dye_powder_silver", 25, 3);
    private static final Content GRAY_DYE = new Content(Item.get(ItemID.DYE, DyeColor.GRAY.getItemDyeMeta()), "灰色の染料", "textures/items/dye_powder_gray", 25, 3);
    private static final Content BLACK_DYE = new Content(Item.get(ItemID.DYE, DyeColor.BLACK.getItemDyeMeta()), "黒の染料", "textures/items/dye_powder_black_new", 25, 3);
    private static final Content BROWN_DYE = new Content(Item.get(ItemID.DYE, DyeColor.BROWN.getItemDyeMeta()), "茶色の染料", "textures/items/dye_powder_brown_new", 25, 3);
    private static final Content RED_DYE = new Content(Item.get(ItemID.DYE, DyeColor.RED.getItemDyeMeta()), "赤の染料", "textures/items/dye_powder_red", 25, 3);
    private static final Content ORANGE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.ORANGE.getItemDyeMeta()), "オレンジの染料", "textures/items/dye_powder_orange", 25, 3);
    private static final Content YELLOW_DYE = new Content(Item.get(ItemID.DYE, DyeColor.YELLOW.getItemDyeMeta()), "黄色の染料", "textures/items/dye_powder_yellow", 25, 3);
    private static final Content LIME_DYE = new Content(Item.get(ItemID.DYE, DyeColor.LIME.getItemDyeMeta()), "黄緑の染料", "textures/items/dye_powder_lime", 25, 3);
    private static final Content GREEN_DYE = new Content(Item.get(ItemID.DYE, DyeColor.GREEN.getItemDyeMeta()), "緑の染料", "textures/items/dye_powder_green", 25, 3);
    private static final Content CYAN_DYE = new Content(Item.get(ItemID.DYE, DyeColor.CYAN.getItemDyeMeta()), "水色の染料", "textures/items/dye_powder_cyan", 25, 3);
    private static final Content LIGHT_BLUE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.LIGHT_BLUE.getItemDyeMeta()), "空色の染料", "textures/items/dye_powder_light_blue", 25, 3);
    private static final Content BLUE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.BLUE.getItemDyeMeta()), "青の染料", "textures/items/dye_powder_blue_new", 25, 3);
    private static final Content PURPLE_DYE = new Content(Item.get(ItemID.DYE, DyeColor.PURPLE.getItemDyeMeta()), "紫の染料", "textures/items/dye_powder_purple", 25, 3);
    private static final Content MAGENTA_DYE = new Content(Item.get(ItemID.DYE, DyeColor.MAGENTA.getItemDyeMeta()), "赤紫の染料", "textures/items/dye_powder_magenta", 25, 3);
    private static final Content PINK_DYE = new Content(Item.get(ItemID.DYE, DyeColor.PINK.getItemDyeMeta()), "ピンクの染料", "textures/items/dye_powder_pink", 25, 3);


    /** Rare Shop */
    private static final Content SHULKER_SHELL = new Content(Item.get(ItemID.SHULKER_SHELL, 0, 2), "シュルカーの殻", "textures/items/shulker_shell", 5000, 1000);
    private static final Content ITEM_FRAME = new Content(Item.get(ItemID.ITEM_FRAME), "額縁", "textures/items/item_frame", 600, 200);
    private static final Content BELL = new Content(Item.getBlock(BlockID.BELL), "ベル", "textures/items/villagebell", 5000, 1000);


    private static final Shop WEAPON_SHOP = new Shop("武器", "textures/items/diamond_sword");

    private static final Shop WEAPON_TOOL_SHOP = new Shop("ツール", "textures/items/diamond_pickaxe");

    private static final Shop WEAPON_ARMOR_SHOP = new Shop("防具", "textures/items/diamond_chestplate");

    private static final Shop WEAPON_OTHER_SHOP = new Shop("その他", "textures/items/bow_pulling_2");

    private static final Shop BLOCK_SHOP = new Shop("ブロック", "textures/blocks/grass_side_carried");

    private static final Shop BLOCK_WOOD_SHOP = new Shop("木材系", "textures/blocks/log_oak_top");

    private static final Shop BLOCK_STONE_SHOP = new Shop("石系", "textures/blocks/stone");

    private static final Shop BLOCK_DIRT_SHOP = new Shop("土系", "textures/blocks/dirt");

    private static final Shop BLOCK_WOOL_SHOP = new Shop("羊毛系", "textures/blocks/wool_colored_white");

    private static final Shop BLOCK_SEA_SHOP = new Shop("海洋系", "textures/blocks/sea_lantern");

    private static final Shop BLOCK_CORAL_SHOP = new Shop("サンゴ系", "textures/blocks/coral_pink");

    private static final Shop BLOCK_NETHER_SHOP = new Shop("ネザー系", "textures/blocks/magma");

    private static final Shop BLOCK_END_SHOP = new Shop("エンド系", "textures/blocks/end_stone");

    private static final Shop ORE_SHOP = new Shop("鉱石", "textures/items/diamond");

    private static final Shop DYE_SHOP = new Shop("染料", "textures/items/dye_powder_white_new");

    private static final Shop FARM_SHOP = new Shop("農業", "textures/items/wheat");

    private static final Shop FOOD_SHOP = new Shop("食料", "textures/items/beef_cooked");

    private static final Shop RARE_SHOP = new Shop("レアアイテム", "textures/blocks/ender_chest_front");


    static {
        SHOP
        .addElement(WEAPON_SHOP)
        .addElement(BLOCK_SHOP)
        .addElement(ORE_SHOP)
        .addElement(DYE_SHOP)
        .addElement(FARM_SHOP)
        .addElement(FOOD_SHOP)
        .addElement(RARE_SHOP);

        ORE_SHOP
        .addElement(QUARTZ)
        .addElement(COAL)
        .addElement(COAL_BLOCK)
        .addElement(REDSTONE)
        .addElement(REDSTONE_BLOCK)
        .addElement(LAPIS)
        .addElement(LAPIS_BLOCK)
        .addElement(IRON)
        .addElement(IRON_BLOCK)
        .addElement(GOLD)
        .addElement(GOLD_BLOCK)
        .addElement(DIAMOND)
        .addElement(DIAMOND_BLOCK)
        .addElement(EMERALD)
        .addElement(EMERALD_BLOCK);

        WEAPON_SHOP
        .addElement(WEAPON_TOOL_SHOP)
        .addElement(WEAPON_ARMOR_SHOP)
        .addElement(WEAPON_OTHER_SHOP);

        WEAPON_TOOL_SHOP
        .addElement(WOODEN_SWORD)
        .addElement(WOODEN_PICKAXE)
        .addElement(WOODEN_SHOVEL)
        .addElement(WOODEN_AXE)
        .addElement(STONE_SWORD)
        .addElement(STONE_PICKAXE)
        .addElement(STONE_SHOVEL)
        .addElement(STONE_AXE)
        .addElement(IRON_SWORD)
        .addElement(IRON_PICKAXE)
        .addElement(IRON_SHOVEL)
        .addElement(IRON_AXE)
        .addElement(GOLD_SWORD)
        .addElement(GOLD_PICKAXE)
        .addElement(GOLD_SHOVEL)
        .addElement(GOLD_AXE)
        .addElement(DIAMOND_SWORD)
        .addElement(DIAMOND_PICKAXE)
        .addElement(DIAMOND_SHOVEL)
        .addElement(DIAMOND_AXE);

        WEAPON_ARMOR_SHOP
        .addElement(LEATHER_CAP)
        .addElement(LEATHER_TUNIC)
        .addElement(LEATHER_PANTS)
        .addElement(LEATHER_BOOTS)
        .addElement(CHAIN_HELMET)
        .addElement(CHAIN_CHESTPLATE)
        .addElement(CHAIN_LEGGINGS)
        .addElement(CHAIN_BOOTS)
        .addElement(IRON_HELMET)
        .addElement(IRON_CHESTPLATE)
        .addElement(IRON_LEGGINGS)
        .addElement(IRON_BOOTS)
        .addElement(GOLD_HELMET)
        .addElement(GOLD_CHESTPLATE)
        .addElement(GOLD_LEGGINGS)
        .addElement(GOLD_BOOTS)
        .addElement(DIAMOND_HELMET)
        .addElement(DIAMOND_CHESTPLATE)
        .addElement(DIAMOND_LEGGINGS)
        .addElement(DIAMOND_BOOTS);

        WEAPON_OTHER_SHOP
        .addElement(FISHING_ROD)
        .addElement(BOW)
        .addElement(ARROW);

        FARM_SHOP
        .addElement(WHEAT_SEEDS)
        .addElement(MELON_SEEDS)
        .addElement(PUMPKIN_SEEDS)
        .addElement(BEETROOT_SEEDS)
        .addElement(WHEAT)
        .addElement(CARROT)
        .addElement(POTATO)
        .addElement(MELON)
        .addElement(PUMPKIN)
        .addElement(BEETROOT)
        .addElement(SWEET_BERRIES)
        .addElement(CACAO)
        .addElement(SUGARCANE)
        .addElement(BAMBOO)
        .addElement(KELP)
        .addElement(RED_MUSHROOM)
        .addElement(BROWN_MUSHROOM)
        .addElement(NETHER_WART)
        .addElement(CHORUS_FRUIT);

        FOOD_SHOP
        .addElement(COOKED_CHICKEN)
        .addElement(COOKED_RABBIT)
        .addElement(COOKED_MUTTON)
        .addElement(COOKED_PORKCHOP)
        .addElement(COOKED_BEEF)
        .addElement(DRIED_KELP)
        .addElement(BREAD)
        .addElement(BAKED_POTATO)
        .addElement(PUMPKIN_PIE)
        .addElement(COOKED_FISH)
        .addElement(COOKED_SALMON)
        .addElement(COOKIE)
        .addElement(MUSHROOM_STEW)
        .addElement(BEETROOT_SOUP)
        .addElement(RABBIT_STEW)
        .addElement(CAKE);

        BLOCK_SHOP
        .addElement(BLOCK_WOOD_SHOP)
        .addElement(BLOCK_STONE_SHOP)
        .addElement(BLOCK_DIRT_SHOP)
        .addElement(BLOCK_WOOL_SHOP)
        .addElement(BLOCK_SEA_SHOP)
        .addElement(BLOCK_NETHER_SHOP)
        .addElement(BLOCK_END_SHOP);

        BLOCK_WOOD_SHOP
        .addElement(OAK_LOG)
        .addElement(SPRUCE_LOG)
        .addElement(BIRCH_LOG)
        .addElement(JUNGLE_LOG)
        .addElement(ACACIA_LOG)
        .addElement(DARK_OAK_LOG)
        .addElement(STRIPPED_OAK_LOG)
        .addElement(STRIPPED_SPRUCE_LOG)
        .addElement(STRIPPED_BIRCH_LOG)
        .addElement(STRIPPED_JUNGLE_LOG)
        .addElement(STRIPPED_ACACIA_LOG)
        .addElement(STRIPPED_DARK_OAK_LOG)
        .addElement(LADDER)
        .addElement(SCAFFOLDING);

        BLOCK_STONE_SHOP
        .addElement(COBBLE_STONE)
        .addElement(STONE)
        .addElement(GRANITE_STONE)
        .addElement(DIORITE_STONE)
        .addElement(ANDESITE_STONE)
        .addElement(SAND_STONE)
        .addElement(RED_SAND_STONE)
        .addElement(GLASS)
        .addElement(BRICKS)
        .addElement(SMOOTH_STONE)
        .addElement(OBSIDIAN);

        BLOCK_DIRT_SHOP
        .addElement(GRASS)
        .addElement(PODZOL)
        .addElement(MYCELIUM)
        .addElement(DIRT)
        .addElement(SAND)
        .addElement(RED_SAND)
        .addElement(GRAVEL)
        .addElement(CLAY_BLOCK)
        .addElement(SNOW_BLOCK);

        BLOCK_WOOL_SHOP
        .addElement(WHITE_WOOL)
        .addElement(LIGHT_GRAY_WOOL)
        .addElement(GRAY_WOOL)
        .addElement(BLACK_WOOL)
        .addElement(BROWN_WOOL)
        .addElement(RED_WOOL)
        .addElement(ORANGE_WOOL)
        .addElement(YELLOW_WOOL)
        .addElement(LIME_WOOL)
        .addElement(GREEN_WOOL)
        .addElement(CYAN_WOOL)
        .addElement(LIGHT_BLUE_WOOL)
        .addElement(BLUE_WOOL)
        .addElement(PURPLE_WOOL)
        .addElement(MAGENTA_WOOL)
        .addElement(PINK_WOOL);

        BLOCK_SEA_SHOP
        .addElement(SEA_LANTERN)
        .addElement(PRISMARINE)
        .addElement(DARK_PRISMARINE)
        .addElement(PRISMARINE_BRICKS)
        .addElement(ICE)
        .addElement(ICE_FROSTED)
        .addElement(BLUE_ICE)
        .addElement(BLOCK_CORAL_SHOP);
    
        BLOCK_CORAL_SHOP
        .addElement(TUBE_CORAL_BLOCK)
        .addElement(TUBE_CORAL)
        .addElement(TUBE_CORAL_FAN)
        .addElement(BRAIN_CORAL_BLOCK)
        .addElement(BRAIN_CORAL)
        .addElement(BRAIN_CORAL_FAN)
        .addElement(BUBBLE_CORAL_BLOCK)
        .addElement(BUBBLE_CORAL)
        .addElement(BUBBLE_CORAL_FAN)
        .addElement(FIRE_CORAL_BLOCK)
        .addElement(FIRE_CORAL)
        .addElement(FIRE_CORAL_FAN)
        .addElement(HORN_CORAL_BLOCK)
        .addElement(HORN_CORAL)
        .addElement(HORN_CORAL_FAN)
        .addElement(SEAGRASS);

        BLOCK_NETHER_SHOP
        .addElement(NETHER_RACK)
        .addElement(SOUL_SAND)
        .addElement(SOUL_SOIL)
        .addElement(NETHER_BRICKS)
        .addElement(RED_NETHER_BRICK)
        .addElement(MAGMA)
        .addElement(GLOWSTONE)
        .addElement(BASALT)
        .addElement(BLACKSTONE)
        .addElement(GLIDED_BLACKSTONE)
        .addElement(NETHER_GOLD_ORE)
        .addElement(CRYING_OBSIDIAN)
        .addElement(SHROOMLIGHT)
        .addElement(CRIMSON_STEM)
        .addElement(CRIMSON_NYLIUM)
        .addElement(BLOCK_NETHER_WART_BLOCK)
        .addElement(WEEPING_VINES)
        .addElement(WARPED_STEM)
        .addElement(WARPED_NYLIUM)
        .addElement(WARPED_WART_BLOCK)
        .addElement(TWISTING_VINES);

        BLOCK_END_SHOP
        .addElement(END_STONE)
        .addElement(CHORUS_FLOWER)
        .addElement(CHORUS_PLANT)
        .addElement(PURPUR_BLOCK)
        .addElement(PURPUR_PILLAR)
        .addElement(END_ROD);

        DYE_SHOP
        .addElement(WHITE_DYE)
        .addElement(LIGHT_GRAY_DYE)
        .addElement(GRAY_DYE)
        .addElement(BLACK_DYE)
        .addElement(BROWN_DYE)
        .addElement(RED_DYE)
        .addElement(ORANGE_DYE)
        .addElement(YELLOW_DYE)
        .addElement(LIME_DYE)
        .addElement(GREEN_DYE)
        .addElement(CYAN_DYE)
        .addElement(LIGHT_BLUE_DYE)
        .addElement(BLUE_DYE)
        .addElement(PURPLE_DYE)
        .addElement(MAGENTA_DYE)
        .addElement(PINK_DYE);

        RARE_SHOP
        .addElement(ITEM_FRAME)
        .addElement(SHULKER_SHELL)
        .addElement(BELL);
    }


    
}
