package xolova.blued00r.divinerpg.client.render.blocks;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.client.models.ModelDemonFurnace;
import xolova.blued00r.divinerpg.client.models.ModelDramixAltar;
import xolova.blued00r.divinerpg.client.models.ModelPhoenixAltar;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDemonFurnace;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityPheonixAltar;

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
                renderCalcinator(1F, 0.65F, 1F);
                break;

            case EQUIPPED:
                renderCalcinator(1F, 0.65F, 1F);
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
        ForgeHooksClient.bindTexture("/DivineRPG/DemonFurnace.png", 0);
        GL11.glPushMatrix(); //start
        GL11.glTranslatef(x, y, z); //size
        dramixAltar.render(0.0275F);
        GL11.glPopMatrix(); //end
    }
}