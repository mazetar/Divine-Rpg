package xolova.divinerpg.items.vethea;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class ItemDreamPowder extends Item
{
	public ItemDreamPowder(int par1)
	{
		super(par1);
		this.maxStackSize=1;
	}
	
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
        {
            return false;
        }
        else if (player.canPlayerEdit(x, y, z, var7, itemstack) && player.canPlayerEdit(x, y + 1, z, var7, itemstack))
        {
            int var11 = world.getBlockId(x, y, z);
            int b = TwilightBlockHelper.AugiteBlock.blockID;

            if (var11 == b && world.isAirBlock(x, y + 1, z))
            {
            	if(world.getBlockId(x, y, z) == b && world.getBlockId(x, y + 4, z) == b && world.getBlockId(x, y + 3, z - 1) == b && world.getBlockId(x, y + 3, z + 1) == b
            		&& world.getBlockId(x, y + 2, z - 2) == b && world.getBlockId(x, y + 2, z + 2) == b && world.getBlockId(x, y + 1, z - 1) == b && world.getBlockId(x, y + 1, z + 1) == b)
            	{            		
            		world.setBlock(x, y + 1, z, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x, y + 2, z, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x, y + 3, z, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x, y + 2, z + 1, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x, y + 2, z - 1, VetheaBlockHelper.vetheaPortal.blockID);
                    return true;
            	}
            	else if(world.getBlockId(x, y, z) == b && world.getBlockId(x, y + 4, z) == b && world.getBlockId(x - 1, y + 3, z) == b && world.getBlockId(x + 1, y + 3, z) == b
                	 && world.getBlockId(x - 2, y + 2, z) == b && world.getBlockId(x + 2, y + 2, z) == b && world.getBlockId(x - 1, y + 1, z) == b && world.getBlockId(x + 1, y + 1, z) == b)
            	{
            		world.setBlock(x, y + 1, z, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x, y + 2, z, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x, y + 3, z, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x + 1, y + 2, z, VetheaBlockHelper.vetheaPortal.blockID);
            		world.setBlock(x - 1, y + 2, z, VetheaBlockHelper.vetheaPortal.blockID);
            		return true;
            	}
            	else
            		return false;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
