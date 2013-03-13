package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockLightStone1 extends Block
{
    public BlockLightStone1(int var1, int var2)
    {
        super(var1, Material.rock);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
