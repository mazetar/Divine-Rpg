package net.divinerpg.items.core;

import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DivineSeeds extends ItemSeeds
{
	public DivineSeeds(int id) {
		this(id, 0, 0);
	}
	
	public DivineSeeds(int id, int blockType, int SoilBlockID) {
		super(id, blockType, SoilBlockID);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
	    this.itemIcon = iconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + func_111208_A());
	}
	
}
