package xolova.divinerpg.utils.helpers.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.utils.helpers.config.OverworldConfigHelper;

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
	public static Item aquaticPellets;
	public static Item corruptBullet;
	
	public static OverworldConfigHelper x;
	
	{
		bedrockMaul = new ItemDivineRPG(x.bedrockMaulID);
		soundOfMusic = new ItemDivineRPG(x.soundOfMusicID);
		jungleShard = new ItemDivineRPG(x.greenShardID);
		shuriken = new ItemDivineRPG(x.shurikenID);
		namkormira = new ItemDivineRPG(x.namkormiraID);
		serenadeStriker = new ItemDivineRPG(x.serenadeStrikerID);
		slimeSword = new ItemDivineRPG(x.slimeSwordID);
		shadowBow = new ItemDivineRPG(x.shadowBowID);
		crabClawCannon = new ItemDivineRPG(x.crabClawCannonID);
		frostCannon = new ItemDivineRPG(x.frostCannonID);
		frostSword = new ItemDivineRPG(x.frostSwordID);
		divinesword = new ItemDivineRPG(x.divineswordID);
		sandSlash = new ItemDivineRPG(x.sandSlashID);
		iceShard = new ItemDivineRPG(x.iceShardID);
		divineShard = new ItemDivineRPG(x.yellowShardID);
		
		divineHelm = new ItemDivineRPG(x.divineHelmID);
		divineBody = new ItemDivineRPG(x.divineBodyID);
		divineLegs = new ItemDivineRPG(x.divineLegsID);
		divineBoots = new ItemDivineRPG(x.divineBootsID);
		
		enderSword = new ItemDivineRPG(x.enderSwordID);
		enderSwordYellow = new ItemDivineRPG(x.enderSwordYellowID);
		enderSwordGreen = new ItemDivineRPG(x.enderSwordGreenID);
		enderSwordRed = new ItemDivineRPG(x.enderSwordRedID);
		enderSwordBlue = new ItemDivineRPG(x.enderSwordBlueID);
		
		bluefirebow = new ItemDivineRPG(x.bluefirebowID);
		rupee = new ItemDivineRPG(x.rupeeID);
		tomato = new ItemDivineRPG(x.tomatoID);
		tomatoSeeds = new ItemDivineRPG(x.tomatoSeedsID);
		purpleFire = new ItemDivineRPG(x.purpleFireID);
		jackOManBoots = new ItemDivineRPG(x.jackOManBootsID);
		jackOManLegs = new ItemDivineRPG(x.jackOManLegsID);
		jackOManBody = new ItemDivineRPG(x.jackOManBodyID);
		jackOManHead = new ItemDivineRPG(x.jackOManHeadID);
		scythe = new ItemDivineRPG(x.scytheID);
		sharkAnchor = new ItemDivineRPG(x.sharkAnchorID);
		healingStone = new ItemDivineRPG(x.healingStoneID);
	}
	
	public static void AddNames()
	{
		LanguageRegistry.addName(bedrockMaul, "");
		LanguageRegistry.addName(soundOfMusic, "");
		LanguageRegistry.addName(jungleShard, "");
		LanguageRegistry.addName(shuriken, "");
		LanguageRegistry.addName(namkormira, "");
		LanguageRegistry.addName(serenadeStriker, "");
		LanguageRegistry.addName(slimeSword, "");
		LanguageRegistry.addName(shadowBow, "");
		LanguageRegistry.addName(crabClawCannon, "");
		LanguageRegistry.addName(frostCannon, "");
		LanguageRegistry.addName(frostSword, "");
		LanguageRegistry.addName(divinesword, "");
		LanguageRegistry.addName(sandSlash, "");
		LanguageRegistry.addName(iceShard, "");
		LanguageRegistry.addName(divineShard, "");
		
		LanguageRegistry.addName(divineHelm, "");
		LanguageRegistry.addName(divineBody, "");
		LanguageRegistry.addName(divineLegs, "");
		LanguageRegistry.addName(divineBoots, "");
		
		LanguageRegistry.addName(enderSword, "");
		LanguageRegistry.addName(enderSwordYellow, "");
		LanguageRegistry.addName(enderSwordGreen, "");
		LanguageRegistry.addName(enderSwordRed, "");
		LanguageRegistry.addName(enderSwordBlue, "");
		
		LanguageRegistry.addName(bluefirebow, "");
		LanguageRegistry.addName(rupee, "");
		LanguageRegistry.addName(tomato, "");
		LanguageRegistry.addName(tomatoSeeds, "");
		LanguageRegistry.addName(purpleFire, "");
		LanguageRegistry.addName(jackOManBoots, "");
		LanguageRegistry.addName(jackOManLegs, "");
		LanguageRegistry.addName(jackOManBody, "");
		LanguageRegistry.addName(jackOManHead, "");
		LanguageRegistry.addName(scythe, "");
		LanguageRegistry.addName(sharkAnchor, "");
		LanguageRegistry.addName(healingStone, "");
	}
}
