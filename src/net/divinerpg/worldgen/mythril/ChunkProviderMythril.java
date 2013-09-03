package net.divinerpg.worldgen.mythril;

import java.util.List;
import java.util.Random;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.divinerpg.worldgen.dravite.WorldGenTwilightMineable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.NoiseGeneratorOctaves;

public class ChunkProviderMythril implements IChunkProvider
{
    private Random rand;
    private NoiseGeneratorOctaves noiseGen1;
    private NoiseGeneratorOctaves noiseGen2;
    private NoiseGeneratorOctaves noiseGen3;
    private NoiseGeneratorOctaves field_909_n;
    private NoiseGeneratorOctaves noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;
    private World worldObj;
    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenCaves();
    private BiomeGenBase[] biomesForGeneration;
    double[] noise3;
    double[] noise1;
    double[] noise2;
    double[] noise5;
    double[] noise6;
    int[][] field_914_i = new int[32][32];
    private double[] generatedTemperatures;

    public ChunkProviderMythril(World var1, long var2, boolean var4)
    {
        this.worldObj = var1;
        this.rand = new Random(var2 + 4);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.field_909_n = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
    }

    public void generateTerrain(int var1, int var2, byte[] var3, BiomeGenBase[] var4, double[] var5)
    {
        byte var6 = 2;
        int var7 = var6 + 1;
        byte var8 = 66;
        int var9 = var6 + 1;
        this.noiseArray = this.initializeNoiseField(this.noiseArray, var1 * var6, 0, var2 * var6, var7, var8, var9);

        for (int var10 = 0; var10 < var6; ++var10)
        {
            for (int var11 = 0; var11 < var6; ++var11)
            {
                for (int var12 = 0; var12 < 32; ++var12)
                {
                    double var13 = 0.5D;
                    double var15 = this.noiseArray[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var17 = this.noiseArray[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var19 = this.noiseArray[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var21 = this.noiseArray[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var23 = (this.noiseArray[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
                    double var25 = (this.noiseArray[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
                    double var27 = (this.noiseArray[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
                    double var29 = (this.noiseArray[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;

                    for (int var31 = 0; var31 < 4; ++var31)
                    {
                        double var32 = 0.125D;
                        double var34 = var15;
                        double var36 = var17;
                        double var38 = (var19 - var15) * var32;
                        double var40 = (var21 - var17) * var32;

                        for (int var42 = 0; var42 < 8; ++var42)
                        {
                            int var43 = var42 + var10 * 8 << 11 | 0 + var11 * 8 << 7 | var12 * 4 + var31;
                            short var44 = 128;
                            double var45 = 0.25D;
                            double var47 = var34;
                            double var49 = (var36 - var34) * var45;

                            for (int var51 = 0; var51 < 8; ++var51)
                            {
                                int var52 = 0;

                                if (var47 > 0.0D)
                                {
                                    var52 = Block.stone.blockID;
                                }

                                var3[var43] = (byte)var52;
                                var43 += var44;
                                var47 += var49;
                            }

                            var34 += var38;
                            var36 += var40;
                        }

                        var15 += var23;
                        var17 += var25;
                        var19 += var27;
                        var21 += var29;
                    }
                }
            }
        }
    }

    public void replaceBlocksForBiome(int var1, int var2, byte[] var3, BiomeGenBase[] var4)
    {
        byte var5 = 127;
        double var6 = 0.03125D;
        this.stoneNoise = this.noiseGen4.generateNoiseOctaves(this.stoneNoise, var1 * 16, var2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

        for (int var8 = 0; var8 < 16; ++var8)
        {
            for (int var9 = 0; var9 < 16; ++var9)
            {
                BiomeGenBase var10 = var4[var9 + var8 * 16];
                float var11 = var10.getFloatTemperature();
                int var12 = (int)(this.stoneNoise[var8 + var9 * 16] / 3.0D + 3.0D + this.rand.nextDouble() * 0.25D);
                int var13 = -1;
                byte var14 = var10.topBlock;
                byte var15 = (byte)TwilightBlockHelper.MythrilGrass.blockID;

                for (int var16 = 128; var16 >= 0; --var16)
                {
                    int var17 = (var9 * 16 + var8) * 128 + var16;

                    if (var16 <= 0 + this.rand.nextInt(5))
                    {
                        var3[var17] = 0;
                    }
                    else
                    {
                        byte var18 = var3[var17];

                        if (var18 == 0)
                        {
                            var13 = -1;
                        }
                        else if (var18 == Block.stone.blockID)
                        {
                            if (var13 == -1)
                            {
                                if (var12 <= 0)
                                {
                                    var14 = (byte)TwilightBlockHelper.MythrilGrass.blockID;
                                    var15 = (byte)TwilightBlockHelper.MythrilGrass.blockID;
                                }
                                else if (var16 >= var5 - 4 && var16 <= var5 + 1)
                                {
                                    var14 = (byte)TwilightBlockHelper.MythrilGrass.blockID;
                                    var15 = (byte)TwilightBlockHelper.TwilightStone.blockID;
                                }

                                if (var16 >= var5 - 1)
                                {
                                    var3[var17] = var14;
                                }
                                else
                                {
                                    var3[var17] = var15;
                                }
                            }
                            else if (var13 > 0)
                            {
                                --var13;
                                var3[var17] = var15;

                                if (var13 == 0 && var15 == TwilightBlockHelper.MythrilGrass.blockID)
                                {
                                    var13 = (byte)TwilightBlockHelper.MythrilGrass.blockID;
                                    var15 = (byte)TwilightBlockHelper.MythrilGrass.blockID;
                                }
                            }
                        }

                        if (var13 > 0)
                        {
                            --var13;
                            var3[var17] = var15;

                            if (var13 == 0 && var15 == TwilightBlockHelper.TwilightStone.blockID)
                            {
                                var13 = (byte)TwilightBlockHelper.MythrilGrass.blockID;
                                var15 = (byte)TwilightBlockHelper.TwilightStone.blockID;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * loads or generates the chunk at the chunk location specified
     */
    public Chunk loadChunk(int var1, int var2)
    {
        return this.provideChunk(var1, var2);
    }

    /**
     * Will return back a chunk, if it doesn't exist and its not a MP client it will generates all the blocks for the
     * specified chunk from the map seed and chunk seed
     */
    public Chunk provideChunk(int var1, int var2)
    {
        this.rand.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
        byte[] var3 = new byte[65536];
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, var1 * 16, var2 * 16, 16, 16);
        this.generateTerrain(var1, var2, var3, this.biomesForGeneration, this.generatedTemperatures);
        this.replaceBlocksForBiome(var1, var2, var3, this.biomesForGeneration);
        this.caveGenerator.generate(this, this.worldObj, var1, var2, var3);
        Chunk var4 = new Chunk(this.worldObj, var3, var1, var2);
        byte[] var5 = var4.getBiomeArray();

        for (int var6 = 0; var6 < var5.length; ++var6)
        {
            var5[var6] = (byte)this.biomesForGeneration[var6].biomeID;
        }

        var4.generateSkylightMap();
        return var4;
    }

    private double[] initializeNoiseField(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7)
    {
        if (var1 == null)
        {
            var1 = new double[var5 * var6 * var7];
        }

        double var8 = 684.412D;
        double var10 = 684.412D;
        this.noise5 = this.noiseGen5.generateNoiseOctaves(this.noise5, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
        this.noise6 = this.noiseGen6.generateNoiseOctaves(this.noise6, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
        var8 *= 2.0D;
        this.noise3 = this.noiseGen3.generateNoiseOctaves(this.noise3, var2, var3, var4, var5, var6, var7, var8 / 80.0D, var8 / 160.0D, var8 / 80.0D);
        this.noise1 = this.noiseGen1.generateNoiseOctaves(this.noise1, var2, var3, var4, var5, var6, var7, var8, var10, var8);
        this.noise2 = this.noiseGen2.generateNoiseOctaves(this.noise2, var2, var3, var4, var5, var6, var7, var8, var10, var8);
        int var12 = 0;
        int var13 = 0;
        int var14 = 16 / var5;

        for (int var15 = 0; var15 < var5; ++var15)
        {
            int var16 = var15 * var14 + var14 / 2;

            for (int var17 = 0; var17 < var7; ++var17)
            {
                int var18 = var17 * var14 + var14 / 2;
                double var19 = (this.noise5[var13] + 256.0D) / 512.0D;
                double var21 = this.noise6[var13] / 8000.0D;

                if (var21 < 0.0D)
                {
                    var21 = -var21 * 0.3D;
                }

                var21 = var21 * 3.0D - 2.0D;

                if (var21 > 1.0D)
                {
                    var21 = 1.0D;
                }

                var21 /= 8.0D;
                var21 = 0.0D;

                if (var19 < 0.0D)
                {
                    var19 = 0.0D;
                }

                var19 += 0.5D;
                var21 = var21 * (double)var6 / 16.0D;
                ++var13;
                double var23 = (double)var6 / 2.0D;

                for (int var25 = 0; var25 < var6; ++var25)
                {
                    double var26 = 0.0D;
                    double var28 = ((double)var25 - var23) * 8.0D / var19;

                    if (var28 < 0.0D)
                    {
                        var28 *= -1.0D;
                    }

                    double var30 = this.noise1[var12] / 512.0D;
                    double var32 = this.noise2[var12] / 512.0D;
                    double var34 = (this.noise3[var12] / 10.0D + 1.0D) / 2.0D;

                    if (var34 < 0.0D)
                    {
                        var26 = var30;
                    }
                    else if (var34 > 1.0D)
                    {
                        var26 = var32;
                    }
                    else
                    {
                        var26 = var30 + (var32 - var30) * var34;
                    }

                    var26 -= 8.0D;
                    byte var36 = 32;
                    double var37;

                    if (var25 > var6 - var36)
                    {
                        var37 = (double)((float)(var25 - (var6 - var36)) / ((float)var36 - 1.0F));
                        var26 = var26 * (1.0D - var37) + -30.0D * var37;
                    }

                    var36 = 8;

                    if (var25 < var36)
                    {
                        var37 = (double)((float)(var36 - var25) / ((float)var36 - 1.0F));
                        var26 = var26 * (1.0D - var37) + -30.0D * var37;
                    }

                    var1[var12] = var26;
                    ++var12;
                }
            }
        }

        return var1;
    }

    /**
     * Checks to see if a chunk exists at x, y
     */
    public boolean chunkExists(int var1, int var2)
    {
        return true;
    }

    /**
     * Populates chunk with ores etc etc
     */
    public void populate(IChunkProvider var1, int var2, int var3)
    {
        BlockSand.fallInstantly = true;
        int var4 = var2 * 16;
        int var5 = var3 * 16;
        BiomeGenBase var6 = this.worldObj.getWorldChunkManager().getBiomeGenAt(var4 + 16, var5 + 16);
        this.rand.setSeed(this.worldObj.getSeed());
        long var7 = this.rand.nextLong() / 2L * 2L + 1L;
        long var9 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.worldObj.getSeed());
        double var11 = 0.25D;
        int var13;
        int var14;
        int var15;

        int var16;

        for (var13 = 0; var13 < 30; ++var13)
        {
            var14 = var4 + this.rand.nextInt(16);
            var15 = this.rand.nextInt(250);
            var16 = var5 + this.rand.nextInt(16);
            (new WorldGenTwilightMineable(TwilightBlockHelper.MythrilOre.blockID, 8)).generate(this.worldObj, this.rand, var14, var15, var16);
        }

        WorldGenMythrilTrees var17 = new WorldGenMythrilTrees(false);
        int var19;
        int var18;
        int var21;
        int var20;
        
        for (var18 = 0; var18 < 7; ++var18)
        {
            var19 = var4 + this.rand.nextInt(16);
            var20 = var5 + this.rand.nextInt(16);
            var21 = this.worldObj.getTopSolidOrLiquidBlock(var19, var20);
            //var17.generate(this.worldObj, this.rand, var19, var21, var20);
        }
        for (var18 = 0; var18 < 7; ++var18)
        {
            var19 = var4 + this.rand.nextInt(16);
            var20 = var5 + this.rand.nextInt(16);
            var21 = 128;
            var17.generate(this.worldObj, this.rand, var19, var21, var20);
        }

        BlockSand.fallInstantly = false;
    }

    /**
     * Two modes of operation: if passed true, save all Chunks in one go.  If passed false, save up to two chunks.
     * Return true if all chunks have been saved.
     */
    public boolean saveChunks(boolean var1, IProgressUpdate var2)
    {
        return true;
    }

    /**
     * Unloads the 100 oldest chunks from memory, due to a bug with chunkSet.add() never being called it thinks the list
     * is always empty and will not remove any chunks.
     */
    public boolean unload100OldestChunks()
    {
        return false;
    }

    /**
     * Returns if the IChunkProvider supports saving.
     */
    public boolean canSave()
    {
        return true;
    }

    /**
     * Converts the instance data to a readable string.
     */
    public String makeString()
    {
        return "lolwhat?";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    public List getPossibleCreatures(EnumCreatureType var1, int var2, int var3, int var4)
    {
        BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(var2, var4);
        return var5 == null ? null : var5.getSpawnableList(var1);
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World var1, String var2, int var3, int var4, int var5)
    {
        return null;
    }

    public int getLoadedChunkCount()
    {
        return 20;
    }

    public void func_82695_e(int var1, int var2) {}

	@Override
	public void recreateStructures(int var1, int var2) {
		
	}

	@Override
	public boolean unloadQueuedChunks() {
		// TODO Auto-generated method stub
		return false;
	}

    @Override
    public void func_104112_b() {
        // TODO Auto-generated method stub
        
    }
}
