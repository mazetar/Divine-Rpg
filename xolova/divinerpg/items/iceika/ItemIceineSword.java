package xolova.divinerpg.items.iceika;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import xolova.divinerpg.items.core.ItemDivineRPGSword;

public class ItemIceineSword extends ItemDivineRPGSword {
    
	private static final EnumToolMaterial material =  EnumHelper.addToolMaterial("icineSword", 1, -1, 1.5F, 34, 16);
    
    public ItemIceineSword(int par1) {
		super(par1, material, true);
		setIconIndex(3, 0, 14);
    }
    
}