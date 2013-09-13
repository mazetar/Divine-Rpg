package net.divinerpg.items.overworld;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;

public class ItemPalavence extends DivineSword {

	public ItemPalavence(int par1) {
		super(par1, EnumHelper.addToolMaterial("palavence_" + par1, 0, 125, 0, 1, 16));
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(par3EntityPlayer.func_110143_aJ() < par3EntityPlayer.func_110138_aP()) {
			par3EntityPlayer.heal(2); // half
			par1ItemStack.damageItem(1, par3EntityPlayer);
		}
		return par1ItemStack.stackSize == 0 ? null : par1ItemStack;
	}

}
