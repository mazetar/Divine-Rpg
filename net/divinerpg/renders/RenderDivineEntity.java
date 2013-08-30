package net.divinerpg.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
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

	
	
    protected void preRenderScale(EntityLivingBase var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    @Override
    protected ResourceLocation func_110775_a(Entity entity) {
        return texture;
    }
}