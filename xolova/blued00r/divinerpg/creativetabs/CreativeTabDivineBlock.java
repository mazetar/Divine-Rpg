package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabDivineBlock extends CreativeTabs
{
    public CreativeTabDivineBlock()
    {
        super("tabDivine");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.steel, 1, 11);
    }
}
