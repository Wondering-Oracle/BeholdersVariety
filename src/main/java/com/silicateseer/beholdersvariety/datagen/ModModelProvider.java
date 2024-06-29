package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.block.ModBlocks;
import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.CropBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

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
        blockStateModelGenerator.registerCrop(ModBlocks.DIAMANTIUM_CROP, CropBlock.AGE,
                0, 0, 2, 2, 4, 4, 4, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.MERALDIUM_CROP, CropBlock.AGE,
                0, 0, 2, 2, 4, 4, 4, 7);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORICHALCUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRYSTEEL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FERREL_HAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDENDROP_HAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRYSTEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CRYSTEEL_HOE, Models.HANDHELD);

    }
}
