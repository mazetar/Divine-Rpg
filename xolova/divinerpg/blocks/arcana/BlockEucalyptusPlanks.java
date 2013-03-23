package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.divinerpg.DivineRPG;

public class BlockEucalyptusPlanks extends Block
{
    public BlockEucalyptusPlanks(int var1, int var2)
    {
        super(var1, var2, Material.wood);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }
}
