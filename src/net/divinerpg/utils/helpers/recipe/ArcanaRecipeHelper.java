package net.divinerpg.utils.helpers.recipe;

import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArcanaRecipeHelper {
	public static void init() {
		initItems();
	}
	
	public static void initItems() {
		GameRegistry.addRecipe(new ItemStack(ArcanaBlockHelper.arcanaPortalFrame, 12), new Object[]{" x ", "yyy", " x ", 'x', OverworldItemHelper.blueFireStone, 'y', Block.blockIron});
	}
}
