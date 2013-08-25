package net.divinerpg;

import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.divinerpg.utils.helpers.config.IceikaConfigHelper;
import net.divinerpg.utils.helpers.item.IceikaItemHelper;
import net.divinerpg.utils.proxies.IceikaProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.ICEIKA_MOD_ID, useMetadata = false, version = Reference.MOD_VERSION, name = Reference.ICEIKA_MOD_NAME)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGIceika
{	
	@Instance(Reference.ICEIKA_MOD_ID)
	public static DivineRPGIceika instance;
	
	@SidedProxy
	(clientSide = "net.divinerpg.utils.proxies.IceikaProxyClient", 
		serverSide = "net.divinerpg.utils.proxies.IceikaProxy")
	public static IceikaProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;		
		IceikaConfigHelper.initConfig(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init(event);
		
		IceikaBlockHelper.init();
		IceikaItemHelper.init();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}