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
	public static Item serenadeStriker;
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
	public static Item enderShard;
	public static Item jungleShard;
	public static Item iceShard;
	public static Item divineShard;
	public static Item moltenShard;
	public static Item corruptedShards;
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
	public static Item aquaticShards;
	public static Item corruptBullet;
	
	
	public static Item aquaticStones;
	public static Item shadowBar;
	public static Item netheriteChunk;
	public static Item krakenSkin;
	public static Item aquaticTrident;
	public static Item aquaton;
	public static Item hamreicher;
	public static Item sharkSword;
	public static Item bowheadCannon;
	public static Item oceanKnife;
	public static Item dualClaw;
	public static Item daggerOfBlood;
	public static Item clawAnchor;
	public static Item bowheadAnchor;
	public static Item Pavalence;
	public static Item legendaryEnderEye;
	public static Item infernoSword;
	public static Item realmiteSword;
	public static Item bedrockSword;
	public static Item arlemiteStabber;
	public static Item rupeeSword;
	public static Item furyMaul;
	
	public static Item realmitePickaxe;
	public static Item realmiteAxe;
	public static Item realmiteShovel;
	
	public static Item bedrockPickaxe;
	public static Item bedrockAxe;
	public static Item bedrockShovel;

	public static Item crystalPickaxe;
	public static Item crystalAxe;
	public static Item crystalShovel;
	public static Item crystalHoe;
	public static Item crystalShicaxe;
	
	public static Item plasmaPickaxe;
	public static Item plasmaAxe;
	public static Item plasmaShovel;
	public static Item plasmaHoe;
	public static Item plasmaShicaxe;
	
	public static Item blazingCrystalleSword;
	public static Item donut;
	public static Item pizzaDough;
	public static Item bacon;
	public static Item waterMelon;
	public static Item cheese;
	public static Item minipizza;
	public static Item dinner;
	public static Item boiledegg;
	
	public static OverworldConfigHelper x;
	
	{
        EnumToolMaterial BedrockMaul = EnumHelper.addToolMaterial("bedrockmaul", 1, -1, 1.5F, 19, 10);
        bedrockMaul = new ItemDivineRPGSword(x.bedrockMaulID, 15, BedrockMaul, false).setUnlocalizedName("bedrock").setCreativeTab(CreativeTabHelper.tabSword);
		jungleShard = new ItemDivineRPG(x.greenShardID);
		namkormira = new ItemDivineRPG(x.namkormiraID);
		serenadeStriker = new ItemDivineRPG(x.serenadeStrikerID);
		slimeSword = new ItemDivineRPG(x.slimeSwordID);
		crabClawCannon = new ItemDivineRPG(x.crabClawCannonID);
		frostSword = new ItemDivineRPG(x.frostSwordID);
		divinesword = new ItemDivineRPG(x.divineswordID);
		sandSlash = new ItemDivineRPG(x.sandSlashID);
		
		enderSword = new ItemDivineRPG(x.enderSwordID);
		enderSwordYellow = new ItemDivineRPG(x.enderSwordYellowID);
		enderSwordGreen = new ItemDivineRPG(x.enderSwordGreenID);
		enderSwordRed = new ItemDivineRPG(x.enderSwordRedID);
		enderSwordBlue = new ItemDivineRPG(x.enderSwordBlueID);
		
		shuriken = new ItemDivineRPG(x.shurikenID);
		shadowBow = new ItemDivineRPG(x.shadowBowID);
		frostCannon = new ItemDivineRPG(x.frostCannonID);
		soundOfMusic = new ItemDivineRPG(x.soundOfMusicID);
		bluefirebow = new ItemDivineRPG(x.bluefirebowID);
		sharkAnchor = new ItemDivineRPG(x.sharkAnchorID);
		scythe = new ItemDivineRPG(x.scytheID);
		
		rupee = new ItemDivineRPG(x.rupeeID);
		tomato = new ItemDivineRPG(x.tomatoID);
		tomatoSeeds = new ItemDivineRPG(x.tomatoSeedsID);
		purpleFire = new ItemDivineRPG(x.purpleFireID);
		healingStone = new ItemDivineRPG(x.healingStoneID);
		
		divineShard = new ItemDivineRPG(x.yellowShardID);
		iceShard = new ItemDivineRPG(x.iceShardID);

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
