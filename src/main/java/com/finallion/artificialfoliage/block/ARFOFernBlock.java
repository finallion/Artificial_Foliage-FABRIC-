package com.finallion.artificialfoliage.block;


import com.finallion.artificialfoliage.utils.MapUtils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
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

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ARFOFernBlock extends FernBlock implements Fertilizable {
    private static final Map<Block, Block> grassFeatures = new HashMap<>();
    private static final BooleanProperty SLAB_PLACEMENT = Properties.OPEN;
    private static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;
    private static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;

    protected static final VoxelShape DOWN_SHAPE = Block.createCuboidShape(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);


    public ARFOFernBlock() {
        super(FabricBlockSettings.copyOf(Blocks.FERN).breakInstantly().sounds(BlockSoundGroup.GRASS).noCollision());

        this.setDefaultState(this.stateManager.getDefaultState().with(SLAB_PLACEMENT, false));
    }


    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        MapUtils.initFernMap(grassFeatures);
        TallPlantBlock tallPlantBlock = (TallPlantBlock) Blocks.LARGE_FERN;

        //TODO check if block is instance and get direct without for-loop
        for (Block block : grassFeatures.keySet()) {
            if (state.isOf(block)) {
                tallPlantBlock = (TallPlantBlock) grassFeatures.get(block);
            }
        }

        if (tallPlantBlock.getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up())) {
            //tallPlantBlock.placeAt(world, pos, 2);

            // checks if plant on which bone meal is used sits on bottom slab
            // not ideal like placeAt, but it works...
            if (state.get(SLAB_PLACEMENT)) {
                world.setBlockState(pos, tallPlantBlock.getDefaultState().with(HALF, DoubleBlockHalf.LOWER).with(SLAB_PLACEMENT, true), 3);
                world.setBlockState(pos.up(), tallPlantBlock.getDefaultState().with(HALF, DoubleBlockHalf.UPPER).with(SLAB_PLACEMENT, true), 3);
            } else {
                world.setBlockState(pos, tallPlantBlock.getDefaultState().with(HALF, DoubleBlockHalf.LOWER).with(SLAB_PLACEMENT, false), 3);
                world.setBlockState(pos.up(), tallPlantBlock.getDefaultState().with(HALF, DoubleBlockHalf.UPPER).with(SLAB_PLACEMENT, false), 3);
            }
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

