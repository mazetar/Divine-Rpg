package net.divinerpg.utils.helpers.item;

import net.divinerpg.items.ItemDivine;
import net.divinerpg.items.core.DivineBow;
import net.divinerpg.items.overworld.ItemTwilightClock;
import net.divinerpg.items.twilight.ItemBlizDravite;
import net.divinerpg.utils.helpers.config.TwilightConfigHelper;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightItemHelper 
{
	public static Item DraviteGem;
	public static Item DraviteChunk;
	public static Item DraviteFragments;
	public static Item DraviteDust;
	public static Item DraviteBlade;
	public static Item DravitePhaser;
	public static Item DraviteBlitz;
	public static Item DraviteBow;
	public static Item DraviteHelmet;
	public static Item DraviteBoots;
	public static Item Dravitelegs;
	public static Item DraviteChest;
	public static Item DraviteSlicer;
	public static Item DraviteSoul;
	public static Item DraviteSparkles;
	public static Item DraviteShards;
	
	public static Item AzuriteGem;
	public static Item AzuriteChunk;
	public static Item AzuriteFragments;
	public static Item AzuriteDust;
	public static Item AzuriteBlade;
	public static Item AzuritePhaser;
	public static Item AzuriteBlitz;
	public static Item AzuriteBow;
	public static Item AzuriteHelmet;
	public static Item AzuriteBoots;
	public static Item Azuritelegs;
	public static Item AzuriteChest;
	public static Item AzuriteSlicer;
	public static Item AzuriteSoul;
	public static Item AzuriteArrow;

	public static Item UviteGem;
	public static Item UviteChunk;
	public static Item UviteFragments;
	public static Item UviteDust;
	public static Item UviteBlade;
	public static Item UvitePhaser;
	public static Item UviteBlitz;
	public static Item UviteBow;
	public static Item UviteHelmet;
	public static Item UviteBoots;
	public static Item Uvitelegs;
	public static Item UviteChest;
	public static Item UviteSlicer;
	public static Item UviteSoul;

	public static Item MythrilGem;
	public static Item MythrilChunk;
	public static Item MythrilFragments;
	public static Item MythrilDust;
	public static Item MythrilBlade;
	public static Item MythrilPhaser;
	public static Item MythrilBlitz;
	public static Item MythrilBow;
	public static Item MythrilHelmet;
	public static Item MythrilBoots;
	public static Item Mythrillegs;
	public static Item MythrilChest;
	public static Item MythrilSlicer;
	public static Item MythrilSoul;

	public static Item AugiteGem;
	public static Item AugiteChunk;
	public static Item AugiteFragments;
	public static Item AugiteDust;
	public static Item AugiteBlade;
	public static Item AugitePhaser;
	public static Item AugiteBlitz;
	public static Item AugiteBow;
	public static Item AugiteHelmet;
	public static Item AugiteBoots;
	public static Item Augitelegs;
	public static Item AugiteChest;
	public static Item AugiteSlicer;
	public static Item AugiteSoul;

	public static Item FuryArrow;
	public static Item TwilightClock;
	public static Item TwilightBow;
	public static Item blueSeeds;
	public static Item magicMeat;
	public static Item empoweredMeat;
	public static Item enrichedMagicMeat;
	public static Item cookedEmpoweredMeat;
	public static Item purpleSeeds;
	public static Item pinkSeeds;	
	
	public static Item fireThrower;
	
	public static Item HaliteBlade;
	public static Item HalitePhaser;
	public static Item HaliteBow;
	public static Item HaliteSlicer;
	public static Item HaliteHelmet;
	public static Item HaliteBoots;
	public static Item Halitelegs;
	public static Item HaliteChest;
	public static Item HaliteBlitz;
	
	//-==-TOOLS-==-//
	public static Item DravitePickaxe;
	public static Item DraviteShovel;
	public static Item DraviteAxe;
	
	public static Item AzuritePickaxe;
	public static Item AzuriteShovel;
	public static Item AzuriteAxe;
	
	public static Item UvitePickaxe;
	public static Item UviteShovel;
	public static Item UviteAxe;
	
	public static Item MythrilPickaxe;
	public static Item MythrilShovel;
	public static Item MythrilAxe;
	
	public static Item AugitePickaxe;
	public static Item AugiteShovel;
	public static Item AugiteAxe;
	
	public static TwilightConfigHelper x;
	public static Item spawnBase;
	public static Item spawnVamacheron;
	public static Item spawnKAROT;
	public static Item spawnReyvor;
	public static Item spawnDensos;
	public static Item spawnMamormeter;
	public static Item spawnZichile;
	public static Item spawnTwilightDemon;
	public static Item spawnSoulFiend;

	public static void init()
	{
		DraviteGem = new ItemDivine(x.DraviteGemID).func_111206_d("DraviteGem").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("DraviteGem");
		DraviteChunk = new ItemDivine(x.DraviteChunkID).func_111206_d("DraviteChunk").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("DraviteChunk");
		DraviteFragments = new ItemDivine(x.DraviteFragmentsID).func_111206_d("DraviteFragments").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("DraviteFragments");
		DraviteDust = new ItemDivine(x.DraviteDustID).func_111206_d("DraviteDust").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("DraviteDust");
		DraviteBlade = new ItemDivine(x.DraviteBladeID).func_111206_d("DraviteBlade").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("DraviteBlade");
		DravitePhaser = new ItemDivine(x.DravitePhaserID).func_111206_d("DravitePhaser").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("DravitePhaser");
		DraviteBlitz = new ItemBlizDravite(x.DraviteBlitzID).func_111206_d("DraviteBlitz").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("DraviteBlitz");
		DraviteBow = new ItemDivine(x.DraviteBowID).func_111206_d("DraviteBow").setCreativeTab(DivineTabs.tabRanged).setUnlocalizedName("DraviteBow");
		DraviteHelmet = new ItemDivine(x.DraviteHelmetID).func_111206_d("DraviteHelmet").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("DraviteHelmet");
		DraviteBoots = new ItemDivine(x.DraviteBootsID).func_111206_d("DraviteBoots").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("DraviteBoots");
		Dravitelegs = new ItemDivine(x.DravitelegsID).func_111206_d("Dravitelegs").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("Dravitelegs");
		DraviteChest = new ItemDivine(x.DraviteChestID).func_111206_d("DraviteChest").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("DraviteChest");
		DraviteSlicer = new ItemDivine(x.DraviteSlicerID).func_111206_d("DraviteSlicer").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("DraviteSlicer");
		DraviteSoul = new ItemDivine(x.DraviteSoulID).func_111206_d("DraviteSoul").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("DraviteSoul");
		DraviteSparkles = new ItemDivine(x.draviteSparklesID).func_111206_d("DraviteSparkles").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("DraviteSparkles");
		DraviteShards = new ItemDivine(x.DraviteShardsID).func_111206_d("DraviteShards").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("DraviteShards");
		
		AzuriteGem = new ItemDivine(x.AzuriteGemID).func_111206_d("AzuriteGem").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AzuriteGem");
		AzuriteChunk = new ItemDivine(x.AzuriteChunkID).func_111206_d("AzuriteChunk").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AzuriteChunk");
		AzuriteFragments = new ItemDivine(x.AzuriteFragmentsID).func_111206_d("AzuriteFragments").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AzuriteFragments");
		AzuriteDust = new ItemDivine(x.AzuriteDustID).func_111206_d("AzuriteDust").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AzuriteDust");
		AzuriteBlade = new ItemDivine(x.AzuriteBladeID).func_111206_d("AzuriteBlade").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("AzuriteBlade");
		AzuritePhaser = new ItemDivine(x.AzuritePhaserID).func_111206_d("AzuritePhaser").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AzuritePhaser");
		AzuriteBlitz = new ItemDivine(x.AzuriteBlitzID).func_111206_d("AzuriteBlitz").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AzuriteBlitz");
		AzuriteBow = new ItemDivine(x.AzuriteBowID).func_111206_d("AzuriteBow").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AzuriteBow");
		AzuriteHelmet = new ItemDivine(x.AzuriteHelmetID).func_111206_d("AzuriteHelmet").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("AzuriteHelmet");
		AzuriteBoots = new ItemDivine(x.AzuriteBootsID).func_111206_d("AzuriteBoots").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("AzuriteBoots");
		Azuritelegs = new ItemDivine(x.AzuritelegsID).func_111206_d("Azuritelegs").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("Azuritelegs");
		AzuriteChest = new ItemDivine(x.AzuriteChestID).func_111206_d("AzuriteChest").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("AzuriteChest");
		AzuriteSlicer = new ItemDivine(x.AzuriteSlicerID).func_111206_d("AzuriteSlicer").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AzuriteSlicer");
		AzuriteSoul = new ItemDivine(x.AzuriteSoulID).func_111206_d("AzuriteSoul").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AzuriteSoul");
		AzuriteArrow = new ItemDivine(x.AzuriteArrowID).func_111206_d("AzuriteArrow").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AzuriteArrow");

		UviteGem = new ItemDivine(x.UviteGemID).func_111206_d("UviteGem").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("UviteGem");
		UviteChunk = new ItemDivine(x.UviteChunkID).func_111206_d("UviteChunk").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("UviteChunk");
		UviteFragments = new ItemDivine(x.UviteFragmentsID).func_111206_d("UviteFragments").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("UviteFragments");
		UviteDust = new ItemDivine(x.UviteDustID).func_111206_d("UviteDust").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("UviteDust");
		UviteBlade = new ItemDivine(x.UviteBladeID).func_111206_d("UviteBlade").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("UviteBlade");
		UvitePhaser = new ItemDivine(x.UvitePhaserID).func_111206_d("UvitePhaser").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("UvitePhaser");
		UviteBlitz = new ItemDivine(x.UviteBlitzID).func_111206_d("UviteBlitz").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("UviteBlitz");
		UviteBow = new ItemDivine(x.UviteBowID).func_111206_d("UviteBow").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("UviteBow");
		UviteHelmet = new ItemDivine(x.UviteHelmetID).func_111206_d("UviteHelmet").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("UviteHelmet");
		UviteBoots = new ItemDivine(x.UviteBootsID).func_111206_d("UviteBoots").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("UviteBoots");
		Uvitelegs = new ItemDivine(x.UvitelegsID).func_111206_d("Uvitelegs").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("Uvitelegs");
		UviteChest = new ItemDivine(x.UviteChestID).func_111206_d("UviteChest").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("UviteChest");
		UviteSlicer = new ItemDivine(x.UviteSlicerID).func_111206_d("UviteSlicer").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("UviteSlicer");
		UviteSoul = new ItemDivine(x.UviteSoulID).func_111206_d("UviteSoul").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("UviteSoul");

		MythrilGem = new ItemDivine(x.MythrilGemID).func_111206_d("MythrilGem").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("MythrilGem");
		MythrilChunk = new ItemDivine(x.MythrilChunkID).func_111206_d("MythrilChunk").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("MythrilChunk");
		MythrilFragments = new ItemDivine(x.MythrilFragmentsID).func_111206_d("MythrilFragments").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("MythrilFragments");
		MythrilDust = new ItemDivine(x.MythrilDustID).func_111206_d("MythrilDust").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("MythrilDust");
		MythrilBlade = new ItemDivine(x.MythrilBladeID).func_111206_d("MythrilBlade").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("MythrilBlade");
		MythrilPhaser = new ItemDivine(x.MythrilPhaserID).func_111206_d("MythrilPhaser").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("MythrilPhaser");
		MythrilBlitz = new ItemDivine(x.MythrilBlitzID).func_111206_d("MythrilBlitz").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("MythrilBlitz");
		MythrilBow = new ItemDivine(x.MythrilBowID).func_111206_d("MythrilBow").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("MythrilBow");
		MythrilHelmet = new ItemDivine(x.MythrilHelmetID).func_111206_d("MythrilHelmet").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("MythrilHelmet");
		MythrilBoots = new ItemDivine(x.MythrilBootsID).func_111206_d("MythrilBoots").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("MythrilBoots");
		Mythrillegs = new ItemDivine(x.MythrillegsID).func_111206_d("Mythrillegs").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("Mythrillegs");
		MythrilChest = new ItemDivine(x.MythrilChestID).func_111206_d("MythrilChest").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("MythrilChest");
		MythrilSlicer = new ItemDivine(x.MythrilSlicerID).func_111206_d("MythrilSlicer").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("MythrilSlicer");
		MythrilSoul = new ItemDivine(x.MythrilSoulID).func_111206_d("MythrilSoul").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("MythrilSoul");

		AugiteGem = new ItemDivine(x.AugiteGemID).func_111206_d("AugiteGem").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AugiteGem");
		AugiteChunk = new ItemDivine(x.AugiteChunkID).func_111206_d("AugiteChunk").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AugiteChunk");
		AugiteFragments = new ItemDivine(x.AugiteFragmentsID).func_111206_d("AugiteFragments").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AugiteFragments");
		AugiteDust = new ItemDivine(x.AugiteDustID).func_111206_d("AugiteDust").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AugiteDust");
		AugiteBlade = new ItemDivine(x.AugiteBladeID).func_111206_d("AugiteBlade").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("AugiteBlade");
		AugitePhaser = new ItemDivine(x.AugitePhaserID).func_111206_d("AugitePhaser").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AugitePhaser");
		AugiteBlitz = new ItemDivine(x.AugiteBlitzID).func_111206_d("AugiteBlitz").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AugiteBlitz");
		AugiteBow = new DivineBow(x.AugiteBowID, 20, 5, true).func_111206_d("AugiteBow").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AugiteBow");
		AugiteHelmet = new ItemDivine(x.AugiteHelmetID).func_111206_d("AugiteHelmet").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("AugiteHelmet");
		AugiteBoots = new ItemDivine(x.AugiteBootsID).func_111206_d("AugiteBoots").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("AugiteBoots");
		Augitelegs = new ItemDivine(x.AugitelegsID).func_111206_d("Augitelegs").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("Augitelegs");
		AugiteChest = new ItemDivine(x.AugiteChestID).func_111206_d("AugiteChest").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("AugiteChest");
		AugiteSlicer = new ItemDivine(x.AugiteSlicerID).func_111206_d("AugiteSlicer").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("AugiteSlicer");
		AugiteSoul = new ItemDivine(x.AugiteSoulID).func_111206_d("AugiteSoul").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("AugiteSoul");

		FuryArrow = new ItemDivine(x.FuryArrowID).func_111206_d("FuryArrow").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("FuryArrow");
		TwilightClock = new ItemTwilightClock(x.TwilightClockID).setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("TwilightClock").func_111206_d("TwilightClock");
		blueSeeds = new ItemDivine(x.blueSeedsID).func_111206_d("BlueSeeds").setCreativeTab(DivineTabs.tabHerb).setUnlocalizedName("blueSeeds");
		magicMeat = new ItemDivine(x.magicMeatID).func_111206_d("MagicMeat").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("magicMeat");
		empoweredMeat = new ItemDivine(x.empoweredMeatID).func_111206_d("EmpoweredMeat").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("empoweredMeat");
		enrichedMagicMeat = new ItemDivine(x.enrichedMagicMeatID).func_111206_d("EnrichedMagicMeat").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("enrichedMagicMeat");
		cookedEmpoweredMeat = new ItemDivine(x.cookedEmpoweredMeatID).func_111206_d("CookedEmpoweredMeat").setCreativeTab(DivineTabs.tabItems).setUnlocalizedName("cookedEmpoweredMeat");
		purpleSeeds = new ItemDivine(x.purpleSeedsID).func_111206_d("PurpleSeeds").setCreativeTab(DivineTabs.tabHerb).setUnlocalizedName("purpleSeeds");
		pinkSeeds = new ItemDivine(x.pinkSeedsID).func_111206_d("PinkSeeds").setCreativeTab(DivineTabs.tabHerb).setUnlocalizedName("pinkSeeds");	
		
		HaliteBlade = new ItemDivine(x.HaliteBladeID).func_111206_d("HaliteBlade").setCreativeTab(DivineTabs.tabSword).setUnlocalizedName("HaliteBlade");
		HalitePhaser = new ItemDivine(x.HalitePhaserID).func_111206_d("HalitePhaser").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("HalitePhaser");
		HaliteBow = new DivineBow(x.HaliteBowID, 5, 1, true).func_111206_d("HaliteBow").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("HaliteBow");
		HaliteSlicer = new ItemDivine(x.HaliteSlicerID).func_111206_d("HaliteSlicer").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("HaliteSlicer");
		HaliteHelmet = new ItemDivine(x.HaliteHelmetID).func_111206_d("HaliteHelmet").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("HaliteHelmet");
		HaliteBoots = new ItemDivine(x.HaliteBootsID).func_111206_d("HaliteBoots").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("HaliteBoots");
		Halitelegs = new ItemDivine(x.HalitelegsID).func_111206_d("Halitelegs").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("Halitelegs");
		HaliteChest = new ItemDivine(x.HaliteChestID).func_111206_d("HaliteChest").setCreativeTab(DivineTabs.tabArmor).setUnlocalizedName("HaliteChest");
		HaliteBlitz = new ItemDivine(x.HaliteBlitzID).func_111206_d("HaliteBlitz").setCreativeTab(DivineTabs. tabRanged).setUnlocalizedName("HaliteBlitz");
		
		addNames();
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(DraviteGem, "Dravite Gem");
		LanguageRegistry.addName(DraviteChunk, "Dravite Chunk");
		LanguageRegistry.addName(DraviteFragments, "Dravite Fragments");
		LanguageRegistry.addName(DraviteDust, "Dravite Dust");
		LanguageRegistry.addName(DraviteBlade, "Dravite Blade");
		LanguageRegistry.addName(DravitePhaser, "Dravite Phaser");
		LanguageRegistry.addName(DraviteBlitz, "Dravite Blitz");
		LanguageRegistry.addName(DraviteBow, "Dravite Bow");
		LanguageRegistry.addName(DraviteHelmet, "Dravite Helmet");
		LanguageRegistry.addName(DraviteBoots, "Dravite Boots");
		LanguageRegistry.addName(Dravitelegs, "Dravite Legs");
		LanguageRegistry.addName(DraviteChest, "Dravite Chestplate");
		LanguageRegistry.addName(DraviteSlicer, "Dravite Slicer");
		LanguageRegistry.addName(DraviteSoul, "Dravite Soul");
		LanguageRegistry.addName(DraviteSparkles, "Dravite Sparkles");

		LanguageRegistry.addName(AzuriteGem, "Azurite Gem");
		LanguageRegistry.addName(AzuriteChunk, "Azurite Chunk");
		LanguageRegistry.addName(AzuriteFragments, "Azurite Fragments");
		LanguageRegistry.addName(AzuriteDust, "Azurite Dust");
		LanguageRegistry.addName(AzuriteBlade, "Azurite Blade");
		LanguageRegistry.addName(AzuritePhaser, "Azurite Phaser");
		LanguageRegistry.addName(AzuriteBlitz, "Azurite Blitz");
		LanguageRegistry.addName(AzuriteBow, "Azurite Bow");
		LanguageRegistry.addName(AzuriteHelmet, "Azurite Helmet");
		LanguageRegistry.addName(AzuriteBoots, "Azurite Boots");
		LanguageRegistry.addName(Azuritelegs, "Azurite Legs");
		LanguageRegistry.addName(AzuriteChest, "Azurite Chestplate");
		LanguageRegistry.addName(AzuriteSlicer, "Azurite Slicer");
		LanguageRegistry.addName(AzuriteSoul, "Azurite Soul");

		LanguageRegistry.addName(UviteGem, "Uvite Gem");
		LanguageRegistry.addName(UviteChunk, "Uvite Chunk");
		LanguageRegistry.addName(UviteFragments, "Uvite Fragments");
		LanguageRegistry.addName(UviteDust, "Uvite Dust");
		LanguageRegistry.addName(UviteBlade, "Uvite Blade");
		LanguageRegistry.addName(UvitePhaser, "Uvite Phaser");
		LanguageRegistry.addName(UviteBlitz, "Uvite Blitz");
		LanguageRegistry.addName(UviteBow, "Uvite Bow");
		LanguageRegistry.addName(UviteHelmet, "Uvite Helmet");
		LanguageRegistry.addName(UviteBoots, "Uvite Boots");
		LanguageRegistry.addName(Uvitelegs, "Uvite Legs");
		LanguageRegistry.addName(UviteChest, "Uvite Chestplate");
		LanguageRegistry.addName(UviteSlicer, "Uvite Slicer");
		LanguageRegistry.addName(UviteSoul, "Uvite Soul");
		
		LanguageRegistry.addName(MythrilGem, "Mythril Gem");
		LanguageRegistry.addName(MythrilChunk, "Mythril Chunk");
		LanguageRegistry.addName(MythrilFragments, "Mythril Fragments");
		LanguageRegistry.addName(MythrilDust, "Mythril Dust");
		LanguageRegistry.addName(MythrilBlade, "Mythril Blade");
		LanguageRegistry.addName(MythrilPhaser, "Mythril Phaser");
		LanguageRegistry.addName(MythrilBlitz, "Mythril Blitz");
		LanguageRegistry.addName(MythrilBow, "Mythril Bow");
		LanguageRegistry.addName(MythrilHelmet, "Mythril Helmet");
		LanguageRegistry.addName(MythrilBoots, "Mythril Boots");
		LanguageRegistry.addName(Mythrillegs, "Mythril Legs");
		LanguageRegistry.addName(MythrilChest, "Mythril Chestplate");
		LanguageRegistry.addName(MythrilSlicer, "Mythril Slicer");
		LanguageRegistry.addName(MythrilSoul, "Mythril Soul");

		LanguageRegistry.addName(AugiteGem, "Augite Gem");
		LanguageRegistry.addName(AugiteChunk, "Augite Chunk");
		LanguageRegistry.addName(AugiteFragments, "Augite Fragments");
		LanguageRegistry.addName(AugiteDust, "Augite Dust");
		LanguageRegistry.addName(AugiteBlade, "Augite Blade");
		LanguageRegistry.addName(AugitePhaser, "Augite Phaser");
		LanguageRegistry.addName(AugiteBlitz, "Augite Blitz");
		LanguageRegistry.addName(AugiteBow, "Augite Bow");
		LanguageRegistry.addName(AugiteHelmet, "Augite Helmet");
		LanguageRegistry.addName(AugiteBoots, "Augite Boots");
		LanguageRegistry.addName(Augitelegs, "Augite Legs");
		LanguageRegistry.addName(AugiteChest, "Augite Chestplate");
		LanguageRegistry.addName(AugiteSlicer, "Augite Slicer");
		LanguageRegistry.addName(AugiteSoul, "Augite Soul");

		LanguageRegistry.addName(FuryArrow, "Fury Arrow");
		LanguageRegistry.addName(AzuriteArrow, "Azurite Arrow");
		LanguageRegistry.addName(TwilightClock, "Twilight Clock");
		LanguageRegistry.addName(blueSeeds, "Blue Seeds");
		LanguageRegistry.addName(magicMeat, "Magic Meat");
		LanguageRegistry.addName(empoweredMeat, "Empowered Meat");
		LanguageRegistry.addName(enrichedMagicMeat, "Enriched Magic Meat");
		LanguageRegistry.addName(cookedEmpoweredMeat, "Cooked Empowered Meat");
	}
}
