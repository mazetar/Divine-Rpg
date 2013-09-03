package net.divinerpg.items.overworld;

import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHealingStone extends Item
{
    public ItemHealingStone(int var1)
    {
        super(var1);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer player)
    {
        if (player.func_110143_aJ() + 20 > 20)
        {
            var2.playSoundAtEntity(player, "xolovon.HealingStone", 1.0F, 1.0F);
            player.setEntityHealth(20);
            player.inventory.consumeInventoryItem(OverworldItemHelper.healingStone.itemID);
        }
        else
        {
            player.setEntityHealth(player.func_110143_aJ() + 20);
        }

        return var1;
    }
}
