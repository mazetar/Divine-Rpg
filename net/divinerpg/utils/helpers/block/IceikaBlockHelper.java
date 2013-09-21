package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.core.DivineGlass;
import net.divinerpg.blocks.core.BlockDivine;
import net.divinerpg.blocks.core.BlockDivinePortal;
import net.divinerpg.blocks.core.DivineSpawner;
import net.divinerpg.blocks.core.DivineGrass;
import net.divinerpg.blocks.iceika.BlockGiftBox;
import net.divinerpg.blocks.iceika.BlockIceikaChest;
import net.divinerpg.blocks.iceika.BlockIceikaDoor;
import net.divinerpg.blocks.iceika.BlockIceikaFurnace;
import net.divinerpg.blocks.iceika.BlockIceikaLog;
import net.divinerpg.entities.particle.EntityDravitePortalFX;
import net.divinerpg.utils.helpers.DimensionRegistry;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
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
//	public static Block redXmasLights;
//	public static Block greenXmasLights;
//	public static Block blueXmasLights;
//	public static Block yellowXmasLights;
//	public static Block purpleXmasLights;
//	public static Block redCandyCane;
//	public static Block greenCandyCane;
//	public static Block blueCandyCane;
//	public static Block yellowCandyCane;
//	public static Block purpleCandyCane;
	public static Block giftBox; 
	public static BlockDivinePortal iceikaPortal;
	
	static IceikaConfigHelper cfg;
	
	public static void init() {
	    initBlocks();
	    registerBlocks();
	    addNames();
	    
	}
	
	private static void initBlocks() {
		frostedStone = new BlockDivine(cfg.FrostedStoneID, 0, Material.rock).func_111022_d("FrostedStone").setHardness(1.5F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("FrostedStone").setCreativeTab(DivineTabs.tabBlocks);
		frostedDirt = new BlockDivine(cfg.FrostedDirtID, 0, Material.grass).func_111022_d("IceGrass_Bottom").setHardness(0.6F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("FrostedDirt").setCreativeTab(DivineTabs.tabBlocks);
		frostedGrass = new DivineGrass(cfg.FrostedGrassID, frostedDirt).func_111022_d("IceGrass").setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("FrostedGrass").setCreativeTab(DivineTabs.tabBlocks);
		frostedWood = new BlockIceikaLog(cfg.FrostedWoodID).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("FrostedWood").setCreativeTab(DivineTabs.tabBlocks);
		frostedLeaves = new BlockDivine(cfg.FrostedLeavesID, 0, Material.leaves).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("FrostedLeaves").setCreativeTab(DivineTabs.tabBlocks);
		icyStone = new BlockDivine(cfg.IcyStoneID, 0, Material.rock).func_111022_d("IcyStone").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("IcyStone").setBlockUnbreakable().setCreativeTab(DivineTabs.tabBlocks);
		icyBricks = new BlockDivine(cfg.IcyBricksID, 0, Material.rock).func_111022_d("IcyBrick").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("IcyBricks").setBlockUnbreakable().setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineTabs.tabBlocks);
		snowyBricks = new BlockDivine(cfg.SnowyBricksID, 0, Material.snow).func_111022_d("SnowyBrick").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("SnowyBricks").setCreativeTab(DivineTabs.tabBlocks);
		coalstone = new BlockDivine(cfg.CoalstoneID, 0, Material.rock).setTextureName("CoalStone").setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("CoalStone").setCreativeTab(DivineTabs.tabBlocks);
		coalstoneFurnaceActive = new BlockIceikaFurnace(cfg.CoalstoneFurnaceActiveID, true).func_111022_d("CoalStoneFurnace_Front_On").setUnlocalizedName("IceikaFurnace").setCreativeTab(DivineTabs.tabBlocks);
		coalstoneFurnace = new BlockIceikaFurnace(cfg.CoalstoneFurnaceID, false).func_111022_d("CoalStoneFurnace_Front_Off").setUnlocalizedName("IceikaFurnace").setCreativeTab(DivineTabs.tabBlocks);
		
		workshopCarpet = new BlockDivine(cfg.WorkshopCarpetID, 0, Material.cloth).func_111022_d("WorkshopCarpet").setUnlocalizedName("WorkshopCarpet").setCreativeTab(DivineTabs.tabBlocks);
		workshopBookcase = new BlockDivine(cfg.WorkshopBookcaseID, 0, Material.wood).func_111022_d("WorkshopBookcase").setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("WorkshopBookcase").setCreativeTab(DivineTabs.tabBlocks);
		workshopLamp = new BlockDivine(cfg.WorkshopLampID, 0, Material.rock).func_111022_d("WorkshopLamp").setLightValue(1.0F).setUnlocalizedName("WorkshopLamp").setCreativeTab(DivineTabs.tabBlocks);
		frostedGlass = new DivineGlass(cfg.FrostedGlassID).func_111022_d("FrostedGlass").setUnlocalizedName("FrostedGlass").setCreativeTab(DivineTabs.tabBlocks);
		steelDoor = new BlockIceikaDoor(cfg.SteelDoorID, Material.iron).func_111022_d("IceDoor").setHardness(2.0F).setResistance(5.0F).setBlockUnbreakable().setUnlocalizedName("SteelDoor").setCreativeTab(DivineTabs.tabBlocks);
		frostedChest = new BlockIceikaChest(cfg.FrostedChestID).func_111022_d("FrostedChest").setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("FrostedChest").setCreativeTab(DivineTabs.tabBlocks);
		glacideSpawner = new DivineSpawner(cfg.GlacideSpawnerID, "Glacide").func_111022_d("FrozenDungeonSpawner").setUnlocalizedName("FrozenDungeonSpawner");
		rolumSpawner = new DivineSpawner(cfg.RolumSpawnerID, "Rollum").func_111022_d("FrozenDungeonSpawner").setUnlocalizedName("FrozenDungeonSpawner");
		
		iceikaPortal = ((BlockDivinePortal) new BlockDivinePortal(IceikaConfigHelper.IceikaPortalID).func_111022_d("IceikaPortal").setUnlocalizedName("IceikaPortal").setCreativeTab(DivineTabs.tabBlocks))
                .setPortalVariables(Block.blockSnow, glacideSpawner/* aka. nothing */, DimensionRegistry.IceikaID, "", new EntityDravitePortalFX(null, 1, 2, 3, 4, 5, 6));
        
		giftBox = new BlockGiftBox(cfg.GiftBoxID).func_111022_d("GiftBox").setUnlocalizedName("GiftBox");
		
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
	}
	
	private static void registerBlocks() {
	    GameRegistry.registerBlock(frostedStone, "frostedStone");
	    GameRegistry.registerBlock(frostedDirt, "frostedDirt"); 
	    GameRegistry.registerBlock(frostedGrass, "frostedGrass"); 
	    GameRegistry.registerBlock(frostedWood, "frostedWood");
	    GameRegistry.registerBlock(frostedLeaves, "frostedLeaves"); 
	    GameRegistry.registerBlock(icyStone, "icyStone");
	    GameRegistry.registerBlock(icyBricks, "icyBricks");
	    GameRegistry.registerBlock(snowyBricks, "snowyBricks"); 
	    GameRegistry.registerBlock(coalstone, "coalstone");
	    GameRegistry.registerBlock(coalstoneFurnaceActive, "coalstoneFurnaceActive");
	    GameRegistry.registerBlock(coalstoneFurnace, "coalstoneFurnace"); 
	    
	    GameRegistry.registerBlock(workshopCarpet, "workshopCarpet");
	    GameRegistry.registerBlock(workshopBookcase, "workshopBookcase");
	    GameRegistry.registerBlock(workshopLamp, "workshopLamp");
	    GameRegistry.registerBlock(frostedGlass, "frostedGlass");
	    GameRegistry.registerBlock(steelDoor, "steelDoor");
	    GameRegistry.registerBlock(frostedChest, "frostedChest");
	    GameRegistry.registerBlock(glacideSpawner, "glacideSpawner"); 
	    GameRegistry.registerBlock(rolumSpawner, "rolumSpawner"); 
	    GameRegistry.registerBlock(iceikaPortal, "iceikaPortal");
	    GameRegistry.registerBlock(giftBox, "giftBox");
	}
	
	private static void addNames() {

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
        LanguageRegistry.addName(giftBox, "Gift");
//      LanguageRegistry.addName(xmasTreeLights, "Xmas Tree Lights");
//      LanguageRegistry.addName(redXmasLights, "Red Xmas Lights");
//      LanguageRegistry.addName(greenXmasLights, "Green Xmas Lights");
//      LanguageRegistry.addName(blueXmasLights, "Blue Xmas Lights");
//      LanguageRegistry.addName(yellowXmasLights, "Yellow Xmas Lights");
//      LanguageRegistry.addName(purpleXmasLights, "Purple Xmas Lights");
//      LanguageRegistry.addName(redCandyCane, "Red Candy Cane");
//      LanguageRegistry.addName(greenCandyCane, "Green Candy Cane");
//      LanguageRegistry.addName(blueCandyCane, "Blue Candy Cane");
//      LanguageRegistry.addName(yellowCandyCane, "Yellow Candy Cane");
//      LanguageRegistry.addName(purpleCandyCane, "Purple Candy Cane");
	}
}
