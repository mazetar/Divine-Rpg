package xolova.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.items.core.ItemDivineRPGFood;

public class ItemVetheanFood extends ItemDivineRPGFood
{
	
	public ItemVetheanFood(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Replenishes " + ((ItemFood) par1ItemStack.getItem()).getHealAmount() + " Hunger");
		par3List.add(((ItemFood) par1ItemStack.getItem()).getSaturationModifier() + " Saturation");
		par3List.add("Pet Food: " + ((ItemFood) par1ItemStack.getItem()).isWolfsFavoriteMeat());
        par3List.add("\u00a72Vethean");
	}
}
