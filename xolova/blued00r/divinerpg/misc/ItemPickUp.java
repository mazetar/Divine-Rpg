package xolova.blued00r.divinerpg.misc;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class ItemPickUp
{
	@ForgeSubscribe
	public void onItemPickUp(EntityItemPickupEvent event)
	{
        if (event.entityPlayer !=null)
        {
            if (event.item instanceof EntityItem)
            {
            	
            }
        }
    }
	
}
