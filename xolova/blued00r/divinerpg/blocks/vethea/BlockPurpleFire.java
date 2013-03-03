package xolova.blued00r.divinerpg.blocks.vethea;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.world.World;

public class BlockPurpleFire extends BlockFire
{
	public BlockPurpleFire(int par1, int par2) 
	{
		super(par1, par2);
	}
	
    private boolean canNeighborBurn(World par1World, int par2, int par3, int par4)
    {
        return false;
    }
}
