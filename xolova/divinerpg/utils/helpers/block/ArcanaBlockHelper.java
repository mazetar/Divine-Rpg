package xolova.divinerpg.utils.helpers.block;

import net.minecraft.block.Block;
import xolova.divinerpg.blocks.arcana.BlockAquamarine;
import xolova.divinerpg.blocks.arcana.BlockArcanaSpawner;
import xolova.divinerpg.blocks.arcana.BlockArcanaSpawner1;
import xolova.divinerpg.blocks.arcana.BlockArcanaSpawner2;
import xolova.divinerpg.blocks.arcana.BlockArcanaSpawner3;
import xolova.divinerpg.blocks.arcana.BlockArcanaSpawner4;
import xolova.divinerpg.blocks.arcana.BlockArcanaSpawner5;
import xolova.divinerpg.blocks.arcana.BlockArcaniteGrass;
import xolova.divinerpg.blocks.arcana.BlockArcaniteRails;
import xolova.divinerpg.blocks.arcana.BlockArcaniteTubes;
import xolova.divinerpg.blocks.arcana.BlockDemonFurnace;
import xolova.divinerpg.blocks.arcana.BlockDramixAltar;
import xolova.divinerpg.blocks.arcana.BlockDungeonBlock;
import xolova.divinerpg.blocks.arcana.BlockEucalyptusRoot;
import xolova.divinerpg.blocks.arcana.BlockExtractor;
import xolova.divinerpg.blocks.arcana.BlockFireStock;
import xolova.divinerpg.blocks.arcana.BlockGreenlightFurnace;
import xolova.divinerpg.blocks.arcana.BlockHeatTraps;
import xolova.divinerpg.blocks.arcana.BlockHitchak;
import xolova.divinerpg.blocks.arcana.BlockLamona;
import xolova.divinerpg.blocks.arcana.BlockMarsine;
import xolova.divinerpg.blocks.arcana.BlockMoltenFurnace;
import xolova.divinerpg.blocks.arcana.BlockMoonlightFurnace;
import xolova.divinerpg.blocks.arcana.BlockOceanfireFurnace;
import xolova.divinerpg.blocks.arcana.BlockOfLight;
import xolova.divinerpg.blocks.arcana.BlockOreDoor;
import xolova.divinerpg.blocks.arcana.BlockOreDoor2;
import xolova.divinerpg.blocks.arcana.BlockOreDoor3;
import xolova.divinerpg.blocks.arcana.BlockOreDoor4;
import xolova.divinerpg.blocks.arcana.BlockParasectaAltar;
import xolova.divinerpg.blocks.arcana.BlockPinfly;
import xolova.divinerpg.blocks.arcana.BlockStainedGlass;
import xolova.divinerpg.blocks.arcana.BlockStarBridge;
import xolova.divinerpg.blocks.arcana.BlockStarBridgeOn;
import xolova.divinerpg.blocks.arcana.BlockVeilo;
import xolova.divinerpg.blocks.arcana.BlockWhitefireFurnace;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityDemonFurnace;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityDramixAltar;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityExtractor;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityGreenlightFurnace;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityMoltenFurnace;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityMoonlightFurnace;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityOceanfireFurnace;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityParasectaAltar;
import xolova.divinerpg.blocks.arcana.tileentities.TileEntityWhitefireFurnace;
import xolova.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import cpw.mods.fml.common.registry.GameRegistry;

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
	
	public static void init()
	{
		ancientBricks = new BlockDungeonBlock(ArcanaConfigHelper.ancientBricksID).setUnlocalizedName("ancientBricks");
		degradedBricks = new BlockDungeonBlock(ArcanaConfigHelper.degradedBricksID).setUnlocalizedName("degradedBricks");
		ancientStone = new BlockDungeonBlock(ArcanaConfigHelper.ancientStoneID).setUnlocalizedName("ancientStone");
		soulStone = new BlockDungeonBlock(ArcanaConfigHelper.soulStoneID).setUnlocalizedName("soulStone");
		soulSludge = new BlockDungeonBlock(ArcanaConfigHelper.soulSludgeID).setUnlocalizedName("soulSludge");
		
		ancientTile = new BlockDungeonBlock(ArcanaConfigHelper.ancientTileID).setUnlocalizedName("ancientTile");
		arcaniteMetal = new BlockDungeonBlock(ArcanaConfigHelper.arcaniteMetalID).setUnlocalizedName("arcaniteMetal");
		dungeonLamp = new BlockDungeonBlock(ArcanaConfigHelper.dungeonLampID).setUnlocalizedName("dungeonLamp").setLightValue(1.0F);
		arcaniumPower = new BlockDungeonBlock(ArcanaConfigHelper.arcaniumPowerID).setUnlocalizedName("arcaniumPower");
		extractor = new BlockExtractor(ArcanaConfigHelper.extractorID).setUnlocalizedName("extractor");
		
		dramixAltar = new BlockDramixAltar(ArcanaConfigHelper.dramixAltarID).setUnlocalizedName("dramixAltar");
		parasectaAltar = new BlockParasectaAltar(ArcanaConfigHelper.parasectaAltarID).setUnlocalizedName("parasectaAltar");
		
		heatTraps = new BlockHeatTraps(ArcanaConfigHelper.heatTrapsID, 110).setUnlocalizedName("heatTraps");
		heatTrapsOn = new BlockHeatTraps(ArcanaConfigHelper.heatTrapsOnID, 109).setUnlocalizedName("heatTrapsOn");
		blockOfLight = new BlockOfLight(ArcanaConfigHelper.heatTrapsOnID).setUnlocalizedName("heatTrapsOn");
		
		arcaniumOre = new BlockDungeonBlock(ArcanaConfigHelper.arcaniumOreID).setUnlocalizedName("arcaniumOre");
		oreDoor1 = new BlockOreDoor(ArcanaConfigHelper.oreDoor1ID).setUnlocalizedName("oreDoor1");
		oreDoor2 = new BlockOreDoor2(ArcanaConfigHelper.oreDoor2ID).setUnlocalizedName("oreDoor2");
		oreDoor3 = new BlockOreDoor3(ArcanaConfigHelper.oreDoor3ID).setUnlocalizedName("oreDoor3");
		oreDoor4 = new BlockOreDoor4(ArcanaConfigHelper.oreDoor4ID).setUnlocalizedName("oreDoor4");
		
		arcaniteRails = new BlockArcaniteRails(ArcanaConfigHelper.arcaniteRailsID).setUnlocalizedName("arcaniteRails");
		starBridge = new BlockStarBridge(ArcanaConfigHelper.starBridgeID, false).setUnlocalizedName("starBridge");
		starBridgeOn = new BlockStarBridgeOn(ArcanaConfigHelper.starBridgeOnID, true).setUnlocalizedName("starBridgeOn");
		arcaniteTubes = new BlockArcaniteTubes(ArcanaConfigHelper.arcaniteTubesID).setUnlocalizedName("arcaniteTubes");
		
		moltenFurnace = new BlockMoltenFurnace(ArcanaConfigHelper.moltenFurnaceID, false).setUnlocalizedName("moltenFurnace");
		greenlightFurnace = new BlockGreenlightFurnace(ArcanaConfigHelper.greenlightFurnaceID, false).setUnlocalizedName("greenlightFurnace");
		oceanfireFurnace = new BlockOceanfireFurnace(ArcanaConfigHelper.oceanfireFurnaceID, false).setUnlocalizedName("oceanfireFurnace");
		moonlightFurnace = new BlockMoonlightFurnace(ArcanaConfigHelper.moonlightFurnaceID, false).setUnlocalizedName("moonlightFurnace");
		whitefireFurnace = new BlockWhitefireFurnace(ArcanaConfigHelper.whitefireFurnaceID, false).setUnlocalizedName("whitefireFurnace");
		demonFurnace = new BlockDemonFurnace(ArcanaConfigHelper.demonFurnaceID).setUnlocalizedName("demonFurnace");
		
		moltenFurnace = new BlockMoltenFurnace(ArcanaConfigHelper.moltenFurnaceID, true).setUnlocalizedName("moltenFurnace");
		greenlightFurnace = new BlockGreenlightFurnace(ArcanaConfigHelper.greenlightFurnaceID, true).setUnlocalizedName("greenlightFurnace");
		oceanfireFurnace = new BlockOceanfireFurnace(ArcanaConfigHelper.oceanfireFurnaceID, true).setUnlocalizedName("oceanfireFurnace");
		moonlightFurnace = new BlockMoonlightFurnace(ArcanaConfigHelper.moonlightFurnaceID, true).setUnlocalizedName("moonlightFurnace");
		whitefireFurnace = new BlockWhitefireFurnace(ArcanaConfigHelper.whitefireFurnaceID, true).setUnlocalizedName("whitefireFurnace");
		
		fireStock = new BlockFireStock(ArcanaConfigHelper.fireStockID, 44).setUnlocalizedName("fireStock");
		fireStock2 = new BlockFireStock(ArcanaConfigHelper.fireStock2ID, 45).setUnlocalizedName("fireStock2");
		pinFly = new BlockPinfly(ArcanaConfigHelper.pinFlyID, 46).setUnlocalizedName("pinFly");
		pinFly2 = new BlockPinfly(ArcanaConfigHelper.pinFly2ID, 47).setUnlocalizedName("pinFly2");
		hitchak = new BlockHitchak(ArcanaConfigHelper.hitchakID).setUnlocalizedName("hitchak");
		eucalyptusRoot = new BlockEucalyptusRoot(ArcanaConfigHelper.eucalyptusRootID).setUnlocalizedName("eucalyptusRoot");
		veilo = new BlockVeilo(ArcanaConfigHelper.veiloID).setUnlocalizedName("veilo");
		lamona = new BlockLamona(ArcanaConfigHelper.lamonaID).setUnlocalizedName("lamona");
		aquamarine = new BlockAquamarine(ArcanaConfigHelper.aquamarineID).setUnlocalizedName("aquamarine");
		marsine = new BlockMarsine(ArcanaConfigHelper.marsineID).setUnlocalizedName("marsine");
		
		arcaniteGrass = new BlockArcaniteGrass(ArcanaConfigHelper.arcaniteGrassID).setUnlocalizedName("arcaniteGrass");
		
		stainedGlass = new BlockStainedGlass(ArcanaConfigHelper.stainedGlassID).setUnlocalizedName("stainedGlass");
		stainedGlass1 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass1ID).setUnlocalizedName("stainedGlass1");
		stainedGlass2 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass2ID).setUnlocalizedName("stainedGlass2");
		stainedGlass3 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass3ID).setUnlocalizedName("stainedGlass3");
		stainedGlass4 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass4ID).setUnlocalizedName("stainedGlass4");
		stainedGlass5 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass5ID).setUnlocalizedName("stainedGlass5");
		stainedGlass6 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass6ID).setUnlocalizedName("stainedGlass6");
		stainedGlass7 = new BlockStainedGlass(ArcanaConfigHelper.stainedGlass7ID).setUnlocalizedName("stainedGlass7");
		
		arcanaSpawner = new BlockArcanaSpawner(ArcanaConfigHelper.arcanaSpawnerID).setUnlocalizedName("arcanaSpawner");
		arcanaSpawner1 = new BlockArcanaSpawner1(ArcanaConfigHelper.arcanaSpawner1ID).setUnlocalizedName("arcanaSpawner1");
		arcanaSpawner2 = new BlockArcanaSpawner2(ArcanaConfigHelper.arcanaSpawner2ID).setUnlocalizedName("arcanaSpawner2");
		arcanaSpawner3 = new BlockArcanaSpawner3(ArcanaConfigHelper.arcanaSpawner3ID).setUnlocalizedName("arcanaSpawner3");
		arcanaSpawner4 = new BlockArcanaSpawner4(ArcanaConfigHelper.arcanaSpawner4ID).setUnlocalizedName("arcanaSpawner4");
		arcanaSpawner5 = new BlockArcanaSpawner5(ArcanaConfigHelper.arcanaSpawner5ID).setUnlocalizedName("arcanaSpawner5");
		
		InitGameRegistryBlocks();
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
        GameRegistry.registerTileEntity(TileEntityDramixAltar.class, "Dramix Altar");
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
        GameRegistry.registerBlock(arcaniteDirt, "arcaniteDirt");
        GameRegistry.registerBlock(arcaniteGrass, "arcaniteGrass");
        GameRegistry.registerBlock(fireStock, "fireStock");
        GameRegistry.registerBlock(pinFly, "pinFly");
        GameRegistry.registerBlock(veilo, "veilo");
        GameRegistry.registerBlock(lamona, "lamon");
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
        GameRegistry.registerBlock(moltenFurnaceOn, "moltenFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityMoltenFurnace.class, "MoltenFurnaceTE");
        GameRegistry.registerBlock(greenlightFurnace, "greenlightFurnace");
        GameRegistry.registerBlock(greenlightFurnaceOn, "greenlightFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityGreenlightFurnace.class, "GreenlightFurnaceTE");
        GameRegistry.registerBlock(oceanfireFurnace, "oceanfireFurnace");
        GameRegistry.registerBlock(oceanfireFurnaceOn, "oceanfireFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityOceanfireFurnace.class, "OceanfireFurnaceTE");
        GameRegistry.registerBlock(moonlightFurnace, "moonlightFurnace");
        GameRegistry.registerBlock(moonlightFurnaceOn, "moonlightFurnaceOn");
        GameRegistry.registerTileEntity(TileEntityMoonlightFurnace.class, "MoonlightFurnaceTE");
        GameRegistry.registerBlock(whitefireFurnace, "whitefireFurnace");
        GameRegistry.registerBlock(whitefireFurnaceOn, "whitefireFurnaceOn");
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
        GameRegistry.registerBlock(arcanaSpawner5, "arcanaSpawner5");
        
	}
}
