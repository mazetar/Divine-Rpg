package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;

import net.minecraft.block.BlockSoulSand;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockMud extends BlockSoulSand
{
    public BlockMud(int var1, int var2)
    {
        super(var1, var2);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
