package xolova.blued00r.divinerpg.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.item.ItemStack;

public class RecipesInfusionTable 
{
	public HashMap<List<Integer>, ItemStack> recipes = new HashMap<List<Integer>, ItemStack>();
	private static RecipesInfusionTable instance;
	
	public RecipesInfusionTable()
	{
		instance = this;
		this.recipes();
	}

	public static RecipesInfusionTable instance()
	{
		return instance;
	}
	
	public void recipes()
	{
		this.addRecipe(DivineRPG.teakerLump.itemID, DivineRPG.vetheanBowTemplate.itemID, new ItemStack(DivineRPG.teakerBow));
	}
	
	public void addRecipe(int Item1, int Item2, ItemStack item)
	{
		recipes.put(Arrays.asList(Item1, Item2), item);
	}
	
	public ItemStack getResult(int Item1, int Item2)
	{
		ItemStack item = (ItemStack)recipes.get(Arrays.asList(Item1, Item2));
		if(item == null)
			return null;
		else
			return item;
	}
}	
