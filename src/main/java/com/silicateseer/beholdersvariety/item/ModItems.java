package com.silicateseer.beholdersvariety.item;

import com.silicateseer.beholdersvariety.BeholdersVariety;
import com.silicateseer.beholdersvariety.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FERREL_SEEDS = registerItem("ferrel_seeds",
            new AliasedBlockItem(ModBlocks.FERREL_CROP, new FabricItemSettings()));
    public static final Item GOLDENDROP_SEEDS = registerItem("goldendrop_seeds",
            new AliasedBlockItem(ModBlocks.GOLDENDROP_CROP, new FabricItemSettings()));
    public static final Item FERREL_HAY = registerItem("ferrel_hay",
            new Item(new FabricItemSettings()));
    public static final Item GOLDENDROP_HAY = registerItem("goldendrop_hay",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_OREROOT_SEEDS = registerItem("copper_oreroot_seeds",
            new AliasedBlockItem(ModBlocks.COPPER_OREROOT_CROP, new FabricItemSettings()));
    public static final Item IRON_OREROOT_SEEDS = registerItem("iron_oreroot_seeds",
            new AliasedBlockItem(ModBlocks.IRON_OREROOT_CROP, new FabricItemSettings()));
    public static final Item GOLD_OREROOT_SEEDS = registerItem("gold_oreroot_seeds",
            new AliasedBlockItem(ModBlocks.GOLD_OREROOT_CROP, new FabricItemSettings()));
    public static final Item DIAMANTIUM_SEEDS = registerItem("diamantium_seeds",
            new AliasedBlockItem(ModBlocks.DIAMANTIUM_CROP, new FabricItemSettings()));
    public static final Item MERALDIUM_SEEDS = registerItem("meraldium_seeds",
            new AliasedBlockItem(ModBlocks.MERALDIUM_CROP, new FabricItemSettings()));

    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings()));

    private static void addToIngredientsItemGroup(FabricItemGroupEntries entry) {
        entry.add(FERREL_SEEDS);
        entry.add(GOLDENDROP_SEEDS);
        entry.add(COPPER_OREROOT_SEEDS);
        entry.add(IRON_OREROOT_SEEDS);
        entry.add(GOLD_OREROOT_SEEDS);
        entry.add(DIAMANTIUM_SEEDS);
        entry.add(MERALDIUM_SEEDS);

        entry.add(FERREL_HAY);
        entry.add(GOLDENDROP_HAY);

        entry.add(SILVER_INGOT);
    }
    private static void addToBuildingItemGroup(FabricItemGroupEntries entry) {
        entry.add(ModBlocks.SILVER_BLOCK);
    }

        private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(BeholdersVariety.MODID, name), item);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addToBuildingItemGroup);
    }
}
