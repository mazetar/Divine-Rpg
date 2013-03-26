package xolova.blued00r.divinerpg.generation.twilight;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;

public class BiomeGenAzurite extends BiomeGenBase
{
    public BiomeGenAzurite(int var1)
    {
        super(var1);
        this.setBiomeName("Azurite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)DivineRPGTwilight.azuriteGrass.blockID;
        this.fillerBlock = (byte)DivineRPGTwilight.azuriteDirt.blockID;
//        this.waterColorMultiplier = 2368548;
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random var1)
    {
        return this.worldGeneratorSwamp;
    }
}
