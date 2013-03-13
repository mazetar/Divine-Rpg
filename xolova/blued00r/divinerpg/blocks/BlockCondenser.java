package xolova.blued00r.divinerpg.blocks;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityCondenser;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityGreenlightFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCondenser extends BlockContainer
{

	public BlockCondenser(int par1, Material par2Material)
	{
		super(par1, par2Material);
		this.blockIndexInTexture = 20;
	}
	
    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int par1)
    {
        return par1 == 1 ? this.blockIndexInTexture + 1 : (par1 == 0 ? this.blockIndexInTexture + 1 : (par1 == 3 ? this.blockIndexInTexture + 2 : this.blockIndexInTexture));
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
}
