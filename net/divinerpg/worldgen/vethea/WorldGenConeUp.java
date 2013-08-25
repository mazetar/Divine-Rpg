package net.divinerpg.worldgen.vethea;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenConeUp extends WorldGenerator
{
	private final int block;
	private final float width;
	private int height;
    public WorldGenConeUp(int blockID, float widthMod)
    {
        super();
        block = blockID;
        width = widthMod;
    }

	@Override
	public boolean generate(World par1, Random par2, int par3, int par4, int par5) {
		int var2 = par2.nextInt(4) + height;
		for (int i = 0; i < var2; i++)
		{
			this.placeBlockCircle(par1, par3, par4 + i, par5, var2 - i);
		}
		return true;
	}

	public boolean generate(World par1, Random par2, int par3, int par4, int par5, int h) {
        height = h;
        return generate(par1, par2, par3, par4, par5);
	}
	
	void placeBlockCircle (World par1World, int x, int y, int z, int radius)
	{
		for (float i = 0; i < radius * width; i += 0.5)
		{
			for (float j = 0; j < 2*Math.PI*i; j += 0.5)
			{
				this.setBlock(par1World, (int)Math.round(x + Math.sin(j) * i), y, (int)Math.round(z + Math.cos(j) * i), block);
			}
		}
	}
	
}