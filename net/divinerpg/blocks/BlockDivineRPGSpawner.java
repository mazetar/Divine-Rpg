package net.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;

public class BlockDivineRPGSpawner extends BlockDivineRPGContainer {

	String mobName;
	
	public BlockDivineRPGSpawner(int id, int sprite, Material mat, String mobName) {
		super(id, sprite, mat);
		this.mobName = mobName;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
    	TileEntityMobSpawner spawner = new TileEntityMobSpawner();
    	spawner.getSpawnerLogic().setMobID(mobName);

		return spawner;
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
