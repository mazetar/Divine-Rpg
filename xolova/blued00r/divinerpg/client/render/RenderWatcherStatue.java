package xolova.blued00r.divinerpg.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.client.models.ModelWatcherStatue;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityWatcherStatue;

public class RenderWatcherStatue extends TileEntitySpecialRenderer
{
    private ModelWatcherStatue modelAltar;

    public RenderWatcherStatue()
    {
        modelAltar = new ModelWatcherStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityWatcherStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityWatcherStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y + 0.5F, (float)z + 0.8F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        bindTextureByName("/DivineRPG/StatueWatcher.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0425F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}