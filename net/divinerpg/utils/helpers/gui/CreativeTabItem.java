package net.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabItem extends CreativeTabs
{
    public CreativeTabItem()
    {
        super("tabRaw");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Item.diamond/*OverworldItemHelper.rupee*/, 1, 0);
    }
}
