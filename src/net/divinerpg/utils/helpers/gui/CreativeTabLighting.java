package net.divinerpg.utils.helpers.gui;

import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabLighting extends CreativeTabs
{
    public CreativeTabLighting()
    {
        super("tabLight");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldBlockHelper.lavaLamp, 1);
    }
}
