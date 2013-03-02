
package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSolarPanel extends Block
{
    public int inverted;

    public BlockSolarPanel(int var1)
    {
        super(var1, 5, Material.circuits);
        this.blockIndexInTexture = 52;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return !var1.isBlockNormalCube(var2, var3 - 1, var4) ? false : super.canPlaceBlockAt(var1, var2, var3, var4);
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World var1, int var2, int var3, int var4)
    {
        return !var1.isBlockNormalCube(var2, var3 - 1, var4) ? false : super.canBlockStay(var1, var2, var3, var4);
    }

    /**
     * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
     */
    public void onBlockClicked(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        this.onBlockActivated(var1, var2, var3, var4, var5, 0, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        if (var1.isRemote)
        {
            return true;
        }
        else
        {
            int var10 = var1.getBlockMetadata(var2, var3, var4);

            if (var10 < 10)
            {
                var1.setBlockAndMetadataWithNotify(var2, var3, var4, this.blockID, 10);
            }
            else if (var10 >= 10)
            {
                var1.setBlockAndMetadataWithNotify(var2, var3, var4, this.blockID, 0);
            }
            else
            {
                var1.setBlockAndMetadataWithNotify(var2, var3, var4, this.blockID, 0);
            }

            var1.notifyBlocksOfNeighborChange(var2, var3, var4, this.blockID);
            return true;
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote)
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);

            if (var6 < 10)
            {
                if (var1.canBlockSeeTheSky(var2, var3, var4) && var1.isDaytime())
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, 0);
                }
                else
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, 1);
                }
            }
            else if (var6 >= 10)
            {
                if (var1.canBlockSeeTheSky(var2, var3, var4) && var1.isDaytime())
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, 11);
                }
                else
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, 10);
                }
            }

            var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
        }
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        this.updateTick(var1, var2, var3, var4, var5);
    }

    /**
     * Is this block powering the block on the specified side
     */
    public boolean isPoweringTo(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        int var6 = var1.getBlockMetadata(var2, var3, var4);

        if (var6 >= 10)
        {
            var6 -= 10;
        }

        return var6 != 0;
    }

    /**
     * Is this block indirectly powering the block on the specified side
     */
    public boolean isIndirectlyPoweringTo(World var1, int var2, int var3, int var4, int var5)
    {
        return this.isPoweringTo(var1, var2, var3, var4, var5);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!this.canBlockStay(var1, var2, var3, var4))
        {
            this.dropBlockAsItem(var1, var2, var3, var4, var1.getBlockMetadata(var2, var3, var4), 0);
            var1.setBlockWithNotify(var2, var3, var4, 0);
            var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
        }
        else
        {
            var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 2);
        }
    }

    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 1);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
        var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
    }

    /**
     * Called right before the block is destroyed by a player.  Args: world, x, y, z, metaData
     */
    public void onBlockDestroyedByPlayer(World var1, int var2, int var3, int var4, int var5)
    {
        if (var1.getBlockMetadata(var2, var3, var4) % 10 == 1)
        {
            var1.notifyBlocksOfNeighborChange(var2 + 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2 - 1, var3, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 + 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3, var4 - 1, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);
            var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
        }

        super.onBlockDestroyedByPlayer(var1, var2, var3, var4, var5);
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
