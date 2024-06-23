package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.block.ModBlocks;
import com.silicateseer.beholdersvariety.block.cropblock.FerrelCropBlock;
import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        LootCondition.Builder haybuilder = BlockStatePropertyLootCondition.builder(ModBlocks.FERREL_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(FerrelCropBlock.AGE, 7));

        addDrop(ModBlocks.FERREL_CROP,
                cropDrops(ModBlocks.FERREL_CROP, ModItems.FERREL_HAY,
                        ModItems.FERREL_SEEDS, haybuilder));

    }
}
