package xolova.blued00r.divinerpg.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class RecipesInfusionTable 
{
	public static int slotNumber1(ItemStack[] inventory, Item item)
	{
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 4)
			return 4;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 5 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 5;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 3)
			return 3;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 2)
			return 2;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 5 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 5;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 1)
			return 1;			
		
		return 0;
	}
	
	public static int slotNumber2(ItemStack[] inventory, Item item)
	{
		if(item == DivineRPG.vetheanBowTemplate)
			return 100;
		if(item == DivineRPG.vetheanHammerTemplate)
			return 200;
		if(item == DivineRPG.vetheanBackswordTemplate)
			return 300;
		if(item == DivineRPG.vetheanDiskTemplate)
			return 400;
		if(item == DivineRPG.vetheanCannonTemplate)
			return 500;
		if(item == DivineRPG.vetheanClawTemplate)
			return 600;
		
		return 0;
	}
	
	public static Item setSlot3(int i, int j)
	{
		int k = i + j;
		
		if(k == 104)
			return DivineRPG.teakerBow;
		if(k == 205)
			return DivineRPG.teakerHammer;
		if(k == 303)
			return DivineRPG.teakerSword;
		if(k == 402)
			return DivineRPG.teakerDisk;
		if(k == 505)
			return DivineRPG.teakerCannon;
		if(k == 601)
			return DivineRPG.teakerClaw;
		
		return null;
	}
	
	public static int x(int i)
	{
		return 0;
	}
}	
