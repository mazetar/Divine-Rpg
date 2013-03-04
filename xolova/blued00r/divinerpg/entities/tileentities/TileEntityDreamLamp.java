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
			System.out.println(coalDuration);
			if(coalDuration == 0)
			{
				inventory[0] = null;
				this.onInventoryChanged();
				dreamlamp.setLightValue(0.0F);
			}
			else if (!shouldLight())
			{
				coalDuration = 0;
				this.onInventoryChanged();
			}
            else if (this.ingredientID != this.inventory[0].itemID)
            {
                this.coalDuration = 0;
                this.onInventoryChanged();
            }
		}
		else if(shouldLight())
		{
			this.coalDuration = 400;
            this.ingredientID = this.inventory[0].itemID;
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
		return 1;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}
	
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items");
        this.inventory = new ItemStack[this.getSizeInventory()];

        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
            NBTTagCompound var4 = (NBTTagCompound)var2.tagAt(var3);
            byte var5 = var4.getByte("Slot");

            if (var5 >= 0 && var5 < this.inventory.length)
            {
                this.inventory[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }

        this.coalDuration = par1NBTTagCompound.getShort("coalDuration");
    }

    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("coalDuration", (short)this.coalDuration);
        NBTTagList var2 = new NBTTagList();

        for (int var3 = 0; var3 < this.inventory.length; ++var3)
        {
            if (this.inventory[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.inventory[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }

        par1NBTTagCompound.setTag("Items", var2);
    }

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}
}
