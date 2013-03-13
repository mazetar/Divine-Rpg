package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabHerbs extends CreativeTabs
{
    public CreativeTabHerbs()
    {
        super("tabHerb");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.growthSerenade, 1, 0);
    }
}
