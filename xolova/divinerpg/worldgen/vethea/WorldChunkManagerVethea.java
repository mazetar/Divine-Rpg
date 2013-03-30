package xolova.divinerpg.worldgen.vethea;

import java.util.List;

import net.minecraft.world.biome.WorldChunkManager;
import xolova.divinerpg.utils.helpers.DimensionRegistry;

public class WorldChunkManagerVethea extends WorldChunkManager
{

    /** A list of biomes that the player can spawn in. */
    private List spawnBiomes;
    
	public WorldChunkManagerVethea()
	{
		super();
		this.allowedBiomes.clear();
		this.allowedBiomes.add(DimensionRegistry.arksianeBiome);
		this.allowedBiomes.add(DimensionRegistry.heliosisBiome);
	}
}
