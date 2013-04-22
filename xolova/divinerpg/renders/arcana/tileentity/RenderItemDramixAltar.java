package xolova.divinerpg.renders.arcana.tileentity;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.models.arcana.tileentities.ModelDramixAltar;
import cpw.mods.fml.client.FMLClientHandler;

public class RenderItemDramixAltar implements IItemRenderer
{
    private ModelDramixAltar dramixAltar;

    public RenderItemDramixAltar()
    {
        dramixAltar = new ModelDramixAltar(1 / 16F);
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper)
    {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch (type)
        {
            case ENTITY:
                renderAltar(-0.5F, 0F, -0.5F);
                break;

            case EQUIPPED:
                renderAltar(0F, 0.4F, 0F);
                break;

            case INVENTORY:
                renderAltar(1F, 0.65F, 1F);
                break;

            default:
                break;
        }
    }

    private void renderAltar(float x, float y, float z)
    {
        Tessellator tesselator = Tessellator.instance;
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/DivineRPG/DramixSpawn.png");
        GL11.glPushMatrix(); //start
        GL11.glTranslatef(x, y - 0.7F, z); //size
        dramixAltar.render(0.0275F);
        GL11.glPopMatrix(); //end
    }
}
