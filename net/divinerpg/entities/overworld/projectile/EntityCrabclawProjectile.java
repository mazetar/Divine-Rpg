package net.divinerpg.entities.overworld.projectile;

import net.divinerpg.client.renders.RenderBlock.IBlockRender;
import net.divinerpg.entities.core.EntityDamageProjectile;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntityCrabclawProjectile extends EntityDamageProjectile implements IBlockRender {

	public EntityCrabclawProjectile(World world) {
		super(world);
	}
	
	public EntityCrabclawProjectile(World var1, EntityLivingBase var2, int damage) {
		super(var1, var2, damage);
	}

	@Override
	public int getBlockID() {
		return Block.cactus.blockID;
	}

	@Override
	public int getBlockMeta() {
		return 0;
	}

	@Override
	public float getBlockScale() {
		return 0.25F;
	}

}
