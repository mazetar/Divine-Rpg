package net.divinerpg.utils.proxies;

import net.divinerpg.DivineRPG;
import net.divinerpg.blocks.core.tileentities.TileEntitySerenityChest;
import net.divinerpg.blocks.core.tileentities.TileSingularChest;
import net.divinerpg.blocks.overworld.tileentities.*;
import net.divinerpg.blocks.twilight.tileentities.TileEntityTwilightFurance;
import net.divinerpg.utils.debug.EntityNameRenderer;
import net.divinerpg.utils.handlers.ArmorEffectHandler;
import net.divinerpg.utils.handlers.ServerTickHandler;
import net.divinerpg.utils.handlers.gui.OverworldGuiHandler;
import net.divinerpg.utils.helpers.DimensionRegistry;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.divinerpg.utils.helpers.config.OverworldConfigHelper;
import net.divinerpg.utils.helpers.entity.OverworldEntityHelper;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.divinerpg.utils.helpers.recipe.RecipeHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CoreProxy {

	public void PreInit(FMLPreInitializationEvent event)
    {
	    OverworldConfigHelper.initConfig(event);
        
        DimensionRegistry.InitDimensionsConfig(event);

        DivineTabs.init();
        registerTileEntities();
    }
	
	public void init(FMLInitializationEvent event) {
		tickRegistry();
		eventRegistry();
        OverworldItemHelper.init();
        OverworldBlockHelper.init();
		//recipeRegistry();
        NetworkRegistry.instance().registerGuiHandler(DivineRPG.instance, new OverworldGuiHandler());
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
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntitySerenityChest.class, "Serenity Chest");
        GameRegistry.registerTileEntity(TileSingularChest.class, "Singular Chest");
        GameRegistry.registerTileEntity(TileEntityAEStatue.class, "AE Statue");
        GameRegistry.registerTileEntity(TileEntityAyeracoBeamBlue.class, "AyeracoBeamBlue");
        GameRegistry.registerTileEntity(TileEntityAyeracoBeamGreen.class, "AyeracoBeamGreen");
        GameRegistry.registerTileEntity(TileEntityAyeracoBeamPurple.class, "AyeracoBeamPurple");
        GameRegistry.registerTileEntity(TileEntityAyeracoBeamRed.class, "AyeracoBeamRed");
        GameRegistry.registerTileEntity(TileEntityAyeracoBeamYellow.class, "AyeracoBeamYellow");
        GameRegistry.registerTileEntity(TileEntityAyeracoStatue.class, "Ayeraco Statue");
        GameRegistry.registerTileEntity(TileEntityKOSStatue.class, "KOSS Statue");
        GameRegistry.registerTileEntity(TileEntitySuperEnchantmentTable.class, "SuperEnchantmentTable");
        GameRegistry.registerTileEntity(TileEntityTwilightFurance.class, "Twilight Furnace");
        GameRegistry.registerTileEntity(TileEntityWatcherStatue.class, "Watcher Statue");
	    
	    
	    
	}

}
