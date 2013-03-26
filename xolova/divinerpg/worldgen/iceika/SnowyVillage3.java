/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package xolova.blued00r.divinerpg.generation.iceika;
import java.util.Random;

import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopMerchant;
import xolova.blued00r.divinerpg.entities.mobs.iceika.EntityWorkshopTickerer;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class SnowyVillage3 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			DivineRPGTwilight.iceikaGrass.blockID
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public SnowyVillage3() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 7, j, k) || !LocationIsValidSpawn(world, i + 7, j, k + 11) || !LocationIsValidSpawn(world, i, j, k + 11))
		{
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 1, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 1, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 1, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 1, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 1, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 1, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 1, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 2, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 2, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 2, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 2, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 2, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 2, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 0, j + 2, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 0, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 1, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 1, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 0, k + 9, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 1, j + 0, k + 10, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 1, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 1, k + 2, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 1, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 9, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 1, k + 10, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 1, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 1, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 2, k + 2, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 2, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 9, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 2, k + 10, DivineRPGTwilight.iceikaBookself.blockID);
		world.setBlock(i + 1, j + 2, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 3, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 3, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 1, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 1, j + 4, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 2, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 2, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 0, k + 9, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 2, j + 0, k + 10, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 2, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 2, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 2, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 2, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 3, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 3, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 2, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 2, j + 4, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 1, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 0, k + 9, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 10, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 3, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 1, k + 5, DivineRPGTwilight.iceikaDoor.blockID);
		world.setBlock(i + 3, j + 1, k + 6, DivineRPGTwilight.iceikaDoor.blockID);
		world.setBlock(i + 3, j + 1, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 1, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 2, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 2, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlockAndMetadata(i + 3, j + 2, k + 5, DivineRPGTwilight.iceikaDoor.blockID, 8);
		world.setBlockAndMetadata(i + 3, j + 2, k + 6, DivineRPGTwilight.iceikaDoor.blockID, 9);
		world.setBlock(i + 3, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 2, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 2, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 3, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 3, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 3, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 3, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 3, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 3, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 3, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 3, j + 4, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 0, k + 1, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 3, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 4, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 5, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 6, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 7, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 8, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 9, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 10, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 4, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 2, k + 0, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 4, j + 2, k + 11, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 4, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 4, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 4, j + 4, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 0, k + 1, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 3, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 4, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 5, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 6, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 7, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 8, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 9, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 10, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 5, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 2, k + 0, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 5, j + 2, k + 11, DivineRPGTwilight.iceikaGlass.blockID);
		world.setBlock(i + 5, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 5, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 5, j + 4, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 0, k + 1, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 2, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 3, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 4, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 5, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 6, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 7, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 8, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 9, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 10, DivineRPGTwilight.workshopCarpet.blockID);
		world.setBlock(i + 6, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 1, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 2, k + 0, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 2, k + 11, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 3, k + 1, DivineRPGTwilight.workshopLamp.blockID);
		world.setBlock(i + 6, j + 3, k + 10, DivineRPGTwilight.workshopLamp.blockID);
		world.setBlock(i + 6, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 6, j + 4, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 6, j + 4, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 0, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 0, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 1, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 1, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 2, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 2, k + 1, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 2, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 3, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 4, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 5, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 6, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 7, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 8, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 9, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 10, DivineRPGTwilight.iceikaSnowyBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 11, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 0, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 1, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 2, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 3, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 4, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 5, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 6, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 7, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 8, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 9, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 10, DivineRPGTwilight.coalStone.blockID);
		world.setBlock(i + 7, j + 3, k + 11, DivineRPGTwilight.coalStone.blockID);

        EntityWorkshopTickerer tinkerer = new EntityWorkshopTickerer(world);
        tinkerer.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(tinkerer);
        
        EntityWorkshopMerchant merchant = new EntityWorkshopMerchant(world);
        merchant.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(merchant);
        
		return true;
	}
}