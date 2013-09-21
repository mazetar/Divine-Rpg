package net.divinerpg.blocks.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

public class BlockArcaniteRails extends BlockRail
{
    public BlockArcaniteRails(int var1)
    {
        super(var1);
        this.setCreativeTab(CreativeTabs.tabTransport);
    }

    public boolean isPowered()
    {
        return true;
    }

    public float getRailMaxSpeed(World var1, EntityMinecart var2, int var3, int var4, int var5)
    {
        return 4.99999998E11F;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E());
    }
}
