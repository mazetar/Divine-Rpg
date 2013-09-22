package net.divinerpg.client.renders.core;

import org.lwjgl.opengl.GL11;

import net.divinerpg.blocks.core.tileentities.TileDivineAltar;
import net.divinerpg.blocks.core.tileentities.TileDivineStatue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderDivineAltar extends TileEntitySpecialRenderer {

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y,
            double z, float tick) {
        if (te instanceof TileDivineAltar) {
            TileDivineAltar teda = (TileDivineAltar)te;
            
            int rotation = 0;
            if(teda.worldObj != null)
            {
                rotation = teda.getBlockMetadata();
            }
            
            // Bind texture
            Minecraft.getMinecraft().func_110434_K().func_110577_a(teda.texture);

            GL11.glPushMatrix();
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glTranslatef((float)x + 0.5F, (float)y+1.5F, (float)z + 0.5F);
           // GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180, 1.0F, 0.0F, 0.0F);
            teda.model.render(0.0625F);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glPopMatrix();
        }
        
    }

    

}
