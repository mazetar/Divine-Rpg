/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.divinerpg.worldgen.vethea.village;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class HouseUp1 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public HouseUp1() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 0, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 0, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 0, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 1, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 1, k + 1, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 0, j + 1, k + 2, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 0, j + 1, k + 3, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 0, j + 1, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 2, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 2, k + 1, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 0, j + 2, k + 2, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 0, j + 2, k + 3, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 0, j + 2, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 3, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 3, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 3, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 3, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 0, j + 3, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 0, k + 1, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 1, j + 0, k + 3, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 1, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 1, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 1, j + 1, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 1, j + 2, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 1, j + 2, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 1, j + 3, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 3, k + 3, VetheaBlockHelper.firelight.blockID);
		world.setBlock(i + 1, j + 3, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 4, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 4, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 4, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 4, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 1, j + 4, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 0, k + 1, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 2, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 1, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 2, j + 1, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 2, j + 2, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 2, j + 2, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 2, j + 3, k + 0, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 2, j + 3, k + 4, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 2, j + 4, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 2, j + 4, k + 1, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 2, j + 4, k + 2, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 2, j + 4, k + 3, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 2, j + 4, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 3, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 3, j + 0, k + 1, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 3, j + 0, k + 2, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 3, j + 0, k + 3, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 3, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 3, j + 1, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 3, j + 1, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 3, j + 2, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 3, j + 2, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 3, j + 3, k + 0, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 3, j + 3, k + 4, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 3, j + 4, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 3, j + 4, k + 1, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 3, j + 4, k + 2, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 3, j + 4, k + 3, VetheaBlockHelper.smoothGlass.blockID);
		world.setBlock(i + 3, j + 4, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 0, k + 1, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 4, j + 0, k + 2, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 4, j + 0, k + 3, VetheaBlockHelper.lunastone.blockID);
		world.setBlock(i + 4, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 1, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 4, j + 1, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 4, j + 2, k + 0, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 4, j + 2, k + 4, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 4, j + 3, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 3, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 4, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 4, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 4, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 4, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 4, j + 4, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 0, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 0, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 0, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 1, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 1, k + 1, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 5, j + 1, k + 3, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 5, j + 1, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 2, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 2, k + 1, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 5, j + 2, k + 3, VetheaBlockHelper.dreambricks.blockID);
		world.setBlock(i + 5, j + 2, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 3, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 3, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 3, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 3, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 5, j + 3, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 0, k + 1, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 0, k + 2, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 0, k + 3, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 1, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 6, j + 1, k + 4, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 0, k + 0, VetheaBlockHelper.dreambricks2.blockID);
		world.setBlock(i + 7, j + 0, k + 4, VetheaBlockHelper.dreambricks2.blockID);

		return true;
	}
}