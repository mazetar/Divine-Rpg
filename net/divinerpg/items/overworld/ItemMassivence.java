package net.divinerpg.items.overworld;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;

public class ItemMassivence extends DivineSword {

	public ItemMassivence(int par1) {
		this(par1, 125);
	}
	
	public ItemMassivence(int par1, int par2) {
		super(par1, EnumHelper.addToolMaterial("massivence_" + par1, 0, par2, 0, 1, 16));
	}
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(par3EntityPlayer.func_110143_aJ() < par3EntityPlayer.func_110138_aP()) {
			par3EntityPlayer.heal(1); // half
			par1ItemStack.damageItem(1, par3EntityPlayer);
		}
		return par1ItemStack.stackSize == 0 ? null : par1ItemStack;
	}
	
}