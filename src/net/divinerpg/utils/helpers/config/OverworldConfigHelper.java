package net.divinerpg.utils.helpers.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class OverworldConfigHelper 
{
	//-==-BLOCKS-==-//
	public static int blueFireID;
	public static int divineRockID;
	
	public static int acceleraunchID;
	public static int acceleronID;
	
	public static int aeStatueID;
	public static int ayeracoStatueID;
	public static int kosStatueID;
	public static int watcherStatueID;
	
	public static int ayeracoBeamBlueID;
	public static int ayeracoBeamGreenID;
	public static int ayeracoBeamPurpleID;
	public static int ayeracoBeamRedID;
	public static int ayeracoBeamYellowID;

	public static int colouredBricksID;
	public static int colouredGlassID;
	public static int colouredPanesID;
	public static int colouredTorchID;
	public static int dyeBlocksID;
	public static int miniBricksID;
	public static int steelID;
	public static int mobPumpkinsID;
	
	public static int darkBridgeID;
	public static int lightBridgeID;
	public static int glowingStairsID;
	public static int lightFenceBlueID;
	public static int lightFenceRedID;
	public static int lightFenceBlueOnID;
	public static int lightFenceRedOnID;
	public static int skeletonChestID;

	public static int elevantiumID;
	public static int darkPressurePlateID;
	
	public static int tarStillID;
	public static int tarFlowingID;

	public static int bloodGemID;
	public static int netheriteOreID;
	public static int spikeBlockID;
	public static int hotSpikesID;
	
	public static int lightstoneID;
	public static int rainbowWoolID;

	public static int rupeeOreID;
	public static int arlemiteOreID;
	public static int realmiteOreID;

	public static int lapisLampID;
	public static int slimeLightID;
	public static int slimeLightOnID;
	public static int redstoneOreLampID;
	public static int goldLampID;
	public static int diamondLampID;
	public static int realmiteLampID;
	public static int netheriteLampID;
	public static int arlemiteLampID;
	public static int rupeeLampID;
	public static int icestoneLampID;
	public static int moltenstoneLampID;
	public static int junglestoneLampID;
	public static int enderstoneLampID;
	public static int bluefireLampID;
	public static int divinestoneLampID;
	public static int milkyLampID;
	public static int blazicLampID;
	public static int aquaLampID;
	public static int lavaLampID;
	public static int enderLampID;
	public static int krakenLampID;
	public static int drakenLampID;
	
	public static int fenceLightoffID;
	public static int fenceLightonID;
	public static int fenceLightoff1ID;
	public static int fenceLighton1ID;
	public static int purpleGlowBoneTreeID;
	public static int pinkGlowBoneTreeID;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
//		File file = new File(event.getModConfigurationDirectory(), "DivineRPGOverworld2.cfg");
//		Configuration config = new Configuration(file);
//		
	//	File file = new File(event.getModConfigurationDirectory(), "DivineRPG.cfg");
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();

        InitConfigBlocks(config);
		InitConfigItems(config);
		
		config.save();
	}
	
	public static void InitConfigBlocks(Configuration config)
	{
	    int id = 500;
		blueFireID = config.getBlock("blueFireID", ++id).getInt();
		divineRockID = config.getBlock("divineRockID", ++id).getInt();
		acceleraunchID = config.getBlock("acceleraunchID", ++id).getInt();
		acceleronID = config.getBlock("acceleronID", ++id).getInt();
		aeStatueID = config.getBlock("aeStatueID", ++id).getInt();
		ayeracoStatueID = config.getBlock("ayeracoStatueID", ++id).getInt();
		kosStatueID = config.getBlock("kosStatueID", ++id).getInt();
		watcherStatueID = config.getBlock("watcherStatueID", ++id).getInt();
		ayeracoBeamBlueID = config.getBlock("ayeracoBeamBlueID", ++id).getInt();
		ayeracoBeamGreenID = config.getBlock("ayeracoBeamGreenID", ++id).getInt();
		ayeracoBeamPurpleID = config.getBlock("ayeracoBeamPurpleID", ++id).getInt();
		ayeracoBeamRedID = config.getBlock("ayeracoBeamRedID", ++id).getInt();
		ayeracoBeamYellowID = config.getBlock("ayeracoBeamYellowID", ++id).getInt();
		colouredBricksID = config.getBlock("colouredBricksID", ++id).getInt();
		colouredGlassID = config.getBlock("colouredGlassID", ++id).getInt();
		colouredPanesID = config.getBlock("colouredPanesID", ++id).getInt();
		colouredTorchID = config.getBlock("colouredTorchID", ++id).getInt();
		dyeBlocksID = config.getBlock("dyeBlocksID", ++id).getInt();
		miniBricksID = config.getBlock("miniBricksID", ++id).getInt();
		steelID = config.getBlock("steelID", ++id).getInt();
		mobPumpkinsID = config.getBlock("mobPumpkinsID", ++id).getInt();
		darkBridgeID = config.getBlock("darkBridgeID", ++id).getInt();
		lightBridgeID = config.getBlock("lightBridgeID", ++id).getInt();
		glowingStairsID = config.getBlock("glowingStairsID", ++id).getInt();
		lightFenceBlueID = config.getBlock("lightFenceBlueID", ++id).getInt();
		lightFenceRedID = config.getBlock("lightFenceRedID", ++id).getInt();
		skeletonChestID = config.getBlock("skeletonChestID", ++id).getInt();
		elevantiumID = config.getBlock("elevantiumID", ++id).getInt();
		darkPressurePlateID = config.getBlock("darkPressurePlateID", ++id).getInt();
		tarStillID = config.getBlock("tarStillID", ++id).getInt();
		tarFlowingID = config.getBlock("tarFlowingID", ++id).getInt();
		bloodGemID = config.getBlock("bloodGemID", ++id).getInt();
		netheriteOreID = config.getBlock("neteriteOreID", ++id).getInt();
		spikeBlockID = config.getBlock("spikeBlockID", ++id).getInt();
		hotSpikesID = config.getBlock("hotSpikesID", ++id).getInt();
		lightstoneID = config.getBlock("lightstoneID", ++id).getInt();
		rainbowWoolID = config.getBlock("rainbowWoolID", ++id).getInt();
		rupeeOreID = config.getBlock("rupeeOreID", ++id).getInt();
		arlemiteOreID = config.getBlock("arlemiteOreID", ++id).getInt();
		realmiteOreID = config.getBlock("realmiteOreID", ++id).getInt();
		lapisLampID = config.getBlock("lapisLampID", ++id).getInt();
		slimeLightID = config.getBlock("slimeLightID", ++id).getInt();
		slimeLightOnID = config.getBlock("slimeLightOnID", ++id).getInt();
		redstoneOreLampID = config.getBlock("redstoneOreLampID", ++id).getInt();
		goldLampID = config.getBlock("goldLampID", ++id).getInt();
		diamondLampID = config.getBlock("diamondLampID", ++id).getInt();
		realmiteLampID = config.getBlock("realmiteLampID", ++id).getInt();
		netheriteLampID = config.getBlock("netheriteLampID", ++id).getInt();
		arlemiteLampID = config.getBlock("arlemiteLampID", ++id).getInt();
		rupeeLampID = config.getBlock("rupeeLampID", ++id).getInt();
		icestoneLampID = config.getBlock("icestoneLampID", ++id).getInt();
		moltenstoneLampID = config.getBlock("moltenstoneLampID", ++id).getInt();
		junglestoneLampID = config.getBlock("junglestoneLampID", ++id).getInt();
		enderstoneLampID = config.getBlock("enderstoneLampID", ++id).getInt();
		bluefireLampID = config.getBlock("bluefireLampID", ++id).getInt();
		divinestoneLampID = config.getBlock("divinestoneLampID", ++id).getInt();
		milkyLampID = config.getBlock("milkyLampID", ++id).getInt();
		blazicLampID = config.getBlock("blazicLampID", ++id).getInt();
		aquaLampID = config.getBlock("aquaLampID", ++id).getInt();
		lavaLampID = config.getBlock("lavaLampID", ++id).getInt();
		enderLampID = config.getBlock("enderLampID", ++id).getInt();
		krakenLampID = config.getBlock("krakenLampID", ++id).getInt();
		drakenLampID = config.getBlock("drakenLampID", ++id).getInt();
		lightFenceBlueID = config.getBlock("lightFenceBlueID", ++id).getInt();
		lightFenceBlueOnID = config.getBlock("lightFenceBlueOnID", ++id).getInt();
		lightFenceRedID = config.getBlock("lightFenceRedID", ++id).getInt();
		lightFenceRedOnID = config.getBlock("lightFenceRedOnID", ++id).getInt();
		purpleGlowBoneTreeID = config.getBlock("purpleGlowBoneTreeID", ++id).getInt();
		pinkGlowBoneTreeID = config.getBlock("pinkGlowBoneTreeID", ++id).getInt(); // 568.
	}
	
	public static int bedrockMaulID;
	public static int soundOfMusicID;
	public static int greenShardID;
	public static int shurikenID;
	public static int namkormiraID;
	public static int slimeSwordID;
	public static int shadowBowID;
	public static int crabClawCannonID;
	public static int frostCannonID;
	public static int frostSwordID;
	public static int divineswordID;
	public static int sandSlashID;
	public static int blueShardID;
	public static int iceShardID;
	public static int yellowShardID;

	public static int serenadeStrikerID;
	public static int serenadeOfLifeID;
	public static int serenadeOfDeathID;
	
	public static int divineHelmID;
	public static int divineBodyID;
	public static int divineLegsID;
	public static int divineBootsID;
	
	public static int enderSwordID;
	public static int enderSwordYellowID;
	public static int enderSwordGreenID;
	public static int enderSwordRedID;
	public static int enderSwordBlueID;
	
	public static int bluefirebowID;
	public static int rupeeID;
	public static int tomatoID;
	public static int tomatoSeedsID;
	public static int purpleFireID;
	public static int jackOManBootsID;
	public static int jackOManLegsID;
	public static int jackOManBodyID;
	public static int jackOManHeadID;
	public static int scytheID;
	public static int sharkAnchorID;
	public static int healingStoneID;
	
	public static int grimReaperHeadID;
	public static int grimReaperBodyID;
	public static int grimReaperLegsID;
	public static int grimReaperBootsID;
	public static int jungleStoneID;
	public static int divineStoneID;
	public static int iceStoneID;
	public static int enderStoneID;
	public static int moltenStoneID;
	public static int corruptedStoneID;
	public static int blueFireStoneID;

	public static int palavenceID;
	public static int arlemiteStabberID;
	public static int rupeeRapierID;
	public static int realmiteSwordID;
	public static int poisonSaberID;
	public static int infernoSwordID;
	public static int bedrockSwordID;
	public static int aquaticDaggerID;
	public static int aquaticTridentID;
	public static int oceanKnifeID;
	public static int aquatonID;
	public static int sharkSwordID;
	public static int crabclawMaulID;
	public static int deathBringerID;
	public static int corruptedMaulID;
	public static int scorchingSwordID;
	public static int bluefireSwordID;
	public static int divineSwordID;
	public static int bloodgemSwordID;
	public static int moltenSwordID;
	public static int vileStormID;
	public static int bowHeadAnchor;
	public static int crabAnchorID;
	public static int bowheadCannonID;
	public static int maelstromID;
	public static int ghastCannonID;
	public static int corruptCannonID;

	public static int massivenceID;
	public static void InitConfigItems(Configuration config)
	{
		int id = 6666;
		bedrockMaulID = config.getItem("bedrockMaul", id++).getInt();
		soundOfMusicID = config.getItem("soundOfMusic", id++).getInt();
		greenShardID = config.getItem("greenShard", id++).getInt();
		shurikenID = config.getItem("shuriken", id++).getInt();
		namkormiraID = config.getItem("namkormira", id++).getInt();
		serenadeStrikerID = config.getItem("serenadeStriker", id++).getInt();
		slimeSwordID = config.getItem("slimeSword", id++).getInt();
		shadowBowID = config.getItem("shadowBow", id++).getInt();
		crabClawCannonID = config.getItem("crabClawCannon", id++).getInt();
		frostCannonID = config.getItem("frostCannon", id++).getInt();
		frostSwordID = config.getItem("frostSword", id++).getInt();
		divineswordID = config.getItem("divinesword", id++).getInt();
		sandSlashID = config.getItem("sandSlash", id++).getInt();
		blueShardID = config.getItem("blueShard", id++).getInt();
		iceShardID = config.getItem("iceShard", id++).getInt();
		yellowShardID = config.getItem("yellowShard", id++).getInt();
		
		divineHelmID = config.getItem("divineHelm", id++).getInt();
		divineBodyID = config.getItem("divineBody", id++).getInt();
		divineLegsID = config.getItem("divineLegs", id++).getInt();
		divineBootsID = config.getItem("divineBoots", id++).getInt();
		
		enderSwordID = config.getItem("enderSword", id++).getInt();

	
		bluefirebowID = config.getItem("bluefirebow", id++).getInt();
		rupeeID = config.getItem("rupee", id++).getInt();
		tomatoID = config.getItem("tomato", id++).getInt();
		tomatoSeedsID = config.getItem("tomatoSeeds", id++).getInt();
		purpleFireID = config.getItem("purpleFire", id++).getInt();
		jackOManBootsID = config.getItem("jackOManBoots", id++).getInt();
		jackOManLegsID = config.getItem("jackOManLegs", id++).getInt();
		jackOManBodyID = config.getItem("jackOManBody", id++).getInt();
		jackOManHeadID = config.getItem("jackOManHead", id++).getInt();
		scytheID = config.getItem("scythe", id++).getInt();
		sharkAnchorID = config.getItem("sharkAnchor", id++).getInt();
		healingStoneID = config.getItem("healingStone", id++).getInt();
		
		massivenceID = config.getItem("massivence", id++).getInt();
		palavenceID = config.getItem("passivence", id++).getInt();
		arlemiteStabberID = config.getItem("arlemiteStabber", id++).getInt();
		rupeeRapierID = config.getItem("rupeeRapier", id++).getInt();
		realmiteSwordID = config.getItem("realmiteSword", id++).getInt();
		poisonSaberID = config.getItem("poisonSaber", id++).getInt();
	}




}
