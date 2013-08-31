package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.render.ArcanaRenderHelper;


public class ArcanaProxyClient extends ArcanaProxy {

    @Override
    public void initEntityRenderers() {
        super.initEntityRenderers();

        ArcanaRenderHelper.init();
    }
	
	
}
