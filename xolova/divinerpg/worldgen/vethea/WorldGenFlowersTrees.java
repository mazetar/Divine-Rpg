package xolova.divinerpg.worldgen.vethea;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;
import xolova.divinerpg.worldgen.vethea.All.Bow;
import xolova.divinerpg.worldgen.vethea.All.FloatingTree4;
import xolova.divinerpg.worldgen.vethea.All.FloatingTree5;
import xolova.divinerpg.worldgen.vethea.All.FloatingTree6;
import xolova.divinerpg.worldgen.vethea.All.FloatingTree7;
import xolova.divinerpg.worldgen.vethea.All.Hook;
import xolova.divinerpg.worldgen.vethea.All.Lamp1;
import xolova.divinerpg.worldgen.vethea.All.Lamp2;
import xolova.divinerpg.worldgen.vethea.All.Mushroom;
import xolova.divinerpg.worldgen.vethea.All.Pickaxe;
import xolova.divinerpg.worldgen.vethea.All.Pointedsquare;
import xolova.divinerpg.worldgen.vethea.All.Ring;
import xolova.divinerpg.worldgen.vethea.All.Sword;
import xolova.divinerpg.worldgen.vethea.All.TreeFloating1;
import xolova.divinerpg.worldgen.vethea.All.TreeFloating2;
import xolova.divinerpg.worldgen.vethea.All.TreeFloating3;
import xolova.divinerpg.worldgen.vethea.All.Trident;
import xolova.divinerpg.worldgen.vethea.layer1.Crypt1;
import xolova.divinerpg.worldgen.vethea.layer1.Crypt2;
import xolova.divinerpg.worldgen.vethea.layer1.Tree4;
import xolova.divinerpg.worldgen.vethea.layer1.Tree5;
import xolova.divinerpg.worldgen.vethea.layer1.Tree6;
import xolova.divinerpg.worldgen.vethea.layer2.HiveNest;
import xolova.divinerpg.worldgen.vethea.layer2.Pyramid1;
import xolova.divinerpg.worldgen.vethea.layer2.Pyramid2;
import xolova.divinerpg.worldgen.vethea.layer2.Tree3;
import xolova.divinerpg.worldgen.vethea.layer3.QuadroticPost;
import xolova.divinerpg.worldgen.vethea.layer3.Tree7;
import xolova.divinerpg.worldgen.vethea.layer3.Tree8;
import xolova.divinerpg.worldgen.vethea.layer4.Evergarden;
import xolova.divinerpg.worldgen.vethea.layer4.RaglokChamber;
import xolova.divinerpg.worldgen.vethea.layer4.Tree1;
import xolova.divinerpg.worldgen.vethea.layer4.Tree2;
import xolova.divinerpg.worldgen.vethea.layer4.WreckHall;

public class WorldGenFlowersTrees extends WorldGenerator
{

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
    private final WorldGenerator layer3TreeBig;
    
    public WorldGenFlowersTrees()
    {
        super();
        
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

	@Override
	public boolean generate(World par1, Random par2, int par3, int par4, int par5) {
		int var12;
		int var13;
		int var14;
        
        for (int i = 0; i < 2; i++)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 80;
            var14 = par5 + par2.nextInt(16) + 8;
            while(!par1.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (new Tree3()).generate(par1, par2, var12, var13, var14);
        }
        
        for (int i = 0; i < 2; i++)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 17 + 128;
            var14 = par5 + par2.nextInt(16) + 8;
            while(!par1.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (l3Trees.get(par2.nextInt(l3Trees.size()))).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 64;
            var14 = par5 + par2.nextInt(16) + 8;
            (fernites).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 64;
            var14 = par5 + par2.nextInt(16) + 8;
            (dreamglows).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 64;
            var14 = par5 + par2.nextInt(16) + 8;
            (shimmers).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 128;
            var14 = par5 + par2.nextInt(16) + 8;
            (shinegrass).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 128;
            var14 = par5 + par2.nextInt(16) + 8;
            (cracklespikes).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 128;
            var14 = par5 + par2.nextInt(16) + 8;
            (bulatobes).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 196;
            var14 = par5 + par2.nextInt(16) + 8;
            (shimmers).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 196;
            var14 = par5 + par2.nextInt(16) + 8;
            (shinegrass).generate(par1, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(3) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 + 196;
            var14 = par5 + par2.nextInt(16) + 8;
            (dreamglows).generate(par1, par2, var12, var13, var14);
        }
        
        for (int i = 0; i < 2; i++)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 19 + 196;
            var14 = par5 + par2.nextInt(16) + 8;
            while(!par1.isAirBlock(var12, var13, var14))
            {
            	var13++;
            }
            (l4Trees.get(par2.nextInt(l4Trees.size()))).generate(par1, par2, var12, var13, var14);
        }
		return true;
	}
	
}