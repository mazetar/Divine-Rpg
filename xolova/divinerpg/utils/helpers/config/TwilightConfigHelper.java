package xolova.divinerpg.utils.helpers.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


public class TwilightConfigHelper 
{
	public static int TwilightStoneID;

	public static int DraviteGrassID;
	public static int DraviteDirtID;
	public static int DraviteLogsID;
	public static int DraviteLeavesID;
	public static int DraviteOreID;
	
	public static int AzuriteGrassID;
	public static int AzuriteDirtID;
	public static int AzuriteLogsID;
	public static int AzuriteLeavesID;
	public static int AzuriteOreID;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
		int id = 175;
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGTwilight.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		TwilightStoneID = config.getBlock("Twilight Stone", id++).getInt();
		
		DraviteGrassID = config.getBlock("Dravite Grass", id++).getInt();
		DraviteDirtID = config.getBlock("Dravite Dirt", id++).getInt();
		DraviteLogsID = config.getBlock("Dravite Logs", id++).getInt();
		DraviteLeavesID = config.getBlock("Dravite Leaves", id++).getInt();
		DraviteOreID = config.getBlock("Dravite Ore", id++).getInt();
		
		AzuriteGrassID = config.getBlock("Azurite Grass", id++).getInt();
		AzuriteDirtID = config.getBlock("Azurite Dirt", id++).getInt();
		AzuriteLogsID = config.getBlock("Azurite Logs", id++).getInt();
		AzuriteLeavesID = config.getBlock("Azurite Leaves", id++).getInt();
		AzuriteOreID = config.getBlock("Azurite Ore", id++).getInt();
		
		config.save();
	}
}
