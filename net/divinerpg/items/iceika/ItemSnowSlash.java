package net.divinerpg.items.iceika;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ItemSnowSlash extends DivineSword {
    
	private static final EnumToolMaterial material =  EnumHelper.addToolMaterial("snowSlash", 1, 150, 1.5F, 35, 10);
    
    public ItemSnowSlash(int par1) {
		super(par1, material, false);
    }
}