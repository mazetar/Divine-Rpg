package net.divinerpg.blocks.twilight;

import java.util.Random;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockTwilightOre extends BlockDivine
{
	public BlockTwilightOre(int var1)
    {
        super(var1, Material.rock);
    }
	
    public boolean isGenMineableReplaceable(World var1, int var2, int var3, int var4)
    {
        return this.blockID == TwilightBlockHelper.TwilightStone.blockID;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
    	return TwilightBlockHelper.DraviteOre.blockID;
        //return this.blockID == TwilightBlockHelper.serenityOre.blockID ? TwilightBlockHelper.serenityFragments.itemID : (this.blockID == TwilightBlockHelper.azuriteOre.blockID ? TwilightBlockHelper.azuriteFragments.itemID : (this.blockID == TwilightBlockHelper.energyOre.blockID ? TwilightBlockHelper.energyFragments.itemID : (this.blockID == TwilightBlockHelper.mythilOre.blockID ? TwilightBlockHelper.mythrilFragments.itemID : (this.blockID == TwilightBlockHelper.denseOre.blockID ? TwilightBlockHelper.denseFragments.itemID : this.blockID))));
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
    
    /*public boolean removeBlockByPlayer(World world, EntityPlayer player, int x, int y, int z) TODO
    {
    	if (player.inventory.armorInventory[0] != null
    			&& player.inventory.armorInventory[1] != null
    			&& player.inventory.armorInventory[2] != null
    			&& player.inventory.armorInventory[3] != null)
    	{
    		if (player.inventory.armorInventory[0].itemID == DivineRPG.serenityBoots.itemID
    				&& player.inventory.armorInventory[1].itemID == DivineRPG.serenityLegs.itemID
    				&& player.inventory.armorInventory[2].itemID == DivineRPG.serenityBody.itemID
    				&& player.inventory.armorInventory[3].itemID == DivineRPG.serenityHead.itemID
    				&& !player.worldObj.isRemote
    				&& EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, player.inventory.getCurrentItem()) == 0)
    		{
    			this.dropBlockAsItem_do(world, x, y, z, new ItemStack(this.idDropped(0, player.getRNG(), 0), 3, 0));
    		}
    	}
        return world.setBlockWithNotify(x, y, z, 0);
    }*/
}
