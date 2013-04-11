package xolova.divinerpg.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import xolova.divinerpg.api.IItemDivineRPG;
import xolova.divinerpg.utils.helpers.IconHelper;

public class ItemDivineRPG extends Item implements IItemDivineRPG
{
	int index;
	int sheet;
	
	public ItemDivineRPG(int id) {
		this(id, 0);
	}
	
	public ItemDivineRPG(int id, int sprite) {
		super(id - 256);
		GameRegistry.registerItem(this, null);
		this.index = sprite;
	}
	
	public ItemDivineRPG setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}

	public ItemDivineRPG setIconIndex(int sheet, int x, int y) {
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
