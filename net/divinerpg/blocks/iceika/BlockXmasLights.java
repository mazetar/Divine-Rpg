package net.divinerpg.blocks.iceika;

import net.divinerpg.api.IBlockDivineRPG;
import net.divinerpg.utils.helpers.IconHelper;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class BlockXmasLights extends BlockLadder implements IBlockDivineRPG {

	int index;
	
	public BlockXmasLights(int par1, int index) {
		super(par1);
		this.index = index;
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		blockIcon = IconHelper.icons[3][(15 * 16) + index];
	}
	
	@Override
	public boolean isLadder(World world, int x, int y, int z,
	        EntityLivingBase entity) {
	    // TODO Auto-generated method stub
	    return true;
	}
	

}
