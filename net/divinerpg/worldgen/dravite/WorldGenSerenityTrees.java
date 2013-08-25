package net.divinerpg.worldgen.dravite;

import java.util.Random;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSerenityTrees extends WorldGenerator
{
    private final int minTreeHeight;
    private final boolean vinesGrow;
    private final int metaWood;
    private final int metaLeaves;

    public WorldGenSerenityTrees(boolean var1)
    {
        this(var1, 4, 0, 0, false);
    }

    public WorldGenSerenityTrees(boolean var1, int var2, int var3, int var4, boolean var5)
    {
        super(var1);
        this.minTreeHeight = var2;
        this.metaWood = var3;
        this.metaLeaves = var4;
        this.vinesGrow = var5;
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        int var6 = var2.nextInt(3) + this.minTreeHeight;
        boolean var7 = true;

        if (var4 >= 1 && var4 + var6 + 1 <= 256)
        {
            int var8;
            byte var9;
            int var10;
            int var11;

            for (var8 = var4; var8 <= var4 + 1 + var6; ++var8)
            {
                var9 = 1;

                if (var8 == var4)
                {
                    var9 = 0;
                }

                if (var8 >= var4 + 1 + var6 - 2)
                {
                    var9 = 2;
                }

                for (int var12 = var3 - var9; var12 <= var3 + var9 && var7; ++var12)
                {
                    for (var10 = var5 - var9; var10 <= var5 + var9 && var7; ++var10)
                    {
                        if (var8 >= 0 && var8 < 256)
                        {
                            var11 = var1.getBlockId(var12, var8, var10);
                            Block var13 = Block.blocksList[var11];

                            if (var11 != 0 && !var13.isLeaves(var1, var12, var8, var10) && var11 != TwilightBlockHelper.DraviteGrass.blockID && var11 != TwilightBlockHelper.DraviteDirt.blockID && !var13.isWood(var1, var12, var8, var10))
                            {
                                var7 = false;
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

                if ((var8 == TwilightBlockHelper.DraviteGrass.blockID || var8 == TwilightBlockHelper.DraviteDirt.blockID) && var4 < 256 - var6 - 1)
                {
                    this.setBlock(var1, var3, var4 - 1, var5, TwilightBlockHelper.DraviteDirt.blockID);
                    var9 = 3;
                    byte var19 = 0;
                    int var14;
                    int var15;
                    int var20;

                    for (var10 = var4 - var9 + var6; var10 <= var4 + var6; ++var10)
                    {
                        var11 = var10 - (var4 + var6);
                        var20 = var19 + 1 - var11 / 2;

                        for (var14 = var3 - var20; var14 <= var3 + var20; ++var14)
                        {
                            var15 = var14 - var3;

                            for (int var16 = var5 - var20; var16 <= var5 + var20; ++var16)
                            {
                                int var17 = var16 - var5;
                                Block var18 = Block.blocksList[var1.getBlockId(var14, var10, var16)];

                                if ((Math.abs(var15) != var20 || Math.abs(var17) != var20 || var2.nextInt(2) != 0 && var11 != 0) && (var18 == null || var18.canBeReplacedByLeaves(var1, var14, var10, var16)))
                                {
                                    this.setBlockAndMetadata(var1, var14, var10, var16, TwilightBlockHelper.DraviteLeaves.blockID, this.metaLeaves);
                                }
                            }
                        }
                    }

                    Block var21;

                    for (var10 = 0; var10 < var6; ++var10)
                    {
                        var11 = var1.getBlockId(var3, var4 + var10, var5);
                        var21 = Block.blocksList[var11];

                        if (var11 == 0 || var21 == null || var21.isLeaves(var1, var3, var4 + var10, var5))
                        {
                            this.setBlockAndMetadata(var1, var3, var4 + var10, var5, TwilightBlockHelper.DraviteLogs.blockID, this.metaWood);
                            if (this.vinesGrow && var10 > 0)
                            {
                                if (var2.nextInt(3) > 0 && var1.isAirBlock(var3 - 1, var4 + var10, var5))
                                {
                                    this.setBlockAndMetadata(var1, var3 - 1, var4 + var10, var5, Block.vine.blockID, 8);
                                }

                                if (var2.nextInt(3) > 0 && var1.isAirBlock(var3 + 1, var4 + var10, var5))
                                {
                                    this.setBlockAndMetadata(var1, var3 + 1, var4 + var10, var5, Block.vine.blockID, 2);
                                }

                                if (var2.nextInt(3) > 0 && var1.isAirBlock(var3, var4 + var10, var5 - 1))
                                {
                                    this.setBlockAndMetadata(var1, var3, var4 + var10, var5 - 1, Block.vine.blockID, 1);
                                }

                                if (var2.nextInt(3) > 0 && var1.isAirBlock(var3, var4 + var10, var5 + 1))
                                {
                                    this.setBlockAndMetadata(var1, var3, var4 + var10, var5 + 1, Block.vine.blockID, 4);
                                }
                            }
                        }
                    }

                    if (this.vinesGrow)
                    {
                        for (var10 = var4 - 3 + var6; var10 <= var4 + var6; ++var10)
                        {
                            var11 = var10 - (var4 + var6);
                            var20 = 2 - var11 / 2;

                            for (var14 = var3 - var20; var14 <= var3 + var20; ++var14)
                            {
                                for (var15 = var5 - var20; var15 <= var5 + var20; ++var15)
                                {
                                    var21 = Block.blocksList[var1.getBlockId(var14, var10, var15)];

                                    if (var21 != null && var21.isLeaves(var1, var14, var10, var15))
                                    {
                                        if (var2.nextInt(4) == 0 && var1.getBlockId(var14 - 1, var10, var15) == 0)
                                        {
                                            this.growVines(var1, var14 - 1, var10, var15, 8);
                                        }

                                        if (var2.nextInt(4) == 0 && var1.getBlockId(var14 + 1, var10, var15) == 0)
                                        {
                                            this.growVines(var1, var14 + 1, var10, var15, 2);
                                        }

                                        if (var2.nextInt(4) == 0 && var1.getBlockId(var14, var10, var15 - 1) == 0)
                                        {
                                            this.growVines(var1, var14, var10, var15 - 1, 1);
                                        }

                                        if (var2.nextInt(4) == 0 && var1.getBlockId(var14, var10, var15 + 1) == 0)
                                        {
                                            this.growVines(var1, var14, var10, var15 + 1, 4);
                                        }
                                    }
                                }
                            }
                        }

                        if (var2.nextInt(5) == 0 && var6 > 5)
                        {
                            for (var10 = 0; var10 < 2; ++var10)
                            {
                                for (var11 = 0; var11 < 4; ++var11)
                                {
                                    if (var2.nextInt(4 - var10) == 0)
                                    {
                                        var20 = var2.nextInt(3);
                                        this.setBlockAndMetadata(var1, var3 + Direction.offsetX[Direction.rotateOpposite[var11]], var4 + var6 - 5 + var10, var5 + Direction.offsetZ[Direction.rotateOpposite[var11]], Block.cocoaPlant.blockID, var20 << 2 | var11);
                                    }
                                }
                            }
                        }
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

    private void growVines(World var1, int var2, int var3, int var4, int var5)
    {
        this.setBlockAndMetadata(var1, var2, var3, var4, Block.vine.blockID, var5);
        int var6 = 4;

        while (true)
        {
            --var3;

            if (var1.getBlockId(var2, var3, var4) != 0 || var6 <= 0)
            {
                return;
            }

            this.setBlockAndMetadata(var1, var2, var3, var4, Block.vine.blockID, var5);
            --var6;
        }
    }
}
