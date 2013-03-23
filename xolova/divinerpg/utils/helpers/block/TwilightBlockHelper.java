package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import xolova.divinerpg.blocks.twilight.BlockAugiteGrass;
import xolova.divinerpg.blocks.twilight.BlockAzuriteGrass;
import xolova.divinerpg.blocks.twilight.BlockDraviteDirt;
import xolova.divinerpg.blocks.twilight.BlockDraviteGrass;
import xolova.divinerpg.blocks.twilight.BlockMythilDirt;
import xolova.divinerpg.blocks.twilight.BlockMythilGrass;
import xolova.divinerpg.blocks.twilight.BlockTwilightLeaves;
import xolova.divinerpg.blocks.twilight.BlockTwilightOre;
import xolova.divinerpg.blocks.twilight.BlockTwilightStone;
import xolova.divinerpg.blocks.twilight.BlockTwilightWood;
import xolova.divinerpg.blocks.twilight.BlockUviteDirt;
import xolova.divinerpg.blocks.twilight.BlockUviteGrass;
import xolova.divinerpg.utils.helpers.config.TwilightConfigHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class TwilightBlockHelper 
{
	public static Block TwilightStone;
	//-==-DRAVITE-==-//
	public static Block DraviteGrass;
	public static Block DraviteDirt;
	public static Block DraviteLogs;
	public static Block DraviteLeaves;
	public static Block DraviteOre;
	//-==-AZURITE-==-//
	public static Block AzuriteGrass;
	public static Block AzuriteDirt;
	public static Block AzuriteLogs;
	public static Block AzuriteLeaves;
	public static Block AzuriteOre;
	//-==-Uvite-==-//
	public static Block UviteGrass;
	public static Block UviteDirt;
	public static Block UviteLogs;
	public static Block UviteLeaves;
	public static Block UviteOre;
	//-==-Mythril-==-//
	public static Block MythrilGrass;
	public static Block MythrilDirt;
	public static Block MythrilLogs;
	public static Block MythrilLeaves;
	public static Block MythrilOre;
	//-==-Augite-==-//
	public static Block AugiteGrass;
	public static Block AugiteDirt;
	public static Block AugiteLogs;
	public static Block AugiteLeaves;
	public static Block AugiteOre;
	
	public static void initBlocks()
	{
		TwilightStone = new BlockTwilightStone(TwilightConfigHelper.TwilightStoneID).setUnlocalizedName("TwilightStone").setCreativeTab(CreativeTabs.tabBlock);

		DraviteGrass = new BlockDraviteGrass(TwilightConfigHelper.DraviteGrassID).setUnlocalizedName("DraviteGrass");
		DraviteDirt = new BlockDraviteDirt(TwilightConfigHelper.DraviteDirtID).setUnlocalizedName("DraviteDirt").setCreativeTab(CreativeTabs.tabBlock);
		DraviteLogs = new BlockTwilightWood(TwilightConfigHelper.DraviteLogsID).setUnlocalizedName("DraviteLogs").setCreativeTab(CreativeTabs.tabBlock);
		DraviteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.DraviteLeavesID).setUnlocalizedName("DraviteLeaves");
		DraviteOre = new BlockTwilightOre(TwilightConfigHelper.DraviteOreID).setUnlocalizedName("DraviteOre").setCreativeTab(CreativeTabs.tabBlock);
		
		AzuriteGrass = new BlockAzuriteGrass(TwilightConfigHelper.AzuriteGrassID).setUnlocalizedName("AzuriteGrass");
		//AzuriteDirt = new BlockAzuriteDirt(TwilightConfigHelper.AzuriteDirtID).setUnlocalizedName("AzuriteDirt");
		AzuriteLogs = new BlockTwilightWood(TwilightConfigHelper.AzuriteLogsID).setUnlocalizedName("AzuriteLogs").setCreativeTab(CreativeTabs.tabBlock);
		AzuriteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.AzuriteLeavesID).setUnlocalizedName("AzuriteLeaves");
		AzuriteOre = new BlockTwilightOre(TwilightConfigHelper.AzuriteOreID).setUnlocalizedName("AzuriteOre").setCreativeTab(CreativeTabs.tabBlock);
		
		UviteGrass = new BlockUviteGrass(TwilightConfigHelper.UviteGrassID).setUnlocalizedName("UviteGrass");
		UviteDirt = new BlockUviteDirt(TwilightConfigHelper.UviteDirtID).setUnlocalizedName("UviteDirt").setCreativeTab(CreativeTabs.tabBlock);
		UviteLogs = new BlockTwilightWood(TwilightConfigHelper.UviteLogsID).setUnlocalizedName("UviteLogs").setCreativeTab(CreativeTabs.tabBlock);
		UviteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.UviteLeavesID).setUnlocalizedName("UviteLeaves");
		UviteOre = new BlockTwilightOre(TwilightConfigHelper.UviteOreID).setUnlocalizedName("UviteOre").setCreativeTab(CreativeTabs.tabBlock);
		
		MythrilGrass = new BlockMythilGrass(TwilightConfigHelper.MythrilGrassID).setUnlocalizedName("MythrilGrass");
		MythrilDirt = new BlockMythilDirt(TwilightConfigHelper.MythrilDirtID).setUnlocalizedName("MythrilDirt").setCreativeTab(CreativeTabs.tabBlock);
		MythrilLogs = new BlockTwilightWood(TwilightConfigHelper.MythrilLogsID).setUnlocalizedName("MythrilLogs").setCreativeTab(CreativeTabs.tabBlock);
		MythrilLeaves = new BlockTwilightLeaves(TwilightConfigHelper.MythrilLeavesID).setUnlocalizedName("MythrilLeaves");
		MythrilOre = new BlockTwilightOre(TwilightConfigHelper.MythrilOreID).setUnlocalizedName("MythrilOre").setCreativeTab(CreativeTabs.tabBlock);
		
		AugiteGrass = new BlockAugiteGrass(TwilightConfigHelper.AugiteGrassID).setUnlocalizedName("AugiteGrass");
		//AugiteDirt = new BlockAugiteDirt(TwilightConfigHelper.AugiteDirtID).setUnlocalizedName("AugiteDirt").setCreativeTab(CreativeTabs.tabBlock);
		AugiteLogs = new BlockTwilightWood(TwilightConfigHelper.AugiteLogsID).setUnlocalizedName("AugiteLogs").setCreativeTab(CreativeTabs.tabBlock);
		AugiteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.AugiteLeavesID).setUnlocalizedName("AugiteLeaves");
		AugiteOre = new BlockTwilightOre(TwilightConfigHelper.AugiteOreID).setUnlocalizedName("AugiteOre").setCreativeTab(CreativeTabs.tabBlock);
		
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
		
		GameRegistry.registerBlock(AzuriteGrass, "AzuriteGrass");
		//GameRegistry.registerBlock(AzuriteDirt, "AzuriteDirt");
		GameRegistry.registerBlock(AzuriteLogs, "AzuriteLogs");
		GameRegistry.registerBlock(AzuriteLeaves, "AzuriteLeaves");
		GameRegistry.registerBlock(AzuriteOre, "AzuriteOre");
		
		GameRegistry.registerBlock(UviteGrass, "UviteGrass");
		GameRegistry.registerBlock(UviteDirt, "UviteDirt");
		GameRegistry.registerBlock(UviteLogs, "UviteLogs");
		GameRegistry.registerBlock(UviteLeaves, "UviteLeaves");
		GameRegistry.registerBlock(UviteOre, "UviteOre");
		
		GameRegistry.registerBlock(MythrilGrass, "MythrilGrass");
		GameRegistry.registerBlock(MythrilDirt, "MythrilDirt");
		GameRegistry.registerBlock(MythrilLogs, "MythrilLogs");
		GameRegistry.registerBlock(MythrilLeaves, "MythrilLeaves");
		GameRegistry.registerBlock(MythrilOre, "MythrilOre");
		
		GameRegistry.registerBlock(AugiteGrass, "AugiteGrass");
		//GameRegistry.registerBlock(AugiteDirt, "AugiteDirt");
		GameRegistry.registerBlock(AugiteLogs, "AugiteLogs");
		GameRegistry.registerBlock(AugiteLeaves, "AugiteLeaves");
		GameRegistry.registerBlock(AugiteOre, "AugiteOre");
	}
}
