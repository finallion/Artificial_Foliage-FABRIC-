package com.finallion.artificialfoliage.compatibilty.BYG.fluids;

import com.finallion.artificialfoliage.compatibilty.BYG.BYGBlocks;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGFluids;
import com.finallion.artificialfoliage.compatibilty.BYG.BYGItems;
import com.finallion.artificialfoliage.fluid.ARFOWater;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;


public abstract class BygImpariusGroveWater extends ARFOWater {

    public Fluid getFlowing() {
        return BYGFluids.FLOWING_BYG_IMPARIUS_GROVE_WATER;
    }

    public Fluid getStill() {
        return BYGFluids.STILL_BYG_IMPARIUS_GROVE_WATER;
    }

    @Override
    public Item getBucketItem() {
        return BYGItems.BYG_IMPARIUS_GROVE_WATER_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return (BlockState) BYGBlocks.BYG_IMPARIUS_GROVE_WATER.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(state));
    }


    public static class Flowing extends BygImpariusGroveWater {
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

    public static class Still extends BygImpariusGroveWater {
        public int getLevel(FluidState state) {
            return 8;
        }

        public boolean isStill(FluidState state) {
            return true;
        }
    }
}
