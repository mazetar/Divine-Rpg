package xolova.divinerpg.items.core;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import xolova.divinerpg.api.IItemDivineRPG;
import xolova.divinerpg.utils.helpers.IconHelper;

public class ItemDivineRPGSword extends ItemSword implements IItemDivineRPG {

	boolean unbreakable;
	int dmg;
	
	public ItemDivineRPGSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		this(par1, par2EnumToolMaterial, false);
	}
	
	public ItemDivineRPGSword(int par1, EnumToolMaterial par2EnumToolMaterial, boolean unbreakable) {
		super(par1 - 256, par2EnumToolMaterial);
		this.unbreakable = unbreakable;
		dmg = par2EnumToolMaterial.getDamageVsEntity();
	}
	
	int index;
	int sheet;
	
	public ItemDivineRPGSword setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}
	
	@Override
	public int getDamageVsEntity(Entity par1Entity) {
		return dmg;
	}

	public ItemDivineRPGSword setIconIndex(int sheet, int x, int y) {
		return setIconIndex(sheet, (x + y * 16));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
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

	@Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
        if(!unbreakable)
        	par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
	
	@Override
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving) {
        if (!unbreakable && (double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
            par1ItemStack.damageItem(2, par7EntityLiving);

        return true;
    }
    
    @Override
    public boolean isItemTool(ItemStack par1ItemStack) {
    	return true;
    }
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(par1ItemStack.getDamageVsEntity(par2EntityPlayer) + " Melee Damage");
        par3List.add(!unbreakable ? (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
    }
}
