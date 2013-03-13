package xolova.blued00r.divinerpg.misc;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import xolova.blued00r.divinerpg.DivineRPG;

public class LivingDeathEventHandler
{
    public void onLivingDeathEvent(LivingDeathEvent e)
    {
        if (e.entityLiving.worldObj.getWorldInfo().getDimension() == DivineRPG.arcanaID)
        {
            if (e.source.getEntity() instanceof EntityPlayer)
            {
                InventoryPlayer var1 = ((EntityPlayer) e.source.getEntity()).inventory;

                if (var1.hasItem(DivineRPG.collector.itemID))
                {
                    for (int i = 0; i < 64; i++)
                    {
                        if (var1.getStackInSlot(i).itemID == DivineRPG.collector.itemID)
                        {
                            var1.getStackInSlot(i).damageItem(1, (EntityLiving) e.source.getEntity());
                        }
                    }
                }
            }
        }
    }
}
