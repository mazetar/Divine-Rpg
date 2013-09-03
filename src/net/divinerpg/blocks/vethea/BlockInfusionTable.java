package net.divinerpg.blocks.vethea;

import net.divinerpg.DivineRPGTwilight;
import net.divinerpg.blocks.vethea.tileentities.TileEntityInfusionTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockInfusionTable extends BlockContainer
{
	private Icon[] texture;

	public BlockInfusionTable(int par1) 
	{
		super(par1, Material.rock);		
	}

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return (par1 == 1 || par1 == 0) ? this.texture[0] : this.texture[1];
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
		par5EntityPlayer.openGui(DivineRPGTwilight.instance, 18, world, x, y, z);
		return true;
    	
    }

    @SideOnly(Side.CLIENT)
    public void func_94332_a(IconRegister par1IconRegister)
    {
        this.texture = new Icon[2];

        for (int i = 0; i < this.texture.length; ++i)
        {
            this.texture[i] = par1IconRegister.registerIcon("infusionTable_" + i);
        }
    }
}
