package com.silicateseer.beholdersvariety.block;

import com.silicateseer.beholdersvariety.BeholdersVariety;
import com.silicateseer.beholdersvariety.block.cropblock.CopperOrerootCropBlock;
import com.silicateseer.beholdersvariety.block.cropblock.FerrelCropBlock;
import com.silicateseer.beholdersvariety.block.cropblock.GoldOrerootCropBlock;
import com.silicateseer.beholdersvariety.block.cropblock.IronOrerootCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FERREL_CROP = Registry.register(Registries.BLOCK,
            new Identifier(BeholdersVariety.MODID, "ferrel"),
            new FerrelCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GOLDENDROP_CROP = Registry.register(Registries.BLOCK,
            new Identifier(BeholdersVariety.MODID, "goldendrop"),
            new FerrelCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block COPPER_OREROOT_CROP = Registry.register(Registries.BLOCK,
            new Identifier(BeholdersVariety.MODID, "copper_oreroot"),
            new CopperOrerootCropBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)));
    public static final Block IRON_OREROOT_CROP = Registry.register(Registries.BLOCK,
            new Identifier(BeholdersVariety.MODID, "iron_oreroot"),
            new IronOrerootCropBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)));
    public static final Block GOLD_OREROOT_CROP = Registry.register(Registries.BLOCK,
            new Identifier(BeholdersVariety.MODID, "gold_oreroot"),
            new GoldOrerootCropBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)));

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.IRON_GRAY)
                    .instrument(Instrument.BELL)
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL
                    )));


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
