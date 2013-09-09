package net.divinerpg.items.core;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineRPGSeeds extends ItemSeeds
{
	int index;
	int sheet;
	
	public ItemDivineRPGSeeds(int id) {
		this(id, 0, 0);
	}
	
	public ItemDivineRPGSeeds(int id, int blockType, int SoilBlockID) {
		super(id - 256, blockType, SoilBlockID);
	}
	
	public ItemDivineRPGSeeds setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}

	public ItemDivineRPGSeeds setIconIndex(int sheet, int x, int y) {
		return setIconIndex(sheet, (x + y * 16));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
	}
	
}
