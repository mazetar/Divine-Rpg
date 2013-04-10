package xolova.divinerpg.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import xolova.divinerpg.blocks.vethea.tileentities.TileEntityDreamLamp;
import xolova.divinerpg.containers.ContainerDreamLamp;

public class GuiDreamLamp extends GuiContainer {
	
	TileEntityDreamLamp TeDreamLamp;
	public GuiDreamLamp(InventoryPlayer inventory, TileEntityDreamLamp var7) 
	{
		super(new ContainerDreamLamp(inventory, var7));
		this.TeDreamLamp = var7;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture("/gui/Lamp.png");
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
        if(TeDreamLamp.isBurning())
        {
            int var7 = 12;
            this.drawTexturedModalRect(var5 + 81, var6 + 31 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
        }
	}
	
	public void updateScreen()
	{
		super.updateScreen();
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