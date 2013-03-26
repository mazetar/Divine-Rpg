package xolova.divinerpg;

import xolova.divinerpg.utils.Utils;
import xolova.divinerpg.utils.helpers.ArcanaHelper;
import xolova.divinerpg.utils.proxies.ArcanaProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Utils.ARCANA_MOD_ID, useMetadata = false, version = Utils.VERSION, name = Utils.ARCANA_MOD_NAME)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGArcana
{	
	@Instance(Utils.ARCANA_MOD_ID)
	public static DivineRPGArcana instance;
	
	@SidedProxy
	(clientSide = "xolova.divinerpg.utils.proxies.ArcanaProxyClient", 
		serverSide = "xolova.divinerpg.utils.proxies.ArcanaProxy")
	public static ArcanaProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		GameRegistry.registerPlayerTracker(new ArcanaHelper());
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}