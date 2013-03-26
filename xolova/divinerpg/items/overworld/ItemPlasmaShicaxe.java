package xolova.blued00r.divinerpg.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import xolova.divinerpg.DivineRPGTwilight;

public class ItemPlasmaShicaxe extends ItemCrystalShicaxe
{
    private static Block[] blocksEffectiveAgainst = Block.blocksList;
    private int weaponDamage;
    private final EnumToolMaterial field_40439_b;

    public ItemPlasmaShicaxe(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 0 + var2.getDamageVsEntity();
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile;
    }
}
