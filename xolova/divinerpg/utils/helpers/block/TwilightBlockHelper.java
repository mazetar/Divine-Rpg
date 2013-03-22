package xolova.divinerpg.utils.helpers.block;

import cpw.mods.fml.common.registry.GameRegistry;
import xolova.divinerpg.blocks.twilight.*;
import xolova.divinerpg.utils.helpers.config.TwilightConfigHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class TwilightBlockHelper 
{
	public static Block TwilightStone;
	//-==-DRAVITE-==-//
	public static Block DraviteGrass;
	public static Block DraviteDirt;
	public static Block DraviteLogs;
	public static Block DraviteLeaves;
	public static Block DraviteOre;
	//-==-Azurite-==-//
	public static Block AzuriteGrass;
	public static Block AzuriteDirt;
	public static Block AzuriteLogs;
	public static Block AzuriteLeaves;
	public static Block AzuriteOre;
	
	public static void initBlocks()
	{
		TwilightStone = new BlockTwilightStone(TwilightConfigHelper.TwilightStoneID).setUnlocalizedName("TwilightStone").setCreativeTab(CreativeTabs.tabBlock);

		//DraviteGrass = new BlockDraviteGrass(TwilightConfigHelper.DraviteGrassID).setUnlocalizedName("DraviteGrass");
		DraviteDirt = new BlockDraviteDirt(TwilightConfigHelper.DraviteDirtID).setUnlocalizedName("DraviteDirt").setCreativeTab(CreativeTabs.tabBlock);
		DraviteLogs = new BlockTwilightWood(TwilightConfigHelper.DraviteLogsID).setUnlocalizedName("DraviteLogs").setCreativeTab(CreativeTabs.tabBlock);
		//DraviteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.DraviteLeavesID).setUnlocalizedName("DraviteLeaves");
		DraviteOre = new BlockTwilightOre(TwilightConfigHelper.DraviteOreID).setUnlocalizedName("DraviteOre").setCreativeTab(CreativeTabs.tabBlock);
		
		//AzuriteGrass = new BlockAzuriteGrass(TwilightConfigHelper.AzuriteGrassID).setUnlocalizedName("AzuriteGrass");
		//AzuriteDirt = new BlockAzuriteDirt(TwilightConfigHelper.AzuriteDirtID).setUnlocalizedName("AzuriteDirt");
		AzuriteLogs = new BlockTwilightWood(TwilightConfigHelper.AzuriteLogsID).setUnlocalizedName("AzuriteLogs").setCreativeTab(CreativeTabs.tabBlock);
		//AzuriteLeaves = new BlockTwilightLeaves(TwilightConfigHelper.AzuriteLeavesID).setUnlocalizedName("AzuriteLeaves");
		AzuriteOre = new BlockTwilightOre(TwilightConfigHelper.AzuriteOreID).setUnlocalizedName("AzuriteOre").setCreativeTab(CreativeTabs.tabBlock);
		
		InitGameRegistryBlocks();
	}
	
	public static void InitGameRegistryBlocks()
	{
		GameRegistry.registerBlock(TwilightStone, "TwilightStone");
		
		//GameRegistry.registerBlock(DraviteGrass, "DraviteGrass");
		GameRegistry.registerBlock(DraviteDirt, "DraviteDirt");
		GameRegistry.registerBlock(DraviteLogs, "DraviteLogs");
		//GameRegistry.registerBlock(DraviteLeaves, "DraviteLeaves");
		GameRegistry.registerBlock(DraviteOre, "DraviteOre");
		
		//GameRegistry.registerBlock(AzuriteGrass, "AzuriteGrass");
		//GameRegistry.registerBlock(AzuriteDirt, "AzuriteDirt");
		GameRegistry.registerBlock(AzuriteLogs, "AzuriteLogs");
		//GameRegistry.registerBlock(AzuriteLeaves, "AzuriteLeaves");
		GameRegistry.registerBlock(AzuriteOre, "AzuriteOre");
	}
}
