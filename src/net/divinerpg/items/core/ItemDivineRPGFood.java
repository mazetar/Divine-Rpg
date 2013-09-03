package net.divinerpg.items.core;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemDivineRPGFood extends ItemFood {

	
	public ItemDivineRPGFood(int par1, int par2, float par3, boolean par4) {
		super(par1 - 256, par2, par3, par4);
	}
	
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(getHealAmount() + " Food");
		par3List.add(getSaturationModifier() + " Saturation");
		if(isWolfsFavoriteMeat())
			par3List.add("Suitable for Wolves");
		float speed = 32F / (float) getMaxItemUseDuration(par1ItemStack);
		if(speed > 1)
			par3List.add(speed + " Times Faster");
		if(speed < 1)
			par3List.add((1 / speed) + " Times Slower");
	}

}
