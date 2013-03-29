package xolova.divinerpg.worldgen.vethea;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.MINESHAFT;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.SCATTERED_FEATURE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.STRONGHOLD;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.VILLAGE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.MapGenScatteredFeature;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.generation.vethea.All.Bow;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree4;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree5;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree6;
import xolova.blued00r.divinerpg.generation.vethea.All.FloatingTree7;
import xolova.blued00r.divinerpg.generation.vethea.All.Hook;
import xolova.blued00r.divinerpg.generation.vethea.All.InfusionOutpost;
import xolova.blued00r.divinerpg.generation.vethea.All.Lamp1;
import xolova.blued00r.divinerpg.generation.vethea.All.Lamp2;
import xolova.blued00r.divinerpg.generation.vethea.All.Mushroom;
import xolova.blued00r.divinerpg.generation.vethea.All.Pickaxe;
import xolova.blued00r.divinerpg.generation.vethea.All.Pointedsquare;
import xolova.blued00r.divinerpg.generation.vethea.All.Ring;
import xolova.blued00r.divinerpg.generation.vethea.All.Sword;
import xolova.blued00r.divinerpg.generation.vethea.All.TreeFloating1;
import xolova.blued00r.divinerpg.generation.vethea.All.TreeFloating2;
import xolova.blued00r.divinerpg.generation.vethea.All.TreeFloating3;
import xolova.blued00r.divinerpg.generation.vethea.All.Trident;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Crypt1;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Crypt2;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Tree4;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Tree5;
import xolova.blued00r.divinerpg.generation.vethea.layer1.Tree6;
import xolova.blued00r.divinerpg.generation.vethea.layer2.HiveNest;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Pyramid1;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Pyramid2;
import xolova.blued00r.divinerpg.generation.vethea.layer2.Tree3;
import xolova.blued00r.divinerpg.generation.vethea.layer3.KarosMadhouse;
import xolova.blued00r.divinerpg.generation.vethea.layer3.QuadroticPost;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree7;
import xolova.blued00r.divinerpg.generation.vethea.layer3.Tree8;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Evergarden;
import xolova.blued00r.divinerpg.generation.vethea.layer4.RaglokChamber;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree1;
import xolova.blued00r.divinerpg.generation.vethea.layer4.Tree2;
import xolova.blued00r.divinerpg.generation.vethea.layer4.WreckHall;

public class ChunkProviderVethea implements IChunkProvider
{
    /** RNG. */
    private Random rand;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen1;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen2;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen3;

    /** A NoiseGeneratorOctaves used in generating terrain */
    private NoiseGeneratorOctaves noiseGen4;

    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen5;

    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;

    /** Reference to the World object. */
    private World worldObj;

    /** are map structures going to be generated (e.g. strongholds) */
    private final boolean mapFeaturesEnabled;

    /** Holds the overall noise array used in chunk generation */
    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenFloorCrystals();

    /** Holds Stronghold Generator */
    private MapGenStronghold strongholdGenerator = new MapGenStronghold();

    /** Holds Village Generator */
    private MapGenVillage villageGenerator = new MapGenVillage();

    /** Holds Mineshaft Generator */
    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();

    /** Holds ravine generator */
    private MapGenBase ravineGenerator = new MapGenRavine();

    /** The biomes that are used to generate the chunk */
    private BiomeGenBase[] biomesForGeneration;
    private final ArrayList<WorldGenerator> items;
    private final ArrayList<WorldGenerator> lamps;
    private final ArrayList<WorldGenerator> floatingTrees;
    private final ArrayList<WorldGenerator> pyramids;
    private final ArrayList<WorldGenerator> l1Trees;
    private final ArrayList<WorldGenerator> l3Trees;
    private final ArrayList<WorldGenerator> l4Trees;
    private final ArrayList<WorldGenerator> crypts;
    private final ArrayList<WorldGenerator> l3Altars;
    private final ArrayList<WorldGenerator> l4Altars;
    
    private final WorldGenerator layer1Gen;
    
    //TODO
    private final WorldGenerator ceilingTexture;
    private final WorldGenerator pillar;
    
    private final WorldGenerator cracklespikes;
    private final WorldGenerator fernites;
    private final WorldGenerator bulatobes;
    private final WorldGenerator shinegrass;
    private final WorldGenerator shimmers;
    private final WorldGenerator dreamglows;
    private final WorldGenerator greenGemTops;
    private final WorldGenerator purpleGemTops;
    private final WorldGenerator yellowDulahs;
    private final WorldGenerator greenDulahs;
    
    private final WorldGenerator layer3TreeBig;
    private final WorldGenerator infusion;
    
    /** A double array that hold terrain noise from noiseGen3 */
    double[] noise3;

    /** A double array that hold terrain noise */
    double[] noise1;

    /** A double array that hold terrain noise from noiseGen2 */
    double[] noise2;

    /** A double array that hold terrain noise from noiseGen5 */
    double[] noise5;

    /** A double array that holds terrain noise from noiseGen6 */
    double[] noise6;

    /**
     * Used to store the 5x5 parabolic field that is used during terrain generation.
     */
    float[] parabolicField;
    int[][] field_73219_j = new int[32][32];

    {
        caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, CAVE);
        strongholdGenerator = (MapGenStronghold) TerrainGen.getModdedMapGen(strongholdGenerator, STRONGHOLD);
        villageGenerator = (MapGenVillage) TerrainGen.getModdedMapGen(villageGenerator, VILLAGE);
        mineshaftGenerator = (MapGenMineshaft) TerrainGen.getModdedMapGen(mineshaftGenerator, MINESHAFT);
        scatteredFeatureGenerator = (MapGenScatteredFeature) TerrainGen.getModdedMapGen(scatteredFeatureGenerator, SCATTERED_FEATURE);
        ravineGenerator = TerrainGen.getModdedMapGen(ravineGenerator, RAVINE);
    }

    public ChunkProviderVethea(World par1World, long par2, boolean par4)
    {
        this.worldObj = par1World;
        this.mapFeaturesEnabled = par4;
        this.rand = new Random(par2);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);

        NoiseGeneratorOctaves[] noiseGens = {noiseGen1, noiseGen2, noiseGen3, noiseGen4, noiseGen5, noiseGen6, mobSpawnerNoise};
        noiseGens = TerrainGen.getModdedNoiseGenerators(par1World, this.rand, noiseGens);
        this.noiseGen1 = noiseGens[0];
        this.noiseGen2 = noiseGens[1];
        this.noiseGen3 = noiseGens[2];
        this.noiseGen4 = noiseGens[3];
        this.noiseGen5 = noiseGens[4];
        this.noiseGen6 = noiseGens[5];
        this.mobSpawnerNoise = noiseGens[6];
        
        this.items = new ArrayList(7);
        items.add(new Bow());
        items.add(new Hook());
        items.add(new Mushroom());
        items.add(new Pickaxe());
        items.add(new Pointedsquare());
        items.add(new Ring());
        items.add(new Sword());
        items.add(new Trident());
        
        this.lamps = new ArrayList(1);
        lamps.add(new Lamp1());
        lamps.add(new Lamp2());
        
        this.floatingTrees = new ArrayList(7);
        floatingTrees.add(new TreeFloating1());
        floatingTrees.add(new TreeFloating2());
        floatingTrees.add(new TreeFloating3());
        floatingTrees.add(new FloatingTree4());
        floatingTrees.add(new FloatingTree5());
        floatingTrees.add(new FloatingTree6());
        floatingTrees.add(new FloatingTree7());
        
        this.pyramids = new ArrayList(3);
        pyramids.add(new Pyramid1());
        pyramids.add(new Pyramid2());
        pyramids.add(new HiveNest());
        
        this.l1Trees = new ArrayList(3);
        l1Trees.add(new Tree4());
        l1Trees.add(new Tree5());
        l1Trees.add(new Tree6());
        
        this.l3Trees = new ArrayList(3);
        l3Trees.add(new Tree7());
        l3Trees.add(new Tree8());
        l3Trees.add(new WorldGenLayer3SmallTree(false));
        
        this.l4Trees = new ArrayList(2);
        l4Trees.add(new Tree1());
        l4Trees.add(new Tree2());
        
        this.l3Altars = new ArrayList(2);
        l3Altars.add(new QuadroticPost());
        l3Altars.add(new KarosMadhouse());
        
        this.l4Altars = new ArrayList(3);
        l4Altars.add(new Evergarden());
        l4Altars.add(new RaglokChamber());
        l4Altars.add(new WreckHall());
        
        this.crypts = new ArrayList(2);
        crypts.add(new Crypt1());
        crypts.add(new Crypt2());        
        
        layer1Gen = new WorldGenLayer1();
        
        ceilingTexture = new WorldGenConeUp(0, 4);
        pillar = new WorldGenVetheanPillar();
        layer3TreeBig = new WorldGenLayer3BigTree(false);
        infusion = new InfusionOutpost();
        
        cracklespikes = new WorldGenVetheanFlower(DivineRPGTwilight.cracklespike.blockID);
        fernites = new WorldGenVetheanFlower(DivineRPGTwilight.fernite.blockID);
        bulatobes = new WorldGenVetheanFlower(DivineRPGTwilight.bulatobe.blockID);
        shinegrass = new WorldGenVetheanFlower(DivineRPGTwilight.shineGrass.blockID);
        shimmers = new WorldGenVetheanFlower(DivineRPGTwilight.shimmer.blockID);
        dreamglows = new WorldGenVetheanFlower(DivineRPGTwilight.dreamglow.blockID);
        greenGemTops = new WorldGenVetheanFlower(DivineRPGTwilight.gemtopGreen.blockID);;
        purpleGemTops = new WorldGenVetheanFlower(DivineRPGTwilight.gemtopPurple.blockID);;
        yellowDulahs = new WorldGenVetheanFlower(DivineRPGTwilight.yellowDulah.blockID);;
        greenDulahs = new WorldGenVetheanFlower(DivineRPGTwilight.greenDulah.blockID);;
        
    }

    /**
     * Generates the shape of the terrain for the chunk though its all stone though the water is frozen if the
     * temperature is low enough
     */
    public void generateTerrain(int par1, int par2, byte[] par3ArrayOfByte)
    {
        byte var4 = 8;
        byte var5 = 4;
        byte var6 = 63;
        int var7 = var4 + 1;
        byte var8 = 17;
        int var9 = var4 + 1;
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, par1 * 4 - 2, par2 * 4 - 2, var7 + 5, var9 + 5);
        this.noiseArray = this.initializeNoiseField(this.noiseArray, par1 * var4, 0, par2 * var4, var7, var8, var9);

        for (int var10 = 0; var10 < var4; ++var10)
        {
            for (int var11 = 0; var11 < var4; ++var11)
            {
                for (int var12 = 0; var12 < var5; ++var12)
                {
                    double var13 = 0.25D;
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
                            int var43 = var42 + var10 * 2 << 11 | 0 + var11 * 2 << 7 | var12 * 4 + var31;
                            short var44 = 64;
                            var43 -= var44;
                            double var45 = 0.25D;
                            double var49 = (var36 - var34) * var45;
                            double var47 = var34 - var49;

                            for (int var51 = 0; var51 < 4; ++var51)
                            {
                                if ((var47 += var49) > 0.0D)
                                {
                                    par3ArrayOfByte[var43 += var44] = (byte)Block.stone.blockID;
                                }
                                else if (var12 * 8 + var31 < var6)
                                {
                                    par3ArrayOfByte[var43 += var44] = 0;//waterstill
                                }
                                else
                                {
                                    par3ArrayOfByte[var43 += var44] = 0;
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

    /**
     * Replaces the stone that was placed in with blocks that match the biome
     */
    public void replaceBlocksForBiome(int par1, int par2, byte[] par3ArrayOfByte, BiomeGenBase[] par4ArrayOfBiomeGenBase)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, par1, par2, par3ArrayOfByte, par4ArrayOfBiomeGenBase);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return;

        double var6 = 0.03125D;
        this.stoneNoise = this.noiseGen4.generateNoiseOctaves(this.stoneNoise, par1 * 16, par2 * 16, 0, 16, 16, 1, var6 * 2.0D, var6 * 2.0D, var6 * 2.0D);

        for (int var8 = 0; var8 < 16; ++var8)
        {
        	for (int var9 = 0; var9 < 16; ++var9)
        	{
        		BiomeGenBase var10 = par4ArrayOfBiomeGenBase[var9 + var8 * 16];
        		float var11 = var10.getFloatTemperature();
        		int var12 = (int)(this.stoneNoise[var8 + var9 * 16] / 3.0D + 3.0D + this.rand.nextDouble() * 0.25D);
        		int var13 = -1;
        		byte var14 = var10.topBlock;
        		byte var15 = var10.fillerBlock;
        		for (int layer = 0; layer < 4; ++layer)
        		{
        	        int var5 = 64 * layer;
        			for (int var16 = 63 + var5; var16 >= 0 + var5; --var16)
        			{
        				int var17 = (var9 * 16 + var8) * 256 + var16;
        				
        				if (var16 <= var5 + 15)
        				{
        					par3ArrayOfByte[var17] = (byte)DivineRPGTwilight.dreamstone.blockID;//bedrock
        				}
        				else
        				{
        					byte var18 = par3ArrayOfByte[var17];

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
        								var14 = 0;
        								var15 = (byte)DivineRPGTwilight.dreamstone.blockID;
        							}
        							else if (var16 >= var5 - 4 && var16 <= var5 + 1)
        							{
        								var14 = var10.topBlock;
        								var15 = var10.fillerBlock;
        							}

        							if (var16 < var5 && var14 == 0)
        							{
        								if (var11 < 0.15F)
        								{
        									var14 = (byte)Block.ice.blockID;
        								}
        								else
        								{
        									var14 = (byte)Block.waterStill.blockID;
        								}
        							}

        							var13 = var12;

        							if (var16 >= var5 - 1)
        							{
        								par3ArrayOfByte[var17] = var14;
        							}
        							else
        							{
        								par3ArrayOfByte[var17] = var15;
        							}
        						}
        						else if (var13 > 0)
        						{
        							--var13;
        							par3ArrayOfByte[var17] = var15;

        							if (var13 == 0 && var15 == Block.sand.blockID)
        							{
        								var13 = this.rand.nextInt(4);
        								var15 = (byte)Block.sandStone.blockID;
        							}
        						}
        					}
        				}
        			}//y loop
        		}//layer loop
        	}
        }
    }

    /**
     * loads or generates the chunk at the chunk location specified
     */
    public Chunk loadChunk(int par1, int par2)
    {
        return this.provideChunk(par1, par2);
    }

    /**
     * Will return back a chunk, if it doesn't exist and its not a MP client it will generates all the blocks for the
     * specified chunk from the map seed and chunk seed
     */
    public Chunk provideChunk(int par1, int par2)
    {
        this.rand.setSeed((long)par1 * 341873128712L + (long)par2 * 132897987541L);
        byte[] var3 = new byte[65536];
        this.generateTerrain(par1, par2, var3);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, par1 * 16, par2 * 16, 16, 16);
        this.replaceBlocksForBiome(par1, par2, var3, this.biomesForGeneration);
        this.caveGenerator.generate(this, this.worldObj, par1, par2, var3);
        //this.ravineGenerator.generate(this, this.worldObj, par1, par2, var3);

        Chunk var4 = new Chunk(this.worldObj, var3, par1, par2);
        byte[] var5 = var4.getBiomeArray();

        for (int var6 = 0; var6 < var5.length; ++var6)
        {
            var5[var6] = (byte)this.biomesForGeneration[var6].biomeID;
        }

        var4.generateSkylightMap();
        return var4;
    }

    /**
     * generates a subset of the level's terrain data. Takes 7 arguments: the [empty] noise array, the position, and the
     * size.
     */
    private double[] initializeNoiseField(double[] par1ArrayOfDouble, int par2, int par3, int par4, int par5, int par6, int par7)
    {
        ChunkProviderEvent.InitNoiseField event = new ChunkProviderEvent.InitNoiseField(this, par1ArrayOfDouble, par2, par3, par4, par5, par6, par7);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return event.noisefield;

        if (par1ArrayOfDouble == null)
        {
            par1ArrayOfDouble = new double[par5 * par6 * par7];
        }

        if (this.parabolicField == null)
        {
            this.parabolicField = new float[25];

            for (int var8 = -2; var8 <= 2; ++var8)
            {
                for (int var9 = -2; var9 <= 2; ++var9)
                {
                    float var10 = 10.0F / MathHelper.sqrt_float((float)(var8 * var8 + var9 * var9) + 0.2F);
                    this.parabolicField[var8 + 2 + (var9 + 2) * 5] = var10;
                }
            }
        }

        double var44 = 684.412D;
        double var45 = 684.412D;
        this.noise5 = this.noiseGen5.generateNoiseOctaves(this.noise5, par2, par4, par5, par7, 1.121D, 1.121D, 0.5D);
        this.noise6 = this.noiseGen6.generateNoiseOctaves(this.noise6, par2, par4, par5, par7, 200.0D, 200.0D, 0.5D);
        this.noise3 = this.noiseGen3.generateNoiseOctaves(this.noise3, par2, par3, par4, par5, par6, par7, var44 / 80.0D, var45 / 160.0D, var44 / 80.0D);
        this.noise1 = this.noiseGen1.generateNoiseOctaves(this.noise1, par2, par3, par4, par5, par6, par7, var44, var45, var44);
        this.noise2 = this.noiseGen2.generateNoiseOctaves(this.noise2, par2, par3, par4, par5, par6, par7, var44, var45, var44);
        boolean var43 = false;
        boolean var42 = false;
        int var12 = 0;
        int var13 = 0;

        for (int var14 = 0; var14 < par5; ++var14)
        {
            for (int var15 = 0; var15 < par7; ++var15)
            {
                float var16 = 0.0F;
                float var17 = 0.0F;
                float var18 = 0.0F;
                byte var19 = 2;
                BiomeGenBase var20 = this.biomesForGeneration[var14 + 2 + (var15 + 2) * (par5 + 5)];

                for (int var21 = -var19; var21 <= var19; ++var21)
                {
                    for (int var22 = -var19; var22 <= var19; ++var22)
                    {
                        BiomeGenBase var23 = this.biomesForGeneration[var14 + var21 + 2 + (var15 + var22 + 2) * (par5 + 5)];
                        float var24 = this.parabolicField[var21 + 2 + (var22 + 2) * 5] / (var23.minHeight + 2.0F);

                        if (var23.minHeight > var20.minHeight)
                        {
                            var24 /= 2.0F;
                        }

                        var16 += var23.maxHeight * var24;
                        var17 += var23.minHeight * var24;
                        var18 += var24;
                    }
                }

                var16 /= var18;
                var17 /= var18;
                var16 = var16 * 0.9F + 0.1F;
                var17 = (var17 * 4.0F - 1.0F) / 8.0F;
                double var47 = this.noise6[var13] / 8000.0D;

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

                ++var13;

                for (int var46 = 0; var46 < par6; ++var46)
                {
                    double var48 = (double)var17;
                    double var26 = (double)var16;
                    var48 += var47 * 0.2D;
                    var48 = var48 * (double)par6 / 16.0D;
                    double var28 = (double)par6 / 2.0D + var48 * 4.0D;
                    double var30 = 0.0D;
                    double var32 = ((double)var46 - var28) * 12.0D * 128.0D / 128.0D / var26;

                    if (var32 < 0.0D)
                    {
                        var32 *= 4.0D;
                    }

                    double var34 = this.noise1[var12] / 512.0D;
                    double var36 = this.noise2[var12] / 512.0D;
                    double var38 = (this.noise3[var12] / 10.0D + 1.0D) / 2.0D;

                    if (var38 < 0.0D)
                    {
                        var30 = var34;
                    }
                    else if (var38 > 1.0D)
                    {
                        var30 = var36;
                    }
                    else
                    {
                        var30 = var34 + (var36 - var34) * var38;
                    }

                    var30 -= var32;

                    if (var46 > par6 - 4)
                    {
                        double var40 = (double)((float)(var46 - (par6 - 4)) / 3.0F);
                        var30 = var30 * (1.0D - var40) + -10.0D * var40;
                    }

                    par1ArrayOfDouble[var12] = var30;
                    ++var12;
                }
            }
        }

        return par1ArrayOfDouble;
    }

    /**
     * Checks to see if a chunk exists at x, y
     */
    public boolean chunkExists(int par1, int par2)
    {
        return true;
    }

    /**
     * Populates chunk with ores etc etc
     */
    public void populate(IChunkProvider par1IChunkProvider, int par2, int par3)
    {
        BlockSand.fallInstantly = true;
        int var4 = par2 * 16;
        int var5 = par3 * 16;
        BiomeGenBase var6 = this.worldObj.getBiomeGenForCoords(var4 + 16, var5 + 16);
        this.rand.setSeed(this.worldObj.getSeed());
        long var7 = this.rand.nextLong() / 2L * 2L + 1L;
        long var9 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long)par2 * var7 + (long)par3 * var9 ^ this.worldObj.getSeed());
        boolean var11 = false;

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(par1IChunkProvider, worldObj, rand, par2, par3, var11));

        if (this.mapFeaturesEnabled)
        {
            this.mineshaftGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            var11 = this.villageGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            this.strongholdGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
            this.scatteredFeatureGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3);
        }

        int var12;
        int var13;
        int var14;
        
        //greenGemTops.generate(worldObj, rand, var4, 0, var5);
        //purpleGemTops.generate(worldObj, rand, var4, 0, var5);
        //yellowDulahs.generate(worldObj, rand, var4, 0, var5);
        //greenDulahs.generate(worldObj, rand, var4, 0, var5);

        layer1Gen.generate(this.worldObj, this.rand, var4, 0, var5);
        /*
         * Layer 2
         */
        for (int i = 0; i < 3; i++)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 128;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (ceilingTexture).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(16) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 84 - this.rand.nextInt(2);
            var14 = var5 + this.rand.nextInt(16) + 8;
            pillar.generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        for (int i = 0; i < 3; i++)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 84;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLayer2Forest(false)).generate(this.worldObj, this.rand, var12, var13, var14);
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
        
        /*
         * layer 3
         */
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
        
        /*
         * Layer 4
         */
        
        if (this.rand.nextInt(32) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
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
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13--;
            }
            infusion.generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(2) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 210;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(!this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (this.lamps.get(this.rand.nextInt(2))).generate(this.worldObj, this.rand, var12, var13 - 2, var14);
        }
        
        for (int i = 0; i < 5; i++)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (new WorldGenLayer2Forest(false)).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        for (int i = 0; i < 3; ++i)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 222 + this.rand.nextInt(23);
            var14 = var5 + this.rand.nextInt(16) + 8;
            (this.floatingTrees.get(this.rand.nextInt(7))).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(150) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 210 ;
            var14 = var5 + this.rand.nextInt(16) + 8;
            while(!this.worldObj.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (l4Altars.get(this.rand.nextInt(3))).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
//        if (this.rand.nextInt(150) == 0)
//        {
//            var12 = var4 + this.rand.nextInt(16) + 8;
//            var13 = 19 + 196;
//            var14 = var5 + this.rand.nextInt(16) + 8;
//            while(!this.worldObj.isAirBlock(var12, var13, var14))
//            {
//            	var13++;
//            }
//            (new Layer4MassiveTree(false)).generate(this.worldObj, this.rand, var12, var13, var14);
//        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (shimmers).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (shinegrass).generate(this.worldObj, this.rand, var12, var13, var14);
        }
        
        if (this.rand.nextInt(10) == 0)
        {
            var12 = var4 + this.rand.nextInt(16) + 8;
            var13 = 212;
            var14 = var5 + this.rand.nextInt(16) + 8;
            (dreamglows).generate(this.worldObj, this.rand, var12, var13, var14);
        }

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(par1IChunkProvider, worldObj, rand, par2, par3, var11));

        BlockSand.fallInstantly = false;
    }

    /**
     * Two modes of operation: if passed true, save all Chunks in one go.  If passed false, save up to two chunks.
     * Return true if all chunks have been saved.
     */
    public boolean saveChunks(boolean par1, IProgressUpdate par2IProgressUpdate)
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
    public List getPossibleCreatures(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4)
    {
        BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(par2, par4);
        return var5 == null ? null : (var5 == BiomeGenBase.swampland && par1EnumCreatureType == EnumCreatureType.monster && this.scatteredFeatureGenerator.hasStructureAt(par2, par3, par4) ? this.scatteredFeatureGenerator.getScatteredFeatureSpawnList() : var5.getSpawnableList(par1EnumCreatureType));
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World par1World, String par2Str, int par3, int par4, int par5)
    {
        return "Stronghold".equals(par2Str) && this.strongholdGenerator != null ? this.strongholdGenerator.getNearestInstance(par1World, par3, par4, par5) : null;
    }

    public int getLoadedChunkCount()
    {
        return 0;
    }

    public void recreateStructures(int par1, int par2)
    {
        if (this.mapFeaturesEnabled)
        {
        }
    }
}