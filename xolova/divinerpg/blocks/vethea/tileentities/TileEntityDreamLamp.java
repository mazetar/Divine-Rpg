package xolova.divinerpg.blocks.vethea.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import xolova.divinerpg.DivineRPG;
import xolova.divinerpg.blocks.vethea.BlockDreamLamp;
import xolova.divinerpg.client.gui.GuiDreamLamp;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;

public class TileEntityDreamLamp extends TileEntity implements IInventory
{
	private ItemStack[] inventory;
	private BlockDreamLamp dreamlamp;
	private GuiDreamLamp gui;
	public int coalDuration;
	private int ingredientID;
	
	public TileEntityDreamLamp(BlockDreamLamp block)
	{
		inventory = new ItemStack[1];
		dreamlamp = block;
	}

	@Override
	public int getSizeInventory() 
	{
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) 
	{
        return inventory[i];
	}
	
 	public void updateEntity()
 	{
		if(coalDuration > 0)
		{
			--coalDuration;
	        dreamlamp.updateFurnaceBlockState(this.coalDuration > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			if(coalDuration == 0)
			{
				dreamlamp.setLightValue(0.0F);
				this.onInventoryChanged();
			}
		}
		else if(shouldLight())
		{
			this.coalDuration = 6000;
		}
        super.updateEntity();
 	}
 	
 	public boolean shouldLight() 
 	{
 		if(inventory[0] != null && inventory[0].stackSize > 0)
 		{
 			ItemStack i = inventory[0];
 			if (!(Item.itemsList[i.itemID] == VetheaItemHelper.acidfire))
 			{
 				return false;
 			}else{
 				decrStackSize(0, 1);
 				return true;
 	        }
 		}
 		return false;
 	}

	@Override
    public ItemStack decrStackSize(int i, int j)
    {
        if (inventory[i] != null)
        {
            if (inventory[i].stackSize <= j)
            {
                ItemStack itemstack = inventory[i];
                inventory[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = inventory[i].splitStack(j);
            if (inventory[i].stackSize == 0)
            {
            	inventory[i] = null;
            }
            return itemstack1;
        }
        else
        {
            return null;
        }
    }
	
	public boolean isBurning()
	{
		return this.coalDuration > 0;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) 
	{
		return null;
	}

	@Override
    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        inventory[i] = itemstack;
        if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

	@Override
	public String getInvName() 
	{
		return "DreamLamp";
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}

	@Override
	public void openChest() 
	{
		
	}

	@Override
	public void closeChest() {}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public boolean isStackValidForSlot(int i, ItemStack itemstack) {
		return false;
	}
}