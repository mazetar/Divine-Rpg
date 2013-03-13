package xolova.blued00r.divinerpg.misc;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import xolova.blued00r.divinerpg.DivineRPG;

public class CraftingMaterial {

	public static void setMaterials() 
	{
        DivineRPG.frostSwordEnum.customCraftingMaterial = DivineRPG.iceStone;
        DivineRPG.moltenSwordEnum.customCraftingMaterial = DivineRPG.moltenStone;
        DivineRPG.serenity.customCraftingMaterial = DivineRPG.serenityGem;
        DivineRPG.azurite.customCraftingMaterial = DivineRPG.azuriteGem;
        DivineRPG.Realmite.customCraftingMaterial = DivineRPG.realmiteIngot;
        DivineRPG.Plasma.customCraftingMaterial = DivineRPG.rupee;
        DivineRPG.Crystal.customCraftingMaterial = DivineRPG.arlemite;
        DivineRPG.Bedrock.customCraftingMaterial = Item.diamond;
        DivineRPG.energy.customCraftingMaterial = DivineRPG.energyGem;
        DivineRPG.mythril.customCraftingMaterial = DivineRPG.mythrilGem;
        DivineRPG.dense.customCraftingMaterial = DivineRPG.denseGem;
//        DivineRPG.twilight.customCraftingMaterial = DivineRPG.ultimaStone;
	}

}
