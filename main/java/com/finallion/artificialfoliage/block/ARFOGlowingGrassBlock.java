package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.registry.ARFOBlocks;
import com.finallion.artificialfoliage.utils.BlockMapping;
import com.finallion.artificialfoliage.utils.MapUtils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.NetherForestVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVinesFeature;

import java.util.*;

public class ARFOGlowingGrassBlock extends ARFOSpreadableBlock {


    public ARFOGlowingGrassBlock() {
        super(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).luminance(15));
    }


}
