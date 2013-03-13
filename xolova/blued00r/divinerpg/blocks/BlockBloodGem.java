package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockBloodGem extends Block
{
    public BlockBloodGem(int var1, int var2)
    {
        super(var1, var2, Material.rock);
        this.blockIndexInTexture = var2;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return this.blockID == DivineRPG.bloodGemOre.blockID ? DivineRPG.glowingGem.itemID : (this.blockID == DivineRPG.azuriteOre.blockID ? DivineRPG.azuriteFragments.itemID : (this.blockID == DivineRPG.energyOre.blockID ? DivineRPG.energyFragments.itemID : (this.blockID == DivineRPG.mythilOre.blockID ? DivineRPG.mythrilFragments.itemID : (this.blockID == DivineRPG.denseOre.blockID ? DivineRPG.denseFragments.itemID : this.blockID))));
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
        {
            int var3 = par2Random.nextInt(par1 + 2) - 1;

            if (var3 < 0)
            {
                var3 = 0;
            }

            return this.quantityDropped(par2Random) * (var3 + 1);
        }
        else
        {
            return this.quantityDropped(par2Random);
        }
    }
}
