package net.divinerpg.utils.proxies;

import net.divinerpg.DivineRPGTwilight;
import net.divinerpg.utils.handlers.gui.TwilightGuiHandler;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.config.TwilightConfigHelper;
import net.divinerpg.utils.helpers.entity.TwilightEntityHelper;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.divinerpg.blocks.twilight.tileentities.*;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class TwilightProxy 
{
	
	public void preInit(FMLPreInitializationEvent event) {

        TwilightConfigHelper.initConfig(event);
        registerTileEntities();
	}
	
	public void init(FMLInitializationEvent event) {
	    
        TwilightBlockHelper.init();
        TwilightItemHelper.init();

        NetworkRegistry.instance().registerGuiHandler(DivineRPGTwilight.instance, new TwilightGuiHandler());
    //    TwilightRecipeHelper.init();

	}
	
	   public void postInit(FMLPostInitializationEvent event) {
	       initEntities();
	    }
	
	public void initEntities() {
	    TwilightEntityHelper.init();
	}
	
	   public void registerTileEntities() {
	        GameRegistry.registerTileEntity(TileEntityDensosStatue.class, "Densos Statue");
	        GameRegistry.registerTileEntity(TileEntityReyvorStatue.class, "Reyvor Statue");
            GameRegistry.registerTileEntity(TileEntitySFStatue.class, "SF Statue");
            GameRegistry.registerTileEntity(TileEntityTDStatue.class, "TD Statue");
            GameRegistry.registerTileEntity(TileEntityVamacheronStatue.class, "Vamacheron Statue");
	       
	   }
}
