package net.divinerpg.utils.helpers.gui;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMobSpawners extends CreativeTabs
{
    public CreativeTabMobSpawners()
    {
        super("tabSpawner");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Block.mobSpawner, 1);
    }
}
