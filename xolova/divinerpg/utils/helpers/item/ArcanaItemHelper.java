package xolova.divinerpg.utils.helpers.item;

import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.EnumHelper;
import xolova.divinerpg.items.arcana.ItemAquaMarine;
import xolova.divinerpg.items.arcana.ItemArcaniumSaber;
import xolova.divinerpg.items.arcana.ItemArmorKorma;
import xolova.divinerpg.items.arcana.ItemArmorVemos;
import xolova.divinerpg.items.arcana.ItemCaptiansSparkeler;
import xolova.divinerpg.items.arcana.ItemEnderScepter;
import xolova.divinerpg.items.arcana.ItemFirefly;
import xolova.divinerpg.items.arcana.ItemFyracryxSpawner;
import xolova.divinerpg.items.arcana.ItemGolemOfRejuvSpawner;
import xolova.divinerpg.items.arcana.ItemGrenade;
import xolova.divinerpg.items.arcana.ItemGrenadeLauncher;
import xolova.divinerpg.items.arcana.ItemKey;
import xolova.divinerpg.items.arcana.ItemLamona;
import xolova.divinerpg.items.arcana.ItemLiviciaSword;
import xolova.divinerpg.items.arcana.ItemMeriksMissile;
import xolova.divinerpg.items.arcana.ItemOreDoor;
import xolova.divinerpg.items.arcana.ItemOreDoor2;
import xolova.divinerpg.items.arcana.ItemOreDoor3;
import xolova.divinerpg.items.arcana.ItemOreDoor4;
import xolova.divinerpg.items.arcana.ItemParatikuSpawner;
import xolova.divinerpg.items.arcana.ItemPinFly;
import xolova.divinerpg.items.arcana.ItemReflector;
import xolova.divinerpg.items.arcana.ItemSeimerSpawner;
import xolova.divinerpg.items.arcana.ItemShadowSword;
import xolova.divinerpg.items.arcana.ItemStaffOfEnrichment;
import xolova.divinerpg.items.arcana.ItemStarfall;
import xolova.divinerpg.items.arcana.ItemStormSword;
import xolova.divinerpg.items.arcana.ItemTarBucket;
import xolova.divinerpg.items.arcana.ItemWraithbane;
import xolova.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import xolova.divinerpg.utils.helpers.block.OverworldBlockHelper;
import xolova.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArcanaItemHelper 
{
    public static Item oreDoorItem1;
    public static Item oreDoor2Item;
    public static Item oreDoor3Item;
    public static Item oreDoor4Item;
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
    public static Item kormaHead;
    public static Item kormaBody;
    public static Item kormaLegs;
    public static Item kormaBoots;
    public static Item vemosHead;
    public static Item vemosBody;
    public static Item vemosLegs;
    public static Item vemosBoots;
    public static Item wizardBook;
    
	public static void init()
	{
		oreDoorItem1 = (new ItemOreDoor(ArcanaConfigHelper.oreDoorItem1ID, Material.wood)).setUnlocalizedName("doorWood1").setCreativeTab(CreativeTabHelper.tabItems);
		oreDoor2Item = (new ItemOreDoor2(ArcanaConfigHelper.oreDoor2ItemID, Material.wood)).setUnlocalizedName("doorWood2").setCreativeTab(CreativeTabHelper.tabItems);
		oreDoor3Item = (new ItemOreDoor3(ArcanaConfigHelper.oreDoor3ItemID, Material.wood)).setUnlocalizedName("doorWood3").setCreativeTab(CreativeTabHelper.tabItems);
		oreDoor4Item = (new ItemOreDoor4(ArcanaConfigHelper.oreDoor4ItemID, Material.wood)).setUnlocalizedName("doorWood4").setCreativeTab(CreativeTabHelper.tabItems);
		key1 = new ItemKey(ArcanaConfigHelper.key1ID, 12).setUnlocalizedName("key1").setCreativeTab(CreativeTabHelper.tabItems); //TODO: Add Right Textures
	    key2 = new ItemKey(ArcanaConfigHelper.key2ID, 13).setUnlocalizedName("key2").setCreativeTab(CreativeTabHelper.tabItems);
	    key3 = new ItemKey(ArcanaConfigHelper.key3ID, 14).setUnlocalizedName("key3").setCreativeTab(CreativeTabHelper.tabItems);
	    key4 = new ItemKey(ArcanaConfigHelper.key4ID, 15).setUnlocalizedName("key4").setCreativeTab(CreativeTabHelper.tabItems);
	    fireStockItem = new Item(ArcanaConfigHelper.fireStockItemID).setUnlocalizedName("fireStockItem").setCreativeTab(CreativeTabHelper.tabHerb);
        fireStockSeeds = new ItemSeeds(ArcanaConfigHelper.fireStockSeedsID, ArcanaBlockHelper.fireStock.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("fireStockSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        pinFlyItem = new ItemPinFly(ArcanaConfigHelper.pinFlyItemID, 2, 0.3F, false).setUnlocalizedName("pinflyItem").setCreativeTab(CreativeTabHelper.tabHerb);
        pinFlySeeds = new ItemSeeds(ArcanaConfigHelper.pinFlySeedsID, ArcanaBlockHelper.pinFly.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("pinFlySeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        hitchakItem = new ItemFood(ArcanaConfigHelper.hitchakItemID, 2, 3.0F, false).setUnlocalizedName("hitchakItem").setCreativeTab(CreativeTabHelper.tabHerb);
        hitchakSeeds = new ItemSeeds(ArcanaConfigHelper.hitchakSeedsID, ArcanaBlockHelper.hitchak.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("hitchakSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        eucalyptusRootSeeds = new ItemSeeds(ArcanaConfigHelper.eucalyptusRootSeedsID, ArcanaBlockHelper.eucalyptusRoot.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("eucalyptusRootSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        veiloItem = new Item(ArcanaConfigHelper.veiloItemID).setUnlocalizedName("veiloItem").setCreativeTab(CreativeTabHelper.tabHerb);
        veiloSeeds = new ItemSeeds(ArcanaConfigHelper.veiloSeedsID, ArcanaBlockHelper.veilo.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("veiloSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        lamonaItem = new ItemLamona(ArcanaConfigHelper.lamonaItemID).setUnlocalizedName("lamonaItem").setCreativeTab(CreativeTabHelper.tabHerb);
        lamonaSeeds = new ItemSeeds(ArcanaConfigHelper.lamonaSeedsID, ArcanaBlockHelper.lamona.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("lamonaSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        aquamarineItem = new ItemAquaMarine(ArcanaConfigHelper.aquamarineItemID).setUnlocalizedName("aquamarineItem").setCreativeTab(CreativeTabHelper.tabHerb);
        aquamarineSeeds = new ItemSeeds(ArcanaConfigHelper.aquamarineSeedsID, ArcanaBlockHelper.aquamarine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("aquamarineSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        marsineItem = new Item(ArcanaConfigHelper.marsineItemID).setUnlocalizedName("marsineItem").setCreativeTab(CreativeTabHelper.tabHerb);
        marsineSeeds = new ItemSeeds(ArcanaConfigHelper.marsineSeedsID, ArcanaBlockHelper.marsine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setUnlocalizedName("marsineSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        fyracryxSpawner = new ItemFyracryxSpawner(ArcanaConfigHelper.fyracryxSpawnerID).setUnlocalizedName("fyracryxSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        paratikuSpawner = new ItemParatikuSpawner(ArcanaConfigHelper.paratikuSpawnerID).setUnlocalizedName("paratikuSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        seimerSpawner = new ItemSeimerSpawner(ArcanaConfigHelper.seimerSpawnerID).setUnlocalizedName("seimerSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        golemOfRejuvSpawner = new ItemGolemOfRejuvSpawner(ArcanaConfigHelper.golemOfRejuvSpawnerID).setUnlocalizedName("golemOfRejuvSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        reflector = new ItemReflector(ArcanaConfigHelper.reflectorID).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("reflector");
        
        EnumToolMaterial arcanaSword = EnumHelper.addToolMaterial("arcanic", 1, -1, 1, 1, 22);
        stormSword = new ItemStormSword(ArcanaConfigHelper.stormSwordID, arcanaSword).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("stormSword");
        shadowSword = new ItemShadowSword(ArcanaConfigHelper.shadowSwordID, arcanaSword).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("shadowSword");
        arcaniumSaber = new ItemArcaniumSaber(ArcanaConfigHelper.arcaniumSaberID, arcanaSword).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("arcaniumSaber");
        liviciaSword = new ItemLiviciaSword(ArcanaConfigHelper.liviciaSwordID, arcanaSword).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("liviciaSword");
        
        staffOfStarlight = new ItemStarfall(ArcanaConfigHelper.staffOfStarlightID).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("staffOfStarlight");
        wraithbane = new ItemWraithbane(ArcanaConfigHelper.wraithbaneID).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("wraithbane");
        captiansSparkler = new ItemCaptiansSparkeler(ArcanaConfigHelper.captiansSparklerID).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("captiansSparkler");
        enderScepter = new ItemEnderScepter(ArcanaConfigHelper.enderScepterID).setUnlocalizedName("enderScepter").setCreativeTab(CreativeTabHelper.tabSword);
        grenadeLauncher = new ItemGrenadeLauncher(ArcanaConfigHelper.grenadeLauncherID, 3).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("grenadeLauncher");
        grenade = new ItemGrenade(ArcanaConfigHelper.grenadeID, 3).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("grenade");
        meriksMissile = new ItemMeriksMissile(ArcanaConfigHelper.meriksMissileID).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("meriksMissile");
        firefly = new ItemFirefly(ArcanaConfigHelper.fireflyID).setUnlocalizedName("firefly").setCreativeTab(CreativeTabHelper.tabRanged);
        starfall = new ItemStarfall(ArcanaConfigHelper.starfallID).setUnlocalizedName("starfall").setCreativeTab(CreativeTabHelper.tabRanged);
        dungeonToken = new Item(ArcanaConfigHelper.dungeonTokenID).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("dungeonToken");
        collector = new Item(ArcanaConfigHelper.collectorID).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("collector");
        collectorFragments = new Item (ArcanaConfigHelper.collectorFragmentsID).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("collectorFragment");
        tarBucket = new ItemTarBucket(ArcanaConfigHelper.tarBucketID, OverworldBlockHelper.tarStill.blockID).setUnlocalizedName("tarBucket").setCreativeTab(CreativeTabHelper.tabItems);
        arcaniumBucket = new ItemTarBucket(ArcanaConfigHelper.arcaniumBucketID, 0).setUnlocalizedName("arcaniumBucket").setCreativeTab(CreativeTabHelper.tabItems);
        staffOfEnrichment = new ItemStaffOfEnrichment(ArcanaConfigHelper.staffOfEnrichmentID).setUnlocalizedName("staffOfEnrichment").setCreativeTab(CreativeTabHelper.tabTool);
        
        int kormaRender = RenderingRegistry.addNewArmourRendererPrefix("korma");
        kormaHead = new ItemArmorKorma(ArcanaConfigHelper.kormaHeadID, kormaRender, 0).setUnlocalizedName("kormaHead").setCreativeTab(CreativeTabHelper.tabArmor);
        kormaBody = new ItemArmorKorma(ArcanaConfigHelper.kormaBodyID, kormaRender, 1).setUnlocalizedName("kormaBody").setCreativeTab(CreativeTabHelper.tabArmor);
        kormaLegs = new ItemArmorKorma(ArcanaConfigHelper.kormaLegsID, kormaRender, 2).setUnlocalizedName("kormaLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        kormaBoots = new ItemArmorKorma(ArcanaConfigHelper.kormaBootsID, kormaRender, 3).setUnlocalizedName("kormaBoots").setCreativeTab(CreativeTabHelper.tabArmor);
        
        int vemosRender = RenderingRegistry.addNewArmourRendererPrefix("vemos");
        vemosHead = new ItemArmorVemos(ArcanaConfigHelper.vemosHeadID, vemosRender, 0).setUnlocalizedName("vemosHead").setCreativeTab(CreativeTabHelper.tabArmor);
        vemosBody = new ItemArmorVemos(ArcanaConfigHelper.vemosBodyID, vemosRender, 1).setUnlocalizedName("vemosBody").setCreativeTab(CreativeTabHelper.tabArmor);
        vemosLegs = new ItemArmorVemos(ArcanaConfigHelper.vemosLegsID, vemosRender, 2).setUnlocalizedName("vemosLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        vemosBoots = new ItemArmorVemos(ArcanaConfigHelper.vemosBootsID, vemosRender, 3).setUnlocalizedName("vemosBoots").setCreativeTab(CreativeTabHelper.tabArmor);
        addNames();
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(oreDoorItem1, "Locked Door");
		LanguageRegistry.addName(oreDoor2Item, "Locked Door");
		LanguageRegistry.addName(oreDoor3Item, "Locked Door");
		LanguageRegistry.addName(oreDoor4Item, "Locked Door");

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
		LanguageRegistry.addName(tarBucket, "Arcanium Bucket of Tar");

		LanguageRegistry.addName(collector, "Charge Collector");
		LanguageRegistry.addName(collectorFragments, "Collector Fragment");
		
		LanguageRegistry.addName(staffOfEnrichment, "Staff of Enrichment");

		LanguageRegistry.addName(kormaHead, "Korma Helmet");
		LanguageRegistry.addName(kormaBody, "Korma Chestplate");
		LanguageRegistry.addName(kormaLegs, "Korma Leggings");
		LanguageRegistry.addName(kormaBoots, "Korma Boots");
		
		LanguageRegistry.addName(vemosHead, "Vemos Helmet");
		LanguageRegistry.addName(vemosBody, "Vemos Chestplate");
		LanguageRegistry.addName(vemosLegs, "Vemos Leggings");
		LanguageRegistry.addName(vemosBoots, "Vemos Boots");
	}
}
