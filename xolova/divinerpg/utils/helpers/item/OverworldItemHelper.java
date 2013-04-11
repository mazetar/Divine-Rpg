package xolova.divinerpg.utils.helpers.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.utils.helpers.config.OverworldConfigHelper;

public class OverworldItemHelper 
{
	public static Item bedrockMaul;
	public static Item soundOfMusic;
	public static Item greenShard;
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
	public static Item blueShard;
	public static Item iceShard;
	public static Item yellowShard;
	
	public static Item divineHelm;
	public static Item divineBody;
	public static Item divineLegs;
	public static Item divineBoots;
	
	public static Item enderSword;
	public static Item enderSwordYellow;
	public static Item enderSwordGreen;
	public static Item enderSwordRed;
	public static Item enderSwordBlue;
	
	public static Item bluefirebow;
	public static Item rupee;
	public static Item tomato;
	public static Item tomatoSeeds;
	public static Item purpleFire;
	public static Item jackOManBoots;
	public static Item jackOManLegs;
	public static Item jackOManBody;
	public static Item jackOManHead;
	public static Item scythe;
	public static Item sharkAnchor;
	public static Item healingStone;
	
	public static OverworldConfigHelper x;
	
	public static void InitItemsOverworld()
	{
		bedrockMaul = new ItemDivineRPG(x.bedrockMaulID);
		soundOfMusic = new ItemDivineRPG(x.soundOfMusicID);
		greenShard = new ItemDivineRPG(x.greenShardID);
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
		blueShard = new ItemDivineRPG(x.blueShardID);
		iceShard = new ItemDivineRPG(x.iceShardID);
		yellowShard = new ItemDivineRPG(x.yellowShardID);
		
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
		LanguageRegistry.addName(greenShard, "");
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
		LanguageRegistry.addName(blueShard, "");
		LanguageRegistry.addName(iceShard, "");
		LanguageRegistry.addName(yellowShard, "");
		
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
