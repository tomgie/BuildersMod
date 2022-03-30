package net.tomgie.buildersmod.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.tomgie.buildersmod.registry.ItemRegistry;

public class PalladiumToolMaterial implements ToolMaterial {

    public static final PalladiumToolMaterial INSTANCE = new PalladiumToolMaterial();

    @Override
    public int getDurability() {
        return 700;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.5f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.PALLADIUM_INGOT);
    }

}
