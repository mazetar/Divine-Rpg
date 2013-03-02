package xolova.blued00r.divinerpg.blocks.vethea;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKarosAltar extends Block
{

    public BlockKarosAltar(int par1)
    {
        super(par1, Material.rock);
        this.blockIndexInTexture = 123;
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
        return par1 == 0 ? 124 : 123;
    }
}