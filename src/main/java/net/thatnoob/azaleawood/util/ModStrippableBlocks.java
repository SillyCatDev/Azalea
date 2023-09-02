package net.thatnoob.azaleawood.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.thatnoob.azaleawood.block.ModBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.AZALEA_LOG, ModBlocks.STRIPPED_AZALEA_LOG);
        StrippableBlockRegistry.register(ModBlocks.AZALEA_WOOD, ModBlocks.STRIPPED_AZALEA_WOOD);
    }
}
