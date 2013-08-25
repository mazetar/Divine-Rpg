package net.divinerpg.items.core;

import java.util.List;

import net.divinerpg.utils.helpers.IconHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineRPGFood extends ItemFood {

	int index;
	int sheet;
	
	public ItemDivineRPGFood(int par1, int par2, float par3, boolean par4) {
		super(par1 - 256, par2, par3, par4);
	}
	
	
	public ItemDivineRPGFood setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}

	public ItemDivineRPGFood setIconIndex(int sheet, int x, int y) {
		return setIconIndex(sheet, (x + y * 16));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
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
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(getHealAmount() + " Food");
		par3List.add(getSaturationModifier() + " Saturation");
		if(isWolfsFavoriteMeat())
			par3List.add("Suitable for Wolves");
		float speed = 32F / (float) getMaxItemUseDuration(par1ItemStack);
		if(speed > 1)
			par3List.add(speed + " Times Faster");
		if(speed < 1)
			par3List.add((1 / speed) + " Times Slower");
	}

}
