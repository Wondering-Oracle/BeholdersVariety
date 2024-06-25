package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.block.ModBlocks;
import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerShapelessRecipe(exporter, Items.IRON_NUGGET, ModItems.FERREL_HAY, "iron_nugget", 5);
        offerShapelessRecipe(exporter, Items.GOLD_NUGGET, ModItems.GOLDENDROP_HAY, "gold_nugget", 5);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_INGOT).input(Items.IRON_NUGGET, 6).input(Items.GOLD_NUGGET, 3).group("silver_ingot").criterion("has_gold_nugget", conditionsFromItem(Items.GOLD_NUGGET)).offerTo(exporter);
        offerReversibleCompactingRecipesWithReverseRecipeGroup(exporter, RecipeCategory.MISC, ModItems.SILVER_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK, "silver_ingot_from_silver_block", "silver_ingot");

    }
}
