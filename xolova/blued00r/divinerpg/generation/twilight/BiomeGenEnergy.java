package xolova.blued00r.divinerpg.generation.twilight;

import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.DivineRPG;

public class BiomeGenEnergy extends BiomeGenBase
{
    public BiomeGenEnergy(int var1)
    {
        super(var1);
        this.setBiomeName("Uvite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)DivineRPG.energyGrass.blockID;
        this.fillerBlock = (byte)DivineRPG.energyDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
}
