package xolova.blued00r.divinerpg.generation.vethea;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenVillageIsland extends WorldGenerator
{
	public final WorldGenConeUp spike = new WorldGenConeUp(Block.stone.blockID, 1F);
    public WorldGenVillageIsland()
    {
        super();
    }

	@Override
	public boolean generate(World par1, Random par2, int par3, int par4, int par5) {
		int var2 = par2.nextInt(15) + 25;
		
		this.placeSpikeIteration(par1, par2, par3, par4, par5, var2);
		return true;
	}
	
	void placeSpikeIteration (World par1World, Random par2, int x, int y, int z, int radius)
	{
		for (float i = 0; i < radius; i += 5)
		{
			for (float j = 0; j < 2*Math.PI*i; j += 4)
			{
				spike.generate(par1World, par2, (int)Math.round(x + Math.sin(j) * (i - par2.nextInt(2))), y - (int)(i/10), (int)Math.round(z + Math.cos(j) * (i - par2.nextInt(2))), (int)(radius - i)/2);
			}
		}
	}
	
}