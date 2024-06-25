package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.block.ModBlocks;
import com.silicateseer.beholdersvariety.block.cropblock.*;
import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        LootCondition.Builder ferrelbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.FERREL_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(FerrelCropBlock.AGE, 7));
        LootCondition.Builder goldendropbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.GOLDENDROP_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(GoldendropCropBlock.AGE, 7));
        LootCondition.Builder copperorerootbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.COPPER_OREROOT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CopperOrerootCropBlock.AGE, 7));
        LootCondition.Builder ironorerootbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.COPPER_OREROOT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(IronOrerootCropBlock.AGE, 7));
        LootCondition.Builder goldorerootbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.COPPER_OREROOT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(GoldOrerootCropBlock.AGE, 7));

        addDrop(ModBlocks.FERREL_CROP,
                cropDrops(ModBlocks.FERREL_CROP, ModItems.FERREL_HAY,
                        ModItems.FERREL_SEEDS, ferrelbuilder));
        addDrop(ModBlocks.GOLDENDROP_CROP,
                cropDrops(ModBlocks.GOLDENDROP_CROP, ModItems.GOLDENDROP_HAY,
                        ModItems.GOLDENDROP_SEEDS, goldendropbuilder));
        this.addDrop(
                ModBlocks.COPPER_OREROOT_CROP,
                this.applyExplosionDecay(
                        ModBlocks.COPPER_OREROOT_CROP,
                        LootTable.builder()
                                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.COPPER_OREROOT_SEEDS)))
                                .pool(
                                        LootPool.builder()
                                                .conditionally(copperorerootbuilder)
                                                .with(ItemEntry.builder(Items.RAW_COPPER).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3)))
                                )
                )
        );
        this.addDrop(
                ModBlocks.IRON_OREROOT_CROP,
                this.applyExplosionDecay(
                        ModBlocks.IRON_OREROOT_CROP,
                        LootTable.builder()
                                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.IRON_OREROOT_SEEDS)))
                                .pool(
                                        LootPool.builder()
                                                .conditionally(ironorerootbuilder)
                                                .with(ItemEntry.builder(Items.RAW_IRON).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3)))
                                )
                )
        );
        this.addDrop(
                ModBlocks.GOLD_OREROOT_CROP,
                this.applyExplosionDecay(
                        ModBlocks.GOLD_OREROOT_CROP,
                        LootTable.builder()
                                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.GOLD_OREROOT_SEEDS)))
                                .pool(
                                        LootPool.builder()
                                                .conditionally(goldorerootbuilder)
                                                .with(ItemEntry.builder(Items.RAW_GOLD).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3)))
                                )
                )
        );

    }
}
