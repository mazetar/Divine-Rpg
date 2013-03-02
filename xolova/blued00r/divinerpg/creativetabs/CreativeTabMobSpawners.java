package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabMobSpawners extends CreativeTabs
{
    public CreativeTabMobSpawners()
    {
        super("tabSpawner");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.watcherSpawn, 1, 0);
    }
}
