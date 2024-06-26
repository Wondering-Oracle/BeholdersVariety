package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.block.ModBlocks;
import com.silicateseer.beholdersvariety.block.cropblock.*;
import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
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
        LootCondition.Builder ironorerootbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.IRON_OREROOT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(IronOrerootCropBlock.AGE, 7));
        LootCondition.Builder goldorerootbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.GOLD_OREROOT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(GoldOrerootCropBlock.AGE, 7));
        LootCondition.Builder diamantiumbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.DIAMANTIUM_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(DiamantiumCropBlock.AGE, 7));
        LootCondition.Builder meraldiumbuilder = BlockStatePropertyLootCondition.builder(ModBlocks.MERALDIUM_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(MeraldiumCropBlock.AGE, 7));


        addDrop(ModBlocks.FERREL_CROP, cropDrops(ModBlocks.FERREL_CROP,
                ModItems.FERREL_HAY, ModItems.FERREL_SEEDS, ferrelbuilder));
        addDrop(ModBlocks.GOLDENDROP_CROP, cropDrops(ModBlocks.GOLDENDROP_CROP,
                ModItems.GOLDENDROP_HAY, ModItems.GOLDENDROP_SEEDS, goldendropbuilder));
        addDrop(ModBlocks.COPPER_OREROOT_CROP, oreCropDrops(ModBlocks.COPPER_OREROOT_CROP,
                ModItems.COPPER_OREROOT_SEEDS, Items.RAW_COPPER, 3, copperorerootbuilder));
        addDrop(ModBlocks.IRON_OREROOT_CROP, oreCropDrops(ModBlocks.IRON_OREROOT_CROP,
                ModItems.IRON_OREROOT_SEEDS, Items.RAW_IRON, 3, ironorerootbuilder));
        addDrop(ModBlocks.GOLD_OREROOT_CROP, oreCropDrops(ModBlocks.GOLD_OREROOT_CROP,
                ModItems.GOLD_OREROOT_SEEDS, Items.RAW_GOLD, 3, goldorerootbuilder));
        addDrop(ModBlocks.DIAMANTIUM_CROP, oreCropDrops(ModBlocks.DIAMANTIUM_CROP,
                ModItems.DIAMANTIUM_SEEDS, Items.DIAMOND, 1, diamantiumbuilder));
        addDrop(ModBlocks.MERALDIUM_CROP, oreCropDrops(ModBlocks.MERALDIUM_CROP,
                ModItems.MERALDIUM_SEEDS, Items.EMERALD, 1, meraldiumbuilder));


        addDrop(ModBlocks.SILVER_BLOCK);

    }

    public LootTable.Builder oreCropDrops(Block crop, Item seeds, Item resource, Integer amount, LootCondition.Builder condition) {
        return this.applyExplosionDecay(
                crop,
                LootTable.builder()
                        .pool(LootPool.builder().with(ItemEntry.builder(seeds).conditionally(condition).alternatively(ItemEntry.builder(seeds))))
                        .pool(
                                LootPool.builder()
                                        .conditionally(condition)
                                        .with(ItemEntry.builder(resource).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, amount)))
                        )
        );
    }
}
