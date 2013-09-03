package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.config.ArcanaConfigHelper;
import net.divinerpg.utils.helpers.entity.ArcanaEntityHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ArcanaProxy {

    
    public void preInit(FMLPreInitializationEvent event) {

        ArcanaConfigHelper.initConfig(event);
        
    }
    
    public void init(FMLInitializationEvent event) {
        initEntityRenderers();
    }
    
    public void initEntityRenderers() {
        ArcanaEntityHelper.init();
    }
	
}
