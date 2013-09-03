package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.blocks.overworld.BlockAEStatue;
import net.divinerpg.blocks.overworld.BlockAcceleraunch;
import net.divinerpg.blocks.overworld.BlockAccelleron;
import net.divinerpg.blocks.overworld.BlockAyeracoBeamBlue;
import net.divinerpg.blocks.overworld.BlockAyeracoBeamGreen;
import net.divinerpg.blocks.overworld.BlockAyeracoBeamPurple;
import net.divinerpg.blocks.overworld.BlockAyeracoBeamRed;
import net.divinerpg.blocks.overworld.BlockAyeracoBeamYellow;
import net.divinerpg.blocks.overworld.BlockAyeracoStatue;
import net.divinerpg.blocks.overworld.BlockBlueFire;
import net.divinerpg.blocks.overworld.BlockColoredBricks;
import net.divinerpg.blocks.overworld.BlockColoredGlass;
import net.divinerpg.blocks.overworld.BlockColoredPane;
import net.divinerpg.blocks.overworld.BlockDarkBridge;
import net.divinerpg.blocks.overworld.BlockDarkPlate;
import net.divinerpg.blocks.overworld.BlockDyes;
import net.divinerpg.blocks.overworld.BlockElevantium;
import net.divinerpg.blocks.overworld.BlockFlowingTar;
import net.divinerpg.blocks.overworld.BlockKOSStatue;
import net.divinerpg.blocks.overworld.BlockLightBridge;
import net.divinerpg.blocks.overworld.BlockLightFence;
import net.divinerpg.blocks.overworld.BlockMiniBricks;
import net.divinerpg.blocks.overworld.BlockSkeletonChest;
import net.divinerpg.blocks.overworld.BlockSlimeLight;
import net.divinerpg.blocks.overworld.BlockStationaryTar;
import net.divinerpg.blocks.overworld.BlockSteel;
import net.divinerpg.blocks.overworld.BlockWatcherStatue;
import net.divinerpg.blocks.twilight.BlockGlowBone;
import net.divinerpg.utils.helpers.config.OverworldConfigHelper;
import net.minecraft.block.Block;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;

public class OverworldBlockHelper 
{
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
		colouredGlass = new BlockColoredGlass(cfg.colouredGlassID, Material.glass, 0).setUnlocalizedName("ColouredGlass");
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
	}

	public static void addNames()
	{
		
	}
}