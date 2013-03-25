package xolova.divinerpg.worldgen.azurite;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class BiomeGenAzurite extends BiomeGenBase
{
    public BiomeGenAzurite(int var1)
    {
        super(var1);
        this.setBiomeName("Azurite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.AzuriteGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.AzuriteDirt.blockID;
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
