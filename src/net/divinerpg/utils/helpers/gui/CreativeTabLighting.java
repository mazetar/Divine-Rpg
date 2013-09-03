package net.divinerpg.utils.helpers.gui;

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
        return new ItemStack(Block.glowStone/*OverworldBlockHelper.lavalamp*/, 1, 0);
    }
}
