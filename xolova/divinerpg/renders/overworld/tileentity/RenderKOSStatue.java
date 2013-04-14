package xolova.divinerpg.renders.overworld.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.blocks.overworld.tileentities.TileEntityKOSStatue;
import xolova.divinerpg.models.overworld.tileentities.ModelKOSStatue;

public class RenderKOSStatue extends TileEntitySpecialRenderer
{
    private ModelKOSStatue modelAltar;

    public RenderKOSStatue()
    {
        modelAltar = new ModelKOSStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityKOSStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityKOSStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        bindTextureByName("/DivineRPG/StatueKOS.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0225F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}