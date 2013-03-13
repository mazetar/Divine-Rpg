package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabRangedWeapons extends CreativeTabs
{
    public CreativeTabRangedWeapons()
    {
        super("tabRanged");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.azuriteBlitz, 1, 0);
    }
}
