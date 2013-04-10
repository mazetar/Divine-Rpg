package xolova.divinerpg.items.core;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;
import net.minecraft.util.Icon;
import xolova.divinerpg.utils.helpers.IconHelper;

public class ItemDivineRPGShovel extends ItemSpade
{
	int index;
	int sheet;
	
	public ItemDivineRPGShovel(int id, EnumToolMaterial enumz) {
		this(id, 0, enumz);
	}
	
	public ItemDivineRPGShovel(int id, int sprite, EnumToolMaterial enumz) {
		super(id - 256, enumz);
		this.index = sprite;
	}
	
	public ItemDivineRPGShovel setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}

	public ItemDivineRPGShovel setIconIndex(int sheet, int x, int y) {
		return setIconIndex(sheet, (x + y * 16));
	}
	
	@Override
	public void updateIcons(IconRegister par1IconRegister) {
		IconHelper.massLoadItemSprites(par1IconRegister);
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