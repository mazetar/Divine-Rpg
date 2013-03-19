package xolova.blued00r.divinerpg.blocks.vethea;

import java.util.Random;

import xolova.blued00r.divinerpg.entities.tileentities.TileEntityRaglokAltar;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRaglokAltar extends Block
{

    public BlockRaglokAltar(int par1)
    {
        super(par1, Material.rock);
        this.blockIndexInTexture = 121;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSide(int par1)
    {
        return par1 == 0 ? 122 : 121;
    }
}