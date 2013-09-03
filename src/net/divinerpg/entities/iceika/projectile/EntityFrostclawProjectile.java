package net.divinerpg.entities.iceika.projectile;

import net.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntityFrostclawProjectile extends EntityCrabclawProjectile {

	public EntityFrostclawProjectile(World world) {
		super(world);
	}
	
	public EntityFrostclawProjectile(World var1, EntityLivingBase var2, int damage) {
		super(var1, var2, damage);
	}

}
