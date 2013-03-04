package xolova.blued00r.divinerpg.entities.tileentities;

import cpw.mods.fml.common.FMLCommonHandler;
import xolova.blued00r.divinerpg.containers.ContainerInfusionTable;
import xolova.blued00r.divinerpg.misc.RecipesInfusionTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityInfusionTable extends TileEntity implements IInventory
{
	private ItemStack[] inventory;
	private RecipesInfusionTable x;
	private boolean decreaseable = false;
	private Item item0;
	private Item item1;
	private Item item2;
	private ContainerInfusionTable q;
	
	public TileEntityInfusionTable()
	{
		inventory = new ItemStack[3];
	}

	@Override
	public int getSizeInventory() 
	{
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) 
	{
        int j = 0, k = 0;
        if (inventory[i] != null && inventory[2] == null)
        {
        	if(inventory[0] != null && inventory[1] != null)
        	{
        		item0 = inventory[0].getItem();
        		String name = item0.getItemName();
        		j = x.slotNumber1(name);
        		item1 = inventory[1].getItem();
        		String name1 = item1.getItemName();
        		k = x.slotNumber2(name1);
        	}
        	this.item2 = x.setSlot3(j, k);
        	if(item2 != null)
        	{
        		inventory[2] = new ItemStack(item2, 1);
        		inventory[0] = null;
        		inventory[1] = null;
        	}
        }
        return inventory[i];
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
		return "TeInfusionTable";
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
	
	public Item getItem()
	{
		return item2;
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}
}
