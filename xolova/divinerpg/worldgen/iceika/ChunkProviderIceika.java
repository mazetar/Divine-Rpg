package xolova.blued00r.divinerpg.generation.iceika;

import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ICE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopTickerer;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponenet18;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponenet19;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent1;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent10;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent11;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent12;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent13;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent14;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent15;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent16;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent17;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent2;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent20;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent21;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent22;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent3;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent4;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent5;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent6;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent7;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent8;
import xolova.blued00r.divinerpg.generation.arcana.DungeonComponent9;
import xolova.blued00r.divinerpg.generation.twilight.WorldGenAzuriteTrees;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.SpawnerAnimals;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderIceika implements IChunkProvider
{
    private Random rand;
    private NoiseGeneratorOctaves noiseGen1;
    private NoiseGeneratorOctaves noiseGen2;
    private NoiseGeneratorOctaves noiseGen3;
    private NoiseGeneratorOctaves noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;
    private World worldObj;
    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new IceikaGenCaves();
    private BiomeGenBase[] biomesForGeneration;
    double[] noise3;
    double[] noise1;
    double[] noise2;
    double[] noise5;
    double[] noise6;
    float[] field_35388_l;
    int[][] field_914_i = new int[32][32];
    
    private ArrayList rooms;
    private ArrayList lights;

    public ChunkProviderIceika(World var1, long var2)
    {
        this.worldObj = var1;
        this.rand = new Random(var2);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
        
        rooms = new ArrayList(8);
        lights = new ArrayList(6);
        lights.add(new LightPost1());//0
        lights.add(new LightPost2());//1
        lights.add(new LightPost3());//2
        lights.add(new LightPost4());//3
        lights.add(new LightPost5());//4
        rooms.add(new SnowyVillage1());//5
        rooms.add(new SnowyVillage2());//6
        rooms.add(new SnowyVillage3());//7
        rooms.add(new SnowyVillage4());//8
        rooms.add(new SnowyVillage5());//9
        rooms.add(new SnowyVillage6());//10
        rooms.add(new SnowyVillage7());//11
    }

    public void generateTerrain(int var1, int var2, byte[] var3)
    {
        byte var4 = 4;
        byte var5 = 16;
        byte var6 = 63;
        int var7 = var4 + 1;
        byte var8 = 17;
        int var9 = var4 + 1;
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, var1 * 4 - 2, var2 * 4 - 2, var7 + 5, var9 + 5);
        this.noiseArray = this.initializeNoiseField(this.noiseArray, var1 * var4, 0, var2 * var4, var7, var8, var9);

        for (int var10 = 0; var10 < var4; ++var10)
        {
            for (int var11 = 0; var11 < var4; ++var11)
            {
                for (int var12 = 0; var12 < var5; ++var12)
                {
                    double var13 = 0.125D;
                    double var15 = this.noiseArray[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var17 = this.noiseArray[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var19 = this.noiseArray[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var21 = this.noiseArray[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var23 = (this.noiseArray[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
                    double var25 = (this.noiseArray[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
                    double var27 = (this.noiseArray[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
                    double var29 = (this.noiseArray[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;

                    for (int var31 = 0; var31 < 8; ++var31)
                    {
                        double var32 = 0.25D;
                        double var34 = var15;
                        double var36 = var17;
                        double var38 = (var19 - var15) * var32;
                        double var40 = (var21 - var17) * var32;

                        for (int var42 = 0; var42 < 4; ++var42)
                        {
                            int var43 = var42 + var10 * 4 << 11 | 0 + var11 * 4 << 7 | var12 * 8 + var31;
                            short var44 = 128;
                            var43 -= var44;
                            double var45 = 0.25D;
                            double var47 = (var36 - var34) * var45;
                            double var49 = var34 - var47;

                            for (int var51 = 0; var51 < 4; ++var51)
                            {
                                if ((var49 += var47) > 0.0D)
                                {
                                    var3[var43 += var44] = (byte)DivineRPG.iceikaStone.blockID;
                                }
                                else if (var12 * 8 + var31 < var6)
                                {
                                    var3[var43 += var44] = (byte)Block.ice.blockID;
                                }
                                else
                                {
                                    var3[var43 += var44] = 0;
                                }
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
        byte var5 = 63;
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
                byte var15 = var10.fillerBlock;

                for (int var16 = 127; var16 >= 0; --var16)
                {
                    int var17 = (var9 * 16 + var8) * 128 + var16;

                    if (var16 <= 0 + this.rand.nextInt(5))
                    {
                        var3[var17] = (byte)Block.bedrock.blockID;
                    }
                    else
                    {
                        byte var18 = var3[var17];

                        if (var18 == 0)
                        {
                            var13 = -1;
                        }
                        else if (var18 != Block.stone.blockID)
                        {
                            if (var13 == -1)
                            {
                                if (var12 <= 0)
                                {
                                    var14 = 0;
                                    var15 = (byte)DivineRPG.iceikaStone.blockID;
                                }
                                else if (var16 >= var5 - 4 && var16 <= var5 + 1)
                                {
                                    var14 = var10.topBlock;
                                    var15 = var10.fillerBlock;
                                }

                                if (var16 < var5 && var14 == 0)
                                {
                                    var14 = (byte)Block.ice.blockID;
                                }

                                var13 = var12;

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

                                if (var13 == 0 && var15 == Block.sand.blockID)
                                {
                                    var13 = this.rand.nextInt(4);
                                    var15 = (byte)Block.sandStone.blockID;
                                }
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
        byte[] var3 = new byte[32768];
        this.generateTerrain(var1, var2, var3);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, var1 * 16, var2 * 16, 16, 16);
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

        if (this.field_35388_l == null)
        {
            this.field_35388_l = new float[25];

            for (int var8 = -2; var8 <= 2; ++var8)
            {
                for (int var9 = -2; var9 <= 2; ++var9)
                {
                    float var10 = 10.0F / MathHelper.sqrt_float((float)(var8 * var8 + var9 * var9) + 0.2F);
                    this.field_35388_l[var8 + 2 + (var9 + 2) * 5] = var10;
                }
            }
        }

        double var44 = 684.412D;
        double var45 = 684.412D;
        this.noise5 = this.noiseGen5.generateNoiseOctaves(this.noise5, var2, var4, var5, var7, 1.121D, 1.121D, 0.5D);
        this.noise6 = this.noiseGen6.generateNoiseOctaves(this.noise6, var2, var4, var5, var7, 200.0D, 200.0D, 0.5D);
        this.noise3 = this.noiseGen3.generateNoiseOctaves(this.noise3, var2, var3, var4, var5, var6, var7, var44 / 80.0D, var45 / 160.0D, var44 / 80.0D);
        this.noise1 = this.noiseGen1.generateNoiseOctaves(this.noise1, var2, var3, var4, var5, var6, var7, var44, var45, var44);
        this.noise2 = this.noiseGen2.generateNoiseOctaves(this.noise2, var2, var3, var4, var5, var6, var7, var44, var45, var44);
        boolean var12 = false;
        boolean var13 = false;
        int var14 = 0;
        int var15 = 0;

        for (int var16 = 0; var16 < var5; ++var16)
        {
            for (int var17 = 0; var17 < var7; ++var17)
            {
                float var18 = 0.0F;
                float var19 = 0.0F;
                float var20 = 0.0F;
                byte var21 = 2;
                BiomeGenBase var22 = this.biomesForGeneration[var16 + 2 + (var17 + 2) * (var5 + 5)];

                for (int var23 = -var21; var23 <= var21; ++var23)
                {
                    for (int var24 = -var21; var24 <= var21; ++var24)
                    {
                        BiomeGenBase var25 = this.biomesForGeneration[var16 + var23 + 2 + (var17 + var24 + 2) * (var5 + 5)];
                        float var26 = this.field_35388_l[var23 + 2 + (var24 + 2) * 5] / (var25.minHeight + 2.0F);

                        if (var25.minHeight > var22.minHeight)
                        {
                            var26 /= 2.0F;
                        }

                        var18 += var25.maxHeight * var26;
                        var19 += var25.minHeight * var26;
                        var20 += var26;
                    }
                }

                var18 /= var20;
                var19 /= var20;
                var18 = var18 * 0.9F + 0.1F;
                var19 = (var19 * 4.0F - 1.0F) / 8.0F;
                double var47 = this.noise6[var15] / 8000.0D;

                if (var47 < 0.0D)
                {
                    var47 = -var47 * 0.3D;
                }

                var47 = var47 * 3.0D - 2.0D;

                if (var47 < 0.0D)
                {
                    var47 /= 2.0D;

                    if (var47 < -1.0D)
                    {
                        var47 = -1.0D;
                    }

                    var47 /= 1.4D;
                    var47 /= 2.0D;
                }
                else
                {
                    if (var47 > 1.0D)
                    {
                        var47 = 1.0D;
                    }

                    var47 /= 8.0D;
                }

                ++var15;

                for (int var46 = 0; var46 < var6; ++var46)
                {
                    double var48 = (double)var19;
                    double var28 = (double)var18;
                    var48 += var47 * 0.2D;
                    var48 = var48 * (double)var6 / 16.0D;
                    double var30 = (double)var6 / 2.0D + var48 * 4.0D;
                    double var32 = 0.0D;
                    double var34 = ((double)var46 - var30) * 12.0D * 128.0D / 128.0D / var28;

                    if (var34 < 0.0D)
                    {
                        var34 *= 4.0D;
                    }

                    double var36 = this.noise1[var14] / 512.0D;
                    double var38 = this.noise2[var14] / 512.0D;
                    double var40 = (this.noise3[var14] / 10.0D + 1.0D) / 2.0D;

                    if (var40 < 0.0D)
                    {
                        var32 = var36;
                    }
                    else if (var40 > 1.0D)
                    {
                        var32 = var38;
                    }
                    else
                    {
                        var32 = var36 + (var38 - var36) * var40;
                    }

                    var32 -= var34;

                    if (var46 > var6 - 4)
                    {
                        double var42 = (double)((float)(var46 - (var6 - 4)) / 3.0F);
                        var32 = var32 * (1.0D - var42) + -10.0D * var42;
                    }

                    var1[var14] = var32;
                    ++var14;
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
        BiomeGenBase var6 = this.worldObj.getBiomeGenForCoords(var4 + 16, var5 + 16);
        this.rand.setSeed(this.worldObj.getSeed());
        long var7 = this.rand.nextLong() / 2L * 2L + 1L;
        long var9 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)var2 * var7 + (long)var3 * var9 ^ this.worldObj.getSeed());
        boolean var11 = false;

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(var1, worldObj, rand, var2, var3, var11));

        int var12;
        int var13;
        int var14;

        if (TerrainGen.populate(var1, worldObj, rand, var2, var3, var11, LAKE) && 
                !var11 && this.rand.nextInt(4) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = this.rand.nextInt(128);
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLakes(Block.ice.blockID)).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(5) == 0)
        {
            var13 = var4 + this.rand.nextInt(16) + 8;
            var14 = this.rand.nextInt(40);
            int var15 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenIceikaDungeon()).generate(this.worldObj, this.rand, var13, var14, var15);
      	}

        if (this.rand.nextInt(5) == 0)
        {
            var13 = var4 + this.rand.nextInt(16) + 8;
            var14 = this.rand.nextInt(40);
            int var15 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenDungeon2()).generate(this.worldObj, this.rand, var13, var14, var15);
      	}
        
        WorldGenGiantTree var17 = new WorldGenGiantTree(true);
        int var19;
        int var18;
        int var21;
        int var20;

        for (var18 = 0; var18 < 14; ++var18)
        {
            var19 = var4 + this.rand.nextInt(16);
            var20 = var5 + this.rand.nextInt(16);
            var21 = this.worldObj.getHeightValue(var19, var20);
            var17.generate(this.worldObj, this.rand, var19, var21, var20);
        }

        var6.decorate(this.worldObj, this.rand, var4, var5);
        
        int k;
        int l;
        int j;
        Random r = rand;
        World w = this.worldObj;
        ArrayList var25 = rooms;
        ArrayList var27 = lights;
        
        for (int i = 1; i < 10; i++)
        {
        	
            k = r.nextInt(7);
            l = r.nextInt(5);

            if (k > 0 && l != 0)
            {
                k = r.nextInt(7);
            }
           
            var13 = var4 + this.rand.nextInt(16) + 8;
            var14 = this.rand.nextInt(128);
            int var15 = var5 + this.rand.nextInt(16) + 8;
            
            ((WorldGenerator)(var25.get(k))).generate(w, r, var13, var14, var15);
        }
        
        for (int i = 1; i < 10; i++)
        {
        	
            k = r.nextInt(5);
            l = r.nextInt(5);

            if (k > 18 && l != 0)
            {
                k = r.nextInt(5);
            }
           
            var13 = var4 + this.rand.nextInt(16) + 8;
            var14 = this.rand.nextInt(128);
            int var15 = var5 + this.rand.nextInt(16) + 8;
            
            ((WorldGenerator)(var27.get(k))).generate(w, r, var13, var14, var15);
        }

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(var1, worldObj, rand, var2, var3, var11));

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
        return "RandomLevelSource";
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
        return 0;
    }

	@Override
	public void recreateStructures(int var1, int var2) {
		
	}
}
