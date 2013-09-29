package net.divinerpg.blocks.core;

import java.util.Random;

import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DivineGrass extends BlockDivine {

    public Icon topIcon;
    public Icon bottomIcon;
    private int dirtBlockID;
    
    public DivineGrass(int id, int dirtBlock) {
        super(id, Material.grass);
        this.setTickRandomly(true);
        this.dirtBlockID = dirtBlock;
    }
    
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote)
        {
            if (var1.getBlockLightValue(var2, var3 + 1, var4) < 4 && Block.lightOpacity[var1.getBlockId(var2, var3 + 1, var4)] > 2)
            {
                var1.setBlock(var2, var3, var4, this.dirtBlockID);
            }
            else if (var1.getBlockLightValue(var2, var3 + 1, var4) >= 9)
            {
                for (int var6 = 0; var6 < 4; ++var6)
                {
                    int var7 = var2 + var5.nextInt(3) - 1;
                    int var8 = var3 + var5.nextInt(5) - 3;
                    int var9 = var4 + var5.nextInt(3) - 1;
                    int var10 = var1.getBlockId(var7, var8 + 1, var9);

                    if (var1.getBlockId(var7, var8, var9) == dirtBlockID && var1.getBlockLightValue(var7, var8 + 1, var9) >= 4 && Block.lightOpacity[var10] <= 2)
                    {
                        var1.setBlock(var7, var8, var9, this.blockID);
                    }
                }
            }
        }
    }
    
    @Override
    public int idDropped(int var1, Random var2, int var3)
    {
        return this.dirtBlockID;
    }
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Side");
        this.topIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Top");
        this.bottomIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E() + "_Bottom");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if (side == 0)
            return bottomIcon;
        if (side == 1)
            return topIcon;
        return blockIcon;
    }    
    
}
