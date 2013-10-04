package net.divinerpg.worldgen.twilight;

import net.divinerpg.worldgen.azurite.ChunkProviderAzurite;
import net.divinerpg.worldgen.dravite.ChunkProviderDravite;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderTwilight extends WorldProvider {

    public static int TwilightDimensionID = 30;
    
    @Override
    public String getDimensionName() {
        return "Twilight";
    }
    
    @Override
    public void registerWorldChunkManager()
    {
    /** tells Minecraft to use our new WorldChunkManager **/
    this.worldChunkMgr = new WorldChunkMangerTwilight(worldObj.getSeed(), terrainType);
    this.hasNoSky = false;
    }

    /** Welcome message **/
    @Override
    public String getWelcomeMessage()
    {
    return "Entering the Twilight";
    }

    @Override
    /** What chunk provider to use **/
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderAzurite(worldObj, worldObj.getSeed(), true);
    }

    @Override
    /** Can player re-spawn here **/
    public boolean canRespawnHere()
    {
        return false;
    }

    @Override
    /** Determines the dimension the player will be respawned in **/
    public int getRespawnDimension(EntityPlayerMP player)
    {
        return 0;
    }

    @Override
    /** Dimension Movement speed **/
    public double getMovementFactor()
    {
        return 10.0;
    }
    
    
}
