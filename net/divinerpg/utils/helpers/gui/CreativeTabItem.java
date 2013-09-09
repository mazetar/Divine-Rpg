package net.divinerpg.utils.helpers.gui;

import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
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
        return new ItemStack(OverworldBlockHelper.rupeeOre, 1);
    }
}
