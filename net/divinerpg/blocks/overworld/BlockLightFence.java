package net.divinerpg.blocks.overworld;

import java.util.Random;

import net.divinerpg.blocks.BlockDivineRPGFence;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLightFence extends BlockDivineRPGFence
{
    private final boolean powered;

    public BlockLightFence(int par1, int par5, boolean par2, String par4, Material par3)
    {
        super(par1, par5, par3, par4);
        this.powered = par2;

        if (par2)
        {
            this.setLightValue(1.0F);
        }
    }

    /**
     * Returns true if the specified block can be connected by a fence
     */
    public boolean canConnectFenceTo(IBlockAccess par1, int par2, int par3, int par4)
    {
        int par5 = par1.getBlockId(par2, par3, par4);

        if (par5 != OverworldBlockHelper.lightFenceBlue.blockID && par5 != Block.fenceGate.blockID && par5 != OverworldBlockHelper.lightFenceBlueOn.blockID && par5 != OverworldBlockHelper.lightFenceRedOn.blockID && par5 != OverworldBlockHelper.lightFenceRed.blockID)
        {
            Block par6 = Block.blocksList[par5];
            return par6 != null && par6.blockMaterial.isOpaque() && par6.renderAsNormalBlock() ? par6.blockMaterial != Material.pumpkin : false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1, int par2, int par3, int par4)
    {
        if (!par1.isRemote)
        {
            if (this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.setBlock(par2, par3, par4, OverworldBlockHelper.lightFenceBlueOn.blockID);
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1, int par2, int par3, int par4, int par5)
    {
        if (!par1.isRemote)
        {
            if (this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.setBlock(par2, par3, par4, OverworldBlockHelper.lightFenceBlueOn.blockID);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1, int par2, int par3, int par4, Random par5)
    {
        if (!par1.isRemote && this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
        {
            par1.setBlock(par2, par3, par4, OverworldBlockHelper.lightFenceBlue.blockID);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2, int par3)
    {
        return OverworldBlockHelper.lightFenceBlue.blockID;
    }
}
