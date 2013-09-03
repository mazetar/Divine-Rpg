package net.divinerpg.items.overworld;

import java.util.List;

import net.divinerpg.items.core.ItemDivineRPGSword;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMoltenSword extends ItemDivineRPGSword
{

	public ItemMoltenSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxDamage(5000);
	}
	
	/**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack var1, EntityLiving var2, EntityLiving var3)
    {
        var2.setFire(2);
        var1.damageItem(1, var3);
        return true;
    }
	
	public int getDamageVsEntity (Entity par1)
	{
		return 10;
	}

    @SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add("On Hit: Burns for 2 seconds");
    }

}
