package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.blocks.BlockDivineRPGLog;
import xolova.divinerpg.blocks.iceika.BlockIceikaGrass;
import xolova.divinerpg.blocks.iceika.BlockIceikaLog;
import xolova.divinerpg.utils.helpers.config.IceikaConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;

public class IceikaBlockHelper {
	
	public static Block frostedStone;
	public static Block frostedDirt;
	public static Block frostedGrass;
	public static Block frostedWood;
	public static Block frostedLeaves;
	public static Block icyStone;
	public static Block icyBricks;
	public static Block snowyBricks;
	public static Block coalstone;
	public static Block coalstoneFurnaceActive;
	public static Block coalstoneFurnace;
	public static Block workshopCarpet;
	public static Block workshopBookcase;
	public static Block workshopLamp;
	public static Block frostedGlass;
	public static Block steelDoor;
	public static Block frostedChest;
	public static Block xmasTreeLights;
	public static Block glacideSpawner;
	public static Block redXmasLights;
	public static Block greenXmasLights;
	public static Block blueXmasLights;
	public static Block yellowXmasLights;
	public static Block purpleXmasLights;
	public static Block redCandyCane;
	public static Block greenCandyCane;
	public static Block blueCandyCane;
	public static Block yellowCandyCane;
	public static Block purpleCandyCane;
	
	static IceikaConfigHelper x; 
	
	public static void init() {
		frostedStone = new BlockDivineRPG(x.FrostedStoneID, 0, Material.rock).setIconIndex(3, 15, 15).setHardness(1.5F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("frostedStone").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedDirt = new BlockDivineRPG(x.FrostedDirtID, 0, Material.grass).setIconIndex(3, 1, 13).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("frostedDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedGrass = new BlockIceikaGrass(x.FrostedDirtID).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("frostedGrass").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedWood = new BlockIceikaLog(x.FrostedWoodID).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("frostedGrass").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedLeaves = new BlockDivineRPG(x.FrostedLeavesID, 0, Material.leaves).setIconIndex(3, 3, 13).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("frostedGrass").setCreativeTab(CreativeTabHelper.tabBlocks);
		
	}
}
