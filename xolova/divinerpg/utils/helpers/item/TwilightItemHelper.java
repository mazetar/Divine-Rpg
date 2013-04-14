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
		DraviteGem = new ItemDivineRPG(x.DraviteGemID).setIconIndex(2, 11, 6).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("DraviteGem");
		DraviteChunk = new ItemDivineRPG(x.DraviteChunkID).setIconIndex(2, 2, 6).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("DraviteChunk");
		DraviteFragments = new ItemDivineRPG(x.DraviteFragmentsID).setIconIndex(2, 15, 9).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("DraviteFragments");
		DraviteDust = new ItemDivineRPG(x.DraviteDustID).setIconIndex(1, 5).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("DraviteDust");
		DraviteBlade = new ItemDivineRPG(x.DraviteBladeID).setIconIndex(2, 144).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("DraviteBlade");
		DravitePhaser = new ItemDivineRPG(x.DravitePhaserID).setIconIndex(2, 208).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("DravitePhaser");
		DraviteBlitz = new ItemDivineRPG(x.DraviteBlitzID).setIconIndex(2, 149).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("DraviteBlitz");
		DraviteBow = new ItemDivineRPG(x.DraviteBowID).setIconIndex(2, 177).setCreativeTab(CreativeTabHelper.tabRanged).setUnlocalizedName("DraviteBow");
		DraviteHelmet = new ItemDivineRPG(x.DraviteHelmetID).setIconIndex(2, 218).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("DraviteHelmet");
		DraviteBoots = new ItemDivineRPG(x.DraviteBootsID).setIconIndex(2, 221).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("DraviteBoots");
		Dravitelegs = new ItemDivineRPG(x.DravitelegsID).setIconIndex(2, 220).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("Dravitelegs");
		DraviteChest = new ItemDivineRPG(x.DraviteChestID).setIconIndex(2, 219).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("DraviteChest");
		DraviteSlicer = new ItemDivineRPG(x.DraviteSlicerID).setIconIndex(2, 202).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("DraviteSlicer");
		DraviteSoul = new ItemDivineRPG(x.DraviteSoulID).setIconIndex(1, 234).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("DraviteSoul");
		DraviteSparkles = new ItemDivineRPG(x.draviteSparklesID).setIconIndex(2, 58).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("DraviteSparkles");
		DraviteShards = new ItemDivineRPG(x.DraviteShardsID).setIconIndex(2, 31).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("DraviteShards");
		
		AzuriteGem = new ItemDivineRPG(x.AzuriteGemID).setIconIndex(2, 105).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AzuriteChunk = new ItemDivineRPG(x.AzuriteChunkID).setIconIndex(2, 96).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AzuriteFragments = new ItemDivineRPG(x.AzuriteFragmentsID).setIconIndex(2, 207).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AzuriteDust = new ItemDivineRPG(x.AzuriteDustID).setIconIndex(1, 5).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AzuriteBlade = new ItemDivineRPG(x.AzuriteBladeID).setIconIndex(2, 145).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("");
		AzuritePhaser = new ItemDivineRPG(x.AzuritePhaserID).setIconIndex(2, 209).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AzuriteBlitz = new ItemDivineRPG(x.AzuriteBlitzID).setIconIndex(2, 150).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AzuriteBow = new ItemDivineRPG(x.AzuriteBowID).setIconIndex(2, 182).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AzuriteHelmet = new ItemDivineRPG(x.AzuriteHelmetID).setIconIndex(2, 224).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		AzuriteBoots = new ItemDivineRPG(x.AzuriteBootsID).setIconIndex(2, 227).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		Azuritelegs = new ItemDivineRPG(x.AzuritelegsID).setIconIndex(2, 226).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		AzuriteChest = new ItemDivineRPG(x.AzuriteChestID).setIconIndex(2, 225).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		AzuriteSlicer = new ItemDivineRPG(x.AzuriteSlicerID).setIconIndex(2, 203).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AzuriteSoul = new ItemDivineRPG(x.AzuriteSoulID).setIconIndex(1, 235).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AzuriteArrow = new ItemDivineRPG(x.AzuriteArrowID).setIconIndex(2, 222).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");

		UviteGem = new ItemDivineRPG(x.UviteGemID).setIconIndex(2, 106).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		UviteChunk = new ItemDivineRPG(x.UviteChunkID).setIconIndex(2, 97).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		UviteFragments = new ItemDivineRPG(x.UviteFragmentsID).setIconIndex(2, 223).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		UviteDust = new ItemDivineRPG(x.UviteDustID).setIconIndex(1, 6).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		UviteBlade = new ItemDivineRPG(x.UviteBladeID).setIconIndex(2, 146).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("");
		UvitePhaser = new ItemDivineRPG(x.UvitePhaserID).setIconIndex(2, 210).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		UviteBlitz = new ItemDivineRPG(x.UviteBlitzID).setIconIndex(2, 151).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		UviteBow = new ItemDivineRPG(x.UviteBowID).setIconIndex(2, 187).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		UviteHelmet = new ItemDivineRPG(x.UviteHelmetID).setIconIndex(2, 228).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		UviteBoots = new ItemDivineRPG(x.UviteBootsID).setIconIndex(2, 231).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		Uvitelegs = new ItemDivineRPG(x.UvitelegsID).setIconIndex(2, 230).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		UviteChest = new ItemDivineRPG(x.UviteChestID).setIconIndex(2, 229).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		UviteSlicer = new ItemDivineRPG(x.UviteSlicerID).setIconIndex(2, 204).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		UviteSoul = new ItemDivineRPG(x.UviteSoulID).setIconIndex(1, 236).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");

		MythrilGem = new ItemDivineRPG(x.MythrilGemID).setIconIndex(2, 108).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		MythrilChunk = new ItemDivineRPG(x.MythrilChunkID).setIconIndex(2, 99).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		MythrilFragments = new ItemDivineRPG(x.MythrilFragmentsID).setIconIndex(2, 175).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		MythrilDust = new ItemDivineRPG(x.MythrilDustID).setIconIndex(1, 7).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		MythrilBlade = new ItemDivineRPG(x.MythrilBladeID).setIconIndex(2, 147).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("");
		MythrilPhaser = new ItemDivineRPG(x.MythrilPhaserID).setIconIndex(2, 211).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		MythrilBlitz = new ItemDivineRPG(x.MythrilBlitzID).setIconIndex(2, 152).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		MythrilBow = new ItemDivineRPG(x.MythrilBowID).setIconIndex(2, 193).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		MythrilHelmet = new ItemDivineRPG(x.MythrilHelmetID).setIconIndex(2, 232).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		MythrilBoots = new ItemDivineRPG(x.MythrilBootsID).setIconIndex(2, 235).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		Mythrillegs = new ItemDivineRPG(x.MythrillegsID).setIconIndex(2, 234).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		MythrilChest = new ItemDivineRPG(x.MythrilChestID).setIconIndex(2, 233).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		MythrilSlicer = new ItemDivineRPG(x.MythrilSlicerID).setIconIndex(2, 205).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		MythrilSoul = new ItemDivineRPG(x.MythrilSoulID).setIconIndex(1, 237).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");

		AugiteGem = new ItemDivineRPG(x.AugiteGemID).setIconIndex(2, 109).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AugiteChunk = new ItemDivineRPG(x.AugiteChunkID).setIconIndex(2, 104).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AugiteFragments = new ItemDivineRPG(x.AugiteFragmentsID).setIconIndex(2, 191).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AugiteDust = new ItemDivineRPG(x.AugiteDustID).setIconIndex(1, 8).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		AugiteBlade = new ItemDivineRPG(x.AugiteBladeID).setIconIndex(2, 148).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("");
		AugitePhaser = new ItemDivineRPG(x.AugitePhaserID).setIconIndex(2, 212).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AugiteBlitz = new ItemDivineRPG(x.AugiteBlitzID).setIconIndex(2, 153).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AugiteBow = new ItemDivineRPG(x.AugiteBowID).setIconIndex(2, 198).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AugiteHelmet = new ItemDivineRPG(x.AugiteHelmetID).setIconIndex(2, 236).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		AugiteBoots = new ItemDivineRPG(x.AugiteBootsID).setIconIndex(2, 239).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		Augitelegs = new ItemDivineRPG(x.AugitelegsID).setIconIndex(2, 238).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		AugiteChest = new ItemDivineRPG(x.AugiteChestID).setIconIndex(2, 237).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		AugiteSlicer = new ItemDivineRPG(x.AugiteSlicerID).setIconIndex(2, 206).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		AugiteSoul = new ItemDivineRPG(x.AugiteSoulID).setIconIndex(1, 238).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");

		FuryArrow = new ItemDivineRPG(x.FuryArrowID).setIconIndex(2, 255).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		TwilightClock = new ItemDivineRPG(x.TwilightClockID).setIconIndex(2, 103).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		blueSeeds = new ItemDivineRPG(x.blueSeedsID).setIconIndex(1, 51).setCreativeTab(CreativeTabHelper.tabHerb).setUnlocalizedName("");
		magicMeat = new ItemDivineRPG(x.magicMeatID).setIconIndex(2, 50).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		empoweredMeat = new ItemDivineRPG(x.empoweredMeatID).setIconIndex(2, 110).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		enrichedMagicMeat = new ItemDivineRPG(x.enrichedMagicMeatID).setIconIndex(2, 51).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		cookedEmpoweredMeat = new ItemDivineRPG(x.cookedEmpoweredMeatID).setIconIndex(2, 111).setCreativeTab(CreativeTabHelper.tabItems).setUnlocalizedName("");
		purpleSeeds = new ItemDivineRPG(x.purpleSeedsID).setIconIndex(1, 150).setCreativeTab(CreativeTabHelper.tabHerb).setUnlocalizedName("");
		pinkSeeds = new ItemDivineRPG(x.pinkSeedsID).setIconIndex(1, 149).setCreativeTab(CreativeTabHelper.tabHerb).setUnlocalizedName("");	
		
		HaliteBlade = new ItemDivineRPG(x.HaliteBladeID).setIconIndex(2, 240).setCreativeTab(CreativeTabHelper.tabSword).setUnlocalizedName("");
		HalitePhaser = new ItemDivineRPG(x.HalitePhaserID).setIconIndex(2, 242).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		HaliteBow = new ItemDivineRPG(x.HaliteBowID).setIconIndex(2, 248).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		HaliteSlicer = new ItemDivineRPG(x.HaliteSlicerID).setIconIndex(2, 252).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		HaliteHelmet = new ItemDivineRPG(x.HaliteHelmetID).setIconIndex(2, 243).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		HaliteBoots = new ItemDivineRPG(x.HaliteBootsID).setIconIndex(2, 246).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		Halitelegs = new ItemDivineRPG(x.HalitelegsID).setIconIndex(2, 245).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		HaliteChest = new ItemDivineRPG(x.HaliteChestID).setIconIndex(2, 244).setCreativeTab(CreativeTabHelper.tabArmor).setUnlocalizedName("");
		HaliteBlitz = new ItemDivineRPG(x.HaliteBlitzID).setIconIndex(2, 241).setCreativeTab(CreativeTabHelper. tabRanged).setUnlocalizedName("");
		
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
