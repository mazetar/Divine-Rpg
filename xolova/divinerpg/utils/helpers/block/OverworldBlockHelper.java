package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
import xolova.divinerpg.blocks.overworld.BlockDyes;
import xolova.divinerpg.blocks.overworld.BlockKOSStatue;
import xolova.divinerpg.blocks.overworld.BlockMiniBricks;
import xolova.divinerpg.blocks.overworld.BlockSteel;
import xolova.divinerpg.blocks.overworld.BlockWatcherStatue;
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
	public static Block skeletonChest;

	public static Block elevantium;
	public static Block darkPressurePlate;
	
	public static Block tarStill;
	public static Block tarFlowing;

	public static Block bloodGem;
	public static Block neteriteOre;
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
	
	public static Block fenceLightoff;
	public static Block fenceLighton;
	public static Block fenceLightoff1;
	public static Block fenceLighton1;
	public static Block redstoneBlock;
	public static Block redstoneBlockOn;
	public static Block purpleGlowBoneTree;
	public static Block pinkGlowBoneTree;
	
	public static OverworldConfigHelper x;
	
	public static void init()
	{
		blueFire = new BlockBlueFire(x.blueFireID, 0).setUnlocalizedName("BlueFire");
		divineRock = new BlockDivineRPG(x.divineRockID, Material.rock).setResistance(30).setHardness(3);
		
		acceleraunch = new BlockAcceleraunch(x.acceleraunchID);
		acceleron = new BlockAccelleron(x.acceleronID);
		
		aeStatue = new BlockAEStatue(x.aeStatueID);
		ayeracoStatue = new BlockAyeracoStatue(x.ayeracoStatueID);
		kosStatue = new BlockKOSStatue(x.kosStatueID);
		watcherStatue = new BlockWatcherStatue(x.watcherStatueID);
		
		ayeracoBeamBlue = new BlockAyeracoBeamBlue(x.ayeracoBeamBlueID);
		ayeracoBeamGreen = new BlockAyeracoBeamGreen(x.ayeracoBeamGreenID);
		ayeracoBeamPurple = new BlockAyeracoBeamPurple(x.ayeracoBeamPurpleID);
		ayeracoBeamRed = new BlockAyeracoBeamRed(x.ayeracoBeamRedID);
		ayeracoBeamYellow = new BlockAyeracoBeamYellow(x.ayeracoBeamYellowID);

		colouredBricks = new BlockColoredBricks(0, 0, null);
		colouredGlass = new BlockColoredGlass(0, null, 0);
		colouredPanes = new BlockColoredPane(x.colouredPanesID, "", "", Material.glass, false);
		dyeBlocks = new BlockDyes(x.dyeBlocksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30);
		miniBricks = new BlockMiniBricks(x.miniBricksID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3).setResistance(30).setUnlocalizedName("MiniBricks");
		steel = new BlockSteel(0, null);
		mobPumpkins = new BlockDivineRPG(0, 0, null);
		
		darkBridge = new BlockDivineRPG(0, 0, null);
		lightBridge = new BlockDivineRPG(0, 0, null);
		glowingStairs = new BlockDivineRPG(0, 0, null);
		lightFenceBlue = new BlockDivineRPG(0, 0, null);
		lightFenceRed = new BlockDivineRPG(0, 0, null);
		skeletonChest = new BlockDivineRPG(0, 0, null);

		elevantium = new BlockDivineRPG(0, 0, null);
		darkPressurePlate = new BlockDivineRPG(0, 0, null);
		
		tarStill = new BlockDivineRPG(0, 0, null);
		tarFlowing = new BlockDivineRPG(0, 0, null);

		bloodGem = new BlockDivineRPG(0, 0, null);
		neteriteOre = new BlockDivineRPG(0, 0, null);
		spikeBlock = new BlockDivineRPG(0, 0, null);
		hotSpikes = new BlockDivineRPG(0, 0, null);
		
		lightstone = new BlockDivineRPG(0, 0, null);
		rainbowWool = new BlockDivineRPG(0, 0, null);

		rupeeOre = new BlockDivineRPG(0, 0, null);
		arlemiteOre = new BlockDivineRPG(0, 0, null);
		realmiteOre = new BlockDivineRPG(0, 0, null);

		lapisLamp = new BlockDivineRPG(0, 0, null);
		slimeLight = new BlockDivineRPG(0, 0, null);
		slimeLightOn = new BlockDivineRPG(0, 0, null);
		redstoneOreLamp = new BlockDivineRPG(0, 0, null);
		goldLamp = new BlockDivineRPG(0, 0, null);
		diamondLamp = new BlockDivineRPG(0, 0, null);
		realmiteLamp = new BlockDivineRPG(0, 0, null);
		netheriteLamp = new BlockDivineRPG(0, 0, null);
		arlemiteLamp = new BlockDivineRPG(0, 0, null);
		rupeeLamp = new BlockDivineRPG(0, 0, null);
		icestoneLamp = new BlockDivineRPG(0, 0, null);
		moltenstoneLamp = new BlockDivineRPG(0, 0, null);
		junglestoneLamp = new BlockDivineRPG(0, 0, null);
		enderstoneLamp = new BlockDivineRPG(0, 0, null);
		bluefireLamp = new BlockDivineRPG(0, 0, null);
		divinestoneLamp = new BlockDivineRPG(0, 0, null);
		milkyLamp = new BlockDivineRPG(0, 0, null);
		blazicLamp = new BlockDivineRPG(0, 0, null);
		aquaLamp = new BlockDivineRPG(0, 0, null);
		lavaLamp = new BlockDivineRPG(0, 0, null);
		enderLamp = new BlockDivineRPG(0, 0, null);
		krakenLamp = new BlockDivineRPG(0, 0, null);
		drakenLamp = new BlockDivineRPG(0, 0, null);
		
		fenceLightoff = new BlockDivineRPG(0, 0, null);
		fenceLighton = new BlockDivineRPG(0, 0, null);
		fenceLightoff1 = new BlockDivineRPG(0, 0, null);
		fenceLighton1 = new BlockDivineRPG(0, 0, null);
		redstoneBlock = new BlockDivineRPG(0, 0, null);
		redstoneBlockOn = new BlockDivineRPG(0, 0, null);
		purpleGlowBoneTree = new BlockDivineRPG(0, 0, null);
		pinkGlowBoneTree = new BlockDivineRPG(0, 0, null);
	}

	public static void addNames()
	{
		
	}
}