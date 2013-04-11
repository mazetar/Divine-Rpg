package xolova.divinerpg.utils.helpers.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class OverworldConfigHelper 
{
	//-==-BLOCKS-==-//
	
	public static void init(FMLPreInitializationEvent event)
	{
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGOverworld.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		InitConfigItems(config);
		
		config.save();
	}
	
	public static int bedrockMaulID;
	public static int soundOfMusicID;
	public static int greenShardID;
	public static int shurikenID;
	public static int namkormiraID;
	public static int serenadeStrikerID;
	public static int slimeSwordID;
	public static int shadowBowID;
	public static int crabClawCannonID;
	public static int frostCannonID;
	public static int frostSwordID;
	public static int divineswordID;
	public static int sandSlashID;
	public static int blueShardID;
	public static int iceShardID;
	public static int yellowShardID;
	
	public static int divineHelmID;
	public static int divineBodyID;
	public static int divineLegsID;
	public static int divineBootsID;
	
	public static int enderSwordID;
	public static int enderSwordYellowID;
	public static int enderSwordGreenID;
	public static int enderSwordRedID;
	public static int enderSwordBlueID;
	
	public static int bluefirebowID;
	public static int rupeeID;
	public static int tomatoID;
	public static int tomatoSeedsID;
	public static int purpleFireID;
	public static int jackOManBootsID;
	public static int jackOManLegsID;
	public static int jackOManBodyID;
	public static int jackOManHeadID;
	public static int scytheID;
	public static int sharkAnchorID;
	public static int healingStoneID;
	
	public static void InitConfigItems(Configuration config)
	{
		int id = 6666;
		bedrockMaulID = config.getItem("bedrockMaul", id++).getInt();
		soundOfMusicID = config.getItem("soundOfMusic", id++).getInt();
		greenShardID = config.getItem("greenShard", id++).getInt();
		shurikenID = config.getItem("shuriken", id++).getInt();
		namkormiraID = config.getItem("namkormira", id++).getInt();
		serenadeStrikerID = config.getItem("serenadeStriker", id++).getInt();
		slimeSwordID = config.getItem("slimeSword", id++).getInt();
		shadowBowID = config.getItem("shadowBow", id++).getInt();
		crabClawCannonID = config.getItem("crabClawCannon", id++).getInt();
		frostCannonID = config.getItem("frostCannon", id++).getInt();
		frostSwordID = config.getItem("frostSword", id++).getInt();
		divineswordID = config.getItem("divinesword", id++).getInt();
		sandSlashID = config.getItem("sandSlash", id++).getInt();
		blueShardID = config.getItem("blueShard", id++).getInt();
		iceShardID = config.getItem("iceShard", id++).getInt();
		yellowShardID = config.getItem("yellowShard", id++).getInt();
		
		divineHelmID = config.getItem("divineHelm", id++).getInt();
		divineBodyID = config.getItem("divineBody", id++).getInt();
		divineLegsID = config.getItem("divineLegs", id++).getInt();
		divineBootsID = config.getItem("divineBoots", id++).getInt();
		
		enderSwordID = config.getItem("enderSword", id++).getInt();
		enderSwordYellowID = config.getItem("enderSwordYellow", id++).getInt();
		enderSwordGreenID = config.getItem("enderSwordGreen", id++).getInt();
		enderSwordRedID = config.getItem("enderSwordRed", id++).getInt();
		enderSwordBlueID = config.getItem("enderSwordBlue", id++).getInt();
	
		bluefirebowID = config.getItem("bluefirebow", id++).getInt();
		rupeeID = config.getItem("rupee", id++).getInt();
		tomatoID = config.getItem("tomato", id++).getInt();
		tomatoSeedsID = config.getItem("tomatoSeeds", id++).getInt();
		purpleFireID = config.getItem("purpleFire", id++).getInt();
		jackOManBootsID = config.getItem("jackOManBoots", id++).getInt();
		jackOManLegsID = config.getItem("jackOManLegs", id++).getInt();
		jackOManBodyID = config.getItem("jackOManBody", id++).getInt();
		jackOManHeadID = config.getItem("jackOManHead", id++).getInt();
		scytheID = config.getItem("scythe", id++).getInt();
		sharkAnchorID = config.getItem("sharkAnchor", id++).getInt();
		healingStoneID = config.getItem("healingStone", id++).getInt();
	}
}
