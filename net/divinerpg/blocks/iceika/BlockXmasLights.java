package net.divinerpg.blocks.iceika;

import net.divinerpg.api.IBlockDivineRPG;
import net.minecraft.block.BlockLadder;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class BlockXmasLights extends BlockLadder implements IBlockDivineRPG {

	
	public BlockXmasLights(int par1, int index) {
		super(par1);
	}
	
	@Override
	public boolean isLadder(World world, int x, int y, int z,
	        EntityLivingBase entity) {
	    return true;
	}
	

}
