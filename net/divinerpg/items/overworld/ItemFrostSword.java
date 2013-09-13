package net.divinerpg.items.overworld;

import java.util.List;

import net.divinerpg.items.core.DivineSword;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFrostSword extends DivineSword
{

	public ItemFrostSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxDamage(5000);
	}
	
	@Override
	public boolean hitEntity(ItemStack item,
	        EntityLivingBase entity, EntityLivingBase e) {
	    entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 1));
        item.damageItem(1, e);
        return true;
	}
	
    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add("On Hit: Slows for 2 seconds");
    }

}