package xolova.blued00r.divinerpg.misc;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumGameType;
import cpw.mods.fml.common.IPlayerTracker;

public class ModPlayerTracker implements IPlayerTracker
{

	@Override
	public void onPlayerLogin(EntityPlayer player) 
	{

	}

	@Override
	public void onPlayerLogout(EntityPlayer player) 
	{
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {}
	@Override
	public void onPlayerRespawn(EntityPlayer player) {}
}
