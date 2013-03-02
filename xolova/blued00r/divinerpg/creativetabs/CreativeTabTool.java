package xolova.blued00r.divinerpg.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class CreativeTabTool extends CreativeTabs
{
    public CreativeTabTool()
    {
        super("tabTool");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(DivineRPG.divinePickaxe, 1, 0);
    }
}
