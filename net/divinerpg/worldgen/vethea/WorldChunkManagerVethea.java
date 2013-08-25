package net.divinerpg.worldgen.vethea;

import java.util.List;

import net.divinerpg.utils.helpers.DimensionRegistry;
import net.minecraft.world.biome.WorldChunkManager;

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
