package net.divinerpg.blocks;

import java.util.Random;

import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DivineOre extends BlockDivine
{
    int dropped;
	public DivineOre(int var1, int dropped)
    {
        super(var1, Material.rock);
        this.dropped = dropped;
    }
	
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return this.dropped;
    }
    
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
        {
            int var3 = par2Random.nextInt(par1 + 2) - 1;

            if (var3 < 0)
            {
                var3 = 0;
            }

            return this.quantityDropped(par2Random) * (var3 + 1);
        }
        else
        {
            return this.quantityDropped(par2Random);
        }
    }
    
    public boolean removeBlockByPlayer(World world, EntityPlayer player, int x, int y, int z) 
    {
    	if (player.inventory.armorInventory[0] != null
    			&& player.inventory.armorInventory[1] != null
    			&& player.inventory.armorInventory[2] != null
    			&& player.inventory.armorInventory[3] != null)
    	{
    		if (player.inventory.armorInventory[0].itemID == TwilightItemHelper.DraviteBoots.itemID
    				&& player.inventory.armorInventory[1].itemID == TwilightItemHelper.Dravitelegs.itemID
    				&& player.inventory.armorInventory[2].itemID == TwilightItemHelper.DraviteChest.itemID
    				&& player.inventory.armorInventory[3].itemID == TwilightItemHelper.DraviteHelmet.itemID
    				&& !player.worldObj.isRemote
    				&& EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, player.inventory.getCurrentItem()) == 0)
    		{
    			this.dropBlockAsItem_do(world, x, y, z, new ItemStack(this.idDropped(0, player.getRNG(), 0), 3, 0));
    		}
    	}
    	return world.setBlock(x, y, z, 0, 0, 3);
    }
}
