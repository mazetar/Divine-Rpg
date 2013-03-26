package xolova.blued00r.divinerpg.generation.vethea;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.biome.WorldChunkManager;
import xolova.blued00r.divinerpg.DivineRPG;

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
