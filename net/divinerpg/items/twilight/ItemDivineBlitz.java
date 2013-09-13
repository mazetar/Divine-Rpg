package net.divinerpg.items.twilight;

import java.util.List;

import net.divinerpg.entities.twilight.projectile.EntityBlitzAugite;
import net.divinerpg.entities.twilight.projectile.EntityBlitz;
import net.divinerpg.items.ItemDivine;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineBlitz extends ItemDivine
{
    private int weaponDamage;
    private Item ammo;

    public ItemDivineBlitz(int id, int dmg, Item ammoItem)
    {
        super(id);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = dmg;
        this.setCreativeTab(CreativeTabs.tabCombat);
        ammo = ammoItem;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer player)
    {
        boolean var4 = player.capabilities.isCreativeMode;

        if (!var4 && !player.inventory.hasItem(TwilightItemHelper.AugiteDust.itemID))
        {
            return var1;
        }
        else
        {
            var2.playSoundAtEntity(player, "xolovon.blitz", 1.0F, 1.0F);
            if (player.inventory.consumeInventoryItem(ammo.itemID)) {
                var2.spawnEntityInWorld(new EntityBlitz(var2, player, weaponDamage));
                var1.damageItem(1, player);
        }
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
    public void addInformation(ItemStack item, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(weaponDamage + " Ranged Damage");
        par3List.add("Ammo: " + ammo.getLocalizedName(new ItemStack(ammo)));
        par3List.add(item.getMaxDamage() - item.getItemDamage() + " Uses");
    }
}
