/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.worldgen.vethea.All;
import java.util.Random;

import net.divinerpg.utils.helpers.block.VetheaBlockHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FloatingTree6 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public FloatingTree6() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 8, k + 1, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 1, j + 1, k + 0, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 1, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 1, j + 3, k + 1, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 1, j + 4, k + 1, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 1, j + 5, k + 1, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 1, j + 6, k + 1, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 1, j + 7, k + 1, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 1, j + 8, k + 0, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 1, j + 8, k + 1, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 1, j + 8, k + 2, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 1, j + 9, k + 1, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 2, j + 0, k + 0, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 0, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 2, j + 8, k + 1, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 3, j + 0, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 3, j + 6, k + 2, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 4, j + 0, k + 2, VetheaBlockHelper.dreamstone.blockID);
		world.setBlock(i + 4, j + 1, k + 2, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 4, j + 2, k + 2, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 4, j + 3, k + 2, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 4, j + 4, k + 2, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 4, j + 5, k + 2, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 4, j + 6, k + 1, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 4, j + 6, k + 2, VetheaBlockHelper.dreamwood.blockID);
		world.setBlock(i + 4, j + 7, k + 2, VetheaBlockHelper.dreamwoodLeaves.blockID);
		world.setBlock(i + 5, j + 6, k + 2, VetheaBlockHelper.dreamwoodLeaves.blockID);

		return true;
	}
}