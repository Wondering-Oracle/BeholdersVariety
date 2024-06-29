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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_INGOT)
                .input(Items.IRON_NUGGET, 6)
                .input(Items.GOLD_NUGGET, 3)
                .group("silver_ingot")
                .criterion("has_gold_nugget", conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter);

        offerReversibleCompactingRecipesWithReverseRecipeGroup(
                exporter,
                RecipeCategory.MISC,
                ModItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SILVER_BLOCK,
                "silver_ingot_from_silver_block",
                "silver_ingot");
        offerReversibleCompactingRecipesWithReverseRecipeGroup(
                exporter,
                RecipeCategory.MISC,
                ModItems.ORICHALCUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.ORICHALCUM_BLOCK,
                "orichalcum_ingot_from_orichalcum_block",
                "orichalcum_ingot");
        offerReversibleCompactingRecipesWithReverseRecipeGroup(
                exporter,
                RecipeCategory.MISC,
                ModItems.CRYSTEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.CRYSTEEL_BLOCK,
                "crysteel_ingot_from_crysteel_block",
                "crysteel_ingot");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_AXE)
                .input('#', Items.STICK)
                .input('X', ModItems.SILVER_INGOT)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .criterion("has_silver_ingot", conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_HOE)
                .input('#', Items.STICK)
                .input('X', ModItems.SILVER_INGOT)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .criterion("has_silver_ingot", conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_PICKAXE)
                .input('#', Items.STICK)
                .input('X', ModItems.SILVER_INGOT)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion("has_silver_ingot", conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_SHOVEL)
                .input('#', Items.STICK)
                .input('X', ModItems.SILVER_INGOT)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .criterion("has_silver_ingot", conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SILVER_SWORD)
                .input('#', Items.STICK)
                .input('X', ModItems.SILVER_INGOT)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .criterion("has_silver_ingot", conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORICHALCUM_AXE)
                .input('#', Items.STICK)
                .input('X', ModItems.ORICHALCUM_INGOT)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .criterion("has_orichalcum_ingot", conditionsFromItem(ModItems.ORICHALCUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORICHALCUM_HOE)
                .input('#', Items.STICK)
                .input('X', ModItems.ORICHALCUM_INGOT)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .criterion("has_orichalcum_ingot", conditionsFromItem(ModItems.ORICHALCUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORICHALCUM_PICKAXE)
                .input('#', Items.STICK)
                .input('X', ModItems.ORICHALCUM_INGOT)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion("has_orichalcum_ingot", conditionsFromItem(ModItems.ORICHALCUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORICHALCUM_SHOVEL)
                .input('#', Items.STICK)
                .input('X', ModItems.ORICHALCUM_INGOT)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .criterion("has_orichalcum_ingot", conditionsFromItem(ModItems.ORICHALCUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ORICHALCUM_SWORD)
                .input('#', Items.STICK)
                .input('X', ModItems.ORICHALCUM_INGOT)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .criterion("has_orichalcum_ingot", conditionsFromItem(ModItems.ORICHALCUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTEEL_AXE)
                .input('#', Items.STICK)
                .input('X', ModItems.CRYSTEEL_INGOT)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .criterion("has_crysteel_ingot", conditionsFromItem(ModItems.CRYSTEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTEEL_HOE)
                .input('#', Items.STICK)
                .input('X', ModItems.CRYSTEEL_INGOT)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .criterion("has_crysteel_ingot", conditionsFromItem(ModItems.CRYSTEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTEEL_PICKAXE)
                .input('#', Items.STICK)
                .input('X', ModItems.CRYSTEEL_INGOT)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion("has_crysteel_ingot", conditionsFromItem(ModItems.CRYSTEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CRYSTEEL_SHOVEL)
                .input('#', Items.STICK)
                .input('X', ModItems.CRYSTEEL_INGOT)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .criterion("has_crysteel_ingot", conditionsFromItem(ModItems.CRYSTEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CRYSTEEL_SWORD)
                .input('#', Items.STICK)
                .input('X', ModItems.CRYSTEEL_INGOT)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .criterion("has_crysteel_ingot", conditionsFromItem(ModItems.CRYSTEEL_INGOT))
                .offerTo(exporter);

    }
}
