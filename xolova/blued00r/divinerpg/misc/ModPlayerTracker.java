package xolova.blued00r.divinerpg.misc;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.generation.vethea.WorldProviderVethea;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.EnumGameType;
import cpw.mods.fml.common.IPlayerTracker;

public class ModPlayerTracker implements IPlayerTracker
{
	private NBTTagCompound data;
	private WorldProviderVethea vethea;
	
	@Override
	public void onPlayerLogin(EntityPlayer player) 
	{

	}

	@Override
	public void onPlayerLogout(EntityPlayer player) 
	{
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) 
	{
		if(player != null)
		{
			if(player.dimension == DivineRPG.vetheaID)
			{
				data = player.getEntityData().getCompoundTag(player.PERSISTED_NBT_TAG);
				if(data != null)
				{
			        data.setTag("InventoryOverworld", player.inventory.writeToNBT(new NBTTagList()));
			        player.inventory.clearInventory(-1, -1);
			        data.getTag("InventoryVethea");
				}
			}
		}
	}
	@Override
	public void onPlayerRespawn(EntityPlayer player) {}
}
