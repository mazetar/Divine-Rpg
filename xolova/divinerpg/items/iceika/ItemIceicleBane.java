package xolova.divinerpg.items.iceika;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import xolova.divinerpg.items.core.ItemDivineRPGSword;

public class ItemIceicleBane extends ItemDivineRPGSword {
	
	private static final EnumToolMaterial material =  EnumHelper.addToolMaterial("icicleBane", 1, -1, 1.5F, 16, 16);
	
    public ItemIceicleBane(int par1) {
		super(par1, material, true); //TODO
		setIconIndex(3, 14, 10);
	}
}