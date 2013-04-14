package xolova.divinerpg.renders.arcana.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.models.arcana.tileentities.ModelExtractor;

public class RenderExtractor extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelExtractor modelAltar;

    public RenderExtractor()
    {
        modelAltar = new ModelExtractor(scale);
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityExtractinator)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityExtractinator tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y, (float)z + 0.5F);
        bindTextureByName("/DivineRPG/Extractor.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
