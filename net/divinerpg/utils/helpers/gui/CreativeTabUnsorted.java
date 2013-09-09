package net.divinerpg.utils.helpers.gui;

import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabUnsorted extends CreativeTabs
{
    public CreativeTabUnsorted()
    {
        super("Unsorted");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldBlockHelper.blazePumpkin);
    }
}
