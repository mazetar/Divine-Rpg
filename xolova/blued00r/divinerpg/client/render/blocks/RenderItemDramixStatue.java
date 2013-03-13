package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.client.models.ModelDramixStatue;

public class RenderItemDramixStatue implements IItemRenderer
{
    private ModelDramixStatue dramixAltar;

    public RenderItemDramixStatue()
    {
        dramixAltar = new ModelDramixStatue();
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
                renderCalcinator(1F, 0.65F, 1F);
                break;

            case EQUIPPED:
                renderCalcinator(1F, 0.65F, 0F);
                break;

            case INVENTORY:
                renderCalcinator(1F, 0.65F, 1F);
                break;

            default:
                break;
        }
    }

    private void renderCalcinator(float x, float y, float z)
    {
        Tessellator tesselator = Tessellator.instance;
        ForgeHooksClient.bindTexture("/DivineRPG/StatueDramix.png", 0);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z + 1F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, -0.5F, 0.5F);
        GL11.glPushMatrix();
        dramixAltar.render(0.0275F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}