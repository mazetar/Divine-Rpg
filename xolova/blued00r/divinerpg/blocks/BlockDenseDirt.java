package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockDenseDirt extends Block
{
    public BlockDenseDirt(int var1)
    {
        super(var1, Material.ground);
        this.blockIndexInTexture = 142;
        this.setTickRandomly(true);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    public int idDropped(int var1)
    {
        return DivineRPG.denseDirt.blockID;
    }
}
