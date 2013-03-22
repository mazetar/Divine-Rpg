package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class CreativeTabItem extends CreativeTabs
{
    public CreativeTabItem()
    {
        super("tabRaw");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldItemHelper.rupee, 1, 0);
    }
}
