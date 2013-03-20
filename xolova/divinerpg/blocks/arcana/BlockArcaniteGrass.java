package xolova.divinerpg.blocks.arcana;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockArcaniteGrass extends Block
{
    public BlockArcaniteGrass(int par1)
    {
        super(par1, Material.grass);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ArcanaBlockHelper.arcaniteDirt.blockID;
    }
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return par1 == 1 ? ArcanaBlockHelper.arcaniteDirt.getBlockTextureFromSide(0) : (par1 == 0 ? this.texture[0] : this.texture[1]);
    }

    /**
     * returns true if there is at least one cropblock nearby (x-1 to x+1, y+1, z-1 to z+1)
     */
    private boolean isCropsNearby(World par1World, int par2, int par3, int par4)
    {
        byte var5 = 0;

        for (int var6 = par2 - var5; var6 <= par2 + var5; ++var6)
        {
            for (int var7 = par4 - var5; var7 <= par4 + var5; ++var7)
            {
                int var8 = par1World.getBlockId(var6, par3 + 1, var7);
                Block plant = blocksList[var8];

                if (plant instanceof IPlantable && canSustainPlant(par1World, par2, par3, par4, ForgeDirection.UP, (IPlantable)plant))
                {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * returns true if there's water nearby (x-4 to x+4, y to y+1, k-4 to k+4)
     */
    private boolean isWaterNearby(World par1World, int par2, int par3, int par4)
    {
        for (int var5 = par2 - 4; var5 <= par2 + 4; ++var5)
        {
            for (int var6 = par3; var6 <= par3 + 1; ++var6)
            {
                for (int var7 = par4 - 4; var7 <= par4 + 4; ++var7)
                {
                    if (par1World.getBlockId(var5, var6, var7) == VanillaBlockHelper.tarStill.blockID)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
    {
        return true;
    }
}
