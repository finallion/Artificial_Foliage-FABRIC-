package com.finallion.artificialfoliage.item;

import com.finallion.artificialfoliage.block.*;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WandOfSnow extends Item {

    public WandOfSnow(Settings settings) {
        super(settings);
    }

    private static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;
    private static final BooleanProperty SNOWY = Properties.SNOWY;

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        BlockState state = context.getWorld().getBlockState(pos);
        Block block = world.getBlockState(pos).getBlock();
        PlayerEntity playerEntity = context.getPlayer();

        if (!world.isClient()) {
            if (block instanceof ARFOSpreadableGrassSlab || block instanceof ARFOSpreadableStoneSlab || block.is(ARFOBlocks.MYCELIUM_SLAB)) {
                if (state.get(TYPE) == SlabType.BOTTOM) {
                    world.setBlockState(pos, block.getDefaultState().with(ARFOSpreadableSlab.SNOWY, true));
                } else if (state.get(TYPE) == SlabType.TOP) {
                    if (state.get(SNOWY)) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    else world.setBlockState(pos, block.getDefaultState().with(TYPE, SlabType.TOP).with(ARFOSpreadableSlab.SNOWY, true));
                } else {
                    if (state.get(SNOWY) && state.get(TYPE) == SlabType.DOUBLE) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    else world.setBlockState(pos, block.getDefaultState().with(TYPE, SlabType.DOUBLE).with(ARFOSpreadableSlab.SNOWY, true));
                }

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else if (block instanceof ARFOSpreadableGrassBlock || block instanceof ARFOSpreadableStoneBlock) {
                if (state.get(SNOWY)) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                else world.setBlockState(pos, block.getDefaultState().with(GrassBlock.SNOWY, true));

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else if (block instanceof SlabBlock) {
                if (state.get(TYPE) != SlabType.BOTTOM) {
                    world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                    return ActionResult.SUCCESS;
                } else {
                    return ActionResult.PASS;
                }
            } else if (block.getDefaultState().isFullCube(world, pos)) {
                world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else if (block.is(Blocks.SNOW)) {
                int layers = state.get(SnowBlock.LAYERS);
                if (layers < 8) world.setBlockState(pos, Blocks.SNOW.getDefaultState().with(SnowBlock.LAYERS, layers + 1));
                else world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else {
                return ActionResult.PASS;
            }


            /*
            if (block instanceof ARFOSpreadableGrassSlab || block instanceof ARFOSpreadableStoneSlab || block.is(ARFOBlocks.MYCELIUM_SLAB)) {
                if (state.get(TYPE) == SlabType.BOTTOM) {
                    world.setBlockState(pos, block.getDefaultState().with(ARFOSpreadableSlab.SNOWY, true));
                } else if (state.get(TYPE) == SlabType.TOP) {
                    if (state.get(SNOWY)) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    else world.setBlockState(pos, block.getDefaultState().with(TYPE, SlabType.TOP).with(ARFOSpreadableSlab.SNOWY, true));
                } else {
                    if (state.get(SNOWY) && state.get(TYPE) == SlabType.DOUBLE) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    else world.setBlockState(pos, block.getDefaultState().with(TYPE, SlabType.DOUBLE).with(ARFOSpreadableSlab.SNOWY, true));
                }

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else if (block instanceof ARFOSpreadableGrassBlock || block instanceof ARFOSpreadableStoneBlock) {
                if (state.get(SNOWY)) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                else world.setBlockState(pos, block.getDefaultState().with(GrassBlock.SNOWY, true));

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else if ((block.getDefaultState().isFullCube(world, pos) || block instanceof ARFONyliumSlab) && world.getBlockState(pos.up()).isAir()) {
                if (!(block instanceof ARFONyliumSlab)) {
                    world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                    return ActionResult.SUCCESS;
                } else {
                    if (state.get(TYPE) != SlabType.BOTTOM) {
                        world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                        playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                        return ActionResult.SUCCESS;
                    }
                }
            } else if (block.is(Blocks.SNOW)) {
                int layers = state.get(SnowBlock.LAYERS);
                if (layers < 8) world.setBlockState(pos, Blocks.SNOW.getDefaultState().with(SnowBlock.LAYERS, layers + 1));
                else world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            }
             */
        }


        return ActionResult.PASS;




    }

}
