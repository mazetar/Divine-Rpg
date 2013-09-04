package net.divinerpg.utils.helpers.config;

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
	public static int DraviteBlockID;
	public static int DravitePortalID;
	
	public static int AzuriteGrassID;
	public static int AzuriteDirtID;
	public static int AzuriteLogsID;
	public static int AzuriteLeavesID;
	public static int AzuriteOreID;
	public static int AzuriteVinesID;
	public static int AzuriteBlockID;
	public static int AzuritePortalID;
	
	public static int UviteGrassID;
	public static int UviteDirtID;
	public static int UviteLogsID;
	public static int UviteLeavesID;
	public static int UviteOreID;
	public static int UviteBlockID;
	public static int UvitePortalID;
	
	public static int MythrilGrassID;
	public static int MythrilDirtID;
	public static int MythrilLogsID;
	public static int MythrilLeavesID;
	public static int MythrilOreID;
	public static int MythrilBlockID;
	public static int MythrilPortalID;
	
	public static int AugiteGrassID;
	public static int AugiteDirtID;
	public static int AugiteLogsID;
	public static int AugiteLeavesID;
	public static int AugiteOreID;
	public static int AugiteBlockID;
	public static int AugitePortalID;
	
	public static int divineRockID;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGTwilight.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		int id = 569;
		
		TwilightStoneID = config.getTerrainBlock("WorldGen Blocks", "TwilightStone", 191, "").getInt();
		divineRockID = config.getBlock("DivineRock", ++id).getInt();

		DraviteGrassID = config.getTerrainBlock("WorldGen Blocks", "Dravite Grass", 192, "").getInt();
		DraviteDirtID = config.getTerrainBlock("WorldGen Blocks", "Dravite Dirt", 193, "").getInt();
		DraviteLogsID = config.getBlock("Dravite Logs", ++id).getInt();
		DraviteLeavesID = config.getBlock("Dravite Leaves", ++id).getInt();
		DraviteOreID = config.getBlock("Dravite Ore", ++id).getInt();
		DraviteBlockID = config.getBlock("Dravite Block", ++id).getInt();
		DravitePortalID = config.getBlock("Dravite Portal", ++id).getInt();
		
		AzuriteGrassID = config.getTerrainBlock("WorldGen Blocks", "Azurite Grass", 194, "").getInt();
		AzuriteDirtID = config.getTerrainBlock("WorldGen Blocks", "Azurite Dirt", 195, "").getInt();
		AzuriteLogsID = config.getBlock("Azurite Logs", ++id).getInt();
		AzuriteLeavesID = config.getBlock("Azurite Leaves", ++id).getInt();
		AzuriteOreID = config.getBlock("Azurite Ore", ++id).getInt();
		AzuriteVinesID = config.getBlock("Azurite Vines", ++id).getInt();
		AzuriteBlockID = config.getBlock("Azurite Block", ++id).getInt();
		AzuritePortalID = config.getBlock("Azurite Portal", ++id).getInt();
		
		UviteGrassID = config.getTerrainBlock("WorldGen Blocks", "Uvite Grass", 196, "").getInt();
		UviteDirtID = config.getTerrainBlock("WorldGen Blocks", "Uvite Dirt", 197, "").getInt();
		UviteLogsID = config.getBlock("Uvite Logs", ++id).getInt();
		UviteLeavesID = config.getBlock("Uvite Leaves", ++id).getInt();
		UviteOreID = config.getBlock("Uvite Ore", ++id).getInt();
		UviteBlockID = config.getBlock("Uvite Block", ++id).getInt();
		UvitePortalID = config.getBlock("Uvite Portal", ++id).getInt();
		
		MythrilGrassID = config.getTerrainBlock("WorldGen Blocks", "Mythril Grass", 198, "").getInt();
		MythrilDirtID = config.getTerrainBlock("WorldGen Blocks", "Mythril Dirt", 199, "").getInt();
		MythrilLogsID = config.getBlock("Mythril Logs", ++id).getInt();
		MythrilLeavesID = config.getBlock("Mythril Leaves", ++id).getInt();
		MythrilOreID = config.getBlock("Mythril Ore", ++id).getInt();
		MythrilBlockID = config.getBlock("Mythril Block", ++id).getInt();
		MythrilPortalID  = config.getBlock("Mythril Portal", ++id).getInt();
		
		AugiteGrassID = config.getTerrainBlock("WorldGen Blocks", "Augite Grass", 200, "").getInt();
		AugiteDirtID = config.getTerrainBlock("WorldGen Blocks", "Augite Dirt", 201, "").getInt();
		AugiteLogsID = config.getBlock("Augite Logs", ++id).getInt();
		AugiteLeavesID = config.getBlock("Augite Leaves", ++id).getInt();
		AugiteOreID = config.getBlock("Augite Ore", ++id).getInt();
		AugiteBlockID = config.getBlock("Augite Block", ++id).getInt();
		AugitePortalID = config.getBlock("Augite Portal", ++id).getInt();
		
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
	public static int draviteSparklesID;
	public static int DraviteShardsID;
	
	public static int UviteGemID;
	public static int UviteChunkID;
	public static int UviteFragmentsID;
	public static int UviteDustID;
	public static int UviteBladeID;
	public static int UvitePhaserID;
	public static int UviteBlitzID;
	public static int UviteBowID;
	public static int UviteHelmetID;
	public static int UviteBootsID;
	public static int UvitelegsID;
	public static int UviteChestID;
	public static int UviteSlicerID;
	public static int UviteSoulID;
	
	public static int AzuriteGemID;
	public static int AzuriteChunkID;
	public static int AzuriteFragmentsID;
	public static int AzuriteDustID;
	public static int AzuriteBladeID;
	public static int AzuritePhaserID;
	public static int AzuriteBlitzID;
	public static int AzuriteBowID;
	public static int AzuriteHelmetID;
	public static int AzuriteBootsID;
	public static int AzuritelegsID;
	public static int AzuriteChestID;
	public static int AzuriteSlicerID;
	public static int AzuriteSoulID;
	public static int AzuriteArrowID;
	
	public static int MythrilGemID;
	public static int MythrilChunkID;
	public static int MythrilFragmentsID;
	public static int MythrilDustID;
	public static int MythrilBladeID;
	public static int MythrilPhaserID;
	public static int MythrilBlitzID;
	public static int MythrilBowID;
	public static int MythrilHelmetID;
	public static int MythrilBootsID;
	public static int MythrillegsID;
	public static int MythrilChestID;
	public static int MythrilSlicerID;
	public static int MythrilSoulID;
	
	public static int AugiteGemID;
	public static int AugiteChunkID;
	public static int AugiteFragmentsID;
	public static int AugiteDustID;
	public static int AugiteBladeID;
	public static int AugitePhaserID;
	public static int AugiteBlitzID;
	public static int AugiteBowID;
	public static int AugiteHelmetID;
	public static int AugiteBootsID;
	public static int AugitelegsID;
	public static int AugiteChestID;
	public static int AugiteSlicerID;
	public static int AugiteSoulID;
	
	public static int HaliteBladeID;
	public static int HalitePhaserID;
	public static int HaliteBlitzID;
	public static int HaliteBowID;
	public static int HaliteHelmetID;
	public static int HaliteBootsID;
	public static int HalitelegsID;
	public static int HaliteChestID;
	public static int HaliteSlicerID;
	
	public static int FuryArrowID;
	public static int TwilightClockID;
	public static int TwilightBowID;
	public static int blueSeedsID;
	public static int magicMeatID;
	public static int empoweredMeatID;
	public static int enrichedMagicMeatID;
	public static int cookedEmpoweredMeatID;
	public static int purpleSeedsID;
	public static int pinkSeedsID;		
	public static int fireThrowerID;
	
	
	public static void initConfigItems(FMLPreInitializationEvent event, Configuration config)
	{
	    int id = OverworldConfigHelper.nextItemID;
        
		DraviteGemID = config.getItem("Dravite Gem", id++).getInt();
		DraviteChunkID = config.getItem("Dravite Chunk", id++).getInt();
		DraviteFragmentsID = config.getItem("Dravite Fragments", id++).getInt();
		DraviteDustID = config.getItem("Dravite Dust", id++).getInt();
		DraviteBladeID = config.getItem("Dravite Blade", id++).getInt();
		DravitePhaserID = config.getItem("Dravite Phaser", id++).getInt();
		DraviteBlitzID = config.getItem("Dravite Blitz", id++).getInt();
		DraviteBowID = config.getItem("Dravite Bow", id++).getInt();
		DraviteHelmetID = config.getItem("Dravite Helmet", id++).getInt();
		DraviteBootsID = config.getItem("Dravite Boots", id++).getInt();
		DravitelegsID = config.getItem("Dravite Legs", id++).getInt();
		DraviteChestID = config.getItem("Dravite Chest", id++).getInt();
		DraviteSlicerID = config.getItem("Dravite Slicer", id++).getInt();
		DraviteSoulID = config.getItem("Dravite Soul", id++).getInt();
		draviteSparklesID = config.getItem("Dravite Soul", id++).getInt();
		DraviteShardsID = config.getItem("Dravite Soul", id++).getInt();
		
		AzuriteGemID = config.getItem("Azurite Gem", id++).getInt();
		AzuriteChunkID = config.getItem("Azurite Chunk", id++).getInt();
		AzuriteFragmentsID = config.getItem("Azurite Fragments", id++).getInt();
		AzuriteDustID = config.getItem("Azurite Dust", id++).getInt();
		AzuriteBladeID = config.getItem("Azurite Blade", id++).getInt();
		AzuritePhaserID = config.getItem("Azurite Phaser", id++).getInt();
		AzuriteBlitzID = config.getItem("Azurite Blitz", id++).getInt();
		AzuriteBowID = config.getItem("Azurite Bow", id++).getInt();
		AzuriteHelmetID = config.getItem("Azurite Helmet", id++).getInt();
		AzuriteBootsID = config.getItem("Azurite Boots", id++).getInt();
		AzuritelegsID = config.getItem("Azurite Legs", id++).getInt();
		AzuriteChestID = config.getItem("Azurite Chest", id++).getInt();
		AzuriteSlicerID = config.getItem("Azurite Slicer", id++).getInt();
		AzuriteSoulID = config.getItem("Azurite Soul", id++).getInt();
		AzuriteArrowID = config.getItem("Dravite Soul", id++).getInt();
		
		UviteGemID = config.getItem("Uvite Gem", id++).getInt();
		UviteChunkID = config.getItem("Uvite Chunk", id++).getInt();
		UviteFragmentsID = config.getItem("Uvite Fragments", id++).getInt();
		UviteDustID = config.getItem("Uvite Dust", id++).getInt();
		UviteBladeID = config.getItem("Uvite Blade", id++).getInt();
		UvitePhaserID = config.getItem("Uvite Phaser", id++).getInt();
		UviteBlitzID = config.getItem("Uvite Blitz", id++).getInt();
		UviteBowID = config.getItem("Uvite Bow", id++).getInt();
		UviteHelmetID = config.getItem("Uvite Helmet", id++).getInt();
		UviteBootsID = config.getItem("Uvite Boots", id++).getInt();
		UvitelegsID = config.getItem("Uvite Legs", id++).getInt();
		UviteChestID = config.getItem("Uvite Chest", id++).getInt();
		UviteSlicerID = config.getItem("Uvite Slicer", id++).getInt();
		UviteSoulID = config.getItem("Uvite Soul", id++).getInt();
		
		MythrilGemID = config.getItem("Mythril Gem", id++).getInt();
		MythrilChunkID = config.getItem("Mythril Chunk", id++).getInt();
		MythrilFragmentsID = config.getItem("Mythril Fragments", id++).getInt();
		MythrilDustID = config.getItem("Mythril Dust", id++).getInt();
		MythrilBladeID = config.getItem("Mythril Blade", id++).getInt();
		MythrilPhaserID = config.getItem("Mythril Phaser", id++).getInt();
		MythrilBlitzID = config.getItem("Mythril Blitz", id++).getInt();
		MythrilBowID = config.getItem("Mythril Bow", id++).getInt();
		MythrilHelmetID = config.getItem("Mythril Helmet", id++).getInt();
		MythrilBootsID = config.getItem("Mythril Boots", id++).getInt();
		MythrillegsID = config.getItem("Mythril Legs", id++).getInt();
		MythrilChestID = config.getItem("Mythril Chest", id++).getInt();
		MythrilSlicerID = config.getItem("Mythril Slicer", id++).getInt();
		MythrilSoulID = config.getItem("Mythril Soul", id++).getInt();
		
		AugiteGemID = config.getItem("Augite Gem", id++).getInt();
		AugiteChunkID = config.getItem("Augite Chunk", id++).getInt();
		AugiteFragmentsID = config.getItem("Augite Fragments", id++).getInt();
		AugiteDustID = config.getItem("Augite Dust", id++).getInt();
		AugiteBladeID = config.getItem("Augite Blade", id++).getInt();
		AugitePhaserID = config.getItem("Augite Phaser", id++).getInt();
		AugiteBlitzID = config.getItem("Augite Blitz", id++).getInt();
		AugiteBowID = config.getItem("Augite Bow", id++).getInt();
		AugiteHelmetID = config.getItem("Augite Helmet", id++).getInt();
		AugiteBootsID = config.getItem("Augite Boots", id++).getInt();
		AugitelegsID = config.getItem("Augite Legs", id++).getInt();
		AugiteChestID = config.getItem("Augite Chest", id++).getInt();
		AugiteSlicerID = config.getItem("Augite Slicer", id++).getInt();
		AugiteSoulID = config.getItem("Augite Soul", id++).getInt();

		HaliteBladeID = config.getItem("Halite Blade", id++).getInt();
		HalitePhaserID = config.getItem("Halite Phaser", id++).getInt();
		HaliteBlitzID = config.getItem("Halite Blitz", id++).getInt();
		HaliteBowID = config.getItem("Halite Bow", id++).getInt();
		HaliteHelmetID = config.getItem("Halite Helmet", id++).getInt();
		HaliteBootsID = config.getItem("Halite Boots", id++).getInt();
		HalitelegsID = config.getItem("Halite Legs", id++).getInt();
		HaliteChestID = config.getItem("Halite Chest", id++).getInt();
		HaliteSlicerID = config.getItem("Halite Slicer", id++).getInt();
		
		FuryArrowID = config.getItem("FuryArrow", id++).getInt();
		TwilightClockID = config.getItem("TwilightClock", id++).getInt();
		TwilightBowID = config.getItem("TwilightBow", id++).getInt();
		blueSeedsID = config.getItem("blueSeeds", id++).getInt();
		magicMeatID = config.getItem("magicMeat", id++).getInt();
		empoweredMeatID = config.getItem("empoweredMeat", id++).getInt();
		enrichedMagicMeatID = config.getItem("enrichedMagicMeat", id++).getInt();
		cookedEmpoweredMeatID = config.getItem("cookedEmpoweredMeat", id++).getInt();
		purpleSeedsID = config.getItem("purpleSeeds", id++).getInt();
		pinkSeedsID = config.getItem("pinkSeeds", id++).getInt();		
		fireThrowerID = config.getItem("fireThrower", id++).getInt();
		
		OverworldConfigHelper.nextItemID = id;
	}
}
