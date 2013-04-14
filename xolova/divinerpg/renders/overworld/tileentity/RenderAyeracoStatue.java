package xolova.divinerpg.renders.overworld.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.blocks.overworld.tileentities.TileEntityAyeracoStatue;
import xolova.divinerpg.models.overworld.tileentities.ModelAyeracoStatue;

public class RenderAyeracoStatue extends TileEntitySpecialRenderer
{
    private ModelAyeracoStatue modelAltar;

    public RenderAyeracoStatue()
    {
        modelAltar = new ModelAyeracoStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityAyeracoStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityAyeracoStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        bindTextureByName("/DivineRPG/StatueAyeraco.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0225F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}