package com.finallion.artificialfoliage;

import com.finallion.artificialfoliage.compatibilty.ModCompat;
import com.finallion.artificialfoliage.loot.VanillaLootTableCompat;
import com.finallion.artificialfoliage.registry.ARFOBlocks;
import com.finallion.artificialfoliage.registry.ARFOFluids;
import com.finallion.artificialfoliage.registry.ARFOItemTags;
import com.finallion.artificialfoliage.registry.ARFOItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArtificialFoliage implements ModInitializer {
    public static final String MOD_ID = "arfo";

    @Override
    public void onInitialize() {
        ARFOItems.registerItems();
        ARFOBlocks.registerBlocks();
        ARFOFluids.registerFluids();
        VanillaLootTableCompat.init();
        ARFOItemTags.init();

        // mod compat
        ModCompat.init();

        // when pasting from 1.16
        // -> change vine blockstate!
        // -> remember azalea leaves carpets
        // -> remove blender blocks + wands

        // replaces "item" predicate with "items" which breaks the loot table in 1.17
        // set directory to absolute path


        try {
            List<Path> files = findLootTables("C:\\Users\\lbret\\Desktop\\Modding\\Artificial Foliage FABRIC 1.17\\src\\main\\resources\\assets\\arfo\\blockstates");
            for (Path path : files) {
                if (path.toString().contains("_vine")) replaceLootTables(String.valueOf(path));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }






    }

    public static void replaceLootTables(String path) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(path));
            StringBuffer inputBuffer = new StringBuffer();
            String line;

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();
            String inputStr = inputBuffer.toString();

            //System.out.println(inputStr);

            String newVine = "{\n" +
                    "  \"multipart\": [\n" +
                    "    {\n" +
                    "      \"when\": {\n" +
                    "        \"up\": \"true\"\n" +
                    "      },\n" +
                    "      \"apply\": {\n" +
                    "        \"model\": \"minecraft:block/vine\",\n" +
                    "        \"x\": 270,\n" +
                    "        \"uvlock\": true\n" +
                    "      }\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"when\": {\n" +
                    "        \"north\": \"true\"\n" +
                    "      },\n" +
                    "      \"apply\": {\n" +
                    "        \"model\": \"minecraft:block/vine\"\n" +
                    "      }\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"when\": {\n" +
                    "        \"west\": \"true\"\n" +
                    "      },\n" +
                    "      \"apply\": {\n" +
                    "        \"model\": \"minecraft:block/vine\",\n" +
                    "        \"y\": 270,\n" +
                    "        \"uvlock\": true\n" +
                    "      }\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"when\": {\n" +
                    "        \"south\": \"true\"\n" +
                    "      },\n" +
                    "      \"apply\": {\n" +
                    "        \"model\": \"minecraft:block/vine\",\n" +
                    "        \"y\": 180,\n" +
                    "        \"uvlock\": true\n" +
                    "      }\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"when\": {\n" +
                    "        \"east\": \"true\"\n" +
                    "      },\n" +
                    "      \"apply\": {\n" +
                    "        \"model\": \"minecraft:block/vine\",\n" +
                    "        \"y\": 90,\n" +
                    "        \"uvlock\": true\n" +
                    "      }\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";
            /*
            if (inputStr.contains("\"item\": \"minecraft:shears\"")) {
                inputStr = inputStr.replace("\"item\": \"minecraft:shears\"", "\"items\": [ \"minecraft:shears\" ]");
            }

             */

            //System.out.println(inputStr);

            FileOutputStream fileOut = new FileOutputStream(path);
            System.out.println("Written new data to: " + path);
            fileOut.write(newVine.getBytes());
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Problem reading file: " + path);
        }
    }


    private static List<Path> findLootTables(String searchDirectory) throws IOException {
        try (Stream<Path> files = Files.walk(Paths.get(searchDirectory))) {
            return files.collect(Collectors.toList());
        }
    }


    public static ItemGroup ADVANCED = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "advanced"))
            .icon(() -> new ItemStack(ARFOItems.MUSHROOM_FIELDS_DYE)).build();


}
