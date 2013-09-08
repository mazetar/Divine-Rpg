package net.divinerpg.utils.helpers.gui;

import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabTwilight extends CreativeTabs
{
    public CreativeTabTwilight()
    {
        super("tabTwilight");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldItemHelper.aquaton, 1, 0);
    }
}
