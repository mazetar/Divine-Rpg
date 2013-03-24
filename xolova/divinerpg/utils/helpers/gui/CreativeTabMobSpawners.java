package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class CreativeTabMobSpawners extends CreativeTabs
{
    public CreativeTabMobSpawners()
    {
        super("tabSpawner");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Block.mobSpawner/*OverworldItemHelper.watcherSpawn*/, 1, 0);
    }
}
