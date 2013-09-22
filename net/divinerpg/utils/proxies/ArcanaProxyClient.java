package net.divinerpg.utils.proxies;

import net.divinerpg.blocks.core.tileentities.TileDivineAltar;
import net.divinerpg.client.renders.core.RenderDivineAltar;
import net.divinerpg.utils.helpers.render.ArcanaRenderHelper;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;


public class ArcanaProxyClient extends ArcanaProxy {
    
    @Override
    public void registerRenderThings() {
        super.registerRenderThings();

        ArcanaRenderHelper.init();
    }
	
	@Override
	public void init(FMLInitializationEvent event) {
	    super.init(event);
	    
	    ClientRegistry.bindTileEntitySpecialRenderer(TileDivineAltar.class, new RenderDivineAltar());
	}
}
