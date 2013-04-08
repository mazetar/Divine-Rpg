package xolova.divinerpg;

import net.minecraft.command.CommandHandler;
import xolova.divinerpg.commands.CommandDivineRPG;
import xolova.divinerpg.utils.Utils;
import xolova.divinerpg.utils.helpers.DimensionRegistry;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;
import xolova.divinerpg.utils.helpers.config.TwilightConfigHelper;
import xolova.divinerpg.utils.helpers.item.TwilightItemHelper;
import xolova.divinerpg.utils.proxies.TwilightProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid = Utils.TWILIGHT_MOD_ID, version = Utils.VERSION, name = Utils.TWILIGHT_MOD_ID)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DivineRPGTwilight
{	
	@Instance(Utils.TWILIGHT_MOD_ID)
	public static DivineRPGTwilight instance;
	
	@SidedProxy
	(clientSide = "xolova.divinerpg.utils.proxies.TwilightProxyClient", 
		serverSide = "xolova.divinerpg.utils.proxies.TwilightProxy")
	public static TwilightProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		
		proxy.preInit(event);
		
		TwilightConfigHelper.initConfig(event);
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		proxy.init(event);
		
		TwilightBlockHelper.initBlocks();
		
		TwilightItemHelper.init();
		
		DimensionRegistry.InitDimensions();
	}
	
	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@ServerStarting
	public void serverStarting(FMLServerStartingEvent event)
	{		
		CommandHandler commandManager = (CommandHandler)event.getServer().getCommandManager();
		commandManager.registerCommand(new CommandDivineRPG());
	}
}
