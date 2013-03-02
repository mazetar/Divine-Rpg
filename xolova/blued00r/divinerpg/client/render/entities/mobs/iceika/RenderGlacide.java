package xolova.blued00r.divinerpg.client.render.entities.mobs.iceika;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import xolova.blued00r.divinerpg.entities.mobs.EntityCaveclops;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityGlacide;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGlacide extends RenderLiving
{
    private float scale;

    public RenderGlacide(ModelBase var1, float var2, float var3)
    {
        super(var1, var2 * var3);
        this.scale = var3;
    }

    protected void preRenderScale(EntityGlacide var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving var1, float var2)
    {
        this.preRenderScale((EntityGlacide)var1, var2);
    }
}
