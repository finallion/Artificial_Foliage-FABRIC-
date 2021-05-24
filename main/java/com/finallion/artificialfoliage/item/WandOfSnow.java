package com.finallion.artificialfoliage.item;

import com.finallion.artificialfoliage.block.ARFOGrassBlock;
import com.finallion.artificialfoliage.block.ARFONetherSlabBlock;
import com.finallion.artificialfoliage.block.ARFOSlabBlock;
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
            if (block instanceof ARFOSlabBlock || block.is(ARFOBlocks.PODZOL_SLAB) || block.is(ARFOBlocks.MYCELIUM_SLAB) || block.is(ARFOBlocks.COARSE_DIRT_SLAB) || block.is(ARFOBlocks.DIRT_SLAB) || block.is(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) {
                if (state.get(TYPE) == SlabType.BOTTOM) {
                    world.setBlockState(pos, block.getDefaultState().with(ARFOSlabBlock.SNOWY, true));
                } else if (state.get(TYPE) == SlabType.TOP) {
                    if (state.get(SNOWY)) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    else world.setBlockState(pos, block.getDefaultState().with(TYPE, SlabType.TOP).with(ARFOSlabBlock.SNOWY, true));
                } else {
                    if (state.get(SNOWY) && state.get(TYPE) == SlabType.DOUBLE) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                    else world.setBlockState(pos, block.getDefaultState().with(TYPE, SlabType.DOUBLE).with(ARFOSlabBlock.SNOWY, true));
                }

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else if (block instanceof ARFOGrassBlock) {
                if (state.get(SNOWY)) world.setBlockState(pos.up(), Blocks.SNOW.getDefaultState());
                else world.setBlockState(pos, block.getDefaultState().with(GrassBlock.SNOWY, true));

                playerEntity.playSound(SoundEvents.BLOCK_SNOW_PLACE, 1, 1);
                return ActionResult.SUCCESS;
            } else if ((block.getDefaultState().isFullCube(world, pos) || block instanceof ARFONetherSlabBlock) && world.getBlockState(pos.up()).isAir()) {
                if (!(block instanceof ARFONetherSlabBlock)) {
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
        }


        return ActionResult.PASS;


    }

}
