package xolova.divinerpg.client.gui;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiButtonMerchant;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.StatCollector;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import xolova.divinerpg.containers.ContainerDatticon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiDatticon extends GuiContainer
{
    private IMerchant theIMerchant;
    private GuiButtonMerchant nextRecipeButtonIndex;
    private GuiButtonMerchant previousRecipeButtonIndex;
    private int currentRecipeIndex = 0;

    public GuiDatticon(InventoryPlayer var1, IMerchant var2, World var3)
    {
        super(new ContainerDatticon(var1, var2, var3));
        this.theIMerchant = var2;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        super.initGui();
        int var1 = (this.width - this.xSize) / 2;
        int var2 = (this.height - this.ySize) / 2;
        this.buttonList.add(this.nextRecipeButtonIndex = new GuiButtonMerchant(1, var1 + 120 + 27, var2 + 24 - 1, true));
        this.buttonList.add(this.previousRecipeButtonIndex = new GuiButtonMerchant(2, var1 + 36 - 19, var2 + 24 - 1, false));
        this.nextRecipeButtonIndex.enabled = false;
        this.previousRecipeButtonIndex.enabled = false;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int var1, int var2)
    {
        this.fontRenderer.drawString(StatCollector.translateToLocal("Datticon"), 56, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        super.updateScreen();
        MerchantRecipeList var1 = this.theIMerchant.getRecipes(this.mc.thePlayer);

        if (var1 != null)
        {
            this.nextRecipeButtonIndex.enabled = this.currentRecipeIndex < var1.size() - 1;
            this.previousRecipeButtonIndex.enabled = this.currentRecipeIndex > 0;
        }
    }

    /**
     * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
     */
    protected void actionPerformed(GuiButton var1)
    {
        boolean var2 = false;

        if (var1 == this.nextRecipeButtonIndex)
        {
            ++this.currentRecipeIndex;
            var2 = true;
        }
        else if (var1 == this.previousRecipeButtonIndex)
        {
            --this.currentRecipeIndex;
            var2 = true;
        }

        if (var2)
        {
            ((ContainerDatticon)this.inventorySlots).setCurrentRecipeIndex(this.currentRecipeIndex);
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4 = new DataOutputStream(var3);

            try
            {
                var4.writeInt(this.currentRecipeIndex);
                this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("MC|TrSel", var3.toByteArray()));
            }
            catch (Exception var6)
            {
                var6.printStackTrace();
            }
        }
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture("/gui/Datticon.png");
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int var1, int var2, float var3)
    {
        super.drawScreen(var1, var2, var3);
        MerchantRecipeList var4 = this.theIMerchant.getRecipes(this.mc.thePlayer);

        if (var4 != null && !var4.isEmpty())
        {
            int var5 = (this.width - this.xSize) / 2;
            int var6 = (this.height - this.ySize) / 2;
            int var7 = this.currentRecipeIndex;
            MerchantRecipe var8 = (MerchantRecipe)var4.get(var7);

            if (var8.func_82784_g())
            {
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, this.mc.renderEngine.getTexture("/gui/trading.png"));
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glDisable(GL11.GL_LIGHTING);
                this.drawTexturedModalRect(this.guiLeft + 83, this.guiTop + 21, 212, 0, 28, 21);
                this.drawTexturedModalRect(this.guiLeft + 83, this.guiTop + 51, 212, 0, 28, 21);
            }

            GL11.glPushMatrix();
            ItemStack var9 = var8.getItemToBuy();
            ItemStack var10 = var8.getSecondItemToBuy();
            ItemStack var11 = var8.getItemToSell();
            RenderHelper.enableGUIStandardItemLighting();
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glEnable(GL11.GL_COLOR_MATERIAL);
            GL11.glEnable(GL11.GL_LIGHTING);
            itemRenderer.zLevel = 100.0F;
            itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.renderEngine, var9, var5 + 36, var6 + 24);
            itemRenderer.renderItemOverlayIntoGUI(this.fontRenderer, this.mc.renderEngine, var9, var5 + 36, var6 + 24);

            if (var10 != null)
            {
                itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.renderEngine, var10, var5 + 62, var6 + 24);
                itemRenderer.renderItemOverlayIntoGUI(this.fontRenderer, this.mc.renderEngine, var10, var5 + 62, var6 + 24);
            }

            itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.renderEngine, var11, var5 + 120, var6 + 24);
            itemRenderer.renderItemOverlayIntoGUI(this.fontRenderer, this.mc.renderEngine, var11, var5 + 120, var6 + 24);
            itemRenderer.zLevel = 0.0F;
            GL11.glDisable(GL11.GL_LIGHTING);

            if (this.isPointInRegion(36, 24, 16, 16, var1, var2))
            {
                this.drawItemStackTooltip(var9, var1, var2);
            }
            else if (var10 != null && this.isPointInRegion(62, 24, 16, 16, var1, var2))
            {
                this.drawItemStackTooltip(var10, var1, var2);
            }
            else if (this.isPointInRegion(120, 24, 16, 16, var1, var2))
            {
                this.drawItemStackTooltip(var11, var1, var2);
            }

            GL11.glPopMatrix();
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            RenderHelper.enableStandardItemLighting();
        }
    }

    public IMerchant getIMerchant()
    {
        return this.theIMerchant;
    }
}
