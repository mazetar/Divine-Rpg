package xolova.divinerpg.blocks.vethea;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.mobs.EntityKaros;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class BlockKarosHeatTileRed extends Block
{
    private final boolean powered;
    public boolean override;

    public BlockKarosHeatTileRed(int var1, boolean var2)
    {
        super(var1, Material.glass);
        this.powered = var2;
        this.override = false;
        this.setTickRandomly(true);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
           var1.setBlock(var2, var3, var4, VetheaBlockHelper.karosHeatTileRed.blockID);
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote && this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4) && !this.override)
        {
            var1.setBlock(var2, var3, var4, VetheaBlockHelper.karosHeatTileGreen.blockID);
        }
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
    	if (var5 instanceof EntityKaros)
    	{
    		return;
    	}
    	else
    	{
            var5.attackEntityFrom(DamageSource.cactus, 8);
    	}
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return VetheaBlockHelper.karosHeatTileGreen.blockID;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}