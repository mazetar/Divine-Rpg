
package xolova.divinerpg.renders.arcana.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.blocks.arcana.tileentities.TileEntityDemonFurnace;
import xolova.divinerpg.models.arcana.tileentities.ModelDemonFurnace;

public class RenderDemonFurnace extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelDemonFurnace modelDemonFurnace;

    public RenderDemonFurnace()
    {
        modelDemonFurnace = new ModelDemonFurnace(scale);
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityDemonFurnace)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityDemonFurnace tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F);
        
        if(tileentity1.isBurning())
        {
        	bindTextureByName("/DivineRPG/DemonFurnaceON.png");
        }
        else
        {
        bindTextureByName("/DivineRPG/DemonFurnace.png");
        }
        GL11.glPushMatrix();
        modelDemonFurnace.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
