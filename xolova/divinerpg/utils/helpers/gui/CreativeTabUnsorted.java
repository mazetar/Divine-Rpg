package xolova.divinerpg.utils.helpers.gui;

import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabUnsorted extends CreativeTabs
{
    public CreativeTabUnsorted()
    {
        super("Unsorted");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(VetheaItemHelper.pardimalSword);
    }
}
