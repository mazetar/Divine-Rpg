package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockArlemiteOre extends Block
{
    public BlockArlemiteOre(int var1, int var2)
    {
        super(var1, var2, Material.rock);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }
}
