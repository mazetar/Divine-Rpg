package net.divinerpg.utils.helpers.recipe;

import net.divinerpg.utils.helpers.item.IceikaItemHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class IceikaRecipeHelper {
    
    
    public static void init () {
        initWeapons();
    }
    
    private static void initWeapons () {
        GameRegistry.addRecipe(new ItemStack(IceikaItemHelper.bluefireBow, 1), new Object[] {" xy", "x y", " xy", 'x', Item.silk, 'y', OverworldItemHelper.blueFireStone});

    }
}
