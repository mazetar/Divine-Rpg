package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockArcaniteDirt extends Block
{
    public BlockArcaniteDirt(int par1)
    {
        super(par1, Material.ground);
        this.blockIndexInTexture = 54;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return DivineRPG.arcaniteDirt.blockID;
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
