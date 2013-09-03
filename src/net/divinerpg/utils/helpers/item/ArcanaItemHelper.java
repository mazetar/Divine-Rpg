package net.divinerpg.utils.helpers.item;

import net.divinerpg.items.ItemDivineRPG;
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
import net.divinerpg.items.arcana.ItemOreDoor2;
import net.divinerpg.items.arcana.ItemOreDoor3;
import net.divinerpg.items.arcana.ItemOreDoor4;
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
import net.divinerpg.items.core.ItemDivineRPGSeeds;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
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
    
    public static ArcanaConfigHelper x;
    
	public static void init()
	{
		weakArcanaPotion = new ItemArcanaPotion(x.weakArcanaPotionID, 0).setIconIndex(3, 176);
		strongArcanaPotion = new ItemArcanaPotion(x.strongArcanaPotionID, 0).setIconIndex(3, 177);
		
		oreDoorItem1 = new ItemOreDoor(x.oreDoorItem1ID, Material.wood).setIconIndex(3, 144).setUnlocalizedName("doorWood1").setCreativeTab(CreativeTabHelper.tabItems);
		oreDoor2Item = new ItemOreDoor2(x.oreDoor2ItemID, Material.wood).setIconIndex(3, 146).setUnlocalizedName("doorWood2").setCreativeTab(CreativeTabHelper.tabItems);
		oreDoor3Item = new ItemOreDoor3(x.oreDoor3ItemID, Material.wood).setIconIndex(3, 148).setUnlocalizedName("doorWood3").setCreativeTab(CreativeTabHelper.tabItems);
		oreDoor4Item = new ItemOreDoor4(x.oreDoor4ItemID, Material.wood).setIconIndex(3, 150).setUnlocalizedName("doorWood4").setCreativeTab(CreativeTabHelper.tabItems);
		key1 = new ItemKey(x.key1ID, 12).setIconIndex(3, 152).setUnlocalizedName("key1").setCreativeTab(CreativeTabHelper.tabItems);
	    key2 = new ItemKey(x.key2ID, 13).setIconIndex(3, 153).setUnlocalizedName("key2").setCreativeTab(CreativeTabHelper.tabItems);
	    key3 = new ItemKey(x.key3ID, 14).setIconIndex(3, 154).setUnlocalizedName("key3").setCreativeTab(CreativeTabHelper.tabItems);
	    key4 = new ItemKey(x.key4ID, 15).setIconIndex(3, 155).setUnlocalizedName("key4").setCreativeTab(CreativeTabHelper.tabItems);
	    fireStockItem = new ItemDivineRPG(x.fireStockItemID).setIconIndex(3, 85).setUnlocalizedName("fireStockItem").setCreativeTab(CreativeTabHelper.tabHerb);
        fireStockSeeds = new ItemDivineRPGSeeds(x.fireStockSeedsID, ArcanaBlockHelper.fireStock.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 101).setUnlocalizedName("fireStockSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        pinFlyItem = new ItemPinFly(x.pinFlyItemID, 2, 0.3F, false).setUnlocalizedName("pinflyItem").setCreativeTab(CreativeTabHelper.tabHerb);
        pinFlySeeds = new ItemDivineRPGSeeds(x.pinFlySeedsID, ArcanaBlockHelper.pinFly.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 104).setUnlocalizedName("pinFlySeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        hitchakItem = new ItemDivineRPGFood(x.hitchakItemID, 2, 3.0F, false).setUnlocalizedName("hitchakItem").setCreativeTab(CreativeTabHelper.tabHerb);
        hitchakSeeds = new ItemDivineRPGSeeds(x.hitchakSeedsID, ArcanaBlockHelper.hitchak.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 99).setUnlocalizedName("hitchakSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        eucalyptusRootSeeds = new ItemDivineRPGSeeds(x.eucalyptusRootSeedsID, ArcanaBlockHelper.eucalyptusRoot.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 100).setUnlocalizedName("eucalyptusRootSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        veiloItem = new ItemDivineRPG(x.veiloItemID).setIconIndex(3, 87).setUnlocalizedName("veiloItem").setCreativeTab(CreativeTabHelper.tabHerb);
        veiloSeeds = new ItemDivineRPGSeeds(x.veiloSeedsID, ArcanaBlockHelper.veilo.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 102).setUnlocalizedName("veiloSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        lamonaItem = new ItemLamona(x.lamonaItemID).setIconIndex(3, 90).setUnlocalizedName("lamonaItem").setCreativeTab(CreativeTabHelper.tabHerb);
        lamonaSeeds = new ItemDivineRPGSeeds(x.lamonaSeedsID, ArcanaBlockHelper.lamona.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 106).setUnlocalizedName("lamonaSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        aquamarineItem = new ItemAquaMarine(x.aquamarineItemID).setIconIndex(3, 88).setUnlocalizedName("aquamarineItem").setCreativeTab(CreativeTabHelper.tabHerb);
        aquamarineSeeds = new ItemDivineRPGSeeds(x.aquamarineSeedsID, ArcanaBlockHelper.aquamarine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 105).setUnlocalizedName("aquamarineSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        marsineItem = new ItemDivineRPG(x.marsineItemID).setIconIndex(3, 84).setUnlocalizedName("marsineItem").setCreativeTab(CreativeTabHelper.tabHerb);
        marsineSeeds = new ItemDivineRPGSeeds(x.marsineSeedsID, ArcanaBlockHelper.marsine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).setIconIndex(3, 103).setUnlocalizedName("marsineSeeds").setCreativeTab(CreativeTabHelper.tabHerb);
        reflector = new ItemReflector(x.reflectorID).setIconIndex(3, 9).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("reflector");
        arcanium = new ItemDivineRPG(x.arcaniumID).setIconIndex(3, 31).setUnlocalizedName("Arcanium");
        fyracryxSpawner = new ItemFyracryxSpawner(ArcanaConfigHelper.fyracryxSpawnerID).setUnlocalizedName("fyracryxSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        paratikuSpawner = new ItemParatikuSpawner(ArcanaConfigHelper.paratikuSpawnerID).setUnlocalizedName("paratikuSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        seimerSpawner = new ItemSeimerSpawner(ArcanaConfigHelper.seimerSpawnerID).setUnlocalizedName("seimerSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        golemOfRejuvSpawner = new ItemGolemOfRejuvSpawner(ArcanaConfigHelper.golemOfRejuvSpawnerID).setUnlocalizedName("golemOfRejuvSpawner").setCreativeTab(CreativeTabHelper.tabSpawner);
        EnumToolMaterial arcanaSword = EnumHelper.addToolMaterial("arcanic", 1, -1, 1, 1, 22);
        stormSword = new ItemStormSword(x.stormSwordID, arcanaSword).setIconIndex(3, 0).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("stormSword");
        shadowSword = new ItemShadowSword(x.shadowSwordID, arcanaSword).setIconIndex(3, 5).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("shadowSword");
        arcaniumSaber = new ItemArcaniumSaber(x.arcaniumSaberID, arcanaSword).setIconIndex(3, 7).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("arcaniumSaber");
        liviciaSword = new ItemLiviciaSword(x.liviciaSwordID, arcanaSword).setIconIndex(3, 0).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("liviciaSword");
        
        staffOfStarlight = new ItemStarfall(x.staffOfStarlightID).setIconIndex(3, 8).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("staffOfStarlight");
        wraithbane = new ItemWraithbane(x.wraithbaneID).setIconIndex(3, 6).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("wraithbane");
        captiansSparkler = new ItemCaptiansSparkeler(x.captiansSparklerID).setIconIndex(3, 1).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("captiansSparkler");
        enderScepter = new ItemEnderScepter(x.enderScepterID).setIconIndex(3, 2).setUnlocalizedName("enderScepter").setCreativeTab(CreativeTabHelper.tabSword);
        grenadeLauncher = new ItemGrenadeLauncher(x.grenadeLauncherID, 3).setIconIndex(3, 96).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("grenadeLauncher");
        grenade = new ItemGrenade(x.grenadeID, 3).setIconIndex(3, 97).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("grenade");
        meriksMissile = new ItemMeriksMissile(x.meriksMissileID, 0, 0, true).setIconIndex(3, 48).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("meriksMissile");
        firefly = new ItemFirefly(x.fireflyID).setIconIndex(3, 4).setUnlocalizedName("firefly").setCreativeTab(CreativeTabHelper.tabRanged);
        starfall = new ItemStarfall(x.starfallID).setIconIndex(3, 3).setUnlocalizedName("starfall").setCreativeTab(CreativeTabHelper.tabRanged);
        dungeonToken = new ItemDivineRPG(x.dungeonTokenID).setIconIndex(3, 52).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("dungeonToken");
        collector = new ItemDivineRPG(x.collectorID).setIconIndex(14, 0).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("collector");
        collectorFragments = new ItemDivineRPG (x.collectorFragmentsID).setIconIndex(15, 0).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("collectorFragment");
        //tarBucket = new ItemTarBucket(x.tarBucketID, OverworldBlockHelper.tarStill.blockID).setUnlocalizedName("tarBucket").setCreativeTab(CreativeTabHelper.tabItems);
        arcaniumBucket = new ItemTarBucket(x.arcaniumBucketID, 0).setUnlocalizedName("arcaniumBucket").setCreativeTab(CreativeTabHelper.tabItems);
        staffOfEnrichment = new ItemStaffOfEnrichment(x.staffOfEnrichmentID).setIconIndex(3, 184).setUnlocalizedName("staffOfEnrichment").setCreativeTab(CreativeTabHelper.tabTool);
        orbOfLight = new ItemOrbOfLight(x.orbOfLightID).setIconIndex(3, 178);
        wizardBook = new ItemWizardBook(x.wizardBookID).setIconIndex(3, 182).setUnlocalizedName("WizardBook");
        
        int kormaRender = RenderingRegistry.addNewArmourRendererPrefix("korma");
        kormaHead = new ItemArmorKorma(x.kormaHeadID, kormaRender, 0).setIconIndex(3, 16).setUnlocalizedName("kormaHead").setCreativeTab(CreativeTabHelper.tabArmor);
        kormaBody = new ItemArmorKorma(x.kormaBodyID, kormaRender, 1).setIconIndex(3, 17).setUnlocalizedName("kormaBody").setCreativeTab(CreativeTabHelper.tabArmor);
        kormaLegs = new ItemArmorKorma(x.kormaLegsID, kormaRender, 2).setIconIndex(3, 18).setUnlocalizedName("kormaLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        kormaBoots = new ItemArmorKorma(x.kormaBootsID, kormaRender, 3).setIconIndex(3, 19).setUnlocalizedName("kormaBoots").setCreativeTab(CreativeTabHelper.tabArmor);
        
        int vemosRender = RenderingRegistry.addNewArmourRendererPrefix("vemos");
        vemosHead = new ItemArmorVemos(x.vemosHeadID, vemosRender, 0).setIconIndex(3, 10).setUnlocalizedName("vemosHead").setCreativeTab(CreativeTabHelper.tabArmor);
        vemosBody = new ItemArmorVemos(x.vemosBodyID, vemosRender, 1).setIconIndex(3, 11).setUnlocalizedName("vemosBody").setCreativeTab(CreativeTabHelper.tabArmor);
        vemosLegs = new ItemArmorVemos(x.vemosLegsID, vemosRender, 2).setIconIndex(3, 12).setUnlocalizedName("vemosLegs").setCreativeTab(CreativeTabHelper.tabArmor);
        vemosBoots = new ItemArmorVemos(x.vemosBootsID, vemosRender, 3).setIconIndex(3, 13).setUnlocalizedName("vemosBoots").setCreativeTab(CreativeTabHelper.tabArmor);
        
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
		//LanguageRegistry.addName(tarBucket, "Arcanium Bucket of Tar");

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
