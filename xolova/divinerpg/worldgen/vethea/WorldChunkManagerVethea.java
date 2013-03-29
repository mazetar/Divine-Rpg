package xolova.divinerpg.worldgen.vethea;

import java.util.List;

import net.minecraft.world.biome.WorldChunkManager;
import xolova.divinerpg.DivineRPGTwilight;

public class WorldChunkManagerVethea extends WorldChunkManager
{

    /** A list of biomes that the player can spawn in. */
    private List spawnBiomes;
    
	public WorldChunkManagerVethea()
	{
		super();
		this.allowedBiomes.clear();
		this.allowedBiomes.add(DivineRPGTwilight.arksianeBiome);
		this.allowedBiomes.add(DivineRPGTwilight.heliosisBiome);
	}
}
