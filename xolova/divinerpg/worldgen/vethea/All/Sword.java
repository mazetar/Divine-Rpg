/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class Sword extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public Sword() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 10, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 0, j + 11, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 0, j + 12, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 10, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 1, j + 11, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 1, j + 12, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 2, j + 3, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 2, j + 4, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 2, j + 9, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 2, j + 10, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 2, j + 11, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 2, j + 12, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 3, j + 4, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 3, j + 5, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 3, j + 6, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 3, j + 7, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 3, j + 8, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 3, j + 9, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 3, j + 10, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 4, j + 5, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 4, j + 6, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 4, j + 7, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 4, j + 8, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 4, j + 9, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 5, j + 5, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 5, j + 6, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 5, j + 7, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 5, j + 8, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 5, j + 9, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 6, j + 4, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 6, j + 5, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 6, j + 6, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 6, j + 7, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 6, j + 8, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 6, j + 9, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 7, j + 3, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 7, j + 4, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 7, j + 5, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 7, j + 6, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 7, j + 7, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 7, j + 8, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 7, j + 9, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 7, j + 10, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 8, j + 2, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 8, j + 3, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 8, j + 4, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 8, j + 5, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 8, j + 6, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 8, j + 9, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 8, j + 10, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 8, j + 11, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 9, j + 1, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 9, j + 2, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 9, j + 3, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 9, j + 4, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 9, j + 5, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 9, j + 10, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 10, j + 0, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 10, j + 1, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 10, j + 2, k + 0, VetheaBlockHelper.whiteEverstone.blockID);
		world.setBlock(i + 10, j + 3, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 10, j + 4, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 11, j + 0, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 11, j + 1, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 11, j + 2, k + 0, VetheaBlockHelper.everstone.blockID);
		world.setBlock(i + 11, j + 3, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 12, j + 1, k + 0, VetheaBlockHelper.darkEverstone.blockID);
		world.setBlock(i + 12, j + 2, k + 0, VetheaBlockHelper.darkEverstone.blockID);

		return true;
	}
}