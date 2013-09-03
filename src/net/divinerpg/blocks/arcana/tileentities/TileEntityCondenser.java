package net.divinerpg.blocks.arcana.tileentities;

import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityCondenser extends TileEntity implements IInventory
{
    /** The itemstacks currently placed in the slots of the brewing stand */
    private ItemStack[] brewingItemStacks = new ItemStack[3];
    private int brewTime;

    /**
     * an integer with each bit specifying whether that slot of the stand contains a potion
     */
    private int filledSlots;
    private int ingredientID;

    /**
     * Returns the name of the inventory.
     */
    public String getInvName()
    {
        return "container.brewing";
    }

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.brewingItemStacks.length;
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        if (this.brewTime > 0)
        {
            --this.brewTime;

            if (this.brewTime == 0)
            {
                this.smeltItem();
                this.onInventoryChanged();
            }
            else if (!this.canSmelt())
            {
                this.brewTime = 0;
                this.onInventoryChanged();
            }
            else if (this.ingredientID != this.brewingItemStacks[3].itemID)
            {
                this.brewTime = 0;
                this.onInventoryChanged();
            }
        }
        else if (this.canSmelt())
        {
            this.brewTime = 400;
            this.ingredientID = this.brewingItemStacks[3].itemID;
        }

        int var1 = this.getFilledSlots();

        if (var1 != this.filledSlots)
        {
            this.filledSlots = var1;
            this.worldObj.setBlock(this.xCoord, this.yCoord, this.zCoord, ArcanaBlockHelper.condenser.blockID, var1, 3);
        }

        super.updateEntity();
    }

    public int getBrewTime()
    {
        return this.brewTime;
    }

    /**
     * Returns true if the furnace can smelt an item, i.e. has a source item, destination stack isn't full, etc.
     */
    private boolean canSmelt()
    {
        if (this.brewingItemStacks[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack var1 = FurnaceRecipes.smelting().getSmeltingResult(this.brewingItemStacks[0]);

            if (var1 == null)
            {
                return false;
            }

            if (this.brewingItemStacks[2] == null)
            {
                return true;
            }

            if (!this.brewingItemStacks[2].isItemEqual(var1))
            {
                return false;
            }

            int result = brewingItemStacks[2].stackSize + var1.stackSize;
            return (result <= getInventoryStackLimit() && result <= var1.getMaxStackSize());
        }
    }

    /**
     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack var1 = FurnaceRecipes.smelting().getSmeltingResult(this.brewingItemStacks[0]);

            if (this.brewingItemStacks[2] == null)
            {
                this.brewingItemStacks[2] = var1.copy();
            }
            else if (this.brewingItemStacks[2].isItemEqual(var1))
            {
                brewingItemStacks[2].stackSize += var1.stackSize;
            }

            --this.brewingItemStacks[0].stackSize;

            if (this.brewingItemStacks[0].stackSize <= 0)
            {
                this.brewingItemStacks[0] = null;
            }
        }
    }

    /**
     * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
     * fuel
     */
    public static int getItemBurnTime(ItemStack par0ItemStack)
    {
        if (par0ItemStack == null)
        {
            return 0;
        }
        else
        {
            int var1 = par0ItemStack.getItem().itemID;
            Item var2 = par0ItemStack.getItem();

            if (var1 == ArcanaItemHelper.veiloItem.itemID)
            {
                return 40;
            }

            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }

    /**
     * Return true if item is a fuel source (getItemBurnTime() > 0).
     */
    public static boolean isItemFuel(ItemStack par0ItemStack)
    {
        return getItemBurnTime(par0ItemStack) > 0;
    }
    
    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items");
        this.brewingItemStacks = new ItemStack[this.getSizeInventory()];

        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
            NBTTagCompound var4 = (NBTTagCompound)var2.tagAt(var3);
            byte var5 = var4.getByte("Slot");

            if (var5 >= 0 && var5 < this.brewingItemStacks.length)
            {
                this.brewingItemStacks[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }

        this.brewTime = par1NBTTagCompound.getShort("BrewTime");
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("BrewTime", (short)this.brewTime);
        NBTTagList var2 = new NBTTagList();

        for (int var3 = 0; var3 < this.brewingItemStacks.length; ++var3)
        {
            if (this.brewingItemStacks[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.brewingItemStacks[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }

        par1NBTTagCompound.setTag("Items", var2);
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int par1)
    {
        return par1 >= 0 && par1 < this.brewingItemStacks.length ? this.brewingItemStacks[par1] : null;
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int par1, int par2)
    {
        if (par1 >= 0 && par1 < this.brewingItemStacks.length)
        {
            ItemStack var3 = this.brewingItemStacks[par1];
            this.brewingItemStacks[par1] = null;
            return var3;
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (par1 >= 0 && par1 < this.brewingItemStacks.length)
        {
            ItemStack var2 = this.brewingItemStacks[par1];
            this.brewingItemStacks[par1] = null;
            return var2;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
    {
        if (par1 >= 0 && par1 < this.brewingItemStacks.length)
        {
            this.brewingItemStacks[par1] = par2ItemStack;
        }
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    public int getInventoryStackLimit()
    {
        return 1;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openChest() {}

    public void closeChest() {}

    @SideOnly(Side.CLIENT)
    public void setBrewTime(int par1)
    {
        this.brewTime = par1;
    }

    /**
     * returns an integer with each bit specifying wether that slot of the stand contains a potion
     */
    public int getFilledSlots()
    {
        int var1 = 0;

        for (int var2 = 0; var2 < 3; ++var2)
        {
            if (this.brewingItemStacks[var2] != null)
            {
                var1 |= 1 << var2;
            }
        }

        return var1;
    }

	@Override
	public boolean isInvNameLocalized() {
		// TODO Auto-generated method stub
		return false;
	}
@Override
public boolean isItemValidForSlot(int i, ItemStack itemstack) {
    // TODO Auto-generated method stub
    return true;
}
}
