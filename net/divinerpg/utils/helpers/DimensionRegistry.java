package net.divinerpg.utils.helpers;

import net.divinerpg.worldgen.arcana.BiomeGenArcana;
import net.divinerpg.worldgen.arcana.WorldProviderArcana;
import net.divinerpg.worldgen.augite.BiomeGenDense;
import net.divinerpg.worldgen.augite.WorldProviderDense;
import net.divinerpg.worldgen.azurite.BiomeGenAzurite;
import net.divinerpg.worldgen.azurite.WorldProviderAzurite;
import net.divinerpg.worldgen.dravite.BiomeGenSerenity;
import net.divinerpg.worldgen.dravite.WorldProviderTwilight;
import net.divinerpg.worldgen.mythril.BiomeGenMythil;
import net.divinerpg.worldgen.mythril.WorldProviderMythil;
import net.divinerpg.worldgen.uvite.BiomeGenEnergy;
import net.divinerpg.worldgen.uvite.WorldProviderEnergy;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class DimensionRegistry 
{
	public static BiomeGenBase energyBiome;
	public static BiomeGenBase azuriteBiome;
	public static BiomeGenBase arcanaBiome;
	public static BiomeGenBase serenityBiome;
	public static BiomeGenBase IceikaMountains;
	public static BiomeGenBase denseBiome;
	public static BiomeGenBase mythilBiome;
	public static BiomeGenBase arksianeBiome;
	public static BiomeGenBase heliosisBiome;
	
	public static int draviteBiomeID;
	public static int uviteBiomeID;
	public static int azuriteBiomeID;
	public static int mythrilBiomeID;
	public static int augiteBiomeID;
	public static int arcanaBiomeID;
	public static int iceikaBiomeID;
	public static int arksianeBiomeID;
	public static int heliosisBiomeID;
	
	public static int DraviteID;
	public static int AzuriteID;
	public static int ArcanaID;
	public static int UviteID;
	public static int IceikaID;
	public static int MythrilID;
	public static int VetheaID;
	public static int AugiteID;
	
	public static boolean KeepLoadedDravite;
	public static boolean KeepLoadedAzurite;
	public static boolean KeepLoadedArcana;
	public static boolean KeepLoadedUvite;
	public static boolean KeepLoadedIceika;
	public static boolean KeepLoadedMythril;
	public static boolean KeepLoadedVethea;
	public static boolean KeepLoadedAugite;

	
	public static void InitDimensions()
	{
        GameRegistry.registerWorldGenerator(new WorldGenDivineMinable());

        serenityBiome = new BiomeGenSerenity(draviteBiomeID);
        energyBiome = new BiomeGenEnergy(uviteBiomeID);
        azuriteBiome = new BiomeGenAzurite(azuriteBiomeID);
        mythilBiome = new BiomeGenMythil(mythrilBiomeID);
        denseBiome = new BiomeGenDense(augiteBiomeID);
        arcanaBiome = new BiomeGenArcana(arcanaBiomeID);
        //IceikaMountains = new BiomeGenIceikaMountians(iceikaBiomeID);
        //arksianeBiome = new BiomeGenArksiane(arksianeBiomeID);
        //heliosisBiome = new BiomeGenHeliosis(heliosisBiomeID);       
        
        DimensionManager.registerProviderType(DraviteID, WorldProviderTwilight.class, KeepLoadedDravite);
        DimensionManager.registerDimension(DraviteID, DraviteID);
        DimensionManager.registerProviderType(AzuriteID, WorldProviderAzurite.class, KeepLoadedAzurite);
        DimensionManager.registerDimension(AzuriteID, AzuriteID);
        DimensionManager.registerProviderType(UviteID, WorldProviderEnergy.class, KeepLoadedUvite);
        DimensionManager.registerDimension(UviteID, UviteID);
        DimensionManager.registerProviderType(MythrilID, WorldProviderMythil.class, KeepLoadedMythril);
        DimensionManager.registerDimension(MythrilID, MythrilID);
        DimensionManager.registerProviderType(AugiteID, WorldProviderDense.class, KeepLoadedAugite);
        DimensionManager.registerDimension(AugiteID, AugiteID);
        DimensionManager.registerProviderType(ArcanaID, WorldProviderArcana.class, KeepLoadedArcana);
        DimensionManager.registerDimension(ArcanaID, ArcanaID);
        //DimensionManager.registerProviderType(IceikaID, WorldProviderIceika.class, KeepLoadedIceika);
        //DimensionManager.registerDimension(IceikaID, IceikaID);
        //DimensionManager.registerProviderType(VetheaID, WorldProviderVethea.class, KeepLoadedVethea);
        //DimensionManager.registerDimension(VetheaID, VetheaID); 
	}
	
	public static void InitDimensionsConfig(FMLPreInitializationEvent event, Configuration config)
	{
		KeepLoadedDravite = config.get("Dimensions", "KeepLoaded Dravite", true).getBoolean(true);
		KeepLoadedAzurite = config.get("Dimensions", "KeepLoaded Azurite", true).getBoolean(true);
		KeepLoadedArcana = config.get("Dimensions", "KeepLoaded Arcana", true).getBoolean(true);
		KeepLoadedUvite = config.get("Dimensions", "KeepLoaded Uvite", true).getBoolean(true);
		KeepLoadedIceika = config.get("Dimensions", "KeepLoaded Iceika", true).getBoolean(true);
		KeepLoadedMythril = config.get("Dimensions", "KeepLoaded Mythril", true).getBoolean(true);
		KeepLoadedVethea = config.get("Dimensions", "KeepLoaded Vethea", true).getBoolean(true);
		KeepLoadedAugite = config.get("Dimensions", "KeepLoaded Augite", true).getBoolean(true);
		
		DraviteID = config.get("Dimensions", "ID Dravite", 7).getInt();
		AzuriteID = config.get("Dimensions", "ID Azurite", 8).getInt();
		ArcanaID = config.get("Dimensions", "ID Arcana", 9).getInt();
		UviteID = config.get("Dimensions", "ID Uvite", 10).getInt();
		IceikaID = config.get("Dimensions", "ID Iceika", 11).getInt();
		MythrilID = config.get("Dimensions", "ID Mythril", 12).getInt();
		VetheaID = config.get("Dimensions", "ID Vethea", 13).getInt();
		AugiteID = config.get("Dimensions", "ID Augite", 14).getInt();
		
		draviteBiomeID  = config.get("Dimensions", "ID Biome Dravite", 23).getInt();
		uviteBiomeID  = config.get("Dimensions", "ID Biome Uvite", 24).getInt();
		azuriteBiomeID  = config.get("Dimensions", "ID Biome Azurite", 25).getInt();
		mythrilBiomeID  = config.get("Dimensions", "ID Biome Mythril", 26).getInt();
		augiteBiomeID  = config.get("Dimensions", "ID Biome Augite", 27).getInt();
		arcanaBiomeID  = config.get("Dimensions", "ID Biome Arcana", 28).getInt();
		iceikaBiomeID  = config.get("Dimensions", "ID Biome Iceika", 29).getInt();
		arksianeBiomeID  = config.get("Dimensions", "ID Biome Arksaine", 30).getInt(); 
		heliosisBiomeID  = config.get("Dimensions", "ID Biome Heliosis", 31).getInt();
	}
}
