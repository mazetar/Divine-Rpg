package net.divinerpg.items.overworld;

import net.divinerpg.items.core.ItemDivineRPGSword;
import net.minecraftforge.common.EnumHelper;

public class ItemEnderSword extends ItemDivineRPGSword {
	public ItemEnderSword (int par1) {
		super(par1, EnumHelper.addToolMaterial("endersword_" + par1, 0, -1, 0, 23, 16), true);
	}
}
