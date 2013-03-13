package xolova.blued00r.divinerpg.misc;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {

	public static void addRecipes()
	{
		
	}
	
	public static void removeRecipes()
	{
		ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList)CraftingManager.getInstance().getRecipeList();

        for (int scan = 0; scan < recipes.size(); scan++)
        {
            IRecipe tmpRecipe = (IRecipe)recipes.get(scan);

            if (tmpRecipe instanceof ShapedRecipes)
            {
                ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.helmetDiamond), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.plateDiamond), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.legsDiamond), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.bootsDiamond), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.helmetSteel), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.plateSteel), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.legsSteel), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }

            if (ItemStack.areItemStacksEqual(new ItemStack(Item.bootsSteel), recipeResult))
            {
                System.out.println("[DivineRPG] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }
        }
	}
}
