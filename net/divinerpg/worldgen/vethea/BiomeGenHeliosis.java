package net.divinerpg.worldgen.vethea;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenHeliosis extends BiomeGenBase
{
    public BiomeGenHeliosis(int var1)
    {
        super(var1);
        this.setBiomeName("Arksiane");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        //this.field_82914_M.clear();
        this.topBlock = (byte)Block.grass.blockID;
        this.fillerBlock = (byte)Block.dirt.blockID;
        this.setMinMaxHeight(0.5F, 0.5F);
    }
}