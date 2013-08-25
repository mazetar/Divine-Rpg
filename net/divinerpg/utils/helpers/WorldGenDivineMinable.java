package net.divinerpg.utils.helpers;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenDivineMinable implements IWorldGenerator
{
    public void generate(Random var1, int var2, int var3, World var4, IChunkProvider var5, IChunkProvider var6)
    {
        switch (var4.provider.dimensionId)
        {
            case -1:
                this.generateNether(var4, var1, var2 * 16, var3 * 16);

            case 0:
                this.generateSurface(var4, var1, var2 * 16, var3 * 16);

            case 10:
                this.generateArcana(var4, var1, var2 * 16, var3 * 16);

            default:
        }
    }

    public void generateArcana(World var1, Random var2, int var3, int var4)
    {
    }

    public void generateSurface(World var1, Random var2, int var3, int var4)
    {
        int var5;
        int var6;
        int var7;
        int var8;

        for (var5 = 0; var5 < 3; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(20);
            var8 = var4 + var2.nextInt(16);
           //(new WorldGenMinable(DivineRPG.realmiteore.blockID, 5)).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 2; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(15);
            var8 = var4 + var2.nextInt(16);
            //(new WorldGenMinable(DivineRPG.arlemiteore.blockID, 3)).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 2; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(15);
            var8 = var4 + var2.nextInt(16);
            //(new WorldGenMinable(DivineRPG.rupeeore.blockID, 3)).generate(var1, var2, var6, var7, var8);
        }

        if (var2.nextInt(8) == 0)
        {
            var5 = var3 + var2.nextInt(16) + 8;
            var6 = var2.nextInt(128);
            var7 = var4 + var2.nextInt(16) + 8;

            if (var6 < 63 || var2.nextInt(10) == 0)
            {
                //(new WorldGenLakes(DivineRPG.tarStill.blockID)).generate(var1, var2, var5, var6, var7);
            }
        }
    }

    public void generateNether(World var1, Random var2, int var3, int var4)
    {
        int var5;
        int var6;
        int var7;
        int var8;

        for (var5 = 0; var5 < 5; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(128);
            var8 = var4 + var2.nextInt(16);
            //(new WorldGenNetherMinable(DivineRPG.netheriteore.blockID, 4)).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 5; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(128);
            var8 = var4 + var2.nextInt(16);
            //(new WorldGenNetherMinable(DivineRPG.bloodGemOre.blockID, 4)).generate(var1, var2, var6, var7, var8);
        }
    }
}
