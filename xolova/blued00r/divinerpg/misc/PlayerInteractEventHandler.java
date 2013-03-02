package xolova.blued00r.divinerpg.misc;

import java.util.List;

import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityConstructor;

public class PlayerInteractEventHandler
{
    @ForgeSubscribe
    public void onPlayerInteractEvent(PlayerInteractEvent e)
    {
        if (e.useBlock != Result.DENY && e.action == Action.RIGHT_CLICK_BLOCK && e.hasResult())
        {
            List list = e.entityPlayer.worldObj.getLoadedEntityList();

            for (int i = 0; i < list.size(); i++)
            {
                if (list.get(i) instanceof EntityConstructor)
                {
                    ((EntityConstructor) list.get(i)).teleportToEntity(e.entityPlayer, e.x, e.y, e.z);
                }
            }
        }
    }
}
