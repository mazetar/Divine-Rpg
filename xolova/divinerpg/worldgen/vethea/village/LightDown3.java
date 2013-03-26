/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.village;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.blued00r.divinerpg.DivineRPG;

public class LightDown3 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public LightDown3() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 7, k + 0, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 0, j + 7, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 0, j + 7, k + 2, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 1, j + 1, k + 1, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 1, j + 2, k + 1, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 1, j + 3, k + 1, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 1, j + 4, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 7, k + 0, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 7, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 7, k + 2, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 6, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 7, k + 0, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 7, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 7, k + 2, DivineRPGTwilight.darkEverstone.blockID);

		return true;
	}
}