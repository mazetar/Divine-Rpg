package xolova.divinerpg.blocks.iceika;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.BlockDivineRPGContainer;
import xolova.divinerpg.blocks.iceika.tileentities.TileEntityIceikaChest;
import xolova.divinerpg.utils.helpers.item.IceikaItemHelper;

public class BlockIceikaChest extends BlockDivineRPGContainer
{
	private Random random = new Random();

	public BlockIceikaChest(int var1) {
		super(var1, 0, Material.wood);
	}
	
	@Override
	public int getSheet(int side, int meta)
	{
		return 3;
	}

	@Override
	public int getIndex(int side, int meta) {
		return side == 1 ? 204 : (side == 0 ? 204 : (side == 3 ? 206 : 205));
	}
	
    public void onBlockAdded(World world, int par2, int par3, int par4)
    {
        super.onBlockAdded(world, par2, par3, par4);
        System.out.println(world.getBlockMetadata(par2, par3, par4));
    }

    @Override 
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

        if (metadata >= 0)
            for (int n = 1; n < 3 + fortune; n++)
                if (world.rand.nextInt(15) <= metadata)
                    ret.add(new ItemStack(IceikaItemHelper.snowFlake, 1, 0));

        return ret;
    }
    
    

    @Override
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityIceikaChest();
	}
	
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
	{
		if(!player.isSneaking())
		{
			player.displayGUIChest((TileEntityIceikaChest)var1.getBlockTileEntity(var2, var3, var4));
			return true;
		}
		return false;
	}
}
