package net.divinerpg.blocks.twilight;

import net.divinerpg.blocks.BlockDivineRPG;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.material.Material;

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
