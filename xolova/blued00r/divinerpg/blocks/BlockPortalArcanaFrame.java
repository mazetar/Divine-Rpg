package xolova.blued00r.divinerpg.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockPortalArcanaFrame extends Block
{
    public BlockPortalArcanaFrame(int par1)
    {
        super(par1, 159, Material.rock);
        this.blockIndexInTexture = 181;
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
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 26;
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    }

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        int var8 = par1World.getBlockMetadata(par2, par3, par4);

        if (isEnderEyeInserted(var8))
        {
            this.setBlockBounds(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
            super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }

        this.setBlockBoundsForItemRender();
    }

    /**
     * checks if an ender eye has been inserted into the frame block. parameters: metadata
     */
    public static boolean isEnderEyeInserted(int par0)
    {
        return (par0 & 4) != 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = ((MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6);
    }

    @Override
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (var1.getBlockId(var2, var3, var4) == this.blockID && var1.getBlockId(var2, var3, var4 + 1) == this.blockID
                && var1.getBlockId(var2, var3, var4 + 2) == this.blockID && var1.getBlockId(var2 + 1, var3, var4 + 3) == this.blockID
                && var1.getBlockId(var2 + 2, var3, var4 + 3) == this.blockID && var1.getBlockId(var2 + 3, var3, var4 + 3) == this.blockID
                && var1.getBlockId(var2 + 4, var3, var4) == this.blockID && var1.getBlockId(var2 + 4, var3, var4 + 1) == this.blockID
                && var1.getBlockId(var2 + 4, var3, var4 + 2) == this.blockID
                && var1.getBlockId(var2 + 1, var3, var4 - 1) == this.blockID && var1.getBlockId(var2 + 2, var3, var4 - 1) == this.blockID
                && var1.getBlockId(var2 + 3, var3, var4 - 1) == this.blockID)
        {
            var1.setBlockWithNotify(var2 + 1, var3, var4, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 2, var3, var4, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 3, var3, var4, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 1, var3, var4 + 1, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 2, var3, var4 + 1, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 3, var3, var4 + 1, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 1, var3, var4 + 2, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 2, var3, var4 + 2, DivineRPG.arcanaPortal.blockID);
            var1.setBlockWithNotify(var2 + 3, var3, var4 + 2, DivineRPG.arcanaPortal.blockID);
        }
    }

    @Override
    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
