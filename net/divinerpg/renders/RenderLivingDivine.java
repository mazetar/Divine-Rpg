package net.divinerpg.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderLivingDivine extends RenderLiving {

    ResourceLocation texture;
    public RenderLivingDivine(ModelBase par1ModelBase, float shadowSize, ResourceLocation resourceLoc) {
        super(par1ModelBase, shadowSize);
        texture = resourceLoc;
    }

    @Override
    protected ResourceLocation func_110775_a(Entity entity) {
        return texture;
    }

}
