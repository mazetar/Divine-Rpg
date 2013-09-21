package net.divinerpg.blocks.overworld;

import java.util.Random;

import net.divinerpg.blocks.core.BlockDivine;
import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlueFire extends BlockDivine
{
    public BlockBlueFire(int var1, int var2)
    {
        super(var1, var2, Material.fire);
        this.setTickRandomly(true);
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
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 3;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 0;
    }

    /**
     * Returns if this block is collidable (only used by Fire). Args: x, y, z
     */
    public boolean isCollidable()
    {
        return false;
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World var1, int var2, int var3, int var4)
    {
        return var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4))
        {
            var1.setBlock(var2, var3, var4, 0);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (var1.provider.dimensionId > 0 || var1.getBlockId(var2, var3 - 1, var4) != OverworldBlockHelper.divineRock.blockID || !TwilightBlockHelper.DravitePortal.tryToCreatePortal(var1, var2, var3, var4))
        {
            if (!var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4))
            {
                var1.setBlock(var2, var3, var4, 0);
            }
            else
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate(var1) + var1.rand.nextInt(10));
            }
        }

        if (var1.provider.dimensionId > 0 || var1.getBlockId(var2, var3 - 1, var4) != TwilightBlockHelper.DraviteBlock.blockID || !TwilightBlockHelper.AzuritePortal.tryToCreatePortal(var1, var2, var3, var4))
        {
            if (!var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4))
            {
                var1.setBlock(var2, var3, var4, 0);
            }
            else
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate(var1) + var1.rand.nextInt(10));
            }
        }

        if (var1.provider.dimensionId > 0 || var1.getBlockId(var2, var3 - 1, var4) != TwilightBlockHelper.AzuriteBlock.blockID || !TwilightBlockHelper.UvitePortal.tryToCreatePortal(var1, var2, var3, var4))
        {
            if (!var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4))
            {
                var1.setBlock(var2, var3, var4, 0);
            }
            else
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate(var1) + var1.rand.nextInt(10));
            }
        }

        if (var1.provider.dimensionId > 0 || var1.getBlockId(var2, var3 - 1, var4) != TwilightBlockHelper.UviteBlock.blockID || !TwilightBlockHelper.MythrilPortal.tryToCreatePortal(var1, var2, var3, var4))
        {
            if (!var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4))
            {
                var1.setBlock(var2, var3, var4, 0);
            }
            else
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate(var1) + var1.rand.nextInt(10));
            }
        }

        if (var1.provider.dimensionId > 0 || var1.getBlockId(var2, var3 - 1, var4) != TwilightBlockHelper.MythrilBlock.blockID || !TwilightBlockHelper.AugitePortal.tryToCreatePortal(var1, var2, var3, var4))
        {
            if (!var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4))
            {
                var1.setBlock(var2, var3, var4, 0);
            }
            else
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate(var1) + var1.rand.nextInt(10));
            }
        }
        
        if (var1.provider.dimensionId > 0 || var1.getBlockId(var2, var3 - 1, var4) != Block.blockSnow.blockID || !IceikaBlockHelper.iceikaPortal.tryToCreatePortal(var1, var2, var3, var4))
        {
            if (!var1.doesBlockHaveSolidTopSurface(var2, var3 - 1, var4))
            {
                var1.setBlock(var2, var3, var4, 0);
            }
            else
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, this.tickRate(var1) + var1.rand.nextInt(10));
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (var5.nextInt(24) == 0)
        {
            var1.playSoundEffect((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "fire.fire", 1.0F + var5.nextFloat(), var5.nextFloat() * 0.7F + 0.3F);
        }

        for (int var6 = 0; var6 < 3; ++var6)
        {
            float var7 = (float)var2 + var5.nextFloat();
            float var8 = (float)var3 + var5.nextFloat() * 0.5F + 0.5F;
            float var9 = (float)var4 + var5.nextFloat();
            var1.spawnParticle("largesmoke", (double)var7, (double)var8, (double)var9, 0.0D, 0.0D, 0.0D);
        }
    }
}
