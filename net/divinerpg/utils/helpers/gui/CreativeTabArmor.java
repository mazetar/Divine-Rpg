package net.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabArmor extends CreativeTabs
{
    public CreativeTabArmor()
    {
        super("tabArmor");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Item.helmetChain/*OverworldItemHelper.divineHead*/, 1, 0);
    }
}