package xolova.divinerpg.utils.proxies;

import xolova.divinerpg.entities.iceika.projectile.EntityIce;
import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import xolova.divinerpg.renders.RenderBlock;
import xolova.divinerpg.renders.RenderEmpty;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaProxyClient extends IceikaProxy {

	@Override
	public void entityRegistry() {
		super.entityRegistry();
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNoteProjectile.class, new RenderEmpty());
		RenderingRegistry.registerEntityRenderingHandler(EntityIce.class, new RenderBlock());
	}
}
