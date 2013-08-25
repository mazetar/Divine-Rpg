package net.divinerpg.worldgen.augite;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAugite extends BiomeGenBase
{
    public BiomeGenAugite(int var1)
    {
        super(var1);
        this.setBiomeName("Augite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.AugiteGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.AugiteDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
}
