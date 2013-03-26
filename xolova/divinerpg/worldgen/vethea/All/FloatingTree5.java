/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.All;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FloatingTree5 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public FloatingTree5() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 1, k + 8, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 0, k + 8, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 1, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlockAndMetadata(i + 1, j + 1, k + 6, DivineRPGTwilight.hyrewood.blockID, 8);
		world.setBlockAndMetadata(i + 1, j + 1, k + 7, DivineRPGTwilight.hyrewood.blockID, 8);
		world.setBlockAndMetadata(i + 1, j + 1, k + 8, DivineRPGTwilight.hyrewood.blockID, 8);
		world.setBlock(i + 1, j + 1, k + 9, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 2, k + 1, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 1, j + 2, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 8, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 0, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 1, k + 4, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 6, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 8, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 2, k + 0, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 2, k + 1, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlockAndMetadata(i + 2, j + 2, k + 2, DivineRPGTwilight.hyrewood.blockID, 8);
		world.setBlockAndMetadata(i + 2, j + 2, k + 3, DivineRPGTwilight.hyrewood.blockID, 8);
		world.setBlock(i + 2, j + 2, k + 4, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 2, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 2, k + 6, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 3, k + 1, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 2, j + 3, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 2, j + 5, k + 6, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 0, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 1, k + 4, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 1, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 1, k + 6, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 2, k + 1, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 2, k + 4, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 2, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 2, k + 6, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 3, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 3, j + 3, k + 6, DivineRPGTwilight.hyrewood.blockID);
		world.setBlock(i + 3, j + 4, k + 6, DivineRPGTwilight.hyrewood.blockID);
		world.setBlock(i + 3, j + 5, k + 5, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 5, k + 6, DivineRPGTwilight.dreamdirt.blockID);
		world.setBlock(i + 3, j + 5, k + 7, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 3, j + 6, k + 6, DivineRPGTwilight.hyrewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 4, j + 2, k + 5, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 4, j + 5, k + 6, DivineRPGTwilight.hyrewoodLeaves.blockID);

		return true;
	}
}