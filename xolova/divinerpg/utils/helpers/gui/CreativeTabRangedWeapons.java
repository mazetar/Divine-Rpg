package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.item.TwilightItemHelper;

public class CreativeTabRangedWeapons extends CreativeTabs
{
    public CreativeTabRangedWeapons()
    {
        super("tabRanged");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(TwilightItemHelper.azuriteBlitz, 1, 0);
    }
}
