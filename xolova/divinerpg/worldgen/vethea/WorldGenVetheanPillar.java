package xolova.divinerpg.worldgen.vethea;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class WorldGenVetheanPillar extends WorldGenerator
{
    public WorldGenVetheanPillar()
    {
        super();
    }

	@Override
	public boolean generate(World par1, Random par2, int par3, int par4, int par5) {
		int var1 = this.getSize(par1, par3, par4, par5);
		int var2 = par2.nextInt(4) + 3;
		for (int i = 0; i < var1; i++)
		{
			this.placeBlockCircle(par1, par3, i + par4, par5, Math.abs(((var1 / 2) - i)) / 5 + var2);
		}
		return true;
	}
	
	int getSize(World par1, int par2, int par3, int par4)
	{
		int i = par3;
		int var1 = 0;
		if (!par1.isAirBlock(par2, i, par4))
		{
			while (!par1.isAirBlock(par2, i, par4))
			{
				i++;
			}
		}
		else
		{

			while (par1.isAirBlock(par2, i, par4))
			{
				if (par1.isAirBlock(par2, i - 1, par4))
				{
					i--;
				}
				else break;
			}
		}
		
		while(par1.isAirBlock(par2, i, par4))
		{
			i++;
			var1++;
		}
		
		return var1;
	}
	
	void placeBlockCircle (World par1World, int x, int y, int z, int radius)
	{
		for (float i = 0; i < radius; i += 0.5)
		{
			for (float j = 0; j < 2*Math.PI*i; j += 0.5)
			{
				this.setBlock(par1World, (int)Math.floor(x + Math.sin(j) * i), y, (int)Math.floor(z + Math.cos(j) * i), VetheaBlockHelper.dreamstone.blockID);
			}
		}
	}
	
}
