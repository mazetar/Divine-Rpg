package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.blocks.BlockDivinePortal;
import net.divinerpg.blocks.twilight.BlockAugiteDirt;
import net.divinerpg.blocks.twilight.BlockAugiteGrass;
import net.divinerpg.blocks.twilight.BlockAzuriteDirt;
import net.divinerpg.blocks.twilight.BlockAzuriteGrass;
import net.divinerpg.blocks.twilight.BlockDraviteDirt;
import net.divinerpg.blocks.twilight.BlockDraviteGrass;
import net.divinerpg.blocks.twilight.BlockMythilDirt;
import net.divinerpg.blocks.twilight.BlockMythilGrass;
import net.divinerpg.blocks.twilight.BlockTwilightLeaves;
import net.divinerpg.blocks.twilight.BlockTwilightOre;
import net.divinerpg.blocks.twilight.BlockTwilightStone;
import net.divinerpg.blocks.twilight.BlockTwilightWood;
import net.divinerpg.blocks.twilight.BlockUviteDirt;
import net.divinerpg.blocks.twilight.BlockUviteGrass;
import net.divinerpg.entities.particle.EntityAugitePortalFX;
import net.divinerpg.entities.particle.EntityAzuritePortalFX;
import net.divinerpg.entities.particle.EntityDravitePortalFX;
import net.divinerpg.entities.particle.EntityMythrilPortalFX;
import net.divinerpg.entities.particle.EntityRedPortalFX;
import net.divinerpg.utils.helpers.DimensionRegistry;
import net.divinerpg.utils.helpers.config.TwilightConfigHelper;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightBlockHelper 
{
	public static Block ColoredVane;
	public static Block TwilightStone;
	public static Block blueFire;
	public static Block divineRock;
	//-==-DRAVITE-==-//
	public static Block DraviteGrass;
	public static Block DraviteDirt;
	public static Block DraviteLogs;
	public static Block DraviteLeaves;
	public static Block DraviteOre;
	public static BlockDivinePortal DravitePortal;
	public static Block DraviteBlock;
	//-==-AZURITE-==-//
	public static Block AzuriteGrass;
	public static Block AzuriteDirt;
	public static Block AzuriteLogs;
	public static Block AzuriteLeaves;
	public static Block AzuriteOre;
	public static Block AzuriteVines;
	public static Block AzuriteBlock;
	public static BlockDivinePortal AzuritePortal;
	//-==-Uvite-==-//
	public static Block UviteGrass;
	public static Block UviteDirt;
	public static Block UviteLogs;
	public static Block UviteLeaves;
	public static Block UviteOre;
	public static Block UviteBlock;
	public static BlockDivinePortal UvitePortal;
	//-==-Mythril-==-//
	public static Block MythrilGrass;
	public static Block MythrilDirt;
	public static Block MythrilLogs;
	public static Block MythrilLeaves;
	public static Block MythrilOre;
	public static BlockDivinePortal MythrilPortal;
	public static Block MythrilBlock;
	//-==-Augite-==-//
	public static Block AugiteGrass;
	public static Block AugiteDirt;
	public static Block AugiteLogs;
	public static Block AugiteLeaves;
	public static Block AugiteOre;
	public static Block AugiteBlock;
	public static BlockDivinePortal AugitePortal;
	
	public static Block superEnchantMentTable;
	public static Block pinkGlowBoneTreeBase;
	public static Block purpleGlowBoneTreeBase;
	
	public static Block DensosStatue;
	public static Block ReyvorStatue;
	public static Block SFStatue;
	public static Block TDStatue;
	public static Block VamacheronStatue;
	
	
	public static Block DraviteLamp;
	public static Block draviteChest;
	public static Block uviteRail;
	
	public static void init()
	{
		TwilightStone = new BlockTwilightStone(TwilightConfigHelper.TwilightStoneID).setTextureName("TwilightStone").setUnlocalizedName("TwilightStone").setCreativeTab(CreativeTabHelper.tabBlocks);
		divineRock = new BlockDivine(TwilightConfigHelper.divineRockID, 0, Material.rock).setTextureName("DivineRock").setUnlocalizedName("DivineRock").setCreativeTab(CreativeTabs.tabTools);//.setCreativeTab(CreativeTabHelper.tabBlocks);
		
		DraviteGrass = new BlockDraviteGrass(TwilightConfigHelper.DraviteGrassID).setTextureName("DraviteGrass").setUnlocalizedName("DraviteGrass");
		DraviteDirt = new BlockDraviteDirt(TwilightConfigHelper.DraviteDirtID).setTextureName("DraviteGrass_Bottom").setUnlocalizedName("DraviteDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		DraviteLogs = new BlockTwilightWood(TwilightConfigHelper.DraviteLogsID).setTextureName("DraviteLog").setUnlocalizedName("DraviteLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		DraviteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.DraviteLeavesID).setTextureName("DraviteLeaves").setUnlocalizedName("DraviteLeaves");
		DraviteOre = new BlockTwilightOre(TwilightConfigHelper.DraviteOreID).setTextureName("DraviteOre").setUnlocalizedName("DraviteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		DraviteBlock = new BlockDivine(TwilightConfigHelper.DraviteBlockID, 0, Material.iron).setTextureName("DraviteBlock").setUnlocalizedName("DraviteBlock").setCreativeTab(CreativeTabHelper.tabBlocks);
        DravitePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.DravitePortalID).setTextureName("DravitePortal").setUnlocalizedName("DravitePortal").setCreativeTab(CreativeTabHelper.tabBlocks))
                .setPortalVariables(divineRock, blueFire, DimensionRegistry.DraviteID, "", new EntityDravitePortalFX(null, 1, 2, 3, 4, 5, 6), TwilightStone);
		
		AzuriteGrass = new BlockAzuriteGrass(TwilightConfigHelper.AzuriteGrassID).setTextureName("AzuriteGrass").setUnlocalizedName("AzuriteGrass");
		AzuriteDirt = new BlockAzuriteDirt(TwilightConfigHelper.AzuriteDirtID).setTextureName("AzuriteGrass_Bottom").setUnlocalizedName("AzuriteDirt");
		AzuriteLogs = new BlockTwilightWood(TwilightConfigHelper.AzuriteLogsID).setTextureName("AzuriteLog").setUnlocalizedName("AzuriteLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		AzuriteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.AzuriteLeavesID).setTextureName("AzuriteLeaves").setUnlocalizedName("AzuriteLeaves");
		AzuriteOre = new BlockTwilightOre(TwilightConfigHelper.AzuriteOreID).setTextureName("AzuriteOre").setUnlocalizedName("AzuriteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		AzuriteBlock = new BlockDivine(TwilightConfigHelper.AzuriteBlockID, 0, Material.iron).setTextureName("AzuriteBlock").setUnlocalizedName("AzuriteBlock").setCreativeTab(CreativeTabHelper.tabBlocks);
        AzuritePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.AzuritePortalID).func_111022_d("AzuritePortal").setUnlocalizedName("AzuritePortal").setCreativeTab(CreativeTabHelper.tabBlocks))
		        .setPortalVariables(DraviteBlock, blueFire, DimensionRegistry.AzuriteID, "", new EntityAzuritePortalFX(null, 1, 2, 3, 4, 5, 6), TwilightStone);
		
		UviteGrass = new BlockUviteGrass(TwilightConfigHelper.UviteGrassID).setTextureName("UviteGrass").setUnlocalizedName("UviteGrass");
		UviteDirt = new BlockUviteDirt(TwilightConfigHelper.UviteDirtID).setTextureName("UviteGrass_Bottom").setUnlocalizedName("UviteDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		UviteLogs = new BlockTwilightWood(TwilightConfigHelper.UviteLogsID).setTextureName("UviteLog").setUnlocalizedName("UviteLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		UviteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.UviteLeavesID).setTextureName("UviteLeaves").setUnlocalizedName("UviteLeaves");
		UviteOre = new BlockTwilightOre(TwilightConfigHelper.UviteOreID).setTextureName("UviteOre").setUnlocalizedName("UviteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		UviteBlock = new BlockDivine(TwilightConfigHelper.UviteBlockID, 0, Material.iron).setTextureName("UviteBlock").setUnlocalizedName("UviteBlock").setCreativeTab(CreativeTabHelper.tabBlocks);
        UvitePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.UvitePortalID).func_111022_d("UvitePortal").setUnlocalizedName("UvitePortal").setCreativeTab(CreativeTabHelper.tabBlocks))
		        .setPortalVariables(AzuriteBlock, blueFire, DimensionRegistry.UviteID, "", new EntityRedPortalFX(null, 1, 2, 3, 4, 5, 6), TwilightStone);
		
		MythrilGrass = new BlockMythilGrass(TwilightConfigHelper.MythrilGrassID).func_111022_d("MythrilGrass").setUnlocalizedName("MythrilGrass");
		MythrilDirt = new BlockMythilDirt(TwilightConfigHelper.MythrilDirtID).func_111022_d("MythrilGrass_Bottom").setUnlocalizedName("MythrilDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		MythrilLogs = new BlockTwilightWood(TwilightConfigHelper.MythrilLogsID).func_111022_d("MythrilLog").setUnlocalizedName("MythrilLog").setCreativeTab(CreativeTabHelper.tabBlocks);
		MythrilLeaves = new BlockTwilightLeaves(TwilightConfigHelper.MythrilLeavesID).func_111022_d("MythrilLeaves").setUnlocalizedName("MythrilLeaves");
		MythrilOre = new BlockTwilightOre(TwilightConfigHelper.MythrilOreID).func_111022_d("MythrilOre").setUnlocalizedName("MythrilOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		MythrilBlock = new BlockDivine(TwilightConfigHelper.MythrilBlockID, 0, Material.iron).setTextureName("MythrilBlock").setUnlocalizedName("MythrilBlock").setCreativeTab(CreativeTabHelper.tabBlocks);
        MythrilPortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.MythrilPortalID).func_111022_d("MythrilPortal").setUnlocalizedName("MythrilPortal").setCreativeTab(CreativeTabHelper.tabBlocks))
		        .setPortalVariables(UviteBlock, blueFire, DimensionRegistry.MythrilID, "", new EntityMythrilPortalFX(null, 1, 2, 3, 4, 5, 6), TwilightStone);
		
		AugiteGrass = new BlockAugiteGrass(TwilightConfigHelper.AugiteGrassID).func_111022_d("AugiteGrass").setUnlocalizedName("AugiteGrass");
		AugiteDirt = new BlockAugiteDirt(TwilightConfigHelper.AugiteDirtID).func_111022_d("AugiteGrass_Bottom").setUnlocalizedName("AugiteDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		AugiteLogs = new BlockTwilightWood(TwilightConfigHelper.AugiteLogsID).func_111022_d("AugiteLog").setUnlocalizedName("AugiteLog").setCreativeTab(CreativeTabHelper.tabBlocks);
		AugiteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.AugiteLeavesID).func_111022_d("AugiteLeaves").setUnlocalizedName("AugiteLeaves");
		AugiteOre = new BlockTwilightOre(TwilightConfigHelper.AugiteOreID).func_111022_d("AugiteOre").setUnlocalizedName("AugiteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		AugiteBlock = new BlockDivine(TwilightConfigHelper.AugiteBlockID, Material.rock).func_111022_d("AugiteBlock").setUnlocalizedName("AugiteBlock");
		AugitePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.AugitePortalID).func_111022_d("AugitePortal").setUnlocalizedName("AugitePortal").setCreativeTab(CreativeTabHelper.tabBlocks))
		        .setPortalVariables(MythrilBlock, blueFire, DimensionRegistry.AugiteID, "xolovon.AugitePortal",
		                new EntityAugitePortalFX(null, 1, 2, 3, 4, 5, 6), TwilightStone);
		
		InitGameRegistryBlocks();
	}
	
	public static void InitGameRegistryBlocks()
	{
		GameRegistry.registerBlock(TwilightStone, "TwilightStone");
		
		GameRegistry.registerBlock(DraviteGrass, "DraviteGrass");
		GameRegistry.registerBlock(DraviteDirt, "DraviteDirt");
		GameRegistry.registerBlock(DraviteLogs, "DraviteLogs");
		GameRegistry.registerBlock(DraviteLeaves, "DraviteLeaves");
		GameRegistry.registerBlock(DraviteOre, "DraviteOre");
		GameRegistry.registerBlock(DravitePortal, "DravitePortal");
		
		GameRegistry.registerBlock(AzuriteGrass, "AzuriteGrass");
		GameRegistry.registerBlock(AzuriteDirt, "AzuriteDirt");
		GameRegistry.registerBlock(AzuriteLogs, "AzuriteLogs");
		GameRegistry.registerBlock(AzuriteLeaves, "AzuriteLeaves");
		GameRegistry.registerBlock(AzuriteOre, "AzuriteOre");
		GameRegistry.registerBlock(AzuritePortal, "AzuritePortal");

		GameRegistry.registerBlock(UviteGrass, "UviteGrass");
		GameRegistry.registerBlock(UviteDirt, "UviteDirt");
		GameRegistry.registerBlock(UviteLogs, "UviteLogs");
		GameRegistry.registerBlock(UviteLeaves, "UviteLeaves");
		GameRegistry.registerBlock(UviteOre, "UviteOre");
		GameRegistry.registerBlock(UvitePortal, "UvitePortal");
		
		GameRegistry.registerBlock(MythrilGrass, "MythrilGrass");
		GameRegistry.registerBlock(MythrilDirt, "MythrilDirt");
		GameRegistry.registerBlock(MythrilLogs, "MythrilLogs");
		GameRegistry.registerBlock(MythrilLeaves, "MythrilLeaves");
		GameRegistry.registerBlock(MythrilOre, "MythrilOre");
		GameRegistry.registerBlock(MythrilPortal, "MythrilPortal");
		
		GameRegistry.registerBlock(AugiteGrass, "AugiteGrass");
		GameRegistry.registerBlock(AugiteDirt, "AugiteDirt");
		GameRegistry.registerBlock(AugiteLogs, "AugiteLogs");
		GameRegistry.registerBlock(AugiteLeaves, "AugiteLeaves");
		GameRegistry.registerBlock(AugiteOre, "AugiteOre");
		GameRegistry.registerBlock(AugiteBlock, "AugiteBlock");
		GameRegistry.registerBlock(AugitePortal, "AugitePortal");
		
		initNames();
	}
	
	public static void initNames()
	{
		//LanguageRegistry.addName(ColoredVane, "Colored Vane");
		LanguageRegistry.addName(TwilightStone, "Twilight Stone");
		//LanguageRegistry.addName(blueFire, "blue Fire");
		LanguageRegistry.addName(divineRock, "divineRock");
		//-==-DRAVITE-==-//
		LanguageRegistry.addName(DraviteGrass, "Dravite Grass");
		LanguageRegistry.addName(DraviteDirt, "Dravite Dirt");
		LanguageRegistry.addName(DraviteLogs, "Dravite Logs");
		LanguageRegistry.addName(DraviteLeaves, "Dravite Leaves");
		LanguageRegistry.addName(DraviteOre, "Dravite Ore");
		LanguageRegistry.addName(DravitePortal, "Dravite Portal");
		LanguageRegistry.addName(DraviteBlock, "Dravite Block");
		//-==-AZURITE-==-//
		LanguageRegistry.addName(AzuriteGrass, "Azurite Grass");
		LanguageRegistry.addName(AzuriteDirt, "Azurite Dirt");
		LanguageRegistry.addName(AzuriteLogs, "Azurite Logs");
		LanguageRegistry.addName(AzuriteLeaves, "Azurite Leaves");
		LanguageRegistry.addName(AzuriteOre, "Azurite Ore");
		//LanguageRegistry.addName(AzuriteVines, "Azurite Vines");
		//LanguageRegistry.addName(AzuriteBlock, "Azurite Block");
		LanguageRegistry.addName(AzuritePortal, "Azurite Portal");
		//-==-Uvite-==-//
		LanguageRegistry.addName(UviteGrass, "Uvite Grass");
		LanguageRegistry.addName(UviteDirt, "Uvite Dirt");
		LanguageRegistry.addName(UviteLogs, "Uvite Logs");
		LanguageRegistry.addName(UviteLeaves, "Uvite Leaves");
		LanguageRegistry.addName(UviteOre, "Uvite Ore");
		//LanguageRegistry.addName(UviteBlock, "Uvite Block");
		LanguageRegistry.addName(UvitePortal, "Uvite Portal");
		//-==-Mythril-==-//
		LanguageRegistry.addName(MythrilGrass, "Mythril Grass");
		LanguageRegistry.addName(MythrilDirt, "Mythril Dirt");
		LanguageRegistry.addName(MythrilLogs, "Mythril Logs");
		LanguageRegistry.addName(MythrilLeaves, "Mythril Leaves");
		LanguageRegistry.addName(MythrilOre, "Mythril Ore");
		LanguageRegistry.addName(MythrilPortal, "Mytril Portal");
		//LanguageRegistry.addName(MythrilBlock, "Mythril Block");
		
		LanguageRegistry.addName(AugiteGrass, "Augite Grass");
		LanguageRegistry.addName(AugiteDirt, "Augite Dirt");
		LanguageRegistry.addName(AugiteLogs, "Augite Logs");
		LanguageRegistry.addName(AugiteLeaves, "Augite Leaves");
		LanguageRegistry.addName(AugiteOre, "Augite Ore");
		//LanguageRegistry.addName(AugiteBlock, "Augite Block");
		LanguageRegistry.addName(AugitePortal, "Augite Portal");
		
		//LanguageRegistry.addName(superEnchantMentTable, "superEnchantMentTable");
		//LanguageRegistry.addName(pinkGlowBoneTreeBase, "pinkGlowBoneTreeBase");
		//LanguageRegistry.addName(purpleGlowBoneTreeBase, "purpleGlowBoneTreeBase");
		
		//LanguageRegistry.addName(DensosStatue, "DensosStatue");
		//LanguageRegistry.addName(ReyvorStatue, "ReyvorStatue");
		//LanguageRegistry.addName(SFStatue, "SFStatue");
		//LanguageRegistry.addName(TDStatue, "TDStatue");
		//LanguageRegistry.addName(VamacheronStatue, "VamacheronStatue");
	}
}
