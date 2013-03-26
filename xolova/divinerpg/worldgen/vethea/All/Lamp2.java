/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.All;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class Lamp2 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public Lamp2() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 0, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, DivineRPGTwilight.dreamlamp.blockID);
		world.setBlock(i + 2, j + 0, k + 1, DivineRPGTwilight.darkEverstone.blockID);

		return true;
	}
}