package net.divinerpg.worldgen.vethea;

import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenArksiane extends BiomeGenBase
{
    public BiomeGenArksiane(int var1)
    {
        super(var1);
        this.setBiomeName("Arksiane");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)VetheaBlockHelper.dreamgrass.blockID;
        this.fillerBlock = (byte)VetheaBlockHelper.dreamdirt.blockID;
        this.setMinMaxHeight(-1.5F, 0.25F);
    }
}
