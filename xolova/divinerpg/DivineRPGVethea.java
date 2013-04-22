package xolova.divinerpg;

import xolova.divinerpg.utils.Utils;
import xolova.divinerpg.utils.proxies.VetheaProxy;
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

@Mod(modid = Utils.VETHEA_MOD_ID, useMetadata = false, version = Utils.VERSION, name = Utils.VETHEA_MOD_NAME)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGVethea
{	
	@Instance(Utils.VETHEA_MOD_ID)
	public static DivineRPGVethea instance;
	
	@SidedProxy
	(clientSide = "xolova.divinerpg.utils.proxies.VetheaProxyClient", 
		serverSide = "xolova.divinerpg.utils.proxies.VetheaProxy")
	public static VetheaProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		//VetheaConfigHelper.initConfig(event);
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		//VetheaItemHelper.init();
		//VetheaBlockHelper.initBlocks();
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}