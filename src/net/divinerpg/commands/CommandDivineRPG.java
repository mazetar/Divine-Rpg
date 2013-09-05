package net.divinerpg.commands;

import net.divinerpg.utils.helpers.DimensionRegistry;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class CommandDivineRPG extends CommandBase
{
	@Override
	public String getCommandName() 
	{
		return "DivineRPG";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) 
	{
		if(args[0].matches("Iceika"))
		{
			EntityPlayerMP playerMP = (EntityPlayerMP) sender;
			if(playerMP.dimension == 0)
				playerMP.travelToDimension(DimensionRegistry.IceikaID);
			else
				playerMP.travelToDimension(0);
		}
		if(args[0].matches("Azurite"))
		{
			EntityPlayerMP playerMP = (EntityPlayerMP) sender;
				playerMP.travelToDimension(DimensionRegistry.AzuriteID);
		}
		if(args[0].matches("Dravite"))
		{
			EntityPlayerMP playerMP = (EntityPlayerMP) sender;
			if(playerMP.dimension == 0)
				playerMP.travelToDimension(DimensionRegistry.DraviteID);
			else
				playerMP.travelToDimension(0);
		}
	}

    @Override
    public String getCommandUsage(ICommandSender icommandsender) {
        // TODO NPE is here, need to be updated!
        return null;
    }
}
