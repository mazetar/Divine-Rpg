package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class CreativeTabUtility extends CreativeTabs
{
    public CreativeTabUtility()
    {
        super("tabUtility");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(TwilightBlockHelper.serenityChest, 1, 0);
    }
}
