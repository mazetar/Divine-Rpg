package net.divinerpg.worldgen.azurite;

import java.util.Random;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenAzuriteTrees extends WorldGenerator
{
    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6;

        for (var6 = var2.nextInt(4) + 5; var1.getBlockMaterial(var3, var4 - 1, var5) == Material.water; --var4)
        {
            ;
        }

        boolean var7 = true;

        if (var4 >= 1 && var4 + var6 + 1 <= 128)
        {
            int var8;
            int var9;
            int var10;
            int var11;

            for (var8 = var4; var8 <= var4 + 1 + var6; ++var8)
            {
                byte var12 = 1;

                if (var8 == var4)
                {
                    var12 = 0;
                }

                if (var8 >= var4 + 1 + var6 - 2)
                {
                    var12 = 3;
                }

                for (var9 = var3 - var12; var9 <= var3 + var12 && var7; ++var9)
                {
                    for (var10 = var5 - var12; var10 <= var5 + var12 && var7; ++var10)
                    {
                        if (var8 >= 0 && var8 < 128)
                        {
                            var11 = var1.getBlockId(var9, var8, var10);

                            if (var11 != 0 && Block.blocksList[var11] != null && !Block.blocksList[var11].isLeaves(var1, var9, var8, var10))
                            {
                                if (var11 != Block.waterStill.blockID && var11 != Block.waterMoving.blockID)
                                {
                                    var7 = false;
                                }
                                else if (var8 > var4)
                                {
                                    var7 = false;
                                }
                            }
                        }
                        else
                        {
                            var7 = false;
                        }
                    }
                }
            }

            if (!var7)
            {
                return false;
            }
            else
            {
                var8 = var1.getBlockId(var3, var4 - 1, var5);

                if ((var8 == TwilightBlockHelper.AzuriteGrass.blockID || var8 == TwilightBlockHelper.AzuriteDirt.blockID) && var4 < 128 - var6 - 1)
                {
                    this.setBlock(var1, var3, var4 - 1, var5, TwilightBlockHelper.AzuriteDirt.blockID);
                    int var13;
                    int var17;

                    for (var13 = var4 - 3 + var6; var13 <= var4 + var6; ++var13)
                    {
                        var9 = var13 - (var4 + var6);
                        var10 = 2 - var9 / 2;

                        for (var11 = var3 - var10; var11 <= var3 + var10; ++var11)
                        {
                            var17 = var11 - var3;

                            for (int var14 = var5 - var10; var14 <= var5 + var10; ++var14)
                            {
                                int var15 = var14 - var5;
                                Block var16 = Block.blocksList[var1.getBlockId(var11, var13, var14)];

                                if ((Math.abs(var17) != var10 || Math.abs(var15) != var10 || var2.nextInt(2) != 0 && var9 != 0) && (var16 == null || var16.canBeReplacedByLeaves(var1, var11, var13, var14)))
                                {
                                    this.setBlock(var1, var11, var13, var14, TwilightBlockHelper.AzuriteLeaves.blockID);
                                }
                            }
                        }
                    }

                    for (var13 = 0; var13 < var6; ++var13)
                    {
                        var9 = var1.getBlockId(var3, var4 + var13, var5);
                        Block var18 = Block.blocksList[var9];

                        if (var9 == 0 || var18 != null && var18.isLeaves(var1, var3, var4 + var13, var5) || var9 == Block.waterMoving.blockID || var9 == Block.waterStill.blockID)
                        {
                            this.setBlock(var1, var3, var4 + var13, var5, TwilightBlockHelper.AzuriteLogs.blockID);
                        }
                    }

                    for (var13 = var4 - 3 + var6; var13 <= var4 + var6; ++var13)
                    {
                        var9 = var13 - (var4 + var6);
                        var10 = 2 - var9 / 2;

                        for (var11 = var3 - var10; var11 <= var3 + var10; ++var11)
                        {
                            for (var17 = var5 - var10; var17 <= var5 + var10; ++var17)
                            {
                                if (var2.nextInt(4) == 0 && var1.getBlockId(var11 - 1, var13, var17) == 0)
                                {
                                    this.generateVines(var1, var11 - 1, var13, var17, 8);
                                }

                                if (var2.nextInt(4) == 0 && var1.getBlockId(var11 + 1, var13, var17) == 0)
                                {
                                    this.generateVines(var1, var11 + 1, var13, var17, 2);
                                }

                                if (var2.nextInt(4) == 0 && var1.getBlockId(var11, var13, var17 - 1) == 0)
                                {
                                    this.generateVines(var1, var11, var13, var17 - 1, 1);
                                }

                                if (var2.nextInt(4) == 0 && var1.getBlockId(var11, var13, var17 + 1) == 0)
                                {
                                    this.generateVines(var1, var11, var13, var17 + 1, 4);
                                }
                            }
                        }
                    }
                }

                return true;
            }
        }
        else
        {
            return false;
        }
    }

    private void generateVines(World var1, int var2, int var3, int var4, int var5)
    {
        this.setBlockAndMetadata(var1, var2, var3, var4, TwilightBlockHelper.AzuriteVines.blockID, var5);
        int var6 = 4;

        while (true)
        {
            --var3;

            if (var1.getBlockId(var2, var3, var4) != 0 || var6 <= 0)
            {
                return;
            }

            this.setBlockAndMetadata(var1, var2, var3, var4, TwilightBlockHelper.AzuriteVines.blockID, var5);
            --var6;
        }
    }
}
