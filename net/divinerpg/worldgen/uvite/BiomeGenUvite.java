package net.divinerpg.worldgen.uvite;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenUvite extends BiomeGenBase
{
    public BiomeGenUvite(int var1)
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
