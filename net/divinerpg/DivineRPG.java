package net.divinerpg;

import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.DimensionRegistry;
import net.divinerpg.utils.proxies.CoreProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MAIN_MOD_ID, version = Reference.MOD_VERSION, name = Reference.MAIN_MOD_NAME)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPG
{	
	@Instance(Reference.MAIN_MOD_ID)
	public static DivineRPG instance;
	
	@SidedProxy
	(clientSide = "net.divinerpg.utils.proxies.CoreProxyClient", serverSide = "net.divinerpg.utils.proxies.CoreProxy")
	public static CoreProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		proxy.PreInit(event);
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init(event);
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{

        DimensionRegistry.InitDimensions();
        proxy.postInit(event);
	}
	
	//Still in dev :)
}
