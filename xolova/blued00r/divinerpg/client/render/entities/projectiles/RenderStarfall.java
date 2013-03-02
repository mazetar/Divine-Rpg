package xolova.blued00r.divinerpg.client.render.entities.projectiles;

import java.awt.Color;
import java.util.Random;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import xolova.blued00r.divinerpg.entities.projectile.EntityStarfall;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderStarfall extends Render
{
    private int itemIconIndex;
    private String texture;
    private Random rand = new Random();

    public RenderStarfall(int par1, String par2)
    {
        this.itemIconIndex = par1;
        this.texture = par2;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1, double par2, double par4, double par6, float par8, float par9)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        this.loadTexture(this.texture);
        Tessellator var10 = Tessellator.instance;
        this.func_40265_a(var10, this.itemIconIndex, ((EntityStarfall) par1).getColor());
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
    }

    private void func_40265_a(Tessellator var1, int var2, Color color)
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
        var1.setColorRGBA(color.getRed(), color.getBlue(), color.getGreen(), 255);
        var1.setNormal(0.0F, 1.0F, 0.0F);
        var1.addVertexWithUV((double)(0.0F - var8), (double)(0.0F - var9), 0.0D, (double)var3, (double)var6);
        var1.addVertexWithUV((double)(var7 - var8), (double)(0.0F - var9), 0.0D, (double)var4, (double)var6);
        var1.addVertexWithUV((double)(var7 - var8), (double)(var7 - var9), 0.0D, (double)var4, (double)var5);
        var1.addVertexWithUV((double)(0.0F - var8), (double)(var7 - var9), 0.0D, (double)var3, (double)var5);
        var1.draw();
    }
}