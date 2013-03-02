/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.village;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LightUp1 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public LightUp1() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 2, k + 2, DivineRPG.firelight.blockID);
		world.setBlock(i + 1, j + 0, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 2, DivineRPG.firelight.blockID);
		world.setBlock(i + 2, j + 0, k + 1, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 1, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 2, k + 0, DivineRPG.firelight.blockID);
		world.setBlock(i + 2, j + 2, k + 1, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 2, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 2, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 2, k + 4, DivineRPG.firelight.blockID);
		world.setBlock(i + 2, j + 3, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 4, k + 1, DivineRPG.firelight.blockID);
		world.setBlock(i + 2, j + 4, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 4, k + 3, DivineRPG.firelight.blockID);
		world.setBlock(i + 2, j + 5, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 6, k + 2, DivineRPG.firelight.blockID);
		world.setBlock(i + 3, j + 0, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 3, j + 2, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 3, j + 4, k + 2, DivineRPG.firelight.blockID);
		world.setBlock(i + 4, j + 2, k + 2, DivineRPG.firelight.blockID);

		return true;
	}
}