package xolova.divinerpg.blocks.twilight;

import net.minecraft.block.material.Material;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class BlockAugiteDirt extends BlockDivineRPG 
{
    public BlockAugiteDirt(int var1)
    {
        super(var1, 1, Material.ground);
        this.setTickRandomly(true);
    }

    public int idDropped()
    {
        return TwilightBlockHelper.DraviteDirt.blockID;
    }

}
