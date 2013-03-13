package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockTwilightStone extends Block
{
    public BlockTwilightStone(int var1, int var2)
    {
        super(var1, var2, Material.rock);
        this.blockIndexInTexture = var2;
    }

    public boolean isGenMineableReplaceable(World var1, int var2, int var3, int var4)
    {
        return this.blockID == DivineRPG.twilightStone.blockID;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return this.blockID == DivineRPG.serenityOre.blockID ? DivineRPG.serenityFragments.itemID : (this.blockID == DivineRPG.azuriteOre.blockID ? DivineRPG.azuriteFragments.itemID : (this.blockID == DivineRPG.energyOre.blockID ? DivineRPG.energyFragments.itemID : (this.blockID == DivineRPG.mythilOre.blockID ? DivineRPG.mythrilFragments.itemID : (this.blockID == DivineRPG.denseOre.blockID ? DivineRPG.denseFragments.itemID : this.blockID))));
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }
}
