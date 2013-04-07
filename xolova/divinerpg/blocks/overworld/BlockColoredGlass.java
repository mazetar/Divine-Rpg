package xolova.divinerpg.blocks.overworld;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredGlass extends BlockGlass
{
    public BlockColoredGlass(int var1, Material var3, boolean var4)
    {
        super(var1, var3, var4);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        return super.shouldSideBeRendered(var1, var2, var3, var4, 1 - var5);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    public int getRenderBlockPass()
    {
        return 1;
    }
}
