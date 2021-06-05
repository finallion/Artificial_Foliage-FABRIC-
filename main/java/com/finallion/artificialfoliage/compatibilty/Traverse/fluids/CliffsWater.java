package com.finallion.artificialfoliage.compatibilty.Traverse.fluids;

import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseBlocks;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseFluids;
import com.finallion.artificialfoliage.compatibilty.Traverse.TraverseItems;
import com.finallion.artificialfoliage.fluid.ARFOWater;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;

public abstract class CliffsWater extends ARFOWater {

    @Override
    public Fluid getFlowing() {
        return TraverseFluids.FLOWING_TRAVERSE_CLIFFS_WATER;
    }

    @Override
    public Fluid getStill() {
        return TraverseFluids.STILL_TRAVERSE_CLIFFS_WATER;
    }

    @Override
    public Item getBucketItem() {
        return TraverseItems.TRAVERSE_CLIFFS_WATER_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return (BlockState) TraverseBlocks.TRAVERSE_CLIFFS_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }


    public static class Flowing extends CliffsWater {
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        public int getLevel(FluidState state) {
            return (Integer)state.get(LEVEL);
        }

        public boolean isStill(FluidState state) {
            return false;
        }
    }

    public static class Still extends CliffsWater {
        public int getLevel(FluidState state) {
            return 8;
        }

        public boolean isStill(FluidState state) {
            return true;
        }
    }
}
