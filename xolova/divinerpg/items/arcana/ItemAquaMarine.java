package xolova.divinerpg.items.arcana;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAquaMarine extends Item
{

	public ItemAquaMarine(int par1)
	{
		super(par1);
		this.setMaxDamage(10);
	}
	
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	if(!par3World.isRemote && par3World.isAirBlock(par4, par5 + 1, par6))
    	{
    		par3World.func_94575_c(par4, par5 + 1, par6, Block.waterStill.blockID);
    		par1ItemStack.damageItem(1, par2EntityPlayer);
    		return true;
    	}
    	   	
    	
        return false;
    }

}
