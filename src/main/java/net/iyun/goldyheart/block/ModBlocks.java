package net.iyun.goldyheart.block;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.block.custom.*;
import net.iyun.goldyheart.world.feature.tree.*;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Blocks that will render but not obtainable in the Creative Inv

public static final Block ANCIENT_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "ancient_crop"),
        new AncientCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block HOP_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "hops_crop"),
        new HopsCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block STRAWBER_BUSH = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "strawber_bush"),
        new StrawberBushBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

public static final Block BLUEBER_BUSH = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "blueber_bush"),
        new BlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

public static final Block RUHBARB_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "rhubarb_crop"),
        new RuhbarbCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "tomato_crop"),
        new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block CHILLI_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "chilli_crop"),
        new ChilliCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block COFFEE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "coffee_crop"),
        new CoffeeCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block CORN_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "corn_crop"),
        new CornCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block CUCUMBER_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "cucumber_crop"),
        new CucumberCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block GRAPE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "grape_crop"),
        new GrapeCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block LETTUCE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "lettuce_crop"),
        new LettuceCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block PARSLEY_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "parsley_crop"),
        new ParsleyCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block ONION_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "onion_crop"),
        new OnionCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block RICE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "rice_crop"),
        new RiceCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block GARLIC_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "garlic_crop"),
        new GarlicCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block BELLPEPPER_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "bellpepper_crop"),
        new BellCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));


//Blocks Texture Render Workaround

public static final Block GLASS_TRAPDOOR = registerBlock("glass_trapdoor",
        new TrapdoorBlock(BlockSetType.POLISHED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE)));

public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor",
        new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE)));

public static final Block COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor",
        new TrapdoorBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE)));

public static final Block MANGROVE_WOOD_ALLSIDE = registerBlock("mangrove_wood_a",
        new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block MANGROVE_WOOD_ALLSIDE_S = registerBlock("mangrove_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block MANGROVE_WOOD_SLAB_S = registerBlock("mangrove_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block ACA_WOOD_ALLSIDE = registerBlock("acacia_wood_a",
        new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block ACA_WOOD_ALLSIDE_S = registerBlock("acacia_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block ACA_WOOD_SLAB = registerBlock("acacia_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block ACA_WOOD_SLAB_S = registerBlock("acacia_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block SPRUCE_WOOD_ALLSIDE = registerBlock("spruce_wood_a",
        new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block SPRUCE_WOOD_ALLSIDE_S = registerBlock("spruce_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block SPRUCE_WOOD_SLAB_S = registerBlock("spruce_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block JUNGLE_WOOD_ALLSIDE = registerBlock("jungle_wood_a",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block JUNGLE_WOOD_ALLSIDE_S = registerBlock("jungle_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block JUNGLE_WOOD_SLAB_S = registerBlock("jungle_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block CHERRY_WOOD_ALLSIDE = registerBlock("cherry_wood_a",
        new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block CHERRY_WOOD_ALLSIDE_S = registerBlock("cherry_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block CHERRY_WOOD_SLAB_S = registerBlock("cherry_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block DARK_OAK_WOOD_ALLSIDE = registerBlock("dark_oak_wood_a",
        new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block DARK_OAK_WOOD_ALLSIDE_S = registerBlock("dark_oak_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block DARK_OAK_WOOD_SLAB_S = registerBlock("dark_oak_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block OAK_WOOD_ALLSIDE = registerBlock("oak_wood_a",
        new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block OAK_WOOD_ALLSIDE_S = registerBlock("oak_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block OAK_WOOD_SLAB = registerBlock("oak_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block OAK_WOOD_SLAB_S = registerBlock("oak_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block BIRCH_WOOD_ALLSIDE = registerBlock("birch_wood_a",
        new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block BIRCH_WOOD_ALLSIDE_S = registerBlock("birch_wood_as",
        new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block BIRCH_WOOD_SLAB_S = registerBlock("birch_slab_s",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block DIRT_SLAB = registerBlock("dirt_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT).sounds(BlockSoundGroup.GRAVEL)));

public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE).sounds(BlockSoundGroup.CALCITE)));

public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
        new StairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));

public static final Block GOLD_SLAB = registerBlock("gold_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).sounds(BlockSoundGroup.METAL)));

public static final Block IRON_SLAB = registerBlock("iron_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));

public static final Block IRON_STAIRS = registerBlock("iron_stairs",
        new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

public static final Block GOLD_STAIRS = registerBlock("gold_stairs",
        new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

public static final Block DEAD_BUBBLE_CORAL_STAIRS = registerBlock("dead_bubble_coral_stairs",
        new StairsBlock(Blocks.DEAD_BUBBLE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));

public static final Block DEAD_BUBBLE_CORAL_SLAB = registerBlock("dead_bubble_coral_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK).sounds(BlockSoundGroup.CORAL)));

public static final Block DEAD_FIRE_CORAL_SLAB = registerBlock("dead_fire_coral_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK).sounds(BlockSoundGroup.CORAL)));

public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

public static final Block TUFF_SLAB = registerBlock("tuff_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.TUFF).sounds(BlockSoundGroup.TUFF)));

public static final Block TUFF_BUTTON = registerBlock("tuff_button",
    new ButtonBlock(BlockSetType.STONE, 12, AbstractBlock.Settings.copy(Blocks.TUFF).noCollision()));

public static final Block TUFF_WALL = registerBlock("tuff_wall",
        new WallBlock(AbstractBlock.Settings.copy(Blocks.TUFF).sounds(BlockSoundGroup.TUFF)));

public static final Block SOUL_SAND_SLAB = registerBlock("soul_sand_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SAND).sounds(BlockSoundGroup.SOUL_SAND)));

public static final Block SOUL_SOIL_SLAB = registerBlock("soul_soil_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL).sounds(BlockSoundGroup.SOUL_SOIL)));

public static final Block TUFF_STAIRS = registerBlock("tuff_stairs",
        new StairsBlock(Blocks.TUFF.getDefaultState(),AbstractBlock.Settings.copy(Blocks.TUFF)));

public static final Block COPPER_STAIRS = registerBlock("copper_stairs",
        new StairsBlock(Blocks.COPPER_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));

public static final Block COPPER_SLAB = registerBlock("copper_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.COPPER)));

public static final Block OXIDIZED_COPPER_STAIRS = registerBlock("oxidized_copper_stairs",
        new StairsBlock(Blocks.OXIDIZED_COPPER.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));

public static final Block OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER).sounds(BlockSoundGroup.COPPER)));

public static final Block WEATHERED_COPPER_STAIRS = registerBlock("weathered_copper_stairs",
        new StairsBlock(Blocks.WEATHERED_COPPER.getDefaultState(),AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));

public static final Block WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER).sounds(BlockSoundGroup.COPPER)));

public static final Block EXPOSED_COPPER_STAIRS = registerBlock("exposed_copper_stairs",
        new StairsBlock(Blocks.EXPOSED_COPPER.getDefaultState(),AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));

public static final Block EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER).sounds(BlockSoundGroup.COPPER)));

public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
        new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));

public static final Block DEAD_HORN_CORAL_STAIRS = registerBlock("dead_horn_coral_stairs",
        new StairsBlock(Blocks.DEAD_HORN_CORAL_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));

public static final Block DEAD_FIRE_CORAL_STAIRS = registerBlock("dead_fire_coral_stairs",
        new StairsBlock(Blocks.DEAD_FIRE_CORAL_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));

public static final Block DEAD_HORN_CORAL_SLAB = registerBlock("dead_horn_coral_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK).sounds(BlockSoundGroup.CORAL)));

public static final Block DEAD_TUBE_CORAL_SLAB = registerBlock("dead_tube_coral_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK).sounds(BlockSoundGroup.CORAL)));

public static final Block DEAD_BRAIN_CORAL_SLAB = registerBlock("dead_brain_coral_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK).sounds(BlockSoundGroup.CORAL)));

public static final Block DEAD_BRAIN_CORAL_STAIRS = registerBlock("dead_brain_coral_stairs",
        new StairsBlock(Blocks.DEAD_BRAIN_CORAL_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));

public static final Block DEAD_TUBE_CORAL_STAIRS = registerBlock("dead_tube_coral_stairs",
        new StairsBlock(Blocks.DEAD_TUBE_CORAL_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));

public static final Block COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).sounds(BlockSoundGroup.GRAVEL)));

public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN).sounds(BlockSoundGroup.STONE)));

public static final Block ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT).sounds(BlockSoundGroup.ROOTED_DIRT)));

public static final Block SAND_SLAB = registerBlock("sand_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.SAND).sounds(BlockSoundGroup.SAND)));

public static final Block RED_SAND_SLAB = registerBlock("red_sand_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SAND).sounds(BlockSoundGroup.SAND)));

public static final Block SAND_STAIR = registerBlock("sand_stairs",
            new StairsBlock(Blocks.SAND.getDefaultState(),AbstractBlock.Settings.copy(Blocks.SAND)));

public static final Block RED_SAND_STAIR = registerBlock("red_sand_stairs",
            new StairsBlock(Blocks.RED_SAND.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_SAND)));

public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

public static final Block MOSS_SLAB = registerBlock("moss_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK).sounds(BlockSoundGroup.MOSS_BLOCK)));

public static final Block GRAVEL_SLAB = registerBlock("gravel_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).sounds(BlockSoundGroup.GRAVEL)));

public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT).sounds(BlockSoundGroup.BASALT)));

public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));

public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE).sounds(BlockSoundGroup.GLASS).slipperiness(1).nonOpaque()));

public static final Block OVERGROWN_GRASS = registerBlock("overgrown_grass",
            new Block(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.GRASS)));

public static final Block GRASS_SLAB = registerBlock("overgrown_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.GRASS)));

// wood blocks
public static final Block WEATHERED_LOG = registerBlock("bog_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

public static final Block WEATHERED_WOOD = registerBlock("bog_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block WEATHERED_PLANKS = registerBlock("bog_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block WEATHERED_LEAVES = registerBlock("bog_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque()));

public static final Block STRIPPED_WEATHERED_LOG = registerBlock("stripped_bog_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

public static final Block STRIPPED_WEATHERED_WOOD = registerBlock("stripped_bog_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block WEATHERED_PLANK_STAIRS = registerBlock("bog_stairs",
            new StairsBlock(ModBlocks.WEATHERED_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block WEATHERED_PLANK_SLABS = registerBlock("bog_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

public static final Block WEATHERED_SAPLING = registerBlock("bog_sapling",
        new SaplingBlock(WeatheredSaplingGenerator.WEATH_T, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision()));

public static final Block OLD_LOG = registerBlock("old_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

public static final Block OLD_WOOD = registerBlock("old_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

public static final Block STRIPPED_OLD_LOG = registerBlock("stripped_old_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

public static final Block STRIPPED_OLD_WOOD = registerBlock("stripped_old_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

public static final Block OLD_SAPLING = registerBlock("old_sapling",
        new SaplingBlock(OldSaplingGenerator.OLD_T, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision()));

public static final Block OLD_LEAVES = registerBlock("old_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque()));

public static final Block OLD_PLANKS = registerBlock("old_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block OLD_WOOD_ALLSIDE = registerBlock("old_wood_a",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block OLD_WOOD_WALL = registerBlock("old_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block OLD_WOOD_WALL_S = registerBlock("stripped_old_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block OLD_WOOD_ALLSIDE_S = registerBlock("old_wood_as",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block OLD_WOOD_SLAB = registerBlock("old_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block OLD_WOOD_SLAB_S = registerBlock("stripped_old_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block OLD_BUTTON = registerBlock("old_button",
            new ButtonBlock(BlockSetType.OAK, 12, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));

public static final Block OLD_PRESSUREPLATE = registerBlock("old_pressureplate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

public static final Block OLD_FENCE = registerBlock("old_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

public static final Block OLD_FENCE_GATE = registerBlock("old_fence_gate",
      new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

public static final Block OLD_DOOR = registerBlock("old_door",
          new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

public static final Block OLD_TRAPDOOR = registerBlock("old_trapdoor",
          new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque()));

public static final Block OLD_STAIRS =registerBlock("old_stairs",
            new StairsBlock(ModBlocks.OLD_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

public static final Block OLD_SLAB = registerBlock("old_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block SPIRAL_LOG = registerBlock("spiral_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));

public static final Block SPIRAL_WOOD = registerBlock("spiral_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block STRIPPED_SPIRAL_LOG = registerBlock("stripped_spiral_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block STRIPPED_SPIRAL_WOOD = registerBlock("stripped_spiral_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block SPIRAL_SAPLING = registerBlock("spiral_sapling",
        new SaplingBlock(SpiralSaplingGenerator.SPIR_T, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision()));

public static final Block SPIRAL_LEAVES = registerBlock("spiral_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque()));

public static final Block SPIRAL_PLANKS = registerBlock("spiral_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block SPIRAL_WOOD_ALLSIDE = registerBlock("spiral_wood_a",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block SPIRAL_WOOD_WALL = registerBlock("spiral_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block SPIRAL_WOOD_WALL_S = registerBlock("stripped_spiral_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block SPIRAL_WOOD_ALLSIDE_S = registerBlock("spiral_wood_as",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block SPIRAL_WOOD_SLAB = registerBlock("spiral_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block SPIRAL_WOOD_SLAB_S = registerBlock("stripped_spiral_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block SPIRAL_BUTTON = registerBlock("spiral_button",
         new ButtonBlock(BlockSetType.OAK, 12, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));

public static final Block SPIRAL_PRESSUREPLATE = registerBlock("spiral_pressureplate",
          new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

public static final Block SPIRAL_FENCE = registerBlock("spiral_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

public static final Block SPIRAL_FENCE_GATE = registerBlock("spiral_fence_gate",
          new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

public static final Block SPIRAL_DOOR = registerBlock("spiral_door",
          new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.MANGROVE_DOOR).nonOpaque()));

public static final Block SPIRAL_TRAPDOOR = registerBlock("spiral_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.MANGROVE_TRAPDOOR).nonOpaque()));

public static final Block SPIRAL_STAIRS =registerBlock("spiral_stairs",
            new StairsBlock(ModBlocks.SPIRAL_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

public static final Block SPIRAL_SLAB = registerBlock("spiral_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD)));

public static final Block DARK_SPIRAL_LOG = registerBlock("dark_spiral_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block DARK_SPIRAL_WOOD = registerBlock("dark_spiral_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block STRIPPED_DARK_SPIRAL_LOG = registerBlock("stripped_dark_spiral_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block STRIPPED_DARK_SPIRAL_WOOD = registerBlock("stripped_dark_spiral_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block DARK_SPIRAL_SAPLING = registerBlock("dark_spiral_sapling",
        new SaplingBlock(DarkSpiralSaplingGenerator.DSPIR_T, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision()));

public static final Block DARK_SPIRAL_LEAVES = registerBlock("dark_spiral_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque()));

public static final Block DARK_SPIRAL_PLANKS = registerBlock("dark_spiral_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block DARK_SPIRAL_WOOD_ALLSIDE = registerBlock("dark_spiral_wood_a",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block DARK_SPIRAL_WOOD_WALL = registerBlock("dark_spiral_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block DARK_SPIRAL_WOOD_WALL_S = registerBlock("stripped_dark_spiral_wood_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block DARK_SPIRAL_WOOD_ALLSIDE_S = registerBlock("dark_spiral_wood_as",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block DARK_SPIRAL_WOOD_SLAB = registerBlock("dark_spiral_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block DARK_SPIRAL_WOOD_SLAB_S = registerBlock("stripped_dark_spiral_wood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block DARK_SPIRAL_BUTTON = registerBlock("dark_spiral_button",
   new ButtonBlock(BlockSetType.OAK, 12, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));

public static final Block DARK_SPIRAL_PRESSUREPLATE = registerBlock("dark_spiral_pressureplate",
         new PressurePlateBlock(BlockSetType.OAK,AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

public static final Block DARK_SPIRAL_FENCE = registerBlock("dark_spiral_fence",
        new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

public static final Block DARK_SPIRAL_FENCE_GATE = registerBlock("dark_spiral_fence_gate",
        new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

public static final Block DARK_SPIRAL_DOOR = registerBlock("dark_spiral_door",
     new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

public static final Block DARK_SPIRAL_TRAPDOOR = registerBlock("dark_spiral_trapdoor",
        new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

public static final Block DARK_SPIRAL_STAIRS =registerBlock("dark_spiral_stairs",
        new StairsBlock(ModBlocks.DARK_SPIRAL_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

public static final Block DARK_SPIRAL_SLAB = registerBlock("dark_spiral_slab",
        new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD)));

public static final Block ANCIENT_LOG = registerBlock("ancient_log",
         new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block ANCIENT_WOOD = registerBlock("ancient_wood",
         new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block STRIPPED_ANCIENT_LOG = registerBlock("stripped_ancient_log",
         new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block STRIPPED_ANCIENT_WOOD = registerBlock("stripped_ancient_wood",
         new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block ANCIENT_SAPLING = registerBlock("ancient_sapling",
        new SaplingBlock(AncientSaplingGenerator.ANCIENT_T, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).noCollision()));

public static final Block ANCIENT_LEAVES = registerBlock("ancient_leaves",
         new LeavesBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque()));

public static final Block ANCIENT_PLANKS = registerBlock("ancient_planks",
         new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block ANCIENT_WOOD_ALLSIDE = registerBlock("ancient_wood_a",
         new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block ANCIENT_WOOD_WALL = registerBlock("ancient_wood_wall",
         new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block ANCIENT_WOOD_WALL_S = registerBlock("stripped_ancient_wood_wall",
         new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block ANCIENT_WOOD_ALLSIDE_S = registerBlock("ancient_wood_as",
         new Block(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

public static final Block ANCIENT_WOOD_SLAB = registerBlock("ancient_wood_slab",
         new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block ANCIENT_WOOD_SLAB_S = registerBlock("stripped_ancient_wood_slab",
         new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD)));

public static final Block ANCIENT_BUTTON = registerBlock("ancient_button",
         new ButtonBlock(BlockSetType.OAK, 12, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));

public static final Block ANCIENT_PRESSUREPLATE = registerBlock("ancient_pressureplate",
         new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

public static final Block ANCIENT_FENCE = registerBlock("ancient_fence",
         new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

public static final Block ANCIENT_FENCE_GATE = registerBlock("ancient_fence_gate",
        new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

public static final Block ANCIENT_DOOR = registerBlock("ancient_door",
         new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

public static final Block ANCIENT_TRAPDOOR = registerBlock("ancient_trapdoor",
         new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));

public static final Block ANCIENT_STAIRS =registerBlock("ancient_stairs",
         new StairsBlock(ModBlocks.ANCIENT_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

public static final Block ANCIENT_SLAB = registerBlock("ancient_slab",
         new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD)));

public static final Block FANCY_PLANK = registerBlock("fancy_plank",
         new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block FANCY_SLAB = registerBlock("fancy_slab",
         new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));

public static final Block FANCY_STAIRS = registerBlock("fancy_stair",
         new StairsBlock(ModBlocks.FANCY_PLANK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

public static final Block FANCY_FENCE = registerBlock("fancy_fence",
         new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

public static final Block FANCY_FENCE_GATE = registerBlock("fancy_fence_gate",
        new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

public static final Block FANCY_WALL = registerBlock("fancy_wall",
         new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

public static final Block FANCY_BUTTON = registerBlock("fancy_button",
         new ButtonBlock(BlockSetType.OAK, 18, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).noCollision()));

public static final Block FANCY_PRESSUREPLATE = registerBlock("fancy_pressureplate",
     new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

public static final Block OLD_ROSE = registerBlock("old_rose",
        new FlowerBlock(StatusEffects.HEALTH_BOOST, 10, AbstractBlock.Settings.copy(Blocks.DANDELION).nonOpaque().noCollision()));

public static final Block POTTED_OLD_ROSE = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "potted_old_rose"),
        new FlowerPotBlock(OLD_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION).nonOpaque()));

public static final Block TINY_LILLY = registerBlock("tiny_lilly",
        new FlowerBlock(StatusEffects.HASTE, 10,AbstractBlock.Settings.copy(Blocks.DANDELION).nonOpaque().noCollision()));

public static final Block POTTED_TINY_LILLY = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "potted_tiny_lilly"),
        new FlowerPotBlock(TINY_LILLY, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION).nonOpaque()));

public static final Block ASTROPHYLLIA = registerBlock("astrophyllia",
        new FlowerBlock(StatusEffects.MINING_FATIGUE, 10, AbstractBlock.Settings.copy(Blocks.DANDELION).nonOpaque().noCollision()));

public static final Block POTTED_ASTROPHYLLIA = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "potted_astrophyllia"),
        new FlowerPotBlock(ASTROPHYLLIA,AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION).nonOpaque()));


// moved to different project w vertical slabs


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
         Registry.register(Registries.ITEM, Identifier.of(Goldy_Heart.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Goldy_Heart.LOGGER.info("Adding cool blocks from " + Goldy_Heart.MOD_ID);
    }
}
