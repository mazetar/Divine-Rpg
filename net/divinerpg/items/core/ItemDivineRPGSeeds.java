package net.divinerpg.items.core;

import net.divinerpg.utils.helpers.IconHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.Icon;
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
	
	// Meant to be overrided
	public int getIndex(int meta, int pass) {
		return index;
	}
	
	// Meant to be overrided
	public int getSheet(int meta, int pass) {
		return sheet;
	}

	@Override
	public Icon getIconFromDamage(int par1) {
		return IconHelper.icons[getSheet(par1, 0)][getIndex(par1, 0)];
	}
	
	@Override
	public Icon getIconFromDamageForRenderPass(int par1, int par2) {
		return getIconFromDamage(par1);
	}
}
