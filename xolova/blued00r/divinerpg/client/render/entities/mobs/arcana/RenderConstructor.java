package xolova.blued00r.divinerpg.client.render.entities.mobs.arcana;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityConstructor;
import xolova.blued00r.divinerpg.entities.mobs.arcana.EntityGolemOfRejuv;

public class RenderConstructor extends RenderLiving
{
    private float scale;
    public RenderConstructor(ModelBase var1, float var2)
    {
        super(var1, var2);
        this.scale = 0.5F;
    }

    public void renderCow(EntityConstructor var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
        this.scale = 0.5F;
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityConstructor)var1, var2, var4, var6, var8, var9);
        this.scale = 0.5F;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityConstructor)var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityConstructor var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving var1, float var2)
    {
        this.preRenderScale((EntityConstructor)var1, var2);
    }
}