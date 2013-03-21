package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockEnergyDirt extends Block
{
    public BlockEnergyDirt(int var1)
    {
        super(var1, Material.ground);
        this.blockIndexInTexture = 134;
        this.setTickRandomly(true);
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    public int idDropped(int var1)
    {
        return DivineRPG.energyDirt.blockID;
    }
}
