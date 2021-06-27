package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.*;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ARFOCoralSapling extends PlantBlock implements Fertilizable, Waterloggable {
    public static final BooleanProperty WATERLOGGED;

    public ARFOCoralSapling() {
        super(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.GRASS).strength(0.0f).noCollision().ticksRandomly());

        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, true));
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(7) == 0) {
            this.grow(world, random, pos, state);
        }
    }


    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return !floor.getCollisionShape(world, pos).getFace(Direction.UP).isEmpty() || floor.isSideSolidFullSquare(world, pos, Direction.UP);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
        super.appendProperties(builder);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return (double)random.nextFloat() < 0.4D;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        this.trySpawningCoralFeature(world, pos, state, random);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8 ? super.getPlacementState(ctx) : null;
    }

    public boolean trySpawningCoralFeature(ServerWorld serverWorld, BlockPos pos, BlockState state, Random random) {
        serverWorld.removeBlock(pos, false);
        ArrayList<Feature<DefaultFeatureConfig>> coralFeatures = new ArrayList<>(Arrays.asList(Feature.CORAL_CLAW, Feature.CORAL_TREE, Feature.CORAL_MUSHROOM));
        DefaultFeatureConfig config = DefaultFeatureConfig.INSTANCE;
        if (this == ARFOBlocks.ARTIFICIAL_CORAL_SAPLING) {
            Feature<DefaultFeatureConfig> feature = coralFeatures.get(random.nextInt(3));
            return feature.generate(serverWorld, serverWorld.getChunkManager().getChunkGenerator(), random, pos, config);
        }
        return false;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
    }
}
