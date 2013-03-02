package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.client.models.ModelAEStatue;
import xolova.blued00r.divinerpg.client.models.ModelExtractor;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityAEStatue;

public class RenderAEStatue extends TileEntitySpecialRenderer
{
    private ModelAEStatue modelAltar;

    public RenderAEStatue()
    {
        modelAltar = new ModelAEStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityAEStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityAEStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 0.8F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        bindTextureByName("/DivineRPG/StatueAE.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0225F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}