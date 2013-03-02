package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.client.models.ModelDramixAltar;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDramixAlter;

public class RenderDramixAlter extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelDramixAltar modelAltar;

    public RenderDramixAlter()
    {
        modelAltar = new ModelDramixAltar(scale);
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityDramixAlter)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityDramixAlter tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
        bindTextureByName("/DivineRPG/DramixSpawn.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
