package net.divinerpg.worldgen.vethea;
/*package xolova.divinerpg.worldgen.vethea;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenLayer3 extends WorldGenerator
{

	@Override
	public boolean generate(World world, Random random, int i, int j, int k) 
	{
		int var12;
		int var13;
		int var14; 
        for (int i = 0; i < 3; i++)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 192;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (ceilingTexture).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(16) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
            var14 = var5 + this.rand.nextInt(16) + 8;
            pillar.generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        for (int i = 0; i < 3; i++)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLayer1Forest(false)).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 148;
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
            var13 = 148;
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
            var13 = 158 + this.rand.nextInt(25);
            var14 = var5 + this.rand.nextInt(16) + 8;
            (this.floatingTrees.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(2) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 19 + 128;
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
            var13 = 144 ;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(!this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (l3Altars.get(this.rand.nextInt(2))).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 20 + 128;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (shinegrass).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 20 + 128;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (cracklespikes).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 20 + 128;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (bulatobes).generate(this.worldObj, this.rand, var12, var13, var14);
        }
	}

}*/
