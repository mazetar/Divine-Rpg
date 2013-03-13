package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabItem extends CreativeTabs
{
    public CreativeTabItem()
    {
        super("tabRaw");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.rupee, 1, 0);
    }
}
