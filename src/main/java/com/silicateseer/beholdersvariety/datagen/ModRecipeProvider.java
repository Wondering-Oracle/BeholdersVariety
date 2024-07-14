package com.silicateseer.beholdersvariety.datagen;

import com.silicateseer.beholdersvariety.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerShapelessRecipe(exporter, Items.IRON_NUGGET, ModItems.FERREL_HAY, "iron_nugget", 5);
        offerShapelessRecipe(exporter, Items.GOLD_NUGGET, ModItems.GOLDENDROP_HAY, "gold_nugget", 5);
    }
}
