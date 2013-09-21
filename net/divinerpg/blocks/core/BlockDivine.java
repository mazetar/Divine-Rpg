package net.divinerpg.blocks.core;

import net.divinerpg.api.IBlockDivineRPG;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivine extends Block implements IBlockDivineRPG {

	public BlockDivine(int id, int sprite, Material mat) {
		super(id, mat);
	}
	
	public BlockDivine(int id, Material mat)
	{
		this(id, 0, mat);
	}
	
   public BlockDivine(int id)
    {
       super(id, Material.rock);
       this.setCreativeTab(DivineTabs.tabUnsorted);
    }
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
	    this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E());
	}
	
	public BlockDivine setTextureName(String name) {
        func_111022_d(name);
        return this;
	}
	
}
