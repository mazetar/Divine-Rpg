package net.divinerpg.blocks.twilight;

import net.divinerpg.blocks.BlockDivineRPGLog;
import net.minecraft.world.World;

public class BlockTwilightWood extends BlockDivineRPGLog
{
    public BlockTwilightWood(int var1)
    {
        super(var1);
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 31;
    }

    public int func_85104_a(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
        int var10 = par9 & 3;
        byte var11 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                var11 = 0;
                break;

            case 2:
            case 3:
                var11 = 8;
                break;

            case 4:
            case 5:
                var11 = 4;
        }

        return var10 | var11;
    }

    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }


    public int damageDropped(int var1)
    {
        return var1;
    }
}
