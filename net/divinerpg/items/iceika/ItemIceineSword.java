package net.divinerpg.items.iceika;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ItemIceineSword extends DivineSword {
    
	private static final EnumToolMaterial material =  EnumHelper.addToolMaterial("icineSword", 1, -1, 1.5F, 34, 16);
    
    public ItemIceineSword(int par1) {
		super(par1, material, true);
    }
    
}