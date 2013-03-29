/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class Lamp2 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public Lamp2() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 0, k + 1, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.dreamlamp.blockID);
		world.setBlock(i + 2, j + 0, k + 1, VetheaBlockHelper.darkEverstone.blockID);

		return true;
	}
}