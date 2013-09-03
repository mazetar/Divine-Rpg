package net.divinerpg.blocks.twilight;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.material.Material;

public class BlockMythilDirt extends BlockDivine
{
    public BlockMythilDirt(int var1)
    {
        super(var1, 1, Material.ground);
        this.setTickRandomly(true);
    }

    public int idDropped(int var1)
    {
        return TwilightBlockHelper.MythrilDirt.blockID;
    }
}
