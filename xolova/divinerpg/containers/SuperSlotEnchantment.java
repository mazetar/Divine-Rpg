package xolova.divinerpg.containers;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SuperSlotEnchantment extends Slot
{
    /** The brewing stand this slot belongs to. */
    final ContainerSuperEnchant container;

    public SuperSlotEnchantment(ContainerSuperEnchant containerSuperEnchant, IInventory par2IInventory, int par3, int par4, int par5)
    {
        super(par2IInventory, par3, par4, par5);
        this.container = containerSuperEnchant;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack par1ItemStack)
    {
        return true;
    }
}