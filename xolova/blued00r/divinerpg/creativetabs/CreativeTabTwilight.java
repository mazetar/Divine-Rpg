package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabTwilight extends CreativeTabs
{
    public CreativeTabTwilight()
    {
        super("tabTwilight");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.aquaton, 1, 0);
    }
}
