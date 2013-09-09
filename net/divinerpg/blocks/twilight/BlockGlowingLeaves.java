package net.divinerpg.blocks.twilight;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.blocks.BlockDivineLeaves;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockGlowingLeaves extends BlockDivineLeaves
{
    int[] adjacentTreeBlocks;

    public BlockGlowingLeaves(int par1)
    {
        super(par1);
        this.setTickRandomly(true);
        this.canAppleDrop = true;
    }


    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return var1.nextInt(20) == 0 ? 1 : 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return Block.sapling.blockID;
    }



    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World var1, EntityPlayer var2, int var3, int var4, int var5, int var6)
    {
        super.harvestBlock(var1, var2, var3, var4, var5, var6);
    }


    /**
     * Called whenever an entity is walking on top of this block. Args: world, x, y, z, entity
     */
    public void onEntityWalking(World var1, int var2, int var3, int var4, Entity var5)
    {
        super.onEntityWalking(var1, var2, var3, var4, var5);
    }

    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z)
    {
        return false;
    }




    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
