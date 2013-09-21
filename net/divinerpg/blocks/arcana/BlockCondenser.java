package net.divinerpg.blocks.arcana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.DivineRPG;
import net.divinerpg.DivineRPGArcana;
import net.divinerpg.blocks.arcana.tileentities.TileEntityCondenser;
import net.divinerpg.blocks.core.BlockDivineContainer;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCondenser extends BlockDivineContainer
{

	private Icon[] texture;

	public BlockCondenser(int id)
	{
		super(id, Material.anvil);
		this.setCreativeTab(DivineTabs.tabUtility);
	}

	@Override
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityCondenser();
	}
	
    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityCondenser var10 = (TileEntityCondenser)par1World.getBlockTileEntity(par2, par3, par4);

            if (var10 != null)
            {
                par5EntityPlayer.openGui(DivineRPGArcana.instance, GuiRef.CONDENSER, par1World, par2, par3, par4);
            }

            return true;
        }
    }
}
