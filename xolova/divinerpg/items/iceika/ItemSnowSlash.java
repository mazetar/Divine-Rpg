package xolova.divinerpg.items.iceika;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import xolova.divinerpg.items.core.ItemDivineRPGSword;

public class ItemSnowSlash extends ItemDivineRPGSword {
    
	private static final EnumToolMaterial material =  EnumHelper.addToolMaterial("snowSlash", 1, 150, 1.5F, 35, 10);
    
    public ItemSnowSlash(int par1) {
		super(par1, material, false);
		setIconIndex(3, 15, 14);
    }
}