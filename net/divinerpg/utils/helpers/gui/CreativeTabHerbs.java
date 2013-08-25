package net.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHerbs extends CreativeTabs
{
    public CreativeTabHerbs()
    {
        super("tabHerb");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Item.seeds/*OverworldItemHelper.growthSerenade*/, 1, 0);
    }
}
