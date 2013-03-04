package xolova.blued00r.divinerpg.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class RecipesInfusionTable 
{
	public static int slotNumber1(ItemStack[] inventory, Item item)
	{
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 4)
			return 4;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 5 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 5;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 3)
			return 3;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 2)
			return 2;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 5 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 5;
		if(item == DivineRPG.teakerLump && inventory[0].stackSize == 1)
			return 1;
		
		if(item == DivineRPG.amthrimisLump && inventory[0].stackSize == 4)
			return 104;
		if(item == DivineRPG.amthrimisLump && inventory[0].stackSize == 9 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 109;
		if(item == DivineRPG.amthrimisLump && inventory[0].stackSize == 5)
			return 105;
		if(item == DivineRPG.amthrimisLump && inventory[0].stackSize == 3)
			return 103;
		if(item == DivineRPG.amthrimisLump && inventory[0].stackSize == 8 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 108;
		if(item == DivineRPG.amthrimisLump && inventory[0].stackSize == 2)
			return 102;
		
		if(item == DivineRPG.darvenLump && inventory[0].stackSize == 6)
			return 1006;
		if(item == DivineRPG.darvenLump && inventory[0].stackSize == 13 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 1013;
		if(item == DivineRPG.darvenLump && inventory[0].stackSize == 7)
			return 1007;
		if(item == DivineRPG.darvenLump && inventory[0].stackSize == 5)
			return 1005;
		if(item == DivineRPG.darvenLump && inventory[0].stackSize == 12 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 1012;
		if(item == DivineRPG.darvenLump && inventory[0].stackSize == 4)
			return 1004;
		
		if(item == DivineRPG.cermileLump && inventory[0].stackSize == 8 && inventory[1].getItem() == DivineRPG.vetheanBowTemplate)
			return 10008;
		if(item == DivineRPG.cermileLump && inventory[0].stackSize == 15 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 10015;
		if(item == DivineRPG.cermileLump && inventory[0].stackSize == 10)
			return 10010;
		if(item == DivineRPG.cermileLump && inventory[0].stackSize == 8 && inventory[1].getItem() == DivineRPG.vetheanDiskTemplate)
			return 10008;
		if(item == DivineRPG.cermileLump && inventory[0].stackSize == 14 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 10014;
		if(item == DivineRPG.cermileLump && inventory[0].stackSize == 7)
			return 10007;
		
		if(item == DivineRPG.pardimalLump && inventory[0].stackSize == 11)
			return 100011;
		if(item == DivineRPG.pardimalLump && inventory[0].stackSize == 21 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 100021;
		if(item == DivineRPG.pardimalLump && inventory[0].stackSize == 14)
			return 100014;
		if(item == DivineRPG.pardimalLump && inventory[0].stackSize == 10)
			return 100010;
		if(item == DivineRPG.pardimalLump && inventory[0].stackSize == 19 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 100019;
		if(item == DivineRPG.pardimalLump && inventory[0].stackSize == 10)
			return 100010;
		
		if(item == DivineRPG.quadroticLump && inventory[0].stackSize == 13)
			return 1000013;
		if(item == DivineRPG.quadroticLump && inventory[0].stackSize == 25 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 1000025;
		if(item == DivineRPG.quadroticLump && inventory[0].stackSize == 17)
			return 1000017;
		if(item == DivineRPG.quadroticLump && inventory[0].stackSize == 12)
			return 1000012;
		if(item == DivineRPG.quadroticLump && inventory[0].stackSize == 24 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 1000024;
		if(item == DivineRPG.quadroticLump && inventory[0].stackSize == 12)
			return 1000012;
		
		if(item == DivineRPG.karosLump && inventory[0].stackSize == 18)
			return 10000018;
		if(item == DivineRPG.karosLump && inventory[0].stackSize == 28 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 10000028;
		if(item == DivineRPG.karosLump && inventory[0].stackSize == 21)
			return 10000021;
		if(item == DivineRPG.karosLump && inventory[0].stackSize == 16)
			return 10000016;
		if(item == DivineRPG.karosLump && inventory[0].stackSize == 27 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 10000027;
		if(item == DivineRPG.karosLump && inventory[0].stackSize == 16)
			return 10000016;
		
		if(item == DivineRPG.heliosisLump && inventory[0].stackSize == 20)
			return 100000020;
		if(item == DivineRPG.heliosisLump && inventory[0].stackSize == 32 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 100000032;
		if(item == DivineRPG.heliosisLump && inventory[0].stackSize == 25)
			return 100000025;
		if(item == DivineRPG.heliosisLump && inventory[0].stackSize == 18)
			return 100000018;
		if(item == DivineRPG.heliosisLump && inventory[0].stackSize == 31 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 100000031;
		if(item == DivineRPG.heliosisLump && inventory[0].stackSize == 18)
			return 100000018;
		
		if(item == DivineRPG.arksianeLump && inventory[0].stackSize == 24)
			return 1000000024;
		if(item == DivineRPG.arksianeLump && inventory[0].stackSize == 35 && inventory[1].getItem() == DivineRPG.vetheanHammerTemplate)
			return 1000000035;
		if(item == DivineRPG.arksianeLump && inventory[0].stackSize == 28)
			return 1000000028;
		if(item == DivineRPG.arksianeLump && inventory[0].stackSize == 22)
			return 1000000022;
		if(item == DivineRPG.arksianeLump && inventory[0].stackSize == 34 && inventory[1].getItem() == DivineRPG.vetheanCannonTemplate)
			return 1000000034;
		if(item == DivineRPG.arksianeLump && inventory[0].stackSize == 22)
			return 1000000022;
		
		return 0;
	}
	
	public static int slotNumber2(ItemStack[] inventory, Item item)
	{
		if(item == DivineRPG.vetheanBowTemplate)
			return 1;
		if(item == DivineRPG.vetheanHammerTemplate)
			return 2;
		if(item == DivineRPG.vetheanBackswordTemplate)
			return 3;
		if(item == DivineRPG.vetheanDiskTemplate)
			return 4;
		if(item == DivineRPG.vetheanCannonTemplate)
			return 5;
		if(item == DivineRPG.vetheanClawTemplate)
			return 6;
		
		return 0;
	}
	
	public static Item setSlot3(int i, int j)
	{
		int k = i + j;
		
		if(k == 104)
			return DivineRPG.teakerBow;
		if(k == 205)
			return DivineRPG.teakerHammer;
		if(k == 303)
			return DivineRPG.teakerSword;
		if(k == 402)
			return DivineRPG.teakerDisk;
		if(k == 505)
			return DivineRPG.teakerCannon;
		if(k == 601)
			return DivineRPG.teakerClaw;
		
		if(k == 104)
			return DivineRPG.amthrimisBow;
		if(k == 209)
			return DivineRPG.amthrimisHammer;
		if(k == 303)
			return DivineRPG.amthrimisSword;
		if(k == 402)
			return DivineRPG.amthrimisDisk;
		if(k == 505)
			return DivineRPG.amthrimisCannon;
		if(k == 601)
			return DivineRPG.amthrimisClaw;
		
		if(k == 104)
			return DivineRPG.darvenBow;
		if(k == 205)
			return DivineRPG.darvenHammer;
		if(k == 303)
			return DivineRPG.darvenSword;
		if(k == 402)
			return DivineRPG.darvenDisk;
		if(k == 505)
			return DivineRPG.darvenCannon;
		if(k == 601)
			return DivineRPG.darvenClaw;
		
		if(k == 104)
			return DivineRPG.cermileBow;
		if(k == 205)
			return DivineRPG.cermileHammer;
		if(k == 303)
			return DivineRPG.cermileSword;
		if(k == 402)
			return DivineRPG.cermileDisk;
		if(k == 505)
			return DivineRPG.cermileCannon;
		if(k == 601)
			return DivineRPG.cermileClaw;
		
		if(k == 104)
			return DivineRPG.pardimalBow;
		if(k == 205)
			return DivineRPG.pardimalHammer;
		if(k == 303)
			return DivineRPG.pardimalSword;
		if(k == 402)
			return DivineRPG.pardimalDisk;
		if(k == 505)
			return DivineRPG.pardimalCannon;
		if(k == 601)
			return DivineRPG.pardimalClaw;
		
		if(k == 104)
			return DivineRPG.quadroticBow;
		if(k == 205)
			return DivineRPG.quadroticHammer;
		if(k == 303)
			return DivineRPG.quadroticSword;
		if(k == 402)
			return DivineRPG.quadroticDisk;
		if(k == 505)
			return DivineRPG.quadroticCannon;
		if(k == 601)
			return DivineRPG.quadroticClaw;
		
		if(k == 104)
			return DivineRPG.karosBow;
		if(k == 205)
			return DivineRPG.karosHammer;
		if(k == 303)
			return DivineRPG.karosSword;
		if(k == 402)
			return DivineRPG.karosDisk;
		if(k == 505)
			return DivineRPG.karosCannonItem;
		if(k == 601)
			return DivineRPG.karosClaw;
		
		if(k == 104)
			return DivineRPG.heliosisBow;
		if(k == 205)
			return DivineRPG.heliosisHammer;
		if(k == 303)
			return DivineRPG.heliosisSword;
		if(k == 402)
			return DivineRPG.heliosisDisk;
		if(k == 505)
			return DivineRPG.heliosisCannon;
		if(k == 601)
			return DivineRPG.heliosisClaw;
		
		if(k == 104)
			return DivineRPG.arksianeBow;
		if(k == 205)
			return DivineRPG.arksianeHammer;
		if(k == 303)
			return DivineRPG.arksianeSword;
		if(k == 402)
			return DivineRPG.arksianeDisk;
		if(k == 505)
			return DivineRPG.arksianeCannon;
		if(k == 601)
			return DivineRPG.arksianeClaw;
		
		return null;
	}
}	
