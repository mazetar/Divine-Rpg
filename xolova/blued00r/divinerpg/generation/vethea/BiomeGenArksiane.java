package xolova.blued00r.divinerpg.generation.vethea;

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
        this.topBlock = (byte)DivineRPG.dreamgrass.blockID;
        this.fillerBlock = (byte)DivineRPG.dreamdirt.blockID;
        this.setMinMaxHeight(-1.5F, 0.25F);
    }
}
