package xolova.divinerpg.items.twilight;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.entities.twilight.projectile.EntityBlitzDravite;
import xolova.divinerpg.utils.helpers.item.TwilightItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlizDravite extends Item
{
    private int weaponDamage;

    public ItemBlizDravite(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 14;
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(TwilightItemHelper.DraviteDust.itemID))
        {
            return var1;
        }
        else
        {
            var2.playSoundAtEntity(var3, "xolovon.blitz", 1.0F, 1.0F);
            var3.inventory.consumeInventoryItem(TwilightItemHelper.DraviteDust.itemID);
            var2.spawnEntityInWorld(new EntityBlitzDravite(var2, var3));
            var1.damageItem(1, var3);
            return var1;
        }
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
        par3List.add("14 Ranged Damage");
        par3List.add("Ammo: Dravite Dust");
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
