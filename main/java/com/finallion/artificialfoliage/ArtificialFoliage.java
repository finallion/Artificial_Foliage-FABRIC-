package com.finallion.artificialfoliage;

import com.finallion.artificialfoliage.compatibilty.ModCompat;
import com.finallion.artificialfoliage.loot.VanillaLootTableCompat;
import com.finallion.artificialfoliage.registry.ARFOItemTags;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import com.finallion.artificialfoliage.registry.ARFOFluids;
import com.finallion.artificialfoliage.registry.ARFOItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;


public class ArtificialFoliage implements ModInitializer {
    // fog water
    // cauldron
    // overlay water
    // colored flower pots
    // flowering leaves, grass
    // flowering lily pad
    // glowberry bush
    // spruce and birch leave carpets


    public static final String MOD_ID = "arfo";

    @Override
    public void onInitialize() {
        ARFOItems.registerItems();
        ARFOBlocks.registerBlocks();
        ARFOFluids.registerFluids();
        VanillaLootTableCompat.init();
        ARFOItemTags.init();

        // mod compat = blocks, fluids, items
        ModCompat.init();





    }

    public static ItemGroup ADVANCED = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "advanced"))
            .icon(() -> new ItemStack(ARFOItems.MUSHROOM_FIELDS_DYE)).build();


}
