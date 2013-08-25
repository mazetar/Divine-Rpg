package net.divinerpg.items.iceika;

import net.divinerpg.items.core.ItemDivineRPGSword;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ItemEnderice extends ItemDivineRPGSword {
    
	private static final EnumToolMaterial material =  EnumHelper.addToolMaterial("enderice", 1, -1, 1.5F, 28, 16);
    
    public ItemEnderice(int par1) {
		super(par1, material, true);
		setIconIndex(3, 6, 14);
    }
}