package net.divinerpg.items.overworld;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;

public class ItemHealingSword extends DivineSword {

    int healValue;
	public ItemHealingSword(int id, EnumToolMaterial material, int healAmmount) {
		super(id, material);
		healValue = healAmmount;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(par3EntityPlayer.func_110143_aJ() < par3EntityPlayer.func_110138_aP()) {
			par3EntityPlayer.heal(healValue * 2); // half
			par1ItemStack.damageItem(1, par3EntityPlayer);
		}
		return par1ItemStack.stackSize == 0 ? null : par1ItemStack;
	}

}
