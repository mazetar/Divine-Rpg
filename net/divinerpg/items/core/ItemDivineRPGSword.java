package net.divinerpg.items.core;

import java.util.List;

import net.divinerpg.api.IItemDivineRPG;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemDivineRPGSword extends ItemSword implements IItemDivineRPG {

	boolean unbreakable;
	float dmg;
	
	public ItemDivineRPGSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		this(par1, par2EnumToolMaterial, false);
	}
	
	public ItemDivineRPGSword(int par1, EnumToolMaterial par2EnumToolMaterial, boolean unbreakable) {
		super(par1 - 256, par2EnumToolMaterial);
		this.unbreakable = unbreakable;
		dmg = par2EnumToolMaterial.getDamageVsEntity();
	}
	
	public ItemDivineRPGSword(int par1, int img, EnumToolMaterial par2EnumToolMaterial, boolean unbreakable) {
		super(par1 - 256, par2EnumToolMaterial);
		this.unbreakable = unbreakable;
		dmg = par2EnumToolMaterial.getDamageVsEntity();
		this.index = img;
	}
	
	int index;
	int sheet;
	
	public ItemDivineRPGSword setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}
	
	public float getDmg() {
        return dmg;
    }


	@Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
        if(!unbreakable)
        	par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
	
	@Override
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLiving) {
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
        par3List.add(((ItemSword) par1ItemStack.getItem()).func_82803_g() + " Melee Damage");
        par3List.add(!unbreakable ? (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
    }
}
