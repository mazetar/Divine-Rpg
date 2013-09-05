package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import net.divinerpg.utils.helpers.entity.ArcanaEntityHelper;
import net.divinerpg.blocks.arcana.tileentities.TileEntityCondenser;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDemonFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDramixAltar;
import net.divinerpg.blocks.arcana.tileentities.TileEntityDramixStatue;
import net.divinerpg.blocks.arcana.tileentities.TileEntityExtractor;
import net.divinerpg.blocks.arcana.tileentities.TileEntityGreenlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoltenFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityMoonlightFurnace;
import net.divinerpg.blocks.arcana.tileentities.TileEntityParasectaAltar;
import net.divinerpg.blocks.arcana.tileentities.TileEntityParasectaStatue;
import net.divinerpg.blocks.arcana.tileentities.TileEntityPheonixAltar;
import net.divinerpg.blocks.arcana.tileentities.TileEntityReyvorStatue;
import net.divinerpg.blocks.arcana.tileentities.TileEntityWhitefireFurnace;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArcanaProxy {

    
    public void preInit(FMLPreInitializationEvent event) {

        ArcanaConfigHelper.initConfig(event);
        registerTileEntities();
        
    }
    
    public void init(FMLInitializationEvent event) {
        initEntityRenderers();
    }
    
    public void initEntityRenderers() {
        ArcanaEntityHelper.init();
    }
    
    void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityCondenser.class, "Condenser");
        GameRegistry.registerTileEntity(TileEntityDemonFurnace.class, "Demon Furnace");
        GameRegistry.registerTileEntity(TileEntityDramixAltar.class, "Dramix Altar");
        GameRegistry.registerTileEntity(TileEntityDramixStatue.class, "Dramix Statue");
        GameRegistry.registerTileEntity(TileEntityExtractor.class, "Extractor");
        GameRegistry.registerTileEntity(TileEntityGreenlightFurnace.class, "GreenlightFurnace");
        GameRegistry.registerTileEntity(TileEntityMoltenFurnace.class, "Molten Furnace");
        GameRegistry.registerTileEntity(TileEntityMoonlightFurnace.class, "Moonlight Furnace");
        GameRegistry.registerTileEntity(TileEntityParasectaAltar.class, "Parasecta Altar");
        GameRegistry.registerTileEntity(TileEntityParasectaStatue.class, "Parasecta Statue");
        GameRegistry.registerTileEntity(TileEntityPheonixAltar.class, "Pheonix Altar");
        GameRegistry.registerTileEntity(TileEntityReyvorStatue.class, "Revyor Statue");
        GameRegistry.registerTileEntity(TileEntityWhitefireFurnace.class, "Whitefire Furnace");

    }
    
	
}
