package xolova.divinerpg.items.iceika;

import xolova.divinerpg.utils.helpers.IconHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.util.Icon;

public class ItemEggNog extends ItemBucketMilk {

	public ItemEggNog(int par1) {
		super(par1);
	}
	
	@Override
	public void updateIcons(IconRegister par1IconRegister) {
		iconIndex = IconHelper.icons[3][(12 * 16 + 7)];
	}

}
