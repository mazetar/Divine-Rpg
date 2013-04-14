package xolova.divinerpg.renders.twilight.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.blocks.twilight.tileentities.TileEntitySFStatue;
import xolova.divinerpg.models.twilight.tileentities.ModelSFStatue;

public class RenderSFStatue extends TileEntitySpecialRenderer
{
    private ModelSFStatue modelAltar;

    public RenderSFStatue()
    {
        modelAltar = new ModelSFStatue();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntitySFStatue)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntitySFStatue tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 0.8F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        bindTextureByName("/DivineRPG/StatueSF.png");
        GL11.glPushMatrix();
        modelAltar.render(0.0225F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}