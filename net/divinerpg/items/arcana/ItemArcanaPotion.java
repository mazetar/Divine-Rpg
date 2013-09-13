package net.divinerpg.items.arcana;

import net.divinerpg.items.ItemDivine;
import net.divinerpg.utils.helpers.ArcanaHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArcanaPotion extends ItemDivine
{

	public ItemArcanaPotion(int id)
	{
		super(id);
	}

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	if(var1.itemID == ArcanaItemHelper.weakArcanaPotion.itemID)
    	{
    		ArcanaHelper.regen(var3.username, 100);
    		--var1.stackSize;
    	}
    	
    	if(var1.itemID == ArcanaItemHelper.strongArcanaPotion.itemID)
    	{
    		ArcanaHelper.regen(var3.username, 200);
    		--var1.stackSize;
    	}
    	
    	
		return var1;
    }
}
