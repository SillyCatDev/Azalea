package net.thatnoob.azaleawood.util;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.thatnoob.azaleawood.AzaleaWood;
import net.thatnoob.azaleawood.block.ModBlocks;
import net.thatnoob.azaleawood.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBoatTypes {
    public static final TerraformBoatType AZALEA_BOAT_TYPE = new TerraformBoatType.Builder()
                    .item(ModItems.AZALEA_BOAT).chestItem(ModItems.AZALEA_CHEST_BOAT).planks(ModBlocks.AZALEA_PLANKS.asItem())
                    .build();

    static {
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, new Identifier(AzaleaWood.MOD_ID, "azalea"), AZALEA_BOAT_TYPE);
    }

    public static void registerModBoatTypes() {
        AzaleaWood.LOGGER.info("Registering Mod Boat Types for " + AzaleaWood.MOD_ID);
    }
}
