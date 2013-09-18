package net.divinerpg.items.core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemDivineRPGPickaxe extends ItemPickaxe
{
	
	public ItemDivineRPGPickaxe(int id, EnumToolMaterial enumz) {
		this(id, 0, enumz);
	}
	
	public ItemDivineRPGPickaxe(int id, int sprite, EnumToolMaterial enumz) {
		super(id, enumz);
	}
	   @Override
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister par1IconRegister) {
	       this.itemIcon = par1IconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + this.func_111208_A());
	    }
}
