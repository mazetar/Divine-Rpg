package xolova.divinerpg.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDreamLamp;

public class ContainerDreamLamp extends Container
{
	private TileEntityDreamLamp tile_entity;
	public ContainerDreamLamp(InventoryPlayer inventory, TileEntityDreamLamp var7) 
	{
		this.tile_entity = var7;
		addSlotToContainer(new Slot(tile_entity, 0, 80, 47));
		bindPlayerInventory(inventory);
	}
	
	public void bindPlayerInventory(InventoryPlayer inventoryplayer)
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				addSlotToContainer(new Slot(inventoryplayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for(int i = 0; i < 9; i++)	
		{
			addSlotToContainer(new Slot(inventoryplayer, i, 8 + i * 18, 142));
		}
	}
	
	@Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int i)
	{
		ItemStack stack = null;
		Slot slot_object = (Slot) inventorySlots.get(i);

		if(slot_object != null && slot_object.getHasStack())
			{
			ItemStack stack_in_slot = slot_object.getStack();
			stack = stack_in_slot.copy();

			if(i == 0 || i == 1)
			{
				if(!mergeItemStack(stack_in_slot, 1, inventorySlots.size(), true))
				{
					return null;
				}
			} 
			else if(!mergeItemStack(stack_in_slot, 0, 1, false))
			{
				return null;
			}
			
			if(i == 2)
			{
				return null;
			}

			if(stack_in_slot.stackSize == 0)
			{
				slot_object.putStack(null);
			} else
			{
				slot_object.onSlotChanged();
			}
		}

		return stack;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer var1) 
	{
		return true;
	}
}
