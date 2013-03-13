package xolova.blued00r.divinerpg.client.render.entities.mobs.traders;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityVatticus;

public class RenderVatticus extends RenderBiped
{
    public RenderVatticus(ModelBiped par1, float par2)
    {
        super(par1, par2);
    }

    public void renderVatticus(EntityVatticus par1EntityVatticus, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityVatticus, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderVatticus((EntityVatticus)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderVatticus((EntityVatticus)par1Entity, par2, par4, par6, par8, par9);
    }
}