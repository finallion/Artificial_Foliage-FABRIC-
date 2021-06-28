package com.finallion.artificialfoliage.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.ToIntFunction;

public class ARFOGlowingLeavesCarpetBlock extends PlantBlock implements Fertilizable, CaveVines {
    private static final BooleanProperty SLAB_PLACEMENT = Properties.OPEN;
    private static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;
    protected static final VoxelShape DOWN_SHAPE = Block.createCuboidShape(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape LEAF_CARPET = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public ARFOGlowingLeavesCarpetBlock() {
        super(FabricBlockSettings.of(Material.LEAVES).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.AZALEA_LEAVES).luminance(createLightLevelFromBerriesBlockState(14)));

        this.setDefaultState(this.stateManager.getDefaultState().with(SLAB_PLACEMENT, false).with(BERRIES, true));
    }


    // leaf carpet logic
    @Override
    protected boolean canPlantOnTop(BlockState state, BlockView worldIn, BlockPos pos) {
        Block block = state.getBlock();

        return block instanceof ARFOSpreadableBlock || block instanceof ARFOSoilBlock || block instanceof ARFOSpreadableSlab || block instanceof ARFOSlab || block instanceof ARFONyliumSlab || block.getDefaultState().isOf(Blocks.GRASS_BLOCK) || block.getDefaultState().isOf(Blocks.DIRT) || block.getDefaultState().isOf(Blocks.COARSE_DIRT) || block.getDefaultState().isOf(Blocks.PODZOL) || block.getDefaultState().isOf(Blocks.FARMLAND) || state.isFullCube(worldIn, pos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockpos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockpos), world, blockpos);
    }


    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        BlockState target = context.getWorld().getBlockState(pos.down());

        // if plant gets placed on bottom slab, the boolean property "open" changes to true
        // this allows getShape to update the bounding box
        // the blockstate.json now needs to variants, one for open=true, one for open=false

        if (target.getBlock() instanceof ARFOSpreadableSlab || target.getBlock() instanceof ARFOSlab || target.getBlock() instanceof ARFONyliumSlab) {
            if (target.get(TYPE) == SlabType.BOTTOM) {
                return this.getDefaultState().with(SLAB_PLACEMENT, true);
            }
        }

        return this.getDefaultState();
    }





    // glow berry logic
    private static ToIntFunction<BlockState> createLightLevelFromBerriesBlockState(int berriesLevel) {
        return (state) -> {
            return (Boolean)state.get(Properties.BERRIES) ? berriesLevel : 0;
        };
    }


    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        boolean bl = state.get(BERRIES);
        if (!bl && player.getStackInHand(hand).isOf(Items.BONE_MEAL)) {
            return ActionResult.PASS;
        } else if (bl) {
            int j = 1 + world.random.nextInt(2);
            dropStack(world, pos, new ItemStack(Items.GLOW_BERRIES, j + (bl ? 1 : 0)));
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            world.setBlockState(pos, (BlockState)state.with(BERRIES, false), 2);
            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }



    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{BERRIES, SLAB_PLACEMENT});
    }

    public boolean hasRandomTicks(BlockState state) {
        return !state.get(BERRIES);
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        boolean bl = state.get(BERRIES);
        if (!bl && random.nextInt(10) == 0 && world.getBaseLightLevel(pos.up(), 0) >= 9) {
            world.setBlockState(pos, (BlockState)state.with(BERRIES, true), 2);
        }

    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return !state.get(BERRIES);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, (BlockState)state.with(BERRIES, true), 2);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(SLAB_PLACEMENT)) {
            return DOWN_SHAPE;
        } else {
            return LEAF_CARPET;
        }
    }

}
