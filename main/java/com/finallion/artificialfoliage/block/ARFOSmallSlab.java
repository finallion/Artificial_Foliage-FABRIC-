package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ARFOSmallSlab extends SlabBlock {
    protected static final VoxelShape TOP_SHAPE;
    protected static final VoxelShape BOTTOM_SHAPE;
    protected static final VoxelShape DOUBLE_SHAPE;
    public static final BooleanProperty SNOWY;

    public ARFOSmallSlab() {
        super(FabricBlockSettings.copyOf(Blocks.GRASS_PATH).breakByTool(FabricToolTags.SHOVELS));
        this.setDefaultState(this.stateManager.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, false).with(SNOWY, false));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        SlabType type = (SlabType)state.get(TYPE);

        switch(type){
            case DOUBLE:
                return DOUBLE_SHAPE;
            case TOP:
                return TOP_SHAPE;
            default:
                return BOTTOM_SHAPE;
        }
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return super.hasSidedTransparency(state);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return !this.getDefaultState().canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? Block.pushEntitiesUpBeforeBlockChange(this.getDefaultState(), Blocks.DIRT.getDefaultState(), ctx.getWorld(), ctx.getBlockPos()) : super.getPlacementState(ctx);
    }


    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (direction == Direction.UP && !state.canPlaceAt(world, pos)) {
            world.getBlockTickScheduler().schedule(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canPlaceAt(state, world, pos)) {
            if (state.get(TYPE) == SlabType.BOTTOM) {
                world.setBlockState(pos, ARFOBlocks.ARTIFICIAL_SOIL_SLAB.getDefaultState(), 3);
            } else if (state.get(TYPE) == SlabType.TOP) {
                world.setBlockState(pos, ARFOBlocks.ARTIFICIAL_SOIL_SLAB.getDefaultState().with(TYPE, SlabType.TOP), 3);
            } else {
                world.setBlockState(pos, ARFOBlocks.ARTIFICIAL_SOIL.getDefaultState(), 3);
            }
        }
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.up());
        return !blockState.getMaterial().isSolid() || blockState.getBlock() instanceof FenceGateBlock;
    }

    static {
        TOP_SHAPE = Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 15.0D, 16.0D);
        BOTTOM_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D);
        DOUBLE_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
        SNOWY = Properties.SNOWY;
    }

}
