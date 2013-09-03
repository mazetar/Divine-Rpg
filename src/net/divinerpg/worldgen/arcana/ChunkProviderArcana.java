package net.divinerpg.worldgen.arcana;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.FlatGeneratorInfo;
import net.minecraft.world.gen.FlatLayerInfo;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenStructure;

public class ChunkProviderArcana implements IChunkProvider
{
    private World worldObj;
    private Random random;
    private final byte[] field_82700_c = new byte[256];
    private final byte[] field_82698_d = new byte[256];
    private final FlatGeneratorInfo field_82699_e;
    private final List field_82696_f = new ArrayList();
    private final boolean field_82697_g;
    private final boolean field_82702_h;
    private WorldGenLakes field_82703_i;
    private WorldGenLakes field_82701_j;
    private  ArrayList<Object> rooms;
    private DungeonCeiling ceiling;

    public ChunkProviderArcana(World par1World, long par2, boolean par4, String par5Str)
    {
        this.worldObj = par1World;
        this.random = new Random(par2);
        this.field_82699_e = FlatGeneratorInfo.createFlatGeneratorFromString(par5Str);
        this.field_82697_g = this.field_82699_e.getWorldFeatures().containsKey("decoration");

        if (this.field_82699_e.getWorldFeatures().containsKey("lake"))
        {
            this.field_82703_i = new WorldGenLakes(Block.waterStill.blockID);
        }

        if (this.field_82699_e.getWorldFeatures().containsKey("lava_lake"))
        {
            this.field_82701_j = new WorldGenLakes(Block.lavaStill.blockID);
        }

        this.field_82702_h = this.field_82699_e.getWorldFeatures().containsKey("dungeon");
        Iterator var9 = this.field_82699_e.getFlatLayers().iterator();

        while (var9.hasNext())
        {
            FlatLayerInfo var10 = (FlatLayerInfo)var9.next();

            for (int var8 = var10.getMinY(); var8 < var10.getMinY() + var10.getLayerCount(); ++var8)
            {
                this.field_82700_c[var8] = (byte)(var10.getFillBlock() & 255);
                this.field_82698_d[var8] = (byte)var10.getFillBlockMeta();
            }
        }
        rooms = new ArrayList<Object>(22);
        rooms.add(new DungeonComponent());//0
        rooms.add(new DungeonComponent1());//1
        rooms.add(new DungeonComponent2());//2
        rooms.add(new DungeonComponent3());//3
        rooms.add(new DungeonComponent4());//4
        rooms.add(new DungeonComponent5());//5
        rooms.add(new DungeonComponent6());//6
        rooms.add(new DungeonComponent7());//7
        rooms.add(new DungeonComponent9());//8
        rooms.add(new DungeonComponent10());//9
        rooms.add(new DungeonComponent11());//10
        rooms.add(new DungeonComponent12());//11
        rooms.add(new DungeonComponent13());//12
        rooms.add(new DungeonComponent14());//13
        rooms.add(new DungeonComponent15());//14
        rooms.add(new DungeonComponent16());//15
        rooms.add(new DungeonComponent17());//16
        rooms.add(new DungeonComponent22()); //17
        rooms.add(new DungeonComponenet18()); //19
        rooms.add(new DungeonComponenet19()); //19
        rooms.add(new DungeonComponent8());//20 stairs
        rooms.add(new DungeonComponent20()); //21 boss
        rooms.add(new DungeonComponent21()); //22 boss
        ceiling = new DungeonCeiling();
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
        this.random.setSeed((long)par1 * 341873128712L + (long)par2 * 132897987541L);
        byte[] var3 = new byte[32768];
        Chunk var4 = new Chunk(this.worldObj, var3, par1, par2);
        BiomeGenBase[] var5 = this.worldObj.getWorldChunkManager().loadBlockGeneratorData((BiomeGenBase[])null, par1 * 16, par2 * 16, 16, 16);
        byte[] var6 = var4.getBiomeArray();

        for (int var7 = 0; var7 < var6.length; ++var7)
        {
            var6[var7] = (byte)var5[var7].biomeID;
        }

        var4.resetRelightChecks();
        return var4;
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
        int var4 = par2 * 16;
        int var5 = par3 * 16;
        BiomeGenBase var6 = this.worldObj.getBiomeGenForCoords(var4 + 16, var5 + 16);
        boolean var7 = false;
        this.random.setSeed(this.worldObj.getSeed());
        long var8 = this.random.nextLong() / 2L * 2L + 1L;
        long var10 = this.random.nextLong() / 2L * 2L + 1L;
        this.random.setSeed((long)par2 * var8 + (long)par3 * var10 ^ this.worldObj.getSeed());
        Iterator var12 = this.field_82696_f.iterator();
        int k;
        int l;
        
        Random r = random;
        Chunk c = this.worldObj.getChunkFromChunkCoords(par2, par3);
        ArrayList<Object> var20 = rooms;
        
        for (int i = 1; i < 5; i++)
        {
            k = r.nextInt(23); //# of different rooms to generate
            l = r.nextInt(5); //Chance for boss rooms to generate 1/number specified

            if (k > 19 && l != 0 || i > 3) // boss chance
            {
                k = r.nextInt(20);
            }

            if (k < 21) //boss rooms have to use world gen while the rest use chunk gen
            {
            	((DungeonComponentBase)(var20.get(k))).generate(c, r, var4, i * 8, var5);
            }
            else
            {
            	((WorldGenerator)(var20.get(k))).generate(this.worldObj, r, var4, i * 8, var5);
            }
        }
        DungeonCeiling var21 = ceiling;
        var21.generate(c, r, var4, 40, var5);//80
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
        return "ArcanaDungeonSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    public List getPossibleCreatures(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4)
    {
        BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(par2, par4);
        return var5 == null ? null : var5.getSpawnableList(par1EnumCreatureType);
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    public ChunkPosition findClosestStructure(World par1World, String par2Str, int par3, int par4, int par5)
    {
        if ("Stronghold".equals(par2Str))
        {
            Iterator var6 = this.field_82696_f.iterator();

            while (var6.hasNext())
            {
                MapGenStructure var7 = (MapGenStructure)var6.next();

                if (var7 instanceof MapGenStronghold)
                {
                    return var7.getNearestInstance(par1World, par3, par4, par5);
                }
            }
        }

        return null;
    }

    public int getLoadedChunkCount()
    {
        return 0;
    }

    public void func_82695_e(int par1, int par2)
    {
        Iterator var3 = this.field_82696_f.iterator();

        while (var3.hasNext())
        {
            MapGenStructure var4 = (MapGenStructure)var3.next();
            var4.generate(this, this.worldObj, par1, par2, (byte[])null);
        }
    }

	public void recreateStructures(int var1, int var2){}

	@Override
	public boolean unloadQueuedChunks() {
		return false;
	}

    @Override
    public void func_104112_b() {
        // TODO Auto-generated method stub
        
    }
}
