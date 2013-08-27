package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.BlockDivineRPG;
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
	
	public static OverworldConfigHelper x;
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

	public static void init()
	{
		blueFire = new BlockBlueFire(x.blueFireID, 0).setUnlocalizedName("BlueFire");
		divineRock = new BlockDivineRPG(x.divineRockID, Material.rock).setResistance(30).setHardness(3).setUnlocalizedName("DivineRock");
		
		acceleraunch = new BlockAcceleraunch(x.acceleraunchID).setUnlocalizedName("Acceleraunch");
		acceleron = new BlockAccelleron(x.acceleronID).setUnlocalizedName("Acceleron");
		
		aeStatue = new BlockAEStatue(x.aeStatueID).setUnlocalizedName("aeStatue");
		ayeracoStatue = new BlockAyeracoStatue(x.ayeracoStatueID).setUnlocalizedName("AyeracoStatue");
		kosStatue = new BlockKOSStatue(x.kosStatueID).setUnlocalizedName("kosStatue");
		watcherStatue = new BlockWatcherStatue(x.watcherStatueID).setUnlocalizedName("WatcherStatue");
		
		ayeracoBeamBlue = new BlockAyeracoBeamBlue(x.ayeracoBeamBlueID).setUnlocalizedName("AyeracoBeamBlue");
		ayeracoBeamGreen = new BlockAyeracoBeamGreen(x.ayeracoBeamGreenID).setUnlocalizedName("AyeracoBeamGreen");
		ayeracoBeamPurple = new BlockAyeracoBeamPurple(x.ayeracoBeamPurpleID).setUnlocalizedName("AyeracoBeamPurple");
		ayeracoBeamRed = new BlockAyeracoBeamRed(x.ayeracoBeamRedID).setUnlocalizedName("AyeracoBeamRed");
		ayeracoBeamYellow = new BlockAyeracoBeamYellow(x.ayeracoBeamYellowID).setUnlocalizedName("AyeracoBeamYellow");

		colouredBricks = new BlockColoredBricks(x.colouredBricksID, 0, Material.rock).setUnlocalizedName("ColouredBricks");
		colouredGlass = new BlockColoredGlass(x.colouredGlassID, Material.glass, 0).setUnlocalizedName("ColouredGlass");
		colouredPanes = new BlockColoredPane(x.colouredPanesID, "", "", Material.glass, false).setUnlocalizedName("ColouredPanes");
		dyeBlocks = new BlockDyes(x.dyeBlocksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30).setUnlocalizedName("DyeBlocks");
		miniBricks = new BlockMiniBricks(x.miniBricksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30).setUnlocalizedName("MiniBricks");
		steel = new BlockSteel(x.steelID, Material.iron).setUnlocalizedName("Steel");
		mobPumpkins = new BlockDivineRPG(x.mobPumpkinsID, 0, Material.pumpkin).setUnlocalizedName("MobPumpkins");
		
		darkBridge = new BlockLightBridge(x.darkBridgeID, 0, true).setUnlocalizedName("DarkBridge");
		lightBridge = new BlockDarkBridge(x.lightBridgeID, 0, false).setUnlocalizedName("LightBridge");
		glowingStairs = new BlockDivineRPG(x.glowingStairsID, 0, Material.glass).setUnlocalizedName("GlowingStairs");
		lightFenceBlue = new BlockLightFence(x.lightFenceBlueID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceBlue");
		lightFenceBlueOn = new BlockLightFence(x.lightFenceBlueOnID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceBlueOnID");
		lightFenceRed = new BlockLightFence(x.lightFenceRedID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceRed");
		lightFenceRedOn = new BlockLightFence(x.lightFenceRedOnID, 0, false, "", Material.glass).setUnlocalizedName("LightFenceRedOnID");
		skeletonChest = new BlockSkeletonChest(x.skeletonChestID, 0).setUnlocalizedName("SkeletonChest");

		elevantium = new BlockElevantium(x.elevantiumID, 0, "Elevantium", Material.rock);
		darkPressurePlate = new BlockDarkPlate(x.darkPressurePlateID, "DarkPlate", Material.rock, EnumMobType.players, 0).setUnlocalizedName("DarkPressurePlate");
		
		MaterialLiquid tarMaterial = new MaterialLiquid(MapColor.ironColor);
		
		tarStill = new BlockStationaryTar(x.tarStillID, 0, tarMaterial).setUnlocalizedName("TarStill");
		tarFlowing = new BlockFlowingTar(x.tarFlowingID, 0, tarMaterial).setUnlocalizedName("TarFlowing");

		bloodGemOre = new BlockDivineRPG(x.bloodGemID, 0, Material.rock).setUnlocalizedName("BloodGemOre");
		netheriteOre = new BlockDivineRPG(x.netheriteOreID, 0, Material.rock).setUnlocalizedName("NetheriteOre");
		spikeBlock = new BlockDivineRPG(x.spikeBlockID, 0, Material.rock).setUnlocalizedName("SpikeBlock");
		hotSpikes = new BlockDivineRPG(x.hotSpikesID, 0, Material.rock).setUnlocalizedName("HotSpikes");
		
		lightstone = new BlockDivineRPG(x.lightstoneID, 0, Material.glass).setUnlocalizedName("LightStone");
		rainbowWool = new BlockDivineRPG(x.rainbowWoolID, 0, Material.cloth).setUnlocalizedName("RainbowWool");

		rupeeOre = new BlockDivineRPG(x.rupeeOreID, 0, Material.rock).setUnlocalizedName("RupeeOre");
		arlemiteOre = new BlockDivineRPG(x.arlemiteOreID, 0, Material.rock).setUnlocalizedName("ArlemiteOre");
		realmiteOre = new BlockDivineRPG(x.realmiteOreID, 0, Material.rock).setUnlocalizedName("RealmiteOre");

		lapisLamp = new BlockDivineRPG(x.lapisLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("LapisLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		slimeLight = new BlockSlimeLight(x.slimeLightID, false, 0).setUnlocalizedName("SlimeLight").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		slimeLightOn = new BlockSlimeLight(x.slimeLightOnID, true, 0).setUnlocalizedName("SlimeLightOn").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		redstoneOreLamp = new BlockDivineRPG(x.redstoneOreLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("RedstoneOreLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		goldLamp = new BlockDivineRPG(x.goldLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("GoldLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		diamondLamp = new BlockDivineRPG(x.diamondLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("DiamondLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		realmiteLamp = new BlockDivineRPG(x.realmiteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("RealmiteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		netheriteLamp = new BlockDivineRPG(x.netheriteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("NetheriteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		arlemiteLamp = new BlockDivineRPG(x.arlemiteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("ArlemiteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		rupeeLamp = new BlockDivineRPG(x.rupeeLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("RupeeLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		iceStoneLamp = new BlockDivineRPG(x.icestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("IcestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		moltenStoneLamp = new BlockDivineRPG(x.moltenstoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("MoltenstoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		jungleStoneLamp = new BlockDivineRPG(x.junglestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("JunglestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		enderStoneLamp = new BlockDivineRPG(x.enderstoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("EnderstoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		bluefireLamp = new BlockDivineRPG(x.bluefireLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("BluefireLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		divineStoneLamp = new BlockDivineRPG(x.divinestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("DivinestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		milkyLamp = new BlockDivineRPG(x.milkyLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("MilkyLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		blazicLamp = new BlockDivineRPG(x.blazicLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("BlazicLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		aquaLamp = new BlockDivineRPG(x.aquaLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("AquaLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		lavaLamp = new BlockDivineRPG(x.lavaLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("LavaLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		enderLamp = new BlockDivineRPG(x.enderLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("EnderLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		krakenLamp = new BlockDivineRPG(x.krakenLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("KrakenLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		drakenLamp = new BlockDivineRPG(x.drakenLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("DrakenLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		
		purpleGlowBoneTree = new BlockGlowBone(x.purpleGlowBoneTreeID, 0).setUnlocalizedName("PurpleGlowBoneTree");
		pinkGlowBoneTree = new BlockGlowBone(x.pinkGlowBoneTreeID, 0).setUnlocalizedName("PinkGlowBoneTree");
	}

	public static void addNames()
	{
		
	}
}