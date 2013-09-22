package net.divinerpg.client.renders.core;

import net.divinerpg.blocks.core.DivineStatue;
import net.divinerpg.client.models.DivineModel;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class RenderStatueItem implements IItemRenderer {
    
    DivineModel model;
    ResourceLocation texture;
    
    public RenderStatueItem(DivineStatue statueBlock) {
        this.model = statueBlock.model;
        this.texture = statueBlock.texture;
    }
   
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }
     
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }
     
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch(type)
        {
            case ENTITY:{
                renderStatueItem(0f, 0f, 0f, 0.7f);
                return;
            }
             
            case EQUIPPED:{
                renderStatueItem(0f, 1f, 1f, 0.7f);
                return;
            }
                 
            case INVENTORY:{
                renderStatueItem(0f, 0f, 0f, 0.7f);
                return;
            }
             
            default:return;
        }
    }
    private void renderStatueItem(float x, float y, float z, float scale)
    {
        GL11.glPushMatrix();
     
        // Disable Lighting Calculations
        GL11.glDisable(GL11.GL_LIGHTING);
         
        GL11.glTranslatef(x,  y+0.2F,  z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotatef(180, 1.0F, 0.0F, 0.0F);
        
        Minecraft.getMinecraft().func_110434_K().func_110577_a(texture);
        
        model.render(0.0625F);
         
        // Re-enable Lighting Calculations
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
    
}
