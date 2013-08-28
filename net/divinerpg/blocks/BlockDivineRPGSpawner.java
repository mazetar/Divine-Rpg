package net.divinerpg.blocks;

import java.util.Random;

import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockMobSpawner;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineRPGSpawner extends BlockMobSpawner {

	String mobName;
	
	public BlockDivineRPGSpawner(int id, String mobName) {
		super(id);
		this.mobName = mobName;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
    	TileEntityMobSpawner spawner = new TileEntityMobSpawner();
    	spawner.getSpawnerLogic().setMobID(mobName);

		return spawner;
	}
	
	   @Override
	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister par1IconRegister) {
	        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E());
	    }
	    
	    public BlockDivineRPGSpawner setTextureName(String name) {
	        func_111022_d(name);
	        return this;
	    }
	
	
	@Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return 0;
    }
	
	@Override
    public int quantityDropped(Random par1Random) {
        return 0;
    }
	
	@Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
        int var8 = 15 + par1World.rand.nextInt(15) + par1World.rand.nextInt(15);
        this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
    }
	
	@Override
    public boolean isOpaqueCube() {
        return false;
    }
	
	@Override
    public int idPicked(World par1World, int par2, int par3, int par4) {
        return this.blockID;
    }
}
