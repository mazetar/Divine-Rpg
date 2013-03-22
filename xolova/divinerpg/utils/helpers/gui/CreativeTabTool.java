package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class CreativeTabTool extends CreativeTabs
{
    public CreativeTabTool()
    {
        super("tabTool");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(OverworldItemHelper.divinePickaxe, 1, 0);
    }
}
