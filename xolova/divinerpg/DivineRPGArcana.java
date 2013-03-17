package xolova.divinerpg;

import xolova.divinerpg.utils.Utils;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Utils.ArcanaModId, useMetadata = false, version = Utils.MainVersion, name = Utils.ArcanaModName)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGArcana
{	
	@Instance("DivineRPG|Arcana")
	public static DivineRPGArcana instanceArcana;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}