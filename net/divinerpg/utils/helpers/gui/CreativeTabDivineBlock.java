package net.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabDivineBlock extends CreativeTabs
{
    public CreativeTabDivineBlock()
    {
        super("tabDivine");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Item.ingotGold/*OverworldBlockHelper.steel*/, 1, 11);
    }
}
