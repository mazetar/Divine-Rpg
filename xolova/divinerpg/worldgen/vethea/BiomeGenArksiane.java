package xolova.divinerpg.worldgen.vethea;

import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.DivineRPG;

public class BiomeGenArksiane extends BiomeGenBase
{
    public BiomeGenArksiane(int var1)
    {
        super(var1);
        this.setBiomeName("Arksiane");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.field_82914_M.clear();
        this.topBlock = (byte)DivineRPGTwilight.dreamgrass.blockID;
        this.fillerBlock = (byte)DivineRPGTwilight.dreamdirt.blockID;
        this.setMinMaxHeight(-1.5F, 0.25F);
    }
}
