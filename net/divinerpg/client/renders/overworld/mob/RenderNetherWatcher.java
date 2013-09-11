package net.divinerpg.client.renders.overworld.mob;

import net.divinerpg.client.renders.RenderLivingDivine;
import net.divinerpg.entities.overworld.mobs.EntityNetherWatcher;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderNetherWatcher extends RenderLivingDivine
{
    private float scale;

    public RenderNetherWatcher(ModelBase var1, float var2, float var3, ResourceLocation loc)
    {
        super(var1, var2 * var3, loc);
        this.scale = var3;
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderWatcher((EntityNetherWatcher)var1, var2, var4, var6, var8, var9);
    }

    public void renderWatcher(EntityNetherWatcher var1, double var2, double var4, double var6, float var8, float var9)
    {
        BossStatus.func_82824_a(var1, true);
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityNetherWatcher var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving var1, float var2)
    {
        this.preRenderScale((EntityNetherWatcher)var1, var2);
    }
}
