package xolova.divinerpg;

import xolova.divinerpg.utils.Utils;
import xolova.divinerpg.utils.proxies.CoreProxy;
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

@Mod(modid = Utils.MAIN_MOD_ID, version = Utils.VERSION, name = Utils.MAIN_MOD_ID)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPG
{	
	@Instance(Utils.MAIN_MOD_ID)
	public static DivineRPG instance;
	
	@SidedProxy
	(clientSide = "xolova.divinerpg.utils.proxies.CoreProxyClient", serverSide = "xolova.divinerpg.utils.proxies.CoreProxy")
	public static CoreProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		proxy.PreInit(event);
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
