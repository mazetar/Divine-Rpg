package xolova.divinerpg.blocks.overworld;

import java.util.ArrayList;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.blocks.BlockDivineRPG;

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
        return DivineRPGTwilight.DivineRPGTwilight.itemID;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
