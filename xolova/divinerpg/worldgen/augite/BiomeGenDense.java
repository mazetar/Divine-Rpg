package xolova.blued00r.divinerpg.generation.twilight;

import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.DivineRPG;

public class BiomeGenDense extends BiomeGenBase
{
    public BiomeGenDense(int var1)
    {
        super(var1);
        this.setBiomeName("Augite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)DivineRPGTwilight.denseGrass.blockID;
        this.fillerBlock = (byte)DivineRPGTwilight.denseDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
}
