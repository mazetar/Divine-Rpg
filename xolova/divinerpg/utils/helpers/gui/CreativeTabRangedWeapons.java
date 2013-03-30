package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabRangedWeapons extends CreativeTabs
{
    public CreativeTabRangedWeapons()
    {
        super("tabRanged");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Item.bow/*TwilightItemHelper.azuriteBlitz*/, 1, 0);
    }
}
