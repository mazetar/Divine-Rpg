package xolova.blued00r.divinerpg.generation.vethea;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenArksiane extends BiomeGenBase
{
    public BiomeGenArksiane(int var1)
    {
        super(var1);
        this.setBiomeName("Arksiane");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.field_82914_M.clear();
        this.topBlock = (byte)Block.grass.blockID;
        this.fillerBlock = (byte)Block.dirt.blockID;
        this.setMinMaxHeight(-1.5F, 0.25F);
    }
}
