package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.client.models.ModelDAZStatue;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDAZStatue;

public class RenderDAZStatue extends TileEntitySpecialRenderer
{
    private ModelDAZStatue modelAltar;

    public RenderDAZStatue()
    {
        modelAltar = new ModelDAZStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityDAZStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityDAZStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 1.2F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.8F, 0.5F);
        bindTextureByName("/DivineRPG/StatueDex.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0325F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}