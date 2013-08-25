package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.arcana.BlockAquamarine;
import net.divinerpg.blocks.arcana.BlockArcanaSpawner;
import net.divinerpg.blocks.arcana.BlockArcanaSpawner1;
import net.divinerpg.blocks.arcana.BlockArcanaSpawner2;
import net.divinerpg.blocks.arcana.BlockArcanaSpawner3;
import net.divinerpg.blocks.arcana.BlockArcanaSpawner4;
import net.divinerpg.blocks.arcana.BlockArcanaSpawner5;
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

    public static Block arcanaSpawner;
    public static Block arcanaSpawner1;
    public static Block arcanaSpawner2;
    public static Block arcanaSpawner3;
    public static Block arcanaSpawner4;
    public static Block arcanaSpawner5;

	public static Block arcanaPortal;
	public static Block arcanaPortalFrame;
	public static Block blockOfLight;
	
	public static Block condenser;
	
	public static Block DramixStatue;
	public static Block ParasectaStatue;
	
	public static void init()
	{
	    arcanaPortal = new BlockPortalArcana(ArcanaConfigHelper.arcanaPortalID).setUnlocalizedName("portalarcana").func_111022_d("ArcanaPortal");
	    arcanaPortalFrame = new BlockPortalArcanaFrame(ArcanaConfigHelper.arcanaPortalFrameID).setUnlocalizedName("arcanaPortalFrame").func_111022_d("ArcanaPortalBlock");
	    
		ancientBricks = new BlockDungeonBlock(ArcanaConfigHelper.ancientBricksID).setUnlocalizedName("ancientBricks").func_111022_d("AncientBricks"); //TODO wrong texture name
		degradedBricks = new BlockDungeonBlock(ArcanaConfigHelper.degradedBricksID).setUnlocalizedName("degradedBricks").func_111022_d("DegradedBricks");
		ancientStone = new BlockDungeonBlock(ArcanaConfigHelper.ancientStoneID).setUnlocalizedName("ancientStone").func_111022_d("AncientStone");
		soulStone = new BlockDungeonBlock(ArcanaConfigHelper.soulStoneID).setUnlocalizedName("soulStone").func_111022_d("SoulStone");
		soulSludge = new BlockDungeonBlock(ArcanaConfigHelper.soulSludgeID).setUnlocalizedName("soulSludge").func_111022_d("SoulSludge");
		
		ancientTile = new BlockDungeonBlock(ArcanaConfigHelper.ancientTileID).setUnlocalizedName("ancientTile").func_111022_d("AncientTile");
		arcaniteMetal = new BlockDungeonBlock(ArcanaConfigHelper.arcaniteMetalID).setUnlocalizedName("arcaniteMetal").func_111022_d("ArcaniumMetal");
		dungeonLamp = new BlockDungeonBlock(ArcanaConfigHelper.dungeonLampID).setUnlocalizedName("dungeonLamp").setLightValue(1.0F).func_111022_d("DungeonLamp");
		arcaniumPower = new BlockDungeonBlock(ArcanaConfigHelper.arcaniumPowerID).setUnlocalizedName("arcaniumPower").func_111022_d("ArcaniumPower");
		extractor = new BlockExtractor(ArcanaConfigHelper.extractorID).setUnlocalizedName("extractor").func_111022_d("Extractor");
		
		dramixAltar = new BlockDramixAltar(ArcanaConfigHelper.dramixAltarID).setUnlocalizedName("dramixAltar").func_111022_d("DramixAltar");
		parasectaAltar = new BlockParasectaAltar(ArcanaConfigHelper.parasectaAltarID).setUnlocalizedName("parasectaAltar").func_111022_d("ParasectaAltar");
		
		heatTraps = new BlockHeatTraps(ArcanaConfigHelper.heatTrapsID, 110).setUnlocalizedName("heatTrap").func_111022_d("HeatTrapOff");
		heatTrapsOn = new BlockHeatTraps(ArcanaConfigHelper.heatTrapsOnID, 109).setUnlocalizedName("heatTrapsOn").func_111022_d("HeatTrapOn");
		blockOfLight = new BlockOfLight(ArcanaConfigHelper.blockOfLightID).setUnlocalizedName("blockOfLight");
		
		arcaniumOre = new BlockDungeonBlock(ArcanaConfigHelper.arcaniumOreID).setUnlocalizedName("arcaniumOre").func_111022_d("ArcaniumOre");
		oreDoor1 = new BlockOreDoor(ArcanaConfigHelper.oreDoor1ID).setUnlocalizedName("oreDoor1").func_111022_d("OreDoor1");
		oreDoor2 = new BlockOreDoor2(ArcanaConfigHelper.oreDoor2ID).setUnlocalizedName("oreDoor2").func_111022_d("OreDoor2");;
		oreDoor3 = new BlockOreDoor3(ArcanaConfigHelper.oreDoor3ID).setUnlocalizedName("oreDoor3").func_111022_d("OreDoor3");;
		oreDoor4 = new BlockOreDoor4(ArcanaConfigHelper.oreDoor4ID).setUnlocalizedName("oreDoor4").func_111022_d("OreDoor4");;
		
		arcaniteRails = new BlockArcaniteRails(ArcanaConfigHelper.arcaniteRailsID).setUnlocalizedName("arcaniumRails").func_111022_d("ArcaniumRails");
		starBridge = new BlockStarBridge(ArcanaConfigHelper.starBridgeID, 0, false).setUnlocalizedName("starBridge");
		starBridgeOn = new BlockStarBridgeOn(ArcanaConfigHelper.starBridgeOnID, 0, true).setUnlocalizedName("starBridgeOn");
		arcaniteTubes = new BlockArcaniteTubes(ArcanaConfigHelper.arcaniteTubesID).setUnlocalizedName("arcaniteTubes").func_111022_d("ArcaniteTubes");
		
		moltenFurnace = new BlockMoltenFurnace(ArcanaConfigHelper.moltenFurnaceID, false).setUnlocalizedName("moltenFurnace");
		greenlightFurnace = new BlockGreenlightFurnace(ArcanaConfigHelper.greenlightFurnaceID, false).setUnlocalizedName("greenlightFurnace");
		oceanfireFurnace = new BlockOceanfireFurnace(ArcanaConfigHelper.oceanfireFurnaceID, false).setUnlocalizedName("oceanfireFurnace");
		moonlightFurnace = new BlockMoonlightFurnace(ArcanaConfigHelper.moonlightFurnaceID, false).setUnlocalizedName("moonlightFurnace");
		whitefireFurnace = new BlockWhitefireFurnace(ArcanaConfigHelper.whitefireFurnaceID, 0, false).setUnlocalizedName("whitefireFurnace");
		demonFurnace = new BlockDemonFurnace(ArcanaConfigHelper.demonFurnaceID).setUnlocalizedName("demonFurnace");
		
		fireStock = new BlockFireStock(ArcanaConfigHelper.fireStockID, 44).setUnlocalizedName("fireStock");
		fireStock2 = new BlockFireStock(ArcanaConfigHelper.fireStock2ID, 45).setUnlocalizedName("fireStock2");
		pinFly = new BlockPinfly(ArcanaConfigHelper.pinFlyID, 46).setUnlocalizedName("pinFly");
		pinFly2 = new BlockPinfly(ArcanaConfigHelper.pinFly2ID, 47).setUnlocalizedName("pinFly2");
		hitchak = new BlockHitchak(ArcanaConfigHelper.hitchakID).setUnlocalizedName("hitchak");
		eucalyptusRoot = new BlockEucalyptusRoot(ArcanaConfigHelper.eucalyptusRootID).setUnlocalizedName("eucalyptusRoot");
		veilo = new BlockVeilo(ArcanaConfigHelper.veiloID, 0).setUnlocalizedName("veilo");
		lamona = new BlockLamona(ArcanaConfigHelper.lamonaID).setUnlocalizedName("lamona");
		aquamarine = new BlockAquamarine(ArcanaConfigHelper.aquamarineID).setUnlocalizedName("aquamarine");
		marsine = new BlockMarsine(ArcanaConfigHelper.marsineID).setUnlocalizedName("marsine");
		
		arcaniteGrass = new BlockArcaniteGrass(ArcanaConfigHelper.arcaniteGrassID).setUnlocalizedName("arcaniteGrass").func_111022_d("ArcaniteGrass");
		
		stainedGlass = new BlockStainedGlass(ArcanaConfigHelper.stainedGlassID).setUnlocalizedName("stainedGlass");
		stainedGlass1 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass1ID).setUnlocalizedName("stainedGlass1");
		stainedGlass2 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass2ID).setUnlocalizedName("stainedGlass2");
		stainedGlass3 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass3ID).setUnlocalizedName("stainedGlass3");
		stainedGlass4 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass4ID).setUnlocalizedName("stainedGlass4");
		stainedGlass5 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass5ID).setUnlocalizedName("stainedGlass5");
		stainedGlass6 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass6ID).setUnlocalizedName("stainedGlass6");
		stainedGlass7 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass7ID).setUnlocalizedName("stainedGlass7");
		
		arcanaSpawner = new BlockArcanaSpawner(ArcanaConfigHelper.arcanaSpawnerID).setUnlocalizedName("arcanaSpawner").func_111022_d("ArcanaSpawner");
		arcanaSpawner1 = new BlockArcanaSpawner1(ArcanaConfigHelper.arcanaSpawner1ID).setUnlocalizedName("arcanaSpawner1").func_111022_d("ArcanaSpawner");;
		arcanaSpawner2 = new BlockArcanaSpawner2(ArcanaConfigHelper.arcanaSpawner2ID).setUnlocalizedName("arcanaSpawner2").func_111022_d("ArcanaSpawner");;
		arcanaSpawner3 = new BlockArcanaSpawner3(ArcanaConfigHelper.arcanaSpawner3ID).setUnlocalizedName("arcanaSpawner3").func_111022_d("ArcanaSpawner");;
		arcanaSpawner4 = new BlockArcanaSpawner4(ArcanaConfigHelper.arcanaSpawner4ID).setUnlocalizedName("arcanaSpawner4").func_111022_d("ArcanaSpawner");;
		arcanaSpawner5 = new BlockArcanaSpawner5(ArcanaConfigHelper.arcanaSpawner5ID).setUnlocalizedName("arcanaSpawner5").func_111022_d("ArcanaSpawner");;
		
		//condenser = new BlockCondenser(0, 0, null);
		
		InitGameRegistryBlocks();
		addNames();
	}
	
	public static void InitGameRegistryBlocks()
	{
		GameRegistry.registerBlock(ancientBricks, "ancientBricks");
        GameRegistry.registerBlock(ancientTile, "ancientTile");
        GameRegistry.registerBlock(ancientStone, "ancientStone");
        GameRegistry.registerBlock(dungeonLamp, "dungeonLamp");
        GameRegistry.registerBlock(arcaniteTubes, "arcanitetubes");
        GameRegistry.registerBlock(arcaniteMetal, "arcanitemetal");
        GameRegistry.registerBlock(soulSludge, "soulSludge");
        GameRegistry.registerBlock(soulStone, "soulstone");
        GameRegistry.registerBlock(degradedBricks, "degradedBricks");
        GameRegistry.registerBlock(heatTraps, "heatTraps");
        GameRegistry.registerBlock(extractor, "extractor");
        GameRegistry.registerBlock(dramixAltar, "dramixAltar");
        GameRegistry.registerBlock(parasectaAltar, "parasectaAltar");
        GameRegistry.registerBlock(arcaniumPower, "arcaniumpower");
        GameRegistry.registerBlock(arcaniumOre, "arcaniumOre");
        GameRegistry.registerTileEntity(TileEntityDramixAltar.class, "DramixAltar");
        GameRegistry.registerTileEntity(TileEntityExtractor.class, "Extractinator");
        GameRegistry.registerTileEntity(TileEntityParasectaAltar.class, "PheonixAltar");
        GameRegistry.registerBlock(starBridge, "starBridge");
        GameRegistry.registerBlock(starBridgeOn, "starBridgeOn");
        GameRegistry.registerBlock(oreDoor1, "oreDoor1");
        GameRegistry.registerBlock(oreDoor2, "oreDoor2");
        GameRegistry.registerBlock(oreDoor3, "oreDoor3");
        GameRegistry.registerBlock(oreDoor4, "oreDoor4");
        GameRegistry.registerBlock(heatTrapsOn, "heatTrapsOn");
        GameRegistry.registerBlock(arcaniteRails, "arcaniteRails");
        GameRegistry.registerBlock(arcanaPortal, "arcanaPortal");
        GameRegistry.registerBlock(arcanaPortalFrame, "arcanaPortalFrame");
        //GameRegistry.registerBlock(arcaniteDirt, "arcaniteDirt");
        GameRegistry.registerBlock(arcaniteGrass, "arcaniteGrass");
        GameRegistry.registerBlock(fireStock, "fireStock");
        GameRegistry.registerBlock(pinFly, "pinFly");
        GameRegistry.registerBlock(veilo, "veilo");
        GameRegistry.registerBlock(lamona, "lamona");
        GameRegistry.registerBlock(hitchak, "hitchak");
        GameRegistry.registerBlock(marsine, "marsine");
        GameRegistry.registerBlock(aquamarine, "aquamarine");
        GameRegistry.registerBlock(stainedGlass, "stainedGlass");
        GameRegistry.registerBlock(stainedGlass1, "stainedGlass1");
        GameRegistry.registerBlock(stainedGlass2, "stainedGlass2");
        GameRegistry.registerBlock(stainedGlass3, "stainedGlass3");
        GameRegistry.registerBlock(stainedGlass4, "stainedGlass4");
        GameRegistry.registerBlock(stainedGlass5, "stainedGlass5");
        GameRegistry.registerBlock(stainedGlass6, "stainedGlass6");
        GameRegistry.registerBlock(stainedGlass7, "stainedGlass7");
        GameRegistry.registerBlock(moltenFurnace, "moltenFurnace");
        //GameRegistry.registerBlock(moltenFurnaceOn, "moltenFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityMoltenFurnace.class, "MoltenFurnaceTE");
        GameRegistry.registerBlock(greenlightFurnace, "greenlightFurnace");
        //GameRegistry.registerBlock(greenlightFurnaceOn, "greenlightFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityGreenlightFurnace.class, "GreenlightFurnaceTE");
        GameRegistry.registerBlock(oceanfireFurnace, "oceanfireFurnace");
        //GameRegistry.registerBlock(oceanfireFurnaceOn, "oceanfireFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityOceanfireFurnace.class, "OceanfireFurnaceTE");
        GameRegistry.registerBlock(moonlightFurnace, "moonlightFurnace");
//        GameRegistry.registerBlock(moonlightFurnaceOn, "moonlightFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityMoonlightFurnace.class, "MoonlightFurnaceTE");
        GameRegistry.registerBlock(whitefireFurnace, "whitefireFurnace");
//        GameRegistry.registerBlock(whitefireFurnaceOn, "whitefireFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityWhitefireFurnace.class, "WhitefireFurnaceTE");
        GameRegistry.registerBlock(demonFurnace, "demonFurnace");
        GameRegistry.registerTileEntity(TileEntityDemonFurnace.class, "DemonFurnaceTE");
        GameRegistry.registerBlock(fireStock2, "fireStock2");
        GameRegistry.registerBlock(pinFly2, "pinFly2");
        GameRegistry.registerBlock(arcanaSpawner, "arcanaSpawner");
        GameRegistry.registerBlock(arcanaSpawner1, "arcanaSpawner1");
        GameRegistry.registerBlock(arcanaSpawner2, "arcanaSpawner2");
        GameRegistry.registerBlock(arcanaSpawner3, "arcanaSpawner3");
        GameRegistry.registerBlock(arcanaSpawner4, "arcanaSpawner4");
        GameRegistry.registerBlock(arcanaSpawner5, "arcanaSpawner5");
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
        LanguageRegistry.addName(arcanaSpawner, "Dungeon Spawner");
        LanguageRegistry.addName(arcanaSpawner1, "Dungeon Spawner");
        LanguageRegistry.addName(arcanaSpawner2, "Dungeon Spawner");
        LanguageRegistry.addName(arcanaSpawner3, "Dungeon Spawner");
        LanguageRegistry.addName(arcanaSpawner4, "Dungeon Spawner");
        LanguageRegistry.addName(arcanaSpawner5, "Dungeon Spawner");
	}
}
