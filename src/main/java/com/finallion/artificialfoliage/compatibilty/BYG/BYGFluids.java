package com.finallion.artificialfoliage.compatibilty.BYG;


import com.finallion.artificialfoliage.compatibilty.BYG.fluids.*;
import com.finallion.artificialfoliage.registry.ARFOFluids;
import net.minecraft.fluid.FlowableFluid;


public class BYGFluids {

    // POLLUTED_LAKE:       water: 9202509, fog: 9202509 // same as cold swamplands
    // VIBRANT_SWAMPLAND:   water: 6388580, fog: 2302743
    // CRAG GARNDS:         water: 8170451, fog: 6200521
    // TROPICAL_ISLAND:     water: 4566514, fog: 267827
    // GLOWSHROOM_BAYOU:    water: 4815438, fog: 6717479
    // DEAD_SEA:            water: 12632256, fog: 12632256
    // BULBIS_GARDENS:      water: 10040012
    // ETHEREAL_ISLANDS:    water: 3905655
    // IMPARIUS_GROVE:      water: 3722412
    // SHULKREN_FOREST:     water: 1415511 fog: 2005339


    public static void registerFluids() {

    }

    public static final FlowableFluid STILL_BYG_POLLUTED_LAKE_WATER = ARFOFluids.createFluid(new BygPollutedLakeWater.Still(), "still_byg_polluted_lake_water");
    public static final FlowableFluid FLOWING_BYG_POLLUTED_LAKE_WATER = ARFOFluids.createFluid(new BygPollutedLakeWater.Flowing(), "flowing_byg_polluted_lake_water");

    public static final FlowableFluid STILL_BYG_VIBRANT_SWAMPLAND_WATER = ARFOFluids.createFluid(new BygVibrantSwamplandWater.Still(), "still_byg_vibrant_swampland_water");
    public static final FlowableFluid FLOWING_BYG_VIBRANT_SWAMPLAND_WATER = ARFOFluids.createFluid(new BygVibrantSwamplandWater.Flowing(), "flowing_byg_vibrant_swampland_water");

    public static final FlowableFluid STILL_BYG_CRAG_GARDENS_WATER = ARFOFluids.createFluid(new BygCragGardensWater.Still(), "still_byg_crag_gardens_water");
    public static final FlowableFluid FLOWING_BYG_CRAG_GARDENS_WATER = ARFOFluids.createFluid(new BygCragGardensWater.Flowing(), "flowing_byg_crag_gardens_water");

    public static final FlowableFluid STILL_BYG_TROPICAL_ISLAND_WATER = ARFOFluids.createFluid(new BygTropicalIslandWater.Still(), "still_byg_tropical_island_water");
    public static final FlowableFluid FLOWING_BYG_TROPICAL_ISLAND_WATER = ARFOFluids.createFluid(new BygTropicalIslandWater.Flowing(), "flowing_byg_tropical_island_water");

    public static final FlowableFluid STILL_BYG_GLOWSHROOM_BAYOU_WATER = ARFOFluids.createFluid(new BygGlowshroomBayouWater.Still(), "still_byg_glowshroom_bayou_water");
    public static final FlowableFluid FLOWING_BYG_GLOWSHROOM_BAYOU_WATER = ARFOFluids.createFluid(new BygGlowshroomBayouWater.Flowing(), "flowing_byg_glowshroom_bayou_water");

    public static final FlowableFluid STILL_BYG_DEAD_SEA_WATER = ARFOFluids.createFluid(new BygDeadSeaWater.Still(), "still_byg_dead_sea_water");
    public static final FlowableFluid FLOWING_BYG_DEAD_SEA_WATER = ARFOFluids.createFluid(new BygDeadSeaWater.Flowing(), "flowing_byg_dead_sea_water");

    public static final FlowableFluid STILL_BYG_BULBIS_GARDENS_WATER = ARFOFluids.createFluid(new BygBulbisGardensWater.Still(), "still_byg_bulbis_gardens_water");
    public static final FlowableFluid FLOWING_BYG_BULBIS_GARDENS_WATER = ARFOFluids.createFluid(new BygBulbisGardensWater.Flowing(), "flowing_byg_bulbis_gardens_water");

    public static final FlowableFluid STILL_BYG_ETHEREAL_ISLANDS_WATER = ARFOFluids.createFluid(new BygEtherealIslandsWater.Still(), "still_byg_ethereal_islands_water");
    public static final FlowableFluid FLOWING_BYG_ETHEREAL_ISLANDS_WATER = ARFOFluids.createFluid(new BygEtherealIslandsWater.Flowing(), "flowing_byg_ethereal_islands_water");

    public static final FlowableFluid STILL_BYG_IMPARIUS_GROVE_WATER = ARFOFluids.createFluid(new BygImpariusGroveWater.Still(), "still_byg_imparius_grove_water");
    public static final FlowableFluid FLOWING_BYG_IMPARIUS_GROVE_WATER = ARFOFluids.createFluid(new BygImpariusGroveWater.Flowing(), "flowing_byg_imparius_grove_water");

    public static final FlowableFluid STILL_BYG_SHULKREN_FOREST_WATER = ARFOFluids.createFluid(new BygShulkrenForestWater.Still(), "still_byg_shulkren_forest_water");
    public static final FlowableFluid FLOWING_BYG_SHULKREN_FOREST_WATER = ARFOFluids.createFluid(new BygShulkrenForestWater.Flowing(), "flowing_byg_shulkren_forest_water");



}
