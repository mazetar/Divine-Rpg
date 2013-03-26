/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.All;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TreeFloating1 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public TreeFloating1() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 1, k + 1, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 0, j + 1, k + 2, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 0, j + 2, k + 1, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 0, j + 2, k + 2, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 1, j + 1, k + 2, DivineRPGTwilight.dreamstone.blockID);
		world.setBlockAndMetadata(i + 1, j + 1, k + 3, DivineRPGTwilight.firewood.blockID, 8);
		world.setBlockAndMetadata(i + 1, j + 1, k + 4, DivineRPGTwilight.firewood.blockID, 8);
		world.setBlockAndMetadata(i + 1, j + 1, k + 5, DivineRPGTwilight.firewood.blockID, 8);
		world.setBlockAndMetadata(i + 1, j + 1, k + 6, DivineRPGTwilight.firewood.blockID, 8);
		world.setBlock(i + 1, j + 2, k + 1, DivineRPGTwilight.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, DivineRPGTwilight.dreamstone.blockID);
		world.setBlockAndMetadata(i + 2, j + 1, k + 6, DivineRPGTwilight.firewood.blockID, 4);
		world.setBlockAndMetadata(i + 2, j + 2, k + 1, DivineRPGTwilight.firewood.blockID, 4);
		world.setBlockAndMetadata(i + 3, j + 1, k + 6, DivineRPGTwilight.firewood.blockID, 4);
		world.setBlockAndMetadata(i + 3, j + 2, k + 1, DivineRPGTwilight.firewood.blockID, 4);
		world.setBlock(i + 4, j + 0, k + 6, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 1, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 1, k + 5, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlockAndMetadata(i + 4, j + 1, k + 6, DivineRPGTwilight.firewood.blockID, 4);
		world.setBlock(i + 4, j + 1, k + 7, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 2, k + 0, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlockAndMetadata(i + 4, j + 2, k + 1, DivineRPGTwilight.firewood.blockID, 4);
		world.setBlock(i + 4, j + 2, k + 2, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlock(i + 4, j + 2, k + 6, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlock(i + 5, j + 1, k + 6, DivineRPGTwilight.firewoodLeaves.blockID);
		world.setBlock(i + 5, j + 2, k + 1, DivineRPGTwilight.firewoodLeaves.blockID);

		return true;
	}
}