package xolova.blued00r.divinerpg.entities.tileentities;

import xolova.blued00r.divinerpg.blocks.BlockDreamLamp;
import xolova.blued00r.divinerpg.client.gui.GuiDreamLamp;
import xolova.blued00r.divinerpg.containers.ContainerInfusionTable;
import xolova.blued00r.divinerpg.misc.RecipesInfusionTable;
import net.minecraft.block.BlockFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

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
 			if (!(Item.itemsList[i.itemID] == Item.coal))
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
	
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        this.coalDuration = par1NBTTagCompound.getInteger("coalDuration");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("coalDuration", this.coalDuration);
    }

	@Override
	public void openChest() 
	{
		
	}

	@Override
	public void closeChest() {}
}