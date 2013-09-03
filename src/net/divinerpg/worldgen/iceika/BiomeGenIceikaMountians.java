package net.divinerpg.worldgen.iceika;

import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
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
        this.topBlock = (byte)IceikaBlockHelper.frostedGrass.blockID;
        this.fillerBlock = (byte)IceikaBlockHelper.frostedDirt.blockID;
        this.setEnableSnow();
        this.rainfall = 999;
    }

}
