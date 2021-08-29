package com.finallion.artificialfoliage;

import com.finallion.artificialfoliage.compatibilty.ModCompat;
import com.finallion.artificialfoliage.item.WandOfImitation;
import com.finallion.artificialfoliage.loot.VanillaLootTableCompat;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import com.finallion.artificialfoliage.registry.ARFOFluids;
import com.finallion.artificialfoliage.registry.ARFOItemTags;
import com.finallion.artificialfoliage.registry.ARFOItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArtificialFoliage implements ModInitializer {
    public static final String MOD_ID = "arfo";
    private static int color;

    @Override
    public void onInitialize() {
        ARFOItems.registerItems();
        ARFOBlocks.registerBlocks();
        ARFOFluids.registerFluids();
        VanillaLootTableCompat.init();
        ARFOItemTags.init();

        // mod compat
        ModCompat.init();

        ServerPlayNetworking.registerGlobalReceiver(WandOfImitation.COLOR_CONSTANT, (server, player, handler, buf, responseSender) -> {
            color = buf.readInt();
            server.execute(() -> {
                ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);
                if (stack.getItem() == ARFOItems.WAND_OF_IMITATION) {
                    stack.getOrCreateTag().putInt("color", color);
                }
            });
        });






    }

    public static ItemGroup ADVANCED = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "advanced"))
            .icon(() -> new ItemStack(ARFOItems.MUSHROOM_FIELDS_DYE)).build();


}
