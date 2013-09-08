package net.divinerpg.utils.helpers.gui;

import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabUtility extends CreativeTabs
{
    public CreativeTabUtility()
    {
        super("tabUtility");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldItemHelper.healingStone, 1, 0);
    }
}
