package xolova.blued00r.divinerpg.generation.twilight;

import java.awt.Color;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.DivineRPG;

public class BiomeGenSerenity extends BiomeGenBase
{
    protected int treesPerChunk;

    public BiomeGenSerenity(int var1)
    {
        super(var1);
        this.setBiomeName("Dravite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)DivineRPGTwilight.serenityGrass.blockID;
        this.fillerBlock = (byte)DivineRPGTwilight.serenityDirt.blockID;
        this.waterColorMultiplier = 2368548;
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * takes temperature, returns color
     */
    public int getSkyColorByTemp(float par1)
    {
        return Color.getHSBColor(0.1361F, 0.95F, 1.0F).getRGB();
    }
}
