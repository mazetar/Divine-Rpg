package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.blocks.overworld.BlockAEStatue;
import xolova.divinerpg.blocks.overworld.BlockAcceleraunch;
import xolova.divinerpg.blocks.overworld.BlockAccelleron;
import xolova.divinerpg.blocks.overworld.BlockAyeracoBeamBlue;
import xolova.divinerpg.blocks.overworld.BlockAyeracoBeamGreen;
import xolova.divinerpg.blocks.overworld.BlockAyeracoBeamPurple;
import xolova.divinerpg.blocks.overworld.BlockAyeracoBeamRed;
import xolova.divinerpg.blocks.overworld.BlockAyeracoBeamYellow;
import xolova.divinerpg.blocks.overworld.BlockAyeracoStatue;
import xolova.divinerpg.blocks.overworld.BlockBlueFire;
import xolova.divinerpg.blocks.overworld.BlockColoredBricks;
import xolova.divinerpg.blocks.overworld.BlockColoredGlass;
import xolova.divinerpg.blocks.overworld.BlockColoredPane;
import xolova.divinerpg.blocks.overworld.BlockDarkBridge;
import xolova.divinerpg.blocks.overworld.BlockDarkPlate;
import xolova.divinerpg.blocks.overworld.BlockDyes;
import xolova.divinerpg.blocks.overworld.BlockElevantium;
import xolova.divinerpg.blocks.overworld.BlockFlowingTar;
import xolova.divinerpg.blocks.overworld.BlockKOSStatue;
import xolova.divinerpg.blocks.overworld.BlockLightBridge;
import xolova.divinerpg.blocks.overworld.BlockLightFence;
import xolova.divinerpg.blocks.overworld.BlockMiniBricks;
import xolova.divinerpg.blocks.overworld.BlockRedstoneBlock;
import xolova.divinerpg.blocks.overworld.BlockSkeletonChest;
import xolova.divinerpg.blocks.overworld.BlockSlimeLight;
import xolova.divinerpg.blocks.overworld.BlockStationaryTar;
import xolova.divinerpg.blocks.overworld.BlockSteel;
import xolova.divinerpg.blocks.overworld.BlockWatcherStatue;
import xolova.divinerpg.blocks.twilight.BlockGlowBone;
import xolova.divinerpg.utils.helpers.config.OverworldConfigHelper;

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

	public static Block bloodGem;
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
	public static Block icestoneLamp;
	public static Block moltenstoneLamp;
	public static Block junglestoneLamp;
	public static Block enderstoneLamp;
	public static Block bluefireLamp;
	public static Block divinestoneLamp;
	public static Block milkyLamp;
	public static Block blazicLamp;
	public static Block aquaLamp;
	public static Block lavaLamp;
	public static Block enderLamp;
	public static Block krakenLamp;
	public static Block drakenLamp;
	public static Block redstoneBlock;
	public static Block redstoneBlockOn;
	public static Block purpleGlowBoneTree;
	public static Block pinkGlowBoneTree;
	
	
	public static Block realmiteBlock;
	public static Block milkStone;
	public static Block darkStone;
	public static Block obsidianBlock;
	public static Block bedrock;
	public static Block milkstonebricks;
	public static Block darkbricks;
	public static Block ironbricks;
	public static Block goldbricks;
	public static Block realmitebricks;
	public static Block netheritebricks;
	public static Block lapisbricks;
	public static Block redstonebricks;
	public static Block checker;
	public static Block eucalyptusPlanks;
	public static Block eucalyptus;
	
	public static OverworldConfigHelper x;
	
	public static void init()
	{
		blueFire = new BlockBlueFire(x.blueFireID, 0).setUnlocalizedName("BlueFire");
		divineRock = new BlockDivineRPG(x.divineRockID, Material.rock).setResistance(30).setHardness(3).setUnlocalizedName("divineRock");
		
		acceleraunch = new BlockAcceleraunch(x.acceleraunchID).setUnlocalizedName("acceleraunch");
		acceleron = new BlockAccelleron(x.acceleronID).setUnlocalizedName("acceleron");
		
		aeStatue = new BlockAEStatue(x.aeStatueID).setUnlocalizedName("aeStatue");
		ayeracoStatue = new BlockAyeracoStatue(x.ayeracoStatueID).setUnlocalizedName("ayeracoStatue");
		kosStatue = new BlockKOSStatue(x.kosStatueID).setUnlocalizedName("kosStatue");
		watcherStatue = new BlockWatcherStatue(x.watcherStatueID).setUnlocalizedName("watcherStatue");
		
		ayeracoBeamBlue = new BlockAyeracoBeamBlue(x.ayeracoBeamBlueID).setUnlocalizedName("ayeracoBeamBlue");
		ayeracoBeamGreen = new BlockAyeracoBeamGreen(x.ayeracoBeamGreenID).setUnlocalizedName("ayeracoBeamGreen");
		ayeracoBeamPurple = new BlockAyeracoBeamPurple(x.ayeracoBeamPurpleID).setUnlocalizedName("ayeracoBeamPurple");
		ayeracoBeamRed = new BlockAyeracoBeamRed(x.ayeracoBeamRedID).setUnlocalizedName("ayeracoBeamRed");
		ayeracoBeamYellow = new BlockAyeracoBeamYellow(x.ayeracoBeamYellowID).setUnlocalizedName("ayeracoBeamYellow");

		colouredBricks = new BlockColoredBricks(x.colouredBricksID, 0, Material.rock).setUnlocalizedName("colouredBricks");
		colouredGlass = new BlockColoredGlass(x.colouredGlassID, Material.glass, 0).setUnlocalizedName("colouredGlass");
		colouredPanes = new BlockColoredPane(x.colouredPanesID, "", "", Material.glass, false).setUnlocalizedName("colouredPanes");
		dyeBlocks = new BlockDyes(x.dyeBlocksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30).setUnlocalizedName("dyeBlocks");
		miniBricks = new BlockMiniBricks(x.miniBricksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30).setUnlocalizedName("MiniBricks");
		steel = new BlockSteel(x.steelID, Material.iron).setUnlocalizedName("steel");
		mobPumpkins = new BlockDivineRPG(x.mobPumpkinsID, 0, Material.pumpkin).setUnlocalizedName("mobPumpkins");
		
		darkBridge = new BlockLightBridge(x.darkBridgeID, 0, true).setUnlocalizedName("darkBridge");
		lightBridge = new BlockDarkBridge(x.lightBridgeID, 0, false).setUnlocalizedName("lightBridge");
		glowingStairs = new BlockDivineRPG(x.glowingStairsID, 0, Material.glass).setUnlocalizedName("glowingStairs");
		lightFenceBlue = new BlockLightFence(x.lightFenceBlueID, 0, false, "", Material.glass).setUnlocalizedName("lightFenceBlue");
		lightFenceBlueOn = new BlockLightFence(x.lightFenceBlueOnID, 0, false, "", Material.glass).setUnlocalizedName("lightFenceBlueOnID");
		lightFenceRed = new BlockLightFence(x.lightFenceRedID, 0, false, "", Material.glass).setUnlocalizedName("lightFenceRed");
		lightFenceRedOn = new BlockLightFence(x.lightFenceRedOnID, 0, false, "", Material.glass).setUnlocalizedName("lightFenceRedOnID");
		skeletonChest = new BlockSkeletonChest(x.skeletonChestID, 0).setUnlocalizedName("skeletonChest");

		elevantium = new BlockElevantium(x.elevantiumID, 0, "Elevantium", Material.rock);
		darkPressurePlate = new BlockDarkPlate(x.darkPressurePlateID, "DarkPlate", Material.rock, EnumMobType.players, 0).setUnlocalizedName("darkPressurePlate");
		
		MaterialLiquid tarMaterial = new MaterialLiquid(MapColor.ironColor);
		
		tarStill = new BlockStationaryTar(x.tarStillID, 0, tarMaterial).setUnlocalizedName("tarStill");
		tarFlowing = new BlockFlowingTar(x.tarFlowingID, 0, tarMaterial).setUnlocalizedName("tarFlowing");

		bloodGem = new BlockDivineRPG(x.bloodGemID, 0, Material.rock).setUnlocalizedName("bloodGem");
		netheriteOre = new BlockDivineRPG(x.netheriteOreID, 0, Material.rock).setUnlocalizedName("netheriteOre");
		spikeBlock = new BlockDivineRPG(x.spikeBlockID, 0, Material.rock).setUnlocalizedName("spikeBlock");
		hotSpikes = new BlockDivineRPG(x.hotSpikesID, 0, Material.rock).setUnlocalizedName("hotSpikes");
		
		lightstone = new BlockDivineRPG(x.lightstoneID, 0, Material.glass).setUnlocalizedName("lightstone");
		rainbowWool = new BlockDivineRPG(x.rainbowWoolID, 0, Material.cloth).setUnlocalizedName("rainbowWool");

		rupeeOre = new BlockDivineRPG(x.rupeeOreID, 0, Material.rock).setUnlocalizedName("rupeeOre");
		arlemiteOre = new BlockDivineRPG(x.arlemiteOreID, 0, Material.rock).setUnlocalizedName("arlemiteOre");
		realmiteOre = new BlockDivineRPG(x.realmiteOreID, 0, Material.rock).setUnlocalizedName("realmiteOre");

		lapisLamp = new BlockDivineRPG(x.lapisLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("lapisLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		slimeLight = new BlockSlimeLight(x.slimeLightID, false, 0).setUnlocalizedName("slimeLight").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		slimeLightOn = new BlockSlimeLight(x.slimeLightOnID, true, 0).setUnlocalizedName("slimeLightOn").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		redstoneOreLamp = new BlockDivineRPG(x.redstoneOreLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("redstoneOreLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		goldLamp = new BlockDivineRPG(x.goldLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("goldLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		diamondLamp = new BlockDivineRPG(x.diamondLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("diamondLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		realmiteLamp = new BlockDivineRPG(x.realmiteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("realmiteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		netheriteLamp = new BlockDivineRPG(x.netheriteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("netheriteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		arlemiteLamp = new BlockDivineRPG(x.arlemiteLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("arlemiteLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		rupeeLamp = new BlockDivineRPG(x.rupeeLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("rupeeLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		icestoneLamp = new BlockDivineRPG(x.icestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("icestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		moltenstoneLamp = new BlockDivineRPG(x.moltenstoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("moltenstoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		junglestoneLamp = new BlockDivineRPG(x.junglestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("junglestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		enderstoneLamp = new BlockDivineRPG(x.enderstoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("enderstoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		bluefireLamp = new BlockDivineRPG(x.bluefireLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("bluefireLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		divinestoneLamp = new BlockDivineRPG(x.divinestoneLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("divinestoneLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		milkyLamp = new BlockDivineRPG(x.milkyLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("milkyLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		blazicLamp = new BlockDivineRPG(x.blazicLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("blazicLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		aquaLamp = new BlockDivineRPG(x.aquaLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("aquaLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		lavaLamp = new BlockDivineRPG(x.lavaLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("lavaLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		enderLamp = new BlockDivineRPG(x.enderLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("enderLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		krakenLamp = new BlockDivineRPG(x.krakenLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("krakenLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		drakenLamp = new BlockDivineRPG(x.drakenLampID, 0, Material.glass).setLightValue(1.0F).setUnlocalizedName("drakenLamp").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		
		redstoneBlock = new BlockRedstoneBlock(x.redstoneBlockID, 0, false).setUnlocalizedName("redstoneBlock");
		redstoneBlockOn = new BlockRedstoneBlock(x.redstoneBlockOnID, 0, true).setUnlocalizedName("redstoneBlockOn");
		purpleGlowBoneTree = new BlockGlowBone(x.purpleGlowBoneTreeID, 0).setUnlocalizedName("purpleGlowBoneTree");
		pinkGlowBoneTree = new BlockGlowBone(x.pinkGlowBoneTreeID, 0).setUnlocalizedName("pinkGlowBoneTree");
	}

	public static void addNames()
	{
		
	}
}