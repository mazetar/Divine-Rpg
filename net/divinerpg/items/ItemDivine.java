package net.divinerpg.items;

import net.divinerpg.api.IItemDivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivine extends Item implements IItemDivineRPG
{

	
	public ItemDivine(int id) {
		super(id);
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
	   this.itemIcon = par1IconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + this.func_111208_A());
	}
	
}
