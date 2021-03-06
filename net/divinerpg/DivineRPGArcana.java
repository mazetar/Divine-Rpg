package net.divinerpg;

import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.divinerpg.utils.proxies.ArcanaProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.ARCANA_MOD_ID, useMetadata = false, version = Reference.MOD_VERSION, name = Reference.ARCANA_MOD_NAME)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGArcana
{	
	@Instance(Reference.ARCANA_MOD_ID)
	public static DivineRPGArcana instance;
	
	@SidedProxy
	(clientSide = "net.divinerpg.utils.proxies.ArcanaProxyClient", 
		serverSide = "net.divinerpg.utils.proxies.ArcanaProxy")
	public static ArcanaProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init(event);
		ArcanaBlockHelper.init();
		
		ArcanaItemHelper.init();
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		proxy.post(event);
	}
}