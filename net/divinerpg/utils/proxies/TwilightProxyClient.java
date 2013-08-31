package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.render.TwilightRenderHelper;

public class TwilightProxyClient extends TwilightProxy{

    @Override
    public void initEntityRenderers() {
        super.initEntityRenderers();
        TwilightRenderHelper.init();
    }
}
