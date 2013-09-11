package net.divinerpg.client.renders;

import net.divinerpg.lib.ResourceLocs;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEmpty extends Render {

	@Override
	public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
		// This is literally a render that doesn't render, it's
		// used for some projectiles that have particles rather
		// an icon
	}

    @Override
    protected ResourceLocation func_110775_a(Entity entity) {
        return ResourceLocs.EMPTY_TEXTURE;
    }

}
