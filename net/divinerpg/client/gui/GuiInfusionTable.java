package net.divinerpg.client.gui;

import java.awt.Color;

import net.divinerpg.blocks.vethea.tileentities.TileEntityInfusionTable;
import net.divinerpg.containers.ContainerInfusionTable;
import net.divinerpg.lib.ResourceGuiLoc;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;


public class GuiInfusionTable extends GuiContainer
{
	private TileEntityInfusionTable TeInfusionTable;

	public GuiInfusionTable(ContainerInfusionTable container) 
	{
		super(container);
		this.TeInfusionTable = container.tileentity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.func_110434_K().func_110577_a(ResourceGuiLoc.GUI_INFUSIONTABLE);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
	}
	
    public void drawScreen(int par1, int par2, float par3)
	{
    	super.drawScreen(par1, par2, par3);
    	ItemStack item = null;
    	String s = null;
		item = TeInfusionTable.getStackInSlot(2);
		if(item != null)
		{
			s = item.getDisplayName();
			this.drawString(fontRenderer, s, width / 2 - 20, 62, Color.blue.getRGB());
		}		
	}
    
    public boolean doesGuiPauseGame()
    {
    	return false;
    }
    
    protected void keyTyped(char par1, int par2)
    {
        if (par2 == 1 || par2 == mc.gameSettings.keyBindInventory.keyCode)
        {
            mc.thePlayer.closeScreen();
        }
    }
}
