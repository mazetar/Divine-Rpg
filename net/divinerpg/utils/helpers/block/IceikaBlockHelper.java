package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.BlockColoredGlass;
import net.divinerpg.blocks.BlockDivineRPG;
import net.divinerpg.blocks.BlockDivineRPGSpawner;
import net.divinerpg.blocks.iceika.BlockIceikaChest;
import net.divinerpg.blocks.iceika.BlockIceikaDoor;
import net.divinerpg.blocks.iceika.BlockIceikaFurnace;
import net.divinerpg.blocks.iceika.BlockIceikaGrass;
import net.divinerpg.blocks.iceika.BlockIceikaLog;
import net.divinerpg.blocks.iceika.BlockPortalIceika;
import net.divinerpg.blocks.iceika.BlockXmasLights;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
		frostedStone = new BlockDivineRPG(x.FrostedStoneID, 0, Material.rock).func_111022_d("FrostedStone").setHardness(1.5F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("FrostedStone").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedDirt = new BlockDivineRPG(x.FrostedDirtID, 0, Material.grass).func_111022_d("IceGrass_Bottom").setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("FrostedDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedGrass = new BlockIceikaGrass(x.FrostedGrassID).func_111022_d("IceGrass").setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("FrostedGrass").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedWood = new BlockIceikaLog(x.FrostedWoodID).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("FrostedWood").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedLeaves = new BlockDivineRPG(x.FrostedLeavesID, 0, Material.leaves).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("FrostedLeaves").setCreativeTab(CreativeTabHelper.tabBlocks);
		icyStone = new BlockDivineRPG(x.IcyStoneID, 0, Material.rock).func_111022_d("IcyStone").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("IcyStone").setBlockUnbreakable().setCreativeTab(CreativeTabHelper.tabBlocks);
		icyBricks = new BlockDivineRPG(x.IcyBricksID, 0, Material.rock).func_111022_d("IcyBrick").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("IcyBricks").setBlockUnbreakable().setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabBlocks);
		snowyBricks = new BlockDivineRPG(x.SnowyBricksID, 0, Material.snow).func_111022_d("SnowyBrick").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("SnowyBricks").setCreativeTab(CreativeTabHelper.tabBlocks);
		coalstone = new BlockDivineRPG(x.CoalstoneID, 0, Material.rock).func_111022_d("CoalStone").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("CoalStone").setCreativeTab(CreativeTabHelper.tabBlocks);
		coalstoneFurnaceActive = new BlockIceikaFurnace(x.CoalstoneFurnaceActiveID, true).func_111022_d("CoalStoneFurnace_Front_On").setUnlocalizedName("IceikaFurnace").setCreativeTab(CreativeTabHelper.tabBlocks);
		coalstoneFurnace = new BlockIceikaFurnace(x.CoalstoneFurnaceID, false).func_111022_d("CoalStoneFurnace_Front_Off").setUnlocalizedName("IceikaFurnace").setCreativeTab(CreativeTabHelper.tabBlocks);
		
		workshopCarpet = new BlockDivineRPG(x.WorkshopCarpetID, 0, Material.cloth).func_111022_d("WorkshopCarpet").setUnlocalizedName("WorkshopCarpet").setCreativeTab(CreativeTabHelper.tabBlocks);
		workshopBookcase = new BlockDivineRPG(x.WorkshopBookcaseID, 0, Material.wood).func_111022_d("WorkshopBookcase").setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("WorkshopBookcase").setCreativeTab(CreativeTabHelper.tabBlocks);
		workshopLamp = new BlockDivineRPG(x.WorkshopLampID, 0, Material.rock).func_111022_d("WorkshopLamp").setLightValue(1.0F).setUnlocalizedName("WorkshopLamp").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedGlass = new BlockColoredGlass(x.FrostedGlassID, false).func_111022_d("FrostedGlass").setUnlocalizedName("FrostedGlass").setCreativeTab(CreativeTabHelper.tabBlocks);
		steelDoor = new BlockIceikaDoor(x.SteelDoorID, Material.iron).func_111022_d("IceDoor").setHardness(2.0F).setResistance(5.0F).setBlockUnbreakable().setUnlocalizedName("SteelDoor").setCreativeTab(CreativeTabHelper.tabBlocks);
		frostedChest = new BlockIceikaChest(x.FrostedChestID).func_111022_d("FrostedChest").setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("FrostedChest").setCreativeTab(CreativeTabHelper.tabBlocks);
		glacideSpawner = new BlockDivineRPGSpawner(x.GlacideSpawnerID, 0, Material.rock, "DivineRPG_glacide").func_111022_d("FrozenDungeonSpawner").setUnlocalizedName("FrozenDungeonSpawner");
		rolumSpawner = new BlockDivineRPGSpawner(x.RolumSpawnerID, 0, Material.rock, "DivineRPG_rollum").func_111022_d("FrozenDungeonSpawner").setUnlocalizedName("FrozenDungeonSpawner");
//TODO: Fix textures for xmas stuff.
		//        xmasTreeLights = new BlockDivineRPG(x.XmasTreeLightsID, 0, Material.leaves).func_111022_d("").setHardness(0.2F).setUnlocalizedName("LightLeaves").setCreativeTab(CreativeTabHelper.tabBlocks);
//		redXmasLights = new BlockXmasLights(x.RedXmasLightsID, 0).func_111022_d("").setHardness(0.2F).setUnlocalizedName("RedXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
//		greenXmasLights = new BlockXmasLights(x.GreenXmasLightsID, 1).func_111022_d("").setHardness(0.2F).setUnlocalizedName("GreenXmasLights").setHardness(1.0F).setResistance(1.0F).setCreativeTab(CreativeTabHelper.tabBlocks);
//		blueXmasLights = new BlockXmasLights(x.BlueXmasLightsID, 2).func_111022_d("").setHardness(0.2F).setUnlocalizedName("BlueXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
//		yellowXmasLights = new BlockXmasLights(x.YellowXmasLightsID, 3).func_111022_d("").setHardness(0.2F).setUnlocalizedName("YellowXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
//		purpleXmasLights = new BlockXmasLights(x.PurpleXmasLightsID, 4).func_111022_d("").setHardness(0.2F).setUnlocalizedName("PurpleXmasLights").setCreativeTab(CreativeTabHelper.tabBlocks);
//		redCandyCane = new BlockDivineRPG(x.RedCandyCaneID, 0, Material.rock).func_111022_d("").setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("RedCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
//		greenCandyCane = new BlockDivineRPG(x.GreenCandyCaneID, 0, Material.rock).func_111022_d("").setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("GreenCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
//		blueCandyCane = new BlockDivineRPG(x.BlueCandyCaneID, 0, Material.rock).func_111022_d("").setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("BlueCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
//		yellowCandyCane = new BlockDivineRPG(x.YellowCandyCaneID, 0, Material.rock).func_111022_d("").setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("YellowCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
//		purpleCandyCane = new BlockDivineRPG(x.PurpleCandyCaneID, 0, Material.rock).func_111022_d("").setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("PurpleCandyCane").setCreativeTab(CreativeTabHelper.tabBlocks);
//	
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
//		LanguageRegistry.addName(xmasTreeLights, "Xmas Tree Lights");
//		LanguageRegistry.addName(redXmasLights, "Red Xmas Lights");
//		LanguageRegistry.addName(greenXmasLights, "Green Xmas Lights");
//		LanguageRegistry.addName(blueXmasLights, "Blue Xmas Lights");
//		LanguageRegistry.addName(yellowXmasLights, "Yellow Xmas Lights");
//		LanguageRegistry.addName(purpleXmasLights, "Purple Xmas Lights");
//		LanguageRegistry.addName(redCandyCane, "Red Candy Cane");
//		LanguageRegistry.addName(greenCandyCane, "Green Candy Cane");
//		LanguageRegistry.addName(blueCandyCane, "Blue Candy Cane");
//		LanguageRegistry.addName(yellowCandyCane, "Yellow Candy Cane");
//		LanguageRegistry.addName(purpleCandyCane, "Purple Candy Cane");
	}
}
