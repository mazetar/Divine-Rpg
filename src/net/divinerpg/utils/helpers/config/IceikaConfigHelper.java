package net.divinerpg.utils.helpers.config;

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
	public static int CoalstoneFurnaceActiveID;
	public static int CoalstoneFurnaceID;
	public static int WorkshopCarpetID;
	public static int WorkshopBookcaseID;
	public static int WorkshopLampID;
	public static int FrostedGlassID;
	public static int SteelDoorID;
	public static int FrostedChestID;
	public static int XmasTreeLightsID;
	public static int GlacideSpawnerID;
	public static int RolumSpawnerID;
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
	
	public static int IceikaPortalID;
	
	public static void initConfig(FMLPreInitializationEvent event)
	{
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGIceika.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		int id = 608;
		FrostedStoneID = config.getTerrainBlock("WorldGen Blocks", "Frosted Stone", 202, "").getInt(); // Gen Block ? TODO: Check if it's a gen block --Maz
		FrostedDirtID = config.getTerrainBlock("WorldGen Blocks", "Frosted Dirt", 203, "").getInt(); // Gen Block
		FrostedGrassID = config.getTerrainBlock("WorldGen Blocks", "Frosted Grass", 204, "").getInt(); // Gen Block
		FrostedWoodID = config.getBlock("Frosted Wood", ++id).getInt();
		FrostedLeavesID = config.getBlock("Frosted Leaves", ++id).getInt();
		IcyStoneID = config.getBlock("Icy Stone", ++id).getInt();
		IcyBricksID = config.getBlock("Icy Bricks", ++id).getInt();
		SnowyBricksID = config.getBlock("Snowy Bricks", ++id).getInt();
		CoalstoneID = config.getBlock("Coalstone", ++id).getInt();
		CoalstoneFurnaceID = config.getBlock("Coalstone Furnace", ++id).getInt();
		CoalstoneFurnaceActiveID = config.getBlock("Coalstone Furnace Active", ++id).getInt();
		WorkshopCarpetID = config.getBlock("Workshop Carpet", ++id).getInt();
		WorkshopBookcaseID = config.getBlock("Workshop Bookcase", ++id).getInt();
		WorkshopLampID = config.getBlock("Workshop Lamp", ++id).getInt();
		FrostedGlassID = config.getBlock("Frosted Glass", ++id).getInt();
		SteelDoorID = config.getBlock("Steel Door", ++id).getInt();
		FrostedChestID = config.getBlock("Frosted Chest", ++id).getInt();
		XmasTreeLightsID = config.getBlock("Xmas Light Leaves", ++id).getInt();
		GlacideSpawnerID = config.getBlock("Glacide Spawner", ++id).getInt();
		RolumSpawnerID = config.getBlock("Rollum Spawner", ++id).getInt();
		RedXmasLightsID = config.getBlock("Red Xmas Lights", ++id).getInt();
		GreenXmasLightsID = config.getBlock("Green Xmas Lights", ++id).getInt();
		BlueXmasLightsID = config.getBlock("Blue Xmas Lights", ++id).getInt();
		YellowXmasLightsID = config.getBlock("Yellow Xmas Lights", ++id).getInt();
		PurpleXmasLightsID = config.getBlock("Purple Xmas Lights", ++id).getInt();
		RedCandyCaneID = config.getBlock("Red Candy Cane", ++id).getInt();
		GreenCandyCaneID = config.getBlock("Green Candy Cane", ++id).getInt();
		BlueCandyCaneID = config.getBlock("Blue Candy Cane", ++id).getInt();
		YellowCandyCaneID = config.getBlock("Yellow Candy Cane", ++id).getInt();
		PurpleCandyCaneID = config.getBlock("Purple Candy Cane", ++id).getInt();
		
		IceikaPortalID = config.getBlock("Iceika Portal", ++id).getInt();
		
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

        int id = OverworldConfigHelper.nextItemID;
		SnowflakeShurikenID = config.getItem("Snowflake Shuriken", id++).getInt();
		FrossivenceID = config.getItem("Frossivence", id++).getInt();
		SerenadeOfIceID = config.getItem("Serenade Of Ice", id++).getInt();
		GlacierSwordID = config.getItem("Glacier Sword", id++).getInt();
		IcicleBowID = config.getItem("Icicle Bow", id++).getInt();
		IcicleBaneID = config.getItem("Icicle Bane", id++).getInt();
		FrostclawCannonID = config.getItem("Frostclaw Cannon", id++).getInt();
		FractiteCannonID = config.getItem("Fractite Cannon", id++).getInt();
		FrostkingSwordID = config.getItem("Frostking Sword", id++).getInt();
		SoundOfCarolsID = config.getItem("Sound of Carols", id++).getInt();
		EndericeID = config.getItem("Enderice", id++).getInt();
		SnowstormBowID = config.getItem("Snowstorm Bow", id++).getInt();
		IcineSwordID = config.getItem("Icine Sword", id++).getInt();
		FrozenMaulID = config.getItem("Frozen Maul", id++).getInt();
		SnowslashID = config.getItem("Snowslash", id++).getInt();
		PeppermintsID = config.getItem("Peppermints", id++).getInt();
		EggNogID = config.getItem("Egg Nog", id++).getInt();
		ChocolateLogID = config.getItem("Chocolate Log", id++).getInt();
		SnowconesID = config.getItem("Snowcones", id++).getInt();
		FruitCakeID = config.getItem("Fruit Cake", id++).getInt();
		SnowflakeID = config.getItem("Snowflake", id++).getInt();
		SantaHeadID = config.getItem("Santa Head", id++).getInt();
		SantaBodyID = config.getItem("Santa Body", id++).getInt();
		SantaLegsID = config.getItem("Santa Legs", id++).getInt();
		SantaBootsID = config.getItem("Santa Boots", id++).getInt();
		

        OverworldConfigHelper.nextItemID = id;
	}
}
