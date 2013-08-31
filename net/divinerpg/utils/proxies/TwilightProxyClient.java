package net.divinerpg.utils.proxies;

import net.divinerpg.utils.helpers.render.TwilightRenderHelper;

public class TwilightProxyClient extends TwilightProxy{

    @Override
    public void initEntities() {
        super.initEntities();
        TwilightRenderHelper.init();
    }
}
