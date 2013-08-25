package net.divinerpg.renders;

import net.divinerpg.entities.core.EntityDamageProjectile;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;


public class RenderIconProjectile extends Render 
{
	private Icon image;

	ResourceLocation texture;
	public RenderIconProjectile(ResourceLocation textureLoc)
	{
		this.texture = textureLoc;
	}
	
	public void doRenderProjectile(EntityThrowable proj, double var2, double var4, double var6, float var8, float var9) {
		GL11.glPushMatrix();
        GL11.glTranslatef((float)var2, (float)var4, (float)var6);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        this.renderManager.renderEngine.func_110577_a(func_110775_a(proj));
        Tessellator var12 = Tessellator.instance;
        float f = 0;
        float f1 = 1;
        float f2 = 0;
        float f3 = 1;
        float var17 = 1.0F;
        float var18 = 0.5F;
        float var19 = 0.25F;
        GL11.glRotatef(180.0F - renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        var12.startDrawingQuads();
        var12.setNormal(0.0F, 1.0F, 0.0F);
        var12.addVertexWithUV(0.0F - var18, 0.0F - var19, 0.0D, f, f3);
        var12.addVertexWithUV(var17 - var18, 0.0F - var19, 0.0D, f1, f3);
        var12.addVertexWithUV(var17 - var18, 1.0F - var19, 0.0D, f1, f2);
        var12.addVertexWithUV(0.0F - var18, 1.0F - var19, 0.0D, f, f2);
        var12.draw();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
	}
	
	@Override
	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {
		doRenderProjectile((EntityDamageProjectile) var1, var2, var4, var6, var8, var9);
	}

    @Override
    protected ResourceLocation func_110775_a(Entity entity) {
        return this.texture;
    }

}