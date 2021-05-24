package com.finallion.artificialfoliage.block;

import com.finallion.artificialfoliage.utils.MapUtils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ARFOGrass extends PlantBlock implements Fertilizable {
    private static final Map<Block, Block> grassFeatures = new HashMap<>();

    public ARFOGrass() {
        super(FabricBlockSettings.copyOf(Blocks.GRASS).breakInstantly().noCollision().nonOpaque().sounds(BlockSoundGroup.GRASS));
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        MapUtils.initGrassMap(grassFeatures);
        TallPlantBlock tallPlantBlock = (TallPlantBlock)Blocks.TALL_GRASS;
        for (Block block : grassFeatures.keySet()) {
            if (state.isOf(block)) {
                tallPlantBlock = (TallPlantBlock) grassFeatures.get(block);
            }
        }

        if (tallPlantBlock.getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up())) {
            tallPlantBlock.placeAt(world, pos, 2);
        }
    }

}
