package xolova.divinerpg.utils.proxies;

import xolova.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import xolova.divinerpg.renders.RenderEmpty;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaProxyClient extends IceikaProxy {

	@Override
	public void entityRegistry() {
		super.entityRegistry();
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNoteProjectile.class, new RenderEmpty());
	}
}
