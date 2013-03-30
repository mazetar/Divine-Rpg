package xolova.divinerpg.items.iceika;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucketMilk;
import xolova.divinerpg.utils.helpers.IconHelper;

public class ItemEggNog extends ItemBucketMilk {

	public ItemEggNog(int par1) {
		super(par1);
	}
	
	@Override
	public void updateIcons(IconRegister par1IconRegister) {
		iconIndex = IconHelper.icons[3][(12 * 16 + 7)];
	}

}
