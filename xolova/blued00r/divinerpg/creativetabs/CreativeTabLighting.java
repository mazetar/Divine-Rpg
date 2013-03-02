package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabLighting extends CreativeTabs
{
    public CreativeTabLighting()
    {
        super("tabLight");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.lavalamp, 1, 0);
    }
}
