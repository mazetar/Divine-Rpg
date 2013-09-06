package net.divinerpg.utils.helpers.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class VetheaConfigHelper 
{ 
    public static int teakerSwordID;
    public static int amthirmisSwordID;
    public static int darvenSwordID;
    public static int cermileSwordID;
    public static int pardimalSwordID;
    public static int quadroticSwordID;
    public static int karosSwordID;
    public static int heliosisSwordID;
    public static int arksianeSwordID;
    
    public static int teakerHammerID;
    public static int amthirmisHammerID;
    public static int darvenHammerID;
    public static int cermileHammerID;
    public static int pardimalHammerID;
    public static int quadroticHammerID;
    public static int karosHammerID;
    public static int heliosisHammerID;
    public static int arksianeHammerID;
    
    public static int teakerBowID;
    public static int amthirmisBowID;
    public static int darvenBowID;
    public static int cermileBowID;
    public static int pardimalBowID;
    public static int quadroticBowID;
    public static int karosBowID;
    public static int heliosisBowID;
    public static int arksianeBowID;
    
    public static int teakerCannonID;
    public static int amthirmisCannonID;
    public static int darvenCannonID;
    public static int cermileCannonID;
    public static int pardimalCannonID;
    public static int quadroticCannonID;
    public static int karosCannonItemID;
    public static int heliosisCannonID;
    public static int arksianeCannonID;
    
    public static int teakerClawID;
    public static int amthirmisClawID;
    public static int darvenClawID;
    public static int cermileClawID;
    public static int pardimalClawID;
    public static int quadroticClawID;
    public static int karosClawID;
    public static int heliosisClawID;
    public static int arksianeClawID;
    
    public static int teakerDiskID;
    public static int amthirmisDiskID;
    public static int darvenDiskID;
    public static int cermileDiskID;
    public static int pardimalDiskID;
    public static int quadroticDiskID;
    public static int karosDiskID;
    public static int heliosisDiskID;
    public static int arksianeDiskID;

    public static int acidfireID;
    public static int vetheanArrowID;
    public static int vetheanArrow2ID;
    public static int vetheanWarArrowID;
    public static int vetheanWrathArrowID;
    

    public static int vetheanHammerTemplateID;
    public static int vetheanBackswordTemplateID;
    public static int vetheanBowTemplateID;
    public static int vetheanCannonTemplateID;
    public static int vetheanClawTemplateID;
    public static int vetheanDiskTemplateID;
    public static int vetheanStaffTemplateID;

    public static int vetheanDegradedTemplateID;
    public static int vetheanFinishedTemplateID;
    public static int vetheanGlisteningTemplateID;
    public static int vetheanDemonizedTemplateID;
    public static int vetheanTormentedTemplateID;
    
    public static int honeysuckleID;
    public static int dreamCarrotID;
    public static int dreamMelonID;
    public static int dreamPieID;
    public static int dreamCakeID;
    
    public static int teakerLumpID;
    public static int amthirmisLumpID;
    public static int darvenLumpID;
    public static int cermileLumpID;
    public static int pardimalLumpID;
    public static int quadroticLumpID;
    public static int karosLumpID;
    public static int heliosisLumpID;
    public static int arksianeLumpID;

    public static int dreamSweetsID;
    public static int dreamSoursID;
    

    public static int degradedHelmetMeleeID;
    public static int degradedHelmetRangedID;
    public static int degradedHelmetArcanaID;
    public static int degradedChestID;
    public static int degradedLegsID;
    public static int degradedBootsID;

    public static int finishedHelmetMeleeID;
    public static int finishedHelmetRangedID;
    public static int finishedHelmetArcanaID;
    public static int finishedChestID;
    public static int finishedLegsID;
    public static int finishedBootsID;

    public static int glisteningHelmetMeleeID;
    public static int glisteningHelmetRangedID;
    public static int glisteningHelmetArcanaID;
    public static int glisteningChestID;
    public static int glisteningLegsID;
    public static int glisteningBootsID;

    public static int demonizedHelmetMeleeID;
    public static int demonizedHelmetRangedID;
    public static int demonizedHelmetArcanaID;
    public static int demonizedChestID;
    public static int demonizedLegsID;
    public static int demonizedBootsID;

    public static int tormentedHelmetMeleeID;
    public static int tormentedHelmetRangedID;
    public static int tormentedHelmetArcanaID;
    public static int tormentedChestID;
    public static int tormentedLegsID;
    public static int tormentedBootsID;
    

    public static int dirtyPearlsID;
    public static int cleanPearlsID;
    public static int polishedPearlsID;
    public static int shinyPearlsID;
    
    public static int honeychunkID;
    public static int rockChunksID;
    public static int fyrossomID;
    public static int heivaBeltID;
    public static int mooncloudID;
    public static int wormChunksID;
    public static int vhraakTeethID;
    
    public static int dreamflintID;
    public static int moonclockID;
    public static int spinebackChunkID;

    public static int spinebackCannonID;
    public static int spinebackDiscID;
    public static int spinebackHammerID;
    public static int spinebackStaffID;

    public static int everlightID;
    public static int everbrightID;
    public static int evernightID;
    public static int eversightID;
    public static int everfightID;

    public static int everArrowID;
    
    public static int teakerStaffID;
    public static int amthirmisStaffID;
    public static int darvenStaffID;
    public static int cermileStaffID;
    public static int pardimalStaffID;
    public static int quadroticStaffID;
    public static int karosStaffID;
    public static int heliosisStaffID;
    public static int arksianeStaffID;
    
    public static int ArcanaBarYoffset;
    
    public static int dreamPowderID;
    
    public static void initConfig(FMLPreInitializationEvent event)
	{
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGVethea.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		

        initConfigBlocks(event, config);
        int id = OverworldConfigHelper.nextItemID;
		teakerDiskID = config.getItem("TeakerDisk", id++).getInt();
        amthirmisDiskID = config.getItem("amthirmisDisk", id++).getInt();
        darvenDiskID = config.getItem("darvenDisk", id++).getInt();
        cermileDiskID = config.getItem("cermileDisk", id++).getInt();
        pardimalDiskID = config.getItem("pardimalDisk", id++).getInt();
        quadroticDiskID = config.getItem("quadroticDisk", id++).getInt();
        karosDiskID = config.getItem("karosDisk", id++).getInt();
        heliosisDiskID = config.getItem("heliosisDisk", id++).getInt();
        arksianeDiskID = config.getItem("arksianeDisk", id++).getInt();
        
        teakerHammerID = config.getItem("teakerHammer", id++).getInt();
        amthirmisHammerID = config.getItem("AmthirmisHammer", id++).getInt();
        darvenHammerID = config.getItem("darvenHammer", id++).getInt();
        cermileHammerID = config.getItem("cermileHammer", id++).getInt();
        pardimalHammerID = config.getItem("pardimalHammer", id++).getInt();
        quadroticHammerID = config.getItem("quadroticHammer", id++).getInt();
        karosHammerID = config.getItem("karosHammer", id++).getInt();
        heliosisHammerID = config.getItem("heliosisHammer", id++).getInt();
        arksianeHammerID = config.getItem("arksianeHammer", id++).getInt();
        
        teakerSwordID = config.getItem("teakerSword", id++).getInt();
        amthirmisSwordID = config.getItem("AmthirmisSword", id++).getInt();
        darvenSwordID = config.getItem("darvenSword", id++).getInt();
        cermileSwordID = config.getItem("cermileSword", id++).getInt();
        pardimalSwordID = config.getItem("pardimalSword", id++).getInt();
        quadroticSwordID = config.getItem("quadroticSword", id++).getInt();
        karosSwordID = config.getItem("karosSword", id++).getInt();
        heliosisSwordID = config.getItem("heliosisSword", id++).getInt();
        arksianeSwordID = config.getItem("arksianeSword", id++).getInt();
        
        teakerClawID = config.getItem("teakerClaw", id++).getInt();
        amthirmisClawID = config.getItem("AmthirmisClaw", id++).getInt();
        darvenClawID = config.getItem("darvenClaw", id++).getInt();
        cermileClawID = config.getItem("cermileClaw", id++).getInt();
        pardimalClawID = config.getItem("pardimalClaw", id++).getInt();
        quadroticClawID = config.getItem("quadroticClaw", id++).getInt();
        karosClawID = config.getItem("karosClaw", id++).getInt();
        heliosisClawID = config.getItem("heliosisClaw", id++).getInt();
        arksianeClawID = config.getItem("arksianeClaw", id++).getInt();
        
        teakerCannonID = config.getItem("teakerCannon", id++).getInt();
        amthirmisCannonID = config.getItem("AmthirmisCannon", id++).getInt();
        darvenCannonID = config.getItem("darvenCannon", id++).getInt();
        cermileCannonID = config.getItem("cermileCannon", id++).getInt();
        pardimalCannonID = config.getItem("pardimalCannon", id++).getInt();
        quadroticCannonID = config.getItem("quadroticCannon", id++).getInt();
        karosCannonItemID = config.getItem("karosCannon", id++).getInt();
        heliosisCannonID = config.getItem("heliosisCannon", id++).getInt();
        arksianeCannonID = config.getItem("arksianeCannon", id++).getInt();
        
        acidfireID = config.getItem("acidfire", id++).getInt();
        
        teakerBowID = config.getItem("teakerBow", id++).getInt();
        amthirmisBowID = config.getItem("AmthirmisBow", id++).getInt();
        darvenBowID = config.getItem("darvenBow", id++).getInt();
        cermileBowID = config.getItem("cermileBow", id++).getInt();
        pardimalBowID = config.getItem("pardimalBow", id++).getInt();
        quadroticBowID = config.getItem("quadroticBow", id++).getInt();
        karosBowID = config.getItem("karosBow", id++).getInt();
        heliosisBowID = config.getItem("heliosisBow", id++).getInt();
        arksianeBowID = config.getItem("arksianeBow", id++).getInt();

        vetheanArrowID = config.getItem("vetheanArrow", id++).getInt();
        vetheanArrow2ID = config.getItem("vetheanArrow2", id++).getInt();
        vetheanWarArrowID = config.getItem("vetheanWarArrow", id++).getInt();
        vetheanWrathArrowID = config.getItem("vetheanWrathArrow", id++).getInt();

        vetheanHammerTemplateID = config.getItem("vetheanHammerTemplate", id++).getInt();
        vetheanBackswordTemplateID = config.getItem("vetheanBackswordTemplate", id++).getInt();
        vetheanBowTemplateID = config.getItem("vetheanBowTemplate", id++).getInt();
        vetheanCannonTemplateID = config.getItem("vetheanCannonTemplate", id++).getInt();
        vetheanClawTemplateID = config.getItem("vetheanClawTemplate", id++).getInt();
        vetheanDiskTemplateID = config.getItem("vetheanDiskTemplate", id++).getInt();
        vetheanStaffTemplateID = config.getItem("vetheanStaffTemplate", id++).getInt();
        vetheanDegradedTemplateID = config.getItem("vetheanDegradedTemplate", id++).getInt();
        vetheanFinishedTemplateID = config.getItem("vetheanFinishedTemplate", id++).getInt();
        vetheanGlisteningTemplateID = config.getItem("vetheanGlisteningTemplate", id++).getInt();
        vetheanDemonizedTemplateID = config.getItem("vetheanDemonizedTemplate", id++).getInt();
        vetheanTormentedTemplateID = config.getItem("vetheanTormentedTemplate", id++).getInt();

        honeysuckleID = config.getItem("honeysuckle", id++).getInt();
        dreamCarrotID = config.getItem("dreamCarrot", id++).getInt();
        dreamMelonID = config.getItem("dreamMelon", id++).getInt();
        dreamPieID = config.getItem("dreamPie", id++).getInt();
        dreamCakeID = config.getItem("dreamCake", id++).getInt();
        
        teakerLumpID = config.getItem("teakerLump", id++).getInt();
        amthirmisLumpID = config.getItem("AmthirmisLump", id++).getInt();
        darvenLumpID = config.getItem("darvenLump", id++).getInt();
        cermileLumpID = config.getItem("cermileLump", id++).getInt();
        pardimalLumpID = config.getItem("pardimalLump", id++).getInt();
        quadroticLumpID = config.getItem("quadroticLump", id++).getInt();
        karosLumpID = config.getItem("karosLump", id++).getInt();
        heliosisLumpID = config.getItem("heliosisLump", id++).getInt();
        arksianeLumpID = config.getItem("arksianeLump", id++).getInt();

        dreamSweetsID = config.getItem("dreamSweets", id++).getInt();
        dreamSoursID = config.getItem("dreamSours", id++).getInt();
        
        degradedHelmetMeleeID = config.getItem("degradedHelmetMelee", id++).getInt();
        degradedHelmetRangedID = config.getItem("degradedHelmetRanged", id++).getInt();
        degradedHelmetArcanaID = config.getItem("degradedHelmetArcana", id++).getInt();
        degradedChestID = config.getItem("degradedChest", id++).getInt();
        degradedLegsID = config.getItem("degradedLegs", id++).getInt();
        degradedBootsID = config.getItem("degradedBoots", id++).getInt();

        finishedHelmetMeleeID = config.getItem("finishedHelmetMelee", id++).getInt();
        finishedHelmetRangedID = config.getItem("finishedHelmetRanged", id++).getInt();
        finishedHelmetArcanaID = config.getItem("finishedHelmetArcana", id++).getInt();
        finishedChestID = config.getItem("finishedChest", id++).getInt();
        finishedLegsID = config.getItem("finishedLegs", id++).getInt();
        finishedBootsID = config.getItem("finishedBoots", id++).getInt();

        glisteningHelmetMeleeID = config.getItem("glisteningHelmetMelee", id++).getInt();
        glisteningHelmetRangedID = config.getItem("glisteningHelmetRanged", id++).getInt();
        glisteningHelmetArcanaID = config.getItem("glisteningHelmetArcana", id++).getInt();
        glisteningChestID = config.getItem("glisteningChest", id++).getInt();
        glisteningLegsID = config.getItem("glisteningLegs", id++).getInt();
        glisteningBootsID = config.getItem("glisteningBoots", id++).getInt();

        demonizedHelmetMeleeID = config.getItem("demonizedHelmetMelee", id++).getInt();
        demonizedHelmetRangedID = config.getItem("demonizedHelmetRanged", id++).getInt();
        demonizedHelmetArcanaID = config.getItem("demonizedHelmetArcana", id++).getInt();
        demonizedChestID = config.getItem("demonizedChest", id++).getInt();
        demonizedLegsID = config.getItem("demonizedLegs", id++).getInt();
        demonizedBootsID = config.getItem("demonizedBoots", id++).getInt();

        tormentedHelmetMeleeID = config.getItem("tormentedHelmetMelee", id++).getInt();
        tormentedHelmetRangedID = config.getItem("tormentedHelmetRanged", id++).getInt();
        tormentedHelmetArcanaID = config.getItem("tormentedHelmetArcana", id++).getInt();
        tormentedChestID = config.getItem("tormentedChest", id++).getInt();
        tormentedLegsID = config.getItem("tormentedLegs", id++).getInt();
        tormentedBootsID = config.getItem("tormentedBoots", id++).getInt();

        dirtyPearlsID = config.getItem("dirtyPearls", id++).getInt();
        cleanPearlsID = config.getItem("cleanPearls", id++).getInt();
        polishedPearlsID = config.getItem("polishedPearls", id++).getInt();
        shinyPearlsID = config.getItem("shinyPearls", id++).getInt();

        honeychunkID = config.getItem("honeychunk", id++).getInt();
        rockChunksID = config.getItem("rockChunks", id++).getInt();
        fyrossomID = config.getItem("fyrossom", id++).getInt();
        heivaBeltID = config.getItem("heivaBelt", id++).getInt();
        mooncloudID = config.getItem("mooncloud", id++).getInt();
        wormChunksID = config.getItem("wormChunks", id++).getInt();
        vhraakTeethID = config.getItem("vhraakTeeth", id++).getInt();

        dreamflintID = config.getItem("dreamflint", id++).getInt();
        moonclockID = config.getItem("moonclock", id++).getInt();
        spinebackChunkID = config.getItem("spinebackChunk", id++).getInt();

        spinebackCannonID = config.getItem("spinebackCannon", id++).getInt();
        spinebackDiscID = config.getItem("spinebackDisc", id++).getInt();
        spinebackHammerID = config.getItem("spinebackHammer", id++).getInt();
        spinebackStaffID = config.getItem("spinebackStaff", id++).getInt();

        everlightID = config.getItem("everlight", id++).getInt();
        everbrightID = config.getItem("everbright", id++).getInt();
        evernightID = config.getItem("evernight", id++).getInt();
        eversightID = config.getItem("eversight", id++).getInt();
        everfightID = config.getItem("everfight", id++).getInt();
        everArrowID = config.getItem("everArrow", id++).getInt();

        teakerStaffID = config.getItem("teakerStaff", id++).getInt();
        amthirmisStaffID = config.getItem("AmthirmisStaff", id++).getInt();
        darvenStaffID = config.getItem("darvenStaff", id++).getInt();
        cermileStaffID = config.getItem("cermileStaff", id++).getInt();
        pardimalStaffID = config.getItem("pardimalStaff", id++).getInt();
        quadroticStaffID = config.getItem("quadroticStaff", id++).getInt();
        karosStaffID = config.getItem("karosStaff", id++).getInt();
        heliosisStaffID = config.getItem("heliosisStaff", id++).getInt();
        arksianeStaffID = config.getItem("arksianeStaff", id++).getInt();
        dreamPowderID = config.getItem("DreamPowder", id++).getInt();

        OverworldConfigHelper.nextItemID = id;
		
		config.save();
	}
	
    public static int vetheaPortalID;
    public static int dreamstoneID;
    public static int dreamgrassID;
    public static int dreamdirtID;
    public static int dreamwoodID;
    public static int dreamwoodLeavesID;
    public static int dreambricksID;
    public static int dreambricks2ID;
    public static int lunastoneID;
    public static int lunabricksID;
    public static int metalCagingID;
    public static int dreamlampID;
    public static int dreamlampOnID;
    public static int weedwoodVineID;
    public static int blossomingWeedwoodVineID;
    public static int cryptWallID;
    public static int smoothGlassID;
    public static int villageLampID;
    public static int infusionTableID;
    public static int cellLampID;
    public static int barredDoorID;
    public static int firecrystalID;
    public static int firelightID;
    public static int hyrewoodID;
    public static int mintwoodLeavesID;
    public static int firewallID;
    public static int karosHeatTileRedID;
    public static int karosHeatTileGreenID;
    public static int karosCannonID;
    public static int helioticBeamID;
    public static int cryptFloorID;
    public static int firewoodID;
    public static int bacterialAcidID;
    public static int blockAcidID;
    public static int hallWallID;
    public static int wreckAltarID;
    public static int raglokAltarID;
    public static int karosAltarID;
    public static int lunicAltarID;
    public static int hiveWallID;
    public static int quadroticAltarID;
    public static int everstoneID;
    public static int lunicAcidID;
    public static int firewoodLeavesID;
    public static int hyrewoodLeavesID;
    public static int gemtopGreenID;
    public static int gemtopPurpleID;
    public static int greenDulahID;
    public static int yellowDulahID;
    public static int mintwoodID;
    public static int lightFirewoodLeavesID;
    public static int cracklespikeID;
    public static int ferniteID;
    public static int bulatobeID;
    public static int shineGrassID;
    public static int shimmerID;
    public static int dreamglowID;
    public static int hyrewoodVineID;
    public static int chamberWallID;
    public static int chamberWall1ID;
    public static int chamberWall2ID;
    public static int darkEverstoneID;
    public static int whiteEverstoneID;
    public static int karosBricksID;
    public static int karosBricks2ID;
    public static int hungerstone1ID;
    public static int hungerstone2ID;
    public static int biphronSpawnerID;
    public static int gorgosionSpawnerID;
    public static int duoSpawnerID;
    public static int twinsSpawnerID;
    public static int vermenousSpawnerID;
    public static int dreamwreckerSpawnerID;
    public static int lorgaSpawnerID;
    public static int purpleFireID;
    
    public static void initConfigBlocks(FMLPreInitializationEvent event, Configuration config)
	{
        
        int id = OverworldConfigHelper.BLOCKID_NEXT;
        
    	dreamstoneID = config.getBlock("DreamStone", ++id).getInt();
    	dreamgrassID = config.getBlock("DreamGrass", ++id).getInt();
    	vetheaPortalID = config.getBlock("vetheaPortal", ++id).getInt();
        dreamwoodID = config.getBlock("dreamwood", ++id).getInt();
        dreamwoodLeavesID = config.getBlock("dreamwoodLeaves", ++id).getInt();
        dreambricksID = config.getBlock("dreambricks", ++id).getInt();
        lunastoneID = config.getBlock("lunastone", ++id).getInt();
        lunabricksID = config.getBlock("lunabricks", ++id).getInt();
        metalCagingID = config.getBlock("metalCaging", ++id).getInt();
        dreamlampID = config.getBlock("dreamlamp", ++id).getInt();
        dreamlampOnID = config.getBlock("dreamlampOn", ++id).getInt();
        weedwoodVineID = config.getBlock("weedwoodVine", ++id).getInt();
        blossomingWeedwoodVineID = config.getBlock("blossomingWeedwoodVine", ++id).getInt();
        cryptWallID = config.getBlock("cryptWall", ++id).getInt();
        smoothGlassID = config.getBlock("smoothGlass", ++id).getInt();
        villageLampID = config.getBlock("villageLamp", ++id).getInt();
        infusionTableID = config.getBlock("infusionTable", ++id).getInt();
        cellLampID = config.getBlock("cellLamp", ++id).getInt();
        barredDoorID = config.getBlock("barredDoor", ++id).getInt();
        firecrystalID = config.getBlock("firecrystal", ++id).getInt();
        firelightID = config.getBlock("firelight", ++id).getInt();
        hyrewoodID = config.getBlock("hyrewood", ++id).getInt();
        mintwoodLeavesID = config.getBlock("mintwoodLeaves", ++id).getInt();
        firewallID = config.getBlock("firewall", ++id).getInt();
        karosHeatTileRedID = config.getBlock("karosHeatTileRed", ++id).getInt();
        karosHeatTileGreenID = config.getBlock("karosHeatTileGreen", ++id).getInt();
        karosCannonID = config.getBlock("karosCannon", ++id).getInt();
        helioticBeamID = config.getBlock("helioticBeam", ++id).getInt();
        cryptFloorID = config.getBlock("cryptFloor", ++id).getInt();
        firewoodID = config.getBlock("firewood", ++id).getInt();
        chamberWallID = config.getBlock("chamberWall", ++id).getInt();
        chamberWall1ID = config.getBlock("chamberWall1", ++id).getInt();
        chamberWall2ID = config.getBlock("chamberWall2", ++id).getInt();
        bacterialAcidID = config.getBlock("bacterialAcid", ++id).getInt();
        gemtopPurpleID = config.getBlock("gemtops", ++id).getInt();
        yellowDulahID = config.getBlock("yellowDulah", ++id).getInt();
        blockAcidID = config.getBlock("acidBlock", ++id).getInt();
        hallWallID = config.getBlock("hallWall", ++id).getInt();
        wreckAltarID = config.getBlock("wreckAltar", ++id).getInt();
        raglokAltarID = config.getBlock("raglokAltar", ++id).getInt();
        karosAltarID = config.getBlock("karosAltar", ++id).getInt();
        lunicAltarID = config.getBlock("lunicAltar", ++id).getInt();
        hiveWallID = config.getBlock("hiveWall", ++id).getInt();
        quadroticAltarID = config.getBlock("quadroticAltar", ++id).getInt();
        everstoneID = config.getBlock("everstone", ++id).getInt();
        lunicAcidID = config.getBlock("lunicAcid", ++id).getInt();
        firewoodLeavesID = config.getBlock("firewoodLeaves", ++id).getInt();
        hyrewoodLeavesID = config.getBlock("hyrewoodLeaves", ++id).getInt();
        gemtopGreenID = config.getBlock("gemtopsGreen", ++id).getInt();
        greenDulahID = config.getBlock("greenDulah", ++id).getInt();
        mintwoodID = config.getBlock("mintwood", ++id).getInt();
        lightFirewoodLeavesID = config.getBlock("lightFirerwoodLeaves", ++id).getInt();
        cracklespikeID = config.getBlock("cracklespike", ++id).getInt();
        ferniteID = config.getBlock("fernite", ++id).getInt();
        bulatobeID = config.getBlock("bulatobe", ++id).getInt();
        shineGrassID = config.getBlock("shineGrass", ++id).getInt();
        shimmerID = config.getBlock("shimmer", ++id).getInt();
        dreamglowID = config.getBlock("dreamglow", ++id).getInt();
        hyrewoodVineID = config.getBlock("hyrewoodVine", ++id).getInt();
        dreambricks2ID = config.getBlock("dreambricks2", ++id).getInt();
        whiteEverstoneID = config.getBlock("whiteEverstone", ++id).getInt();
        darkEverstoneID = config.getBlock("darkEverstone", ++id).getInt();
        karosBricksID = config.getBlock("karosBricks", ++id).getInt();
        karosBricks2ID = config.getBlock("karosBricks2", ++id).getInt();
        

        biphronSpawnerID = config.getBlock("briphronSpawner", ++id).getInt();
        gorgosionSpawnerID = config.getBlock("gorgosionSpawner", ++id).getInt();
        twinsSpawnerID = config.getBlock("twinsSpawner", ++id).getInt();
        duoSpawnerID = config.getBlock("duoSpawner", ++id).getInt();
        vermenousSpawnerID = config.getBlock("vermenousSpawner", ++id).getInt();
        dreamwreckerSpawnerID = config.getBlock("dreamwreckerSpawner", ++id).getInt();
        lorgaSpawnerID = config.getBlock("lorgaSpawner", ++id).getInt();
        hungerstone1ID = config.getBlock("hungerstone1", ++id).getInt();
        hungerstone2ID = config.getBlock("hungerstone2", ++id).getInt();
        purpleFireID = config.getBlock("PurpleFire", ++id).getInt();
        
        dreamdirtID = config.getBlock("DreamDirt", ++id).getInt();
        
        OverworldConfigHelper.BLOCKID_NEXT = id;
	}
}
