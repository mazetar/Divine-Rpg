package xolova.blued00r.divinerpg.misc;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityConstructor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xolova.blued00r.divinerpg.DivineRPG;

public class PlayerEventHandler
{
	@SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onPlayerInteractEvent(PlayerInteractEvent e)
    {
        if (e.action == Action.RIGHT_CLICK_BLOCK && e.entityPlayer.inventory.getCurrentItem() != null)
        {
        	if (e.entityPlayer.inventory.getCurrentItem().getItem() instanceof ItemBlock)
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
}
