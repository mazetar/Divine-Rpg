package xolova.divinerpg.blocks.overworld;

import java.util.ArrayList;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import xolova.divinerpg.DivineRPGTwilight;

public class BlockPlate extends BlockPressurePlate
{
    private EnumMobType triggerMobType;

    public BlockPlate(int var1, String var2, EnumMobType var3, Material var4)
    {
        super(var1, var2, var4, var3);
        this.triggerMobType = var3;
        this.setTickRandomly(true);
        float var5 = 0.0625F;
        this.setBlockBounds(var5, 0.0F, var5, 1.0F - var5, 0.03125F, 1.0F - var5);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
