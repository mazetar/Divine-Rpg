package net.divinerpg.blocks.arcana;

import java.util.Random;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.blocks.BlockDivineGrass;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockArcaniteGrass extends BlockDivineGrass
{
    public Icon topIcon;
    public Icon bottomIcon;
    
    public BlockArcaniteGrass(int par1)
    {
        super(par1);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ArcanaBlockHelper.arcaniteDirt.blockID;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        
        return side == 0 ? bottomIcon : side == 1 ? topIcon : blockIcon;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {

        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Side"); 
        this.topIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Top"); 
        this.bottomIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Bottom"); 
        
    }
    
    
    //TODO fix isCrops and isWater nearby
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
                    if (par1World.getBlockId(var5, var6, var7) == OverworldBlockHelper.tarStill.blockID)
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
