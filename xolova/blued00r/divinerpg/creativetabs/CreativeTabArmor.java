package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabArmor extends CreativeTabs
{
    public CreativeTabArmor()
    {
        super("tabArmor");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.divineHead, 1, 0);
    }
}
