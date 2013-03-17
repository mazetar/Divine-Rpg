package xolova.divinerpg;

import xolova.divinerpg.dimensions.twilight.TwilightProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import xolova.divinerpg.utils.Utils;

@Mod(modid = Utils.MainModId, version = Utils.MainVersion, name = Utils.MainModName)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPG
{
	@Instance
	public static DivineRPG instance;
	
	@SidedProxy
	(clientSide = "xolova.divinerpg.dimensions.twilight.TwilightProxyClient", serverSide = "xolova.divinerpg.dimensions.twilight.TwilightProxy")
	public static TwilightProxy proxy;
	
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
