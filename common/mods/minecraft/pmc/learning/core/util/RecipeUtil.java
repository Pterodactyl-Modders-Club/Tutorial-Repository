package mods.minecraft.pmc.learning.core.util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeUtil
{
    /**
     * Adds a recipe, supports ore dictionary
     * @param output
     * @param input
     */
    @SuppressWarnings("unchecked")
    public static void addOreRecipe(ItemStack output, Object[] input) 
    {
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(output, new Object[] {Boolean.valueOf(true), input}));
    }
}
