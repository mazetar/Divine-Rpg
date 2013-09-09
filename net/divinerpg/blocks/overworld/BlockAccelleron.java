package net.divinerpg.blocks.overworld;

import net.divinerpg.blocks.BlockDivine;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;

public class BlockAccelleron extends BlockDivine
{
    private Icon[] texture;

	public BlockAccelleron(int var1)
    {
        super(var1, Material.rock);
        this.slipperiness = 1.2F;
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        switch (par1)
        {
            case 0:
                return this.texture[0];

            case 1:
                return this.texture[0];

            default:
                return this.texture[1];
        }
    }
}
