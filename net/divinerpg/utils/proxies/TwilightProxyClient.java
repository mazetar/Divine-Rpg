package net.divinerpg.utils.proxies;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.client.renders.core.RenderStatueItem;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.utils.helpers.render.TwilightRenderHelper;
import net.minecraftforge.client.MinecraftForgeClient;

public class TwilightProxyClient extends TwilightProxy{

    @Override
    public void initEntities() {
        super.initEntities();
        TwilightRenderHelper.init();
    }
    
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);

        MinecraftForgeClient.registerItemRenderer(TwilightBlockHelper.DensosStatue.blockID, new RenderStatueItem(TwilightBlockHelper.DensosStatue));
        MinecraftForgeClient.registerItemRenderer(TwilightBlockHelper.ReyvorStatue.blockID, new RenderStatueItem(TwilightBlockHelper.ReyvorStatue));
        MinecraftForgeClient.registerItemRenderer(TwilightBlockHelper.SFStatue.blockID, new RenderStatueItem(TwilightBlockHelper.SFStatue));
        MinecraftForgeClient.registerItemRenderer(TwilightBlockHelper.TDStatue.blockID, new RenderStatueItem(TwilightBlockHelper.TDStatue));
        MinecraftForgeClient.registerItemRenderer(TwilightBlockHelper.VamacheronStatue.blockID, new RenderStatueItem(TwilightBlockHelper.VamacheronStatue));
    }
}
