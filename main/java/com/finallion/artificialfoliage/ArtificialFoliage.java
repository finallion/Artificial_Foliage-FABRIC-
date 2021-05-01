package com.finallion.artificialfoliage;

import com.finallion.artificialfoliage.item.ARFOGrassSeedItem;
import com.finallion.artificialfoliage.registry.ModBlocks;
import com.finallion.artificialfoliage.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.item.*;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

// potted plants
// check GrassBlock grow



public class ArtificialFoliage implements ModInitializer {

    public static final String MOD_ID = "arfo";
    private static final Identifier TALL_GRASS_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/tall_grass");

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (TALL_GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.125F).build())
                        .with(ItemEntry.builder(ModItems.JUNGLE_DYE))
                        .with(ItemEntry.builder(ModItems.JUNGLE_EDGE_DYE))
                        .with(ItemEntry.builder(ModItems.SAVANNA_DYE))
                        .with(ItemEntry.builder(ModItems.BADLANDS_DYE))
                        .with(ItemEntry.builder(ModItems.FOREST_DYE))
                        .with(ItemEntry.builder(ModItems.BIRCH_FOREST_DYE))
                        .with(ItemEntry.builder(ModItems.DARK_FOREST_DYE))
                        .with(ItemEntry.builder(ModItems.PLAINS_DYE))
                        .with(ItemEntry.builder(ModItems.SWAMP_DYE))
                        .with(ItemEntry.builder(ModItems.LUSH_SWAMP_DYE))
                        .with(ItemEntry.builder(ModItems.MOUNTAINS_DYE))
                        .with(ItemEntry.builder(ModItems.MUSHROOM_FIELDS_DYE))
                        .with(ItemEntry.builder(ModItems.TAIGA_DYE))
                        .with(ItemEntry.builder(ModItems.MEGA_TAIGA_DYE))
                        .with(ItemEntry.builder(ModItems.SNOWY_DYE))
                        .with(ItemEntry.builder(ModItems.SNOWY_BEACH_DYE))
                        .with(ItemEntry.builder(ModItems.WATERS_DYE));

                supplier.withPool(poolBuilder.build());
            }
        });

        DispenserBlock.registerBehavior(ModItems.GRASS_SEED, new FallibleItemDispenserBehavior() {
            protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
                this.setSuccess(true);
                World world = pointer.getWorld();
                BlockPos blockPos = pointer.getBlockPos().offset((Direction)pointer.getBlockState().get(DispenserBlock.FACING));
                if (!ARFOGrassSeedItem.useOnArtificialGrass(stack, world, blockPos)) {
                    this.setSuccess(false);
                } else if (!world.isClient) {
                    world.syncWorldEvent(2005, blockPos, 0);
                }

                return stack;
            }
        });
    }

    public static ItemGroup ADVANCED = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "advanced"))
            .icon(() -> new ItemStack(ModItems.GRASS_SEED))
            .appendItems(itemStacks -> {

                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_DYE));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_MUSHROOM_FIELDS_FERN));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_MUSHROOM_FIELDS_GRASS));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.MUSHROOM_FIELDS_VINE));

                itemStacks.add(new ItemStack(ModItems.JUNGLE_DYE));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_JUNGLE_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_JUNGLE_FERN));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_JUNGLE_GRASS));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_VINE));

                itemStacks.add(new ItemStack(ModItems.JUNGLE_EDGE_DYE));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_EDGE_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_EDGE_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_JUNGLE_EDGE_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TROPICAL_EDGE_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_EDGE_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_JUNGLE_EDGE_FERN));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_EDGE_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_JUNGLE_EDGE_GRASS));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_EDGE_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.JUNGLE_EDGE_VINE));

                itemStacks.add(new ItemStack(ModItems.PLAINS_DYE));
                itemStacks.add(new ItemStack(ModItems.PLAINS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.PLAINS_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_PLAINS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.PLAINS_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.PLAINS_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.PLAINS_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.PLAINS_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.PLAINS_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.PLAINS_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.PLAINS_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.PLAINS_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.PLAINS_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_PLAINS_FERN));
                itemStacks.add(new ItemStack(ModItems.PLAINS_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_PLAINS_GRASS));
                itemStacks.add(new ItemStack(ModItems.PLAINS_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.PLAINS_VINE));

                itemStacks.add(new ItemStack(ModItems.FOREST_DYE));
                itemStacks.add(new ItemStack(ModItems.FOREST_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.FOREST_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_FOREST_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.FOREST_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.FOREST_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.FOREST_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.FOREST_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.FOREST_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.FOREST_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.FOREST_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.FOREST_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.FOREST_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_FOREST_FERN));
                itemStacks.add(new ItemStack(ModItems.FOREST_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_FOREST_GRASS));
                itemStacks.add(new ItemStack(ModItems.FOREST_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.FOREST_VINE));

                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_DYE));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_BIRCH_FOREST_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_BIRCH_FOREST_FERN));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_BIRCH_FOREST_GRASS));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.BIRCH_FOREST_VINE));

                itemStacks.add(new ItemStack(ModItems.WATERS_DYE));
                itemStacks.add(new ItemStack(ModItems.WATERS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.WATERS_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_WATERS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.WATERS_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.WATERS_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.WATERS_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.WATERS_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.WATERS_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.WATERS_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.WATERS_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.WATERS_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.WATERS_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_WATERS_FERN));
                itemStacks.add(new ItemStack(ModItems.WATERS_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_WATERS_GRASS));
                itemStacks.add(new ItemStack(ModItems.WATERS_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.WATERS_VINE));

                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_DYE));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_MEGA_TAIGA_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_MEGA_TAIGA_FERN));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_MEGA_TAIGA_GRASS));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.MEGA_TAIGA_VINE));

                itemStacks.add(new ItemStack(ModItems.TAIGA_DYE));
                itemStacks.add(new ItemStack(ModItems.TAIGA_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.TAIGA_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_TAIGA_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.TAIGA_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TAIGA_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TAIGA_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TAIGA_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TAIGA_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TAIGA_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TAIGA_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.TAIGA_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.TAIGA_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_TAIGA_FERN));
                itemStacks.add(new ItemStack(ModItems.TAIGA_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_TAIGA_GRASS));
                itemStacks.add(new ItemStack(ModItems.TAIGA_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.TAIGA_VINE));

                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_DYE));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_MOUNTAINS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_MOUNTAINS_FERN));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_MOUNTAINS_GRASS));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.MOUNTAINS_VINE));

                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_DYE));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_SNOWY_BEACH_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_SNOWY_BEACH_FERN));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_SNOWY_BEACH_GRASS));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.SNOWY_BEACH_VINE));

                itemStacks.add(new ItemStack(ModItems.SNOWY_DYE));
                itemStacks.add(new ItemStack(ModItems.SNOWY_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SNOWY_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_SNOWY_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SNOWY_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SNOWY_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SNOWY_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_SNOWY_FERN));
                itemStacks.add(new ItemStack(ModItems.SNOWY_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_SNOWY_GRASS));
                itemStacks.add(new ItemStack(ModItems.SNOWY_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.SNOWY_VINE));

                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_DYE));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_DARK_FOREST_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_DARK_FOREST_FERN));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_DARK_FOREST_GRASS));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.DARK_FOREST_VINE));

                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_DYE));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_LUSH_SWAMP_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_LUSH_SWAMP_FERN));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_LUSH_SWAMP_GRASS));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.LUSH_SWAMP_VINE));

                itemStacks.add(new ItemStack(ModItems.SWAMP_DYE));
                itemStacks.add(new ItemStack(ModItems.SWAMP_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SWAMP_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_SWAMP_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SWAMP_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SWAMP_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SWAMP_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SWAMP_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SWAMP_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SWAMP_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SWAMP_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SWAMP_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SWAMP_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_SWAMP_FERN));
                itemStacks.add(new ItemStack(ModItems.SWAMP_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_SWAMP_GRASS));
                itemStacks.add(new ItemStack(ModItems.SWAMP_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.SWAMP_VINE));

                itemStacks.add(new ItemStack(ModItems.SAVANNA_DYE));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_SAVANNA_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_SAVANNA_FERN));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_SAVANNA_GRASS));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.SAVANNA_VINE));

                itemStacks.add(new ItemStack(ModItems.BADLANDS_DYE));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.GLOWING_BADLANDS_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_JUNGLE_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_JUNGLE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_DARK_OAK_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_DARK_OAK_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_ACACIA_LEAVES));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_ACACIA_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_FERN));
                itemStacks.add(new ItemStack(ModItems.LARGE_BADLANDS_FERN));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_GRASS));
                itemStacks.add(new ItemStack(ModItems.TALL_BADLANDS_GRASS));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_SUGAR_CANE));
                itemStacks.add(new ItemStack(ModItems.BADLANDS_VINE));


                itemStacks.add(new ItemStack(ModItems.BLENDER_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BLENDER_OAK_LEAVES_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BLENDER_DARK_OAK_LEAVES_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BLENDER_JUNGLE_LEAVES_BLOCK));
                itemStacks.add(new ItemStack(ModItems.BLENDER_ACACIA_LEAVES_BLOCK));
                itemStacks.add(new ItemStack(ModItems.WAND_OF_NATURE_COLORS));
                itemStacks.add(new ItemStack(ModItems.WAND_OF_WATER_COLORS));
                itemStacks.add(new ItemStack(ModItems.WAND_OF_NETHER_COLORS));
                itemStacks.add(new ItemStack(ModItems.WAND_OF_CHAOS_COLORS));
                itemStacks.add(new ItemStack(ModItems.WAND_OF_IMITATION));
                itemStacks.add(new ItemStack(ModItems.WAND_OF_SNOW));

                itemStacks.add(new ItemStack(ModItems.ALPHA_GRASS_BLOCK));
                itemStacks.add(new ItemStack(ModItems.ALPHA_LEAVES));

                itemStacks.add(new ItemStack(ModItems.GRASS_SEED));
                itemStacks.add(new ItemStack(ModItems.ARTIFICIAL_SOIL));
                itemStacks.add(new ItemStack(ModItems.ARTIFICIAL_SOIL_SLAB));
                itemStacks.add(new ItemStack(ModItems.GRASS_SLAB));
                itemStacks.add(new ItemStack(ModItems.DIRT_SLAB));
                itemStacks.add(new ItemStack(ModItems.COARSE_DIRT_SLAB));
                itemStacks.add(new ItemStack(ModItems.PODZOL_SLAB));
                itemStacks.add(new ItemStack(ModItems.MYCELIUM_SLAB));
                itemStacks.add(new ItemStack(ModItems.GRASS_PATH_SLAB));
                itemStacks.add(new ItemStack(ModItems.NETHERRACK_SLAB));
                itemStacks.add(new ItemStack(ModItems.CRIMSON_NYLIUM_SLAB));
                itemStacks.add(new ItemStack(ModItems.WARPED_NYLIUM_SLAB));
                itemStacks.add(new ItemStack(ModItems.SPRUCE_LEAVES_CARPET));
                itemStacks.add(new ItemStack(ModItems.BIRCH_LEAVES_CARPET));

            })
            .build();

}
