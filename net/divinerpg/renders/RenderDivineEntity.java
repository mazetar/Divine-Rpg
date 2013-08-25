package net.divinerpg.renders;

import net.divinerpg.entities.vethea.mobs.EntityZoragon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderDivineEntity extends RenderLiving
{
    private float scale = 1;
    ResourceLocation texture;
    
	public RenderDivineEntity(ModelBase model, float shadowSize, float scale, ResourceLocation loc)
    {
        super(model, shadowSize);
        texture = loc;
        this.scale = scale;
    }
	
	public RenderDivineEntity(ModelBase model, float shadowSize, ResourceLocation loc)
    {
        super(model, shadowSize);
        texture = loc;
    }

    public void renderDivineEntity(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderDivineEntity(var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderDivineEntity((EntityZoragon)var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityLivingBase var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    @Override
    protected void preRenderCallback(EntityLivingBase  var1, float var2)
    {
        this.preRenderScale(var1, var2);
    }

    @Override
    protected ResourceLocation func_110775_a(Entity entity) {
        return texture;
    }
}