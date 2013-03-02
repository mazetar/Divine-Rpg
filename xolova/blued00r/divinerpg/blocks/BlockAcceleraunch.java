package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.BlockLadder;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockAcceleraunch extends BlockLadder
{
    public BlockAcceleraunch(int var1, int var2)
    {
        super(var1, var2);
        this.blockIndexInTexture = var2;
        this.slipperiness = 3.0F;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }
}
