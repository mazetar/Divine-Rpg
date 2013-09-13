package net.divinerpg.items.core;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.divinerpg.api.IItemDivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class DivineSword extends ItemSword implements IItemDivineRPG {

	boolean unbreakable;
	float dmg;
	
	public DivineSword(int id, EnumToolMaterial toolMaterial) {
		this(id, toolMaterial, false);
	}
	
	public DivineSword(int id, EnumToolMaterial toolMaterial, boolean unbreakable) {
		super(id, toolMaterial);
		this.unbreakable = unbreakable;
		dmg = toolMaterial.getDamageVsEntity();
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
	   this.itemIcon = par1IconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + this.func_111208_A());
	}
	
	
	public DivineSword setTextureName(String name){
	    func_111206_d(name);
	    return this;
	}
	
}
