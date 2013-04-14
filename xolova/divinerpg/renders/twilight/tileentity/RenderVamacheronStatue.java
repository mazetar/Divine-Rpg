package xolova.divinerpg.renders.twilight.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.models.twilight.tileentities.ModelVamacheronStatue;

public class RenderVamacheronStatue extends TileEntitySpecialRenderer
{
    private ModelVamacheronStatue modelAltar;

    public RenderVamacheronStatue()
    {
        modelAltar = new ModelVamacheronStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityVamacheronStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityVamacheronStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 0.8F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        bindTextureByName("/DivineRPG/StatueVamacheron.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0225F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}