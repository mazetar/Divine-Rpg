package net.divinerpg.client.renders.overworld.mob;

import net.divinerpg.client.models.overworld.mobs.ModelWildFire;
import net.divinerpg.entities.overworld.mobs.EntityWildFire;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderWilfFire extends RenderLiving
{
    protected ModelWildFire modelBipedMain;
    protected float field_77070_b;
    ResourceLocation texture;
    public RenderWilfFire(ModelWildFire var1, float var2, ResourceLocation loc)
    {
        this(var1, var2, 1.0F, loc);
        this.modelBipedMain = var1;
    }

    public RenderWilfFire(ModelWildFire var1, float var2, float var3, ResourceLocation loc)
    {
        super(var1, var2);
        this.modelBipedMain = var1;
        this.field_77070_b = var3;
        texture = loc;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a((EntityWildFire)var1, var2, var4, var6, var8, var9);
    }

    public void func_48421_a(EntityWildFire var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityWildFire var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a(var1, var2, var4, var6, var8, var9);
    }

    protected void renderEquippedItems(EntityLiving var1, float var2)
    {
        super.renderEquippedItems(var1, var2);
        ItemStack var3 = var1.getHeldItem();

        if (var3 != null)
        {
            GL11.glPushMatrix();
            this.modelBipedMain.rightarm.postRender(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            IItemRenderer var5 = MinecraftForgeClient.getItemRenderer(var3, IItemRenderer.ItemRenderType.EQUIPPED);
            boolean is3D = var5 != null && var5.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var3, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            float var4;
            
            if (var3.itemID == OverworldItemHelper.infernoBow.itemID)
            {
                float var6 = 0.625F;
                GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
                GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var6, -var6, var6);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }

            this.renderManager.itemRenderer.renderItem(var1, var3, 0);

            if (var3.getItem().requiresMultipleRenderPasses())
            {
                for (int var7 = 1; var7 < var3.getItem().getRenderPasses(var3.getItemDamage()); ++var7)
                {
                    this.renderManager.itemRenderer.renderItem(var1, var3, var7);
                }
            }

            GL11.glPopMatrix();
        }
    }

    @Override
    protected ResourceLocation func_110775_a(Entity entity) {
        return texture;
    }
}