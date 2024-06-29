package com.silicateseer.beholdersvariety.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    SILVER(MiningLevels.STONE, 101, 8.0f, 1.0f, 19, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    CRYSTEEL(MiningLevels.IRON, 300, 8.0F, 2.0F, 14, () -> Ingredient.ofItems(ModItems.CRYSTEEL_INGOT)),
    ORICHALCUM(MiningLevels.IRON, 187, 9.0F, 1.0F, 20, () -> Ingredient.ofItems(ModItems.ORICHALCUM_INGOT));

    public final int miningLevel;
    public final int itemDurability;
    public final float miningSpeed;
    public final float attackDamage;
    public final int enchantability;
    public final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
