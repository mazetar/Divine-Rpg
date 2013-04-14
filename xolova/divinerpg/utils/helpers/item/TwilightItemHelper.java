package xolova.divinerpg.utils.helpers.item;

import net.minecraft.item.Item;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.utils.helpers.config.TwilightConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
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
	
	public static TwilightConfigHelper x;

	public static void init()
	{
		DraviteGem = new ItemDivineRPG(x.DraviteGemID).setIconIndex(2, 11, 6).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteChunk = new ItemDivineRPG(x.DraviteChunkID).setIconIndex(2, 2, 6).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteFragments = new ItemDivineRPG(x.DraviteFragmentsID).setIconIndex(2, 15, 9).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteDust = new ItemDivineRPG(x.DraviteDustID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteBlade = new ItemDivineRPG(x.DraviteBladeID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DravitePhaser = new ItemDivineRPG(x.DravitePhaserID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteBlitz = new ItemDivineRPG(x.DraviteBlitzID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteBow = new ItemDivineRPG(x.DraviteBowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteHelmet = new ItemDivineRPG(x.DraviteHelmetID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteBoots = new ItemDivineRPG(x.DraviteBootsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		Dravitelegs = new ItemDivineRPG(x.DravitelegsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteChest = new ItemDivineRPG(x.DraviteChestID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteSlicer = new ItemDivineRPG(x.DraviteSlicerID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteSoul = new ItemDivineRPG(x.DraviteSoulID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteSparkles = new ItemDivineRPG(x.draviteSparklesID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		DraviteShards = new ItemDivineRPG(x.DraviteShardsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		
		AzuriteGem = new ItemDivineRPG(x.AzuriteGemID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteChunk = new ItemDivineRPG(x.AzuriteChunkID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteFragments = new ItemDivineRPG(x.AzuriteFragmentsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteDust = new ItemDivineRPG(x.AzuriteDustID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteBlade = new ItemDivineRPG(x.AzuriteBladeID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuritePhaser = new ItemDivineRPG(x.AzuritePhaserID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteBlitz = new ItemDivineRPG(x.AzuriteBlitzID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteBow = new ItemDivineRPG(x.AzuriteBowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteHelmet = new ItemDivineRPG(x.AzuriteHelmetID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteBoots = new ItemDivineRPG(x.AzuriteBootsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		Azuritelegs = new ItemDivineRPG(x.AzuritelegsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteChest = new ItemDivineRPG(x.AzuriteChestID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteSlicer = new ItemDivineRPG(x.AzuriteSlicerID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteSoul = new ItemDivineRPG(x.AzuriteSoulID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AzuriteArrow = new ItemDivineRPG(x.AzuriteArrowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);

		UviteGem = new ItemDivineRPG(x.UviteGemID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteChunk = new ItemDivineRPG(x.UviteChunkID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteFragments = new ItemDivineRPG(x.UviteFragmentsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteDust = new ItemDivineRPG(x.UviteDustID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteBlade = new ItemDivineRPG(x.UviteBladeID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UvitePhaser = new ItemDivineRPG(x.UvitePhaserID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteBlitz = new ItemDivineRPG(x.UviteBlitzID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteBow = new ItemDivineRPG(x.UviteBowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteHelmet = new ItemDivineRPG(x.UviteHelmetID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteBoots = new ItemDivineRPG(x.UviteBootsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		Uvitelegs = new ItemDivineRPG(x.UvitelegsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteChest = new ItemDivineRPG(x.UviteChestID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteSlicer = new ItemDivineRPG(x.UviteSlicerID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		UviteSoul = new ItemDivineRPG(x.UviteSoulID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);

		MythrilGem = new ItemDivineRPG(x.MythrilGemID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilChunk = new ItemDivineRPG(x.MythrilChunkID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilFragments = new ItemDivineRPG(x.MythrilFragmentsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilDust = new ItemDivineRPG(x.MythrilDustID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilBlade = new ItemDivineRPG(x.MythrilBladeID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilPhaser = new ItemDivineRPG(x.MythrilPhaserID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilBlitz = new ItemDivineRPG(x.MythrilBlitzID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilBow = new ItemDivineRPG(x.MythrilBowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilHelmet = new ItemDivineRPG(x.MythrilHelmetID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilBoots = new ItemDivineRPG(x.MythrilBootsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		Mythrillegs = new ItemDivineRPG(x.MythrillegsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilChest = new ItemDivineRPG(x.MythrilChestID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilSlicer = new ItemDivineRPG(x.MythrilSlicerID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		MythrilSoul = new ItemDivineRPG(x.MythrilSoulID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);

		AugiteGem = new ItemDivineRPG(x.AugiteGemID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteChunk = new ItemDivineRPG(x.AugiteChunkID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteFragments = new ItemDivineRPG(x.AugiteFragmentsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteDust = new ItemDivineRPG(x.AugiteDustID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteBlade = new ItemDivineRPG(x.AugiteBladeID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugitePhaser = new ItemDivineRPG(x.AugitePhaserID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteBlitz = new ItemDivineRPG(x.AugiteBlitzID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteBow = new ItemDivineRPG(x.AugiteBowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteHelmet = new ItemDivineRPG(x.AugiteHelmetID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteBoots = new ItemDivineRPG(x.AugiteBootsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		Augitelegs = new ItemDivineRPG(x.AugitelegsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteChest = new ItemDivineRPG(x.AugiteChestID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteSlicer = new ItemDivineRPG(x.AugiteSlicerID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		AugiteSoul = new ItemDivineRPG(x.AugiteSoulID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);

		FuryArrow = new ItemDivineRPG(x.FuryArrowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		TwilightClock = new ItemDivineRPG(x.TwilightClockID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		TwilightBow = new ItemDivineRPG(x.TwilightBowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		blueSeeds = new ItemDivineRPG(x.blueSeedsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		magicMeat = new ItemDivineRPG(x.magicMeatID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		empoweredMeat = new ItemDivineRPG(x.empoweredMeatID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		enrichedMagicMeat = new ItemDivineRPG(x.enrichedMagicMeatID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		cookedEmpoweredMeat = new ItemDivineRPG(x.cookedEmpoweredMeatID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		purpleSeeds = new ItemDivineRPG(x.purpleSeedsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		pinkSeeds = new ItemDivineRPG(x.pinkSeedsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);	
		fireThrower = new ItemDivineRPG(x.fireThrowerID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		
		HaliteBlade = new ItemDivineRPG(x.HaliteBladeID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		HalitePhaser = new ItemDivineRPG(x.HalitePhaserID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		HaliteBow = new ItemDivineRPG(x.HaliteBowID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		HaliteSlicer = new ItemDivineRPG(x.HaliteSlicerID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		HaliteHelmet = new ItemDivineRPG(x.HaliteHelmetID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		HaliteBoots = new ItemDivineRPG(x.HaliteBootsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		Halitelegs = new ItemDivineRPG(x.HalitelegsID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		HaliteChest = new ItemDivineRPG(x.HaliteChestID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
		HaliteBlitz = new ItemDivineRPG(x.HaliteBlitzID).setIconIndex(0, 0).setCreativeTab(CreativeTabHelper.tabUnsorted);
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
		/*LanguageRegistry.addName(DraviteSparkles, "Dravite Sparkles");

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
		LanguageRegistry.addName(cookedEmpoweredMeat, "Cooked Empowered Meat");*/
	}
}
