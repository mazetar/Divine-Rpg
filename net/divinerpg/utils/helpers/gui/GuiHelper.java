package net.divinerpg.utils.helpers.gui;

import net.divinerpg.blocks.iceika.tileentities.TileEntityCoalStoneFurnace;
import net.divinerpg.client.gui.GuiStoneFurnace;
import net.divinerpg.containers.ContainerCoalStoneFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHelper implements IGuiHandler {

	// IDS:
	public static final int COALSTONE_FURNACE = 50;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
			case COALSTONE_FURNACE :
				return new ContainerCoalStoneFurnace(player.inventory, (TileEntityCoalStoneFurnace) world.getBlockTileEntity(x, y, z));
		}
		
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
			case COALSTONE_FURNACE : 
				return new GuiStoneFurnace(player.inventory, (TileEntityCoalStoneFurnace) world.getBlockTileEntity(x, y, z));
		}
		
		return null;
	}

}
