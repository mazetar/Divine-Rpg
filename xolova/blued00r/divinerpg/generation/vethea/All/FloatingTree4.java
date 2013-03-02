/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.All;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FloatingTree4 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public FloatingTree4() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 2, k + 1, DivineRPG.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 0, DivineRPG.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, DivineRPG.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, DivineRPG.dreamstone.blockID);
		world.setBlock(i + 1, j + 3, k + 1, DivineRPG.hyrewood.blockID);
		world.setBlockAndMetadata(i + 1, j + 4, k + 1, DivineRPG.hyrewood.blockID, 4);
		world.setBlock(i + 2, j + 2, k + 1, DivineRPG.dreamstone.blockID);
		world.setBlockAndMetadata(i + 2, j + 4, k + 1, DivineRPG.hyrewood.blockID, 4);
		world.setBlock(i + 3, j + 1, k + 1, DivineRPG.hyrewoodLeaves.blockID);
		world.setBlockAndMetadata(i + 3, j + 4, k + 1, DivineRPG.hyrewood.blockID, 4);
		world.setBlock(i + 4, j + 0, k + 1, DivineRPG.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 0, DivineRPG.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 1, DivineRPG.hyrewood.blockID);
		world.setBlock(i + 4, j + 1, k + 2, DivineRPG.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 2, k + 1, DivineRPG.hyrewood.blockID);
		world.setBlock(i + 4, j + 3, k + 1, DivineRPG.hyrewood.blockID);
		world.setBlock(i + 4, j + 4, k + 1, DivineRPG.hyrewood.blockID);
		world.setBlock(i + 5, j + 1, k + 1, DivineRPG.hyrewoodLeaves.blockID);

		return true;
	}
}