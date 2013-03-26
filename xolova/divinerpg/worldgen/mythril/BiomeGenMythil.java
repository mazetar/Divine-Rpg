package xolova.blued00r.divinerpg.generation.twilight;

import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.DivineRPG;

public class BiomeGenMythil extends BiomeGenBase
{
    public BiomeGenMythil(int var1)
    {
        super(var1);
        this.setBiomeName("Mythril");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)DivineRPGTwilight.mythilGrass.blockID;
        this.fillerBlock = (byte)DivineRPGTwilight.mythilDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
}
