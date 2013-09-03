package net.divinerpg.worldgen.dravite;

import java.awt.Color;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeGenSerenity extends BiomeGenBase
{
    protected int treesPerChunk;

    public BiomeGenSerenity(int var1)
    {
        super(var1);
        this.setBiomeName("Dravite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.DraviteGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.DraviteDirt.blockID;
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
