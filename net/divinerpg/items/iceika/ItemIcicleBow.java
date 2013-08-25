package net.divinerpg.items.iceika;

import net.divinerpg.items.core.ItemDivineRPGBow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemIcicleBow extends ItemDivineRPGBow {

	public ItemIcicleBow(int par1) {
		super(par1, 10000, 2, 24000, false);
		setIconIndex(3, 1, 14);
	}

	@Override
	public int getSheet(int meta, int pass) {
		return 3;
	}
	
	@Override
	public int getIndex(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useDuration) {
		return getIndex(0, 0) + getUseLevel(useDuration);
	}
}
