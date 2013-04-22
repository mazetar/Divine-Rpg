/*package xolova.divinerpg.worldgen.vethea;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenLayer2 extends WorldGenerator
{

	
	public boolean generate(World par1World, Random rand, int par3, int par4, int par5) 
	{
		int var12;
        int var13;
        int var14;
        
        for (int i = 0; i < 3; i++)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 128;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (ceilingTexture).generate(this.worldObj, rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(16) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 84 - this.rand.nextInt(2);
            var14 = var5 + this.rand.nextInt(16) + 8;
            pillar.generate(this.worldObj, rand, var12, var13, var14);
        }
        
        for (int i = 0; i < 3; i++)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 84;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLayer2Forest(false)).generate(this.worldObj, rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 85;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13--;
            }
            for (int i = 0; i < this.rand.nextInt(2) + 2; i++)
            {
            	var13--;
            }
            (this.items.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 85;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13--;
            }
            infusion.generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        for (int i = 0; i < 3; ++i)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 90 + this.rand.nextInt(25);
            var14 = var5 + this.rand.nextInt(16) + 8;
            (this.floatingTrees.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(2) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 80;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(!this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (this.lamps.get(this.rand.nextInt(2))).generate(this.worldObj, this.rand, var12, var13 - 2, var14);
        }
        
        if (this.rand.nextInt(250) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 80;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(!this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (pyramids.get(this.rand.nextInt(3))).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 20 + 64;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (fernites).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 20 + 64;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (dreamglows).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 20 + 64;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (shimmers).generate(this.worldObj, this.rand, var12, var13, var14);
        }
	}
}*/
