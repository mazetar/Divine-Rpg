package net.divinerpg.utils.helpers.recipe;

import java.util.ArrayList;


import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;

public class RecipeHelper {
	public static void init() {
		OverworldRecipeHelper.init();
		TwilightRecipeHelper.init();
		VetheaRecipeHelper.init();
		ArcanaRecipeHelper.init();
	}
	public static void removeRecipes(Item removeThis)
	{
		ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList)CraftingManager.getInstance().getRecipeList();

        for (int i = 0; i < recipes.size(); i++)
        {
            IRecipe tmpRecipe = (IRecipe)recipes.get(i);

            if (tmpRecipe instanceof ShapedRecipes)
            {
                ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(removeThis), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(i) + " -> " + recipeResult);
                recipes.remove(i);
            }
        }
	}
}
