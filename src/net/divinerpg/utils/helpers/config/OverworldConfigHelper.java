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
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGOverworld.cfg");
        Configuration config = new Configuration(file);
		
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
    public static int seranadeDeathID;
    public static int serenadeHealthID;
    public static int growthSerenadeID;
    public static int mailStromID;
    public static int clawAnchorID;
    public static int bowheadAnchorID;
    public static int vialStormID;
    public static int infernobowID;
    public static int crabClawMaulID;
    public static int rupeeSwordID;
    public static int passivenceID;
    public static int angelicBodyID;
    public static int angelicHeadID;
    public static int angelicLegsID;
    public static int angelicBootsID;
    public static int divineHeadID;
    public static int purpleShardID;
    public static int redShardID;
    public static int corruptedShardsID;
    
	public static int twilightClockID;
	
	public static int nextItemID = 6666;
	public static void InitConfigItems(Configuration config)
	{
		
		bedrockMaulID = config.getItem("bedrockMaul", nextItemID++).getInt();
		soundOfMusicID = config.getItem("soundOfMusic", nextItemID++).getInt();
		greenShardID = config.getItem("greenShard", nextItemID++).getInt();
		shurikenID = config.getItem("shuriken", nextItemID++).getInt();
		namkormiraID = config.getItem("namkormira", nextItemID++).getInt();
		serenadeStrikerID = config.getItem("serenadeStriker", nextItemID++).getInt();
		slimeSwordID = config.getItem("slimeSword", nextItemID++).getInt();
		shadowBowID = config.getItem("shadowBow", nextItemID++).getInt();
		crabClawCannonID = config.getItem("crabClawCannon", nextItemID++).getInt();
		frostCannonID = config.getItem("frostCannon", nextItemID++).getInt();
		frostSwordID = config.getItem("frostSword", nextItemID++).getInt();
		divineswordID = config.getItem("divinesword", nextItemID++).getInt();
		sandSlashID = config.getItem("sandSlash", nextItemID++).getInt();
		blueShardID = config.getItem("blueShard", nextItemID++).getInt();
		iceShardID = config.getItem("iceShard", nextItemID++).getInt();
		yellowShardID = config.getItem("yellowShard", nextItemID++).getInt();
		
		divineHelmID = config.getItem("divineHelm", nextItemID++).getInt();
		divineBodyID = config.getItem("divineBody", nextItemID++).getInt();
		divineLegsID = config.getItem("divineLegs", nextItemID++).getInt();
		divineBootsID = config.getItem("divineBoots", nextItemID++).getInt();
        divineHeadID = config.getItem("divineHeadID", nextItemID++).getInt();
		
		enderSwordID = config.getItem("enderSword", nextItemID++).getInt();

	
		bluefirebowID = config.getItem("bluefirebow", nextItemID++).getInt();
		rupeeID = config.getItem("rupee", nextItemID++).getInt();
		tomatoID = config.getItem("tomato", nextItemID++).getInt();
		tomatoSeedsID = config.getItem("tomatoSeeds", nextItemID++).getInt();
		purpleFireID = config.getItem("purpleFire", nextItemID++).getInt();
		jackOManBootsID = config.getItem("jackOManBoots", nextItemID++).getInt();
		jackOManLegsID = config.getItem("jackOManLegs", nextItemID++).getInt();
		jackOManBodyID = config.getItem("jackOManBody", nextItemID++).getInt();
		jackOManHeadID = config.getItem("jackOManHead", nextItemID++).getInt();
		scytheID = config.getItem("scythe", nextItemID++).getInt();
		sharkAnchorID = config.getItem("sharkAnchor", nextItemID++).getInt();
		healingStoneID = config.getItem("healingStone", nextItemID++).getInt();
		
		massivenceID = config.getItem("massivence", nextItemID++).getInt();
		palavenceID = config.getItem("passivence", nextItemID++).getInt();
		arlemiteStabberID = config.getItem("arlemiteStabber", nextItemID++).getInt();
		rupeeRapierID = config.getItem("rupeeRapier", nextItemID++).getInt();
		realmiteSwordID = config.getItem("realmiteSword", nextItemID++).getInt();
		poisonSaberID = config.getItem("poisonSaber", nextItemID++).getInt();
		twilightClockID = config.getItem("twilightClock", nextItemID++).getInt();
		

		seranadeDeathID = config.getItem("seranadeDeathID", nextItemID++).getInt();
		serenadeHealthID = config.getItem("serenadeHealthID", nextItemID++).getInt();
		growthSerenadeID = config.getItem("growthSerenadeID", nextItemID++).getInt();
		mailStromID = config.getItem("mailStromID", nextItemID++).getInt();
        clawAnchorID = config.getItem("clawAnchorID", nextItemID++).getInt();
        bowheadAnchorID = config.getItem("bowheadAnchorID", nextItemID++).getInt();
        bowheadAnchorID = config.getItem("bowheadAnchorID", nextItemID++).getInt();
        crabClawMaulID = config.getItem("crabClawMaulID", nextItemID++).getInt();
        rupeeSwordID = config.getItem("clawAnchorID", nextItemID++).getInt();
        passivenceID = config.getItem("passivenceID", nextItemID++).getInt();

        angelicBodyID = config.getItem("angelicBodyID", nextItemID++).getInt();
        angelicHeadID = config.getItem("angelicHeadID", nextItemID++).getInt();
        angelicLegsID = config.getItem("angelicLegsID", nextItemID++).getInt();
        angelicBootsID = config.getItem("angelicBootsID", nextItemID++).getInt();
        purpleShardID = config.getItem("purpleShardID", nextItemID++).getInt();
        redShardID = config.getItem("redShardID", nextItemID++).getInt();
        corruptedShardsID = config.getItem("corruptedShardsID", nextItemID++).getInt();
        
        moltenSwordID = config.getItem("MoltenSword", nextItemID++).getInt();
        
        
	}


    



}
