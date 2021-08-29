package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public class ARFOLargeFernBlock extends TallPlantBlock {
    private static final BooleanProperty SLAB_PLACEMENT = Properties.OPEN;
    private static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;
    private static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;

    protected static final VoxelShape DOWN_SHAPE = Block.createCuboidShape(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);


    public ARFOLargeFernBlock() {
        super(FabricBlockSettings.copyOf(Blocks.LARGE_FERN).breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque().noCollision());

        this.setDefaultState(this.stateManager.getDefaultState().with(SLAB_PLACEMENT, false).with(HALF, DoubleBlockHalf.LOWER));
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (state.get(SLAB_PLACEMENT)) {
            world.setBlockState(pos.up(), this.getDefaultState().with(HALF, DoubleBlockHalf.UPPER).with(SLAB_PLACEMENT, true), 3);
        } else {
            world.setBlockState(pos.up(), this.getDefaultState().with(HALF, DoubleBlockHalf.UPPER).with(SLAB_PLACEMENT, false), 3);
        }
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
        super.appendProperties(builder);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(SLAB_PLACEMENT)) {
            return DOWN_SHAPE;
        } else {
            return SHAPE;
        }
    }

}
