package net.divinerpg.items.arcana;

import java.util.List;

import net.divinerpg.items.core.ItemDivineRPGSword;
import net.divinerpg.utils.helpers.ArcanaHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemShadowSword extends ItemDivineRPGSword
{
    private int weaponDamage;

    public ItemShadowSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 24;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack var1, EntityLiving var2, EntityLivingBase var3)
    {
        if (ArcanaHelper.useBar((EntityPlayer)var3, 12))
        {
    		var3.worldObj.playSoundAtEntity(var3, "xolovon.ShadowSaber", 1.0F, 1.0F);
        	var3.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5 * 20, 1));
        }
        return true;
    }

    public boolean onBlockDestroyed(ItemStack var1, int var2, int var3, int var4, int var5, EntityLivingBase var6)
    {
        if (ArcanaHelper.useBar((EntityPlayer)var6, 12))
        {
        	return true;
        }
        return false;
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return weaponDamage;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.block;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        return var1;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	par3List.add("12 Arcana");
    	par3List.add("24 Melee Damage");
    	par3List.add("Speeds up player when used");
    	
    }
}