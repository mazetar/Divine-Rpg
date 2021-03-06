package net.divinerpg.blocks.vethea;

import java.util.Random;

import net.divinerpg.DivineRPGTwilight;
import net.divinerpg.DivineRPGVethea;
import net.divinerpg.blocks.core.BlockDivineContainer;
import net.divinerpg.blocks.vethea.tileentities.TileEntityDreamLamp;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockDreamLamp extends BlockDivineContainer
{
	public BlockDreamLamp(int par1, int i, Material par2Material, boolean k) 
	{
		super(par1, i, par2Material);
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
		par5EntityPlayer.openGui(DivineRPGVethea.instance, GuiRef.DREAMLAMP, world, x, y, z);
		return true;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return VetheaBlockHelper.dreamlamp.blockID;
    }
    
    public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4)
    {
        int var5 = par1World.getBlockMetadata(par2, par3, par4);
        TileEntity var6 = par1World.getBlockTileEntity(par2, par3, par4);
        if (par0)
        {
            par1World.setBlock(par2, par3, par4, VetheaBlockHelper.dreamlampOn.blockID);
        }
        else
        {
            par1World.setBlock(par2, par3, par4, VetheaBlockHelper.dreamlamp.blockID);
        }

        par1World.setBlock(par2, par3, par4, var5);

        if (var6 != null)
        {
            var6.validate();
            par1World.setBlockTileEntity(par2, par3, par4, var6);
        }
    }
}
