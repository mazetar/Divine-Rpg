package net.divinerpg.blocks.iceika;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.blocks.BlockDivineRPGContainer;
import net.divinerpg.blocks.iceika.tileentities.TileEntityIceikaChest;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.item.IceikaItemHelper;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIceikaChest extends BlockDivineRPGContainer
{
	private Random random = new Random();
    private Icon frontIcon;
    private Icon bottomIcon;

	public BlockIceikaChest(int var1) {
		super(var1, 0, Material.wood);
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
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {

        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Side"); 
        this.frontIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Front"); 
        this.bottomIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Top"); 
        
    }
    
    @Override
    public Icon getIcon(int side, int meta) {
        return (side == 0 || side == 1) ? bottomIcon : side == meta ? frontIcon : blockIcon;
                
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
