package net.divinerpg.utils.helpers.block;

import net.divinerpg.blocks.vethea.BlockAcid;
import net.divinerpg.blocks.vethea.BlockBacterialAcid;
import net.divinerpg.blocks.vethea.BlockBarredDoor;
import net.divinerpg.blocks.vethea.BlockDreamLamp;
import net.divinerpg.blocks.vethea.BlockDreamgrass;
import net.divinerpg.blocks.vethea.BlockDreamwood;
import net.divinerpg.blocks.vethea.BlockDreamwoodLeaves;
import net.divinerpg.blocks.vethea.BlockHelioticBeam;
import net.divinerpg.blocks.vethea.BlockInfusionTable;
import net.divinerpg.blocks.vethea.BlockKarosAltar;
import net.divinerpg.blocks.vethea.BlockKarosCannon;
import net.divinerpg.blocks.vethea.BlockKarosHeatTileGreen;
import net.divinerpg.blocks.vethea.BlockKarosHeatTileRed;
import net.divinerpg.blocks.vethea.BlockLunicAcid;
import net.divinerpg.blocks.vethea.BlockLunicAltar;
import net.divinerpg.blocks.vethea.BlockPortalVethea;
import net.divinerpg.blocks.vethea.BlockPurpleFire;
import net.divinerpg.blocks.vethea.BlockRaglokAltar;
import net.divinerpg.blocks.vethea.BlockShimmer;
import net.divinerpg.blocks.vethea.BlockSmoothGlass;
import net.divinerpg.blocks.vethea.BlockVethea;
import net.divinerpg.blocks.vethea.BlockVetheaPlant;
import net.divinerpg.blocks.vethea.BlockWeedwoodVine;
import net.divinerpg.blocks.vethea.BlockWreckAltar;
import net.divinerpg.blocks.vethea.tileentities.TileEntityDreamLamp;
import net.divinerpg.blocks.vethea.tileentities.TileEntityInfusionTable;
import net.divinerpg.utils.helpers.config.VetheaConfigHelper;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class VetheaBlockHelper 
{
	public static Block vetheaPortal;
    public static Block dreamstone;
    public static Block dreamgrass;
    public static Block dreamdirt;
    public static Block dreamwood;
    public static Block dreamwoodLeaves;
    public static Block dreambricks;
    public static Block dreambricks2;
    public static Block lunastone;
    public static Block lunabricks;
    public static Block metalCaging;
    public static Block dreamlamp;
    public static Block dreamlampOn;
    public static Block weedwoodVine;
    public static Block blossomingWeedwoodVine;
    public static Block cryptWall;
    public static Block smoothGlass;
    public static Block villageLamp;
    public static Block infusionTable;
    public static Block cellLamp;
    public static Block barredDoor;
    public static Block firecrystal;
    public static Block firelight;
    public static Block hyrewood;
    public static Block mintwoodLeaves;
    public static Block firewall;
    public static Block karosHeatTileRed;
    public static Block karosHeatTileGreen;
    public static BlockKarosCannon karosCannon;
    public static BlockHelioticBeam helioticBeam;
    public static Block cryptFloor;
    public static Block firewood;
    public static Block bacterialAcid;
    public static Block blockAcid;
    public static Block hallWall;
    public static Block wreckAltar;
    public static Block raglokAltar;
    public static Block karosAltar;
    public static Block lunicAltar;
    public static Block hiveWall;
    public static Block quadroticAltar;
    public static Block everstone;
    public static Block lunicAcid;
    public static Block firewoodLeaves;
    public static Block hyrewoodLeaves;
    public static Block gemtopGreen;
    public static Block gemtopPurple;
    public static Block greenDulah;
    public static Block yellowDulah;
    public static Block mintwood;
    public static Block lightFirewoodLeaves;
    public static Block cracklespike;
    public static Block fernite;
    public static Block bulatobe;
    public static Block shineGrass;
    public static Block shimmer;
    public static Block dreamglow;
    public static Block hyrewoodVine;
    public static Block chamberWall;
    public static Block chamberWall1;
    public static Block chamberWall2;
    public static Block darkEverstone;
    public static Block whiteEverstone;
    public static Block karosBricks;
    public static Block karosBricks2;
    public static Block hungerstone1;
    public static Block hungerstone2;
    public static Block biphronSpawner;
    public static Block gorgosionSpawner;
    public static Block duoSpawner;
    public static Block twinsSpawner;
    public static Block vermenousSpawner;
    public static Block dreamwreckerSpawner;
    public static Block lorgaSpawner;
    public static Block purpleFire;
    
    public static Block moonBulbBase;
	
    public static void initBlocks()
	{
    	vetheaPortal = new BlockPortalVethea(VetheaConfigHelper.vetheaPortalID, "Vethea").setUnlocalizedName("Vethea Portal").setCreativeTab(CreativeTabHelper.tabBlocks);
    	dreamstone = new BlockVethea(VetheaConfigHelper.dreamstoneID, 9, Material.rock).setUnlocalizedName("dreamstone").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreamdirt = new BlockVethea(VetheaConfigHelper.dreamdirtID, 11, Material.ground).setUnlocalizedName("dreamdirt").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreamgrass = new BlockDreamgrass(VetheaConfigHelper.dreamgrassID).setUnlocalizedName("dreamgrass").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreamwood = new BlockDreamwood(VetheaConfigHelper.dreamwoodID).setUnlocalizedName("dreamwood").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreamwoodLeaves = new BlockDreamwoodLeaves(VetheaConfigHelper.dreamwoodLeavesID).setUnlocalizedName("dreamwoodLeaves").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreambricks = new BlockVethea(VetheaConfigHelper.dreambricksID, 25, Material.rock).setUnlocalizedName("dreambricks").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        lunastone = new BlockVethea(VetheaConfigHelper.lunastoneID, 27, Material.rock).setBlockUnbreakable().setUnlocalizedName("lunastone").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        lunabricks = new BlockVethea(VetheaConfigHelper.lunabricksID, 28, Material.rock).setBlockUnbreakable().setUnlocalizedName("lunabricks").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        metalCaging = new BlockVethea(VetheaConfigHelper.metalCagingID, 29, Material.rock).setUnlocalizedName("metalCaging").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreamlampOn = new BlockDreamLamp(VetheaConfigHelper.dreamlampOnID, 30, Material.glass, true).setBlockUnbreakable().setUnlocalizedName("dreamlampOn").setHardness(1F).setResistance(1F);
        dreamlamp = new BlockDreamLamp(VetheaConfigHelper.dreamlampID, 31, Material.glass, false).setBlockUnbreakable().setUnlocalizedName("dreamlamp").setHardness(1F).setStepSound(Block.soundGlassFootstep).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        weedwoodVine = new BlockWeedwoodVine(VetheaConfigHelper.weedwoodVineID, 41).setUnlocalizedName("weedwoodVine").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        blossomingWeedwoodVine = new BlockWeedwoodVine(VetheaConfigHelper.blossomingWeedwoodVineID, 42).setUnlocalizedName("blossomingWeedwoodVine").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        cryptWall = new BlockVethea(VetheaConfigHelper.cryptWallID, 43, Material.rock).setBlockUnbreakable().setUnlocalizedName("cryptWall").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        smoothGlass = new BlockSmoothGlass(VetheaConfigHelper.smoothGlassID, 44, Material.glass).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("smoothGlass").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        villageLamp = new BlockVethea(VetheaConfigHelper.villageLampID, 45, Material.glass).setUnlocalizedName("villageLamp").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        cellLamp = new BlockVethea(VetheaConfigHelper.cellLampID, 57, Material.glass).setUnlocalizedName("cellLamp").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        barredDoor = new BlockBarredDoor(VetheaConfigHelper.barredDoorID, Material.iron).setUnlocalizedName("barredDoor").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        firecrystal = new BlockVethea(VetheaConfigHelper.firecrystalID, 60, Material.glass).setLightValue(0.7F).setUnlocalizedName("firecrystal").setStepSound(Block.soundGlassFootstep).setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        firelight = new BlockVethea(VetheaConfigHelper.firelightID, 60, Material.glass).setUnlocalizedName("firelight").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setHardness(1F).setResistance(1.0F).setCreativeTab(CreativeTabHelper.tabBlocks);
        hyrewood = new BlockDreamwood(VetheaConfigHelper.hyrewoodID).setUnlocalizedName("hyrewood").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        mintwoodLeaves = new BlockDreamwoodLeaves(VetheaConfigHelper.mintwoodLeavesID).setUnlocalizedName("mintwoodLeaves").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        firewall = new BlockVethea(VetheaConfigHelper.firewallID, 73, Material.rock).setUnlocalizedName("firewall").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        karosHeatTileGreen = new BlockKarosHeatTileGreen(VetheaConfigHelper.karosHeatTileGreenID, false).setBlockUnbreakable().setUnlocalizedName("karosHeatTileGreen").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        karosHeatTileRed = new BlockKarosHeatTileRed(VetheaConfigHelper.karosHeatTileRedID, true).setBlockUnbreakable().setUnlocalizedName("karosHeatTileRed").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        firewood = new BlockDreamwood(VetheaConfigHelper.firewoodID).setUnlocalizedName("firewood").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        bacterialAcid = new BlockBacterialAcid(VetheaConfigHelper.bacterialAcidID).setUnlocalizedName("bacterialAcid").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        blockAcid = new BlockAcid(VetheaConfigHelper.blockAcidID).setUnlocalizedName("blockAcid").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        everstone = new BlockVethea(VetheaConfigHelper.everstoneID, 140, Material.rock).setBlockUnbreakable().setUnlocalizedName("everstone").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        lunicAcid = new BlockLunicAcid(VetheaConfigHelper.lunicAcidID, 141).setUnlocalizedName("lunicAcid").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        firewoodLeaves = new BlockDreamwoodLeaves(VetheaConfigHelper.firewoodLeavesID).setUnlocalizedName("firewoodLeaves").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        hyrewoodLeaves = new BlockDreamwoodLeaves(VetheaConfigHelper.hyrewoodLeavesID).setUnlocalizedName("hyrewoodLeaves").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        gemtopGreen = new BlockVetheaPlant(VetheaConfigHelper.gemtopGreenID).setUnlocalizedName("gemtopGreen").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        gemtopPurple = new BlockVetheaPlant(VetheaConfigHelper.gemtopPurpleID).setUnlocalizedName("gemtopPurple").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        yellowDulah = new BlockVetheaPlant(VetheaConfigHelper.yellowDulahID).setUnlocalizedName("yellowDulah").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        greenDulah = new BlockVetheaPlant(VetheaConfigHelper.greenDulahID).setUnlocalizedName("greenDulah").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        mintwood = new BlockDreamwood(VetheaConfigHelper.mintwoodID).setUnlocalizedName("mint").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        lightFirewoodLeaves = new BlockDreamwoodLeaves(VetheaConfigHelper.lightFirewoodLeavesID).setUnlocalizedName("lightFirewoodLeaves").setHardness(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        cracklespike = new BlockVetheaPlant(VetheaConfigHelper.cracklespikeID).setUnlocalizedName("cracklespike").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        fernite = new BlockVetheaPlant(VetheaConfigHelper.ferniteID).setUnlocalizedName("fernite").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        bulatobe = new BlockVetheaPlant(VetheaConfigHelper.bulatobeID).setUnlocalizedName("bulatobe").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        shineGrass = new BlockVetheaPlant(VetheaConfigHelper.shineGrassID).setUnlocalizedName("shineGrass").setLightValue(0.4F).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        shimmer = new BlockShimmer(VetheaConfigHelper.shimmerID).setLightValue(0.4F).setUnlocalizedName("shimmer").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        hiveWall = new BlockVethea(VetheaConfigHelper.hiveWallID, 127, Material.glass).setLightValue(0.533F).setUnlocalizedName("dreamlampOn").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreamglow = new BlockShimmer(VetheaConfigHelper.dreamglowID).setLightValue(0.4F).setUnlocalizedName("dreamglow").setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabHelper.tabHerb);
        hyrewoodVine = new BlockWeedwoodVine(VetheaConfigHelper.hyrewoodVineID, 175).setUnlocalizedName("hyrewoodVine").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        dreambricks2 = new BlockVethea(VetheaConfigHelper.dreambricks2ID, 26, Material.rock).setUnlocalizedName("dreambricks").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        chamberWall = new BlockVethea(VetheaConfigHelper.chamberWallID, 91, Material.rock).setBlockUnbreakable().setUnlocalizedName("chamberWall").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        chamberWall1 = new BlockVethea(VetheaConfigHelper.chamberWall1ID, 92, Material.rock).setBlockUnbreakable().setUnlocalizedName("chamberWall1").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        chamberWall2 = new BlockVethea(VetheaConfigHelper.chamberWall2ID, 93, Material.rock).setBlockUnbreakable().setUnlocalizedName("chamberWall2").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        whiteEverstone = new BlockVethea(VetheaConfigHelper.whiteEverstoneID, 139, Material.rock).setBlockUnbreakable().setUnlocalizedName("whiteEverstone").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        darkEverstone = new BlockVethea(VetheaConfigHelper.darkEverstoneID, 138, Material.rock).setBlockUnbreakable().setUnlocalizedName("darkEverstone").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        wreckAltar = new BlockWreckAltar(VetheaConfigHelper.wreckAltarID).setUnlocalizedName("wreckAltar").setBlockUnbreakable().setResistance(999F).setCreativeTab(CreativeTabHelper.tabBlocks);
        raglokAltar = new BlockRaglokAltar(VetheaConfigHelper.raglokAltarID).setUnlocalizedName("raglokAltar").setBlockUnbreakable().setResistance(999F).setCreativeTab(CreativeTabHelper.tabBlocks);
        karosAltar = new BlockKarosAltar(VetheaConfigHelper.karosAltarID).setUnlocalizedName("karosAltar").setBlockUnbreakable().setResistance(999F).setCreativeTab(CreativeTabHelper.tabBlocks);
        lunicAltar = new BlockLunicAltar(VetheaConfigHelper.lunicAltarID).setUnlocalizedName("lunicAltar").setBlockUnbreakable().setResistance(999F).setCreativeTab(CreativeTabHelper.tabBlocks);
        quadroticAltar = new BlockVethea(VetheaConfigHelper.quadroticAltarID, 137, Material.rock).setUnlocalizedName("quadroticAltar").setBlockUnbreakable().setResistance(999F).setCreativeTab(CreativeTabHelper.tabBlocks);
        infusionTable = new BlockInfusionTable(VetheaConfigHelper.infusionTableID).setBlockUnbreakable().setUnlocalizedName("infusionTable").setBlockUnbreakable().setResistance(999F).setCreativeTab(CreativeTabHelper.tabBlocks);
        hungerstone1 = new BlockVethea(VetheaConfigHelper.hungerstone1ID, 106, Material.rock).setUnlocalizedName("hungerstone1").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        hungerstone2 = new BlockVethea(VetheaConfigHelper.hungerstone2ID, 107, Material.rock).setUnlocalizedName("hungerstone2").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        cryptFloor = new BlockVethea(VetheaConfigHelper.cryptFloorID, 79, Material.rock).setBlockUnbreakable().setUnlocalizedName("cryptFloor").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        hallWall = new BlockVethea(VetheaConfigHelper.hallWallID, 109, Material.rock).setBlockUnbreakable().setUnlocalizedName("hallWall").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        karosBricks = new BlockVethea(VetheaConfigHelper.karosBricksID, 94, Material.rock).setBlockUnbreakable().setUnlocalizedName("karosBricks").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        karosBricks2 = new BlockVethea(VetheaConfigHelper.karosBricks2ID, 95, Material.rock).setBlockUnbreakable().setUnlocalizedName("karosBricks2").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        helioticBeam = (BlockHelioticBeam) new BlockHelioticBeam(VetheaConfigHelper.helioticBeamID).setUnlocalizedName("helioticBeam").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabBlocks);
        karosCannon = (BlockKarosCannon) new BlockKarosCannon(VetheaConfigHelper.karosCannonID, Material.rock).setBlockUnbreakable().setUnlocalizedName("karosCannon").setHardness(1F).setResistance(1F).setCreativeTab(CreativeTabHelper.tabUtility);
        purpleFire = new BlockPurpleFire(VetheaConfigHelper.purpleFireID).setUnlocalizedName("purpleFire").setCreativeTab(CreativeTabHelper.tabBlocks);
	
        initGameRegistryBlocks();
        addNames();
	}
    
    public static void initGameRegistryBlocks()
	{
    	GameRegistry.registerBlock((Block)vetheaPortal, "vetheaPortal");
        GameRegistry.registerBlock(everstone, "everstone");
        GameRegistry.registerBlock(whiteEverstone, "whiteEverstone");
        GameRegistry.registerBlock(darkEverstone, "darkEverstone");
        GameRegistry.registerBlock(dreamgrass, "dreamgrass");
        GameRegistry.registerBlock(dreamdirt, "dreamdirt");
        GameRegistry.registerBlock(dreamlampOn, "dreamlampOn");
        GameRegistry.registerBlock(dreamlamp, "dreamlamp");
        GameRegistry.registerBlock(firecrystal, "firecrystal");
        GameRegistry.registerBlock(hiveWall, "hiveWall");
        GameRegistry.registerBlock(hyrewood, "hyrewood");
        GameRegistry.registerBlock(firewood, "firewood");
        GameRegistry.registerBlock(mintwood, "mintwood");
        GameRegistry.registerBlock(dreamwood, "dreamwood");
        GameRegistry.registerBlock(hyrewoodLeaves, "hyrewoodLeaves");
        GameRegistry.registerBlock(firewoodLeaves, "firewoodLeaves");
        GameRegistry.registerBlock(mintwoodLeaves, "mintwoodLeaves");
        GameRegistry.registerBlock(dreamwoodLeaves, "dreamwoodLeaves");
        GameRegistry.registerBlock(infusionTable, "infusionTable");
        GameRegistry.registerTileEntity(TileEntityInfusionTable.class, "TeInfusionTable");
        GameRegistry.registerTileEntity(TileEntityDreamLamp.class, "TeDreamLamp");
        GameRegistry.registerBlock(purpleFire, "PurpleFire");
        GameRegistry.registerBlock(karosCannon, "karosCannon");
        GameRegistry.registerBlock(dreambricks, "dreambricks");
        GameRegistry.registerBlock(dreambricks2, "dreambricks2");
        GameRegistry.registerBlock(lunastone, "lunastone");
        GameRegistry.registerBlock(lunabricks, "lunabricks");
        GameRegistry.registerBlock(metalCaging, "metalCaging");
        GameRegistry.registerBlock(cryptWall, "cryptWall");
        GameRegistry.registerBlock(smoothGlass, "smoothGlass");
        GameRegistry.registerBlock(villageLamp, "villageLamp");
        GameRegistry.registerBlock(cellLamp, "cellLamp");
        GameRegistry.registerBlock(barredDoor, "barredDoor");
        GameRegistry.registerBlock(firelight, "firelight");
        GameRegistry.registerBlock(firewall, "firewall");
        GameRegistry.registerBlock(karosHeatTileRed, "karosHeatTileRed");
        GameRegistry.registerBlock(karosHeatTileGreen, "karosHeatTileGreen");
        GameRegistry.registerBlock(helioticBeam, "helioticBeam");
        GameRegistry.registerBlock(cryptFloor, "cryptFloor");
        GameRegistry.registerBlock(chamberWall, "chamberWall");
        GameRegistry.registerBlock(chamberWall1, "chamberWall1");
        GameRegistry.registerBlock(chamberWall2, "chamberWall2");
        
        GameRegistry.registerBlock(wreckAltar, "wreckAltar");
        GameRegistry.registerBlock(raglokAltar, "raglokAltar");
        GameRegistry.registerBlock(karosAltar, "karosAltar");
        GameRegistry.registerBlock(lunicAltar, "lunicAltar");
        GameRegistry.registerBlock(quadroticAltar, "quadroticAltar"); 
	}
    
    public static void addNames()
	{
    	LanguageRegistry.addName(dreamstone, "Dreamstone");
		LanguageRegistry.addName(dreamgrass, "Dream Grass");
		LanguageRegistry.addName(dreamdirt, "Dream Dirt");
		LanguageRegistry.addName(dreamwood, "Dreamwod");
		LanguageRegistry.addName(dreamwoodLeaves, "Dreamwood Leaves");
		LanguageRegistry.addName(dreambricks, "Dreambricks");
		LanguageRegistry.addName(dreambricks2, "Dreambricks");
		LanguageRegistry.addName(lunastone, "Lunastone");
		LanguageRegistry.addName(metalCaging, "Metal Caging");
		LanguageRegistry.addName(weedwoodVine, "Weedwood Vines");
		LanguageRegistry.addName(blossomingWeedwoodVine, "Blossoming Weedwood Vines");
		LanguageRegistry.addName(cryptWall, "Crypt Wall");
		LanguageRegistry.addName(smoothGlass, "Smooth Glass");
		LanguageRegistry.addName(villageLamp, "Altar Lamps");
		LanguageRegistry.addName(infusionTable, "Infusion Table");
		LanguageRegistry.addName(cellLamp, "Cell Lamp");
		LanguageRegistry.addName(barredDoor, "Barred Door");
		LanguageRegistry.addName(firecrystal, "Firecrystal");
		LanguageRegistry.addName(firelight, "Firelight");
		LanguageRegistry.addName(hyrewood, "Hyrewood");
		LanguageRegistry.addName(mintwoodLeaves, "Mintwood Leaves");
		LanguageRegistry.addName(firewall, "Firewall");
		LanguageRegistry.addName(karosHeatTileGreen, "Karos Heat Tile");
		LanguageRegistry.addName(karosHeatTileRed, "Karos Heat Tile");
		LanguageRegistry.addName(karosCannon, "Karos Cannon");
		LanguageRegistry.addName(helioticBeam, "Heliotic Beam");
		LanguageRegistry.addName(cryptFloor, "Crypt Floor");
		LanguageRegistry.addName(firewood, "Firewood");
		LanguageRegistry.addName(chamberWall, "Chamber Wall");
		LanguageRegistry.addName(chamberWall1, "Chamber Wall");
		LanguageRegistry.addName(chamberWall2, "Chamber Wall");
		LanguageRegistry.addName(karosBricks, "Karos Bricks");
		LanguageRegistry.addName(karosBricks2, "Karos Bricks");
		LanguageRegistry.addName(bacterialAcid, "Bacterial Acid");
		LanguageRegistry.addName(hungerstone1, "Hungerstone");
		LanguageRegistry.addName(hungerstone2, "Hungerstone");
		LanguageRegistry.addName(blockAcid, "Acid");
		LanguageRegistry.addName(hallWall, "Hall Wall");
		LanguageRegistry.addName(wreckAltar, "Wreck Altar");
		LanguageRegistry.addName(raglokAltar, "Raglok Altar");
		LanguageRegistry.addName(karosAltar, "Karos Altar");
		LanguageRegistry.addName(lunicAltar, "Lunic Altar");
		LanguageRegistry.addName(quadroticAltar, "Quadrotic Altar");
		LanguageRegistry.addName(hiveWall, "Hive Walls");
		LanguageRegistry.addName(darkEverstone, "Dark Everstone");
		LanguageRegistry.addName(whiteEverstone, "White Everstone");
		LanguageRegistry.addName(everstone, "Everstone");
		LanguageRegistry.addName(lunicAcid, "Lunic Acid");
		LanguageRegistry.addName(firewoodLeaves, "Firewood Leaves");
		LanguageRegistry.addName(hyrewoodLeaves, "Hyrewood Leaves");
		LanguageRegistry.addName(gemtopGreen, "Green Gemtops");
		LanguageRegistry.addName(gemtopPurple, "Purple Gemtops");
		LanguageRegistry.addName(yellowDulah, "Yellow Dulahs");
		LanguageRegistry.addName(greenDulah, "Green Dulahs");
		LanguageRegistry.addName(mintwood, "Mintwood");
		LanguageRegistry.addName(lightFirewoodLeaves, "Light Firewood Leaves");
		LanguageRegistry.addName(cracklespike, "Crackle Spikes");
		LanguageRegistry.addName(fernite, "Fernites");
		LanguageRegistry.addName(bulatobe, "Bulbatobes");
		LanguageRegistry.addName(shineGrass, "Shine Grass");
		LanguageRegistry.addName(shimmer, "Shimmers");
		LanguageRegistry.addName(dreamglow, "Dream Glows");
		LanguageRegistry.addName(hyrewoodVine, "Hyrewood Vines");
	}
}
