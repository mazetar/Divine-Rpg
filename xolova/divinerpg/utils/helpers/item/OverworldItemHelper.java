package xolova.divinerpg.utils.helpers.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.items.core.ItemDivineRPGSword;
import xolova.divinerpg.utils.helpers.config.OverworldConfigHelper;
import xolova.divinerpg.utils.helpers.gui.CreativeTabHelper;
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
	public static Item divinesword;
	public static Item sandSlash;
	public static Item watcherEye;
	public static Item infernoBow;
	public static Item bluefirebow;
	
	private static Item palavence;
	private static Item moltenSword;
	private static Item arlemiteStabber;
	private static Item rupeeRapier;
	private static Item realmiteSword;
	private static Item poisonSaber;
	private static Item infernoSword;
	private static Item bedrockSword;
	private static Item aquaticDagger;
	private static Item aquaticTrident;
	private static Item oceanKnife;
	private static Item aquaton;
	private static Item sharkSword;
	private static Item crabclawMaul;
	private static Item deathBringer;
	private static Item corruptedMaul;
	private static Item scorchingSword;
	private static Item bluefireSword;
	private static Item divineSword;
	private static Item bloodgemSword;
	private static Item vileStorm;
	private static Item bowHeadAnchor;
	private static Item crabAnchor;
	private static Item bowheadCannon;
	private static Item maelstrom;
	private static Item ghastCannon;
	private static Item corruptCannon;

	public static Item enderShard;
	public static Item jungleShard;
	public static Item iceShard;
	public static Item divineShard;
	public static Item moltenShard;
	public static Item corruptedShard;

	public static Item enderStone;
	public static Item jungleStone;
	public static Item iceStone;
	public static Item divineStone;
	public static Item moltenStone;
	public static Item shadowStone;
	public static Item corruptedStone;
	public static Item blueFireStone;
	
	public static Item divineHelm;
	public static Item divineBody;
	public static Item divineLegs;
	public static Item divineBoots;
	
	public static Item enderSword;
	public static Item enderSwordYellow;
	public static Item enderSwordGreen;
	public static Item enderSwordRed;
	public static Item enderSwordBlue;

	public static Item rupee;
	public static Item arlemite;
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
	
	public static OverworldConfigHelper x;
	
	{
        EnumToolMaterial BedrockMaul = EnumHelper.addToolMaterial("bedrockmaul", 1, -1, 1.5F, 19, 10);
        
        namkormira = new ItemDivineRPG(x.namkormiraID);
        palavence = new ItemDivineRPG(x.palavenceID);
		
		enderSword = new ItemDivineRPG(x.enderSwordID);
		enderSwordYellow = new ItemDivineRPG(x.enderSwordYellowID);
		enderSwordGreen = new ItemDivineRPG(x.enderSwordGreenID);
		enderSwordRed = new ItemDivineRPG(x.enderSwordRedID);
		enderSwordBlue = new ItemDivineRPG(x.enderSwordBlueID);

		bedrockMaul = new ItemDivineRPGSword(x.bedrockMaulID, 15, BedrockMaul, true).setUnlocalizedName("bedrock").setCreativeTab(CreativeTabHelper.tabSword);	
		sandSlash = new ItemDivineRPG(x.sandSlashID);
		frostSword = new ItemDivineRPG(x.frostSwordID);
		divinesword = new ItemDivineRPG(x.divineswordID);
		slimeSword = new ItemDivineRPG(x.slimeSwordID);
		arlemiteStabber = new ItemDivineRPG(x.arlemiteStabberID);
		rupeeRapier = new ItemDivineRPG(x.rupeeRapierID);
		realmiteSword = new ItemDivineRPG(x.realmiteSwordID);
		poisonSaber = new ItemDivineRPG(x.poisonSaberID);
		infernoSword = new ItemDivineRPG(x.infernoSwordID);
		bedrockSword = new ItemDivineRPG(x.bedrockSwordID);
		
		aquaticDagger = new ItemDivineRPG(x.aquaticDaggerID);
		aquaticTrident = new ItemDivineRPG(x.aquaticTridentID);
		oceanKnife = new ItemDivineRPG(x.oceanKnifeID);
		aquaton = new ItemDivineRPG(x.aquatonID);
		sharkSword = new ItemDivineRPG(x.sharkSwordID);
		crabclawMaul = new ItemDivineRPGSword(x.crabclawMaulID, 15, CrabclawMaul, true).setUnlocalizedName("bedrock").setCreativeTab(CreativeTabHelper.tabSword);	
		
		deathBringer = new ItemDivineRPG(x.deathBringerID);
		corruptedMaul = new ItemDivineRPG(x.corruptedMaulID);
		
		scorchingSword = new ItemDivineRPG(x.scorchingSwordID);
		bluefireSword = new ItemDivineRPG(x.bluefireSwordID);
		divineSword = new ItemDivineRPG(x.divineSwordID);
		bloodgemSword = new ItemDivineRPG(x.bloodgemSwordID);
		moltenSword = new ItemDivineRPG(x.moltenSwordID);
		
		
		bluefirebow = new ItemDivineRPG(x.bluefirebowID);
		shadowBow = new ItemDivineRPG(x.shadowBowID);

		shuriken = new ItemDivineRPG(x.shurikenID);
		vileStorm = new ItemDivineRPG(x.vileStormID);

		bowHeadAnchor = new ItemDivineRPG(x.bowHeadAnchor);
		sharkAnchor = new ItemDivineRPG(x.sharkAnchorID);
		crabAnchor = new ItemDivineRPG(x.crabAnchorID);
		scythe = new ItemDivineRPG(x.scytheID);
		frostCannon = new ItemDivineRPG(x.frostCannonID);
		soundOfMusic = new ItemDivineRPG(x.soundOfMusicID);
		crabClawCannon = new ItemDivineRPG(x.crabClawCannonID);
		bowheadCannon = new ItemDivineRPG(x.bowheadCannonID);
		soundOfMusic = new ItemDivineRPG(x.soundOfMusicID);
		maelstrom = new ItemDivineRPG(x.maelstromID);
		ghastCannon = new ItemDivineRPG(x.ghastCannonID);
		corruptCannon = new ItemDivineRPG(x.corruptCannonID);

		serenadeStriker = new ItemDivineRPG(x.serenadeStrikerID);
		serenadeOfLife = new ItemDivineRPG(x.serenadeOfLifeID);
		serenadeOfDeath = new ItemDivineRPG(x.serenadeOfDeathID);
		
		rupee = new ItemDivineRPG(x.rupeeID);
		tomato = new ItemDivineRPG(x.tomatoID);
		tomatoSeeds = new ItemDivineRPG(x.tomatoSeedsID);
		
		purpleFire = new ItemDivineRPG(x.purpleFireID);
		healingStone = new ItemDivineRPG(x.healingStoneID);
		sharkFin = new ItemDivineRPG(x.healingStoneID);
		whaleFin = new ItemDivineRPG(x.healingStoneID);
		purpleGlowBoneTree = new ItemDivineRPG(x.healingStoneID);
		pinkGlowBoneTree = new ItemDivineRPG(x.healingStoneID);
		
		sharkAnchor = new ItemDivineRPG(x.healingStoneID);
		scythe = new ItemDivineRPG(x.healingStoneID);

		rupee = new ItemDivineRPG(x.healingStoneID);
		arlemite = new ItemDivineRPG(x.healingStoneID);
		realmiteIngot = new ItemDivineRPG(x.healingStoneID);
		netheriteBar = new ItemDivineRPG(x.healingStoneID);
		hellStoneIngot = new ItemDivineRPG(x.healingStoneID);
		
		jungleShard = new ItemDivineRPG(x.greenShardID);
		divineShard = new ItemDivineRPG(x.yellowShardID);
		iceShard = new ItemDivineRPG(x.iceShardID);
		enderShard = new ItemDivineRPG(x.iceShardID);
		moltenShard = new ItemDivineRPG(x.iceShardID);
		corruptedShard = new ItemDivineRPG(x.iceShardID);

		jungleStone = new ItemDivineRPG(x.jungleStoneID);
		divineStone = new ItemDivineRPG(x.divineStoneID);
		iceStone = new ItemDivineRPG(x.iceStoneID);
		enderStone = new ItemDivineRPG(x.enderStoneID);
		moltenStone = new ItemDivineRPG(x.moltenStoneID);
		corruptedStone = new ItemDivineRPG(x.corruptedStoneID);
		blueFireStone = new ItemDivineRPG(x.blueFireStoneID);

		divineHelm = new ItemDivineRPG(x.divineHelmID);
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
	}
	
	public static void AddNames()
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
		LanguageRegistry.addName(divinesword, "Divine Sword");
		LanguageRegistry.addName(sandSlash, "Sandslash");
		LanguageRegistry.addName(iceShard, "Corrupted Shards");
		LanguageRegistry.addName(iceShard, "Frozen Shards");
		LanguageRegistry.addName(divineShard, "Divine Shards");
		
		LanguageRegistry.addName(divineHelm, "Divine Helmet");
		LanguageRegistry.addName(divineBody, "Divine Body");
		LanguageRegistry.addName(divineLegs, "Divine Legs");
		LanguageRegistry.addName(divineBoots, "Divine Boots");
		
		LanguageRegistry.addName(enderSword, "Ender Sword");
		LanguageRegistry.addName(enderSwordYellow, "Yellow Sword");
		LanguageRegistry.addName(enderSwordGreen, "Green Endersword");
		LanguageRegistry.addName(enderSwordRed, "Red Endersword");
		LanguageRegistry.addName(enderSwordBlue, "Blue Endersword");
		
		LanguageRegistry.addName(bluefirebow, "Bluefire Bow");
		LanguageRegistry.addName(rupee, "Rupee");
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
}
