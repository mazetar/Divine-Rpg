package xolova.blued00r.divinerpg.blocks.vethea;

import java.util.Random;

import net.minecraft.world.World;

public class BlockDreamglow extends BlockVetheaPlant
{
    public BlockDreamglow(int par1, int par2)
    {
        super(par1, par2);
        float var3 = 0.2F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
        this.setTickRandomly(true);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par5Random.nextInt(25) == 0)
        {
            byte var6 = 4;
            int var7 = 5;
            int var8;
            int var9;
            int var10;

            for (var8 = par2 - var6; var8 <= par2 + var6; ++var8)
            {
                for (var9 = par4 - var6; var9 <= par4 + var6; ++var9)
                {
                    for (var10 = par3 - 1; var10 <= par3 + 1; ++var10)
                    {
                        if (par1World.getBlockId(var8, var10, var9) == this.blockID)
                        {
                            --var7;

                            if (var7 <= 0)
                            {
                                return;
                            }
                        }
                    }
                }
            }

            var8 = par2 + par5Random.nextInt(3) - 1;
            var9 = par3 + par5Random.nextInt(2) - par5Random.nextInt(2);
            var10 = par4 + par5Random.nextInt(3) - 1;

            for (int var11 = 0; var11 < 4; ++var11)
            {
                if (par1World.isAirBlock(var8, var9, var10) && this.canBlockStay(par1World, var8, var9, var10))
                {
                    par2 = var8;
                    par3 = var9;
                    par4 = var10;
                }

                var8 = par2 + par5Random.nextInt(3) - 1;
                var9 = par3 + par5Random.nextInt(2) - par5Random.nextInt(2);
                var10 = par4 + par5Random.nextInt(3) - 1;
            }

            if (par1World.isAirBlock(var8, var9, var10) && this.canBlockStay(par1World, var8, var9, var10))
            {
                par1World.setBlockWithNotify(var8, var9, var10, this.blockID);
            }
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && this.canBlockStay(par1World, par2, par3, par4);
    }

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return false;
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
    	return true;
    }
}