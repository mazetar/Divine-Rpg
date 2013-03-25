package xolova.blued00r.divinerpg.generation.iceika;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenIceikaMountians extends BiomeGenBase
{
    public BiomeGenIceikaMountians(int var1)
    {
        super(var1);
        this.setBiomeName("IceikaMountians");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.maxHeight = 2.0F;
        this.topBlock = (byte)DivineRPG.iceikaGrass.blockID;
        this.fillerBlock = (byte)DivineRPG.iceikaDirt.blockID;
        this.setEnableSnow();
        this.rainfall = 999;
    }

}
