package xolova.divinerpg.renders.arcana.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.blocks.arcana.tileentities.TileEntityPheonixAltar;
import xolova.divinerpg.models.arcana.tileentities.ModelPhoenixAltar;

public class RenderPheonixAltar extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelPhoenixAltar modelAltar;

    public RenderPheonixAltar()
    {
        modelAltar = new ModelPhoenixAltar(scale);
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityPheonixAltar)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityPheonixAltar tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
        bindTextureByName("/DivineRPG/PhoenixSpawn.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
