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
    private static void addToIngredientsItemGroup(FabricItemGroupEntries entry) {
        entry.add(FERREL_SEEDS);
        entry.add(GOLDENDROP_SEEDS);
        entry.add(FERREL_HAY);
        entry.add(GOLDENDROP_HAY);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(BeholdersVariety.MODID, name), item);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addToIngredientsItemGroup);
    }
}
