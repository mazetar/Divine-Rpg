package net.divinerpg.utils.helpers.gui;

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
        return new ItemStack(Item.pickaxeIron/*OverworldItemHelper.divinePickaxe*/, 1, 0);
    }
}
