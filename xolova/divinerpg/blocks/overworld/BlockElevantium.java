package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;

public class BlockElevantium extends Block
{
    public BlockElevantium(int var1, int var2, Material var3)
    {
        super(var1, var2, var3);
        this.setTickRandomly(true);
        float var4 = 0.0625F;
        this.setBlockBounds(var4, 0.0F, var4, 1.0F - var4, 0.03125F, 1.0F - var4);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        return null;
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
     * Called whenever an entity is walking on top of this block. Args: world, x, y, z, entity
     */
    public void onEntityWalking(World var1, int var2, int var3, int var4, Entity var5)
    {
        ++var5.motionY;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        boolean var5 = var1.getBlockMetadata(var2, var3, var4) == 1;
        float var6 = 0.0625F;
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.0625F, 1.0F - var6);
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        float var1 = 0.5F;
        float var2 = 0.125F;
        float var3 = 0.5F;
        this.setBlockBounds(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile2;
    }
}
