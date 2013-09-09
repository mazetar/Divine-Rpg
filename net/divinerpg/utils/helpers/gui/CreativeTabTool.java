package net.divinerpg.utils.helpers.gui;

import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabTool extends CreativeTabs
{
    public CreativeTabTool()
    {
        super("tabTool");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldItemHelper.oceanKnife, 1, 0);
    }
}
