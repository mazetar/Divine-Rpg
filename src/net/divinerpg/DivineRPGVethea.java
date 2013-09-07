package net.divinerpg;

import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.divinerpg.utils.helpers.config.VetheaConfigHelper;
import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.divinerpg.utils.proxies.VetheaProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.VETHEA_MOD_ID, useMetadata = false, version = Reference.MOD_VERSION, name = Reference.VETHEA_MOD_NAME)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGVethea
{	
	@Instance(Reference.VETHEA_MOD_ID)
	public static DivineRPGVethea instance;
	
	@SidedProxy
	(clientSide = "net.divinerpg.utils.proxies.VetheaProxyClient", 
		serverSide = "net.divinerpg.utils.proxies.VetheaProxy")
	public static VetheaProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		VetheaConfigHelper.initConfig(event);

        proxy.preInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		VetheaItemHelper.init();
		VetheaBlockHelper.initBlocks();

        proxy.init(event);
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
	    proxy.post(event);
		
	}
}