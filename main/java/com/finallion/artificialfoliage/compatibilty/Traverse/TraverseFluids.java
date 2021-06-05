package com.finallion.artificialfoliage.compatibilty.Traverse;

import com.finallion.artificialfoliage.compatibilty.Traverse.fluids.CliffsWater;
import com.finallion.artificialfoliage.compatibilty.Traverse.fluids.MiniJungleWater;
import com.finallion.artificialfoliage.compatibilty.Traverse.fluids.TraverseLushSwampWater;
import com.finallion.artificialfoliage.registry.ARFOFluids;
import net.minecraft.fluid.FlowableFluid;

import java.util.ArrayList;
import java.util.List;

public class TraverseFluids {

    public static final FlowableFluid STILL_TRAVERSE_CLIFFS_WATER = ARFOFluids.createFluid(new CliffsWater.Still(), "still_traverse_cliffs_water");
    public static final FlowableFluid FLOWING_TRAVERSE_CLIFFS_WATER = ARFOFluids.createFluid(new CliffsWater.Flowing(), "flowing_traverse_cliffs_water");

    public static final FlowableFluid STILL_TRAVERSE_LUSH_SWAMP_WATER = ARFOFluids.createFluid(new TraverseLushSwampWater.Still(), "still_traverse_lush_swamp_water");
    public static final FlowableFluid FLOWING_TRAVERSE_LUSH_SWAMP_WATER = ARFOFluids.createFluid(new TraverseLushSwampWater.Flowing(), "flowing_traverse_lush_swamp_water");

    public static final FlowableFluid STILL_TRAVERSE_MINI_JUNGLE_WATER = ARFOFluids.createFluid(new MiniJungleWater.Still(), "still_traverse_mini_jungle_water");
    public static final FlowableFluid FLOWING_TRAVERSE_MINI_JUNGLE_WATER = ARFOFluids.createFluid(new MiniJungleWater.Flowing(), "flowing_traverse_mini_jungle_water");


    public static void registerFluids() {
    }

}
