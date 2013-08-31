package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.render.VetheaRenderHelper;

public class VetheaProxyClient extends VetheaProxy {

    @Override
    public void initEntityRenderers() {
        super.initEntityRenderers();
        VetheaRenderHelper.init();
    }
    
}
