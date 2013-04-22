package xolova.divinerpg.renders.overworld.tileentity;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.models.overworld.tileentities.ModelWatcherStatue;
import cpw.mods.fml.client.FMLClientHandler;

public class RenderItemWatcherStatue implements IItemRenderer
{
    private ModelWatcherStatue dramixAltar;

    public RenderItemWatcherStatue()
    {
        dramixAltar = new ModelWatcherStatue();
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
                renderStatue(1F, 0.65F, 1F);
                break;

            case EQUIPPED:
                renderStatue(1F, 0.65F, 0F);
                break;

            case INVENTORY:
                renderStatue(1F, 0.65F, 1F);
                break;

            default:
                break;
        }
    }

    private void renderStatue(float x, float y, float z)
    {
        Tessellator tesselator = Tessellator.instance;
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/DivineRPG/StatueWatcher.png");
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y + 0.5F, (float)z + 0.8F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        GL11.glPushMatrix();
        dramixAltar.render(0.06F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}