package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockAccelleron extends Block
{
    public BlockAccelleron(int var1)
    {
        super(var1, Material.rock);
        this.slipperiness = 1.2F;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int var1)
    {
        switch (var1)
        {
            case 0:
                return 47;

            case 1:
                return 47;

            default:
                return 159;
        }
    }
}
