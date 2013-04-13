package xolova.divinerpg.utils.helpers.config;

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
		
		dungeonLampID = config.getBlock("dungeonlight", 657).getInt();
        arcaniteTubesID = config.getBlock("arcaanitetubes", 658).getInt();
        arcaniteMetalID = config.getBlock("arcanitemetal", 659).getInt();
        soulSludgeID = config.getBlock("arcaniumsoulsludge", 660).getInt();
        soulStoneID = config.getBlock("soulstone", 661).getInt();
        degradedBricksID = config.getBlock("dungeonbricks", 662).getInt();
        heatTrapsID = config.getBlock("heattraps", 663).getInt();
        extractorID = config.getBlock("extractinator", 664).getInt();
        dramixAltarID = config.getBlock("dramixaltar", 665).getInt();
        parasectaAltarID = config.getBlock("phoenixaltar", 667).getInt();
        arcaniumOreID = config.getBlock("arcanaore", 668).getInt();
        arcaniumPowerID = config.getBlock("arcanapower", 669).getInt();
        oreDoor1ID = config.getBlock("oredoor1", 670).getInt();
        oreDoor2ID = config.getBlock("oredoor2", 671).getInt();
        oreDoor3ID = config.getBlock("oredoor3", 672).getInt();
        oreDoor4ID = config.getBlock("oredoor4", 673).getInt();
        ancientBricksID = config.getBlock("ancientbricks", 674).getInt();
        ancientTileID = config.getBlock("ancienttile", 675).getInt();
        ancientStoneID = config.getBlock("ancientstone", 717).getInt();
        pinFly2ID = config.getBlock("pinfly2", 733).getInt();
        fireStock2ID = config.getBlock("firestock2", 734).getInt();
        starBridgeID = config.getBlock("starbridge", 735).getInt();
        starBridgeOnID = config.getBlock("starbridgeon", 736).getInt();
        heatTrapsOnID = config.getBlock("heattrapson", 737).getInt();
        arcaniteRailsID = config.getBlock("arcaniterails", 738).getInt();
        arcanaPortalID = config.getBlock("arcanaportal", 739).getInt();
        arcanaPortalFrameID = config.getBlock("arcanaportalframe", 740).getInt();
        blockOfLightID = config.getBlock("airoflight", 751).getInt();
        arcanaSpawnerID = config.getBlock("arcanaspawner", 752).getInt();
        fireStockID = config.getBlock("fireStock", 682).getInt();
        pinFlyID =  config.getBlock("pinFly", 683).getInt();
        hitchakID = config.getBlock("hitchak", 684).getInt();
        eucalyptusRootID = config.getBlock("eucalyptusRoot", 685).getInt();
        veiloID = config.getBlock("veilo", 686).getInt();
        lamonaID = config.getBlock("lomona", 687).getInt();
        aquamarineID = config.getBlock("aquamarine", 688).getInt();
        marsineID = config.getBlock("marsine", 689).getInt();
        arcaniteGrassID = config.getBlock("arcanitegrass", 690).getInt();
        arcaniteDirtID = config.getBlock("arcanitedirt", 691).getInt();
        stainedGlassID = config.getBlock("stainedglass", 692).getInt();
        stainedGlass1ID = config.getBlock("stainedglass1", 693).getInt();
        stainedGlass2ID = config.getBlock("stainedglass2", 694).getInt();
        stainedGlass3ID = config.getBlock("stainedglass3", 695).getInt();
        stainedGlass4ID = config.getBlock("stainedglass4", 696).getInt();
        stainedGlass5ID = config.getBlock("stainedglass5", 697).getInt();
        stainedGlass6ID = config.getBlock("stainedglass6", 698).getInt();
        stainedGlass7ID = config.getBlock("stainedglass7", 699).getInt();
        moltenFurnaceID = config.getBlock("moltenfurnace", 705).getInt();
        greenlightFurnaceID = config.getBlock("greenlightfurnace", 706).getInt();
        oceanfireFurnaceID = config.getBlock("oceanfirefurnace", 707).getInt();
        moonlightFurnaceID = config.getBlock("moonlightfurnace", 708).getInt();
        whitefireFurnaceID = config.getBlock("whitefirefurnace", 709).getInt();
        demonFurnaceID = config.getBlock("demonfurnace", 715).getInt();
        arcanaSpawner1ID = config.getBlock("arcanaSpawner1", 773).getInt();
        arcanaSpawner2ID = config.getBlock("arcanaSpawner2", 770).getInt();
        arcanaSpawner3ID = config.getBlock("arcanaSpawner3", 771).getInt();
        arcanaSpawner4ID = config.getBlock("arcanaSpawner4", 772).getInt();
        arcanaSpawner5ID = config.getBlock("arcanaSpawner5", 774).getInt();
        
		
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
