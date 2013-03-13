package xolova.blued00r.divinerpg.items.vethea;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.projectile.EntityBlitzAzurite;
import xolova.blued00r.divinerpg.entities.vethea.EntityVetheanCannonShot;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanCannon extends Item
{
    protected int damage;

    public ItemVetheanCannon(int par1, int par2, String name)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.damage = par2;
		this.setItemName(name);
		this.setTextureFile("/Xolovon4.png");
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote && (par3.capabilities.isCreativeMode || par3.inventory.consumeInventoryItem(DivineRPG.acidfire.itemID)))
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
        par3List.add("Ammo: " + DivineRPG.acidfire.getItemName());
        par3List.add("\u00a72Vethean");
    }
}