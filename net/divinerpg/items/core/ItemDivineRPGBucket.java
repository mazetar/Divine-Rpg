package net.divinerpg.items.core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBucket;

public class ItemDivineRPGBucket extends ItemBucket{

	public ItemDivineRPGBucket(int id, int isFull) {
		super(id, isFull);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
          this.itemIcon = par1IconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + this.func_111208_A());
    }
	
}
