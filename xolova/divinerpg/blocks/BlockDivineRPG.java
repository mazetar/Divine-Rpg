package xolova.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import xolova.divinerpg.api.IBlockDivineRPG;
import xolova.divinerpg.utils.helpers.IconHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineRPG extends Block implements IBlockDivineRPG {
	
	int index;
	int sheet;
	public static final int Top = 1;
	public static final int Bottom = 0;

	public BlockDivineRPG(int id, int sprite, Material mat) {
		super(id, mat);
		this.index = sprite;
	}
	
	public BlockDivineRPG(int id, Material mat)
	{
		this(id, 0, mat);
	}
	
	public BlockDivineRPG setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}

	public BlockDivineRPG setIconIndex(int sheet, int x, int y) {
		return setIconIndex(sheet, (x + y * 16));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		IconHelper.massLoadBlockSprites(par1IconRegister);
	}
	
	// Meant to be overrided
	public int getIndex(int side, int metadata) {
		return index;
	}
	
	// Meant to be overrided
	public int getSheet(int side, int metadata) {
		return sheet;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTexture(IBlockAccess block, int par2, int par3, int par4, int par5)
    {
		return IconHelper.icons[getSheet(par5, block.getBlockMetadata(par2, par3, par4))][getIndex(par5, block.getBlockMetadata(par2, par3, par4))];
	}
	
	public int getTextureIndexFromSideAndMetadata(int par1, int par2) {
		return index;
	}
	
}