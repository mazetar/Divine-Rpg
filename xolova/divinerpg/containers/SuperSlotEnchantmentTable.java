package xolova.divinerpg.containers;

import net.minecraft.inventory.InventoryBasic;

public class SuperSlotEnchantmentTable extends InventoryBasic
{
    /** The brewing stand this slot belongs to. */
    final ContainerSuperEnchant container;

    public SuperSlotEnchantmentTable(ContainerSuperEnchant containerSuperEnchant, String par2Str, int par3)
    {
        super(par2Str, par3);
        this.container = containerSuperEnchant;
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
     * Called when an the contents of an Inventory change, usually
     */
    public void onInventoryChanged()
    {
        super.onInventoryChanged();
        this.container.onCraftMatrixChanged(this);
    }
}