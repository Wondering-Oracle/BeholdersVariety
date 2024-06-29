package com.silicateseer.beholdersvariety.item;

import com.silicateseer.beholdersvariety.BeholdersVariety;
import com.silicateseer.beholdersvariety.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
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
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings()));
    public static final Item CRYSTEEL_INGOT = registerItem("crysteel_ingot",
            new Item(new FabricItemSettings()));

    public static final Item SILVER_SWORD = registerSwordItem("silver_sword", ModToolMaterials.SILVER);
    public static final Item ORICHALCUM_SWORD = registerSwordItem("orichalcum_sword", ModToolMaterials.ORICHALCUM);
    public static final Item CRYSTEEL_SWORD = registerSwordItem("crysteel_sword", ModToolMaterials.CRYSTEEL);

    public static final Item SILVER_SHOVEL = registerShovelItem("silver_shovel", ModToolMaterials.SILVER);
    public static final Item ORICHALCUM_SHOVEL = registerShovelItem("orichalcum_shovel", ModToolMaterials.ORICHALCUM);
    public static final Item CRYSTEEL_SHOVEL = registerShovelItem("crysteel_shovel", ModToolMaterials.CRYSTEEL);

    public static final Item SILVER_PICKAXE = registerPickItem("silver_pickaxe", ModToolMaterials.SILVER);
    public static final Item ORICHALCUM_PICKAXE = registerPickItem("orichalcum_pickaxe", ModToolMaterials.ORICHALCUM);
    public static final Item CRYSTEEL_PICKAXE = registerPickItem("crysteel_pickaxe", ModToolMaterials.CRYSTEEL);

    public static final Item SILVER_AXE = registerItem("silver_axe",
            new AxeItem(ModToolMaterials.SILVER, 6.0F, -3.0F, new FabricItemSettings()));
    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new AxeItem(ModToolMaterials.ORICHALCUM, 6.0F, -3.1F, new FabricItemSettings()));
    public static final Item CRYSTEEL_AXE = registerItem("crysteel_axe",
            new AxeItem(ModToolMaterials.CRYSTEEL, 6.0F, -3.1F, new FabricItemSettings()));

    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new HoeItem(ModToolMaterials.SILVER, -2, -2.0F, new FabricItemSettings()));
    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new HoeItem(ModToolMaterials.ORICHALCUM, -2, -1.0F, new FabricItemSettings()));
    public static final Item CRYSTEEL_HOE = registerItem("crysteel_hoe",
            new HoeItem(ModToolMaterials.CRYSTEEL, -2, -1.0F, new FabricItemSettings()));

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
        entry.add(ORICHALCUM_INGOT);
        entry.add(CRYSTEEL_INGOT);
    }
    private static void addToBuildingItemGroup(FabricItemGroupEntries entry) {
        entry.add(ModBlocks.SILVER_BLOCK);
        entry.add(ModBlocks.ORICHALCUM_BLOCK);
        entry.add(ModBlocks.CRYSTEEL_BLOCK);
    }
    private static void addToCombatItemGroup(FabricItemGroupEntries entry) {
        entry.add(ModItems.SILVER_SWORD);
        entry.add(ModItems.ORICHALCUM_SWORD);
        entry.add(ModItems.CRYSTEEL_SWORD);
        entry.add(ModItems.SILVER_AXE);
        entry.add(ModItems.ORICHALCUM_AXE);
        entry.add(ModItems.CRYSTEEL_AXE);
    }
    private static void addToToolsItemGroup(FabricItemGroupEntries entry) {
        entry.add(ModItems.SILVER_SHOVEL);
        entry.add(ModItems.SILVER_PICKAXE);
        entry.add(ModItems.SILVER_AXE);
        entry.add(ModItems.SILVER_HOE);
        entry.add(ModItems.ORICHALCUM_SHOVEL);
        entry.add(ModItems.ORICHALCUM_PICKAXE);
        entry.add(ModItems.ORICHALCUM_AXE);
        entry.add(ModItems.ORICHALCUM_HOE);
        entry.add(ModItems.CRYSTEEL_SHOVEL);
        entry.add(ModItems.CRYSTEEL_PICKAXE);
        entry.add(ModItems.CRYSTEEL_AXE);
        entry.add(ModItems.CRYSTEEL_HOE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(BeholdersVariety.MODID, name), item);
    }
    private static Item registerSwordItem(String name, ToolMaterial material) {
        return registerItem(name, new SwordItem(material, 3, -2.4F, new FabricItemSettings()));
    }
    private static Item registerShovelItem(String name, ToolMaterial material) {
        return registerItem(name, new ShovelItem(material, 1.5F, -3.0F, new FabricItemSettings()));
    }
    private static Item registerPickItem(String name, ToolMaterial material) {
        return registerItem(name, new PickaxeItem(material, 1, -2.8F, new FabricItemSettings()));
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addToBuildingItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addToToolsItemGroup);
    }
}
