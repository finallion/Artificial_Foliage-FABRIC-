package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;


public class ARFOLeavesCarpetBlock extends PlantBlock {
    protected static final EnumProperty<SlabType> TYPE = SlabBlock.TYPE;
    protected static final VoxelShape LEAF_CARPET = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public ARFOLeavesCarpetBlock() {
        super(FabricBlockSettings.of(Material.LEAVES).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return LEAF_CARPET;
    }

    @Override
    protected boolean canPlantOnTop(BlockState state, BlockView worldIn, BlockPos pos) {
        if (worldIn.getBlockState(pos).getBlock() instanceof SlabBlock && worldIn.getBlockState(pos).isOf(ARFOBlocks.GRASS_PATH_SLAB)) {
            if (state.get(TYPE) != SlabType.BOTTOM) {
                return true;
            }
        }
        return state.isFullCube(worldIn, pos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockpos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockpos), world, blockpos);
    }


}
