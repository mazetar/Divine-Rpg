/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.All;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class Pointedsquare extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public Pointedsquare() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 1, j + 1, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 3, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 4, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 2, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 6, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 2, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 3, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 3, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 2, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 3, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 4, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 5, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 3, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 4, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 4, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 4, j + 3, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 4, j + 4, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 4, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 4, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 7, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 4, j + 8, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 5, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 5, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 5, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 5, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 5, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 6, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 6, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 2, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 3, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 6, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 6, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 6, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 7, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 7, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 7, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 7, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 7, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 7, j + 8, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 8, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 8, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 8, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 8, j + 4, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 8, j + 5, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 8, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 8, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 9, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 9, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 9, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 9, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 9, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 10, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 10, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 10, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 10, j + 3, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 10, j + 4, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 10, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 10, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 10, j + 7, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 10, j + 8, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 11, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 11, j + 1, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 11, j + 2, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 11, j + 3, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 11, j + 4, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 11, j + 5, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 11, j + 6, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 11, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 12, j + 0, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 12, j + 1, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 12, j + 2, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 12, j + 3, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 12, j + 4, k + 0, DivineRPG.everstone.blockID);
		world.setBlock(i + 12, j + 5, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 12, j + 6, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 12, j + 7, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 13, j + 2, k + 0, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 13, j + 4, k + 0, DivineRPG.darkEverstone.blockID);

		return true;
	}
}