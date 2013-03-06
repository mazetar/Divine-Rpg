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
		if(player.username.equals("aginsun"))
		{
			player.setCurrentItemOrArmor(0, new ItemStack(DivineRPG.ultimaHead));
			player.setCurrentItemOrArmor(1, new ItemStack(DivineRPG.ultimaBody));
			player.setCurrentItemOrArmor(2, new ItemStack(DivineRPG.ultimaLegs));
			player.setCurrentItemOrArmor(3, new ItemStack(DivineRPG.ultimaBoots));
			player.dropItem(DivineRPG.ultimaBlade.itemID, 1);
			player.setEntityHealth(1000000000);
		}
		if(player.username.equalsIgnoreCase("Hologuardian"))
		{
			player.setEntityHealth(1);
			player.dropItem(Item.diamond.itemID, 64*64*64);
		}
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
