package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.BlockDivineSpawner;
import net.divinerpg.blocks.arcana.BlockAquamarine;
import net.divinerpg.blocks.arcana.BlockArcaniteGrass;
import net.divinerpg.blocks.arcana.BlockArcaniteRails;
import net.divinerpg.blocks.arcana.BlockArcaniteTubes;
import net.divinerpg.blocks.arcana.BlockDemonFurnace;
import net.divinerpg.blocks.arcana.BlockDramixAltar;
import net.divinerpg.blocks.arcana.BlockDungeonBlock;
import net.divinerpg.blocks.arcana.BlockEucalyptusRoot;
import net.divinerpg.blocks.arcana.BlockExtractor;
import net.divinerpg.blocks.arcana.BlockFireStock;
import net.divinerpg.blocks.arcana.BlockGreenlightFurnace;
import net.divinerpg.blocks.arcana.BlockHeatTraps;
import net.divinerpg.blocks.arcana.BlockHitchak;
import net.divinerpg.blocks.arcana.BlockLamona;
import net.divinerpg.blocks.arcana.BlockMarsine;
import net.divinerpg.blocks.arcana.BlockMoltenFurnace;
import net.divinerpg.blocks.arcana.BlockMoonlightFurnace;
import net.divinerpg.blocks.arcana.BlockOceanfireFurnace;
import net.divinerpg.blocks.arcana.BlockOfLight;
import net.divinerpg.blocks.arcana.BlockOreDoor;
import net.divinerpg.blocks.arcana.BlockOreDoor2;
import net.divinerpg.blocks.arcana.BlockOreDoor3;
import net.divinerpg.blocks.arcana.BlockOreDoor4;
import net.divinerpg.blocks.arcana.BlockParasectaAltar;
import net.divinerpg.blocks.arcana.BlockPinfly;
import net.divinerpg.blocks.arcana.BlockPortalArcana;
import net.divinerpg.blocks.arcana.BlockPortalArcanaFrame;
import net.divinerpg.blocks.arcana.BlockStainedGlass;
import net.divinerpg.blocks.arcana.BlockStarBridge;
import net.divinerpg.blocks.arcana.BlockStarBridgeOn;
import net.divinerpg.blocks.arcana.BlockVeilo;
import net.divinerpg.blocks.arcana.BlockWhitefireFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDemonFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDramixAltar;
import net.divinerpg.blocks.arcana.tileentities.TileEntityExtractor;
import net.divinerpg.blocks.arcana.tileentities.TileEntityGreenlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoltenFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoonlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityOceanfireFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityParasectaAltar;
import net.divinerpg.blocks.arcana.tileentities.TileEntityWhitefireFurnace;
import net.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArcanaBlockHelper 
{
	public static Block ancientBricks;
	public static Block degradedBricks;
	public static Block ancientStone;
	public static Block soulStone;
	public static Block soulSludge;

	public static Block ancientTile;
	public static Block arcaniteMetal;
	public static Block dungeonLamp;
	public static Block arcaniumPower;
	public static Block extractor;

	public static Block arcaniumOre;
	public static Block oreDoor1;
	public static Block oreDoor2;
	public static Block oreDoor3;
	public static Block oreDoor4;

	public static Block heatTraps;
	public static Block heatTrapsOn;

	public static Block dramixAltar;
	public static Block parasectaAltar;
	
	public static Block arcaniteRails;
	public static Block starBridge;
	public static Block starBridgeOn;
	public static Block arcaniteTubes;
	
	public static Block moltenFurnace;
	public static Block greenlightFurnace;
	public static Block oceanfireFurnace;
	public static Block moonlightFurnace;
	public static Block whitefireFurnace;
	public static Block demonFurnace;
	
	public static Block moltenFurnaceOn;
	public static Block greenlightFurnaceOn;
	public static Block oceanfireFurnaceOn;
	public static Block moonlightFurnaceOn;
	public static Block whitefireFurnaceOn;
	public static Block demonFurnaceOn;
	
    public static Block fireStock;
    public static Block fireStock2;
    public static Block pinFly;
    public static Block pinFly2;
    public static Block hitchak;
    public static Block eucalyptusRoot;
    public static Block veilo;
    public static Block lamona;
    public static Block aquamarine;
    public static Block marsine;
    public static Block arcaniteGrass;
    public static Block arcaniteDirt;

    public static Block stainedGlass;
    public static Block stainedGlass1;
    public static Block stainedGlass2;
    public static Block stainedGlass3;
    public static Block stainedGlass4;
    public static Block stainedGlass5;
    public static Block stainedGlass6;
    public static Block stainedGlass7;

    public static Block spawnerRoamer;
    public static Block spawnerDeathcryx;
    public static Block spawnerDeathhound;
    public static Block spawnerRazorback;
    public static Block spawnerLivingstatue;
    public static Block spawnerDungeonPrisoner;

	public static Block arcanaPortal;
	public static Block arcanaPortalFrame;
	public static Block blockOfLight;
	
	public static Block condenser;
	
	public static Block DramixStatue;
	public static Block ParasectaStatue;
	
	public static void init()
	{
	    arcanaPortal = new BlockPortalArcana(ArcanaConfigHelper.arcanaPortalID).setUnlocalizedName("ArcanaPortal").func_111022_d("ArcanaPortal");
	    arcanaPortalFrame = new BlockPortalArcanaFrame(ArcanaConfigHelper.arcanaPortalFrameID).setUnlocalizedName("ArcanaPortalBlock").func_111022_d("ArcanaPortalBlock");
	    
		ancientBricks = new BlockDungeonBlock(ArcanaConfigHelper.ancientBricksID).setUnlocalizedName("AncientBricks").func_111022_d("AncientBricks"); //TODO wrong texture name
		degradedBricks = new BlockDungeonBlock(ArcanaConfigHelper.degradedBricksID).setUnlocalizedName("DegradedBricks").func_111022_d("DegradedBricks");
		ancientStone = new BlockDungeonBlock(ArcanaConfigHelper.ancientStoneID).setUnlocalizedName("AncientStone").func_111022_d("AncientStone");
		soulStone = new BlockDungeonBlock(ArcanaConfigHelper.soulStoneID).setUnlocalizedName("SoulStone").func_111022_d("SoulStone");
		soulSludge = new BlockDungeonBlock(ArcanaConfigHelper.soulSludgeID).setUnlocalizedName("SoulSludge").func_111022_d("SoulSludge");
		
		ancientTile = new BlockDungeonBlock(ArcanaConfigHelper.ancientTileID).setUnlocalizedName("AncientTile").func_111022_d("AncientTile");
		arcaniteMetal = new BlockDungeonBlock(ArcanaConfigHelper.arcaniteMetalID).setUnlocalizedName("ArcaniteMetal").func_111022_d("ArcaniumMetal");
		dungeonLamp = new BlockDungeonBlock(ArcanaConfigHelper.dungeonLampID).setUnlocalizedName("DungeonLamp").setLightValue(1.0F).func_111022_d("DungeonLamp");
		arcaniumPower = new BlockDungeonBlock(ArcanaConfigHelper.arcaniumPowerID).setUnlocalizedName("ArcaniumPower").func_111022_d("ArcaniumPower");
		extractor = new BlockExtractor(ArcanaConfigHelper.extractorID).setUnlocalizedName("Extractor").func_111022_d("Extractor");
		
		dramixAltar = new BlockDramixAltar(ArcanaConfigHelper.dramixAltarID).setUnlocalizedName("DramixAltar").func_111022_d("DramixAltar");
		parasectaAltar = new BlockParasectaAltar(ArcanaConfigHelper.parasectaAltarID).setUnlocalizedName("ParasectaAltar").func_111022_d("ParasectaAltar");
		
		heatTraps = new BlockHeatTraps(ArcanaConfigHelper.heatTrapsID, 110).setUnlocalizedName("HeatTrap").func_111022_d("HeatTrapOff");
		heatTrapsOn = new BlockHeatTraps(ArcanaConfigHelper.heatTrapsOnID, 109).setUnlocalizedName("HeatTrapsOn").func_111022_d("HeatTrapOn");
		blockOfLight = new BlockOfLight(ArcanaConfigHelper.blockOfLightID).setUnlocalizedName("BlockOfLight");
		
		arcaniumOre = new BlockDungeonBlock(ArcanaConfigHelper.arcaniumOreID).setUnlocalizedName("ArcaniumOre").func_111022_d("ArcaniumOre");
		oreDoor1 = new BlockOreDoor(ArcanaConfigHelper.oreDoor1ID).setUnlocalizedName("oreDoor1").func_111022_d("OreDoor1");
		oreDoor2 = new BlockOreDoor2(ArcanaConfigHelper.oreDoor2ID).setUnlocalizedName("oreDoor2").func_111022_d("OreDoor2");;
		oreDoor3 = new BlockOreDoor3(ArcanaConfigHelper.oreDoor3ID).setUnlocalizedName("oreDoor3").func_111022_d("OreDoor3");;
		oreDoor4 = new BlockOreDoor4(ArcanaConfigHelper.oreDoor4ID).setUnlocalizedName("oreDoor4").func_111022_d("OreDoor4");;
		
		arcaniteRails = new BlockArcaniteRails(ArcanaConfigHelper.arcaniteRailsID).setUnlocalizedName("ArcaniumRails").func_111022_d("ArcaniumRails");
		starBridge = new BlockStarBridge(ArcanaConfigHelper.starBridgeID, 0, false).setUnlocalizedName("StarBridge");
		starBridgeOn = new BlockStarBridgeOn(ArcanaConfigHelper.starBridgeOnID, 0, true).setUnlocalizedName("StarBridgeOn");
		arcaniteTubes = new BlockArcaniteTubes(ArcanaConfigHelper.arcaniteTubesID).setUnlocalizedName("ArcaniteTubes").func_111022_d("ArcaniteTubes");
		
		moltenFurnace = new BlockMoltenFurnace(ArcanaConfigHelper.moltenFurnaceID, false).setUnlocalizedName("MoltenFurnace");
		greenlightFurnace = new BlockGreenlightFurnace(ArcanaConfigHelper.greenlightFurnaceID, false).setUnlocalizedName("GreenlightFurnace");
		oceanfireFurnace = new BlockOceanfireFurnace(ArcanaConfigHelper.oceanfireFurnaceID, false).setUnlocalizedName("OceanfireFurnace");
		moonlightFurnace = new BlockMoonlightFurnace(ArcanaConfigHelper.moonlightFurnaceID, false).setUnlocalizedName("MoonlightFurnace");
		whitefireFurnace = new BlockWhitefireFurnace(ArcanaConfigHelper.whitefireFurnaceID, 0, false).setUnlocalizedName("WhitefireFurnace");
		demonFurnace = new BlockDemonFurnace(ArcanaConfigHelper.demonFurnaceID).setUnlocalizedName("DemonFurnace");
		
		fireStock = new BlockFireStock(ArcanaConfigHelper.fireStockID, 44).setUnlocalizedName("FireStock");
		fireStock2 = new BlockFireStock(ArcanaConfigHelper.fireStock2ID, 45).setUnlocalizedName("FireStock2");
		pinFly = new BlockPinfly(ArcanaConfigHelper.pinFlyID, 46).setUnlocalizedName("PinFly");
		pinFly2 = new BlockPinfly(ArcanaConfigHelper.pinFly2ID, 47).setUnlocalizedName("PinFly2");
		hitchak = new BlockHitchak(ArcanaConfigHelper.hitchakID).setUnlocalizedName("Hitchak");
		eucalyptusRoot = new BlockEucalyptusRoot(ArcanaConfigHelper.eucalyptusRootID).setUnlocalizedName("EucalyptusRoot");
		veilo = new BlockVeilo(ArcanaConfigHelper.veiloID, 0).setUnlocalizedName("Veilo");
		lamona = new BlockLamona(ArcanaConfigHelper.lamonaID).setUnlocalizedName("Lamona");
		aquamarine = new BlockAquamarine(ArcanaConfigHelper.aquamarineID).setUnlocalizedName("Aquamarine");
		marsine = new BlockMarsine(ArcanaConfigHelper.marsineID).setUnlocalizedName("marsine");
		
		arcaniteGrass = new BlockArcaniteGrass(ArcanaConfigHelper.arcaniteGrassID).setUnlocalizedName("ArcaniteGrass").func_111022_d("ArcaniteGrass");
		
		stainedGlass = new BlockStainedGlass(ArcanaConfigHelper.stainedGlassID).setUnlocalizedName("StainedGlass");
		stainedGlass1 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass1ID).setUnlocalizedName("StainedGlass1");
		stainedGlass2 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass2ID).setUnlocalizedName("StainedGlass2");
		stainedGlass3 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass3ID).setUnlocalizedName("StainedGlass3");
		stainedGlass4 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass4ID).setUnlocalizedName("StainedGlass4");
		stainedGlass5 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass5ID).setUnlocalizedName("StainedGlass5");
		stainedGlass6 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass6ID).setUnlocalizedName("StainedGlass6");
		stainedGlass7 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass7ID).setUnlocalizedName("StainedGlass7");
		
		spawnerRoamer = new BlockDivineSpawner(ArcanaConfigHelper.arcanaSpawnerID, "Roamer").setUnlocalizedName("ArcanaSpawner").func_111022_d("ArcanaSpawner");
		spawnerDeathcryx = new BlockDivineSpawner(ArcanaConfigHelper.arcanaSpawner1ID, "Deathcryx").setUnlocalizedName("ArcanaSpawner1").func_111022_d("ArcanaSpawner");;
		spawnerDeathhound = new BlockDivineSpawner(ArcanaConfigHelper.arcanaSpawner2ID, "Deathound").setUnlocalizedName("ArcanaSpawner2").func_111022_d("ArcanaSpawner");;
		spawnerRazorback = new BlockDivineSpawner(ArcanaConfigHelper.arcanaSpawner3ID, "Razorback").setUnlocalizedName("ArcanaSpawner3").func_111022_d("ArcanaSpawner");;
		spawnerLivingstatue = new BlockDivineSpawner(ArcanaConfigHelper.arcanaSpawner4ID, "Living Statue").setUnlocalizedName("ArcanaSpawner4").func_111022_d("ArcanaSpawner");;
		spawnerDungeonPrisoner = new BlockDivineSpawner(ArcanaConfigHelper.arcanaSpawner5ID, "Dungeon Prisoner").setUnlocalizedName("ArcanaSpawner5").func_111022_d("ArcanaSpawner");;
	
		//condenser = new BlockCondenser(0, 0, null);
		
		InitGameRegistryBlocks();
		addNames();
	}
	
	public static void InitGameRegistryBlocks()
	{
		GameRegistry.registerBlock(ancientBricks, "AncientBricks");
        GameRegistry.registerBlock(ancientTile, "AncientTile");
        GameRegistry.registerBlock(ancientStone, "AncientStone");
        GameRegistry.registerBlock(dungeonLamp, "AungeonLamp");
        GameRegistry.registerBlock(arcaniteTubes, "Arcanitetubes");
        GameRegistry.registerBlock(arcaniteMetal, "Arcanitemetal");
        GameRegistry.registerBlock(soulSludge, "SoulSludge");
        GameRegistry.registerBlock(soulStone, "SoulStone");
        GameRegistry.registerBlock(degradedBricks, "DegradedBricks");
        GameRegistry.registerBlock(heatTraps, "HeatTraps");
        GameRegistry.registerBlock(extractor, "Extractor");
        GameRegistry.registerBlock(dramixAltar, "DramixAltar");
        GameRegistry.registerBlock(parasectaAltar, "ParasectaAltar");
        GameRegistry.registerBlock(arcaniumPower, "ArcaniumPower");
        GameRegistry.registerBlock(arcaniumOre, "ArcaniumOre");
        GameRegistry.registerTileEntity(TileEntityDramixAltar.class, "DramixAltar");
        GameRegistry.registerTileEntity(TileEntityExtractor.class, "Extractinator");
        GameRegistry.registerTileEntity(TileEntityParasectaAltar.class, "PheonixAltar");
        GameRegistry.registerBlock(starBridge, "StarBridge");
        GameRegistry.registerBlock(starBridgeOn, "StarBridgeOn");
        GameRegistry.registerBlock(oreDoor1, "OreDoor1");
        GameRegistry.registerBlock(oreDoor2, "OreDoor2");
        GameRegistry.registerBlock(oreDoor3, "OreDoor3");
        GameRegistry.registerBlock(oreDoor4, "OreDoor4");
        GameRegistry.registerBlock(heatTrapsOn, "HeatTrapsOn");
        GameRegistry.registerBlock(arcaniteRails, "ArcaniteRails");
        GameRegistry.registerBlock(arcanaPortal, "ArcanaPortal");
        GameRegistry.registerBlock(arcanaPortalFrame, "ArcanaPortalBlock");
        //GameRegistry.registerBlock(arcaniteDirt, "arcaniteDirt");
        GameRegistry.registerBlock(arcaniteGrass, "ArcaniteGrass");
        GameRegistry.registerBlock(fireStock, "FireStock");
        GameRegistry.registerBlock(pinFly, "PinFly");
        GameRegistry.registerBlock(veilo, "Veilo");
        GameRegistry.registerBlock(lamona, "Lamona");
        GameRegistry.registerBlock(hitchak, "Hitchak");
        GameRegistry.registerBlock(marsine, "Marsine");
        GameRegistry.registerBlock(aquamarine, "Aquamarine");
        GameRegistry.registerBlock(stainedGlass, "StainedGlass");
        GameRegistry.registerBlock(stainedGlass1, "StainedGlass1");
        GameRegistry.registerBlock(stainedGlass2, "StainedGlass2");
        GameRegistry.registerBlock(stainedGlass3, "StainedGlass3");
        GameRegistry.registerBlock(stainedGlass4, "StainedGlass4");
        GameRegistry.registerBlock(stainedGlass5, "StainedGlass5");
        GameRegistry.registerBlock(stainedGlass6, "StainedGlass6");
        GameRegistry.registerBlock(stainedGlass7, "StainedGlass7");
        GameRegistry.registerBlock(moltenFurnace, "MoltenFurnace");
        //GameRegistry.registerBlock(moltenFurnaceOn, "moltenFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityMoltenFurnace.class, "MoltenFurnaceTE");
        GameRegistry.registerBlock(greenlightFurnace, "GreenlightFurnace");
        //GameRegistry.registerBlock(greenlightFurnaceOn, "greenlightFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityGreenlightFurnace.class, "GreenlightFurnaceTE");
        GameRegistry.registerBlock(oceanfireFurnace, "OceanfireFurnace");
        //GameRegistry.registerBlock(oceanfireFurnaceOn, "oceanfireFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityOceanfireFurnace.class, "OceanfireFurnaceTE");
        GameRegistry.registerBlock(moonlightFurnace, "MoonlightFurnace");
//        GameRegistry.registerBlock(moonlightFurnaceOn, "moonlightFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityMoonlightFurnace.class, "MoonlightFurnaceTE");
        GameRegistry.registerBlock(whitefireFurnace, "WhitefireFurnace");
//        GameRegistry.registerBlock(whitefireFurnaceOn, "whitefireFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityWhitefireFurnace.class, "WhitefireFurnaceTE");
        GameRegistry.registerBlock(demonFurnace, "DemonFurnace");
        GameRegistry.registerTileEntity(TileEntityDemonFurnace.class, "DemonFurnaceTE");
        GameRegistry.registerBlock(fireStock2, "FireStock2");
        GameRegistry.registerBlock(pinFly2, "PinFly2");
        GameRegistry.registerBlock(spawnerRoamer, "ArcanaSpawner");
        GameRegistry.registerBlock(spawnerDeathcryx, "ArcanaSpawner1");
        GameRegistry.registerBlock(spawnerDeathhound, "ArcanaSpawner2");
        GameRegistry.registerBlock(spawnerRazorback, "ArcanaSpawner3");
        GameRegistry.registerBlock(spawnerLivingstatue, "ArcanaSpawner4");
        GameRegistry.registerBlock(spawnerDungeonPrisoner, "ArcanaSpawner5");
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(ancientBricks, "Ancient Bricks");
        LanguageRegistry.addName(ancientTile, "Ancient Tile");
        LanguageRegistry.addName(ancientStone, "Ancient Stone");
        LanguageRegistry.addName(dungeonLamp, "Dungeon Lamp");
        LanguageRegistry.addName(arcaniteTubes, "Arcanite Tubes");
        LanguageRegistry.addName(arcaniteMetal, "Arcanite Metal");
        LanguageRegistry.addName(soulSludge, "Soul Sludge");
        LanguageRegistry.addName(soulStone, "Soul Stone");
        LanguageRegistry.addName(degradedBricks, "Degraded Bricks");
        LanguageRegistry.addName(heatTraps, "Heat Traps");
        LanguageRegistry.addName(extractor, "Extractor");
        LanguageRegistry.addName(dramixAltar, "Dramix Altar");
        LanguageRegistry.addName(parasectaAltar, "Parasecta Altar");
        LanguageRegistry.addName(arcaniumPower, "Arcanium Power");
        LanguageRegistry.addName(arcaniumOre, "Arcanium Ore");
        LanguageRegistry.addName(starBridge, "Star Bridge");
        LanguageRegistry.addName(starBridgeOn, "Star Bridge");
        LanguageRegistry.addName(oreDoor1, "Locked Door");
        LanguageRegistry.addName(oreDoor2, "Locked Door");
        LanguageRegistry.addName(oreDoor3, "Locked Door");
        LanguageRegistry.addName(oreDoor4, "Locked Door");
        LanguageRegistry.addName(heatTrapsOn, "HeatTraps");
        LanguageRegistry.addName(arcaniteRails, "Arcanite Rails");
        LanguageRegistry.addName(arcanaPortal, "Arcana Portal");
        LanguageRegistry.addName(arcanaPortalFrame, "Arcana Portal Frame");
        //LanguageRegistry.addName(arcaniteDirt, "Arcanite Dirt");
        LanguageRegistry.addName(arcaniteGrass, "Arcanite Grass");
        LanguageRegistry.addName(fireStock, "Firestock");
        LanguageRegistry.addName(pinFly, "Pinfly");
        LanguageRegistry.addName(veilo, "Veilo");
        LanguageRegistry.addName(lamona, "Lamona");
        LanguageRegistry.addName(hitchak, "Hitchak");
        LanguageRegistry.addName(marsine, "Marasine");
        LanguageRegistry.addName(aquamarine, "Aquamarine");
        LanguageRegistry.addName(stainedGlass, "Stained Glass");
        LanguageRegistry.addName(stainedGlass1, "Stained Glass");
        LanguageRegistry.addName(stainedGlass2, "Stained Glass");
        LanguageRegistry.addName(stainedGlass3, "Stained Glass");
        LanguageRegistry.addName(stainedGlass4, "Stained Glass");
        LanguageRegistry.addName(stainedGlass5, "Stained Glass");
        LanguageRegistry.addName(stainedGlass6, "Stained Glass");
        LanguageRegistry.addName(stainedGlass7, "Stained Glass");
        LanguageRegistry.addName(moltenFurnace, "Molten Furnace");
//        LanguageRegistry.addName(moltenFurnaceOn, "Molten Furnace");
        LanguageRegistry.addName(greenlightFurnace, "Greenlight Furnace");
//        LanguageRegistry.addName(greenlightFurnaceOn, "Greenlight Furnace");
        LanguageRegistry.addName(oceanfireFurnace, "Oceanfire Furnace");
//        LanguageRegistry.addName(oceanfireFurnaceOn, "Oceanfire Furnace");
        LanguageRegistry.addName(moonlightFurnace, "Moonlight Furnace");
//        LanguageRegistry.addName(moonlightFurnaceOn, "Moonlight Furnace");
        LanguageRegistry.addName(whitefireFurnace, "Whitefire Furnace");
//        LanguageRegistry.addName(whitefireFurnaceOn, "Whitefire Furnace");
        LanguageRegistry.addName(demonFurnace, "Demon Furnace");
        LanguageRegistry.addName(fireStock2, "Firestock");
        LanguageRegistry.addName(pinFly2, "Pinfly");
        LanguageRegistry.addName(spawnerRoamer, "Dungeon Spawner");
        LanguageRegistry.addName(spawnerDeathcryx, "Dungeon Spawner");
        LanguageRegistry.addName(spawnerDeathhound, "Dungeon Spawner");
        LanguageRegistry.addName(spawnerRazorback, "Dungeon Spawner");
        LanguageRegistry.addName(spawnerLivingstatue, "Dungeon Spawner");
        LanguageRegistry.addName(spawnerDungeonPrisoner, "Dungeon Spawner");
	}
}
