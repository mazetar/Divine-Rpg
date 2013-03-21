package xolova.divinerpg.blocks.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;

public class BlockCondenser extends BlockContainer
{

	private Icon[] texture;

	public BlockCondenser(int par1, Material par2Material)
	{
		super(par1, par2Material);
	}
	
    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, par2)
    {
        return par1 == 1 ? this.texture[1] : (par1 == 0 ? this.texture[1] : (par1 == 3 ? this.texture[2] : this.texture[0]));
    }

	@Override
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityCondenser();
	}
	
    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityCondenser var10 = (TileEntityCondenser)par1World.getBlockTileEntity(par2, par3, par4);

            if (var10 != null)
            {
                par5EntityPlayer.openGui(DivineRPG.instance, 13, par1World, par2, par3, par4);
            }

            return true;
        }
    }

    @SideOnly(Side.CLIENT)
    public void func_94332_a(IconRegister par1IconRegister)
    {
        this.texture = new Icon[3];

        for (int i = 0; i < this.texture.length; ++i)
        {
            this.texture[i] = par1IconRegister.func_94245_a("condenser_" + i);
        }
    }
}
