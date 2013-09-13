package net.divinerpg.items.vethea;

import java.util.List;

import net.divinerpg.entities.vethea.projectile.EntityVetheanCannonShot;
import net.divinerpg.items.ItemDivine;
import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanCannon extends ItemDivine
{
    protected int damage;

    public ItemVetheanCannon(int par1, int par2, String par3)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.damage = par2;
        this.setUnlocalizedName(par3);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote && (par3.capabilities.isCreativeMode || par3.inventory.consumeInventoryItem(VetheaItemHelper.acidfire.itemID)))
        {
            par2.playSoundAtEntity(par3, "xolovon.blitz", 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityVetheanCannonShot(par2, par3, this.damage));
        }

        return par1;
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
    public int getDamageVsEntity(Entity par1)
    {
        return 1;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.damage + " Ranged Damage");
        par3List.add("Ammo: Acidfire");
        par3List.add("\u00a72Vethean");
    }
}