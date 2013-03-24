package xolova.divinerpg;

import xolova.divinerpg.utils.Utils;
import xolova.divinerpg.utils.helpers.block.IceikaBlockHelper;
import xolova.divinerpg.utils.helpers.config.IceikaConfigHelper;
import xolova.divinerpg.utils.helpers.item.IceikaItemHelper;
import xolova.divinerpg.utils.proxies.IceikaProxy;
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

@Mod(modid = Utils.ICEIKA_MOD_ID, useMetadata = false, version = Utils.VERSION, name = Utils.ICEIKA_MOD_NAME)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGIceika
{	
	@Instance(Utils.ICEIKA_MOD_ID)
	public static DivineRPGIceika instance;
	
	@SidedProxy
	(clientSide = "xolova.divinerpg.utils.proxies.IceikaProxyClient", 
		serverSide = "xolova.divinerpg.utils.proxies.IceikaProxy")
	public static IceikaProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		IceikaConfigHelper.initConfig(event);
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		IceikaBlockHelper.init();
		IceikaItemHelper.init();
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}