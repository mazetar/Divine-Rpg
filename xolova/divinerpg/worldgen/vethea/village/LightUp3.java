/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.vethea.village;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.traders.EntityHungerHungry;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LightUp3 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public LightUp3() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		EntityLiving entity = new EntityHungerHungry(world);
		entity.setLocationAndAngles(i+ 0F, j +1.0F, k+0F, 0.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		
		world.setBlock(i + 0, j + 0, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 0, j + 0, k + 6, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 5, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 6, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 3, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 3, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 0, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 1, j + 5, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 2, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 5, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 6, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 7, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 1, j + 6, k + 3, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 1, j + 6, k + 4, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 2, j + 0, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 2, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 5, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 0, k + 6, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 1, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 1, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 2, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 2, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 3, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 3, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 4, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 4, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 0, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 2, j + 5, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 2, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 3, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 4, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 5, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 6, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 2, j + 5, k + 7, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 2, j + 6, k + 3, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 2, j + 6, k + 4, DivineRPGTwilight.firelight.blockID);
		world.setBlock(i + 3, j + 0, k + 1, DivineRPGTwilight.darkEverstone.blockID);
		world.setBlock(i + 3, j + 0, k + 6, DivineRPGTwilight.darkEverstone.blockID);

		return true;
	}
}