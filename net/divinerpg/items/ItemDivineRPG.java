package net.divinerpg.items;

import net.divinerpg.api.IItemDivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineRPG extends Item implements IItemDivineRPG
{
	protected int index;
	protected int sheet;
	
	public ItemDivineRPG(int id) {
		this(id, 0);
	}
	
	public ItemDivineRPG(int id, int sprite) {
		super(id - 256);
		this.index = sprite;
	}
	
	@Deprecated
	public ItemDivineRPG setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}

	@Deprecated
	public ItemDivineRPG setIconIndex(int sheet, int x, int y) {
		return setIconIndex(sheet, (x + y * 16));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
	   this.itemIcon = par1IconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + this.func_111208_A());
	}

	@Override
	public Icon getIconFromDamageForRenderPass(int par1, int par2) {
		return getIconFromDamage(par1);
	}
	
	@Override
	public Item setUnlocalizedName(String name) {
	    func_111206_d(name);
	    return super.setUnlocalizedName(name);
	}
}
