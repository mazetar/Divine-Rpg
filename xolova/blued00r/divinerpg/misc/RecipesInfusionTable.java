package xolova.blued00r.divinerpg.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesInfusionTable 
{
	public static int slotNumber1(String s)
	{
		if(s.equals("tile.dirt"))
			return 1;
		
		return 0;
	}
	
	public static int slotNumber2(String s)
	{
		if(s.equals("tile.sand"))
			return 1;
		
		return 0;
	}
	
	public static Item setSlot3(int i, int j)
	{
		int k = i + j;
		
		if(k == 2)
			return Item.axeGold;
		
		return null;
	}
}	
