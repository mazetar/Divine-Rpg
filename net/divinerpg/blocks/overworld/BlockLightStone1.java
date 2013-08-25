package net.divinerpg.blocks.overworld;

import net.divinerpg.blocks.BlockDivineRPG;
import net.minecraft.block.material.Material;

public class BlockLightStone1 extends BlockDivineRPG
{
    public BlockLightStone1(int var1, int var2)
    {
        super(var1, var2, Material.rock);
    }

    public int getSheet()
    {
        return 1;
    }
}
