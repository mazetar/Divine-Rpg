package xolova.blued00r.divinerpg.containers;

import xolova.blued00r.divinerpg.entities.tileentities.TileEntityInfusionTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerInfusionTable extends Container
{
	public ContainerInfusionTable(InventoryPlayer inventory, TileEntityInfusionTable var7) 
	{
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) 
	{
		return true;
	}
}
