package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.blocks.twilight.BlockAugiteDirt;
import xolova.divinerpg.blocks.twilight.BlockAugiteGrass;
import xolova.divinerpg.blocks.twilight.BlockAugitePortal;
import xolova.divinerpg.blocks.twilight.BlockAzuriteDirt;
import xolova.divinerpg.blocks.twilight.BlockAzuriteGrass;
import xolova.divinerpg.blocks.twilight.BlockAzuritePortal;
import xolova.divinerpg.blocks.twilight.BlockDraviteDirt;
import xolova.divinerpg.blocks.twilight.BlockDraviteGrass;
import xolova.divinerpg.blocks.twilight.BlockMythilDirt;
import xolova.divinerpg.blocks.twilight.BlockMythilGrass;
import xolova.divinerpg.blocks.twilight.BlockMythrilPortal;
import xolova.divinerpg.blocks.twilight.BlockTwilightLeaves;
import xolova.divinerpg.blocks.twilight.BlockTwilightOre;
import xolova.divinerpg.blocks.twilight.BlockTwilightPortal;
import xolova.divinerpg.blocks.twilight.BlockTwilightStone;
import xolova.divinerpg.blocks.twilight.BlockTwilightWood;
import xolova.divinerpg.blocks.twilight.BlockUviteDirt;
import xolova.divinerpg.blocks.twilight.BlockUviteGrass;
import xolova.divinerpg.blocks.twilight.BlockUvitePortal;
import xolova.divinerpg.utils.helpers.config.TwilightConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
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
	public static BlockTwilightPortal DravitePortal;
	public static Block DraviteBlock;
	//-==-AZURITE-==-//
	public static Block AzuriteGrass;
	public static Block AzuriteDirt;
	public static Block AzuriteLogs;
	public static Block AzuriteLeaves;
	public static Block AzuriteOre;
	public static Block AzuriteVines;
	public static Block AzuriteBlock;
	public static BlockAzuritePortal AzuritePortal;
	//-==-Uvite-==-//
	public static Block UviteGrass;
	public static Block UviteDirt;
	public static Block UviteLogs;
	public static Block UviteLeaves;
	public static Block UviteOre;
	public static Block UviteBlock;
	public static BlockUvitePortal UvitePortal;
	//-==-Mythril-==-//
	public static Block MythrilGrass;
	public static Block MythrilDirt;
	public static Block MythrilLogs;
	public static Block MythrilLeaves;
	public static Block MythrilOre;
	public static BlockMythrilPortal MytrilPortal;
	public static Block MythrilBlock;
	//-==-Augite-==-//
	public static Block AugiteGrass;
	public static Block AugiteDirt;
	public static Block AugiteLogs;
	public static Block AugiteLeaves;
	public static Block AugiteOre;
	public static Block AugiteBlock;
	public static BlockAugitePortal AugitePortal;
	
	public static Block superEnchantMentTable;
	public static Block pinkGlowBoneTreeBase;
	public static Block purpleGlowBoneTreeBase;
	
	public static Block DensosStatue;
	public static Block ReyvorStatue;
	public static Block SFStatue;
	public static Block TDStatue;
	public static Block VamacheronStatue;
	
	public static void initBlocks()
	{
		TwilightStone = new BlockTwilightStone(TwilightConfigHelper.TwilightStoneID).setIconIndex(2, 128).setUnlocalizedName("TwilightStone").setCreativeTab(CreativeTabHelper.tabBlocks);
		divineRock = new BlockDivineRPG(TwilightConfigHelper.divineRockID, 0, Material.rock).setIconIndex(2, 68).setUnlocalizedName("DivineRock").setCreativeTab(CreativeTabHelper.tabBlocks);
		
		DraviteGrass = new BlockDraviteGrass(TwilightConfigHelper.DraviteGrassID).setUnlocalizedName("DraviteGrass");
		DraviteDirt = new BlockDraviteDirt(TwilightConfigHelper.DraviteDirtID).setIconIndex(2, 138).setUnlocalizedName("DraviteDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		DraviteLogs = new BlockTwilightWood(TwilightConfigHelper.DraviteLogsID).setUnlocalizedName("DraviteLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		DraviteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.DraviteLeavesID).setUnlocalizedName("DraviteLeaves");
		DraviteOre = new BlockTwilightOre(TwilightConfigHelper.DraviteOreID).setIconIndex(2, 133).setUnlocalizedName("DraviteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		DravitePortal = (BlockTwilightPortal) new BlockTwilightPortal(TwilightConfigHelper.DravitePortalID, null).setUnlocalizedName("DravitePortal").setCreativeTab(CreativeTabHelper.tabBlocks);
		DraviteBlock = new BlockDivineRPG(TwilightConfigHelper.DraviteBlockID, 0, Material.iron).setUnlocalizedName("DraviteBlock").setCreativeTab(CreativeTabHelper.tabBlocks);
		
		AzuriteGrass = new BlockAzuriteGrass(TwilightConfigHelper.AzuriteGrassID).setUnlocalizedName("AzuriteGrass");
		AzuriteDirt = new BlockAzuriteDirt(TwilightConfigHelper.AzuriteDirtID).setIconIndex(2, 136).setUnlocalizedName("AzuriteDirt");
		AzuriteLogs = new BlockTwilightWood(TwilightConfigHelper.AzuriteLogsID).setUnlocalizedName("AzuriteLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		AzuriteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.AzuriteLeavesID).setUnlocalizedName("AzuriteLeaves");
		AzuriteOre = new BlockTwilightOre(TwilightConfigHelper.AzuriteOreID).setIconIndex(2, 129).setUnlocalizedName("AzuriteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		AzuritePortal = (BlockAzuritePortal) new BlockAzuritePortal(TwilightConfigHelper.AzuritePortalID).setUnlocalizedName("AzuritePortal");
		
		UviteGrass = new BlockUviteGrass(TwilightConfigHelper.UviteGrassID).setUnlocalizedName("UviteGrass");
		UviteDirt = new BlockUviteDirt(TwilightConfigHelper.UviteDirtID).setIconIndex(2, 134).setUnlocalizedName("UviteDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		UviteLogs = new BlockTwilightWood(TwilightConfigHelper.UviteLogsID).setUnlocalizedName("UviteLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		UviteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.UviteLeavesID).setUnlocalizedName("UviteLeaves");
		UviteOre = new BlockTwilightOre(TwilightConfigHelper.UviteOreID).setIconIndex(2, 130).setUnlocalizedName("UviteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		UvitePortal = (BlockUvitePortal) new BlockUvitePortal(TwilightConfigHelper.UvitePortalID, "").setUnlocalizedName("UvitePortal").setCreativeTab(CreativeTabHelper.tabBlocks);
		
		MythrilGrass = new BlockMythilGrass(TwilightConfigHelper.MythrilGrassID).setUnlocalizedName("MythrilGrass");
		MythrilDirt = new BlockMythilDirt(TwilightConfigHelper.MythrilDirtID).setIconIndex(2, 140).setUnlocalizedName("MythrilDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		MythrilLogs = new BlockTwilightWood(TwilightConfigHelper.MythrilLogsID).setUnlocalizedName("MythrilLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		MythrilLeaves = new BlockTwilightLeaves(TwilightConfigHelper.MythrilLeavesID).setUnlocalizedName("MythrilLeaves");
		MythrilOre = new BlockTwilightOre(TwilightConfigHelper.MythrilOreID).setIconIndex(2, 131).setUnlocalizedName("MythrilOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		MytrilPortal = (BlockMythrilPortal) new BlockMythrilPortal(TwilightConfigHelper.MythrilPortalID, "").setUnlocalizedName("MythrilPortal").setCreativeTab(CreativeTabHelper.tabBlocks);
		
		AugiteGrass = new BlockAugiteGrass(TwilightConfigHelper.AugiteGrassID).setUnlocalizedName("AugiteGrass");
		AugiteDirt = new BlockAugiteDirt(TwilightConfigHelper.AugiteDirtID).setUnlocalizedName("AugiteDirt").setCreativeTab(CreativeTabHelper.tabBlocks);
		AugiteLogs = new BlockTwilightWood(TwilightConfigHelper.AugiteLogsID).setUnlocalizedName("AugiteLogs").setCreativeTab(CreativeTabHelper.tabBlocks);
		AugiteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.AugiteLeavesID).setUnlocalizedName("AugiteLeaves");
		AugiteOre = new BlockTwilightOre(TwilightConfigHelper.AugiteOreID).setIconIndex(2, 132).setUnlocalizedName("AugiteOre").setCreativeTab(CreativeTabHelper.tabBlocks);
		AugiteBlock = new BlockDivineRPG(TwilightConfigHelper.AugiteBlockID, Material.rock).setUnlocalizedName("AugiteBlock");
		AugitePortal = (BlockAugitePortal) new BlockAugitePortal(TwilightConfigHelper.AugitePortalID).setUnlocalizedName("AugitePortal").setCreativeTab(CreativeTabHelper.tabBlocks);
		
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
		GameRegistry.registerBlock(MytrilPortal, "MythrilPortal");
		
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
		LanguageRegistry.addName(MytrilPortal, "Mytril Portal");
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
