package xolova.divinerpg.blocks.overworld;

import java.util.ArrayList;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.blocks.BlockDivineRPG;

public class BlockVane extends BlockDivineRPG
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
