package net.divinerpg.blocks.twilight;

import net.divinerpg.blocks.BlockDivineRPG;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.material.Material;

public class BlockUviteDirt extends BlockDivineRPG
{
    public BlockUviteDirt(int var1)
    {
        super(var1, 1, Material.ground);
        this.setTickRandomly(true);
    }

    public int idDropped(int var1)
    {
        return TwilightBlockHelper.UviteDirt.blockID;
    }
}
