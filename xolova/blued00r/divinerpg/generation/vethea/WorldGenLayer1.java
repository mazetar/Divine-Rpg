package xolova.blued00r.divinerpg.generation.vethea;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;
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

public class WorldGenLayer1 extends WorldGenerator
{
	private final ArrayList<WorldGenerator> items;
	private final ArrayList<WorldGenerator> lamps;
	private final ArrayList<WorldGenerator> floatingTrees;
    private final ArrayList<WorldGenerator> l1Trees;
    private final ArrayList<WorldGenerator> crypts;
    private final WorldGenerator infusion;
    
    public WorldGenLayer1()
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
        
        this.l1Trees = new ArrayList(3);
        l1Trees.add(new Tree4());
        l1Trees.add(new Tree5());
        l1Trees.add(new Tree6());
        
        this.crypts = new ArrayList(2);
        crypts.add(new Crypt1());
        crypts.add(new Crypt2());
        infusion = new InfusionOutpost();
    }

	@Override
	public boolean generate(World par1World, Random par2, int par3, int par4, int par5) {
		int var12;
        int var13;
        int var14;
        
		/*
         * Layer 1
         */
        for (int i = 0; i < 3; i++)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 64;
            var14 = par5 + par2.nextInt(16) + 8;
            (new WorldGenConeUp(0, 4)).generate(par1World, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(16) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 - par2.nextInt(2);
            var14 = par5 + par2.nextInt(16) + 8;
            (new WorldGenVetheanPillar()).generate(par1World, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(32) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20 - par2.nextInt(2);
            var14 = par5 + par2.nextInt(16) + 8;
            (this.items.get(par2.nextInt(7))).generate(par1World, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(32) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20;
            var14 = par5 + par2.nextInt(16) + 8;
            while(par1World.isAirBlock(var12, var13, var14))
            {
            	var13--;
            }
            infusion.generate(par1World, par2, var12, var13, var14);
        }
        
        
        for (int i = 0; i < 1; ++i)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 30 + par2.nextInt(25);
            var14 = par5 + par2.nextInt(16) + 8;
            (this.floatingTrees.get(par2.nextInt(7))).generate(par1World, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(2) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20;
            var14 = par5 + par2.nextInt(16) + 8;
            (this.lamps.get(par2.nextInt(2))).generate(par1World, par2, var12, var13, var14);
        }
        
        if (par2.nextInt(500) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 40;
            var14 = par5 + par2.nextInt(16) + 8;
            (new WorldGenVillageIsland()).generate(par1World, par2, var12, var13, var14);
        }
        
        for (int i = 0; i < 1; i++)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 20;
            var14 = par5 + par2.nextInt(16) + 8;
            (new WorldGenLayer1Forest(false)).generate(par1World, par2, var12, var13, var14);
        }
        
        
        if (par2.nextInt(250) == 0)
        {
            var12 = par3 + par2.nextInt(16) + 8;
            var13 = 15;
            var14 = par5 + par2.nextInt(16) + 8;
            (crypts.get(par2.nextInt(2))).generate(par1World, par2, var12, var13, var14);
        }
		return true;
	}
	
}