package net.divinerpg.utils.proxies;

import net.divinerpg.DivineRPG;
import net.divinerpg.utils.debug.EntityNameRenderer;
import net.divinerpg.utils.handlers.ArmorEffectHandler;
import net.divinerpg.utils.handlers.ServerTickHandler;
import net.divinerpg.utils.helpers.DimensionRegistry;
import net.divinerpg.utils.helpers.entity.OverworldEntityHelper;
import net.divinerpg.utils.helpers.gui.GuiHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.divinerpg.utils.helpers.recipe.RecipeHelper;
import net.minecraftforge.common.MinecraftForge;
import net.divinerpg.utils.helpers.config.OverworldConfigHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CoreProxy {

	public void PreInit(FMLPreInitializationEvent event)
    {
	    OverworldConfigHelper.initConfig(event);
        
        DimensionRegistry.InitDimensionsConfig(event);
        // ConfigHelper.initConfig(event);  TODO: Other config system.
    }
	
	public void init(FMLInitializationEvent event) {
		tickRegistry();
		eventRegistry();
		//recipeRegistry();
		OverworldItemHelper.init();
		NetworkRegistry.instance().registerGuiHandler(DivineRPG.instance, new GuiHelper());
	}
	
	public void postInit(FMLPostInitializationEvent event) {
        entityInit();
	}
	
	
	
	public void tickRegistry() {
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);	
	}
	
	public void eventRegistry() {
		MinecraftForge.EVENT_BUS.register(new ArmorEffectHandler());

        MinecraftForge.EVENT_BUS.register(new EntityNameRenderer());
	}
	
	public void entityInit()
	{
		OverworldEntityHelper.init();
	}

	public void recipeRegistry() {
		RecipeHelper.init();
	}

}
