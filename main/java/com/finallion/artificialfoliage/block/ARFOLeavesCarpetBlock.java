package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;


public class ARFOLeavesCarpetBlock extends PlantBlock {
    private static final BooleanProperty SLAB_PLACEMENT = Properties.OPEN;
    private static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;
    private static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;

    protected static final VoxelShape DOWN_SHAPE = Block.createCuboidShape(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape LEAF_CARPET = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public ARFOLeavesCarpetBlock() {
        super(FabricBlockSettings.of(Material.LEAVES).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS));

        this.setDefaultState(this.stateManager.getDefaultState().with(SLAB_PLACEMENT, false));
    }


    @Override
    protected boolean canPlantOnTop(BlockState state, BlockView worldIn, BlockPos pos) {
        Block block = state.getBlock();

        return block instanceof ARFOSpreadableBlock || block instanceof ARFOSoilBlock || block instanceof ARFOSpreadableSlab || block instanceof ARFOSlab || block instanceof ARFONyliumSlab || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND) || state.isFullCube(worldIn, pos);

        //return state.isFullCube(worldIn, pos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockpos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockpos), world, blockpos);
    }


    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        BlockState target = context.getWorld().getBlockState(pos.down());

        // if plant gets placed on bottom slab, the boolean property "open" changes to true
        // this allows getShape to update the bounding box
        // the blockstate.json now needs to variants, one for open=true, one for open=false

        if (target.getBlock() instanceof ARFOSpreadableSlab || target.getBlock() instanceof ARFOSlab || target.getBlock() instanceof ARFONyliumSlab) {
            if (target.get(TYPE) == SlabType.BOTTOM) {
                return this.getDefaultState().with(SLAB_PLACEMENT, true);
            }
        }

        return this.getDefaultState();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SLAB_PLACEMENT);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(SLAB_PLACEMENT)) {
            return DOWN_SHAPE;
        } else {
            return LEAF_CARPET;
        }
    }


}
