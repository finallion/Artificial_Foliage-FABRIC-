package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import com.finallion.artificialfoliage.fluid.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ARFOFluids {
    public static List<FlowableFluid> fluidsList = new ArrayList<>();

    public static void registerFluids() { }

    public static FlowableFluid createFluid(FlowableFluid fluid, String id) {
        Registry.register(Registry.FLUID, new Identifier(ArtificialFoliage.MOD_ID, id), fluid);
        fluidsList.add(fluid);
        return fluid;
    }

    public static final FlowableFluid STILL_COLD_OCEAN_WATER = createFluid(new ColdOceanWater.Still(), "still_cold_ocean_water");
    public static final FlowableFluid FLOWING_COLD_OCEAN_WATER = createFluid(new ColdOceanWater.Flowing(), "flowing_cold_ocean_water");

    public static final FlowableFluid STILL_FROZEN_OCEAN_WATER = createFluid(new FrozenOceanWater.Still(), "still_frozen_ocean_water");
    public static final FlowableFluid FLOWING_FROZEN_OCEAN_WATER = createFluid(new FrozenOceanWater.Flowing(), "flowing_frozen_ocean_water");

    public static final FlowableFluid STILL_LUKEWARM_OCEAN_WATER = createFluid(new LukewarmOceanWater.Still(), "still_lukewarm_ocean_water");
    public static final FlowableFluid FLOWING_LUKEWARM_OCEAN_WATER = createFluid(new LukewarmOceanWater.Flowing(), "flowing_lukewarm_ocean_water");

    public static final FlowableFluid STILL_WARM_OCEAN_WATER = createFluid(new WarmOceanWater.Still(), "still_warm_ocean_water");
    public static final FlowableFluid FLOWING_WARM_OCEAN_WATER = createFluid(new WarmOceanWater.Flowing(), "flowing_warm_ocean_water");

    public static final FlowableFluid STILL_SWAMP_WATER = createFluid(new SwampWater.Still(), "still_swamp_water");
    public static final FlowableFluid FLOWING_SWAMP_WATER = createFluid(new SwampWater.Flowing(), "flowing_swamp_water");

    public static final FlowableFluid STILL_OCEAN_WATER = createFluid(new OceanWater.Still(), "still_ocean_water");
    public static final FlowableFluid FLOWING_OCEAN_WATER = createFluid(new OceanWater.Flowing(), "flowing_ocean_water");


}
