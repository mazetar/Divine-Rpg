package net.divinerpg.worldgen.twilight;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class GenLayerTwilight extends GenLayer {

    public GenLayerTwilight(long par1) {
        super(par1);
        
    }
    
    public static GenLayer[] makeTheWorld(long seed) {

        GenLayer biomes = new GenLayerBiomesTwilight(1L);

        // more GenLayerZoom = bigger biomes
        biomes = new GenLayerZoom(1000L, biomes);
        biomes = new GenLayerZoom(1001L, biomes);
        biomes = new GenLayerZoom(1002L, biomes);
        biomes = new GenLayerZoom(1003L, biomes);
        biomes = new GenLayerZoom(1004L, biomes);
        biomes = new GenLayerZoom(1005L, biomes);




        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);

        biomes.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);

        return new GenLayer[] {biomes, genlayervoronoizoom};
        }

    @Override
    public int[] getInts(int i, int j, int k, int l) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
    
}
