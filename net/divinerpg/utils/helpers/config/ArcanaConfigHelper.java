package net.divinerpg.utils.helpers.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


public class ArcanaConfigHelper 
{
	public static int ancientBricksID;
	public static int degradedBricksID;
	public static int ancientStoneID;
	public static int soulStoneID;
	public static int soulSludgeID;

	public static int ancientTileID;
	public static int arcaniteMetalID;
	public static int dungeonLampID;
	public static int arcaniumPowerID;
	public static int extractorID;

	public static int heatTrapsID;
	public static int heatTrapsOnID;
	public static int arcanaPortalID;
	public static int arcanaPortalFrameID;
	public static int blockOfLightID;

	public static int arcaniumOreID;
	public static int oreDoor1ID;
	public static int oreDoor2ID;
	public static int oreDoor3ID;
	public static int oreDoor4ID;

	public static int dramixAltarID;
	public static int parasectaAltarID;
	
	public static int arcaniteRailsID;
	public static int starBridgeID;
	public static int starBridgeOnID;
	public static int arcaniteTubesID;
	
	public static int moltenFurnaceID;
	public static int greenlightFurnaceID;
	public static int oceanfireFurnaceID;
	public static int moonlightFurnaceID;
	public static int whitefireFurnaceID;
	public static int demonFurnaceID;
	
	public static int moltenFurnaceOnID;
	public static int greenlightFurnaceOnID;
	public static int oceanfireFurnaceOnID;
	public static int moonlightFurnaceOnID;
	public static int whitefireFurnaceOnID;
	public static int demonFurnaceOnID;
	
    public static int fireStockID;
    public static int fireStock2ID;
    public static int pinFlyID;
    public static int pinFly2ID;
    public static int hitchakID;
    public static int eucalyptusRootID;
    public static int veiloID;
    public static int lamonaID;
    public static int aquamarineID;
    public static int marsineID;
    public static int arcaniteGrassID;
    public static int arcaniteDirtID;

    public static int stainedGlassID;
    public static int stainedGlass1ID;
    public static int stainedGlass2ID;
    public static int stainedGlass3ID;
    public static int stainedGlass4ID;
    public static int stainedGlass5ID;
    public static int stainedGlass6ID;
    public static int stainedGlass7ID;

    public static int arcanaSpawnerID;
    public static int arcanaSpawner1ID;
    public static int arcanaSpawner2ID;
    public static int arcanaSpawner3ID;
    public static int arcanaSpawner4ID;
    public static int arcanaSpawner5ID;
    
    public static void initConfig(FMLPreInitializationEvent event)
	{
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGArcana.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		int id = OverworldConfigHelper.BLOCKID_NEXT;
		
		dungeonLampID = config.getBlock("dungeonlight", ++id).getInt();
        arcaniteTubesID = config.getBlock("arcaanitetubes", ++id).getInt();
        arcaniteMetalID = config.getBlock("arcanitemetal", ++id).getInt();
        soulSludgeID = config.getBlock("arcaniumsoulsludge", ++id).getInt();
        soulStoneID = config.getBlock("soulstone", ++id).getInt();
        degradedBricksID = config.getBlock("dungeonbricks", ++id).getInt();
        heatTrapsID = config.getBlock("heattraps", ++id).getInt();
        extractorID = config.getBlock("extractinator", ++id).getInt();
        dramixAltarID = config.getBlock("dramixaltar", ++id).getInt();
        parasectaAltarID = config.getBlock("phoenixaltar", ++id).getInt();
        arcaniumOreID = config.getBlock("arcanaore", ++id).getInt();
        arcaniumPowerID = config.getBlock("arcanapower", ++id).getInt();
        oreDoor1ID = config.getBlock("oredoor1", ++id).getInt();
        oreDoor2ID = config.getBlock("oredoor2", ++id).getInt();
        oreDoor3ID = config.getBlock("oredoor3", ++id).getInt();
        oreDoor4ID = config.getBlock("oredoor4", ++id).getInt();
        ancientBricksID = config.getBlock("ancientbricks", ++id).getInt();
        ancientTileID = config.getBlock("ancienttile", ++id).getInt();
        ancientStoneID = config.getBlock("ancientstone", ++id).getInt();
        pinFly2ID = config.getBlock("pinfly2", ++id).getInt();
        fireStock2ID = config.getBlock("firestock2", ++id).getInt();
        starBridgeID = config.getBlock("starbridge", ++id).getInt();
        starBridgeOnID = config.getBlock("starbridgeon", ++id).getInt();
        heatTrapsOnID = config.getBlock("heattrapson", ++id).getInt();
        arcaniteRailsID = config.getBlock("arcaniterails", ++id).getInt();
        arcanaPortalID = config.getBlock("arcanaportal", ++id).getInt();
        arcanaPortalFrameID = config.getBlock("arcanaportalframe", ++id).getInt();
        blockOfLightID = config.getBlock("airoflight", ++id).getInt();
        arcanaSpawnerID = config.getBlock("arcanaspawner", ++id).getInt();
        fireStockID = config.getBlock("fireStock", ++id).getInt();
        pinFlyID =  config.getBlock("pinFly", ++id).getInt();
        hitchakID = config.getBlock("hitchak", ++id).getInt();
        eucalyptusRootID = config.getBlock("eucalyptusRoot", ++id).getInt();
        veiloID = config.getBlock("veilo", ++id).getInt();
        lamonaID = config.getBlock("lomona", ++id).getInt();
        aquamarineID = config.getBlock("aquamarine", ++id).getInt();
        marsineID = config.getBlock("marsine", ++id).getInt();
        arcaniteGrassID = config.getBlock("arcanitegrass", ++id).getInt();
        arcaniteDirtID = config.getBlock("arcanitedirt", ++id).getInt();
        stainedGlassID = config.getBlock("stainedglass", ++id).getInt();
        stainedGlass1ID = config.getBlock("stainedglass1", ++id).getInt();
        stainedGlass2ID = config.getBlock("stainedglass2", ++id).getInt();
        stainedGlass3ID = config.getBlock("stainedglass3", ++id).getInt();
        stainedGlass4ID = config.getBlock("stainedglass4", ++id).getInt();
        stainedGlass5ID = config.getBlock("stainedglass5", ++id).getInt();
        stainedGlass6ID = config.getBlock("stainedglass6", ++id).getInt();
        stainedGlass7ID = config.getBlock("stainedglass7", ++id).getInt();
        moltenFurnaceID = config.getBlock("moltenfurnace", ++id).getInt();
        greenlightFurnaceID = config.getBlock("greenlightfurnace", ++id).getInt();
        oceanfireFurnaceID = config.getBlock("oceanfirefurnace", ++id).getInt();
        moonlightFurnaceID = config.getBlock("moonlightfurnace", ++id).getInt();
        whitefireFurnaceID = config.getBlock("whitefirefurnace", ++id).getInt();
        demonFurnaceID = config.getBlock("demonfurnace", ++id).getInt();
        arcanaSpawner1ID = config.getBlock("arcanaSpawner1", ++id).getInt();
        arcanaSpawner2ID = config.getBlock("arcanaSpawner2", ++id).getInt();
        arcanaSpawner3ID = config.getBlock("arcanaSpawner3", ++id).getInt();
        arcanaSpawner4ID = config.getBlock("arcanaSpawner4", ++id).getInt();
        arcanaSpawner5ID = config.getBlock("arcanaSpawner5", ++id).getInt();
        
        OverworldConfigHelper.BLOCKID_NEXT = id;
        
		initConfigItems(event, config);
		
		config.save();
	}
    
    public static int oreDoorItem1ID;
    public static int oreDoor2ItemID;
    public static int oreDoor3ItemID;
    public static int oreDoor4ItemID;
    public static int key1ID;
    public static int key2ID;
    public static int key3ID;
    public static int key4ID;
    public static int fireStockintID;
    public static int pinFlyintID;
    public static int hitchakintID;
    public static int veilointID;
    public static int lamonaintID;
    public static int aquamarineintID;
    public static int marsineintID;
    public static int hitchakSeedsID;
    public static int eucalyptusRootSeedsID;
    public static int veiloSeedsID;
    public static int lamonaSeedsID;
    public static int aquamarineSeedsID;
    public static int marsineSeedsID;
    public static int pinFlySeedsID;
    public static int fireStockSeedsID;
    public static int arcaniumID;
    public static int collectorID;
    public static int fyracryxSpawnerID;
    public static int fireflyID;
    public static int starfallID;
    public static int reflectorID;
    public static int stormSwordID;
    public static int staffOfStarlightID;
    public static int wraithbaneID;
    public static int captiansSparklerID;
    public static int shadowSwordID;
    public static int enderScepterID;
    public static int grenadeLauncherID;
    public static int grenadeID;
    public static int meriksMissileID;
    public static int arcaniumSaberID;
    public static int liviciaSwordID;
    public static int paratikuSpawnerID;
    public static int seimerSpawnerID;
    public static int golemOfRejuvSpawnerID;
    public static int dungeonTokenID;
    public static int weakArcanaPotionID;
    public static int strongArcanaPotionID;
    public static int arcanaMusicBoxID;
    public static int orbOfLightID;
    public static int tarBucketID;
    public static int santaHeadID;
    public static int santaBodyID;
    public static int santaLegsID;
    public static int santaBootsID;
    public static int collectorFragmentsID;
    public static int arcaniumBucketID;
    public static int staffOfEnrichmentID;
    public static int kormaHeadID;
    public static int kormaBodyID;
    public static int kormaLegsID;
    public static int kormaBootsID;
    public static int vemosHeadID;
    public static int vemosBodyID;
    public static int vemosLegsID;
    public static int vemosBootsID;
    public static int wizardBookID;
    public static int fireStockItemID;
    public static int pinFlyItemID;
    public static int hitchakItemID;
    public static int veiloItemID;
    public static int lamonaItemID;
    public static int aquamarineItemID;
    public static int marsineItemID;
    
    
    public static void initConfigItems(FMLPreInitializationEvent event, Configuration config)
	{ 
        int id = OverworldConfigHelper.nextItemID;
        
    	key1ID = config.getItem("key1", id++).getInt();
        key2ID = config.getItem("key2", id++).getInt();
        key3ID = config.getItem("key3", id++).getInt();
        key4ID = config.getItem("key4", id++).getInt();
        oreDoorItem1ID = config.getItem("oredooritem", id++).getInt();
        oreDoor2ItemID = config.getItem("oredooritem2", id++).getInt();
        oreDoor3ItemID = config.getItem("oredooritem3", id++).getInt();
        oreDoor4ItemID = config.getItem("oredooritem4", id++).getInt();
        tarBucketID = config.getItem("tarbucket", id++).getInt();
        hitchakItemID = config.getItem("hitchakItem", id++).getInt();
        fireStockItemID = config.getItem("firestockitem", id++).getInt();
        pinFlyItemID = config.getItem("pinflyItem", id++).getInt();
        veiloItemID = config.getItem("veiloItem", id++).getInt();
        lamonaItemID = config.getItem("lamonaItemID", id++).getInt();
        aquamarineItemID = config.getItem("aquamarineItem", id++).getInt();
        marsineItemID = config.getItem("marsineItem", id++).getInt();
        hitchakSeedsID = config.getItem("hitchakSeeds", id++).getInt();
        eucalyptusRootSeedsID = config.getItem("eucalyptusRootSeeds", id++).getInt();
        veiloSeedsID = config.getItem("veiloSeeds", id++).getInt();
        lamonaSeedsID = config.getItem("lamonaSeeds", id++).getInt();
        aquamarineSeedsID = config.getItem("aquamarineSeeds", id++).getInt();
        marsineSeedsID = config.getItem("marsineSeeds", id++).getInt();
        pinFlySeedsID = config.getItem("pinflyseeds", id++).getInt();
        fireStockSeedsID = config.getItem("firestockseeds", id++).getInt();
        arcaniumID = config.getItem("arcanium", id++).getInt();
        fyracryxSpawnerID = config.getItem("fyracryxSpawner", id++).getInt();
        fireflyID = config.getItem("firefly", id++).getInt();
        starfallID = config.getItem("starfall", id++).getInt();
        reflectorID = config.getItem("reflector", id++).getInt();
        stormSwordID = config.getItem("stormSword", id++).getInt();
        staffOfStarlightID = config.getItem("staffOfStarlight", id++).getInt();
        wraithbaneID = config.getItem("wraithbane", id++).getInt();
        captiansSparklerID = config.getItem("captiansSparkler", id++).getInt();
        shadowSwordID = config.getItem("shadowSword", id++).getInt();
        enderScepterID = config.getItem("enderScepter", id++).getInt();
        grenadeLauncherID = config.getItem("grenadeLauncher", id++).getInt();
        grenadeID = config.getItem("grenade", id++).getInt();
        meriksMissileID = config.getItem("meriksMissile", id++).getInt();
        arcaniumSaberID = config.getItem("arcaniumSaber", id++).getInt();
        paratikuSpawnerID = config.getItem("paratikuSpawner", id++).getInt();
        seimerSpawnerID = config.getItem("seimerSpawner", id++).getInt();
        golemOfRejuvSpawnerID = config.getItem("golemOfRejuvSpawner", id++).getInt();
        dungeonTokenID = config.getItem("dungeonToken", id++).getInt();
        liviciaSwordID = config.getItem("liviciaSword", id++).getInt();
        vemosHeadID = config.getItem("vemoshead", id++).getInt();
        vemosBodyID = config.getItem("vemosbody", id++).getInt();
        vemosLegsID = config.getItem("vemoslegs", id++).getInt();
        vemosBootsID = config.getItem("vemosboots", id++).getInt();
        kormaHeadID = config.getItem("kormashead", id++).getInt();
        kormaBodyID = config.getItem("kormabody", id++).getInt();
        kormaLegsID = config.getItem("kormalegs", id++).getInt();
        kormaBootsID = config.getItem("kormaboots", id++).getInt();
        wizardBookID = config.getItem("wizardbook", id++).getInt();
        arcaniumBucketID = config.getItem("arcaniumbucket", id++).getInt();
        collectorID = config.getItem("collector", id++).getInt();
        collectorFragmentsID = config.getItem("collectorfragments", id++).getInt();
        orbOfLightID = config.getItem("orboflight", id++).getInt();
        weakArcanaPotionID = config.getItem("weakarcanapotion", id++).getInt();
        strongArcanaPotionID = config.getItem("strongarcanapotion", id++).getInt();
        staffOfEnrichmentID = config.getItem("staffofenrichment", id++).getInt();
        
        OverworldConfigHelper.nextItemID = id;
        
	}
}
