package xolova.divinerpg.worldgen.mythril;

import net.minecraft.world.biome.BiomeGenBase;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

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
