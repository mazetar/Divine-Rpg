package xolova.divinerpg.renders;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

public class RenderEmpty extends Render {

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
		// This is literally a render that doesn't render, it's
		// used for some projectiles that have particles rather
		// an icon
	}

}
