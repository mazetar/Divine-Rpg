package xolova.divinerpg.blocks;

import xolova.divinerpg.api.IBlockDivineRPG;
import xolova.divinerpg.utils.helpers.IconHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockColoredGlass extends BlockGlass implements IBlockDivineRPG {

	int index;
	int sheet;
	
	public BlockColoredGlass(int par1, boolean par3) {
		super(par1, Material.glass, par3);
		GameRegistry.registerBlock(this);
	}
	
	public BlockColoredGlass setIconIndex(int sheet, int index) {
		this.sheet = sheet;
		this.index = index;
		return this;
	}

	public BlockColoredGlass setIconIndex(int sheet, int x, int y) {
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
	
	@Override
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5) {
        return super.shouldSideBeRendered(var1, var2, var3, var4, 1 - var5);
    }
	
	@Override
	public int getRenderBlockPass() {
		return 1;
	}

}
