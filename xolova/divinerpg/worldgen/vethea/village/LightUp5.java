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

public class LightUp5 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public LightUp5() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		EntityLiving entity = new EntityHungerHungry(world);
		entity.setLocationAndAngles(i+ 0F, j +1.0F, k+0F, 0.0F, 0.0F);
		world.spawnEntityInWorld(entity);
		
		world.setBlock(i + 0, j + 0, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 0, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 1, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 1, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 2, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 2, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 3, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 4, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 5, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 5, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 6, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 6, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 7, k + 0, DivineRPG.firelight.blockID);
		world.setBlock(i + 0, j + 7, k + 1, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 7, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 0, j + 7, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 0, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 1, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 2, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 3, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 4, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 5, k + 5, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 6, k + 3, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 6, k + 4, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 7, k + 0, DivineRPG.firelight.blockID);
		world.setBlock(i + 1, j + 7, k + 1, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 7, k + 2, DivineRPG.darkEverstone.blockID);
		world.setBlock(i + 1, j + 7, k + 3, DivineRPG.darkEverstone.blockID);

		return true;
	}
}