package xolova.divinerpg.utils.helpers.gui;

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
        return new ItemStack(OverworldItemHelper.watcherSpawn, 1, 0);
    }
}
