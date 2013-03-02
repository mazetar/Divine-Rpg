package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockAzuriteDirt extends Block
{
    public BlockAzuriteDirt(int var1)
    {
        super(var1, Material.ground);
        this.blockIndexInTexture = 136;
        this.setTickRandomly(true);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    public int idDropped(int var1)
    {
        return DivineRPG.azuriteDirt.blockID;
    }
}
