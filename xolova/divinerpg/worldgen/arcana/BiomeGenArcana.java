package xolova.divinerpg.worldgen.arcana;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenArcana extends BiomeGenBase
{
    public BiomeGenArcana(int par1)
    {
        super(par1);
        this.setBiomeName("Arcana");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)0;
        this.fillerBlock = (byte)0;
        this.waterColorMultiplier = 2368548;
    }
}
