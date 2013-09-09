package net.divinerpg.utils.helpers.gui;

import net.divinerpg.utils.helpers.item.OverworldItemHelper;
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
        return new ItemStack(OverworldItemHelper.divineHelm, 1, 0);
    }
}
