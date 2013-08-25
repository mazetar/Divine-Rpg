package net.divinerpg.utils.helpers.item;


import net.divinerpg.items.ItemDivineRPG;
import net.divinerpg.items.core.ItemDivineRPGSword;
import net.divinerpg.items.overworld.*;
import net.divinerpg.utils.helpers.config.ConfigHelper;
import net.divinerpg.utils.helpers.config.OverworldConfigHelper;
import net.divinerpg.utils.helpers.gui.CreativeTabHelper;
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.EnumToolMaterial;

import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class OverworldItemHelper 
{
	public static Item bedrockMaul;
	public static Item soundOfMusic;
	public static Item shuriken;
	public static Item namkormira;
	public static Item slimeSword;
	public static Item shadowBow;
	public static Item crabClawCannon;
	public static Item frostCannon;
	public static Item frostSword;
	public static Item sandSlash;
	public static Item watcherEye;
	public static Item infernoBow;
	public static Item bluefirebow;
	
	public static Item palavence;
	public static Item moltenSword;
	public static Item arlemiteStabber;
	public static Item rupeeRapier;
	public static Item realmiteSword;
	public static Item poisonSaber;
	public static Item infernoSword;
	public static Item bedrockSword;
	public static Item aquaticDagger;
	public static Item aquaticTrident;
	public static Item oceanKnife;
	public static Item aquaton;
	public static Item sharkSword;
	public static Item crabclawMaul;
	public static Item deathBringer;
	public static Item corruptedMaul;
	public static Item scorchingSword;
	public static Item bluefireSword;
	public static Item divineSword;
	public static Item bloodgemSword;
	public static Item vileStorm;
	public static Item bowHeadAnchor;
	public static Item crabAnchor;
	public static Item bowheadCannon;
	public static Item maelstrom;
	public static Item ghastCannon;
	public static Item corruptCannon;

	public static Item enderShard;
	public static Item jungleShard;
	public static Item iceShard;
	public static Item divineShard;
	public static Item moltenShard;
	public static Item corruptedShard;
	public static Item aquaticShard;

	public static Item enderStone;
	public static Item jungleStone;
	public static Item iceStone;
	public static Item divineStone;
	public static Item moltenStone;
	public static Item shadowStone;
	public static Item corruptedStone;
	public static Item blueFireStone;
	public static Item aquaticStone;
	
	public static Item divineHelm;
	public static Item divineBody;
	public static Item divineLegs;
	public static Item divineBoots;
	
	public static Item enderSword;
	public static Item enderSwordYellow;
	public static Item enderSwordBlue;
	public static Item enderSwordRed;
	public static Item enderSwordGreen;
	
	public static Item rupeeIngot;
	public static Item arlemiteIngot;
	public static Item realmiteIngot;
	public static Item netheriteBar;
	public static Item hellStoneIngot;

	public static Item sharkFin;
	public static Item whaleFin;
	public static Item tomato;
	public static Item tomatoSeeds;
	public static Item whiteMushroom;
	public static Item glowingGem;
	public static Item purpleFire;
	public static Item jackOManBoots;
	public static Item jackOManLegs;
	public static Item jackOManBody;
	public static Item jackOManHead;
	public static Item scythe;
	public static Item purpleGlowBoneTree;
	public static Item pinkGlowBoneTree;
	public static Item sharkAnchor;
	public static Item healingStone;
	public static Item purpleBlaze;
	public static Item furyFire;

	public static Item skeleManHead;
	public static Item skeleManBody;
	public static Item skeleManLegs;
	public static Item skeleManBoots;
	public static Item grimReaperHead;
	public static Item grimReaperBody;
	public static Item grimReaperLegs;
	public static Item grimReaperBoots;

	public static Item crabClaw;
	public static Item aquaticPellets;
	public static Item corruptBullet;
	
	public static Item serenadeStriker;
	public static Item serenadeOfLife;
	public static Item serenadeOfDeath;
	
	public static Item netheriteHelmet;
	public static Item netheriteBody;
	public static Item netheriteLegs;
	public static Item netheriteBoots;
	
	public static Item crystonalHelmet;
	public static Item crystonalBody;
	public static Item crystonalLegs;
	public static Item crystonalBoots;
	
	public static Item krakenHelmet;
	public static Item krakenBody;
	public static Item krakenLegs;
	public static Item krakenBoots;
	
	public static Item infernoHelmet;
	public static Item infernoBody;
	public static Item infernoLegs;
	public static Item infernoBoots;
	
	public static Item bedrockHelmet;
	public static Item bedrockBody;
	public static Item bedrockLegs;
	public static Item bedrockBoots;
	
	public static Item plasmaHelmet;
	public static Item plasmaBody;
	public static Item plasmaLegs;
	public static Item plasmaBoots;
	
	public static Item realmiteHelmet;
	public static Item realmiteBody;
	public static Item realmiteLegs;
	public static Item realmiteBoots;
	
	public static Item eliteRealmiteHelmet;
	public static Item eliteRealmiteBody;
	public static Item eliteRealmiteLegs;
	public static Item eliteRealmiteBoots;
	
	public static Item diamondHelmet;
	public static Item diamondBoots;
	public static Item diamondLegs;
	public static Item diamondChest;
	
	public static Item hamreicher;
	public static Item netheriteChunk;
	public static Item krakenSkin;
	public static Item legendaryEnderEye;
	public static Item rupeeSword;
	public static Item shadowBar;
	
	public static Item realmitePickaxe;
	public static Item realmiteAxe;
	public static Item realmiteShovel;
	
	public static Item bedrockPickaxe;
	public static Item bedrockAxe;
	public static Item bedrockShovel;
	
	public static Item arlemitePickaxe;
	public static Item arlemiteAxe;
	public static Item arlemiteHoe;
	public static Item arlemiteShovel;
	public static Item arlemiteShicaxe;
	
	public static Item rupeePickaxe;
	public static Item rupeeAxe;
	public static Item rupeeShovel;
	public static Item rupeeHoe;
	public static Item rupeeShicaxe;
	
	public static Item dualClaw;
	public static Item aquaticMaul;
	public static Item massivence;

	public static Item donut;
	public static Item pizzaDough;
	public static Item bacon;
	public static Item waterMelon;
	public static Item cheese;
	public static Item miniPizza;
	public static Item dinner;
	public static Item boiledEgg;
	public static Item poisonBow;
	public static Item krakenScale;
	public static Item moltenLamp;
	public static Item blueFireLamp;
	public static Item divinePickaxe;
	public static Item divineAxe;
	public static Item divineShovel;
	public static Item shadowHelmet;
	public static Item shadowBody;
	public static Item shadowLegs;
	public static Item whiteMushroomSeeds;
	public static Item shadowBoots;
	public static Item angelicHelmet;
	public static Item angelicBody;
	public static Item angelicLegs;
	public static Item angelicBoots;
	public static Item callOfTheWatcher;
	public static Item mysteriousClock;
	public static Item hordeHorn;
	public static Item realmiteLamp;
	public static Item goldenLamp;
	public static Item diamondLamp;
	public static Item redstoneOreLamp;
	public static Item lapisLamp;
	public static Item netheriteLamp;
	public static Item pumpkinPie;
	public static Item empoweredMeatCooked;
	public static Item empoweredMeatRaw;
	public static Item twilightClock;
	public static Item serenadeHealth;
	public static Item seranadeGrowth;
	public static Item homeTeleporter;
	public static Item corruptedPickaxe;
	public static Item corruptedShovel;
	public static Item corruptedAxe;
	public static Item enderHelmet;
	public static Item enderBody;
	public static Item enderBoots;
	public static Item enderLegs;
	public static Item aquaticHelmet;
	public static Item aquaticBody;
	public static Item aquaticBoots;
	public static Item aquaticLegs;
	public static Item enderBow;
	public static Item ironBody;
	public static Item ironLegs;
	public static Item ironHelmet;
	public static Item ironBoots;
	public static Item flamingFury;
	public static ConfigHelper x;
	
	private static final int E = 22;
	public static void init() {
		
		initWeaponsAndTools();
		rupeeIngot = new ItemDivineRPG(x.rupeeID);
		tomato = new ItemDivineRPG(x.tomatoID);
		tomatoSeeds = new ItemDivineRPG(x.tomatoSeedsID);
		
		purpleFire = new ItemDivineRPG(x.purpleFireID);
		healingStone = new ItemDivineRPG(x.healingStoneID);
		sharkFin = new ItemDivineRPG(x.healingStoneID);
		whaleFin = new ItemDivineRPG(x.healingStoneID);
		purpleGlowBoneTree = new ItemDivineRPG(x.healingStoneID);
		pinkGlowBoneTree = new ItemDivineRPG(x.healingStoneID);


		arlemiteIngot = new ItemDivineRPG(x.healingStoneID);
		realmiteIngot = new ItemDivineRPG(x.healingStoneID);
		netheriteBar = new ItemDivineRPG(x.healingStoneID);
		hellStoneIngot = new ItemDivineRPG(x.healingStoneID);
		
		jungleShard = new ItemDivineRPG(x.greenShardID);
		divineShard = new ItemDivineRPG(x.yellowShardID);
		iceShard = new ItemDivineRPG(x.blueShardID);
		enderShard = new ItemDivineRPG(x.purpleShardID);
		moltenShard = new ItemDivineRPG(x.redShardID);
		corruptedShard = new ItemDivineRPG(x.corruptedShardsID);

		jungleStone = new ItemDivineRPG(x.jungleStoneID);
		divineStone = new ItemDivineRPG(x.divineStoneID);
		iceStone = new ItemDivineRPG(x.iceStoneID);
		enderStone = new ItemDivineRPG(x.enderStoneID);
		moltenStone = new ItemDivineRPG(x.moltenStoneID);
		corruptedStone = new ItemDivineRPG(x.corruptedStoneID);
		blueFireStone = new ItemDivineRPG(x.blueFireStoneID);

		divineHelm = new ItemDivineRPG(x.divineHeadID);
		divineBody = new ItemDivineRPG(x.divineBodyID);
		divineLegs = new ItemDivineRPG(x.divineLegsID);
		divineBoots = new ItemDivineRPG(x.divineBootsID);

		jackOManBoots = new ItemDivineRPG(x.jackOManBootsID);
		jackOManLegs = new ItemDivineRPG(x.jackOManLegsID);
		jackOManBody = new ItemDivineRPG(x.jackOManBodyID);
		jackOManHead = new ItemDivineRPG(x.jackOManHeadID);

		grimReaperHead = new ItemDivineRPG(x.grimReaperHeadID);
		grimReaperBody = new ItemDivineRPG(x.grimReaperBodyID);
		grimReaperLegs = new ItemDivineRPG(x.grimReaperLegsID);
		grimReaperBoots = new ItemDivineRPG(x.grimReaperBootsID);
		//addNames();
		initArmors();
	}
	public static void initWeaponsAndTools() {
		massivence = new ItemMassivence(x.massivenceID);
		palavence = new ItemPalavence(x.passivenceID);
		
		enderSword = new ItemDivineRPGSword(x.enderSwordID, EnumHelper.addToolMaterial("endersword", 0, -1, 0, 23, E), true).setIconIndex(1,41).setUnlocalizedName("enderSword").setCreativeTab(CreativeTabHelper.tabSword);

		bedrockMaul = new ItemDivineRPGSword(x.bedrockMaulID, 15, EnumHelper.addToolMaterial("bedrockmaul", 1, -1, 1.5F, 19, E), true).setUnlocalizedName("bedrock").setCreativeTab(CreativeTabHelper.tabSword);	
		sandSlash = new ItemSandSlash(x.sandSlashID, EnumHelper.addToolMaterial("sandslash", 0, 100, 0, 32, E));
		frostSword = new ItemFrostSword(x.frostSwordID, EnumHelper.addToolMaterial("frostsword", 0, 5000, 0, 10, E));
		slimeSword = new ItemSlimeSword(x.slimeSwordID, EnumHelper.addToolMaterial("slimesword", 0, 1000, 0, 11, E));
		arlemiteStabber = new ItemDivineRPGSword(x.arlemiteStabberID, EnumHelper.addToolMaterial("arlemitestabber", 0, 5000, 0, 6, E));
		rupeeRapier = new ItemRupeeSword(x.rupeeSwordID, EnumHelper.addToolMaterial("rupeesword", 0, 4000, 0, 9, E));
		realmiteSword = new ItemDivineRPGSword(x.realmiteSwordID, EnumHelper.addToolMaterial("realmitesword", 0, -1, 0, 6, E), true);
		poisonSaber = new ItemPoisonSaber(x.poisonSaberID, EnumHelper.addToolMaterial("poisonsaber", 0, 10000, 0, 16, E));
		infernoSword = new ItemInfernoSword(x.infernoSwordID, EnumHelper.addToolMaterial("infernosword", 0, -1, 0, 9, E));
		bedrockSword = new ItemDivineRPGSword(x.bedrockSwordID, EnumHelper.addToolMaterial("bedrocksword", 0, 14000, 0, 13, E));
		
		aquaticTrident = new ItemDivineRPGSword(x.aquaticTridentID, EnumHelper.addToolMaterial("aquatictrident", 0, 7000, 0, 15, E));
		oceanKnife = new ItemDivineRPGSword(x.oceanKnifeID, EnumHelper.addToolMaterial("aquaticknife", 0, 2000, 0, 14, E));
		aquaton = new ItemDivineRPGSword(x.aquatonID, EnumHelper.addToolMaterial("aquaton", 0, 10000, 0, 18, E));
		sharkSword = new ItemDivineRPGSword(x.sharkSwordID, EnumHelper.addToolMaterial("sharksword", 0, 2000, 0, 11, E));
		crabclawMaul = new ItemDivineRPGSword(x.crabClawMaulID, EnumHelper.addToolMaterial("crabclawmaul", 0, 8000, 0, 6, E), true).setUnlocalizedName("crabclawmaul").setCreativeTab(CreativeTabHelper.tabSword);	
		
		deathBringer = new ItemDivineRPGSword(x.deathBringerID, EnumHelper.addToolMaterial("deathbringer", 0, 6000, 0, 13, E));
		corruptedMaul = new ItemDivineRPGSword(x.corruptedMaulID, EnumHelper.addToolMaterial("corruptedmaul", 0, 6000, 0, 18, E));
		
		divineSword = new ItemDivineRPGSword(x.divineswordID, EnumHelper.addToolMaterial("divinesword", 0, -1, 0, 29, E), true);
		moltenSword = new ItemMoltenSword(x.moltenSwordID, EnumHelper.addToolMaterial("moltensword", 0, 5000, 0, 10, E));
		
		bluefirebow = new ItemBlueBow(x.bluefirebowID);
		shadowBow = new ItemShadowBow(x.shadowBowID);

		shuriken = new ItemShuriken(x.shurikenID);
		vileStorm = new ItemVailStorm(x.vialStormID);

		bowHeadAnchor = new ItemBaseAnchor(x.bowheadAnchorID, 6);
		sharkAnchor = new ItemBaseAnchor(x.sharkAnchorID, 5);
		crabAnchor = new ItemBaseAnchor(x.clawAnchorID,  4);
		scythe = new ItemScythe(x.scytheID);
		frostCannon = new ItemFrostCannon(x.frostCannonID);
		soundOfMusic = new ItemSoundMusic(x.soundOfMusicID);
		crabClawCannon = new ItemCrabCannon(x.crabClawCannonID, 22, 1, Block.cactus.blockID, 5, "xolovon.maelstrom", "xolovon.maelstrom").setUnlocalizedName("crabclawcannon").setCreativeTab(CreativeTabHelper.tabRanged);
		bowheadCannon = new ItemBowCannon(x.bowheadCannonID, 16, 1, Block.cactus.blockID, 3, "xolovon.maelstrom", "xolovon.maelstrom");//.setIconIndex(28).setItemName("bowheadcannon").setCreativeTab(tabRanged);
		soundOfMusic = new ItemSoundMusic(x.soundOfMusicID);
		maelstrom = new ItemMaelstrom(x.mailStromID, 5, 1, 2, "xolovon.maelstrom", "xolovon.maelstrom");
		ghastCannon = new ItemDivineRPG(x.ghastCannonID);
		corruptCannon = new ItemDivineRPG(x.corruptCannonID);

		serenadeStriker = new ItemSerenadeStriker(x.serenadeStrikerID);
		serenadeOfLife = new ItemSerenadeGrowth(x.growthSerenadeID).setIconIndex(1,225).setUnlocalizedName("serenadeLife").setCreativeTab(CreativeTabHelper.tabHerb);
		LanguageRegistry.addName(serenadeOfLife, "Serenade of Life");
		serenadeOfDeath = new ItemSerenadeDeath(x.seranadeDeathID);
		serenadeHealth = new ItemSerenadeHealth(x.serenadeHealthID);
		
		
	}
	private static void initArmors() {
		final int HEAD = 0;
		final int BODY = 1;
		final int LEGS = 2;
		final int BOOTS = 3;
		// Armour materials
		EnumArmorMaterial angelic = EnumHelper.addArmorMaterial("Angelic", 200, new int[] {3, 4, 3, 2}, E);
		EnumArmorMaterial realmite = EnumHelper.addArmorMaterial("realmite", 200, new int[] {3, 4, 3, 2}, E);
		String[] angelicDesc = {"12.5% Damage reduction", "Unbreakable", "Full Set: Allows flight", "Full Set: No fall damage"};
		String[] realmiteDesc = {"8.25% Damage reduction", "Unbreakable"};
		String[] eliteRealmiteDesc = {"12.5% Damage reduction", "Unbreakable", "Full Set: No fall damage"};
		String[] arlemiteDesc = {"12.5% Damage reduction", "Unbreakable", "Full Set: 80% Ranged damage protection"};
		String[] krakenDesc = {"7.5% Damage reduction", "Unbreakable", "Full Set: Breathe underwater"};
		String[] rupeeDesc = {"13.75% Damage reduction", "Unbreakable", "Full Set: 80% Melee damage protection"};
		String[] aquaticDesc = {"13.75% Damage reduction", "Unbreakable", "Full Set: Breathe underwater", "Full Set: Swim faster"};
		String[] shadowDesc = {"15% Damage reduction", "Unbreakable", "Full Set: Move faster"};
		
		// Angelic
		angelicBody = new ItemBasicArmor(x.angelicBodyID, angelic, 4, BODY).setDamageReduction(0.125D).setDescriptors(angelicDesc).setIconIndex(2,88).setUnlocalizedName("angelicbody").setCreativeTab(CreativeTabHelper.tabArmor);
		angelicHelmet = new ItemBasicArmor(x.angelicHeadID, angelic, 3, HEAD).setDamageReduction(0.125D).setDescriptors(angelicDesc).setIconIndex(2, 87).setUnlocalizedName("angelichelm").setCreativeTab(CreativeTabHelper.tabArmor);
		angelicLegs = new ItemBasicArmor(x.angelicLegsID, angelic, 3, LEGS).setDamageReduction(0.125D).setDescriptors(angelicDesc).setIconIndex(2,89).setUnlocalizedName("angelicLegs").setCreativeTab(CreativeTabHelper.tabArmor);
		angelicBoots = new ItemBasicArmor(x.angelicBootsID, angelic, 2, BOOTS).setDamageReduction(0.125D).setDescriptors(angelicDesc).setIconIndex(2, 90).setUnlocalizedName("angelicboots").setCreativeTab(CreativeTabHelper.tabArmor);
		// Normal Realmite
		//realmiteHelmet = new ItemBasicArmor(, var2, var3, var4)
		
	}
	public static void addNames()
	{
		LanguageRegistry.addName(bedrockMaul, "Bedrock Maul");
		LanguageRegistry.addName(soundOfMusic, "Sound of Music");
		LanguageRegistry.addName(jungleShard, "Jungle Shards");
		LanguageRegistry.addName(shuriken, "Shuriken");
		LanguageRegistry.addName(namkormira, "Massivence");
		LanguageRegistry.addName(serenadeStriker, "Serenade of Strikes");
		LanguageRegistry.addName(slimeSword, "Slime Sword");
		LanguageRegistry.addName(shadowBow, "Shadow Bow");
		LanguageRegistry.addName(crabClawCannon, "Crabclaw Cannon");
		LanguageRegistry.addName(frostCannon, "Frost Cannon");
		LanguageRegistry.addName(frostSword, "Frost Sword");
		LanguageRegistry.addName(divineSword, "Divine Sword");
		LanguageRegistry.addName(sandSlash, "Sandslash");
		LanguageRegistry.addName(iceShard, "Corrupted Shards");
		LanguageRegistry.addName(iceShard, "Frozen Shards");
		LanguageRegistry.addName(divineShard, "Divine Shards");
		LanguageRegistry.addName(enderSword, "Ender Sword");
		LanguageRegistry.addName(divineHelm, "Divine Helmet");
		LanguageRegistry.addName(divineBody, "Divine Body");
		LanguageRegistry.addName(divineLegs, "Divine Legs");
		LanguageRegistry.addName(divineBoots, "Divine Boots");
		
		LanguageRegistry.addName(enderSword, "Ender Sword");

		
		LanguageRegistry.addName(bluefirebow, "Bluefire Bow");
		LanguageRegistry.addName(rupeeIngot, "Rupee");
		LanguageRegistry.addName(tomato, "Tomato");
		LanguageRegistry.addName(tomatoSeeds, "Tomato Seeds");
		LanguageRegistry.addName(purpleFire, "Purple Blaze");
		LanguageRegistry.addName(jackOManBoots, "Jack-O-Man Boots");
		LanguageRegistry.addName(jackOManLegs, "Jack-O-Man Legs");
		LanguageRegistry.addName(jackOManBody, "Jack-O-Man Body");
		LanguageRegistry.addName(jackOManHead, "Jack-O-Man Head");
		LanguageRegistry.addName(scythe, "Scythe");
		LanguageRegistry.addName(sharkAnchor, "Shark Anchor");
		LanguageRegistry.addName(healingStone, "Healing Stone");
	}


}
