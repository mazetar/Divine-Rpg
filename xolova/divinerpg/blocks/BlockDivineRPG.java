package xolova.divinerpg.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import xolova.divinerpg.api.IBlockDivineRPG;
import xolova.divinerpg.utils.helpers.IconHelper;

public class BlockDivineRPG extends Block implements IBlockDivineRPG {
	
	int index;
	int sheet;
	
	public BlockDivineRPG(int id, int sprite, Material mat) {
		super(id, mat);
		this.index = sprite;
		GameRegistry.registerBlock(this);
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
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) {
		return IconHelper.icons[getSheet(par1, par2)][getIndex(par1, par2)];
	}
	
	public int getTextureIndexFromSideAndMetadata(int par1, int par2) {
		return index;
	}
	
}