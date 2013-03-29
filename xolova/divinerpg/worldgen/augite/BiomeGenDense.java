package xolova.divinerpg.worldgen.augite;

import net.minecraft.world.biome.BiomeGenBase;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class BiomeGenDense extends BiomeGenBase
{
    public BiomeGenDense(int var1)
    {
        super(var1);
        this.setBiomeName("Augite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.DraviteGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.DraviteDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
}
