package xolova.divinerpg;

import xolova.divinerpg.utils.Utils;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;
import xolova.divinerpg.utils.helpers.config.TwilightConfigHelper;
import xolova.divinerpg.utils.helpers.item.TwilightItemHelper;
import xolova.divinerpg.utils.proxies.TwilightProxy;
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



@Mod(modid = Utils.MainModId, version = Utils.MainVersion, name = Utils.MainModName)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPG
{	
	@Instance("DivineRPG")
	public static DivineRPG instance;
	
	@SidedProxy
	(clientSide = "xolova.divinerpg.utils.proxies.TwilightProxyClient", serverSide = "xolova.divinerpg.utils.proxies.TwilightProxy")
	public static TwilightProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		TwilightConfigHelper.initConfig(event);
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		TwilightBlockHelper.initBlocks();
		
		TwilightItemHelper.init();
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
