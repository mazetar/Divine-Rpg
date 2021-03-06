package net.divinerpg.utils.proxies;

import net.divinerpg.DivineRPGArcana;
import net.divinerpg.blocks.arcana.tileentities.TileEntityCondenser;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDemonFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityExtractor;
import net.divinerpg.blocks.arcana.tileentities.TileEntityGreenlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoltenFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoonlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityOceanfireFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityArcanaFurnace;
import net.divinerpg.utils.handlers.gui.ArcanaGuiHandler;
import net.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import net.divinerpg.utils.helpers.entity.ArcanaEntityHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArcanaProxy {

    
    public void preInit(FMLPreInitializationEvent event) {

        ArcanaConfigHelper.initConfig(event);
        registerTileEntities();
        
    }
    
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.instance().registerGuiHandler(DivineRPGArcana.instance, new ArcanaGuiHandler());
    }
    public void post(FMLPostInitializationEvent event) {
        registerRenderThings();
    }
    
    public void registerRenderThings() {
        ArcanaEntityHelper.init();
    }
    
    void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityCondenser.class, "Condenser");
        GameRegistry.registerTileEntity(TileEntityExtractor.class, "Extractor");
        
        GameRegistry.registerTileEntity(TileEntityArcanaFurnace.class, "Whitefire Furnace TE");
        GameRegistry.registerTileEntity(TileEntityOceanfireFurnace.class, "OceanfireFurnace TE");
        GameRegistry.registerTileEntity(TileEntityGreenlightFurnace.class, "GreenlightFurnace TE");
        GameRegistry.registerTileEntity(TileEntityMoltenFurnace.class, "Molten Furnace TE");
        GameRegistry.registerTileEntity(TileEntityMoonlightFurnace.class, "Moonlight Furnace TE");
        GameRegistry.registerTileEntity(TileEntityDemonFurnace.class, "Demon Furnace TE");

    }


    
	
}
