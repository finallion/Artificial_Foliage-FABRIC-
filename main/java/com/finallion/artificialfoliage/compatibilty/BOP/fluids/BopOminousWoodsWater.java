package com.finallion.artificialfoliage.compatibilty.BOP.fluids;

import com.finallion.artificialfoliage.compatibilty.BOP.BOPBlocks;
import com.finallion.artificialfoliage.compatibilty.BOP.BOPFluids;
import com.finallion.artificialfoliage.compatibilty.BOP.BOPItems;
import com.finallion.artificialfoliage.fluid.ARFOWater;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;


public abstract class BopOminousWoodsWater extends ARFOWater {

    public Fluid getFlowing() {
        return BOPFluids.FLOWING_BOP_OMINOUS_WOODS_WATER;
    }

    public Fluid getStill() {
        return BOPFluids.STILL_BOP_OMINOUS_WOODS_WATER;
    }

    public Item getBucketItem() {
        return BOPItems.BOP_OMINOUS_WOODS_WATER_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return (BlockState) BOPBlocks.BOP_OMINOUS_WOODS_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends BopOminousWoodsWater {
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

    public static class Still extends BopOminousWoodsWater {
        public int getLevel(FluidState state) {
            return 8;
        }

        public boolean isStill(FluidState state) {
            return true;
        }
    }
}