package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.client.gui.GuiDreamLamp;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityDreamLamp;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntityInfusionTable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockDreamLamp extends BlockContainer
{
	private GuiDreamLamp gui;
	private TileEntityDreamLamp te;
    private static boolean keepFurnaceInventory = false;

	public BlockDreamLamp(int par1, int i, Material par2Material, boolean k) 
	{
		super(par1, par2Material);
		this.blockIndexInTexture = i;
		if(k)
			this.setLightValue(1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) 
	{
		return new TileEntityDreamLamp(this);
	}
	
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
    }
	
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	TileEntityDreamLamp tile_entity = (TileEntityDreamLamp)world.getBlockTileEntity(x, y, z);
		if(tile_entity == null || par5EntityPlayer.isSneaking())
		{
			return false;
		}
		par5EntityPlayer.openGui(DivineRPG.instance, 19, world, x, y, z);
		return true;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return DivineRPG.dreamlamp.blockID;
    }
    
    public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4)
    {
        int var5 = par1World.getBlockMetadata(par2, par3, par4);
        TileEntity var6 = par1World.getBlockTileEntity(par2, par3, par4);
        keepFurnaceInventory = true;

        if (par0)
        {
            par1World.setBlockWithNotify(par2, par3, par4, DivineRPG.dreamlampOn.blockID);
        }
        else
        {
            par1World.setBlockWithNotify(par2, par3, par4, DivineRPG.dreamlamp.blockID);
        }

        keepFurnaceInventory = false;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var5);

        if (var6 != null)
        {
            var6.validate();
            par1World.setBlockTileEntity(par2, par3, par4, var6);
        }
    }
}
