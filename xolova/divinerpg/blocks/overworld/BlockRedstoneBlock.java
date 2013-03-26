package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;

public class BlockRedstoneBlock extends Block
{
    private boolean torchActive = false;
    private static List torchUpdates = new ArrayList();

    private boolean checkForBurnout(World var1, int var2, int var3, int var4, boolean var5)
    {
        if (var5)
        {
            torchUpdates.add(new RedstoneUpdateInfo(var2, var3, var4, var1.getWorldTime()));
        }

        int var6 = 0;

        for (int var7 = 0; var7 < torchUpdates.size(); ++var7)
        {
            RedstoneUpdateInfo var8 = (RedstoneUpdateInfo)torchUpdates.get(var7);

            if (var8.x == var2 && var8.y == var3 && var8.z == var4)
            {
                ++var6;

                if (var6 >= 8)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public BlockRedstoneBlock(int var1, int var2, boolean var3)
    {
        super(var1, var2, Material.circuits);
        this.torchActive = var3;
        this.setTickRandomly(true);
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate()
    {
        return 2;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (var1.getBlockMetadata(var2, var3, var4) == 0)
        {
            super.onBlockAdded(var1, var2, var3, var4);
        }

        if (this.torchActive)
        {
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
        }
    }

    public void onBlockRemoval(World var1, int var2, int var3, int var4)
    {
        if (this.torchActive)
        {
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
        }
    }

    /**
     * Is this block powering the block on the specified side
     */
    public boolean isPoweringTo(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        if (!this.torchActive)
        {
            return false;
        }
        else
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            return var6 == 5 && var5 == 1 ? false : (var6 == 3 && var5 == 3 ? false : (var6 == 4 && var5 == 2 ? false : (var6 == 1 && var5 == 5 ? false : var6 != 2 || var5 != 4)));
        }
    }

    private boolean isIndirectlyPowered(World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        return var5 == 5 && var1.isBlockIndirectlyProvidingPowerTo(var2, var3 - 1, var4, 0) ? true : (var5 == 3 && var1.isBlockIndirectlyProvidingPowerTo(var2, var3, var4 - 1, 2) ? true : (var5 == 4 && var1.isBlockIndirectlyProvidingPowerTo(var2, var3, var4 + 1, 3) ? true : (var5 == 1 && var1.isBlockIndirectlyProvidingPowerTo(var2 - 1, var3, var4, 4) ? true : var5 == 2 && var1.isBlockIndirectlyProvidingPowerTo(var2 + 1, var3, var4, 5))));
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        boolean var6 = this.isIndirectlyPowered(var1, var2, var3, var4);

        while (torchUpdates.size() > 0 && var1.getWorldTime() - ((RedstoneUpdateInfo)torchUpdates.get(0)).updateTime > 60L)
        {
            torchUpdates.remove(0);
        }

        if (this.torchActive)
        {
            if (var6)
            {
                var1.setBlockAndMetadataWithNotify(var2, var3, var4, DivineRPGTwilight.DivineRPGTwilight.blockID, var1.getBlockMetadata(var2, var3, var4));

                if (this.checkForBurnout(var1, var2, var3, var4, true))
                {
                    var1.playSoundEffect((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.rand.nextFloat() - var1.rand.nextFloat()) * 0.8F);

                    for (int var7 = 0; var7 < 5; ++var7)
                    {
                        double var8 = (double)var2 + var5.nextDouble() * 0.6D + 0.2D;
                        double var10 = (double)var3 + var5.nextDouble() * 0.6D + 0.2D;
                        double var12 = (double)var4 + var5.nextDouble() * 0.6D + 0.2D;
                        var1.spawnParticle("smoke", var8, var10, var12, 0.0D, 0.0D, 0.0D);
                    }
                }
            }
        }
        else if (!var6 && !this.checkForBurnout(var1, var2, var3, var4, false))
        {
            var1.setBlockAndMetadataWithNotify(var2, var3, var4, DivineRPGTwilight.DivineRPGTwilight.blockID, var1.getBlockMetadata(var2, var3, var4));
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        super.onNeighborBlockChange(var1, var2, var3, var4, var5);
        var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate());
    }

    public boolean isIndirectlyPoweringTo(World var1, int var2, int var3, int var4, int var5)
    {
        return var5 == 0 ? this.isPoweringTo(var1, var2, var3, var4, var5) : false;
    }

    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }

    public boolean canConnectRedstone(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return true;
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (this.torchActive)
        {
            Random var6 = var1.rand;
            double var7 = 0.0625D;

            for (int var9 = 0; var9 < 6; ++var9)
            {
                double var10 = (double)((float)var2 + var6.nextFloat());
                double var12 = (double)((float)var3 + var6.nextFloat());
                double var14 = (double)((float)var4 + var6.nextFloat());

                if (var9 == 0 && !var1.isBlockOpaqueCube(var2, var3 + 1, var4))
                {
                    var12 = (double)(var3 + 1) + var7;
                }

                if (var9 == 1 && !var1.isBlockOpaqueCube(var2, var3 - 1, var4))
                {
                    var12 = (double)(var3 + 0) - var7;
                }

                if (var9 == 2 && !var1.isBlockOpaqueCube(var2, var3, var4 + 1))
                {
                    var14 = (double)(var4 + 1) + var7;
                }

                if (var9 == 3 && !var1.isBlockOpaqueCube(var2, var3, var4 - 1))
                {
                    var14 = (double)(var4 + 0) - var7;
                }

                if (var9 == 4 && !var1.isBlockOpaqueCube(var2 + 1, var3, var4))
                {
                    var10 = (double)(var2 + 1) + var7;
                }

                if (var9 == 5 && !var1.isBlockOpaqueCube(var2 - 1, var3, var4))
                {
                    var10 = (double)(var2 + 0) - var7;
                }

                if (var10 < (double)var2 || var10 > (double)(var2 + 1) || var12 < 0.0D || var12 > (double)(var3 + 1) || var14 < (double)var4 || var14 > (double)(var4 + 1))
                {
                    var1.spawnParticle("reddust", var10, var12, var14, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile1;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }
}
