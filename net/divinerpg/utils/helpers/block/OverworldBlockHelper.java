package net.divinerpg.utils.helpers.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.blocks.core.BlockDivine;
import net.divinerpg.blocks.core.DivineGlass;
import net.divinerpg.blocks.overworld.*;
import net.divinerpg.blocks.twilight.BlockGlowBone;
import net.divinerpg.utils.helpers.config.OverworldConfigHelper;
import net.minecraft.block.Block;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;

public class OverworldBlockHelper 
{
    public static Block tomato;
    
	public static Block blueFire;
	public static Block divineRock;
	
	public static Block acceleraunch;
	public static Block acceleron;
	
	public static Block aeStatue;
	public static Block ayeracoStatue;
	public static Block kosStatue;
	public static Block watcherStatue;
	
	public static Block ayeracoBeamBlue;
	public static Block ayeracoBeamGreen;
	public static Block ayeracoBeamPurple;
	public static Block ayeracoBeamRed;
	public static Block ayeracoBeamYellow;

	public static Block colouredBricks;
	public static Block colouredGlass;
	public static Block colouredPanes;
	public static Block colouredTorch;
	public static Block dyeBlocks;
	public static Block miniBricks;
	public static Block steel;
	public static Block mobPumpkins;
	
	public static Block darkBridge;
	public static Block lightBridge;
	public static Block glowingStairs;
	public static Block lightFenceBlue;
	public static Block lightFenceRed;
	public static Block lightFenceBlueOn;
	public static Block lightFenceRedOn;
	public static Block skeletonChest;

	public static Block elevantium;
	public static Block darkPressurePlate;
	
	public static Block tarStill;
	public static Block tarFlowing;

	public static Block bloodGemOre;
	public static Block netheriteOre;
	public static Block spikeBlock;
	public static Block hotSpikes;
	
	public static Block lightstone;
	public static Block rainbowWool;

	public static Block rupeeOre;
	public static Block arlemiteOre;
	public static Block realmiteOre;

	public static Block lapisLamp;
	public static Block slimeLight;
	public static Block slimeLightOn;
	public static Block redstoneOreLamp;
	public static Block goldLamp;
	public static Block diamondLamp;
	public static Block realmiteLamp;
	public static Block netheriteLamp;
	public static Block arlemiteLamp;
	public static Block rupeeLamp;
	public static Block iceStoneLamp;
	public static Block moltenStoneLamp;
	public static Block jungleStoneLamp;
	public static Block enderStoneLamp;
	public static Block bluefireLamp;
	public static Block divineStoneLamp;
	public static Block milkyLamp;
	public static Block blazicLamp;
	public static Block aquaLamp;
	public static Block lavaLamp;
	public static Block enderLamp;
	public static Block krakenLamp;
	public static Block drakenLamp;
	public static Block purpleGlowBoneTree;
	public static Block pinkGlowBoneTree;
	
	
	public static Block realmiteBlock;
	public static Block milkStone;
	public static Block darkStone;
	public static Block obsidianBlock;
	public static Block bedrock;
	public static Block milkStoneBrick;
	public static Block darkBrick;
	public static Block ironBrick;
	public static Block goldBrick;
	public static Block realmiteBrick;
	public static Block netheriteBrick;
	public static Block lapisBrick;
	public static Block redstoneBrick;
	public static Block checker;
	public static Block eucalyptusPlanks;
	public static Block eucalyptus;
	
	public static Block spikes;
	public static Block spiderPumpkin;
	public static Block enderPumpkin;
	public static Block creeperPumpkin;
	public static Block skeletonPumpkin;
	public static Block blazePumpkin;
	public static Block lavaBrick;
	public static Block darkStairs;
	public static Block arlemiteStairs;
	public static Block ironStairs;
	public static Block goldStairs;
	public static Block sandStairs;
	public static Block redstoneStairs;
	public static Block milkstoneStairs;
	public static Block milkstoneBricksStairs;
	public static Block lapisStairs;
	public static Block arlemiteBrick;
	public static Block darkPlate;
	public static Block milkstoneBrickStairs;
	public static Block redWood;
	public static Block purpleWood;
	public static Block greenWood;
	public static Block yellowWood;
	public static Block blueWood;
	public static Block whiteWood;
	public static Block stoneFence;
	public static Block woodFence;
	public static Block lightStone;
	public static Block purplestone;
	public static Block netheriteBlock;
	public static Block arlemiteBlock;
	public static Block rupeeBlock;
	public static Block diamondBrick;
	public static Block enderBrick;
	public static Block zombiePumpkin;
	public static Block iceManPumpkin;
	public static Block cyclopsPumpkin;
	public static Block frostPumpkin;
	public static Block ghastPumpkin;
	public static Block jungleSpiderPumpkin;
	public static Block enderWatcherPumpkin;
	public static Block hellSpiderPumpkin;
	public static Block glassWhite;
	public static Block glassOrange;
	public static Block glassLightPurple;
	public static Block glassLightBlue;
	public static Block glassYellow;
	public static Block glassLimeGreen;
	public static Block glassPink;
	public static Block glassGray;
	public static Block glassLightGray;
	public static Block glassTeal;
	public static Block glassBlue;
	public static Block glassPurple;
	public static Block glassDirtyGreen;
	public static Block glassBrown;
	public static Block glassRed;
	public static Block glassBlack;
	public static Block paneBlack;
	public static Block paneRed;
	public static Block paneDirtyGreen;
	public static Block paneBrown;
	public static Block paneBlue;
	public static Block panePurple;
	public static Block paneTeal;
	public static Block paneLightGray;
	public static Block paneGray;
	public static Block panePink;
	public static Block paneYellow;
	public static Block paneLimeGreen;
	public static Block paneLightBlue;
	public static Block paneLightPurple;
	public static Block paneWhite;
	public static Block paneOrange;
	public static Block deadBridge;
	public static Block skullTorch;
	public static Block hotSpike;
	public static Block corruptedAlter;
	public static Block stainedGlass;
	public static Block stainedGlass1;
	public static Block stainedGlass2;
	public static Block stainedGlass3;
	public static Block stainedGlass4;
	public static Block stainedGlass5;
	public static Block stainedGlass6;
	public static Block stainedGlass7;
	
    public static OverworldConfigHelper cfg;

	public static void init()
	{

        tomato = new BlockTomato(cfg.tomatoID).func_111022_d("Tomato");
        
		blueFire = new BlockBlueFire(cfg.blueFireID, 0).setUnlocalizedName("BlueFire");
		divineRock = new BlockDivine(cfg.divineRockID, Material.rock).func_111022_d("DivineRock").setResistance(30).setHardness(3).setUnlocalizedName("DivineRock");
		
		acceleraunch = new BlockAcceleraunch(cfg.acceleraunchID).setUnlocalizedName("Acceleraunch");
		acceleron = new BlockAccelleron(cfg.acceleronID).setUnlocalizedName("Acceleron");
		
		aeStatue = new BlockAEStatue(cfg.aeStatueID).setUnlocalizedName("aeStatue");
		ayeracoStatue = new BlockAyeracoStatue(cfg.ayeracoStatueID).setUnlocalizedName("AyeracoStatue");
		kosStatue = new BlockKOSStatue(cfg.kosStatueID).setUnlocalizedName("kosStatue");
		watcherStatue = new BlockWatcherStatue(cfg.watcherStatueID).setUnlocalizedName("WatcherStatue");
		
		ayeracoBeamBlue = new BlockAyeracoBeamBlue(cfg.ayeracoBeamBlueID).setUnlocalizedName("AyeracoBeamBlue");
		ayeracoBeamGreen = new BlockAyeracoBeamGreen(cfg.ayeracoBeamGreenID).setUnlocalizedName("AyeracoBeamGreen");
		ayeracoBeamPurple = new BlockAyeracoBeamPurple(cfg.ayeracoBeamPurpleID).setUnlocalizedName("AyeracoBeamPurple");
		ayeracoBeamRed = new BlockAyeracoBeamRed(cfg.ayeracoBeamRedID).setUnlocalizedName("AyeracoBeamRed");
		ayeracoBeamYellow = new BlockAyeracoBeamYellow(cfg.ayeracoBeamYellowID).setUnlocalizedName("AyeracoBeamYellow");

		colouredBricks = new BlockColoredBricks(cfg.colouredBricksID, 0, Material.rock).setUnlocalizedName("ColouredBricks");
		colouredGlass = new DivineGlass(cfg.colouredGlassID).setUnlocalizedName("ColouredGlass");
		colouredPanes = new BlockColoredPane(cfg.colouredPanesID, "", "", Material.glass, false).setUnlocalizedName("ColouredPanes");
		dyeBlocks = new BlockDyes(cfg.dyeBlocksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30).setUnlocalizedName("DyeBlocks");
		miniBricks = new BlockMiniBricks(cfg.miniBricksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30).setUnlocalizedName("MiniBricks");
		steel = new BlockSteel(cfg.steelID, Material.iron).setUnlocalizedName("Steel");
		mobPumpkins = new BlockDivine(cfg.mobPumpkinsID, 0, Material.pumpkin).setUnlocalizedName("MobPumpkins");
		
		darkBridge = new BlockDarkBridge(cfg.darkBridgeID, 0, true).setUnlocalizedName("DarkBridge");
		lightBridge = new BlockLightBridge(cfg.lightBridgeID, 0, false).setUnlocalizedName("LightBridge");
		glowingStairs = new BlockDivine(cfg.glowingStairsID, 0, Material.glass).setUnlocalizedName("GlowingStairs");
		lightFenceBlue = new BlockLightFence(cfg.lightFenceBlueID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceBlue");
		lightFenceBlueOn = new BlockLightFence(cfg.lightFenceBlueOnID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceBlueOnID");
		lightFenceRed = new BlockLightFence(cfg.lightFenceRedID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceRed");
		lightFenceRedOn = new BlockLightFence(cfg.lightFenceRedOnID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceRedOnID");
		skeletonChest = new BlockSkeletonChest(cfg.skeletonChestID, 0).setUnlocalizedName("SkeletonChest");

		elevantium = new BlockElevantium(cfg.elevantiumID, 0, "Elevantium", Material.rock);
		darkPressurePlate = new BlockDarkPlate(cfg.darkPressurePlateID, "DarkPlate", Material.rock, EnumMobType.players, 0).setUnlocalizedName("DarkPressurePlate");
		
		MaterialLiquid tarMaterial = new MaterialLiquid(MapColor.ironColor); //TODO: Should be moved to different location!
		
		tarStill = new BlockStationaryTar(cfg.tarStillID, 0, tarMaterial).setUnlocalizedName("TarStill");
		tarFlowing = new BlockFlowingTar(cfg.tarFlowingID, 0, tarMaterial).setUnlocalizedName("TarFlowing");

		bloodGemOre = new BlockDivine(cfg.bloodGemID, 0, Material.rock).setUnlocalizedName("BloodGemOre").func_111022_d("BloodGemOre");
		netheriteOre = new BlockDivine(cfg.netheriteOreID, 0, Material.rock).setUnlocalizedName("NetheriteOre").func_111022_d("NetheriteOre");
		spikeBlock = new BlockDivine(cfg.spikeBlockID, 0, Material.rock).setUnlocalizedName("SpikeBlock").func_111022_d("SpikeBlock");
		hotSpikes = new BlockDivine(cfg.hotSpikesID, 0, Material.rock).setUnlocalizedName("HotSpikes").func_111022_d("HotSpikes");
		
		lightstone = new BlockDivine(cfg.lightstoneID, 0, Material.glass).setUnlocalizedName("LightStone");
		rainbowWool = new BlockDivine(cfg.rainbowWoolID, 0, Material.cloth).setUnlocalizedName("RainbowWool");

		rupeeOre = new BlockDivine(cfg.rupeeOreID, 0, Material.rock).setUnlocalizedName("RupeeOre").func_111022_d("RupeeOre");
		arlemiteOre = new BlockDivine(cfg.arlemiteOreID, 0, Material.rock).setUnlocalizedName("ArlemiteOre").func_111022_d("ArlemiteOre");
		realmiteOre = new BlockDivine(cfg.realmiteOreID, 0, Material.rock).setUnlocalizedName("RealmiteOre").func_111022_d("RealmiteOre");

		lapisLamp = new BlockDivine(cfg.lapisLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("LapisLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		slimeLight = new BlockSlimeLight(cfg.slimeLightID, false, 0).setUnlocalizedName("SlimeLight").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		slimeLightOn = new BlockSlimeLight(cfg.slimeLightOnID, true, 0).setUnlocalizedName("SlimeLightOn").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		redstoneOreLamp = new BlockDivine(cfg.redstoneOreLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("RedstoneOreLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		goldLamp = new BlockDivine(cfg.goldLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("GoldLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		diamondLamp = new BlockDivine(cfg.diamondLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("DiamondLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		realmiteLamp = new BlockDivine(cfg.realmiteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("RealmiteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		netheriteLamp = new BlockDivine(cfg.netheriteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("NetheriteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		arlemiteLamp = new BlockDivine(cfg.arlemiteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("ArlemiteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		rupeeLamp = new BlockDivine(cfg.rupeeLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("RupeeLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		iceStoneLamp = new BlockDivine(cfg.icestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("IcestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		moltenStoneLamp = new BlockDivine(cfg.moltenstoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("MoltenstoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		jungleStoneLamp = new BlockDivine(cfg.junglestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("JunglestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		enderStoneLamp = new BlockDivine(cfg.enderstoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("EnderstoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		bluefireLamp = new BlockDivine(cfg.bluefireLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("BluefireLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		divineStoneLamp = new BlockDivine(cfg.divinestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("DivinestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		milkyLamp = new BlockDivine(cfg.milkyLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("MilkyLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		blazicLamp = new BlockDivine(cfg.blazicLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("BlazicLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		aquaLamp = new BlockDivine(cfg.aquaLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("AquaLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		lavaLamp = new BlockDivine(cfg.lavaLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("LavaLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		enderLamp = new BlockDivine(cfg.enderLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("EnderLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		krakenLamp = new BlockDivine(cfg.krakenLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("KrakenLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		drakenLamp = new BlockDivine(cfg.drakenLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("DrakenLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		
		purpleGlowBoneTree = new BlockGlowBone(cfg.purpleGlowBoneTreeID, 0).setUnlocalizedName("PurpleGlowBoneTree");
		pinkGlowBoneTree = new BlockGlowBone(cfg.pinkGlowBoneTreeID, 0).setUnlocalizedName("PinkGlowBoneTree");
		
		
		/*
		 *    THE FOLLOWING BLOCKS WHERE MISSING FROM THE FILE 
		 *    
		 *    They are added but just as regular BlockDivine!
		 */

        
        deadBridge = new BlockDivine(cfg.deadBridgeID).func_111022_d("DeadBridge");
        skullTorch = new BlockDivine(cfg.skullTorchID).func_111022_d("SkullTorch");
        hotSpike = new BlockDivine(cfg.hotSpikeID).func_111022_d("HotSpike");
        corruptedAlter = new BlockDivine(cfg.corruptedAlterID).func_111022_d("CorruptedAlter");
        
		colouredTorch = new BlockDivine(cfg.colouredTorchID).func_111022_d("ColouredTorch");
	    realmiteBlock = new BlockDivine(cfg.realmiteBlockID).func_111022_d("RealmiteBlock");
	    milkStone = new BlockDivine(cfg.milkStoneID).func_111022_d("MilkStone");
	    darkStone = new BlockDivine(cfg.darkStoneID).func_111022_d("DarkStone");
	    obsidianBlock = new BlockDivine(cfg.obsidianBlock).func_111022_d("ObsidianBlock");
	    bedrock = new BlockDivine(cfg.bedRockID).func_111022_d("Bedrock");
	    darkPlate = new BlockDivine(cfg.darkPlateID).func_111022_d("DarkPlate");
	    milkStoneBrick = new BlockDivine(cfg.milkyStoneBrickID).func_111022_d("MilkStoneBrick");
	    darkBrick = new BlockDivine(cfg.darkBrickID).func_111022_d("DarkBrick");
	    ironBrick = new BlockDivine(cfg.ironBrickID).func_111022_d("IronBrick");
	    goldBrick = new BlockDivine(cfg.goldBrickID).func_111022_d("GoldBrick");
	    realmiteBrick = new BlockDivine(cfg.RealmiteBrickID).func_111022_d("RealmiteBrick");
	    netheriteBrick = new BlockDivine(cfg.NetheriteBrickID).func_111022_d("NetheriteBrick");
	    lapisBrick = new BlockDivine(cfg.LapisBrickID).func_111022_d("LapisBrick");
	    redstoneBrick = new BlockDivine(cfg.RedstoneBrickID).func_111022_d("RedstoneBrick");
	    checker = new BlockDivine(cfg.CheckerID).func_111022_d("Checker");
	    eucalyptusPlanks = new BlockDivine(cfg.EucalyptusPlanksID).func_111022_d("EucalyptusPlanks");
	    eucalyptus = new BlockDivine(cfg.EucalyptusID).func_111022_d("Eucalyptus");
	    
	    spikes = new BlockDivine(cfg.spikesID).func_111022_d("Spikes");
	    spiderPumpkin = new BlockDivine(cfg.spiderPumpkinID).func_111022_d("SpiderPumpkin");
	    enderPumpkin = new BlockDivine(cfg.enderPumpkinID).func_111022_d("EnderPumpkin");
	    creeperPumpkin = new BlockDivine(cfg.creeperPumpkinID).func_111022_d("CreeperPumpkin");
	    skeletonPumpkin = new BlockDivine(cfg.skeletonPumpkinID).func_111022_d("SkeletonPumpkin");
	    blazePumpkin = new BlockDivine(cfg.blazePumpkinID).func_111022_d("BlazePumpkin");
	    lavaBrick = new BlockDivine(cfg.lavaBrickID).func_111022_d("LavaBrick");
	    darkStairs = new BlockDivine(cfg.darkStairsID).func_111022_d("DarkStairs");
	    arlemiteStairs = new BlockDivine(cfg.arlemiteStairsID).func_111022_d("ArlemiteStairs");
	    ironStairs = new BlockDivine(cfg.ironStairsID).func_111022_d("IronStairs");
	    goldStairs = new BlockDivine(cfg.goldStairsID).func_111022_d("GoldStairs");
	    sandStairs = new BlockDivine(cfg.sandStairsID).func_111022_d("SandStairs");
	    redstoneStairs = new BlockDivine(cfg.redstoneStairsID).func_111022_d("RedstoneStairs");
	    milkstoneStairs = new BlockDivine(cfg.milkstoneStairsID).func_111022_d("MilkstoneStairs");
	    milkstoneBricksStairs = new BlockDivine(cfg.milkstoneBricksStairsID).func_111022_d("MilkstoneBricksStairs");
	    lapisStairs = new BlockDivine(cfg.lapisStairsID).func_111022_d("LapisStairs");
	    
	    arlemiteBrick = new BlockDivine(cfg.arlemiteBrickID).func_111022_d("arlemiteBrick");
	    milkstoneBrickStairs = new BlockDivine(cfg.milkstoneBrickStairsID).func_111022_d("milkstoneBrickStairs");
	    redWood = new BlockDivine(cfg.redWoodID).func_111022_d("redWood");
	    purpleWood = new BlockDivine(cfg.purpleWoodID).func_111022_d("purpleWood");
	    greenWood = new BlockDivine(cfg.greenWoodID).func_111022_d("greenWood");
	    yellowWood = new BlockDivine(cfg.yellowWoodID).func_111022_d("yellowWood");
	    blueWood = new BlockDivine(cfg.blueWoodID).func_111022_d("blueWood");
	    whiteWood = new BlockDivine(cfg.whiteWoodID).func_111022_d("whiteWood");
	    stoneFence = new BlockDivine(cfg.stoneFenceID).func_111022_d("stoneFence");
	    woodFence = new BlockDivine(cfg.woodFenceID).func_111022_d("woodFence");
	    lightStone = new BlockDivine(cfg.lightStoneID).func_111022_d("lightStone");
	    purplestone = new BlockDivine(cfg.purplestoneID).func_111022_d("purplestone");
	    netheriteBlock = new BlockDivine(cfg.netheriteBlockID).func_111022_d("netheriteBlock");
	    arlemiteBlock = new BlockDivine(cfg.arlemiteBlockID).func_111022_d("arlemiteBlock");
	    rupeeBlock = new BlockDivine(cfg.rupeeBlockID).func_111022_d("rupeeBlock");
	    diamondBrick = new BlockDivine(cfg.diamondBrickID).func_111022_d("diamondBrick");
	    enderBrick = new BlockDivine(cfg.enderBrickID).func_111022_d("enderBrick");
	    
	    zombiePumpkin = new BlockDivine(cfg.zombiePumpkinID).func_111022_d("ZombiePumpkin");
	    iceManPumpkin = new BlockDivine(cfg.iceManPumpkinID).func_111022_d("IceManPumpkin");
	    cyclopsPumpkin = new BlockDivine(cfg.cyclopsPumpkinID).func_111022_d("CyclopsPumpkin");
	    frostPumpkin = new BlockDivine(cfg.frostPumpkinID).func_111022_d("FrostPumpkin");
	    ghastPumpkin = new BlockDivine(cfg.ghastPumpkinID).func_111022_d("GhastPumpkin");
	    jungleSpiderPumpkin = new BlockDivine(cfg.jungleSpiderPumpkinID).func_111022_d("JungleSpiderPumpkin");
	    enderWatcherPumpkin = new BlockDivine(cfg.enderWatcherPumpkinID).func_111022_d("EnderWatcherPumpkin");
	    hellSpiderPumpkin = new BlockDivine(cfg.hellSpiderPumpkinID).func_111022_d("HellSpiderPumpkin");
	    
	    glassWhite = new BlockDivine(cfg.glassWhiteID).func_111022_d("GlassWhite");
	    glassOrange = new BlockDivine(cfg.glassOrangeID).func_111022_d("GlassOrange");
	    glassLightPurple = new BlockDivine(cfg.glassLightPurpleID).func_111022_d("GlassLightPurple");
	    glassLightBlue = new BlockDivine(cfg.glassLightBlueID).func_111022_d("GlassLightBlue");
	    glassYellow = new BlockDivine(cfg.glassYellowID).func_111022_d("GlassYellow");
	    glassLimeGreen = new BlockDivine(cfg.glassLimeGreenID).func_111022_d("GlassLimeGreen");
	    glassPink = new BlockDivine(cfg.glassPinkID).func_111022_d("GlassPink");
	    glassGray = new BlockDivine(cfg.glassGrayID).func_111022_d("GlassGray");
	    glassLightGray = new BlockDivine(cfg.glassLightGrayID).func_111022_d("GlassLightGray");
	    glassTeal = new BlockDivine(cfg.glassTealID).func_111022_d("GlassTeal");
	    glassBlue = new BlockDivine(cfg.glassBlueID).func_111022_d("GlassBlue");
	    glassPurple = new BlockDivine(cfg.glassPurpleID).func_111022_d("GlassPurple");
	    glassDirtyGreen = new BlockDivine(cfg.glassDirtyGreenID).func_111022_d("GlassDirtyGreen");
	    glassBrown = new BlockDivine(cfg.glassBrownID).func_111022_d("GlassBrown");
	    glassRed = new BlockDivine(cfg.glassRedID).func_111022_d("GlassRed");
	    glassBlack = new BlockDivine(cfg.glassBlackID).func_111022_d("GlassBlack");
	    
	    paneBlack = new BlockDivine(cfg.paneBlackID).func_111022_d("PaneBlack");
	    paneRed = new BlockDivine(cfg.paneRedID).func_111022_d("PaneRed");
	    paneDirtyGreen = new BlockDivine(cfg.paneDirtyGreenID).func_111022_d("PaneDirtyGreen");
	    paneBrown = new BlockDivine(cfg.paneBrownID).func_111022_d("PaneBrown");
	    paneBlue = new BlockDivine(cfg.paneBlueID).func_111022_d("PaneBlue");
	    panePurple = new BlockDivine(cfg.panePurpleID).func_111022_d("PanePurple");
	    paneTeal = new BlockDivine(cfg.paneTealID).func_111022_d("PaneTeal");
	    paneLightGray = new BlockDivine(cfg.paneLightGrayID).func_111022_d("PaneLightGray");
	    paneGray = new BlockDivine(cfg.paneGrayID).func_111022_d("PaneGray");
	    panePink = new BlockDivine(cfg.panePinkID).func_111022_d("PanePink");
	    paneYellow = new BlockDivine(cfg.paneYellowID).func_111022_d("PaneYellow");
	    paneLimeGreen = new BlockDivine(cfg.paneLimeGreenID).func_111022_d("PaneLimeGreen");
	    paneLightBlue = new BlockDivine(cfg.paneLightBlueID).func_111022_d("PaneLightBlue");
	    paneLightPurple = new BlockDivine(cfg.paneLightPurpleID).func_111022_d("PaneLightPurple");
	    paneWhite = new BlockDivine(cfg.paneWhiteID).func_111022_d("PaneWhite");
	    paneOrange = new BlockDivine(cfg.paneOrangeID).func_111022_d("PaneOrange");
	    
	    stainedGlass = new BlockDivine(cfg.stainedGlassID).func_111022_d("StainedGlass");
	    stainedGlass1 = new BlockDivine(cfg.stainedGlass1ID).func_111022_d("StainedGlass1");
	    stainedGlass2 = new BlockDivine(cfg.stainedGlass2ID).func_111022_d("StainedGlass2");
	    stainedGlass3 = new BlockDivine(cfg.stainedGlass3ID).func_111022_d("StainedGlass3");
	    stainedGlass4 = new BlockDivine(cfg.stainedGlass4ID).func_111022_d("StainedGlass4");
	    stainedGlass5 = new BlockDivine(cfg.stainedGlass5ID).func_111022_d("StainedGlass5");
	    stainedGlass6 = new BlockDivine(cfg.stainedGlass6ID).func_111022_d("StainedGlass6");
	    stainedGlass7 = new BlockDivine(cfg.stainedGlass7ID).func_111022_d("StainedGlass7");
		
		registerBlocks();
		addNames();
	}

	public static void addNames()
	{
		
	}
	
	public static void registerBlocks() {
	    GameRegistry.registerBlock(blueFire, "blueFire");
	    GameRegistry.registerBlock(tomato, "Tomato");
	    GameRegistry.registerBlock(divineRock, "divineRock");
	    
	    GameRegistry.registerBlock(acceleraunch, "acceleraunch");
	    GameRegistry.registerBlock(acceleron, "acceleron");
	    
	    GameRegistry.registerBlock(aeStatue, "aeStatue");
	    GameRegistry.registerBlock(ayeracoStatue, "ayeracoStatue");
	    GameRegistry.registerBlock(kosStatue, "kosStatue");
	    GameRegistry.registerBlock(watcherStatue, "watcherStatue");
	    
	    GameRegistry.registerBlock(ayeracoBeamBlue, "ayeracoBeamBlue");
	    GameRegistry.registerBlock(ayeracoBeamGreen, "ayeracoBeamGreen");
	    GameRegistry.registerBlock(ayeracoBeamPurple, "ayeracoBeamPurple");
	    GameRegistry.registerBlock(ayeracoBeamRed, "ayeracoBeamRed");
	    GameRegistry.registerBlock(ayeracoBeamYellow, "ayeracoBeamYellow");

	    GameRegistry.registerBlock(colouredBricks, "colouredBricks");
	    GameRegistry.registerBlock(colouredGlass, "colouredGlass");
	    GameRegistry.registerBlock(colouredPanes, "colouredPanes");
	    GameRegistry.registerBlock(colouredTorch, "colouredTorch");
	    GameRegistry.registerBlock(dyeBlocks, "dyeBlocks");
	    GameRegistry.registerBlock(miniBricks, "miniBricks");
	    GameRegistry.registerBlock(steel, "steel");
	    GameRegistry.registerBlock(mobPumpkins, "mobPumpkins");
	    
	    GameRegistry.registerBlock(darkBridge, "darkBridge");
	    GameRegistry.registerBlock(lightBridge, "lightBridge");
	    GameRegistry.registerBlock(glowingStairs, "glowingStairs");
	    GameRegistry.registerBlock(lightFenceBlue, "lightFenceBlue");
	    GameRegistry.registerBlock(lightFenceRed, "lightFenceRed");
	    GameRegistry.registerBlock(lightFenceBlueOn, "lightFenceBlueOn");
	    GameRegistry.registerBlock(lightFenceRedOn, "lightFenceRedOn");
	    GameRegistry.registerBlock(skeletonChest, "skeletonChest");

	    GameRegistry.registerBlock(elevantium, "elevantium");
	    GameRegistry.registerBlock(darkPressurePlate, "darkPressurePlate");
	    
	    GameRegistry.registerBlock(tarStill, "tarStill");
	    GameRegistry.registerBlock(tarFlowing, "tarFlowing");

	    GameRegistry.registerBlock(bloodGemOre, "bloodGemOre");
	    GameRegistry.registerBlock(netheriteOre, "netheriteOre");
	    GameRegistry.registerBlock(spikeBlock, "spikeBlock");
	    GameRegistry.registerBlock(hotSpikes, "hotSpikes");
	    
	    GameRegistry.registerBlock(lightstone, "lightstone");
	    GameRegistry.registerBlock(rainbowWool, "rainbowWool");

	    GameRegistry.registerBlock(rupeeOre, "rupeeOre");
	    GameRegistry.registerBlock(arlemiteOre, "arlemiteOre");
	    GameRegistry.registerBlock(realmiteOre, "realmiteOre");

	    GameRegistry.registerBlock(lapisLamp, "lapisLamp");
	    GameRegistry.registerBlock(slimeLight, "slimeLight");
	    GameRegistry.registerBlock(slimeLightOn, "slimeLightOn");
	    GameRegistry.registerBlock(redstoneOreLamp, "redstoneOreLamp");
	    GameRegistry.registerBlock(goldLamp, "goldLamp");
	    GameRegistry.registerBlock(diamondLamp, "diamondLamp");
	    GameRegistry.registerBlock(realmiteLamp, "realmiteLamp");
	    GameRegistry.registerBlock(netheriteLamp, "netheriteLamp");
	    GameRegistry.registerBlock(arlemiteLamp, "arlemiteLamp");
	    GameRegistry.registerBlock(rupeeLamp, "rupeeLamp");
	    GameRegistry.registerBlock(iceStoneLamp, "iceStoneLamp");
	    GameRegistry.registerBlock(moltenStoneLamp, "moltenStoneLamp");
	    GameRegistry.registerBlock(jungleStoneLamp, "jungleStoneLamp");
	    GameRegistry.registerBlock(enderStoneLamp, "enderStoneLamp");
	    GameRegistry.registerBlock(bluefireLamp, "bluefireLamp");
	    GameRegistry.registerBlock(divineStoneLamp, "divineStoneLamp");
	    GameRegistry.registerBlock(milkyLamp, "milkyLamp");
	    GameRegistry.registerBlock(blazicLamp, "blazicLamp");
	    GameRegistry.registerBlock(aquaLamp, "aquaLamp");
	    GameRegistry.registerBlock(lavaLamp, "lavaLamp");
	    GameRegistry.registerBlock(enderLamp, "enderLamp");
	    GameRegistry.registerBlock(krakenLamp, "krakenLamp");
	    GameRegistry.registerBlock(drakenLamp, "drakenLamp");
	    GameRegistry.registerBlock(purpleGlowBoneTree, "purpleGlowBoneTree");
	    GameRegistry.registerBlock(pinkGlowBoneTree, "pinkGlowBoneTree");
	    
	    
	    GameRegistry.registerBlock(realmiteBlock, "realmiteBlock");
	    GameRegistry.registerBlock(milkStone, "milkStone");
	    GameRegistry.registerBlock(darkStone, "darkStone");
	    GameRegistry.registerBlock(obsidianBlock, "obsidianBlock");
	    GameRegistry.registerBlock(bedrock, "bedrock");
	    GameRegistry.registerBlock(milkStoneBrick, "milkStoneBrick");
	    GameRegistry.registerBlock(darkBrick, "darkBrick");
	    GameRegistry.registerBlock(ironBrick, "ironBrick");
	    GameRegistry.registerBlock(goldBrick, "goldBrick");
	    GameRegistry.registerBlock(realmiteBrick, "realmiteBrick");
	    GameRegistry.registerBlock(netheriteBrick, "netheriteBrick");
	    GameRegistry.registerBlock(lapisBrick, "lapisBrick");
	    GameRegistry.registerBlock(redstoneBrick, "redstoneBrick");
	    GameRegistry.registerBlock(checker, "checker");
	    GameRegistry.registerBlock(eucalyptusPlanks, "eucalyptusPlanks");
	    GameRegistry.registerBlock(eucalyptus, "eucalyptus");
	    
	    GameRegistry.registerBlock(spikes, "spikes");
	    GameRegistry.registerBlock(spiderPumpkin, "spiderPumpkin");
	    GameRegistry.registerBlock(enderPumpkin, "enderPumpkin");
	    GameRegistry.registerBlock(creeperPumpkin, "creeperPumpkin");
	    GameRegistry.registerBlock(skeletonPumpkin, "skeletonPumpkin");
	    GameRegistry.registerBlock(blazePumpkin, "blazePumpkin");
	    GameRegistry.registerBlock(lavaBrick, "lavaBrick");
	    GameRegistry.registerBlock(darkStairs, "darkStairs");
	    GameRegistry.registerBlock(arlemiteStairs, "arlemiteStairs");
	    GameRegistry.registerBlock(ironStairs, "ironStairs");
	    GameRegistry.registerBlock(goldStairs, "goldStairs");
	    GameRegistry.registerBlock(sandStairs, "sandStairs");
	    GameRegistry.registerBlock(redstoneStairs, "redstoneStairs");
	    GameRegistry.registerBlock(milkstoneStairs, "milkstoneStairs");
	    GameRegistry.registerBlock(milkstoneBricksStairs, "milkstoneBricksStairs");
	    GameRegistry.registerBlock(lapisStairs, "lapisStairs");
	    GameRegistry.registerBlock(arlemiteBrick, "arlemiteBrick");
	    GameRegistry.registerBlock(darkPlate, "darkPlate");
	    GameRegistry.registerBlock(milkstoneBrickStairs, "milkstoneBrickStairs");
	    GameRegistry.registerBlock(redWood, "redWood");
	    GameRegistry.registerBlock(purpleWood, "purpleWood");
	    GameRegistry.registerBlock(greenWood, "greenWood");
	    GameRegistry.registerBlock(yellowWood, "yellowWood");
	    GameRegistry.registerBlock(blueWood, "blueWood");
	    GameRegistry.registerBlock(whiteWood, "whiteWood");
	    GameRegistry.registerBlock(stoneFence, "stoneFence");
	    GameRegistry.registerBlock(woodFence, "woodFence");
	    GameRegistry.registerBlock(lightStone, "lightStone");
	    GameRegistry.registerBlock(purplestone, "purplestone");
	    GameRegistry.registerBlock(netheriteBlock, "netheriteBlock");
	    GameRegistry.registerBlock(arlemiteBlock, "arlemiteBlock");
	    GameRegistry.registerBlock(rupeeBlock, "rupeeBlock");
	    GameRegistry.registerBlock(diamondBrick, "diamondBrick");
	    GameRegistry.registerBlock(enderBrick, "enderBrick");

        GameRegistry.registerBlock(deadBridge, "deadBridge");
        GameRegistry.registerBlock(skullTorch, "skullTorch");
        GameRegistry.registerBlock(hotSpike, "hotSpike");
        GameRegistry.registerBlock(corruptedAlter, "corruptedAlter");
	    
	    GameRegistry.registerBlock(zombiePumpkin, "zombiePumpkin");
	    GameRegistry.registerBlock(iceManPumpkin, "iceManPumpkin");
	    GameRegistry.registerBlock(cyclopsPumpkin, "cyclopsPumpkin");
	    GameRegistry.registerBlock(frostPumpkin, "frostPumpkin");
	    GameRegistry.registerBlock(ghastPumpkin, "ghastPumpkin");
	    GameRegistry.registerBlock(jungleSpiderPumpkin, "jungleSpiderPumpkin");
	    GameRegistry.registerBlock(enderWatcherPumpkin, "enderWatcherPumpkin");
	    GameRegistry.registerBlock(hellSpiderPumpkin, "hellSpiderPumpkin");
	    GameRegistry.registerBlock(glassWhite, "glassWhite");
	    GameRegistry.registerBlock(glassOrange, "glassOrange");
	    GameRegistry.registerBlock(glassLightPurple, "glassLightPurple");
	    GameRegistry.registerBlock(glassLightBlue, "glassLightBlue");
	    GameRegistry.registerBlock(glassYellow, "glassYellow");
	    GameRegistry.registerBlock(glassLimeGreen, "glassLimeGreen");
	    GameRegistry.registerBlock(glassPink, "glassPink");
	    GameRegistry.registerBlock(glassGray, "glassGray");
	    GameRegistry.registerBlock(glassLightGray, "glassLightGray");
	    GameRegistry.registerBlock(glassTeal, "glassTeal");
	    GameRegistry.registerBlock(glassBlue, "glassBlue");
	    GameRegistry.registerBlock(glassPurple, "glassPurple");
	    GameRegistry.registerBlock(glassDirtyGreen, "glassDirtyGreen");
	    GameRegistry.registerBlock(glassBrown, "glassBrown");
	    GameRegistry.registerBlock(glassRed, "glassRed");
	    GameRegistry.registerBlock(glassBlack, "glassBlack");
	    GameRegistry.registerBlock(paneBlack, "paneBlack");
	    GameRegistry.registerBlock(paneRed, "paneRed");
	    GameRegistry.registerBlock(paneDirtyGreen, "paneDirtyGreen");
	    GameRegistry.registerBlock(paneBrown, "paneBrown");
	    GameRegistry.registerBlock(paneBlue, "paneBlue");
	    GameRegistry.registerBlock(panePurple, "panePurple");
	    GameRegistry.registerBlock(paneTeal, "paneTeal");
	    GameRegistry.registerBlock(paneLightGray, "paneLightGray");
	    GameRegistry.registerBlock(paneGray, "paneGray");
	    GameRegistry.registerBlock(panePink, "panePink");
	    GameRegistry.registerBlock(paneYellow, "paneYellow");
	    GameRegistry.registerBlock(paneLimeGreen, "paneLimeGreen");
	    GameRegistry.registerBlock(paneLightBlue, "paneLightBlue");
	    GameRegistry.registerBlock(paneLightPurple, "paneLightPurple");
	    GameRegistry.registerBlock(paneWhite, "paneWhite");
	    GameRegistry.registerBlock(paneOrange, "paneOrange");
	    GameRegistry.registerBlock(stainedGlass, "stainedGlass");
	    GameRegistry.registerBlock(stainedGlass1, "stainedGlass1");
	    GameRegistry.registerBlock(stainedGlass2, "stainedGlass2");
	    GameRegistry.registerBlock(stainedGlass3, "stainedGlass3");
	    GameRegistry.registerBlock(stainedGlass4, "stainedGlass4");
	    GameRegistry.registerBlock(stainedGlass5, "stainedGlass5");
	    GameRegistry.registerBlock(stainedGlass6, "stainedGlass6");
	    GameRegistry.registerBlock(stainedGlass7, "stainedGlass7");
	}
}