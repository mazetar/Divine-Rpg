package xolova.divinerpg.entities.iceika.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;
import xolova.divinerpg.entities.overworld.projectile.EntityCrabclawProjectile;

public class EntityFrostclawProjectile extends EntityCrabclawProjectile {

	public EntityFrostclawProjectile(World world) {
		super(world);
	}
	
	public EntityFrostclawProjectile(World var1, EntityLiving var2, int damage) {
		super(var1, var2, damage);
	}

}
