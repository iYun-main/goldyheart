package net.iyun.goldyheart.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup AGOLDYFOOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Goldy_Heart.MOD_ID,"aaaafood"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aaaafood"))
                    .icon(() -> new ItemStack(ModItems.NETHERITEBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.VOID);
                    entries.add(ModItems.ANCIENTFRUIT);
                    entries.add(ModItems.SALT);
                    entries.add(ModItems.BUCKETOFSALT);
                    entries.add(ModItems.PEPPER);
                    entries.add(ModItems.BUCKETOFPEPPER);
                    entries.add(ModItems.BUTTER);
                    entries.add(ModItems.MELTEDBUTTER);
                    entries.add(ModItems.MARSHMELLOW);
                    entries.add(ModItems.MARSHMELLOWSTICK);
                    entries.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOW);
                    entries.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK);
                    entries.add(ModItems.COOKEDMARSHMELLOW);
                    entries.add(ModItems.COOKEDMARSHMELLOWSTICK);
                    entries.add(ModItems.BURNTMARSHMELLOW);
                    entries.add(ModItems.BURNTMARSHMELLOWSTICK);
                    entries.add(ModItems.COPPERBERRY);
                    entries.add(ModItems.COALBERRY);
                    entries.add(ModItems.GOLDBERRY);
                    entries.add(ModItems.EMERALDBERRY);
                    entries.add(ModItems.IRONBERRY);
                    entries.add(ModItems.LAPISBERRY);
                    entries.add(ModItems.AMETHYSTBERRY);
                    entries.add(ModItems.DIAMONDBERRY);
                    entries.add(ModItems.NETHERITEBERRY);
                    entries.add(ModItems.REDSTONEBERRY);
                    entries.add(ModItems.NETHERQUARTZBERRY);
                    entries.add(ModItems.BOILEDEGG);
                    entries.add(ModItems.FRIEDEGG);
                    entries.add(ModItems.EGGONBREAD);
                    entries.add(ModItems.CUTBREAD);
                    entries.add(ModItems.TRUFFLE);
                    entries.add(ModItems.CANDIEDSPIDEREYE);
                    entries.add(ModItems.RAWBACON);
                    entries.add(ModItems.COOKEDBACON);
                    entries.add(ModItems.TOMATO);
                    entries.add(ModItems.CUTTOMATO);
                    entries.add(ModItems.CUCUMBER);
                    entries.add(ModItems.CUCUMBERSLICE);
                    entries.add(ModItems.GRAPES);
                    entries.add(ModItems.COFFEEBEAN);
                    entries.add(ModItems.LETTUCE);
                    entries.add(ModItems.LETTUCELEAF);
                    entries.add(ModItems.APPLEPIE);
                    entries.add(ModItems.CHOCOLATEPIE);
                    entries.add(ModItems.CHEESEPIE);
                    entries.add(ModItems.CHEESE);
                    entries.add(ModItems.TOAST);
                    entries.add(ModItems.TOAST2);
                    entries.add(ModItems.CAKESLICE);
                    entries.add(ModItems.CARROTCAKE);
                    entries.add(ModItems.SWEETBERRYCAKE);
                    entries.add(ModItems.GLOWBERRYCAKE);
                    entries.add(ModItems.APPLECAKE);
                    entries.add(ModItems.MELONSCAKE);
                    entries.add(ModItems.CHORUSCAKE);
                    entries.add(ModItems.BEETROOTCAKE);
                    entries.add(ModItems.STRAWBERRYCAKE);
                    entries.add(ModItems.BLUEBERRYCAKE);
                    entries.add(ModItems.MUFFIN);
                    entries.add(ModItems.APPLEMUFFIN);
                    entries.add(ModItems.BLUEMUFFIN);
                    entries.add(ModItems.STRAWMUFFIN);
                    entries.add(ModItems.MELONMUFFIN);
                    entries.add(ModItems.GLOWMUFFIN);
                    entries.add(ModItems.CARROTMUFFIN);
                    entries.add(ModItems.SWEETMUFFIN);
                    entries.add(ModItems.CHOCOMUFFIN);
                    entries.add(ModItems.PUMPKINMUFFIN);
                    entries.add(ModItems.PICKELS);
                    entries.add(ModItems.PICKELTOMATO);
                    entries.add(ModItems.PICKELSTRAW);
                    entries.add(ModItems.PICKELONION);
                    entries.add(ModItems.PICKELCORN);
                    entries.add(ModItems.PICKELCHILLI);
                    entries.add(ModItems.PICKELCARROT);
                    entries.add(ModItems.PICKELBLUE);
                    entries.add(ModItems.PICKELBELL);
                    entries.add(ModItems.PANCAKES);
                    entries.add(ModItems.CROISSANT);
                    entries.add(ModItems.WINE);
                    entries.add(ModItems.GLOWWINE);
                    entries.add(ModItems.BEETWINE);
                    entries.add(ModItems.CHORUSWINE);
                    entries.add(ModItems.MELONWINE);
                    entries.add(ModItems.SWEETWINE);
                    entries.add(ModItems.WHISKEY);
                    entries.add(ModItems.BUTTEREDPOTATO);
                    entries.add(ModItems.MASHEDPOTATOES);
                    entries.add(ModItems.TOMATOSOUP);
                    entries.add(ModItems.SPIDEREYESOUP);
                    entries.add(ModItems.SALAD);
                    entries.add(ModItems.PUMPKINSOUP);
                    entries.add(ModItems.NOODLES);
                    entries.add(ModItems.SPAGHETTI);
                    entries.add(ModItems.STEAKANDPOTATO);
                    entries.add(ModItems.DUMPLING);
                    entries.add(ModItems.DOUGH);
                    entries.add(ModItems.SPRINGROLL);
                    entries.add(ModItems.STUFFEDMUSHROOM);
                    entries.add(ModItems.NIGIRISUSHI);
                    entries.add(ModItems.VEGGIEMAKI);
                    entries.add(ModItems.VEGGIESANDWICH);
                    entries.add(ModItems.HOTCHOCOLATE);
                    entries.add(ModItems.COFFEE);
                    entries.add(ModItems.CABBAGEMEATROLL);
                    entries.add(ModItems.BURGER);
                    entries.add(ModItems.APPLESMOOTHIE);
                    entries.add(ModItems.CARROTSMOOTHIE);
                    entries.add(ModItems.PUMPKINSMOOTHIE);
                    entries.add(ModItems.SWEETBERRYSMOOTHIE);
                    entries.add(ModItems.WATERMELONSMOOTHIE);
                    entries.add(ModItems.GLOWBERRYSMOOTHIE);
                    entries.add(ModItems.BLUEBERSMOOTHIE);
                    entries.add(ModItems.STRAWBERSMOOTHIE);
                    entries.add(ModItems.TOASTWITHBUTTER);
                    entries.add(ModItems.TOASTWITHBACON);
                    entries.add(ModItems.TOASTWITHJAM);
                    entries.add(ModItems.TOASTWITHEGG);
                    entries.add(ModItems.FRIEDCHICKEN);
                    entries.add(ModItems.RAWCHICKENLEG);
                    entries.add(ModItems.PARSLEY);
                    entries.add(ModItems.ONION);
                    entries.add(ModItems.ONIONSLICE);
                    entries.add(ModItems.RAWONIONRING);
                    entries.add(ModItems.FRIEDONIONRING);
                    entries.add(ModItems.BELLPEPPER);
                    entries.add(ModItems.BELLPEPPERSLICE);
                    entries.add(ModItems.STUFFEDBELLPEPPER);
                    entries.add(ModItems.GARLIC);
                    entries.add(ModItems.GARLICBREAD);
                    entries.add(ModItems.PIZZA);
                    entries.add(ModItems.PIZZASLICE);
                    entries.add(ModItems.DOUGHTNUT);
                    entries.add(ModItems.BEETDONUT);
                    entries.add(ModItems.CARROTDONUT);
                    entries.add(ModItems.APPLEDONUT);
                    entries.add(ModItems.BLUEDONUT);
                    entries.add(ModItems.STRAWDONUT);
                    entries.add(ModItems.SWEETDONUT);
                    entries.add(ModItems.CHOCODONUT);
                    entries.add(ModItems.MELONDONUT);
                    entries.add(ModItems.CHORUSDONUT);
                    entries.add(ModItems.GLOWDONUT);
                    entries.add(ModItems.GLOWBERRYCAKESLICE);
                    entries.add(ModItems.APPLECAKESLICE);
                    entries.add(ModItems.SWEETBERRYCAKESLICE);
                    entries.add(ModItems.WATERMELONCAKESLICE);
                    entries.add(ModItems.CHORUSCAKESLICE);
                    entries.add(ModItems.CARROTCAKESLICE);
                    entries.add(ModItems.BEETROOTCAKESLICE);
                    entries.add(ModItems.STRAWBERRYCAKESLICE);
                    entries.add(ModItems.BLUEBERRYCAKESLICE);
                    entries.add(ModItems.MELONJAM);
                    entries.add(ModItems.CARROTJAM);
                    entries.add(ModItems.CHORUSJAM);
                    entries.add(ModItems.BEETJAM);
                    entries.add(ModItems.SWEETJAM);
                    entries.add(ModItems.GLOWJAM);
                    entries.add(ModItems.BLUEBERJAM);
                    entries.add(ModItems.STRAWJAM);
                    entries.add(ModItems.APPLEJAM);
                    entries.add(ModItems.GLOWCOOKIE);
                    entries.add(ModItems.MELONCOOKIE);
                    entries.add(ModItems.SWEETCOOKIE);
                    entries.add(ModItems.BEETCOOKIE);
                    entries.add(ModItems.CHORUSCOOKIE);
                    entries.add(ModItems.BLUECOOKIE);
                    entries.add(ModItems.STRAWCOOKIE);
                    entries.add(ModItems.CHILLI);
                    entries.add(ModItems.CORN);
                        //     entries.add(ModItems.WORM);
                        //   entries.add(ModItems.CANOFWORMS);
                        //    entries.add(ModItems.WORMBOWL);
                    entries.add(ModItems.STRAWBERRY);
                    entries.add(ModItems.BLUEBERRY);
                    entries.add(ModItems.PEARLSTEW);
                    entries.add(ModItems.POPCORN);
                    entries.add(ModItems.BUTTERCORN);
                    entries.add(ModItems.SNIFFEROMLETTE);
                    entries.add(ModItems.BOILEDSNIFFEGG);
                    entries.add(ModItems.BLAZERODNOODLES);
                    entries.add(ModItems.GRILLEDCORN);
                    entries.add(ModItems.CHOCOSTRAWBERRY);
                    entries.add(ModItems.RHUBARB);
                    entries.add(ModItems.SANDBREAD);
                    }).build());

    public static final ItemGroup AGOLDYBLOCK = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Goldy_Heart.MOD_ID,"aaablock"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aaablock"))
                    .icon(() -> new ItemStack(ModItems.DIAMONDBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModBlocks.DIRT_SLAB);
                    entries.add(ModBlocks.ROOTED_DIRT_SLAB);
                    entries.add(ModBlocks.OBSIDIAN_SLAB);
                    entries.add(ModBlocks.GRAVEL_SLAB);
                    entries.add(ModBlocks.PACKED_ICE_SLAB);
                    entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
                    entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
                    entries.add(ModBlocks.SAND_SLAB);
                    entries.add(ModBlocks.RED_SAND_SLAB);
                    entries.add(ModBlocks.SAND_STAIR);
                    entries.add(ModBlocks.RED_SAND_STAIR);
                    entries.add(ModBlocks.WHITE_WOOL_SLAB);
                    entries.add(ModBlocks.RED_WOOL_SLAB);
                    entries.add(ModBlocks.BLACK_WOOL_SLAB);
                    entries.add(ModBlocks.BLUE_WOOL_SLAB);
                    entries.add(ModBlocks.CYAN_WOOL_SLAB);
                    entries.add(ModBlocks.YELLOW_WOOL_SLAB);
                    entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
                    entries.add(ModBlocks.GRAY_WOOL_SLAB);
                    entries.add(ModBlocks.GREEN_WOOL_SLAB);
                    entries.add(ModBlocks.BROWN_WOOL_SLAB);
                    entries.add(ModBlocks.ORANGE_WOOL_SLAB);
                    entries.add(ModBlocks.LIME_WOOL_SLAB);
                    entries.add(ModBlocks.PURPLE_WOOL_SLAB);
                    entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                    entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                    entries.add(ModBlocks.WEATHERED_LOG);
                    entries.add(ModBlocks.WEATHERED_WOOD);
                    entries.add(ModBlocks.STRIPPED_WEATHERED_LOG);
                    entries.add(ModBlocks.STRIPPED_WEATHERED_WOOD);
                    entries.add(ModBlocks.WEATHERED_PLANKS);
                    entries.add(ModBlocks.WEATHERED_LEAVES);
                    entries.add(ModBlocks.WEATHERED_SAPLING);
                    entries.add(ModBlocks.WEATHERED_PLANK_SLABS);
                    entries.add(ModBlocks.WEATHERED_PLANK_STAIRS);
                    entries.add(ModBlocks.GRASS_SLAB);
                    entries.add(ModBlocks.MOSS_SLAB);
                    entries.add(ModBlocks.GOLD_SLAB);
                    entries.add(ModBlocks.GOLD_STAIRS);
                    entries.add(ModBlocks.IRON_SLAB);
                    entries.add(ModBlocks.IRON_STAIRS);
                    entries.add(ModBlocks.CALCITE_SLAB);
                    entries.add(ModBlocks.CALCITE_STAIRS);
                    entries.add(ModBlocks.DEAD_TUBE_CORAL_STAIRS);
                    entries.add(ModBlocks.DEAD_TUBE_CORAL_SLAB);
                    entries.add(ModBlocks.DEAD_FIRE_CORAL_SLAB);
                    entries.add(ModBlocks.DEAD_FIRE_CORAL_STAIRS);
                    entries.add(ModBlocks.DEAD_BRAIN_CORAL_STAIRS);
                    entries.add(ModBlocks.DEAD_BRAIN_CORAL_SLAB);
                    entries.add(ModBlocks.DEAD_HORN_CORAL_SLAB);
                    entries.add(ModBlocks.DEAD_HORN_CORAL_STAIRS);
                    entries.add(ModBlocks.DEAD_BUBBLE_CORAL_SLAB);
                    entries.add(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS);
                    entries.add(ModBlocks.AMETHYST_SLAB);
                    entries.add(ModBlocks.AMETHYST_STAIRS);
                    entries.add(ModBlocks.TUFF_SLAB);
                    entries.add(ModBlocks.TUFF_STAIRS);
                    entries.add(ModBlocks.TUFF_WALL);
                    entries.add(ModBlocks.SOUL_SAND_SLAB);
                    entries.add(ModBlocks.COPPER_SLAB);
                    entries.add(ModBlocks.COPPER_STAIRS);
                    entries.add(ModBlocks.EXPOSED_COPPER_SLAB);
                    entries.add(ModBlocks.EXPOSED_COPPER_STAIRS);
                    entries.add(ModBlocks.WEATHERED_COPPER_SLAB);
                    entries.add(ModBlocks.WEATHERED_COPPER_STAIRS);
                    entries.add(ModBlocks.OXIDIZED_COPPER_SLAB);
                    entries.add(ModBlocks.OXIDIZED_COPPER_STAIRS);
                    entries.add(ModBlocks.OAK_WOOD_SLAB);
                    entries.add(ModBlocks.OAK_WOOD_SLAB_S);
                    entries.add(ModBlocks.BIRCH_WOOD_SLAB);
                    entries.add(ModBlocks.BIRCH_WOOD_SLAB_S);
                    entries.add(ModBlocks.ACA_WOOD_SLAB);
                    entries.add(ModBlocks.ACA_WOOD_SLAB_S);
                    entries.add(ModBlocks.DARK_OAK_WOOD_SLAB);
                    entries.add(ModBlocks.DARK_OAK_WOOD_SLAB_S);
                    entries.add(ModBlocks.JUNGLE_WOOD_SLAB);
                    entries.add(ModBlocks.JUNGLE_WOOD_SLAB_S);
                    entries.add(ModBlocks.CHERRY_WOOD_SLAB);
                    entries.add(ModBlocks.CHERRY_WOOD_SLAB_S);
                    entries.add(ModBlocks.SPRUCE_WOOD_SLAB);
                    entries.add(ModBlocks.SPRUCE_WOOD_SLAB_S);
                    entries.add(ModBlocks.MANGROVE_WOOD_SLAB);
                    entries.add(ModBlocks.MANGROVE_WOOD_SLAB_S);
                    entries.add(ModBlocks.ANCIENT_BUTTON);
                    entries.add(ModBlocks.ANCIENT_LOG);
                    entries.add(ModBlocks.STRIPPED_ANCIENT_LOG);
                    entries.add(ModBlocks.STRIPPED_ANCIENT_WOOD);
                    entries.add(ModBlocks.ANCIENT_WOOD);
                    entries.add(ModBlocks.ANCIENT_SLAB);
                    entries.add(ModBlocks.ANCIENT_SAPLING);
                    entries.add(ModBlocks.ANCIENT_FENCE);
                    entries.add(ModBlocks.ANCIENT_FENCE_GATE);
                    entries.add(ModBlocks.ANCIENT_PLANKS);
                    entries.add(ModBlocks.ANCIENT_PRESSUREPLATE);
                    entries.add(ModBlocks.ANCIENT_STAIRS);
                    entries.add(ModBlocks.ANCIENT_TRAPDOOR);
                    entries.add(ModBlocks.ANCIENT_DOOR);
                    entries.add(ModBlocks.ANCIENT_WOOD_WALL_S);
                    entries.add(ModBlocks.ANCIENT_WOOD_WALL);
                    entries.add(ModBlocks.ANCIENT_WOOD_SLAB);
                    entries.add(ModBlocks.ANCIENT_WOOD_SLAB_S);
                    entries.add(ModBlocks.ANCIENT_LEAVES);
                    entries.add(ModBlocks.OLD_BUTTON);
                    entries.add(ModBlocks.OLD_LOG);
                    entries.add(ModBlocks.STRIPPED_OLD_LOG);
                    entries.add(ModBlocks.STRIPPED_OLD_WOOD);
                    entries.add(ModBlocks.OLD_WOOD);
                    entries.add(ModBlocks.OLD_PRESSUREPLATE);
                    entries.add(ModBlocks.OLD_PLANKS);
                    entries.add(ModBlocks.OLD_STAIRS);
                    entries.add(ModBlocks.OLD_SLAB);
                    entries.add(ModBlocks.OLD_WOOD_SLAB);
                    entries.add(ModBlocks.OLD_WOOD_SLAB_S);
                    entries.add(ModBlocks.OLD_WOOD_WALL);
                    entries.add(ModBlocks.OLD_WOOD_WALL_S);
                    entries.add(ModBlocks.OLD_FENCE);
                    entries.add(ModBlocks.OLD_FENCE_GATE);
                    entries.add(ModBlocks.OLD_LEAVES);
                    entries.add(ModBlocks.OLD_SAPLING);
                    entries.add(ModBlocks.OLD_DOOR);
                    entries.add(ModBlocks.OLD_TRAPDOOR);
                    entries.add(ModBlocks.DARK_SPIRAL_BUTTON);
                    entries.add(ModBlocks.DARK_SPIRAL_PRESSUREPLATE);
                    entries.add(ModBlocks.DARK_SPIRAL_DOOR);
                    entries.add(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD);
                    entries.add(ModBlocks.STRIPPED_DARK_SPIRAL_LOG);
                    entries.add(ModBlocks.DARK_SPIRAL_LOG);
                    entries.add(ModBlocks.DARK_SPIRAL_LEAVES);
                    entries.add(ModBlocks.DARK_SPIRAL_SLAB);
                    entries.add(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S);
                    entries.add(ModBlocks.DARK_SPIRAL_WOOD_SLAB);
                    entries.add(ModBlocks.DARK_SPIRAL_WOOD_WALL);
                    entries.add(ModBlocks.DARK_SPIRAL_WOOD_WALL_S);
                    entries.add(ModBlocks.DARK_SPIRAL_STAIRS);
                    entries.add(ModBlocks.DARK_SPIRAL_PLANKS);
                    entries.add(ModBlocks.DARK_SPIRAL_FENCE);
                    entries.add(ModBlocks.DARK_SPIRAL_FENCE_GATE);
                    entries.add(ModBlocks.DARK_SPIRAL_SAPLING);
                    entries.add(ModBlocks.SPIRAL_BUTTON);
                    entries.add(ModBlocks.SPIRAL_DOOR);
                    entries.add(ModBlocks.SPIRAL_TRAPDOOR);
                    entries.add(ModBlocks.SPIRAL_SAPLING);
                    entries.add(ModBlocks.SPIRAL_STAIRS);
                    entries.add(ModBlocks.SPIRAL_SLAB);
                    entries.add(ModBlocks.SPIRAL_PRESSUREPLATE);
                    entries.add(ModBlocks.SPIRAL_WOOD_WALL);
                    entries.add(ModBlocks.SPIRAL_LOG);
                    entries.add(ModBlocks.SPIRAL_LEAVES);
                    entries.add(ModBlocks.STRIPPED_SPIRAL_LOG);
                    entries.add(ModBlocks.STRIPPED_SPIRAL_WOOD);
                    entries.add(ModBlocks.SPIRAL_WOOD);
                    entries.add(ModBlocks.SPIRAL_WOOD_WALL_S);
                    entries.add(ModBlocks.SPIRAL_WOOD_SLAB);
                    entries.add(ModBlocks.SPIRAL_WOOD_SLAB_S);
                    entries.add(ModBlocks.SPIRAL_FENCE);
                    entries.add(ModBlocks.SPIRAL_FENCE_GATE);
                    entries.add(ModBlocks.FANCY_PLANK);
                    entries.add(ModBlocks.FANCY_SLAB);
                    entries.add(ModBlocks.FANCY_STAIRS);
                    entries.add(ModBlocks.FANCY_BUTTON);
                    entries.add(ModBlocks.FANCY_FENCE);
                    entries.add(ModBlocks.FANCY_FENCE_GATE);
                    entries.add(ModBlocks.FANCY_PRESSUREPLATE);
                    entries.add(ModBlocks.FANCY_WALL);
                    entries.add(ModBlocks.GLASS_TRAPDOOR);
                    entries.add(ModBlocks.COBBLESTONE_TRAPDOOR);
                    entries.add(ModBlocks.STONE_TRAPDOOR);
                    entries.add(ModBlocks.OLD_ROSE);
                    entries.add(ModBlocks.TINY_LILLY);
                    entries.add(ModBlocks.ASTROPHYLLIA);
                    }).build());


    //   public static final ItemGroup AGOLDYRP = Registry.register(Registries.ITEM_GROUP,
    //      new Identifier(Goldy_Heart.MOD_ID,"brpitem"),
    //      FabricItemGroup.builder().displayName(Text.translatable("itemgroup.brpitem"))
    //            .icon(() -> new ItemStack(ModItems.COPPERBERRY)).entries((displayContext, entries) -> {
    //            entries.add(ModItems.MANACRYSTAL);
    //            entries.add(ModItems.MANACRYSTAL_2);
    //            entries.add(ModItems.MANACRYSTAL_3);
    //            entries.add(ModItems.WORM);
    //            entries.add(ModItems.WORMBOWL);
    //            entries.add(ModItems.CANOFWORMS);
    //            entries.add(ModItems.LEATHERWHIP);
    //            entries.add(ModItems.MERMAIDTAIL);
    //            entries.add(ModItems.MANA_EMBER);
    //            entries.add(ModItems.MECH_SCREW);
    //            entries.add(ModItems.RODWITHWORM);
    //            entries.add(ModItems.LOOT_1);
    //            entries.add(ModItems.LOOT_2);
    //            entries.add(ModItems.LOOT_3);
    //            entries.add(ModItems.LOOT_4);
    //            entries.add(ModItems.LOOT_5);
    //            entries.add(ModItems.LOOT_6);
    //            entries.add(ModItems.LOOT_7);
    //            entries.add(ModItems.LOOT_8);
    //            entries.add(ModItems.LOOT_9);
    //            entries.add(ModItems.LOOT_10);
    //            entries.add(ModItems.LOOT_11);
    //            entries.add(ModItems.LOOT_12);
    //            entries.add(ModItems.LOOT_13);
    //            entries.add(ModItems.LOOT_14);
    //            entries.add(ModItems.LOOT_15);
    //            entries.add(ModItems.LOOT_16);
    //            entries.add(ModItems.LOOT_17);
    ////            entries.add(ModItems.LOOT_18);
    //          entries.add(ModItems.LOOT_19);
    //            entries.add(ModItems.LOOT_20);
    //            }).build());

    public static final ItemGroup AGOLDYFARMING = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Goldy_Heart.MOD_ID,"aafarming"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aafarming"))
                    .icon(() -> new ItemStack(ModItems.AMETHYSTBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.CUCUMBERSEEDS);
                    entries.add(ModItems.GRAPESEEDS);
                    entries.add(ModItems.TOMATOSEEDS);
                    entries.add(ModItems.LETTUCESEEDS);
                    entries.add(ModItems.ONION);
                    entries.add(ModItems.CHILLISEEDS);
                    entries.add(ModItems.COFFEEBEAN);
                    entries.add(ModItems.PARSLEYSEEDS);
                    entries.add(ModItems.GARLIC);
                    entries.add(ModItems.BELLPEPPERSEEDS);
                    entries.add(ModItems.CORNSEEDS);
                    entries.add(ModItems.RICE);
                    entries.add(ModItems.STRAWBERRY);
                    entries.add(ModItems.BLUEBERRY);
                    entries.add(ModItems.RUHBARBSEEDS);
                    entries.add(ModItems.ANCIENTSEEDS);
                    }).build());

    public static final ItemGroup AGOLDYVOIDSTORAGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Goldy_Heart.MOD_ID,"astori"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astori"))
                    .icon(() -> new ItemStack(ModItems.LAPISBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.VOID);
                    entries.add(ModItems.ROPE);
                    entries.add(ModItems.MAGICCRYSTAL);
                    entries.add(ModItems.MAGICCRYSTAL_2);
                    entries.add(ModItems.MAGICCRYSTAL_3);
                    entries.add(ModItems.MAGICCRYSTAL_4);
                    entries.add(ModItems.MAGICCRYSTAL_5);
                    entries.add(ModItems.MAGICCRYSTAL_6);
                    entries.add(ModItems.MAGICCRYSTAL_7);
                    entries.add(ModItems.MAGICCRYSTAL_8);
                        // entries.add(ModItems.BEASTMANFUR);
                        // entries.add(ModItems.VAMPIREWING);
                        // entries.add(ModItems.DRAGONSCALE);
                    entries.add(ModItems.STONE_KNIFE);
                    entries.add(ModItems.IRON_KNIFE);
                    entries.add(ModItems.GOLD_KNIFE);
                    entries.add(ModItems.DIAMOND_KNIFE);
                    entries.add(ModItems.NETHERITE_KNIFE);
                    entries.add(ModItems.BLACKSMITHPICKSIGLWOOD);
                    entries.add(ModItems.BLACKSMITHAXESIGLWOOD);
                    entries.add(ModItems.BLACKSMITHHOESIGLWOOD);
                    entries.add(ModItems.BLACKSMITHSHOVELSIGLWOOD);
                    entries.add(ModItems.BLACKSMITHSWORDSIGLWOOD);
                    entries.add(ModItems.BIGBOWL);
                    }).build());

    public static void registerItemGroups() {
        Goldy_Heart.LOGGER.info("Loading Item Tabs of "+Goldy_Heart.MOD_ID);
    }
}
