package net.divinerpg.items.iceika;

import java.util.List;

import net.divinerpg.items.core.ItemDivineRPGArmor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemSantaArmor extends ItemDivineRPGArmor {

	public ItemSantaArmor(int id, int armorType) {
		super(id, armorType, "santa", 0D, -1, true);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add("Full set: Massive Buff in Iceika");
        par3List.add(" - Speeds up player");
        par3List.add(" - Adds 6 Melee Damage");
        par3List.add(" - Refils Hunger");
        par3List.add(" - 80% Damage Reduction");
	}
}
