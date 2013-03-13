package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockTwilightReed extends Block
{
    public BlockTwilightReed(int var1, int var2)
    {
        super(var1, Material.plants);
        this.blockIndexInTexture = var2;
        float var3 = 0.375F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
        this.setTickRandomly(true);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (var1.isAirBlock(var2, var3 + 1, var4))
        {
            int var6;

            for (var6 = 1; var1.getBlockId(var2, var3 - var6, var4) == this.blockID; ++var6)
            {
                ;
            }

            if (var6 < 3)
            {
                int var7 = var1.getBlockMetadata(var2, var3, var4);

                if (var7 == 15)
                {
                    var1.setBlockWithNotify(var2, var3 + 1, var4, this.blockID);
                    var1.setBlockMetadataWithNotify(var2, var3, var4, 0);
                }
                else
                {
                    var1.setBlockMetadataWithNotify(var2, var3, var4, var7 + 1);
                }
            }
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockId(var2, var3 - 1, var4);
        return var5 == this.blockID ? true : (var5 != Block.grass.blockID && var5 != Block.dirt.blockID && var5 != Block.sand.blockID ? false : (var1.getBlockMaterial(var2 - 1, var3 - 1, var4) == Material.water ? true : (var1.getBlockMaterial(var2 + 1, var3 - 1, var4) == Material.water ? true : (var1.getBlockMaterial(var2, var3 - 1, var4 - 1) == Material.water ? true : var1.getBlockMaterial(var2, var3 - 1, var4 + 1) == Material.water))));
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        this.checkBlockCoordValid(var1, var2, var3, var4);
    }

    protected final void checkBlockCoordValid(World var1, int var2, int var3, int var4)
    {
        if (!this.canBlockStay(var1, var2, var3, var4))
        {
            this.dropBlockAsItem(var1, var2, var3, var4, var1.getBlockMetadata(var2, var3, var4), 0);
            var1.setBlockWithNotify(var2, var3, var4, 0);
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World var1, int var2, int var3, int var4)
    {
        return this.canPlaceBlockAt(var1, var2, var3, var4);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        return null;
    }

    public int idDropped(int var1)
    {
        return var1;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }
}
