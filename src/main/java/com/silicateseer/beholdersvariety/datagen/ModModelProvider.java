package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.block.ModBlocks;
import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.CropBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.FERREL_CROP, CropBlock.AGE,
                0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.GOLDENDROP_CROP, CropBlock.AGE,
                0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.COPPER_OREROOT_CROP, CropBlock.AGE,
                0, 0, 2, 2, 2, 5, 5, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.IRON_OREROOT_CROP, CropBlock.AGE,
                0, 0, 2, 2, 2, 5, 5, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.GOLD_OREROOT_CROP, CropBlock.AGE,
                0, 0, 2, 2, 2, 5, 5, 7);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_REDSTONE_BRICKS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FERREL_HAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDENDROP_HAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);

    }
}
