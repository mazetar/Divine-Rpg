package net.divinerpg.utils.helpers.recipe;

import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.divinerpg.utils.helpers.item.VetheaItemHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class VetheaRecipeHelper {
	public static void init() {
		initItems();
	}
	
	public static void initItems() {
		GameRegistry.addRecipe(new ItemStack(VetheaItemHelper.dreamPowder, 1), new Object[]{"xxx", "xyx", "xxx", 'x', TwilightItemHelper.AugiteFragments , 'y', Item.glowstone});
	}
}
