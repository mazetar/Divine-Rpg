package net.divinerpg.blocks;

import net.divinerpg.api.IBlockDivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredGlass extends BlockGlass implements IBlockDivineRPG {

	int index;
	int sheet;
	
	public BlockColoredGlass(int par1, boolean par3) {
		super(par1, Material.glass, par3);
		GameRegistry.registerBlock(this);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir) {
	    this.blockIcon = ir.registerIcon(Reference.MAIN_MOD_ID + ":" + this.func_111023_E());
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
