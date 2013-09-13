package net.divinerpg.utils.helpers.item;

import net.divinerpg.items.ItemDivine;
import net.divinerpg.items.arcana.ItemAquaMarine;
import net.divinerpg.items.arcana.ItemArcanaPotion;
import net.divinerpg.items.arcana.ItemArcaniumSaber;
import net.divinerpg.items.arcana.ItemArmorKorma;
import net.divinerpg.items.arcana.ItemArmorVemos;
import net.divinerpg.items.arcana.ItemCaptiansSparkeler;
import net.divinerpg.items.arcana.ItemEnderScepter;
import net.divinerpg.items.arcana.ItemFirefly;
import net.divinerpg.items.arcana.ItemFyracryxSpawner;
import net.divinerpg.items.arcana.ItemGolemOfRejuvSpawner;
import net.divinerpg.items.arcana.ItemGrenade;
import net.divinerpg.items.arcana.ItemGrenadeLauncher;
import net.divinerpg.items.arcana.ItemKey;
import net.divinerpg.items.arcana.ItemLamona;
import net.divinerpg.items.arcana.ItemLiviciaSword;
import net.divinerpg.items.arcana.ItemMeriksMissile;
import net.divinerpg.items.arcana.ItemOrbOfLight;
import net.divinerpg.items.arcana.ItemOreDoor;
import net.divinerpg.items.arcana.ItemParatikuSpawner;
import net.divinerpg.items.arcana.ItemPinFly;
import net.divinerpg.items.arcana.ItemReflector;
import net.divinerpg.items.arcana.ItemSeimerSpawner;
import net.divinerpg.items.arcana.ItemShadowSword;
import net.divinerpg.items.arcana.ItemStaffOfEnrichment;
import net.divinerpg.items.arcana.ItemStarfall;
import net.divinerpg.items.arcana.ItemStormSword;
import net.divinerpg.items.arcana.ItemTarBucket;
import net.divinerpg.items.arcana.ItemWizardBook;
import net.divinerpg.items.arcana.ItemWraithbane;
import net.divinerpg.items.core.ItemDivineRPGFood;
import net.divinerpg.items.core.DivineSeeds;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArcanaItemHelper 
{
    public static Item oreDoorItem1;
    public static Item oreDoorItem2;
    public static Item oreDoorItem3;
    public static Item oreDoorItem4;
    public static Item key1;
    public static Item key2;
    public static Item key3;
    public static Item key4;
    public static Item fireStockItem;
    public static Item pinFlyItem;
    public static Item hitchakItem;
    public static Item veiloItem;
    public static Item lamonaItem;
    public static Item aquamarineItem;
    public static Item marsineItem;
    public static Item hitchakSeeds;
    public static Item eucalyptusRootSeeds;
    public static Item veiloSeeds;
    public static Item lamonaSeeds;
    public static Item aquamarineSeeds;
    public static Item marsineSeeds;
    public static Item pinFlySeeds;
    public static Item fireStockSeeds;
    public static Item arcanium;
    public static Item collector;
    public static Item fyracryxSpawner;
    public static Item firefly;
    public static Item starfall;
    public static Item reflector;
    public static Item stormSword;
    public static Item staffOfStarlight;
    public static Item wraithbane;
    public static Item captiansSparkler;
    public static Item shadowSword;
    public static Item enderScepter;
    public static Item grenadeLauncher;
    public static Item grenade;
    public static Item meriksMissile;
    public static Item arcaniumSaber;
    public static Item liviciaSword;
    public static Item paratikuSpawner;
    public static Item seimerSpawner;
    public static Item golemOfRejuvSpawner;
    public static Item dungeonToken;
    public static Item weakArcanaPotion;
    public static Item strongArcanaPotion;
    public static Item orbOfLight;
    public static Item tarBucket;
    public static Item collectorFragments;
    public static Item arcaniumBucket;
    public static Item staffOfEnrichment;
    public static Item kormaHelmet;
    public static Item kormaBody;
    public static Item kormaLegs;
    public static Item kormaBoots;
    public static Item vemosHelmet;
    public static Item vemosBody;
    public static Item vemosLegs;
    public static Item vemosBoots;
    public static Item wizardBook;
    
    public static ArcanaConfigHelper cfg;
    
	public static void init()
	{
		weakArcanaPotion = new ItemArcanaPotion(cfg.weakArcanaPotionID).func_111206_d("weakArcanaPotion");
		strongArcanaPotion = new ItemArcanaPotion(cfg.strongArcanaPotionID).func_111206_d("oreDoor4Item");
		
		oreDoorItem1 = new ItemOreDoor(cfg.oreDoorItem1ID, Material.wood, ArcanaBlockHelper.oreDoor1).func_111206_d("OreDoor1").setUnlocalizedName("doorWood1").setCreativeTab(DivineTabs.tabItems);
		oreDoorItem2 = new ItemOreDoor(cfg.oreDoor2ItemID, Material.wood, ArcanaBlockHelper.oreDoor2).func_111206_d("OreDoor2").setUnlocalizedName("doorWood2").setCreativeTab(DivineTabs.tabItems);
		oreDoorItem3 = new ItemOreDoor(cfg.oreDoor3ItemID, Material.wood, ArcanaBlockHelper.oreDoor3).func_111206_d("OreDoor3").setUnlocalizedName("doorWood3").setCreativeTab(DivineTabs.tabItems);
		oreDoorItem4 = new ItemOreDoor(cfg.oreDoor4ItemID, Material.wood, ArcanaBlockHelper.oreDoor4).func_111206_d("OreDoor4").setUnlocalizedName("doorWood4").setCreativeTab(DivineTabs.tabItems);
		key1 = new ItemKey(cfg.key1ID).func_111206_d("Key1").setUnlocalizedName("key1").setCreativeTab(DivineTabs.tabItems);
	    key2 = new ItemKey(cfg.key2ID).func_111206_d("Key2").setUnlocalizedName("key2").setCreativeTab(DivineTabs.tabItems);
	    key3 = new ItemKey(cfg.key3ID).func_111206_d("Key3").setUnlocalizedName("key3").setCreativeTab(DivineTabs.tabItems);
	    key4 = new ItemKey(cfg.key4ID).func_111206_d("Key4").setUnlocalizedName("key4").setCreativeTab(DivineTabs.tabItems);
	    
	    fireStockItem = new ItemDivine(cfg.fireStockItemID).func_111206_d("FireStockItem").setUnlocalizedName("fireStockItem").setCreativeTab(DivineTabs.tabHerb);
        fireStockSeeds = new DivineSeeds(cfg.fireStockSeedsID, ArcanaBlockHelper.fireStock.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("FireStockSeeds").setUnlocalizedName("fireStockSeeds").setCreativeTab(DivineTabs.tabHerb);
        pinFlyItem = new ItemPinFly(cfg.pinFlyItemID, 2, 0.3F, false).setUnlocalizedName("pinflyItem").setCreativeTab(DivineTabs.tabHerb);
        pinFlySeeds = new DivineSeeds(cfg.pinFlySeedsID, ArcanaBlockHelper.pinFly.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("PinFlySeeds").setUnlocalizedName("pinFlySeeds").setCreativeTab(DivineTabs.tabHerb);
        hitchakItem = new ItemDivineRPGFood(cfg.hitchakItemID, 2, 3.0F, false).setUnlocalizedName("hitchakItem").setCreativeTab(DivineTabs.tabHerb);
        hitchakSeeds = new DivineSeeds(cfg.hitchakSeedsID, ArcanaBlockHelper.hitchak.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("HitchakSeeds").setUnlocalizedName("hitchakSeeds").setCreativeTab(DivineTabs.tabHerb);
        eucalyptusRootSeeds = new DivineSeeds(cfg.eucalyptusRootSeedsID, ArcanaBlockHelper.eucalyptusRoot.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("EucalyptusRootSeeds").setUnlocalizedName("eucalyptusRootSeeds").setCreativeTab(DivineTabs.tabHerb);
        veiloItem = new ItemDivine(cfg.veiloItemID).func_111206_d("VeiloItem").setUnlocalizedName("veiloItem").setCreativeTab(DivineTabs.tabHerb);
        veiloSeeds = new DivineSeeds(cfg.veiloSeedsID, ArcanaBlockHelper.veilo.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("VeiloSeeds").setUnlocalizedName("veiloSeeds").setCreativeTab(DivineTabs.tabHerb);
        lamonaItem = new ItemLamona(cfg.lamonaItemID).func_111206_d("LamonaItem").setUnlocalizedName("lamonaItem").setCreativeTab(DivineTabs.tabHerb);
        lamonaSeeds = new DivineSeeds(cfg.lamonaSeedsID, ArcanaBlockHelper.lamona.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("LamonaSeeds").setUnlocalizedName("lamonaSeeds").setCreativeTab(DivineTabs.tabHerb);
        aquamarineItem = new ItemAquaMarine(cfg.aquamarineItemID).func_111206_d("AquamarineItem").setUnlocalizedName("aquamarineItem").setCreativeTab(DivineTabs.tabHerb);
        aquamarineSeeds = new DivineSeeds(cfg.aquamarineSeedsID, ArcanaBlockHelper.aquamarine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("AquamarineSeeds").setUnlocalizedName("aquamarineSeeds").setCreativeTab(DivineTabs.tabHerb);
        marsineItem = new ItemDivine(cfg.marsineItemID).func_111206_d("MarsineItem").setUnlocalizedName("marsineItem").setCreativeTab(DivineTabs.tabHerb);
        marsineSeeds = new DivineSeeds(cfg.marsineSeedsID, ArcanaBlockHelper.marsine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).func_111206_d("MarsineSeeds" ).setUnlocalizedName("marsineSeeds").setCreativeTab(DivineTabs.tabHerb);
        reflector = new ItemReflector(cfg.reflectorID).func_111206_d("Reflector").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("reflector");
        arcanium = new ItemDivine(cfg.arcaniumID).func_111206_d("Arcanium").setUnlocalizedName("Arcanium");
        fyracryxSpawner = new ItemFyracryxSpawner(ArcanaConfigHelper.fyracryxSpawnerID).func_111206_d("FrozenSpawner").setUnlocalizedName("fyracryxSpawner").setCreativeTab(DivineTabs.tabSpawner);
        paratikuSpawner = new ItemParatikuSpawner(ArcanaConfigHelper.paratikuSpawnerID).func_111206_d("FrozenSpawner").setUnlocalizedName("paratikuSpawner").setCreativeTab(DivineTabs.tabSpawner);
        seimerSpawner = new ItemSeimerSpawner(ArcanaConfigHelper.seimerSpawnerID).func_111206_d("FrozenSpawner").setUnlocalizedName("seimerSpawner").setCreativeTab(DivineTabs.tabSpawner);
        golemOfRejuvSpawner = new ItemGolemOfRejuvSpawner(ArcanaConfigHelper.golemOfRejuvSpawnerID).func_111206_d("FrozenSpawner").setUnlocalizedName("golemOfRejuvSpawner").setCreativeTab(DivineTabs.tabSpawner);
        
        EnumToolMaterial arcanaSword = EnumHelper.addToolMaterial("arcanic", 1, -1, 1, 1, 22);
        
        stormSword = new ItemStormSword(cfg.stormSwordID, arcanaSword).func_111206_d("StormSword").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("stormSword");
        shadowSword = new ItemShadowSword(cfg.shadowSwordID, arcanaSword).func_111206_d("ShadowSword").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("shadowSword");
        arcaniumSaber = new ItemArcaniumSaber(cfg.arcaniumSaberID, arcanaSword).func_111206_d("ArcaniumSaber").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("arcaniumSaber");
        liviciaSword = new ItemLiviciaSword(cfg.liviciaSwordID, arcanaSword).func_111206_d("LiviciaSword").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("liviciaSword");
        
        staffOfStarlight = new ItemStarfall(cfg.staffOfStarlightID).func_111206_d("StaffOfStarlight").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("staffOfStarlight");
        wraithbane = new ItemWraithbane(cfg.wraithbaneID).func_111206_d("Wraithbane").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("wraithbane");
        captiansSparkler = new ItemCaptiansSparkeler(cfg.captiansSparklerID).func_111206_d("CaptiansSparkler").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("captiansSparkler");
        enderScepter = new ItemEnderScepter(cfg.enderScepterID).func_111206_d("EnderScepter").setUnlocalizedName("enderScepter").setCreativeTab(DivineTabs.tabSword);
        grenadeLauncher = new ItemGrenadeLauncher(cfg.grenadeLauncherID, 3).func_111206_d("GrenadeLauncher").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("grenadeLauncher");
        grenade = new ItemGrenade(cfg.grenadeID, 3).func_111206_d("Grenade").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("grenade");
        meriksMissile = new ItemMeriksMissile(cfg.meriksMissileID, 0, 0, true).func_111206_d("MeriksMissile").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("meriksMissile");
        firefly = new ItemFirefly(cfg.fireflyID).func_111206_d("Firefly").setUnlocalizedName("firefly").setCreativeTab(DivineTabs.tabRanged);
        starfall = new ItemStarfall(cfg.starfallID).func_111206_d("Starfall").setUnlocalizedName("starfall").setCreativeTab(DivineTabs.tabRanged);
        dungeonToken = new ItemDivine(cfg.dungeonTokenID).func_111206_d("DungeonToken").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("dungeonToken");
        collector = new ItemDivine(cfg.collectorID).func_111206_d("Collector").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("collector");
        collectorFragments = new ItemDivine (cfg.collectorFragmentsID).func_111206_d("CollectorFragments").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("collectorFragment");
        arcaniumBucket = new ItemTarBucket(cfg.arcaniumBucketID, 0).func_111206_d("ArcaniumBucket").setUnlocalizedName("arcaniumBucket").setCreativeTab(DivineTabs.tabItems);
        staffOfEnrichment = new ItemStaffOfEnrichment(cfg.staffOfEnrichmentID).func_111206_d("StaffOfEnrichment").setUnlocalizedName("staffOfEnrichment").setCreativeTab(DivineTabs.tabTool);
        orbOfLight = new ItemOrbOfLight(cfg.orbOfLightID).func_111206_d("OrbOfLight");
        wizardBook = new ItemWizardBook(cfg.wizardBookID).func_111206_d("WizardBook").setUnlocalizedName("WizardBook");
        
        int kormaRender = RenderingRegistry.addNewArmourRendererPrefix("korma");
        kormaHelmet = new ItemArmorKorma(cfg.kormaHeadID, "korma", kormaRender, 0).func_111206_d("kormaHelmet").setUnlocalizedName("kormaHelmet").setCreativeTab(DivineTabs.tabArmor);
        kormaBody = new ItemArmorKorma(cfg.kormaBodyID, "korma", kormaRender, 1).func_111206_d("KormaBody").setUnlocalizedName("kormaBody").setCreativeTab(DivineTabs.tabArmor);
        kormaLegs = new ItemArmorKorma(cfg.kormaLegsID, "korma", kormaRender, 2).func_111206_d("KormaLegs").setUnlocalizedName("kormaLegs").setCreativeTab(DivineTabs.tabArmor);
        kormaBoots = new ItemArmorKorma(cfg.kormaBootsID, "korma", kormaRender, 3).func_111206_d("KormaBoots").setUnlocalizedName("kormaBoots").setCreativeTab(DivineTabs.tabArmor);
        
        int vemosRender = RenderingRegistry.addNewArmourRendererPrefix("vemos");
        vemosHelmet = new ItemArmorVemos(cfg.vemosHeadID, vemosRender, 0).func_111206_d("vemosHelmet").setUnlocalizedName("vemosHelmet").setCreativeTab(DivineTabs.tabArmor);
        vemosBody = new ItemArmorVemos(cfg.vemosBodyID, vemosRender, 1).func_111206_d("VemosBody").setUnlocalizedName("vemosBody").setCreativeTab(DivineTabs.tabArmor);
        vemosLegs = new ItemArmorVemos(cfg.vemosLegsID, vemosRender, 2).func_111206_d("VemosLegs").setUnlocalizedName("vemosLegs").setCreativeTab(DivineTabs.tabArmor);
        vemosBoots = new ItemArmorVemos(cfg.vemosBootsID, vemosRender, 3).func_111206_d("VemosBoots").setUnlocalizedName("vemosBoots").setCreativeTab(DivineTabs.tabArmor);
        
        //tarBucket = new ItemTarBucket(x.tarBucketID, OverworldBlockHelper.tarStill.blockID).setUnlocalizedName("tarBucket").setCreativeTab(CreativeTabHelper.tabItems);
        addNames();
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(oreDoorItem1, "Locked Door");
		LanguageRegistry.addName(oreDoorItem2, "Locked Door");
		LanguageRegistry.addName(oreDoorItem3, "Locked Door");
		LanguageRegistry.addName(oreDoorItem4, "Locked Door");

		LanguageRegistry.addName(key1, "Key");
		LanguageRegistry.addName(key2, "Key");
		LanguageRegistry.addName(key3, "Key");
		LanguageRegistry.addName(key4, "Key");

		LanguageRegistry.addName(fireStockItem, "Firestock");
		LanguageRegistry.addName(fireStockSeeds, "Firestock Seeds");
		LanguageRegistry.addName(pinFlyItem, "Pinfly");
		LanguageRegistry.addName(pinFlySeeds, "Pinfly Seeds");
		LanguageRegistry.addName(hitchakItem, "Hitchak");
		LanguageRegistry.addName(hitchakSeeds, "Hitchak Seeds");
		LanguageRegistry.addName(eucalyptusRootSeeds, "Eucalyptus Root Seeds");
		LanguageRegistry.addName(veiloItem, "Veilo");
		LanguageRegistry.addName(veiloSeeds, "Veilo Seeds");
		LanguageRegistry.addName(lamonaItem, "Lamona");
		LanguageRegistry.addName(lamonaSeeds, "Lamona Seeds");
		LanguageRegistry.addName(aquamarineItem, "Aquamarine");
		LanguageRegistry.addName(aquamarineSeeds, "Aquamarine Seeds");
		LanguageRegistry.addName(marsineItem, "Marasine");
		LanguageRegistry.addName(marsineSeeds, "Marasine Seeds");
		
		LanguageRegistry.addName(fyracryxSpawner, "Fyracryx Egg");
		LanguageRegistry.addName(paratikuSpawner, "Paratiku Egg");
		LanguageRegistry.addName(seimerSpawner, "Seimer Egg");
		LanguageRegistry.addName(golemOfRejuvSpawner, "Golem of Rejuvination Egg");
		
		LanguageRegistry.addName(reflector, "Arcanium Reflector");
		LanguageRegistry.addName(stormSword, "Storm Sword");
		LanguageRegistry.addName(shadowSword, "Shadow Sword");
		LanguageRegistry.addName(arcaniumSaber, "Arcanium Saber");
		LanguageRegistry.addName(liviciaSword, "Livicia Sword");
		LanguageRegistry.addName(staffOfStarlight, "Staff of Starlight");
		LanguageRegistry.addName(wraithbane, "Wraithbane");
		LanguageRegistry.addName(captiansSparkler, "Captain's Sparkler");
		LanguageRegistry.addName(firefly, "Firefly");
		LanguageRegistry.addName(starfall, "Starlight");
		LanguageRegistry.addName(grenade, "Grenade");
		LanguageRegistry.addName(grenadeLauncher, "La Vekor");
		LanguageRegistry.addName(meriksMissile, "Merik's Missile");
		LanguageRegistry.addName(enderScepter, "Ender Scepter");
		LanguageRegistry.addName(orbOfLight, "Orb of Light");
		
		LanguageRegistry.addName(dungeonToken, "Dungeon Token");
		LanguageRegistry.addName(arcanium, "Arcanium");
		LanguageRegistry.addName(weakArcanaPotion, "Weak Arcana Potion");
		LanguageRegistry.addName(strongArcanaPotion, "Strong Arcana Potion");
		LanguageRegistry.addName(arcaniumBucket, "Arcanium Bucket");
		//LanguageRegistry.addName(tarBucket, "Arcanium Bucket of Tar");

		LanguageRegistry.addName(collector, "Charge Collector");
		LanguageRegistry.addName(collectorFragments, "Collector Fragment");
		
		LanguageRegistry.addName(staffOfEnrichment, "Staff of Enrichment");

		LanguageRegistry.addName(kormaHelmet, "Korma Helmet");
		LanguageRegistry.addName(kormaBody, "Korma Chestplate");
		LanguageRegistry.addName(kormaLegs, "Korma Leggings");
		LanguageRegistry.addName(kormaBoots, "Korma Boots");
		
		LanguageRegistry.addName(vemosHelmet, "Vemos Helmet");
		LanguageRegistry.addName(vemosBody, "Vemos Chestplate");
		LanguageRegistry.addName(vemosLegs, "Vemos Leggings");
		LanguageRegistry.addName(vemosBoots, "Vemos Boots");
	}
}
