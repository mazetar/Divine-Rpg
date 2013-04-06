package xolova.divinerpg.blocks.overworld;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.blocks.BlockDivineRPG;

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
