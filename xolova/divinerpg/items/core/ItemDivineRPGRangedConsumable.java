package xolova.divinerpg.items.core;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ItemDivineRPGRangedConsumable extends ItemDivineRPGRanged {

	public ItemDivineRPGRangedConsumable(int id, int weaponDmg) {
		super(id, 0, weaponDmg, false);
		setMaxStackSize(64);
	}
	
	@Override
	public ItemStack consume(ItemStack var1, World var2, EntityPlayer var3) {
		var1.stackSize--;
		return var1;
	}
}
