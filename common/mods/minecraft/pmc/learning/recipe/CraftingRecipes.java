package mods.minecraft.pmc.learning.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import mods.minecraft.pmc.learning.core.util.RecipeUtil;
import mods.minecraft.pmc.learning.item.ModItems;

public class CraftingRecipes
{

    public static void init()
    {
        //Wooden Helmet
        RecipeUtil.addOreRecipe(new ItemStack(ModItems.helmetWooden), new Object[]{
            "www",
            "w w",
            'w', Block.planks});
        
        //Wooden Chestplate
        RecipeUtil.addOreRecipe(new ItemStack(ModItems.chestplateWooden), new Object[]{
            "w w",
            "www",
            "www",
            'w', Block.planks});
        
        //Wooden Leggings
        RecipeUtil.addOreRecipe(new ItemStack(ModItems.leggingsWooden), new Object[]{
            "www",
            "w w",
            "w w",
            'w', Block.planks});
        
        //Wooden Boots
        RecipeUtil.addOreRecipe(new ItemStack(ModItems.bootsWooden), new Object[]{
            "w w",
            "w w",
            'w', Block.planks});
    }
    
}
