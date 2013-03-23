package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import xolova.divinerpg.DivineRPG;

public class BlockPlate1 extends BlockPlate
{
    public BlockPlate1(int var1, int var2, EnumMobType var3, Material var4)
    {
        super(var1, var2, var3, var4);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
