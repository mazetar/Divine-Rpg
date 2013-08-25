package net.divinerpg.items.iceika;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.utils.helpers.IconHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucketMilk;

public class ItemEggNog extends ItemBucketMilk {

	public ItemEggNog(int par1) {
		super(par1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
		this.itemIcon = IconHelper.icons[3][(12 * 16 + 7)];
	}

}
