package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.divinerpg.blocks.BlockColoredGlass;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.blocks.BlockDivineRPGSpawner;
import xolova.divinerpg.blocks.iceika.BlockIceikaChest;
import xolova.divinerpg.blocks.iceika.BlockIceikaDoor;
import xolova.divinerpg.blocks.iceika.BlockIceikaFurnace;
import xolova.divinerpg.blocks.iceika.BlockIceikaGrass;
import xolova.divinerpg.blocks.iceika.BlockIceikaLog;
import xolova.divinerpg.blocks.iceika.BlockPortalIceika;
import xolova.divinerpg.blocks.iceika.BlockXmasLights;
import xolova.divinerpg.utils.helpers.config.IceikaConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
	public static Block rolumSpawner;
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
	public static Block giftBox; 
	public static BlockPortalIceika iceikaPortal;
	
	static IceikaConfigHelper x;
	
	public static void init() {
		frostedStone = new BlockDivineRPG(x.FrostedStoneID, 0, Material.rock).setIconIndex(3, 15, 15).setHardness(1.5F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("frostedStone").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedDirt = new BlockDivineRPG(x.FrostedDirtID, 0, Material.grass).setIconIndex(3, 1, 13).setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("frostedDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedGrass = new BlockIceikaGrass(x.FrostedGrassID).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("frostedGrass").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedWood = new BlockIceikaLog(x.FrostedWoodID).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("frostedWood").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedLeaves = new BlockDivineRPG(x.FrostedLeavesID, 0, Material.leaves).setIconIndex(3, 5, 13).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("frostedLeaves").setCreativeTab(CreativeTabHelper.tabBlocks);
		icyStone = new BlockDivineRPG(x.IcyStoneID, 0, Material.rock).setIconIndex(3, 8, 13).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("icyStone").setBlockUnbreakable().setCreativeTab(CreativeTabHelper.tabBlocks);
		icyBricks = new BlockDivineRPG(x.IcyBricksID, 0, Material.rock).setIconIndex(3, 6, 13).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("icyBricks").setBlockUnbreakable().setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabBlocks);
		snowyBricks = new BlockDivineRPG(x.SnowyBricksID, 0, Material.snow).setIconIndex(3, 9, 13).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("snowyBricks").setCreativeTab(CreativeTabHelper.tabBlocks);
		coalstone = new BlockDivineRPG(x.CoalstoneID, 0, Material.rock).setIconIndex(3, 15, 12).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("coalstone").setCreativeTab(CreativeTabHelper.tabBlocks);
		coalstoneFurnaceActive = new BlockIceikaFurnace(x.CoalstoneFurnaceActiveID, true).setUnlocalizedName("iceikaFurnace").setCreativeTab(CreativeTabHelper.tabBlocks);
		coalstoneFurnace = new BlockIceikaFurnace(x.CoalstoneFurnaceID, false).setUnlocalizedName("iceikaFurnace").setCreativeTab(CreativeTabHelper.tabBlocks);
		workshopCarpet = new BlockDivineRPG(x.WorkshopCarpetID, 0, Material.cloth).setIconIndex(3, 13, 13).setUnlocalizedName("workshopCarpet").setCreativeTab(CreativeTabHelper.tabBlocks);
		workshopBookcase = new BlockDivineRPG(x.WorkshopBookcaseID, 0, Material.wood).setIconIndex(3, 15, 13).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("workshopBookcase").setCreativeTab(CreativeTabHelper.tabBlocks);
		workshopLamp = new BlockDivineRPG(x.WorkshopLampID, 0, Material.rock).setIconIndex(3, 12, 13).setLightValue(1.0F).setUnlocalizedName("workshopLamp").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedGlass = new BlockColoredGlass(x.FrostedGlassID, false).setIconIndex(3, 14, 13).setUnlocalizedName("frostedGlass").setCreativeTab(CreativeTabHelper.tabBlocks);
		steelDoor = new BlockIceikaDoor(x.SteelDoorID, Material.iron).setHardness(2.0F).setResistance(5.0F).setBlockUnbreakable().setUnlocalizedName("steelDoor").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedChest = new BlockIceikaChest(x.FrostedChestID).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("frostedChest").setCreativeTab(CreativeTabHelper.tabBlocks);
		xmasTreeLights = new BlockDivineRPG(x.XmasTreeLightsID, 0, Material.leaves).setIconIndex(3, 5, 15).setHardness(0.2F).setUnlocalizedName("lightleaves").setCreativeTab(CreativeTabHelper.tabBlocks);
		glacideSpawner = new BlockDivineRPGSpawner(x.GlacideSpawnerID, 0, Material.rock, "DivineRPG_glacide").setIconIndex(3, 7, 13).setUnlocalizedName("frozenDungeonSpawner");
		rolumSpawner = new BlockDivineRPGSpawner(x.RolumSpawnerID, 0, Material.rock, "DivineRPG_rollum").setIconIndex(3, 7, 13).setUnlocalizedName("frozenDungeonSpawner");
		redXmasLights = new BlockXmasLights(x.RedXmasLightsID, 0).setHardness(0.2F).setUnlocalizedName("redXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
		greenXmasLights = new BlockXmasLights(x.GreenXmasLightsID, 1).setHardness(0.2F).setUnlocalizedName("greenXmasLights").setHardness(1.0F).setResistance(1.0F).setCreativeTab(CreativeTabHelper.tabBlocks);
		blueXmasLights = new BlockXmasLights(x.BlueXmasLightsID, 2).setHardness(0.2F).setUnlocalizedName("blueXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
		yellowXmasLights = new BlockXmasLights(x.YellowXmasLightsID, 3).setHardness(0.2F).setUnlocalizedName("yellowXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
		purpleXmasLights = new BlockXmasLights(x.PurpleXmasLightsID, 4).setHardness(0.2F).setUnlocalizedName("purpleXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
		redCandyCane = new BlockDivineRPG(x.RedCandyCaneID, 0, Material.rock).setIconIndex(3, 0, 12).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("redCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
		greenCandyCane = new BlockDivineRPG(x.GreenCandyCaneID, 0, Material.rock).setIconIndex(3, 1, 12).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("greenCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
		blueCandyCane = new BlockDivineRPG(x.BlueCandyCaneID, 0, Material.rock).setIconIndex(3, 2, 12).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("blueCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
		yellowCandyCane = new BlockDivineRPG(x.YellowCandyCaneID, 0, Material.rock).setIconIndex(3, 3, 12).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("yellowCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
		purpleCandyCane = new BlockDivineRPG(x.PurpleCandyCaneID, 0, Material.rock).setIconIndex(3, 0, 12).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("purpleCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
	
		LanguageRegistry.addName(frostedStone, "Frosted Stone");
		LanguageRegistry.addName(frostedDirt, "Frosted Dirt");
		LanguageRegistry.addName(frostedGrass, "Frosted Grass");
		LanguageRegistry.addName(frostedWood, "Frosted Wood");
		LanguageRegistry.addName(frostedLeaves, "Frosted Leaves");
		LanguageRegistry.addName(icyStone, "Icy Stone");
		LanguageRegistry.addName(icyBricks, "Icy Bricks");
		LanguageRegistry.addName(coalstone, "Coalstone");
		LanguageRegistry.addName(coalstoneFurnace, "Coalstone Funace");
		LanguageRegistry.addName(workshopCarpet, "Workshop Carpet");
		LanguageRegistry.addName(workshopBookcase, "Workshop Bookcase");
		LanguageRegistry.addName(workshopLamp, "Workshop Lamp");
		LanguageRegistry.addName(frostedGlass, "Frosted Glass");
		LanguageRegistry.addName(xmasTreeLights, "Xmas Tree Lights");
		LanguageRegistry.addName(redXmasLights, "Red Xmas Lights");
		LanguageRegistry.addName(greenXmasLights, "Green Xmas Lights");
		LanguageRegistry.addName(blueXmasLights, "Blue Xmas Lights");
		LanguageRegistry.addName(yellowXmasLights, "Yellow Xmas Lights");
		LanguageRegistry.addName(purpleXmasLights, "Purple Xmas Lights");
		LanguageRegistry.addName(redCandyCane, "Red Candy Cane");
		LanguageRegistry.addName(greenCandyCane, "Green Candy Cane");
		LanguageRegistry.addName(blueCandyCane, "Blue Candy Cane");
		LanguageRegistry.addName(yellowCandyCane, "Yellow Candy Cane");
		LanguageRegistry.addName(purpleCandyCane, "Purple Candy Cane");
	}
}
