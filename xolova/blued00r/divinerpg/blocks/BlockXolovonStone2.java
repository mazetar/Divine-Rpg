package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockXolovonStone2 extends Block
{
    public BlockXolovonStone2(int var1, int var2)
    {
        super(var1, var2, Material.rock);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
