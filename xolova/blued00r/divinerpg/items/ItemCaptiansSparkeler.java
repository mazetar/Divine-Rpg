package xolova.blued00r.divinerpg.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityBlitzDense;
import xolova.blued00r.divinerpg.entities.projectile.EntitySparkler;
import xolova.blued00r.divinerpg.entities.vethea.EntityBouncingProjectile;
import xolova.blued00r.divinerpg.misc.ArcanaList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCaptiansSparkeler extends Item
{
    private int weaponDamage;

    public ItemCaptiansSparkeler(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 1;
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	if (!var2.isRemote && ArcanaList.get(var3.username).arcanaUse(15))
    	{
    		var2.playSoundAtEntity(var3, "xolovon.Sparkler", 1.0F, 1.0F);
    		var2.spawnEntityInWorld(new EntitySparkler(var2, var3));
    	}
    	return var1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return this.weaponDamage;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("7 Arcana");
        par3List.add("26 Ranged Damage");
        //par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}