package xolova.divinerpg.items.vanilla;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;
import xolova.divinerpg.items.core.ItemDivineRPGSword;

public class ItemMassivence extends ItemDivineRPGSword {

	public ItemMassivence(int par1, int durability) {
		super(par1, EnumHelper.addToolMaterial("massivence_" + par1, 0, durability, 0, 1, 16));
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(par3EntityPlayer.getHealth() < par3EntityPlayer.getMaxHealth()) {
			par3EntityPlayer.heal(2);
			par1ItemStack.damageItem(1, par3EntityPlayer);
		}
		return par1ItemStack.stackSize == 0 ? null : par1ItemStack;
	}
	
}
