package net.divinerpg.utils.proxies;

import net.divinerpg.blocks.vethea.tileentities.*;
import net.divinerpg.utils.helpers.entity.VetheaEntityHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class VetheaProxy {
	
    public void preInit(FMLPreInitializationEvent event) {
        registerTileEntities();
    }
    
    public void init(FMLInitializationEvent event) {
        initEntityRenderers();
    }
    
    public void initEntityRenderers() {
        VetheaEntityHelper.init();
    }
    
    void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityDreamLamp.class, "Dream Lamp");
        GameRegistry.registerTileEntity(TileEntityInfusionTable.class, "Infusion Table");
    }
}
