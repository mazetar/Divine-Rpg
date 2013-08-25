package net.divinerpg.utils.proxies;

import net.divinerpg.entities.iceika.projectile.EntityFrostclawProjectile;
import net.divinerpg.entities.iceika.projectile.EntityIce;
import net.divinerpg.entities.iceika.projectile.EntityNoteProjectile;
import net.divinerpg.renders.RenderBlock;
import net.divinerpg.renders.RenderEmpty;
import net.divinerpg.renders.iceika.projectile.RenderFrostclawProjectile;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaProxyClient extends IceikaProxy {

	public void entityRegistry() {		
		RenderBlock renderBlock = new RenderBlock();
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNoteProjectile.class, new RenderEmpty());
		RenderingRegistry.registerEntityRenderingHandler(EntityIce.class, renderBlock);
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostclawProjectile.class, new RenderFrostclawProjectile());
	}

}
