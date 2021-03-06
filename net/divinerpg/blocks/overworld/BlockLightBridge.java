package net.divinerpg.blocks.overworld;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.blocks.core.BlockDivine;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockLightBridge extends BlockDivine
{
    private final boolean powered;

    public BlockLightBridge(int var1, int var2, boolean var3)
    {
        super(var1, var2, Material.glass);
        this.powered = var3;

        if (var3)
        {
            this.setLightValue(1.0F);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.setBlock(var2, var3, var4, OverworldBlockHelper.lightBridge.blockID);
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!var1.isRemote)
        {
            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.setBlock(var2, var3, var4, OverworldBlockHelper.lightBridge.blockID);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote && this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
        {
            var1.setBlock(var2, var3, var4, OverworldBlockHelper.darkBridge.blockID);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return OverworldBlockHelper.darkBridge.blockID;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
