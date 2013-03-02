package xolova.blued00r.divinerpg.blocks.vethea;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityInfusionTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockInfusionTable extends BlockContainer
{
	public BlockInfusionTable(int par1, int par2) 
	{
		super(par1, Material.rock);
        this.blockIndexInTexture = par2;
	}

	@Override
	public TileEntity createNewTileEntity(World world) 
	{
		return new TileEntityInfusionTable();
	}
	
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	TileEntityInfusionTable tile_entity = (TileEntityInfusionTable)world.getBlockTileEntity(x, y, z);
		if(tile_entity == null || par5EntityPlayer.isSneaking())
		{
			return false;
		}
		par5EntityPlayer.openGui(DivineRPG.instance, 18, world, x, y, z);
		return true;
    }
}
