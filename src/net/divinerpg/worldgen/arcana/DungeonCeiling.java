package net.divinerpg.worldgen.arcana;
import java.util.Random;

import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.minecraft.world.chunk.Chunk;

public class DungeonCeiling extends DungeonComponentBase
{
    protected int[] GetValidSpawnBlocks()
    {
        return new int[]
                {
                    0
                };
    }

    public boolean LocationIsValidSpawn(Chunk world, int i, int j, int k)
    {
        int blockID = world.getBlockID(i, j, k);

        if (blockID == 0)
        {
        	return true;
        }

        return false;
    }

    public DungeonCeiling() { }

    public boolean generate(Chunk world, Random rand, int wx, int y, int wz)
    {
    	int x = wx % 16;
    	int z = wz % 16;
        //check that each corner is one of the valid spawn blocks
        if (!LocationIsValidSpawn(world, x, y, z) || !LocationIsValidSpawn(world, x + 15, y, z) || !LocationIsValidSpawn(world, x + 15, y, z + 15) || !LocationIsValidSpawn(world, x, y, z + 15))
        {
            return false;
        }
        
        int dungeonBricks = ArcanaBlockHelper.degradedBricks.blockID;
        
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 0, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 1, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 2, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 3, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 4, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 5, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 6, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 7, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 8, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 9, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 10, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 11, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 12, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 13, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 14, y + 0, z + 15, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 0, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 1, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 2, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 3, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 4, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 5, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 6, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 7, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 8, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 9, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 10, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 11, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 12, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 13, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 14, dungeonBricks, 0);
        world.setBlockIDWithMetadata(x + 15, y + 0, z + 15, dungeonBricks, 0);
        /*if (!var2.isRemote)
        {
            EntityPlayerMP var4 = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(ModLoader.getMinecraftInstance().session.username, 0);
            this.lastX = var3.posX;
            this.lastY = var3.posY;
            this.lastZ = var3.posZ;
            ChunkCoordinates var5 = var4.getSpawnChunk(, 0);

            if (var5 != null)
            {
                var2.getChunkProvider().loadChunk(var5.posX, var5.posZ, 0);
                var3.setLocationAndAngles((double)((float)var5.posX), (double)((float)var5.posY), (double)((float)var5.posZ), var3.rotationYaw, var3.rotationPitch, 0);

                for (int var6 = 0; var6 < 500; ++var6)
                {
                    var2.spawnParticle("portal", var3.posX + (this.rand.nextDouble() - 0.5D) * (double)var3.width, var3.posY + this.rand.nextDouble() * (double)var3.height - 1.0D - 0.25D, var3.posZ + (this.rand.nextDouble() - 0.5D) * (double)var3.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D, 0);
                    var2.spawnParticle("portal", this.lastX + (this.rand.nextDouble() - 0.5D) * (double)var3.width, this.lastY + this.rand.nextDouble() * (double)var3.height - 1.0D - 0.25D, this.lastZ + (this.rand.nextDouble() - 0.5D) * (double)var3.width, (this.rand.nextDouble() - 0.5D) * 1.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 1.0D, 0);
                }

                var2.playSoundEffect(var3.posX, var3.posY, var3.posZ, "mob.endermen.portal", 1.0F, 1.0F, 0);
            }
        }*/
        return true;
    }
}
