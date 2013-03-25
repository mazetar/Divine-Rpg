package xolova.divinerpg.utils.helpers.config;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;

public class IceikaConfigHelper 
{
	public static int FrostedStoneID;
	public static int FrostedDirtID;
	public static int FrostedGrassID;
	public static int FrostedWoodID;
	public static int FrostedLeavesID;
	public static int IcyStoneID;
	public static int IcyBricksID;
	public static int SnowyBricksID;
	public static int CoalstoneID;
	public static int CoalstoneFurnaceID;
	public static int WorkshopCarpetID;
	public static int WorkshopBookcaseID;
	public static int WorkshopLampID;
	public static int FrostedGlassID;
	public static int SteelDoorID;
	public static int FrostedChestID;
	public static int XmasTreeLightsID;
	public static int FrozenDungeonSpawnerID;
	public static int RedXmasLightsID;
	public static int GreenXmasLightsID;
	public static int BlueXmasLightsID;
	public static int YellowXmasLightsID;
	public static int PurpleXmasLightsID;
	public static int RedCandyCaneID;
	public static int GreenCandyCaneID;
	public static int BlueCandyCaneID;
	public static int YellowCandyCaneID;
	public static int PurpleCandyCaneID;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGIceika.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		FrostedStoneID = config.getBlock("Frosted Stone", 721).getInt();
		FrostedDirtID = config.getBlock("Frosted Dirt", 200).getInt();
		FrostedGrassID = config.getBlock("Frosted Grass", 201).getInt();
		FrostedWoodID = config.getBlock("Frosted Wood", 720).getInt();
		FrostedLeavesID = config.getBlock("Frosted Leaves", 718).getInt();
		IcyStoneID = config.getBlock("Icy Stone", 203).getInt();
		IcyBricksID = config.getBlock("Icy Bricks", 719).getInt();
		SnowyBricksID = config.getBlock("Snowy Bricks", 719).getInt();
		CoalstoneID = config.getBlock("Coalstone", 731).getInt();
		CoalstoneFurnaceID = config.getBlock("Coalstone Furnace", 727).getInt();
		WorkshopCarpetID = config.getBlock("Workshop Carpet", 730).getInt();
		WorkshopBookcaseID = config.getBlock("Workshop Bookcase", 723).getInt();
		WorkshopLampID = config.getBlock("Workshop Lamp", 729).getInt();
		FrostedGlassID = config.getBlock("Frosted Glass", 726).getInt();
		SteelDoorID = config.getBlock("Steel Door", 725).getInt();
		FrostedChestID = config.getBlock("Frosted Chest", 728).getInt();
		XmasTreeLightsID = config.getBlock("Xmas Light Leaves", 732).getInt();
		FrozenDungeonSpawnerID = config.getBlock("Glacide Spawner", 749).getInt();
		RedXmasLightsID = config.getBlock("Red Xmas Lights", 743).getInt();
		GreenXmasLightsID = config.getBlock("Green Xmas Lights", 744).getInt();
		BlueXmasLightsID = config.getBlock("Blue Xmas Lights", 745).getInt();
		YellowXmasLightsID = config.getBlock("Yellow Xmas Lights", 746).getInt();
		PurpleXmasLightsID = config.getBlock("Purple Xmas Lights", 747).getInt();
		RedCandyCaneID = config.getBlock("Red Candy Cane", 700).getInt();
		GreenCandyCaneID = config.getBlock("Green Candy Cane", 701).getInt();
		BlueCandyCaneID = config.getBlock("Blue Candy Cane", 702).getInt();
		YellowCandyCaneID = config.getBlock("Yellow Candy Cane", 703).getInt();
		PurpleCandyCaneID = config.getBlock("Purple Candy Cane", 704).getInt();

		initConfigItems(event, config);
		
		config.save();
	}
	
	public static int SnowflakeShurikenID;
	public static int FrossivenceID;
	public static int SerenadeOfIceID;
	public static int GlacierSwordID;
	public static int IcicleBowID;
	public static int IcicleBaneID;
	public static int FrostclawCannonID;
	public static int FractiteCannonID;
	public static int FrostkingSwordID;
	public static int SoundOfCarolsID;
	public static int EndericeID;
	public static int SnowstormBowID;
	public static int IcineSwordID;
	public static int FrozenMaulID;
	public static int SnowslashID;
	public static int PeppermintsID;
	public static int EggNogID;
	public static int ChocolateLogID;
	public static int SnowconesID;
	public static int FruitCakeID;
	public static int SnowflakeID;
	public static int SantaHeadID;
	public static int SantaBodyID;
	public static int SantaLegsID;
	public static int SantaBootsID;
	
	public static void initConfigItems(FMLPreInitializationEvent event, Configuration config)
	{
		SnowflakeShurikenID = config.getItem("Snowflake Shuriken", 5751).getInt();
		FrossivenceID = config.getItem("Frossivence", 5742).getInt();
		SerenadeOfIceID = config.getItem("Serenade Of Ice", 5745).getInt();
		GlacierSwordID = config.getItem("Glacier Sword", 5490).getInt();
		IcicleBowID = config.getItem("Icicle Bow", 5752).getInt();
		IcicleBaneID = config.getItem("Icicle Bane", 5483).getInt();
		FrostclawCannonID = config.getItem("Frostclaw Cannon", 5749).getInt();
		FractiteCannonID = config.getItem("Fractite Cannon", 5750).getInt();
		FrostkingSwordID = config.getItem("Frostking Sword", 5747).getInt();
		SoundOfCarolsID = config.getItem("Sound of Carols", 5740).getInt();
		EndericeID = config.getItem("Enderice", 5743).getInt();
		SnowstormBowID = config.getItem("Snowstorm Bow", 5753).getInt();
		IcineSwordID = config.getItem("Icine Sword", 5741).getInt();
		FrozenMaulID = config.getItem("Frozen Maul", 5748).getInt();
		SnowslashID = config.getItem("Snowslash", 5744).getInt();
		PeppermintsID = config.getItem("Peppermints", 5755).getInt();
		EggNogID = config.getItem("Egg Nog", 5756).getInt();
		ChocolateLogID = config.getItem("Chocolate Log", 5757).getInt();
		SnowconesID = config.getItem("Snowcones", 5758).getInt();
		FruitCakeID = config.getItem("Fruit Cake", 5759).getInt();
		SnowflakeID = config.getItem("Snowflake", 5482).getInt();
		SantaHeadID = config.getItem("Santa Head", 5466).getInt();
		SantaBodyID = config.getItem("Santa Body", 5467).getInt();
		SantaLegsID = config.getItem("Santa Legs", 5468).getInt();
		SantaBootsID = config.getItem("Santa Boots", 5469).getInt();
	}
}
