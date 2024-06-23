package com.silicateseer.beholdersvariety.block;

import com.silicateseer.beholdersvariety.BeholdersVariety;
import com.silicateseer.beholdersvariety.block.cropblock.FerrelCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FERREL_CROP = Registry.register(Registries.BLOCK,
            new Identifier(BeholdersVariety.MODID, "ferrel"),
            new FerrelCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GOLDENDROP_CROP = Registry.register(Registries.BLOCK,
            new Identifier(BeholdersVariety.MODID, "goldendrop"),
            new FerrelCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new Identifier(BeholdersVariety.MODID, name), block);
    }
    private static BlockItem registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(BeholdersVariety.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {

    }
}
