package xolova.blued00r.divinerpg.client.gui;

import org.lwjgl.opengl.GL11;

import xolova.blued00r.divinerpg.containers.ContainerInfusionTable;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityInfusionTable;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class GuiInfusionTable extends GuiContainer
{
	public GuiInfusionTable(InventoryPlayer inventory, TileEntityInfusionTable var7) 
	{
		super(new ContainerInfusionTable(inventory, var7));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
	{
		int k = mc.renderEngine.getTexture("/gui/InfusionTable.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(k);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
	}
}
