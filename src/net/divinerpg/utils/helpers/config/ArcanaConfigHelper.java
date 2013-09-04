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
		
		int id = 637;
		
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
    	key1ID = config.getItem("key1", 5407).getInt();
        key2ID = config.getItem("key2", 5408).getInt();
        key3ID = config.getItem("key3", 5409).getInt();
        key4ID = config.getItem("key4", 5410).getInt();
        oreDoorItem1ID = config.getItem("oredooritem", 5403).getInt();
        oreDoor2ItemID = config.getItem("oredooritem2", 5404).getInt();
        oreDoor3ItemID = config.getItem("oredooritem3", 5405).getInt();
        oreDoor4ItemID = config.getItem("oredooritem4", 5406).getInt();
        tarBucketID = config.getItem("tarbucket", 5333).getInt();
        hitchakItemID = config.getItem("hitchakItem", 5426).getInt();
        fireStockItemID = config.getItem("firestockitem", 5427).getInt();
        pinFlyItemID = config.getItem("pinflyItem", 5428).getInt();
        veiloItemID = config.getItem("veiloItem", 5429).getInt();
        lamonaItemID = config.getItem("lamonaItemID", 5430).getInt();
        aquamarineItemID = config.getItem("aquamarineItem", 5431).getInt();
        marsineItemID = config.getItem("marsineItem", 5432).getInt();
        hitchakSeedsID = config.getItem("hitchakSeeds", 5433).getInt();
        eucalyptusRootSeedsID = config.getItem("eucalyptusRootSeeds", 5434).getInt();
        veiloSeedsID = config.getItem("veiloSeeds", 5435).getInt();
        lamonaSeedsID = config.getItem("lamonaSeeds", 5436).getInt();
        aquamarineSeedsID = config.getItem("aquamarineSeeds", 5437).getInt();
        marsineSeedsID = config.getItem("marsineSeeds", 5438).getInt();
        pinFlySeedsID = config.getItem("pinflyseeds", 5439).getInt();
        fireStockSeedsID = config.getItem("firestockseeds", 5440).getInt();
        arcaniumID = config.getItem("arcanium", 5441).getInt();
        fyracryxSpawnerID = config.getItem("fyracryxSpawner", 5442).getInt();
        fireflyID = config.getItem("firefly", 5443).getInt();
        starfallID = config.getItem("starfall", 5444).getInt();
        reflectorID = config.getItem("reflector", 5450).getInt();
        stormSwordID = config.getItem("stormSword", 5451).getInt();
        staffOfStarlightID = config.getItem("staffOfStarlight", 5452).getInt();
        wraithbaneID = config.getItem("wraithbane", 5453).getInt();
        captiansSparklerID = config.getItem("captiansSparkler", 5454).getInt();
        shadowSwordID = config.getItem("shadowSword", 5455).getInt();
        enderScepterID = config.getItem("enderScepter", 5456).getInt();
        grenadeLauncherID = config.getItem("grenadeLauncher", 5457).getInt();
        grenadeID = config.getItem("grenade", 5458).getInt();
        meriksMissileID = config.getItem("meriksMissile", 5459).getInt();
        arcaniumSaberID = config.getItem("arcaniumSaber", 5460).getInt();
        paratikuSpawnerID = config.getItem("paratikuSpawner", 5461).getInt();
        seimerSpawnerID = config.getItem("seimerSpawner", 5462).getInt();
        golemOfRejuvSpawnerID = config.getItem("golemOfRejuvSpawner", 5463).getInt();
        dungeonTokenID = config.getItem("dungeonToken", 5464).getInt();
        liviciaSwordID = config.getItem("liviciaSword", 5465).getInt();
        vemosHeadID = config.getItem("vemoshead", 5470).getInt();
        vemosBodyID = config.getItem("vemosbody", 5471).getInt();
        vemosLegsID = config.getItem("vemoslegs", 5472).getInt();
        vemosBootsID = config.getItem("vemosboots", 5473).getInt();
        kormaHeadID = config.getItem("kormashead", 5474).getInt();
        kormaBodyID = config.getItem("kormabody", 5475).getInt();
        kormaLegsID = config.getItem("kormalegs", 5476).getInt();
        kormaBootsID = config.getItem("kormaboots", 5477).getInt();
        wizardBookID = config.getItem("wizardbook", 5478).getInt();
        arcaniumBucketID = config.getItem("arcaniumbucket", 5479).getInt();
        collectorID = config.getItem("collector", 5480).getInt();
        collectorFragmentsID = config.getItem("collectorfragments", 5481).getInt();
        orbOfLightID = config.getItem("orboflight", 5498).getInt();
        weakArcanaPotionID = config.getItem("weakarcanapotion", 5504).getInt();
        strongArcanaPotionID = config.getItem("strongarcanapotion", 5505).getInt();
        staffOfEnrichmentID = config.getItem("staffofenrichment", 5507).getInt();
        
	}
}
