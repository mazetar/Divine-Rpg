package net.divinerpg.utils.proxies;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.divinerpg.utils.helpers.render.ArcanaRenderHelper;


public class ArcanaProxyClient extends ArcanaProxy {
    
    @Override
    public void registerRenderThings() {
        super.registerRenderThings();

        ArcanaRenderHelper.init();
    }
	
	
}
