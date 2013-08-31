package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.entity.VetheaEntityHelper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class VetheaProxy {
	
    public void preInit(FMLPreInitializationEvent event) {
    }
    
    public void init(FMLInitializationEvent event) {
        initEntityRenderers();
    }
    
    public void initEntityRenderers() {
        VetheaEntityHelper.init();
    }

}
