/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.divinerpg.worldgen.vethea.WorldAddition;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FloatingTree4 extends WorldGenerator
{
	private WorldAddition world1;
	
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public FloatingTree4() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 0, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 3, k + 1, VetheaBlockHelper.hyrewood.blockID);
		world1.setBlockWithMetadata(i + 1, j + 4, k + 1, VetheaBlockHelper.hyrewood.blockID, 4);
		world.setBlock(i + 2, j + 2, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world1.setBlockWithMetadata(i + 2, j + 4, k + 1, VetheaBlockHelper.hyrewood.blockID, 4);
		world.setBlock(i + 3, j + 1, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world1.setBlockWithMetadata(i + 3, j + 4, k + 1, VetheaBlockHelper.hyrewood.blockID, 4);
		world.setBlock(i + 4, j + 0, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 0, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 1, VetheaBlockHelper.hyrewood.blockID);
		world.setBlock(i + 4, j + 1, k + 2, VetheaBlockHelper.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 2, k + 1, VetheaBlockHelper.hyrewood.blockID);
		world.setBlock(i + 4, j + 3, k + 1, VetheaBlockHelper.hyrewood.blockID);
		world.setBlock(i + 4, j + 4, k + 1, VetheaBlockHelper.hyrewood.blockID);
		world.setBlock(i + 5, j + 1, k + 1, VetheaBlockHelper.hyrewoodLeaves.blockID);

		return true;
	}
}