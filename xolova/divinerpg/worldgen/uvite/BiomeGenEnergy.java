package xolova.divinerpg.worldgen.uvite;

import net.minecraft.world.biome.BiomeGenBase;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class BiomeGenEnergy extends BiomeGenBase
{
    public BiomeGenEnergy(int var1)
    {
        super(var1);
        this.setBiomeName("Uvite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.UviteGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.UviteDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
}
