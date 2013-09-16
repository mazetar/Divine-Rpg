package net.divinerpg.items.overworld;

import java.util.List;

import net.divinerpg.entities.overworld.projectile.EntityBatWing;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemScythe extends Item
{
    public ItemScythe(int var1)
    {
        super(var1);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var7 = var3.capabilities.isCreativeMode;

        if (var7 || var3.inventory.hasItem(OverworldItemHelper.scythe.itemID))
        {
            var2.playSoundEffect(var3.posX, var3.posY, var3.posZ, "xolovon.deeplaugh", 5.0F, 1.0F);
            EntityBatWing var8 = new EntityBatWing(var2, var3);
            if (var3.inventory.armorInventory[0] != null
            	&& var3.inventory.armorInventory[1] != null
            	&& var3.inventory.armorInventory[2] != null
            	&& var3.inventory.armorInventory[3] != null)
            {
            	if (var3.inventory.armorInventory[0].itemID == OverworldItemHelper.jackOManBoots.itemID
                    	&& var3.inventory.armorInventory[1].itemID == OverworldItemHelper.jackOManLegs.itemID
                    	&& var3.inventory.armorInventory[2].itemID == OverworldItemHelper.jackOManBody.itemID
                    	&& var3.inventory.armorInventory[3].itemID == OverworldItemHelper.jackOManHead.itemID)
            	{
            		var8.damage *= 4;
            	}
            }
            var2.spawnEntityInWorld(var8);
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
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("4 Ranged Damage");
        par3List.add("Confusion");
        par3List.add("Infinite Uses");
        par3List.add(this.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
