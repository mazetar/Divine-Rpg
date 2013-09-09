package net.divinerpg.worldgen.mythril;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenMythil extends BiomeGenBase
{
    public BiomeGenMythil(int var1)
    {
        super(var1);
        this.setBiomeName("Mythril");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.MythrilGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.MythrilDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
}
