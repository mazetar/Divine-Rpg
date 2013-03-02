package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.RailLogic;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockArcaniteRails extends BlockRail
{
    public BlockArcaniteRails(int var1, int var2, boolean var3)
    {
        super(var1, var2, var3);
        this.setCreativeTab(DivineRPG.tabBlocks);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        if (this.isPowered())
        {
            if (this.blockID == DivineRPG.arcaniteRails.blockID && (var2 & 8) == 0)
            {
                return this.blockIndexInTexture;
            }
        }
        else if (var2 >= 6)
        {
            return this.blockIndexInTexture;
        }

        return this.blockIndexInTexture;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            this.refreshTrackShape(var1, var2, var3, var4, true);

            if (this.blockID == Block.railPowered.blockID || this.blockID == DivineRPG.arcaniteRails.blockID)
            {
                this.onNeighborBlockChange(var1, var2, var3, var4, this.blockID);
            }
        }
    }

    private void refreshTrackShape(World var1, int var2, int var3, int var4, boolean var5)
    {
        if (!var1.isRemote)
        {
            (new RailLogic(this, var1, var2, var3, var4)).refreshTrackShape(var1.isBlockIndirectlyGettingPowered(var2, var3, var4), var5);
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!var1.isRemote)
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            int var7 = var6;

            if (this.isPowered())
            {
                var7 = var6 & 7;
            }

            boolean var8 = false;

            if (!var1.isBlockSolidOnSide(var2, var3 - 1, var4, ForgeDirection.UP))
            {
                var8 = true;
            }

            if (var7 == 2 && !var1.isBlockSolidOnSide(var2 + 1, var3, var4, ForgeDirection.UP))
            {
                var8 = true;
            }

            if (var7 == 3 && !var1.isBlockSolidOnSide(var2 - 1, var3, var4, ForgeDirection.UP))
            {
                var8 = true;
            }

            if (var7 == 4 && !var1.isBlockSolidOnSide(var2, var3, var4 - 1, ForgeDirection.UP))
            {
                var8 = true;
            }

            if (var7 == 5 && !var1.isBlockSolidOnSide(var2, var3, var4 + 1, ForgeDirection.UP))
            {
                var8 = true;
            }

            if (var8)
            {
                this.dropBlockAsItem(var1, var2, var3, var4, var1.getBlockMetadata(var2, var3, var4), 0);
                var1.setBlockWithNotify(var2, var3, var4, 0);
            }
            else if (this.blockID == DivineRPG.arcaniteRails.blockID)
            {
                boolean var9 = var1.isBlockIndirectlyGettingPowered(var2, var3, var4);
                boolean var10 = false;

                if (!var9 && (var6 & 8) == 0)
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, var7 | 8);
                    var10 = true;
                }
                else if (var9 && (var6 & 8) != 0)
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, var7);
                    var10 = true;
                }

                if (var10)
                {
                    var1.notifyBlocksOfNeighborChange(var2, var3 - 1, var4, this.blockID);

                    if (var7 == 2 || var7 == 3 || var7 == 4 || var7 == 5)
                    {
                        var1.notifyBlocksOfNeighborChange(var2, var3 + 1, var4, this.blockID);
                    }
                }
            }
            else if (var5 > 0 && Block.blocksList[var5].canProvidePower() && !this.isPowered() && RailLogic.getAdjacentTrackCount(new RailLogic(this, var1, var2, var3, var4)) == 3)
            {
                this.refreshTrackShape(var1, var2, var3, var4, false);
            }
        }
    }

    public void onMinecartPass(World var1, EntityMinecart var2, int var3, int var4, int var5)
    {
        if (var1.getBlockId(var3, var4, var5) == DivineRPG.arcaniteRails.blockID)
        {
            int var6 = var1.getBlockMetadata(var3, var4, var5);

            if ((var6 & 8) == 0)
            {
                double var7 = Math.sqrt(var2.motionX * var2.motionX + var2.motionZ * var2.motionZ);

                if (var7 < 0.03D)
                {
                    var2.motionX *= 0.0D;
                    var2.motionY *= 0.0D;
                    var2.motionZ *= 0.0D;
                }
                else
                {
                    var2.motionX *= 0.5D;
                    var2.motionY *= 0.0D;
                    var2.motionZ *= 0.5D;
                }
            }
            else
            {
                int var12 = var6 & 7;
                double var8 = Math.sqrt(var2.motionX * var2.motionX + var2.motionZ * var2.motionZ);

                if (var8 > 0.01D)
                {
                    double var10 = 0.06D;
                    var2.motionX += var2.motionX / var8 * var10;
                    var2.motionZ += var2.motionZ / var8 * var10;
                }
                else if (var12 == 1)
                {
                    if (var1.isBlockNormalCube(var3 - 1, var4, var5))
                    {
                        var2.motionX = 0.02D;
                    }
                    else if (var1.isBlockNormalCube(var3 + 1, var4, var5))
                    {
                        var2.motionX = -0.02D;
                    }
                }
                else if (var12 == 0)
                {
                    if (var1.isBlockNormalCube(var3, var4, var5 - 1))
                    {
                        var2.motionZ = 0.02D;
                    }
                    else if (var1.isBlockNormalCube(var3, var4, var5 + 1))
                    {
                        var2.motionZ = -0.02D;
                    }
                }
            }
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
