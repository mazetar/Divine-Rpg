package xolova.blued00r.divinerpg.client.render.entities.projectiles;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class RenderPurpleFireball extends Render
{
    private int itemIconIndex;

    public RenderPurpleFireball(int var1)
    {
        this.itemIconIndex = var1;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2, (float)var4, (float)var6);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        this.loadTexture("/Xolovon2.png");
        Tessellator var10 = Tessellator.instance;
        this.func_40265_a(var10, this.itemIconIndex);
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
    }

    private void func_40265_a(Tessellator var1, int var2)
    {
        float var3 = (float)(var2 % 16 * 16 + 0) / 256.0F;
        float var4 = (float)(var2 % 16 * 16 + 16) / 256.0F;
        float var5 = (float)(var2 / 16 * 16 + 0) / 256.0F;
        float var6 = (float)(var2 / 16 * 16 + 16) / 256.0F;
        float var7 = 1.0F;
        float var8 = 0.5F;
        float var9 = 0.25F;
        GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        var1.startDrawingQuads();
        var1.setNormal(0.0F, 1.0F, 0.0F);
        var1.addVertexWithUV((double)(0.0F - var8), (double)(0.0F - var9), 0.0D, (double)var3, (double)var6);
        var1.addVertexWithUV((double)(var7 - var8), (double)(0.0F - var9), 0.0D, (double)var4, (double)var6);
        var1.addVertexWithUV((double)(var7 - var8), (double)(var7 - var9), 0.0D, (double)var4, (double)var5);
        var1.addVertexWithUV((double)(0.0F - var8), (double)(var7 - var9), 0.0D, (double)var3, (double)var5);
        var1.draw();
    }
}
