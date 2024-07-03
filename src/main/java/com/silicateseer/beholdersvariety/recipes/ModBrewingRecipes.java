package com.silicateseer.beholdersvariety.recipes;

import com.silicateseer.beholdersvariety.item.ModItems;
import me.emafire003.dev.custombrewrecipes.CustomBrewRecipeRegister;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class ModBrewingRecipes {
    public static void registerModBrewingRecipes() {
        CustomBrewRecipeRegister.registerCustomRecipe(Items.WHEAT_SEEDS, Items.MAGMA_CREAM, ModItems.METAMORPHIC_WHEAT_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(Items.BEETROOT_SEEDS, Items.MAGMA_CREAM, ModItems.METAMORPHIC_BEETROOT_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(ModItems.METAMORPHIC_WHEAT_SEEDS, Items.IRON_INGOT, ModItems.FERREL_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(ModItems.METAMORPHIC_WHEAT_SEEDS, Items.GOLD_INGOT, ModItems.GOLDENDROP_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(ModItems.METAMORPHIC_BEETROOT_SEEDS, Items.RAW_COPPER, ModItems.COPPER_OREROOT_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(ModItems.METAMORPHIC_BEETROOT_SEEDS, Items.RAW_IRON, ModItems.IRON_OREROOT_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(ModItems.METAMORPHIC_BEETROOT_SEEDS, Items.RAW_GOLD, ModItems.GOLD_OREROOT_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(ModItems.METAMORPHIC_BEETROOT_SEEDS, Items.DIAMOND, ModItems.DIAMANTIUM_SEEDS);
        CustomBrewRecipeRegister.registerCustomRecipe(ModItems.METAMORPHIC_BEETROOT_SEEDS, Items.EMERALD, ModItems.MERALDIUM_SEEDS);
    }
}
