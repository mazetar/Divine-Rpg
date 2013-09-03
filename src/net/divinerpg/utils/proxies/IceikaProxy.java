package net.divinerpg.utils.proxies;

import net.divinerpg.utils.handlers.ExplosiveArrowHitHandler;
import net.divinerpg.utils.helpers.entity.ArcanaEntityHelper;
import net.divinerpg.utils.helpers.entity.IceikaEntityHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class IceikaProxy {
 
    public void preInit(FMLPreInitializationEvent event) {
        // NO-OP
    }
    
    public void init(FMLInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
        initEntityRenderers();
    }
    
    public void initEntityRenderers() {
        IceikaEntityHelper.init();
    }
	
}
