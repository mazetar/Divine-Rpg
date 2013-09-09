package net.divinerpg.entities.iceika.projectile;

import net.divinerpg.entities.core.EntityDamageProjectile;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntityNoteProjectile extends EntityDamageProjectile {
    
    public EntityNoteProjectile(World var1, EntityLivingBase var2) {
		super(var1, var2, 16);
	}
    
    public EntityNoteProjectile(World world) {
    	super(world, 16);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        float var10 = 0.25F;
        worldObj.spawnParticle("note", posX - motionX * (double)var10 + rand.nextDouble() * 0.6D - 0.3D, posY - motionY * (double)var10 - 0.5D, posZ - motionZ * (double)var10 + rand.nextDouble() * 0.6D - 0.3D, rand.nextFloat(), motionY, motionZ);
    }
    
    @Override
    protected float getGravityVelocity() {
    	return 0F;
    }
}
