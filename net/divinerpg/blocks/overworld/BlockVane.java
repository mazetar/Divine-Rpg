package net.divinerpg.blocks.overworld;

import java.util.ArrayList;

import net.divinerpg.blocks.BlockDivine;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockVane extends BlockDivine
{
    public BlockVane(int var1, int var2)
    {
        super(var1, var2, Material.rock);
    }

    public int damageDropped(int var1)
    {
        return var1;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
