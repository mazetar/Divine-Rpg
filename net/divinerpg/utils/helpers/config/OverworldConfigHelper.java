package net.divinerpg.utils.helpers.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class OverworldConfigHelper 
{
    

    public static int BLOCKID_NEXT = 500;
    
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
	
	// EXTRA BLOCKS FOUND 
	
	public static int darkPlateID;
	public static int RealmiteBrickID;
    public static int NetheriteBrickID;
    public static int LapisBrickID;
    public static int RedstoneBrickID;
    public static int CheckerID;
    public static int EucalyptusPlanksID;
    public static int deadBridgeID;
    public static int skullTorchID;
    public static int hotSpikeID;
    public static int corruptedAlterID;
    public static int realmiteBlockID;
    public static int milkStoneID;
    public static int darkStoneID;
    public static int obsidianBlock;
    public static int bedRockID;
    public static int milkyStoneBrickID;
    public static int darkBrickID;
    public static int ironBrickID;
    public static int goldBrickID;
    public static int EucalyptusID;
    public static int spikesID;
    public static int spiderPumpkinID;
    public static int enderPumpkinID;
    public static int creeperPumpkinID;
    public static int skeletonPumpkinID;
    public static int blazePumpkinID;
    public static int darkStairsID;
    public static int arlemiteStairsID;
    public static int ironStairsID;
    public static int goldStairsID;
    public static int sandStairsID;
    public static int milkstoneStairsID;
    public static int redstoneStairsID;
    public static int milkstoneBricksStairsID;
    public static int lapisStairsID;
    public static int arlemiteBrickID;
    public static int milkstoneBrickStairsID;
    public static int redWoodID;
    public static int purpleWoodID;
    public static int greenWoodID;
    public static int yellowWoodID;
    public static int blueWoodID;
    public static int whiteWoodID;
    public static int woodFenceID;
    public static int stoneFenceID;
    public static int lightStoneID;
    public static int netheriteBlockID;
    public static int purplestoneID;
    public static int arlemiteBlockID;
    public static int diamondBrickID;
    public static int rupeeBlockID;
    public static int enderBrickID;
	
    public static int zombiePumpkinID;
    public static int iceManPumpkinID;
    public static int enderWatcherPumpkinID;
    public static int cyclopsPumpkinID;
    public static int ghastPumpkinID;
    public static int hellSpiderPumpkinID;
    public static int jungleSpiderPumpkinID;
    public static int frostPumpkinID;

      public static int glassWhiteID;
      public static int glassOrangeID;
      public static int glassLightPurpleID;
      public static int glassLightBlueID;
      public static int glassYellowID;
      public static int glassLimeGreenID;
      public static int glassPinkID;
      public static int glassGrayID;
      public static int glassLightGrayID;
      public static int glassTealID;
      public static int glassBlueID;
      public static int glassPurpleID;
      public static int glassBrownID;
      public static int glassDirtyGreenID;
      public static int glassRedID;
      public static int glassBlackID;
      public static int paneWhiteID;
      public static int paneOrangeID;
      public static int paneLightPurpleID;
      public static int paneLightBlueID;
      public static int paneYellowID;
      public static int paneLimeGreenID;
      public static int panePinkID;
      public static int paneGrayID;
      public static int paneLightGrayID;
      public static int paneTealID;
      public static int paneBlueID;
      public static int panePurpleID;
      public static int paneBrownID;
      public static int paneDirtyGreenID;
      public static int paneRedID;
      public static int paneBlackID;
      
      public static int lavaBrickID;
      public static int tomatoID;

	
  public static int stainedGlassID;
  public static int stainedGlass1ID;
  public static int stainedGlass2ID;
  public static int stainedGlass3ID;
  public static int stainedGlass4ID;
  public static int stainedGlass5ID;
  public static int stainedGlass6ID;
  public static int stainedGlass7ID;
	
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
	    int id = BLOCKID_NEXT;
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
		
		tomatoID = config.getBlock("Tomato Block", ++id).getInt();
		/** MISSING BLOCKS */
		
		darkPlateID = config.getBlock("darkPlateID", ++id).getInt(); 
		lavaBrickID = config.getBlock("lavaBrick", ++id).getInt(); 
	    RealmiteBrickID  = config.getBlock("RealmiteBrickID", ++id).getInt();
	    NetheriteBrickID  = config.getBlock("NetheriteBrickID", ++id).getInt();
	    LapisBrickID  = config.getBlock("LapisBrickID", ++id).getInt();
	    RedstoneBrickID  = config.getBlock("RedstoneBrickID", ++id).getInt();
	    CheckerID  = config.getBlock("CheckerID", ++id).getInt();
	    EucalyptusPlanksID  = config.getBlock("EucalyptusPlanksID", ++id).getInt();
	    deadBridgeID  = config.getBlock("deadBridgeID", ++id).getInt();
	    skullTorchID  = config.getBlock("skullTorchID", ++id).getInt();
	    hotSpikeID  = config.getBlock("hotSpikeID", ++id).getInt();
	    corruptedAlterID  = config.getBlock("corruptedAlterID", ++id).getInt();
	    realmiteBlockID  = config.getBlock("realmiteBlockID", ++id).getInt();
	    milkStoneID  = config.getBlock("milkStoneID", ++id).getInt();
	    darkStoneID  = config.getBlock("darkStoneID", ++id).getInt();
	    obsidianBlock  = config.getBlock("obsidianBlock", ++id).getInt();
	    bedRockID  = config.getBlock("bedRockID", ++id).getInt();
	    milkyStoneBrickID  = config.getBlock("milkyStoneBrickID", ++id).getInt();
	    darkBrickID  = config.getBlock("darkBrickID", ++id).getInt();
	    ironBrickID  = config.getBlock("ironBrickID", ++id).getInt();
	    goldBrickID  = config.getBlock("goldBrickID", ++id).getInt();
	    EucalyptusID  = config.getBlock("EucalyptusID", ++id).getInt();
	    spikesID  = config.getBlock("spikesID", ++id).getInt();
	    spiderPumpkinID  = config.getBlock("spiderPumpkinID", ++id).getInt();
	    enderPumpkinID  = config.getBlock("enderPumpkinID", ++id).getInt();
	    creeperPumpkinID  = config.getBlock("creeperPumpkinID", ++id).getInt();
	    skeletonPumpkinID  = config.getBlock("skeletonPumpkinID", ++id).getInt();
	    blazePumpkinID  = config.getBlock("blazePumpkinID", ++id).getInt();
	    darkStairsID  = config.getBlock("darkStairsID", ++id).getInt();
	    arlemiteStairsID  = config.getBlock("arlemiteStairsID", ++id).getInt();
	    ironStairsID  = config.getBlock("ironStairsID", ++id).getInt();
	    goldStairsID  = config.getBlock("goldStairsID", ++id).getInt();
	    sandStairsID  = config.getBlock("sandStairsID", ++id).getInt();
	    milkstoneStairsID  = config.getBlock("milkstoneStairsID", ++id).getInt();
	    redstoneStairsID  = config.getBlock("redstoneStairsID", ++id).getInt();
	    milkstoneBricksStairsID  = config.getBlock("milkstoneBricksStairsID", ++id).getInt();
	    lapisStairsID  = config.getBlock("lapisStairsID", ++id).getInt();
	    arlemiteBrickID  = config.getBlock("arlemiteBrickID", ++id).getInt();
	    milkstoneBrickStairsID  = config.getBlock("milkstoneBrickStairsID", ++id).getInt();
	    redWoodID  = config.getBlock("redWoodID", ++id).getInt();
	    purpleWoodID  = config.getBlock("purpleWoodID", ++id).getInt();
	    greenWoodID  = config.getBlock("greenWoodID", ++id).getInt();
	    yellowWoodID  = config.getBlock("yellowWoodID", ++id).getInt();
	    blueWoodID  = config.getBlock("blueWoodID", ++id).getInt();
	    whiteWoodID  = config.getBlock("whiteWoodID", ++id).getInt();
	    woodFenceID  = config.getBlock("woodFenceID", ++id).getInt();
	    stoneFenceID  = config.getBlock("stoneFenceID", ++id).getInt();
	    lightStoneID  = config.getBlock("lightStoneID", ++id).getInt();
	    netheriteBlockID  = config.getBlock("netheriteBlockID", ++id).getInt();
	    purplestoneID  = config.getBlock("purplestoneID", ++id).getInt();
	    arlemiteBlockID  = config.getBlock("arlemiteBlockID", ++id).getInt();
	    diamondBrickID  = config.getBlock("diamondBrickID", ++id).getInt();
	    rupeeBlockID  = config.getBlock("rupeeBlockID", ++id).getInt();
	    enderBrickID  = config.getBlock("enderBrickID", ++id).getInt();

      zombiePumpkinID = config.getBlock("zombiepumpkin", ++id).getInt();
      iceManPumpkinID = config.getBlock("icemanpumpkin", ++id).getInt();
      enderWatcherPumpkinID = config.getBlock("enderwatcherpumpkin", ++id).getInt();
      cyclopsPumpkinID = config.getBlock("cyclopspumpkin", ++id).getInt();
      ghastPumpkinID = config.getBlock("ghastpumpkin", ++id).getInt();
      hellSpiderPumpkinID = config.getBlock("hellspiderpumpkin", ++id).getInt();
      jungleSpiderPumpkinID = config.getBlock("junhlespiderpumpkin", ++id).getInt();
      frostPumpkinID = config.getBlock("frostpumpkin", ++id).getInt();
		
      glassWhiteID = config.getBlock("glasswhite", ++id).getInt();
      glassOrangeID = config.getBlock("glassora", ++id).getInt();
      glassLightPurpleID = config.getBlock("glasslp", ++id).getInt();
      glassLightBlueID = config.getBlock("glasslb", ++id).getInt();
      glassYellowID = config.getBlock("glassy", ++id).getInt();
      glassLimeGreenID = config.getBlock("glasslgreen", ++id).getInt();
      glassPinkID = config.getBlock("glasspink", ++id).getInt();
      glassGrayID = config.getBlock("glassgray", ++id).getInt();
      glassLightGrayID = config.getBlock("glasslgray", ++id).getInt();
      glassTealID = config.getBlock("glasst", ++id).getInt();
      glassBlueID = config.getBlock("glassblue", ++id).getInt();
      glassPurpleID = config.getBlock("glasspurple", ++id).getInt();
      glassBrownID = config.getBlock("glassbrown", ++id).getInt();
      glassDirtyGreenID = config.getBlock("glassdirtygreen", ++id).getInt();
      glassRedID = config.getBlock("glassred", ++id).getInt();
      glassBlackID = config.getBlock("glassblack", ++id).getInt();
      paneWhiteID = config.getBlock("panew", ++id).getInt();
      paneOrangeID = config.getBlock("paneo", ++id).getInt();
      paneLightPurpleID = config.getBlock("panelp", ++id).getInt();
      paneLightBlueID = config.getBlock("panelightb", ++id).getInt();
      paneYellowID = config.getBlock("paney", ++id).getInt();
      paneLimeGreenID = config.getBlock("panelimegreen", ++id).getInt();
      panePinkID = config.getBlock("panep", ++id).getInt();
      paneGrayID = config.getBlock("paneg", ++id).getInt();
      paneLightGrayID = config.getBlock("panelg", ++id).getInt();
      paneTealID = config.getBlock("paneTeal", ++id).getInt();
      paneBlueID = config.getBlock("paneblue", ++id).getInt();
      panePurpleID = config.getBlock("panepurple", ++id).getInt();
      paneBrownID = config.getBlock("panebrown", ++id).getInt();
      paneDirtyGreenID = config.getBlock("panedirtygreen", ++id).getInt();
      paneRedID = config.getBlock("panedred", ++id).getInt();
      paneBlackID = config.getBlock("paneblack", ++id).getInt();
		
		stainedGlassID = config.getBlock("stainedglass", ++id).getInt();
      stainedGlass1ID = config.getBlock("stainedglass1", ++id).getInt();
      stainedGlass2ID = config.getBlock("stainedglass2", ++id).getInt();
      stainedGlass3ID = config.getBlock("stainedglass3", ++id).getInt();
      stainedGlass4ID = config.getBlock("stainedglass4", ++id).getInt();
      stainedGlass5ID = config.getBlock("stainedglass5", ++id).getInt();
      stainedGlass6ID = config.getBlock("stainedglass6", ++id).getInt();
      stainedGlass7ID = config.getBlock("stainedglass7", ++id).getInt();
      
      
      
		
		BLOCKID_NEXT = id;
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
