package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class CreativeTabHerbs extends CreativeTabs
{
    public CreativeTabHerbs()
    {
        super("tabHerb");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldItemHelper.growthSerenade, 1, 0);
    }
}
