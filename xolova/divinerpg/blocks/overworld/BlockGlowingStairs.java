package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;

public class BlockGlowingStairs extends BlockStairs
{
    private Block modelBlock;

    public BlockGlowingStairs(int var1, Block var2, int var3)
    {
        super(var1, var2, var3);
        this.modelBlock = var2;
        this.blockIndexInTexture = var3;
        this.setStepSound(var2.stepSound);
        this.setLightOpacity(255);
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        return super.getCollisionBoundingBoxFromPool(var1, var2, var3, var4);
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
        return 10;
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return super.shouldSideBeRendered(var1, var2, var3, var4, var5);
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        this.modelBlock.randomDisplayTick(var1, var2, var3, var4, var5);
    }

    /**
     * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
     */
    public void onBlockClicked(World var1, int var2, int var3, int var4, EntityPlayer var5)
    {
        this.modelBlock.onBlockClicked(var1, var2, var3, var4, var5);
    }

    /**
     * Called right before the block is destroyed by a player.  Args: world, x, y, z, metaData
     */
    public void onBlockDestroyedByPlayer(World var1, int var2, int var3, int var4, int var5)
    {
        this.modelBlock.onBlockDestroyedByPlayer(var1, var2, var3, var4, var5);
    }

    /**
     * Goes straight to getLightBrightnessForSkyBlocks for Blocks, does some fancy computing for Fluids
     */
    public int getMixedBrightnessForBlock(IBlockAccess var1, int var2, int var3, int var4)
    {
        return this.modelBlock.getMixedBrightnessForBlock(var1, var2, var3, var4);
    }

    /**
     * How bright to render this block based on the light its receiving. Args: iBlockAccess, x, y, z
     */
    public float getBlockBrightness(IBlockAccess var1, int var2, int var3, int var4)
    {
        return this.modelBlock.getBlockBrightness(var1, var2, var3, var4);
    }

    /**
     * Returns how much this block can resist explosions from the passed in entity.
     */
    public float getExplosionResistance(Entity var1)
    {
        return this.modelBlock.getExplosionResistance(var1);
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    public int getRenderBlockPass()
    {
        return this.modelBlock.getRenderBlockPass();
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate()
    {
        return this.modelBlock.tickRate();
    }

    /**
     * Returns the bounding box of the wired rectangular prism to render.
     */
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        return this.modelBlock.getSelectedBoundingBoxFromPool(var1, var2, var3, var4);
    }

    /**
     * Returns if this block is collidable (only used by Fire). Args: x, y, z
     */
    public boolean isCollidable()
    {
        return this.modelBlock.isCollidable();
    }

    /**
     * Returns whether this block is collideable based on the arguments passed in Args: blockMetaData, unknownFlag
     */
    public boolean canCollideCheck(int var1, boolean var2)
    {
        return this.modelBlock.canCollideCheck(var1, var2);
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return this.modelBlock.canPlaceBlockAt(var1, var2, var3, var4);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        this.onNeighborBlockChange(var1, var2, var3, var4, 0);
        this.modelBlock.onBlockAdded(var1, var2, var3, var4);
    }

    /**
     * Called whenever an entity is walking on top of this block. Args: world, x, y, z, entity
     */
    public void onEntityWalking(World var1, int var2, int var3, int var4, Entity var5)
    {
        this.modelBlock.onEntityWalking(var1, var2, var3, var4, var5);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        this.modelBlock.updateTick(var1, var2, var3, var4, var5);
    }

    /**
     * Called upon the block being destroyed by an explosion
     */
    public void onBlockDestroyedByExplosion(World var1, int var2, int var3, int var4)
    {
        this.modelBlock.onBlockDestroyedByExplosion(var1, var2, var3, var4);
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {
        int var6 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        int var7 = var1.getBlockMetadata(var2, var3, var4) & 4;

        if (var6 == 0)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 2 | var7);
        }

        if (var6 == 1)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 1 | var7);
        }

        if (var6 == 2)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 3 | var7);
        }

        if (var6 == 3)
        {
            var1.setBlockMetadataWithNotify(var2, var3, var4, 0 | var7);
        }
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    public void onBlockPlaced(World var1, int var2, int var3, int var4, int var5)
    {
        if (var5 == 0)
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            var1.setBlockMetadataWithNotify(var2, var3, var4, var6 | 4);
        }
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
