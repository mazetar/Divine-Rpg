package xolova.divinerpg.worldgen.vethea;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import xolova.divinerpg.utils.helpers.DimensionRegistry;

public class WorldProviderVethea extends WorldProvider
	{
	/**
	 * creates a new world chunk manager for WorldProvider
	 */
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(DimensionRegistry.arksianeBiome, 1.0F, 1.0F);
	}

	/**
	 * the y level at which clouds are rendered.
	 */
	public float getCloudHeight()
	{
		return 256.0F;
	}

	@Override
	/**
	 * Returns a new chunk provider which generates chunks for this world
	 */
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderVethea(this.worldObj, this.worldObj.getSeed(), true);
	}

	/**
	 * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
	 */
	public boolean isSurfaceWorld()
	{
		return false;
	}

	/**
	 * Will check if the x, z position specified is alright to be set as the map spawn point
	 */
	public boolean canCoordinateBeSpawn(int var1, int var2)
	{
		return false;
	}

	/**
	 * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
	 */
	public float calculateCelestialAngle(long var1, float var3)
	{
		return 0.3F;
	}

	/**
	 * True if the player can respawn in this dimension (true = overworld, false = nether).
	 */
	public boolean canRespawnHere()
	{
		return false;
	}

	public String getSaveFolder()
	{
		return "Vethea";
	}

	public String getWelcomeMessage()
	{
		return "Entering Vethea";
	}

	public String getDepartMessage()
	{
		return "Leaving Vethea";
	}

	public double getMovementFactor()
	{
		return 1.0D;
	}

	/**
	 * Returns the dimension's name, e.g. "The End", "Nether", or "Overworld".
	 */
	public String getDimensionName()
	{
		return "Vethea";
	}
}