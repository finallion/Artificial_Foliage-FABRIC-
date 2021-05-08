package com.finallion.artificialfoliage.item;

import com.finallion.artificialfoliage.block.*;
import com.finallion.artificialfoliage.registry.ModBlocks;
import com.sun.org.apache.xpath.internal.operations.Mod;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ARFOGrassSeedItem extends Item {

    public static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;

    public ARFOGrassSeedItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        if (useOnArtificialGrass(context.getStack(), world, blockPos)) {
            if (!world.isClient()) {
                world.syncWorldEvent(2005, blockPos, 0);
                return ActionResult.SUCCESS;
            } else {
                BoneMealItem.createParticles(world, blockPos, 10);
                if (context.getPlayer() != null) context.getPlayer().playSound(SoundEvents.BLOCK_COMPOSTER_FILL, 0.5F, 1);
            }

        }

        return ActionResult.PASS;
    }

    public static boolean useOnArtificialGrass(ItemStack stack, World world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        if (!world.isClient()) {
            if (blockState.getBlock() instanceof ARFOGrassBlock) {
                ARFOGrassBlock grassBlock = (ARFOGrassBlock) blockState.getBlock();
                if (!grassBlock.is(ModBlocks.ALPHA_GRASS_BLOCK)) {
                    grassBlock.growArtificialGrass(world, world.random, pos, blockState);
                    stack.decrement(1);
                    return true;
                }
            } else if (blockState.getBlock() instanceof ARFOGlowingGrassBlock) {
                ARFOGlowingGrassBlock grassBlock = (ARFOGlowingGrassBlock) blockState.getBlock();
                grassBlock.growArtificialGrass(world, world.random, pos, blockState);
                stack.decrement(1);
                return true;
            }
            else if (blockState.getBlock() instanceof ARFOGrassBlockSlab && blockState.get(TYPE) != SlabType.BOTTOM) {
                ARFOGrassBlockSlab grassSlab = (ARFOGrassBlockSlab) blockState.getBlock();
                grassSlab.growArtificialGrass(world, world.random, pos, blockState);
                stack.decrement(1);
                return true;
            } else if (blockState.getBlock() instanceof ARFOSoilBlock) {
                ARFOSoilBlock soilBlock = (ARFOSoilBlock) blockState.getBlock();
                soilBlock.grow(world, world.random, pos, blockState);
                stack.decrement(1);
                return true;
            } else if (blockState.getBlock().is(ModBlocks.ARTIFICIAL_SOIL_SLAB)) {
                ARFOSlabBlock grassSlab = (ARFOSlabBlock) blockState.getBlock();
                grassSlab.grow(world, world.random, pos, blockState);
                stack.decrement(1);
                return true;
            }
        }

        return false;
    }

}







