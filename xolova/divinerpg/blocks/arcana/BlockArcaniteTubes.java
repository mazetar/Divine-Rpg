
package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.BlockLadder;

public class BlockArcaniteTubes extends BlockLadder
{
    public BlockArcaniteTubes(int var1, int var2)
    {
        super(var1, var2);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
