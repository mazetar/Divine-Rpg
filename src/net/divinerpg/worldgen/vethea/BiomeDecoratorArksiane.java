package net.divinerpg.worldgen.vethea;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.divinerpg.worldgen.vethea.All.Bow;
import net.divinerpg.worldgen.vethea.All.FloatingTree4;
import net.divinerpg.worldgen.vethea.All.FloatingTree5;
import net.divinerpg.worldgen.vethea.All.FloatingTree6;
import net.divinerpg.worldgen.vethea.All.FloatingTree7;
import net.divinerpg.worldgen.vethea.All.Hook;
import net.divinerpg.worldgen.vethea.All.Lamp1;
import net.divinerpg.worldgen.vethea.All.Lamp2;
import net.divinerpg.worldgen.vethea.All.Mushroom;
import net.divinerpg.worldgen.vethea.All.Pickaxe;
import net.divinerpg.worldgen.vethea.All.Pointedsquare;
import net.divinerpg.worldgen.vethea.All.Ring;
import net.divinerpg.worldgen.vethea.All.Sword;
import net.divinerpg.worldgen.vethea.All.TreeFloating1;
import net.divinerpg.worldgen.vethea.All.TreeFloating2;
import net.divinerpg.worldgen.vethea.All.TreeFloating3;
import net.divinerpg.worldgen.vethea.All.Trident;
import net.divinerpg.worldgen.vethea.layer1.Crypt1;
import net.divinerpg.worldgen.vethea.layer1.Crypt2;
import net.divinerpg.worldgen.vethea.layer1.Tree4;
import net.divinerpg.worldgen.vethea.layer1.Tree5;
import net.divinerpg.worldgen.vethea.layer1.Tree6;
import net.divinerpg.worldgen.vethea.layer2.HiveNest;
import net.divinerpg.worldgen.vethea.layer2.Pyramid1;
import net.divinerpg.worldgen.vethea.layer2.Pyramid2;
import net.divinerpg.worldgen.vethea.layer3.QuadroticPost;
import net.divinerpg.worldgen.vethea.layer3.Tree7;
import net.divinerpg.worldgen.vethea.layer3.Tree8;
import net.divinerpg.worldgen.vethea.layer4.Evergarden;
import net.divinerpg.worldgen.vethea.layer4.RaglokChamber;
import net.divinerpg.worldgen.vethea.layer4.Tree1;
import net.divinerpg.worldgen.vethea.layer4.Tree2;
import net.divinerpg.worldgen.vethea.layer4.WreckHall;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDecoratorArksiane extends BiomeDecorator
{
    /** The world the BiomeDecorator is currently decorating */
    public World currentWorld;

    /** The Biome Decorator's random number generator. */
    public Random randomGenerator;

    /** The X-coordinate of the chunk currently being decorated */
    public int chunk_X;

    /** The Z-coordinate of the chunk currently being decorated */
    public int chunk_Z;

    /** The biome generator object. */
    public BiomeGenBase biome;

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
    
    private final WorldGenerator ceilingTexture;
    private final WorldGenerator pillar;
    private final WorldGenerator cracklespikes;
    private final WorldGenerator fernites;
    private final WorldGenerator bulatobes;
    private final WorldGenerator shinegrass;
    private final WorldGenerator shimmers;
    private final WorldGenerator dreamglows;
    private final WorldGenerator layer3TreeBig;
    
    public BiomeDecoratorArksiane(BiomeGenBase par1BiomeGenBase)
    {
    	super(par1BiomeGenBase);
        this.biome = par1BiomeGenBase;
        
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
        
        cracklespikes = new WorldGenFlowers(VetheaBlockHelper.cracklespike.blockID);
        fernites = new WorldGenFlowers(VetheaBlockHelper.fernite.blockID);
        bulatobes = new WorldGenFlowers(VetheaBlockHelper.bulatobe.blockID);
        shinegrass = new WorldGenFlowers(VetheaBlockHelper.shineGrass.blockID);
        shimmers = new WorldGenFlowers(VetheaBlockHelper.shimmer.blockID);
        dreamglows = new WorldGenFlowers(VetheaBlockHelper.dreamglow.blockID);
    }

    /**
     * Decorates the world. Calls code that was formerly (pre-1.8) in ChunkProviderGenerate.populate
     */
    public void decorate(World currentWorld, Random par2Random, int par3, int chunk_X)
    {
        if (this.currentWorld != null)
        {
            throw new RuntimeException("Already decorating!!");
        }
        else
        {
            this.currentWorld = currentWorld;
            this.randomGenerator = par2Random;
            this.chunk_X = par3;
            this.chunk_Z = chunk_X;
            this.decorate();
            this.currentWorld = null;
            this.randomGenerator = null;
        }
    }

    /**
     * The method that does the work of actually decorating chunks
     */
    protected void decorate()
    {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));

        int var12;
        int var13;
        int var14;
        

        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(currentWorld, randomGenerator, chunk_X, chunk_Z));
    }
}
