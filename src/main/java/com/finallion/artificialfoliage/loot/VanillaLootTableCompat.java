package com.finallion.artificialfoliage.loot;

import com.finallion.artificialfoliage.registry.ARFOItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class VanillaLootTableCompat {
    public static final Identifier TALL_GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/tall_grass");

    public static void init() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (TALL_GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.125F).build())
                        .with(ItemEntry.builder(ARFOItems.JUNGLE_DYE))
                        .with(ItemEntry.builder(ARFOItems.JUNGLE_EDGE_DYE))
                        .with(ItemEntry.builder(ARFOItems.SAVANNA_DYE))
                        .with(ItemEntry.builder(ARFOItems.BADLANDS_DYE))
                        .with(ItemEntry.builder(ARFOItems.FOREST_DYE))
                        .with(ItemEntry.builder(ARFOItems.BIRCH_FOREST_DYE))
                        .with(ItemEntry.builder(ARFOItems.DARK_FOREST_DYE))
                        .with(ItemEntry.builder(ARFOItems.PLAINS_DYE))
                        .with(ItemEntry.builder(ARFOItems.SWAMP_DYE))
                        .with(ItemEntry.builder(ARFOItems.LUSH_SWAMP_DYE))
                        .with(ItemEntry.builder(ARFOItems.MOUNTAINS_DYE))
                        .with(ItemEntry.builder(ARFOItems.MUSHROOM_FIELDS_DYE))
                        .with(ItemEntry.builder(ARFOItems.TAIGA_DYE))
                        .with(ItemEntry.builder(ARFOItems.MEGA_TAIGA_DYE))
                        .with(ItemEntry.builder(ARFOItems.SNOWY_DYE))
                        .with(ItemEntry.builder(ARFOItems.SNOWY_BEACH_DYE))
                        .with(ItemEntry.builder(ARFOItems.WATERS_DYE));

                supplier.withPool(poolBuilder.build());
            }
        });
    }


}
