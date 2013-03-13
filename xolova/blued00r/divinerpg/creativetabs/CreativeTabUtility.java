package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabUtility extends CreativeTabs
{
    public CreativeTabUtility()
    {
        super("tabUtility");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.serenityChest, 1, 0);
    }
}
