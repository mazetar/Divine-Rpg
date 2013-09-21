package net.divinerpg.blocks.overworld;

import java.util.ArrayList;

import net.divinerpg.blocks.core.BlockDivine;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockRainbowWool extends BlockDivine
{
    public BlockRainbowWool(int var1, int var2)
    {
        super(var1, var2, Material.rock);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
