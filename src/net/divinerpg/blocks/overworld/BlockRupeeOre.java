package net.divinerpg.blocks.overworld;

import java.util.ArrayList;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockRupeeOre extends BlockDivine
{
    public BlockRupeeOre(int var1, int var2)
    {
        super(var1, var2, Material.rock);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return OverworldItemHelper.rupeeIngot.itemID;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
