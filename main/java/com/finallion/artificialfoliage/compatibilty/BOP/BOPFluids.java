package com.finallion.artificialfoliage.compatibilty.BOP;


import com.finallion.artificialfoliage.compatibilty.BOP.fluids.*;
import com.finallion.artificialfoliage.registry.ARFOFluids;
import net.minecraft.fluid.FlowableFluid;

public class BOPFluids {

    // bayou: 0x62AF84, fog: 0x0C211C (bayou mangrove, deep bayou)
    // mystic grove: 0x9C3FE4, fog: 0x2E0533
    // ominous mire: 0x312346, fog: 0x0A030C
    // origin valley: 0x0E31FF, fog: 0x070059
    // rainforest: 0x3FDF99, fog: 0x042F26
    // silkglade: 0x82826A, fog: 0x0D0F09
    // wasteland: 0x433721, fog: 0x0C0C03
    // wetland: 0x272179, fog: 0x0C031B

    public static void registerFluids() {

    }

    public static final FlowableFluid STILL_BOP_BAYOU_WATER = ARFOFluids.createFluid(new BopBayouWater.Still(), "still_bop_bayou_water");
    public static final FlowableFluid FLOWING_BOP_BAYOU_WATER = ARFOFluids.createFluid(new BopBayouWater.Flowing(), "flowing_bop_bayou_water");

    public static final FlowableFluid STILL_BOP_MYSTIC_GROVE_WATER = ARFOFluids.createFluid(new BopMysticGroveWater.Still(), "still_bop_mystic_grove_water");
    public static final FlowableFluid FLOWING_BOP_MYSTIC_GROVE_WATER = ARFOFluids.createFluid(new BopMysticGroveWater.Flowing(), "flowing_bop_mystic_grove_water");

    public static final FlowableFluid STILL_BOP_OMINOUS_WOODS_WATER = ARFOFluids.createFluid(new BopOminousWoodsWater.Still(), "still_bop_ominous_woods_water");
    public static final FlowableFluid FLOWING_BOP_OMINOUS_WOODS_WATER = ARFOFluids.createFluid(new BopOminousWoodsWater.Flowing(), "flowing_bop_ominous_woods_water");

    public static final FlowableFluid STILL_BOP_ORIGIN_VALLEY_WATER = ARFOFluids.createFluid(new BopOriginValleyWater.Still(), "still_bop_origin_valley_water");
    public static final FlowableFluid FLOWING_BOP_ORIGIN_VALLEY_WATER = ARFOFluids.createFluid(new BopOriginValleyWater.Flowing(), "flowing_bop_origin_valley_water");

    public static final FlowableFluid STILL_BOP_RAINFOREST_WATER = ARFOFluids.createFluid(new BopRainforestWater.Still(), "still_bop_rainforest_water");
    public static final FlowableFluid FLOWING_BOP_RAINFOREST_WATER = ARFOFluids.createFluid(new BopRainforestWater.Flowing(), "flowing_bop_rainforest_water");

    public static final FlowableFluid STILL_BOP_WASTELAND_WATER = ARFOFluids.createFluid(new BopWastelandWater.Still(), "still_bop_wasteland_water");
    public static final FlowableFluid FLOWING_BOP_WASTELAND_WATER = ARFOFluids.createFluid(new BopWastelandWater.Flowing(), "flowing_bop_wasteland_water");

    public static final FlowableFluid STILL_BOP_WETLAND_WATER = ARFOFluids.createFluid(new BopWetlandWater.Still(), "still_bop_wetland_water");
    public static final FlowableFluid FLOWING_BOP_WETLAND_WATER = ARFOFluids.createFluid(new BopWetlandWater.Flowing(), "flowing_bop_wetland_water");



}
