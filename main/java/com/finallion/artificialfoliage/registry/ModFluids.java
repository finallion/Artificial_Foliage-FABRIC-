package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.fluid.*;
import net.minecraft.block.Block;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {

    private static void init(String path, FlowableFluid fluid) {
        Registry.register(Registry.FLUID, new Identifier(ArtificialFoliage.MOD_ID, path), fluid);
    }

    public static final FlowableFluid STILL_COLD_OCEAN_WATER = new ColdOceanWater.Still();
    public static final FlowableFluid FLOWING_COLD_OCEAN_WATER = new ColdOceanWater.Flowing();

    public static final FlowableFluid STILL_FROZEN_OCEAN_WATER = new FrozenOceanWater.Still();
    public static final FlowableFluid FLOWING_FROZEN_OCEAN_WATER = new FrozenOceanWater.Flowing();

    public static final FlowableFluid STILL_LUKEWARM_OCEAN_WATER = new LukewarmOceanWater.Still();
    public static final FlowableFluid FLOWING_LUKEWARM_OCEAN_WATER = new LukewarmOceanWater.Flowing();

    public static final FlowableFluid STILL_WARM_OCEAN_WATER = new WarmOceanWater.Still();
    public static final FlowableFluid FLOWING_WARM_OCEAN_WATER = new WarmOceanWater.Flowing();

    public static final FlowableFluid STILL_SWAMP_WATER = new SwampWater.Still();
    public static final FlowableFluid FLOWING_SWAMP_WATER = new SwampWater.Flowing();

    public static final FlowableFluid STILL_OCEAN_WATER = new OceanWater.Still();
    public static final FlowableFluid FLOWING_OCEAN_WATER = new OceanWater.Flowing();

    public static void registerFluids() {
        init("still_cold_ocean_water", STILL_COLD_OCEAN_WATER);
        init("still_frozen_ocean_water", STILL_FROZEN_OCEAN_WATER);
        init("still_lukewarm_ocean_water", STILL_LUKEWARM_OCEAN_WATER);
        init("still_warm_ocean_water", STILL_WARM_OCEAN_WATER);
        init("still_swamp_water", STILL_SWAMP_WATER);
        init("still_ocean_water", STILL_OCEAN_WATER);

        init("flowing_cold_ocean_water", FLOWING_COLD_OCEAN_WATER);
        init("flowing_frozen_ocean_water", FLOWING_FROZEN_OCEAN_WATER);
        init("flowing_lukewarm_ocean_water", FLOWING_LUKEWARM_OCEAN_WATER);
        init("flowing_warm_ocean_water", FLOWING_WARM_OCEAN_WATER);
        init("flowing_swamp_water", FLOWING_SWAMP_WATER);
        init("flowing_ocean_water", FLOWING_OCEAN_WATER);
    }


}
