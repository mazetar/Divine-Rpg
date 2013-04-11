package xolova.divinerpg.blocks.overworld;

import java.util.ArrayList;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class BlockRupeeOre extends BlockDivineRPG
{
    public BlockRupeeOre(int var1, int var2)
    {
        super(var1, var2, Material.rock);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return OverworldItemHelper.rupee.itemID;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
