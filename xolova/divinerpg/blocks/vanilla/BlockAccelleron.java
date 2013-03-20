package xolova.divinerpg.blocks.vanilla;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAccelleron extends Block
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

    @SideOnly(Side.CLIENT)
    public void func_94332_a(IconRegister par1IconRegister)
    {
        this.texture = new Icon[2];

        for (int i = 0; i < this.texture.length; ++i)
        {
            this.texture[i] = par1IconRegister.func_94245_a("accelleron_" + i);
        }
    }
}
