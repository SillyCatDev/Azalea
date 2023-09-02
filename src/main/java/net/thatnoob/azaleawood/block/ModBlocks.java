package net.thatnoob.azaleawood.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.thatnoob.azaleawood.AzaleaWood;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlocks {
    public static final BlockSetType AZALEA = new BlockSetType("azalea");
    public static final Block AZALEA_BUTTON = registerBlock("azalea_button",
            new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), AZALEA, 30, true));
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock("azalea_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_GRAY), AZALEA));

    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.TERRACOTTA_GRAY),
                    AZALEA));
    public static final Block AZALEA_DOOR = registerBlock("azalea_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR).mapColor(MapColor.TERRACOTTA_GRAY), AZALEA));

    public static final WoodType AZALEA_TYPE = new WoodType("azalea", AZALEA);
    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.TERRACOTTA_GRAY),
                    AZALEA_TYPE));
    public static final Block AZALEA_FENCE = registerBlock("azalea_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).mapColor(MapColor.TERRACOTTA_GRAY)));

    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_SLAB = registerBlock("azalea_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs",
            new StairsBlock(AZALEA_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).mapColor((state) -> {
                return state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_GRAY :
                        MapColor.RAW_IRON_PINK;})));

    public static final TerraformSignBlock AZALEA_SIGN = registerSignBlock("azalea_sign", new TerraformSignBlock(
            new Identifier(AzaleaWood.MOD_ID, "entity/signs/azalea"),
            FabricBlockSettings.copyOf(Blocks.OAK_SIGN).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final TerraformWallSignBlock AZALEA_WALL_SIGN = registerWallSignBlock("azalea_wall_sign",
            new TerraformWallSignBlock(new Identifier(AzaleaWood.MOD_ID, "entity/signs/azalea"),
            FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).dropsLike(AZALEA_SIGN)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final TerraformHangingSignBlock AZALEA_HANGING_SIGN = registerHangingSignBlock(
            "azalea_hanging_sign", new TerraformHangingSignBlock(
            new Identifier(AzaleaWood.MOD_ID, "entity/signs/hanging/azalea"),
            new Identifier(AzaleaWood.MOD_ID, "textures/gui/hanging_signs/azalea"),
            FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final TerraformWallHangingSignBlock AZALEA_WALL_HANGING_SIGN = registerWallHangingSignBlock(
            "azalea_wall_hanging_sign", new TerraformWallHangingSignBlock(
            new Identifier(AzaleaWood.MOD_ID, "entity/signs/hanging/azalea"),
            new Identifier(AzaleaWood.MOD_ID, "textures/gui/hanging_signs/azalea"),
            FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(AZALEA_HANGING_SIGN)
                    .mapColor(MapColor.TERRACOTTA_GRAY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AzaleaWood.MOD_ID, name), block);
    }

    private static TerraformSignBlock registerSignBlock(String name, TerraformSignBlock block) {
        return Registry.register(Registries.BLOCK, new Identifier(AzaleaWood.MOD_ID, name), block);
    }

    private static TerraformWallSignBlock registerWallSignBlock(String name, TerraformWallSignBlock block) {
        return Registry.register(Registries.BLOCK, new Identifier(AzaleaWood.MOD_ID, name), block);
    }

    private static TerraformHangingSignBlock registerHangingSignBlock(String name, TerraformHangingSignBlock block) {
        return Registry.register(Registries.BLOCK, new Identifier(AzaleaWood.MOD_ID, name), block);
    }

    private static TerraformWallHangingSignBlock registerWallHangingSignBlock(String name,
                                                                              TerraformWallHangingSignBlock block) {
        return Registry.register(Registries.BLOCK, new Identifier(AzaleaWood.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(AzaleaWood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

        return item;
    }

    public static void registerModBlocks() {
        AzaleaWood.LOGGER.debug("Registering ModBlocks for " + AzaleaWood.MOD_ID);
    }
}
