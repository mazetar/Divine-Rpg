package net.divinerpg;

import net.divinerpg.commands.CommandDivineRPG;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.proxies.TwilightProxy;
import net.minecraft.command.CommandHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid = Reference.TWILIGHT_MOD_ID, version = Reference.MOD_VERSION, name = Reference.TWILIGHT_MOD_ID, dependencies="required-after:" + Reference.MAIN_MOD_ID)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGTwilight
{	
	@Instance(Reference.TWILIGHT_MOD_ID)
	public static DivineRPGTwilight instance;
	
	@SidedProxy
	(clientSide = "net.divinerpg.utils.proxies.TwilightProxyClient", 
		serverSide = "net.divinerpg.utils.proxies.TwilightProxy")
	public static TwilightProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		
		 proxy.preInit(event);
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		 proxy.init(event);
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{		
		CommandHandler commandManager = (CommandHandler)event.getServer().getCommandManager();
		commandManager.registerCommand(new CommandDivineRPG());
	}
}
