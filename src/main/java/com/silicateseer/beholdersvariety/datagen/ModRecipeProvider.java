package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.block.ModBlocks;
import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

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
                ModItems.AURICHALCUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.AURICHALCUM_BLOCK,
                "aurichalcum_ingot_from_aurichalcum_block",
                "aurichalcum_ingot");
        offerReversibleCompactingRecipesWithReverseRecipeGroup(
                exporter,
                RecipeCategory.MISC,
                ModItems.CRYSTEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.CRYSTEEL_BLOCK,
                "crysteel_ingot_from_crysteel_block",
                "crysteel_ingot");

        offerAxeRecipe("silver", ModItems.SILVER_AXE, ModItems.SILVER_INGOT, exporter);
        offerHoeRecipe("silver", ModItems.SILVER_HOE, ModItems.SILVER_INGOT, exporter);
        offerPickaxeRecipe("silver", ModItems.SILVER_PICKAXE, ModItems.SILVER_INGOT, exporter);
        offerShovelRecipe("silver", ModItems.SILVER_SHOVEL, ModItems.SILVER_INGOT, exporter);
        offerSwordRecipe("silver", ModItems.SILVER_SWORD, ModItems.SILVER_INGOT, exporter);

        offerAxeRecipe("aurichalcum", ModItems.AURICHALCUM_AXE, ModItems.AURICHALCUM_INGOT, exporter);
        offerHoeRecipe("aurichalcum", ModItems.AURICHALCUM_HOE, ModItems.AURICHALCUM_INGOT, exporter);
        offerPickaxeRecipe("aurichalcum", ModItems.AURICHALCUM_PICKAXE, ModItems.AURICHALCUM_INGOT, exporter);
        offerShovelRecipe("aurichalcum", ModItems.AURICHALCUM_SHOVEL, ModItems.AURICHALCUM_INGOT, exporter);
        offerSwordRecipe("aurichalcum", ModItems.AURICHALCUM_SWORD, ModItems.AURICHALCUM_INGOT, exporter);

        offerAxeRecipe("crysteel", ModItems.CRYSTEEL_AXE, ModItems.CRYSTEEL_INGOT, exporter);
        offerHoeRecipe("crysteel", ModItems.CRYSTEEL_HOE, ModItems.CRYSTEEL_INGOT, exporter);
        offerPickaxeRecipe("crysteel", ModItems.CRYSTEEL_PICKAXE, ModItems.CRYSTEEL_INGOT, exporter);
        offerShovelRecipe("crysteel", ModItems.CRYSTEEL_SHOVEL, ModItems.CRYSTEEL_INGOT, exporter);
        offerSwordRecipe("crysteel", ModItems.CRYSTEEL_SWORD, ModItems.CRYSTEEL_INGOT, exporter);
/*
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
*/

    }

    public static void offerAxeRecipe(String material, ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', Items.STICK)
                .input('X', input)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .criterion("has_"+material+"_ingot", conditionsFromItem(input))
                .offerTo(exporter);
    }
   public static void offerHoeRecipe(String material, ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
       ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
               .input('#', Items.STICK)
               .input('X', input)
               .pattern("XX")
               .pattern(" #")
               .pattern(" #")
               .criterion("has_"+material+"_ingot", conditionsFromItem(input))
               .offerTo(exporter);
    }
   public static void offerPickaxeRecipe(String material, ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', Items.STICK)
                .input('X', input)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion("has_"+material+"_ingot", conditionsFromItem(input))
                .offerTo(exporter);
    }
   public static void offerShovelRecipe(String material, ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', Items.STICK)
                .input('X', input)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .criterion("has_"+material+"_ingot", conditionsFromItem(input))
                .offerTo(exporter);
    }
   public static void offerSwordRecipe(String material, ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .input('#', Items.STICK)
                .input('X', input)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .criterion("has_"+material+"_ingot", conditionsFromItem(input))
                .offerTo(exporter);
    }
}
