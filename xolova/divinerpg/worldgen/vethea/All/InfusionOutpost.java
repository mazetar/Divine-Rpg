/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.All;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class InfusionOutpost extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public InfusionOutpost() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 0, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 0, k + 1, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 0, k + 8, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 0, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 1, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 2, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 2, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 3, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 3, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 4, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 4, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 5, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 5, k + 1, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 5, k + 8, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 5, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 0, j + 6, k + 0, DivineRPG.firelight.blockID);
		world.setBlock(i + 0, j + 6, k + 9, DivineRPG.firelight.blockID);
		world.setBlock(i + 1, j + 0, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 1, j + 0, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 1, j + 5, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 1, j + 5, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 0, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 0, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 0, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 0, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 7, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 7, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 0, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 0, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 1, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 1, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 1, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 1, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 7, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 7, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 0, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 0, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 0, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 0, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 1, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 1, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 1, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 1, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 2, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 2, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 3, k + 4, DivineRPG.infusionTable.blockID);
		world.setBlock(i + 4, j + 3, k + 5, DivineRPG.infusionTable.blockID);
		world.setBlock(i + 4, j + 5, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 5, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 6, k + 4, DivineRPG.firelight.blockID);
		world.setBlock(i + 4, j + 6, k + 5, DivineRPG.firelight.blockID);
		world.setBlock(i + 4, j + 7, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 7, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 7, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 7, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 7, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 7, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 0, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 0, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 0, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 0, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 1, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 1, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 1, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 1, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 2, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 2, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 3, k + 4, DivineRPG.infusionTable.blockID);
		world.setBlock(i + 5, j + 3, k + 5, DivineRPG.infusionTable.blockID);
		world.setBlock(i + 5, j + 5, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 5, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 6, k + 4, DivineRPG.firelight.blockID);
		world.setBlock(i + 5, j + 6, k + 5, DivineRPG.firelight.blockID);
		world.setBlock(i + 5, j + 7, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 7, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 7, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 7, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 7, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 7, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 0, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 0, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 1, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 1, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 1, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 1, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 7, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 7, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 0, k + 2, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 0, k + 3, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 0, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 0, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 0, k + 6, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 0, k + 7, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 7, k + 4, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 7, k + 5, DivineRPG.everstone.blockID);
		world.setBlock(i + 8, j + 0, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 8, j + 0, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 8, j + 5, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 8, j + 5, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 0, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 0, k + 1, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 0, k + 8, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 0, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 1, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 2, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 2, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 3, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 3, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 4, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 4, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 5, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 5, k + 1, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 5, k + 8, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 5, k + 9, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 6, k + 0, DivineRPG.firelight.blockID);
		world.setBlock(i + 9, j + 6, k + 9, DivineRPG.firelight.blockID);

		return true;
	}
}