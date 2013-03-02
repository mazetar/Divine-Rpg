package xolova.blued00r.divinerpg.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemAxeXolovon1 extends ItemAxeXolovon
{
    private static Block[] blocksEffectiveAgainst = new Block[] {Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneSingleSlab, Block.stoneDoubleSlab, Block.pumpkin, Block.pumpkinLantern};
    private int weaponDamage;
    private final EnumToolMaterial field_40439_b;

    public ItemAxeXolovon1(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.setMaxDamage(var2.getMaxUses());
        this.weaponDamage = 0 + var2.getDamageVsEntity();
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2 != null && var2.blockMaterial == Material.wood ? this.efficiencyOnProperMaterial : super.getStrVsBlock(var1, var2);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
