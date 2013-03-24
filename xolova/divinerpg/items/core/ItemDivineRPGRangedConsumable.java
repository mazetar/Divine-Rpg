package xolova.divinerpg.items.core;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ItemDivineRPGRangedConsumable extends ItemDivineRPGRanged {

	public ItemDivineRPGRangedConsumable(int id, int maxDmg, int weaponDmg) {
		super(id, maxDmg, weaponDmg, false);
	}
	
	@Override
	public ItemStack consume(ItemStack var1, World var2, EntityPlayer var3) {
		var1.stackSize--;
		return var1.stackSize == 0 ? null : var1;
	}
}
