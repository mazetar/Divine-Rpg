package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.block.OverworldBlockHelper;

public class CreativeTabLighting extends CreativeTabs
{
    public CreativeTabLighting()
    {
        super("tabLight");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldBlockHelper.lavalamp, 1, 0);
    }
}
