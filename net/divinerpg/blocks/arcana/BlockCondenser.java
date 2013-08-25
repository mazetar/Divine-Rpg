package net.divinerpg.blocks.arcana;

import net.divinerpg.DivineRPG;
import net.divinerpg.blocks.BlockDivineRPGContainer;
import net.divinerpg.blocks.arcana.tileentities.TileEntityCondenser;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCondenser extends BlockDivineRPGContainer
{

	private Icon[] texture;

	public BlockCondenser(int par1, int par2,Material par2Material)
	{
		super(par1, par2, par2Material);
	}
	
    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
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
}
