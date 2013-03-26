package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;

public class BlockNewFence extends BlockFence
{
    public BlockNewFence(int var1, int var2, Material var3)
    {
        super(var1, var2, var3);
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return super.canPlaceBlockAt(var1, var2, var3, var4);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        boolean var5 = this.canConnectFenceTo(var1, var2, var3, var4 - 1);
        boolean var6 = this.canConnectFenceTo(var1, var2, var3, var4 + 1);
        boolean var7 = this.canConnectFenceTo(var1, var2 - 1, var3, var4);
        boolean var8 = this.canConnectFenceTo(var1, var2 + 1, var3, var4);
        float var9 = 0.375F;
        float var10 = 0.625F;
        float var11 = 0.375F;
        float var12 = 0.625F;

        if (var5)
        {
            var11 = 0.0F;
        }

        if (var6)
        {
            var12 = 1.0F;
        }

        if (var7)
        {
            var9 = 0.0F;
        }

        if (var8)
        {
            var10 = 1.0F;
        }

        return AxisAlignedBB.getBoundingBox((double)((float)var2 + var9), (double)var3, (double)((float)var4 + var11), (double)((float)var2 + var10), (double)((float)var3 + 1.5F), (double)((float)var4 + var12));
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        boolean var5 = this.canConnectFenceTo(var1, var2, var3, var4 - 1);
        boolean var6 = this.canConnectFenceTo(var1, var2, var3, var4 + 1);
        boolean var7 = this.canConnectFenceTo(var1, var2 - 1, var3, var4);
        boolean var8 = this.canConnectFenceTo(var1, var2 + 1, var3, var4);
        float var9 = 0.375F;
        float var10 = 0.625F;
        float var11 = 0.375F;
        float var12 = 0.625F;

        if (var5)
        {
            var11 = 0.0F;
        }

        if (var6)
        {
            var12 = 1.0F;
        }

        if (var7)
        {
            var9 = 0.0F;
        }

        if (var8)
        {
            var10 = 1.0F;
        }

        this.setBlockBounds(var9, 0.0F, var11, var10, 1.0F, var12);
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

    public boolean getBlocksMovement(IBlockAccess var1, int var2, int var3, int var4)
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 11;
    }

    /**
     * Returns true if the specified block can be connected by a fence
     */
    public boolean canConnectFenceTo(IBlockAccess var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockId(var2, var3, var4);

        if (var5 != this.blockID && var5 != Block.fenceGate.blockID)
        {
            Block var6 = Block.blocksList[var5];
            return var6 != null && var6.blockMaterial.isOpaque() && var6.renderAsNormalBlock() ? var6.blockMaterial != Material.pumpkin : false;
        }
        else
        {
            return true;
        }
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile;
    }
}
