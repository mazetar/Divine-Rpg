package xolova.divinerpg.blocks.twilight;

import net.minecraft.block.material.Material;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class BlockMythilDirt extends BlockDivineRPG
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
