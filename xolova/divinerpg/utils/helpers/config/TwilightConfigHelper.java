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
	public static int DraviteBlockID;
	public static int DravitePortalID;
	
	public static int AzuriteGrassID;
	public static int AzuriteDirtID;
	public static int AzuriteLogsID;
	public static int AzuriteLeavesID;
	public static int AzuriteOreID;
	public static int AzuriteVinesID;
	public static int AzuriteBlockID;
	
	public static int UviteGrassID;
	public static int UviteDirtID;
	public static int UviteLogsID;
	public static int UviteLeavesID;
	public static int UviteOreID;
	public static int UviteBlockID;
	
	public static int MythrilGrassID;
	public static int MythrilDirtID;
	public static int MythrilLogsID;
	public static int MythrilLeavesID;
	public static int MythrilOreID;
	public static int MythrilBlockID;
	
	public static int AugiteGrassID;
	public static int AugiteDirtID;
	public static int AugiteLogsID;
	public static int AugiteLeavesID;
	public static int AugiteOreID;
	public static int AugiteBlockID;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGTwilight.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		TwilightStoneID = config.getBlock("Twilight Stone", 189).getInt();
		
		DraviteGrassID = config.getBlock("Dravite Grass", 190).getInt();
		DraviteDirtID = config.getBlock("Dravite Dirt", 191).getInt();
		DraviteLogsID = config.getBlock("Dravite Logs", 649).getInt();
		DraviteLeavesID = config.getBlock("Dravite Leaves", 589).getInt();
		DraviteOreID = config.getBlock("Dravite Ore", 588).getInt();
		DraviteBlockID = config.getBlock("Dravite Block", 579).getInt();
		DravitePortalID = config.getBlock("Dravite Portal", 599).getInt();
		
		AzuriteGrassID = config.getBlock("Azurite Grass", 192).getInt();
		AzuriteDirtID = config.getBlock("Azurite Dirt", 193).getInt();
		AzuriteLogsID = config.getBlock("Azurite Logs", 652).getInt();
		AzuriteLeavesID = config.getBlock("Azurite Leaves", 591).getInt();
		AzuriteOreID = config.getBlock("Azurite Ore", 584).getInt();
		AzuriteVinesID = config.getBlock("Azurite Vines", 562).getInt();
		AzuriteBlockID = config.getBlock("Azurite Block", 580).getInt();
		
		UviteGrassID = config.getBlock("Uvite Grass", 194).getInt();
		UviteDirtID = config.getBlock("Uvite Dirt", 195).getInt();
		UviteLogsID = config.getBlock("Uvite Logs", 651).getInt();
		UviteLeavesID = config.getBlock("Uvite Leaves", 590).getInt();
		UviteOreID = config.getBlock("Uvite Ore", 585).getInt();
		UviteBlockID = config.getBlock("Uvite Block", 581).getInt();
		
		MythrilGrassID = config.getBlock("Mythril Grass", 196).getInt();
		MythrilDirtID = config.getBlock("Mythril Dirt", 197).getInt();
		MythrilLogsID = config.getBlock("Mythril Logs", 654).getInt();
		MythrilLeavesID = config.getBlock("Mythril Leaves", 592).getInt();
		MythrilOreID = config.getBlock("Mythril Ore", 586).getInt();
		MythrilBlockID = config.getBlock("Mythril Block", 582).getInt();
		
		AugiteGrassID = config.getBlock("Augite Grass", 198).getInt();
		AugiteDirtID = config.getBlock("Augite Dirt", 199).getInt();
		AugiteLogsID = config.getBlock("Augite Logs", 650).getInt();
		AugiteLeavesID = config.getBlock("Augite Leaves", 593).getInt();
		AugiteOreID = config.getBlock("Augite Ore", 587).getInt();
		AugiteBlockID = config.getBlock("Augite Block", 583).getInt();

		
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
	
	public static void initConfigItems(FMLPreInitializationEvent event, Configuration config)
	{
		DraviteGemID = config.getItem("Dravite Gem", 5459).getInt();
		DraviteChunkID = config.getItem("Dravite Chunk", 5464).getInt();
		DraviteFragmentsID = config.getItem("Dravite Fragments", 5454).getInt();
		DraviteDustID = config.getItem("Dravite Dust", 5557).getInt();
		DraviteBladeID = config.getItem("Dravite Blade", 5472).getInt();
		DravitePhaserID = config.getItem("Dravite Phaser", 5517).getInt();
		DraviteBlitzID = config.getItem("Dravite Blitz", 5509).getInt();
		DraviteBowID = config.getItem("Dravite Bow", 5495).getInt();
		DraviteHelmetID = config.getItem("Dravite Helmet", 5622).getInt();
		DraviteBootsID = config.getItem("Dravite Boots", 5623).getInt();
		DravitelegsID = config.getItem("Dravite Legs", 5624).getInt();
		DraviteChestID = config.getItem("Dravite Chest", 5625).getInt();
		DraviteSlicerID = config.getItem("Dravite Slicer", 5502).getInt();
		DraviteSoulID = config.getItem("Dravite Soul", 5551).getInt();
		
		AzuriteGemID = config.getItem("Azurite Gem", 5461).getInt();
		AzuriteChunkID = config.getItem("Azurite Chunk", 5466).getInt();
		AzuriteFragmentsID = config.getItem("Azurite Fragments", 5456).getInt();
		AzuriteDustID = config.getItem("Azurite Dust", 5559).getInt();
		AzuriteBladeID = config.getItem("Azurite Blade", 5476).getInt();
		AzuritePhaserID = config.getItem("Azurite Phaser", 5518).getInt();
		AzuriteBlitzID = config.getItem("Azurite Blitz", 5510).getInt();
		AzuriteBowID = config.getItem("Azurite Bow", 5496).getInt();
		AzuriteHelmetID = config.getItem("Azurite Helmet", 5626).getInt();
		AzuriteBootsID = config.getItem("Azurite Boots", 5627).getInt();
		AzuritelegsID = config.getItem("Azurite Legs", 5628).getInt();
		AzuriteChestID = config.getItem("Azurite Chest", 5629).getInt();
		AzuriteSlicerID = config.getItem("Azurite Slicer", 5503).getInt();
		AzuriteSoulID = config.getItem("Azurite Soul", 5553).getInt();
		
		UviteGemID = config.getItem("Uvite Gem", 5460).getInt();
		UviteChunkID = config.getItem("Uvite Chunk", 5465).getInt();
		UviteFragmentsID = config.getItem("Uvite Fragments", 5455).getInt();
		UviteDustID = config.getItem("Uvite Dust", 5558).getInt();
		UviteBladeID = config.getItem("Uvite Blade", 5480).getInt();
		UvitePhaserID = config.getItem("Uvite Phaser", 5519).getInt();
		UviteBlitzID = config.getItem("Uvite Blitz", 5511).getInt();
		UviteBowID = config.getItem("Uvite Bow", 5497).getInt();
		UviteHelmetID = config.getItem("Uvite Helmet", 5630).getInt();
		UviteBootsID = config.getItem("Uvite Boots", 5631).getInt();
		UvitelegsID = config.getItem("Uvite Legs", 5632).getInt();
		UviteChestID = config.getItem("Uvite Chest", 5633).getInt();
		UviteSlicerID = config.getItem("Uvite Slicer", 5504).getInt();
		UviteSoulID = config.getItem("Uvite Soul", 5552).getInt();
		
		MythrilGemID = config.getItem("Mythril Gem", 5462).getInt();
		MythrilChunkID = config.getItem("Mythril Chunk", 5467).getInt();
		MythrilFragmentsID = config.getItem("Mythril Fragments", 5457).getInt();
		MythrilDustID = config.getItem("Mythril Dust", 5560).getInt();
		MythrilBladeID = config.getItem("Mythril Blade", 5484).getInt();
		MythrilPhaserID = config.getItem("Mythril Phaser", 5520).getInt();
		MythrilBlitzID = config.getItem("Mythril Blitz", 5512).getInt();
		MythrilBowID = config.getItem("Mythril Bow", 5498).getInt();
		MythrilHelmetID = config.getItem("Mythril Helmet", 5634).getInt();
		MythrilBootsID = config.getItem("Mythril Boots", 5635).getInt();
		MythrillegsID = config.getItem("Mythril Legs", 5636).getInt();
		MythrilChestID = config.getItem("Mythril Chest", 5637).getInt();
		MythrilSlicerID = config.getItem("Mythril Slicer", 5505).getInt();
		MythrilSoulID = config.getItem("Mythril Soul", 5554).getInt();
		
		AugiteGemID = config.getItem("Augite Gem", 5463).getInt();
		AugiteChunkID = config.getItem("Augite Chunk", 5468).getInt();
		AugiteFragmentsID = config.getItem("Augite Fragments", 5458).getInt();
		AugiteDustID = config.getItem("Augite Dust", 5561).getInt();
		AugiteBladeID = config.getItem("Augite Blade", 5488).getInt();
		AugitePhaserID = config.getItem("Augite Phaser", 5521).getInt();
		AugiteBlitzID = config.getItem("Augite Blitz", 5513).getInt();
		AugiteBowID = config.getItem("Augite Bow", 5499).getInt();
		AugiteHelmetID = config.getItem("Augite Helmet", 5638).getInt();
		AugiteBootsID = config.getItem("Augite Boots", 5639).getInt();
		AugitelegsID = config.getItem("Augite Legs", 5640).getInt();
		AugiteChestID = config.getItem("Augite Chest", 5641).getInt();
		AugiteSlicerID = config.getItem("Augite Slicer", 5506).getInt();
		AugiteSoulID = config.getItem("Augite Soul", 5555).getInt();

		HaliteBladeID = config.getItem("Halite Blade", 5489).getInt();
		HalitePhaserID = config.getItem("Halite Phaser", 5522).getInt();
		HaliteBlitzID = config.getItem("Halite Blitz", 5514).getInt();
		HaliteBowID = config.getItem("Halite Bow", 5500).getInt();
		HaliteHelmetID = config.getItem("Halite Helmet", 5642).getInt();
		HaliteBootsID = config.getItem("Halite Boots", 5643).getInt();
		HalitelegsID = config.getItem("Halite Legs", 5644).getInt();
		HaliteChestID = config.getItem("Halite Chest", 5645).getInt();
		HaliteSlicerID = config.getItem("Halite Slicer", 5507).getInt();
	}
}
