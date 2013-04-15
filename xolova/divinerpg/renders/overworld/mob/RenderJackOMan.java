package xolova.divinerpg.renders.overworld.mob;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.DivineRPG;
import xolova.divinerpg.entities.overworld.mobs.EntityJackOMan;

public class RenderJackOMan extends RenderLiving
{
    private ModelBiped snowmanModel;
    protected float field_77070_b;

    public RenderJackOMan()
    {
        super(new ModelBiped(), 0.0F);
        this.snowmanModel = (ModelBiped)super.mainModel;
        this.setRenderPassModel(this.snowmanModel);
    }

    public RenderJackOMan(ModelBiped var1, float var2, float var3)
    {
        super(var1, var2);
        this.snowmanModel = var1;
        this.field_77070_b = var3;
    }

    protected void renderSnowmanPumpkin(EntityJackOMan var1, float var2)
    {
        super.renderEquippedItems(var1, var2);
        ItemStack var3 = new ItemStack(Block.pumpkin, 1);

        if (var3 != null && var3.getItem() instanceof ItemBlock)
        {
            GL11.glPushMatrix();
            this.snowmanModel.bipedHead.postRender(0.0625F);
            IItemRenderer var4 = MinecraftForgeClient.getItemRenderer(var3, IItemRenderer.ItemRenderType.EQUIPPED);
            boolean var5 = var4 != null && var4.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var3, IItemRenderer.ItemRendererHelper.BLOCK_3D);

            if (var5 || RenderBlocks.renderItemIn3d(Block.blocksList[var3.itemID].getRenderType()))
            {
                float var6 = 0.625F;
                GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
                GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var6, -var6, var6);
            }

            this.renderManager.itemRenderer.renderItem(var1, var3, 0);
            GL11.glPopMatrix();
        }
    }

    protected void renderEquippedItems(EntityLiving var1, float var2)
    {
        this.renderSnowmanPumpkin((EntityJackOMan)var1, var2);
        super.renderEquippedItems(var1, var2);
        ItemStack var3 = var1.getHeldItem();

        if (var3 != null)
        {
            GL11.glPushMatrix();
            this.snowmanModel.bipedRightArm.postRender(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            IItemRenderer var5 = MinecraftForgeClient.getItemRenderer(var3, IItemRenderer.ItemRenderType.EQUIPPED);
            boolean var6 = var5 != null && var5.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var3, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            float var4;

            if (var3.getItem() instanceof ItemBlock && (var6 || RenderBlocks.renderItemIn3d(Block.blocksList[var3.itemID].getRenderType())))
            {
                var4 = 0.5F;
                GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                var4 *= 0.75F;
                GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var4, -var4, var4);
            }
            else if (Item.itemsList[var3.itemID].isFull3D())
            {
                var4 = 0.625F;
                GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
                GL11.glScalef(var4, -var4, var4);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }
            else
            {
                var4 = 0.375F;
                GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
                GL11.glScalef(var4, var4, var4);
                GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
            }

            this.renderManager.itemRenderer.renderItem(var1, var3, 0);

            if (var3.getItem().requiresMultipleRenderPasses())
            {
                for (int var7 = 1; var7 < var3.getItem().getRenderPasses(var3.getItemDamage()); ++var7)
                {
                    this.renderManager.itemRenderer.renderItem(var1, var3, var7);
                }
            }

            GL11.glPopMatrix();
        }
    }
}
