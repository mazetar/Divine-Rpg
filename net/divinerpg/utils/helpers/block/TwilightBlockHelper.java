package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.core.BlockDivine;
import net.divinerpg.blocks.core.BlockDivineFlower;
import net.divinerpg.blocks.core.BlockDivineLeaves;
import net.divinerpg.blocks.core.BlockDivineLog;
import net.divinerpg.blocks.core.BlockDivinePortal;
import net.divinerpg.blocks.core.DivineStatue;
import net.divinerpg.blocks.core.DivineGrass;
import net.divinerpg.blocks.core.DivineOre;
import net.divinerpg.blocks.twilight.BlockTwilightStone;
import net.divinerpg.client.models.twilight.tileentities.ModelDensosStatue;
import net.divinerpg.client.models.twilight.tileentities.ModelReyvorStatue;
import net.divinerpg.client.models.twilight.tileentities.ModelSFStatue;
import net.divinerpg.client.models.twilight.tileentities.ModelTDStatue;
import net.divinerpg.client.models.twilight.tileentities.ModelVamacheronStatue;
import net.divinerpg.entities.particle.EntityAugitePortalFX;
import net.divinerpg.entities.particle.EntityAzuritePortalFX;
import net.divinerpg.entities.particle.EntityDravitePortalFX;
import net.divinerpg.entities.particle.EntityMythrilPortalFX;
import net.divinerpg.entities.particle.EntityRedPortalFX;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.utils.helpers.DimensionRegistry;
import net.divinerpg.utils.helpers.config.TwilightConfigHelper;
import net.divinerpg.utils.helpers.gui.DivineTabs;
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
	
	public static DivineStatue DensosStatue;
	public static DivineStatue ReyvorStatue;
	public static DivineStatue SFStatue;
	public static DivineStatue TDStatue;
	public static DivineStatue VamacheronStatue;
	
	public static Block TwilightFlower;
	public static Block DraviteLamp;
	public static Block draviteChest;
	public static Block uviteRail;
	
	public static void init()
	{
		TwilightStone = new BlockTwilightStone(TwilightConfigHelper.TwilightStoneID).setTextureName("TwilightStone").setUnlocalizedName("TwilightStone").setCreativeTab(DivineTabs.tabBlocks);
		divineRock = new BlockDivine(TwilightConfigHelper.divineRockID, Material.rock).setTextureName("DivineRock").setUnlocalizedName("DivineRock").setCreativeTab(CreativeTabs.tabTools);//.setCreativeTab(CreativeTabHelper.tabBlocks);
		TwilightFlower = ((BlockDivineFlower) new BlockDivineFlower(TwilightConfigHelper.TwilightFlowerID).func_111022_d("TwilightFlower").setTickRandomly(true)).setBlockBoundsWithBlock(0.5F - 0.2F, 0.0F, 0.5F - 0.2F, 0.5F + 0.2F, 0.2F * 3.0F, 0.5F + 0.2F);
		
		DraviteGrass = new DivineGrass(TwilightConfigHelper.DraviteGrassID, TwilightConfigHelper.DraviteDirtID).setTextureName("DraviteGrass").setUnlocalizedName("DraviteGrass");
		DraviteDirt = new BlockDivine(TwilightConfigHelper.DraviteDirtID, Material.ground).setTextureName("DraviteGrass_Bottom").setTickRandomly(true).setUnlocalizedName("DraviteDirt").setCreativeTab(DivineTabs.tabBlocks);
		DraviteLogs = new BlockDivineLog(TwilightConfigHelper.DraviteLogsID).setTextureName("DraviteLog").setUnlocalizedName("DraviteLogs").setCreativeTab(DivineTabs.tabBlocks);
		DraviteLeaves = new BlockDivineLeaves(TwilightConfigHelper.DraviteLeavesID).setTextureName("DraviteLeaves").setUnlocalizedName("DraviteLeaves");
		DraviteOre = new DivineOre(TwilightConfigHelper.DraviteOreID, TwilightConfigHelper.DraviteFragmentsID).setTextureName("DraviteOre").setUnlocalizedName("DraviteOre").setCreativeTab(DivineTabs.tabBlocks);
		DraviteBlock = new BlockDivine(TwilightConfigHelper.DraviteBlockID, 0, Material.iron).setTextureName("DraviteBlock").setUnlocalizedName("DraviteBlock").setCreativeTab(DivineTabs.tabBlocks);
        DravitePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.DravitePortalID).setTextureName("DravitePortal").setUnlocalizedName("DravitePortal").setCreativeTab(DivineTabs.tabBlocks))
                .setPortalVariables(divineRock, blueFire, DimensionRegistry.DraviteID, "", new EntityDravitePortalFX(null, 1, 2, 3, 4, 5, 6));
		
		AzuriteGrass = new DivineGrass(TwilightConfigHelper.AzuriteGrassID, TwilightConfigHelper.AzuriteDirtID).setTextureName("AzuriteGrass").setUnlocalizedName("AzuriteGrass");
		AzuriteDirt = new BlockDivine(TwilightConfigHelper.AzuriteDirtID, Material.ground).setTextureName("AzuriteGrass_Bottom").setTickRandomly(true).setUnlocalizedName("AzuriteDirt");
		AzuriteLogs = new BlockDivineLog(TwilightConfigHelper.AzuriteLogsID).setTextureName("AzuriteLog").setUnlocalizedName("AzuriteLogs").setCreativeTab(DivineTabs.tabBlocks);
		AzuriteLeaves = new BlockDivineLeaves(TwilightConfigHelper.AzuriteLeavesID).setTextureName("AzuriteLeaves").setUnlocalizedName("AzuriteLeaves");
		AzuriteOre = new DivineOre(TwilightConfigHelper.AzuriteOreID, TwilightConfigHelper.AzuriteFragmentsID).setTextureName("AzuriteOre").setUnlocalizedName("AzuriteOre").setCreativeTab(DivineTabs.tabBlocks);
		AzuriteBlock = new BlockDivine(TwilightConfigHelper.AzuriteBlockID, 0, Material.iron).setTextureName("AzuriteBlock").setUnlocalizedName("AzuriteBlock").setCreativeTab(DivineTabs.tabBlocks);
        AzuritePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.AzuritePortalID).func_111022_d("AzuritePortal").setUnlocalizedName("AzuritePortal").setCreativeTab(DivineTabs.tabBlocks))
		        .setPortalVariables(DraviteBlock, blueFire, DimensionRegistry.AzuriteID, "", new EntityAzuritePortalFX(null, 1, 2, 3, 4, 5, 6));
		
		UviteGrass = new DivineGrass(TwilightConfigHelper.UviteGrassID, TwilightConfigHelper.UviteDirtID).setTextureName("UviteGrass").setUnlocalizedName("UviteGrass");
		UviteDirt = new BlockDivine(TwilightConfigHelper.UviteDirtID, Material.ground).setTextureName("UviteGrass_Bottom").setTickRandomly(true).setUnlocalizedName("UviteDirt").setCreativeTab(DivineTabs.tabBlocks);
		UviteLogs = new BlockDivineLog(TwilightConfigHelper.UviteLogsID).setTextureName("UviteLog").setUnlocalizedName("UviteLogs").setCreativeTab(DivineTabs.tabBlocks);
		UviteLeaves = new BlockDivineLeaves(TwilightConfigHelper.UviteLeavesID).setTextureName("UviteLeaves").setUnlocalizedName("UviteLeaves");
		UviteOre = new DivineOre(TwilightConfigHelper.UviteOreID, TwilightConfigHelper.UviteFragmentsID).setTextureName("UviteOre").setUnlocalizedName("UviteOre").setCreativeTab(DivineTabs.tabBlocks);
		UviteBlock = new BlockDivine(TwilightConfigHelper.UviteBlockID, 0, Material.iron).setTextureName("UviteBlock").setUnlocalizedName("UviteBlock").setCreativeTab(DivineTabs.tabBlocks);
        UvitePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.UvitePortalID).func_111022_d("UvitePortal").setUnlocalizedName("UvitePortal").setCreativeTab(DivineTabs.tabBlocks))
		        .setPortalVariables(AzuriteBlock, blueFire, DimensionRegistry.UviteID, "", new EntityRedPortalFX(null, 1, 2, 3, 4, 5, 6));
		
		MythrilGrass = new DivineGrass(TwilightConfigHelper.MythrilGrassID, TwilightConfigHelper.MythrilDirtID).func_111022_d("MythrilGrass").setUnlocalizedName("MythrilGrass");
		MythrilDirt = new BlockDivine(TwilightConfigHelper.MythrilDirtID, Material.ground).func_111022_d("MythrilGrass_Bottom").setTickRandomly(true).setUnlocalizedName("MythrilDirt").setCreativeTab(DivineTabs.tabBlocks);
		MythrilLogs = new BlockDivineLog(TwilightConfigHelper.MythrilLogsID).func_111022_d("MythrilLog").setUnlocalizedName("MythrilLog").setCreativeTab(DivineTabs.tabBlocks);
		MythrilLeaves = new BlockDivineLeaves(TwilightConfigHelper.MythrilLeavesID).func_111022_d("MythrilLeaves").setUnlocalizedName("MythrilLeaves");
		MythrilOre = new DivineOre(TwilightConfigHelper.MythrilOreID, TwilightConfigHelper.MythrilFragmentsID).func_111022_d("MythrilOre").setUnlocalizedName("MythrilOre").setCreativeTab(DivineTabs.tabBlocks);
		MythrilBlock = new BlockDivine(TwilightConfigHelper.MythrilBlockID, 0, Material.iron).setTextureName("MythrilBlock").setUnlocalizedName("MythrilBlock").setCreativeTab(DivineTabs.tabBlocks);
        MythrilPortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.MythrilPortalID).func_111022_d("MythrilPortal").setUnlocalizedName("MythrilPortal").setCreativeTab(DivineTabs.tabBlocks))
		        .setPortalVariables(UviteBlock, blueFire, DimensionRegistry.MythrilID, "", new EntityMythrilPortalFX(null, 1, 2, 3, 4, 5, 6));
		
		AugiteGrass = new DivineGrass(TwilightConfigHelper.AugiteGrassID, TwilightConfigHelper.AugiteDirtID).func_111022_d("AugiteGrass").setUnlocalizedName("AugiteGrass");
		AugiteDirt = new BlockDivine(TwilightConfigHelper.AugiteDirtID, Material.ground).setTickRandomly(true).func_111022_d("AugiteGrass_Bottom").setUnlocalizedName("AugiteDirt").setCreativeTab(DivineTabs.tabBlocks);
		AugiteLogs = new BlockDivineLog(TwilightConfigHelper.AugiteLogsID).func_111022_d("AugiteLog").setUnlocalizedName("AugiteLog").setCreativeTab(DivineTabs.tabBlocks);
		AugiteLeaves = new BlockDivineLeaves(TwilightConfigHelper.AugiteLeavesID).func_111022_d("AugiteLeaves").setUnlocalizedName("AugiteLeaves");
		AugiteOre = new DivineOre(TwilightConfigHelper.AugiteOreID, TwilightConfigHelper.AugiteFragmentsID).func_111022_d("AugiteOre").setUnlocalizedName("AugiteOre").setCreativeTab(DivineTabs.tabBlocks);
		AugiteBlock = new BlockDivine(TwilightConfigHelper.AugiteBlockID, Material.rock).func_111022_d("AugiteBlock").setUnlocalizedName("AugiteBlock").setCreativeTab(DivineTabs.tabBlocks);
		AugitePortal = ((BlockDivinePortal) new BlockDivinePortal(TwilightConfigHelper.AugitePortalID).func_111022_d("AugitePortal").setUnlocalizedName("AugitePortal").setCreativeTab(DivineTabs.tabBlocks))
		        .setPortalVariables(MythrilBlock, blueFire, DimensionRegistry.AugiteID, "xolovon.AugitePortal",
		                new EntityAugitePortalFX(null, 1, 2, 3, 4, 5, 6));
		
		// Statues
		DensosStatue = new DivineStatue(TwilightConfigHelper.densosStatueID, EntityResourceLocs.DENSOS, new ModelDensosStatue());
		ReyvorStatue = new DivineStatue(TwilightConfigHelper.reyvorStatueID, EntityResourceLocs.REYVOR, new ModelReyvorStatue()); 
		SFStatue = new DivineStatue(TwilightConfigHelper.sfStatueID, EntityResourceLocs.SOUL_FIEND, new ModelSFStatue());//TODO: Is this correct texture? just guessing here --Maz
		TDStatue = new DivineStatue(TwilightConfigHelper.tdStatueID, EntityResourceLocs.TWILIGHT_DEMON, new ModelTDStatue()); //TODO: Is this correct texture? just guessing here --Maz
		VamacheronStatue = new DivineStatue(TwilightConfigHelper.vamacheronStatueID, EntityResourceLocs.VAMACHERON, new ModelVamacheronStatue());
		
		
		InitGameRegistryBlocks();
	}
	
	public static void InitGameRegistryBlocks()
	{
		GameRegistry.registerBlock(TwilightStone, "TwilightStone");
		GameRegistry.registerBlock(divineRock, "DivineRock");
		GameRegistry.registerBlock(TwilightFlower, "TwilightFlower");
		
		GameRegistry.registerBlock(DraviteGrass, "DraviteGrass");
		GameRegistry.registerBlock(DraviteDirt, "DraviteDirt");
		GameRegistry.registerBlock(DraviteLogs, "DraviteLogs");
		GameRegistry.registerBlock(DraviteLeaves, "DraviteLeaves");
		GameRegistry.registerBlock(DraviteOre, "DraviteOre");
        GameRegistry.registerBlock(DraviteBlock, "DraviteBlock");
		GameRegistry.registerBlock(DravitePortal, "DravitePortal");
		
		GameRegistry.registerBlock(AzuriteGrass, "AzuriteGrass");
		GameRegistry.registerBlock(AzuriteDirt, "AzuriteDirt");
		GameRegistry.registerBlock(AzuriteLogs, "AzuriteLogs");
		GameRegistry.registerBlock(AzuriteLeaves, "AzuriteLeaves");
		GameRegistry.registerBlock(AzuriteOre, "AzuriteOre");
        GameRegistry.registerBlock(AzuriteBlock, "AzuriteBlock");
		GameRegistry.registerBlock(AzuritePortal, "AzuritePortal");

		GameRegistry.registerBlock(UviteGrass, "UviteGrass");
		GameRegistry.registerBlock(UviteDirt, "UviteDirt");
		GameRegistry.registerBlock(UviteLogs, "UviteLogs");
		GameRegistry.registerBlock(UviteLeaves, "UviteLeaves");
		GameRegistry.registerBlock(UviteOre, "UviteOre");
        GameRegistry.registerBlock(UviteBlock, "UviteBlock");
		GameRegistry.registerBlock(UvitePortal, "UvitePortal");
		
		GameRegistry.registerBlock(MythrilGrass, "MythrilGrass");
		GameRegistry.registerBlock(MythrilDirt, "MythrilDirt");
		GameRegistry.registerBlock(MythrilLogs, "MythrilLogs");
		GameRegistry.registerBlock(MythrilLeaves, "MythrilLeaves");
		GameRegistry.registerBlock(MythrilOre, "MythrilOre");
        GameRegistry.registerBlock(MythrilBlock, "MythrilBlock");
		GameRegistry.registerBlock(MythrilPortal, "MythrilPortal");
		
		GameRegistry.registerBlock(AugiteGrass, "AugiteGrass");
		GameRegistry.registerBlock(AugiteDirt, "AugiteDirt");
		GameRegistry.registerBlock(AugiteLogs, "AugiteLogs");
		GameRegistry.registerBlock(AugiteLeaves, "AugiteLeaves");
		GameRegistry.registerBlock(AugiteOre, "AugiteOre");
		GameRegistry.registerBlock(AugiteBlock, "AugiteBlock");
		GameRegistry.registerBlock(AugitePortal, "AugitePortal");
		
		// Statues
		GameRegistry.registerBlock(DensosStatue, "Densos Statue");
		GameRegistry.registerBlock(ReyvorStatue, "Reyvor Statue");
		GameRegistry.registerBlock(SFStatue, "SFStatue");
        GameRegistry.registerBlock(TDStatue, "TDStatue");
        GameRegistry.registerBlock(VamacheronStatue, "VamacheronStatue");
		
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
		LanguageRegistry.addName(AzuriteBlock, "Azurite Block");
		LanguageRegistry.addName(AzuritePortal, "Azurite Portal");
		//-==-Uvite-==-//
		LanguageRegistry.addName(UviteGrass, "Uvite Grass");
		LanguageRegistry.addName(UviteDirt, "Uvite Dirt");
		LanguageRegistry.addName(UviteLogs, "Uvite Logs");
		LanguageRegistry.addName(UviteLeaves, "Uvite Leaves");
		LanguageRegistry.addName(UviteOre, "Uvite Ore");
		LanguageRegistry.addName(UviteBlock, "Uvite Block");
		LanguageRegistry.addName(UvitePortal, "Uvite Portal");
		//-==-Mythril-==-//
		LanguageRegistry.addName(MythrilGrass, "Mythril Grass");
		LanguageRegistry.addName(MythrilDirt, "Mythril Dirt");
		LanguageRegistry.addName(MythrilLogs, "Mythril Logs");
		LanguageRegistry.addName(MythrilLeaves, "Mythril Leaves");
		LanguageRegistry.addName(MythrilOre, "Mythril Ore");
		LanguageRegistry.addName(MythrilPortal, "Mytril Portal");
		LanguageRegistry.addName(MythrilBlock, "Mythril Block");
		
		LanguageRegistry.addName(AugiteGrass, "Augite Grass");
		LanguageRegistry.addName(AugiteDirt, "Augite Dirt");
		LanguageRegistry.addName(AugiteLogs, "Augite Logs");
		LanguageRegistry.addName(AugiteLeaves, "Augite Leaves");
		LanguageRegistry.addName(AugiteOre, "Augite Ore");
		LanguageRegistry.addName(AugiteBlock, "Augite Block");
		LanguageRegistry.addName(AugitePortal, "Augite Portal");
		
		//LanguageRegistry.addName(superEnchantMentTable, "superEnchantMentTable");
		//LanguageRegistry.addName(pinkGlowBoneTreeBase, "pinkGlowBoneTreeBase");
		//LanguageRegistry.addName(purpleGlowBoneTreeBase, "purpleGlowBoneTreeBase");
		
		LanguageRegistry.addName(DensosStatue, "Densos Statue");
		LanguageRegistry.addName(ReyvorStatue, "Reyvor Statue");
		LanguageRegistry.addName(SFStatue, "SF Statue");
        LanguageRegistry.addName(TDStatue, "TD Statue"); //TODO: Names not showing correctly in-game
        LanguageRegistry.addName(VamacheronStatue, "Small Statue");
        
		//LanguageRegistry.addName(SFStatue, "SFStatue");
		//LanguageRegistry.addName(TDStatue, "TDStatue");
		//LanguageRegistry.addName(VamacheronStatue, "VamacheronStatue");
	}
}
