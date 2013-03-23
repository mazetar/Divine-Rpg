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
	
	public static int UviteGrassID;
	public static int UviteDirtID;
	public static int UviteLogsID;
	public static int UviteLeavesID;
	public static int UviteOreID;
	
	public static int MythrilGrassID;
	public static int MythrilDirtID;
	public static int MythrilLogsID;
	public static int MythrilLeavesID;
	public static int MythrilOreID;
	
	public static int AugiteGrassID;
	public static int AugiteDirtID;
	public static int AugiteLogsID;
	public static int AugiteLeavesID;
	public static int AugiteOreID;
	public static int id = 500;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
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
		
		UviteGrassID = config.getBlock("Uvite Grass", id++).getInt();
		UviteDirtID = config.getBlock("Uvite Dirt", id++).getInt();
		UviteLogsID = config.getBlock("Uvite Logs", id++).getInt();
		UviteLeavesID = config.getBlock("Uvite Leaves", id++).getInt();
		UviteOreID = config.getBlock("Uvite Ore", id++).getInt();
		
		MythrilGrassID = config.getBlock("Mythril Grass", id++).getInt();
		MythrilDirtID = config.getBlock("Mythril Dirt", id++).getInt();
		MythrilLogsID = config.getBlock("Mythril Logs", id++).getInt();
		MythrilLeavesID = config.getBlock("Mythril Leaves", id++).getInt();
		MythrilOreID = config.getBlock("Mythril Ore", id++).getInt();
		
		AugiteGrassID = config.getBlock("Augite Grass", id++).getInt();
		AugiteDirtID = config.getBlock("Augite Dirt", id++).getInt();
		AugiteLogsID = config.getBlock("Augite Logs", id++).getInt();
		AugiteLeavesID = config.getBlock("Augite Leaves", id++).getInt();
		AugiteOreID = config.getBlock("Augite Ore", id++).getInt();
		
		initConfigItems(event, config);
		
		config.save();
	}
	
	public static int DraviteGemID;
	public static int DraviteChunkID;
	public static int DraviteFragmentsID;
	public static int DraviteDustID;
	public static int DraviteBladeID;
	public static int DravitePhaserID;
	public static int DraviteBlitzID;
	public static int DraviteBowID;
	public static int DraviteHelmetID;
	public static int DraviteBootsID;
	public static int DravitelegsID;
	public static int DraviteChestID;
	public static int DraviteSlicerID;
	public static int DraviteSoulID;
	
	public static int idItems = 5000;
	
	public static void initConfigItems(FMLPreInitializationEvent event, Configuration config)
	{
		DraviteGemID = config.getItem("Dravite Gem", idItems++).getInt();
		DraviteChunkID = config.getItem("Dravite Chunk", idItems++).getInt();
		DraviteFragmentsID = config.getItem("Dravite Fragments", idItems++).getInt();
		DraviteDustID = config.getItem("Dravite Dust", idItems++).getInt();
		DraviteBladeID = config.getItem("Dravite Blade", idItems++).getInt();
		DravitePhaserID = config.getItem("Dravite Phaser", idItems++).getInt();
		DraviteBlitzID = config.getItem("Dravite Blitz", idItems++).getInt();
		DraviteBowID = config.getItem("Dravite Bow", idItems++).getInt();
		DraviteHelmetID = config.getItem("Dravite Helmet", idItems++).getInt();
		DraviteBootsID = config.getItem("Dravite Boots", idItems++).getInt();
		DravitelegsID = config.getItem("Dravite Legs", idItems++).getInt();
		DraviteChestID = config.getItem("Dravite Chest", idItems++).getInt();
		DraviteSlicerID = config.getItem("Dravite Slicer", idItems++).getInt();
		DraviteSoulID = config.getItem("Dravite Soul", idItems++).getInt();
	}
}
