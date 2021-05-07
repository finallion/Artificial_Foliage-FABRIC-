package com.finallion.artificialfoliage.registry;

import com.finallion.artificialfoliage.ArtificialFoliage;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.fabric.mixin.tag.extension.AccessorFluidTags;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.FluidTags;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagGroup;
import net.minecraft.util.Identifier;

public class FabricTagRegistry {

    public static final Tag<Fluid> COLD_OCEAN_WATER = TagRegistry.fluid(new Identifier(ArtificialFoliage.MOD_ID, "cold_ocean_water"));
    public static final Tag<Fluid> FROZEN_OCEAN_WATER = TagRegistry.fluid(new Identifier(ArtificialFoliage.MOD_ID, "frozen_ocean_water"));
    public static final Tag<Fluid> WARM_OCEAN_WATER = TagRegistry.fluid(new Identifier(ArtificialFoliage.MOD_ID, "warm_ocean_water"));
    public static final Tag<Fluid> LUKEWARM_OCEAN_WATER = TagRegistry.fluid(new Identifier(ArtificialFoliage.MOD_ID, "lukewarm_ocean_water"));
    public static final Tag<Fluid> OCEAN_WATER = TagRegistry.fluid(new Identifier(ArtificialFoliage.MOD_ID, "ocean_water"));
    public static final Tag<Fluid> SWAMP_WATER = TagRegistry.fluid(new Identifier(ArtificialFoliage.MOD_ID, "swamp_water"));



    public static void init() {
    }




}
