package xolova.blued00r.divinerpg.misc;

import java.util.ArrayList;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler
{
    @Override
    public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix)
    {
        if (craftMatrix != null)
        {
            if (item.itemID == DivineRPG.draviteLamp.blockID)
            {
                player.addStat(AchievementPageDivineRPG.oneLamp, 1);
            }
        }
    }

    private static void RemoveRecipe(ItemStack itemstack)
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
        }
    }

    @Override
    public void onSmelting(EntityPlayer player, ItemStack item)
    {
    }
}
