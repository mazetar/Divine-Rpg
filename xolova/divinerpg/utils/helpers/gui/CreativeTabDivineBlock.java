package xolova.divinerpg.utils.helpers.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.utils.helpers.block.OverworldBlockHelper;

public class CreativeTabDivineBlock extends CreativeTabs
{
    public CreativeTabDivineBlock()
    {
        super("tabDivine");
    }

    public ItemStack getIconItemStack()
    {
        return new ItemStack(Item.ingotGold/*OverworldBlockHelper.steel*/, 1, 11);
    }
}
