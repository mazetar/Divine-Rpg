package net.divinerpg.utils.proxies;

import net.divinerpg.client.misc.VersionHelper;
import net.divinerpg.utils.handlers.ClientTickHandler;
import net.divinerpg.utils.helpers.render.OverworldRenderHelper;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CoreProxyClient extends CoreProxy {
	
	@Override
	public void tickRegistry() {
		super.tickRegistry();
		//VersionHelper.checkVersion();
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
		
	}
	
	@Override
	public void entityInit() {
	    super.entityInit();
	    OverworldRenderHelper.init();
	}

}
