package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.DivineRPGTwilight;

public class BlockVane extends Block
{
    public BlockVane(int var1, int var2)
    {
        super(var1, var2, Material.rock);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile;
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
