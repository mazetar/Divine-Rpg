package xolova.divinerpg.renders.arcana.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.blocks.arcana.tileentities.TileEntityDramixStatue;
import xolova.divinerpg.models.arcana.tileentities.ModelDramixStatue;

public class RenderDramixStatue extends TileEntitySpecialRenderer
{
    private ModelDramixStatue modelAltar;

    public RenderDramixStatue()
    {
        modelAltar = new ModelDramixStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityDramixStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityDramixStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        bindTextureByName("/DivineRPG/StatueDramix.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0225F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}