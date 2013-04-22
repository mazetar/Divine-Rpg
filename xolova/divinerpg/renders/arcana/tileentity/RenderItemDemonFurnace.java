package xolova.divinerpg.renders.arcana.tileentity;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.models.arcana.tileentities.ModelDemonFurnace;
import cpw.mods.fml.client.FMLClientHandler;

public class RenderItemDemonFurnace implements IItemRenderer
{
    private ModelDemonFurnace dramixAltar;

    public RenderItemDemonFurnace()
    {
        dramixAltar = new ModelDemonFurnace(1 / 16F);
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
                renderStatue(1F, 0.65F, 1F);
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
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/DivineRPG/DemonFurnace.png");
        GL11.glPushMatrix(); //start
        GL11.glTranslatef(x, y, z); //size
        dramixAltar.render(0.0275F);
        GL11.glPopMatrix(); //end
    }
}