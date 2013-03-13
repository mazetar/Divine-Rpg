package xolova.blued00r.divinerpg.entities.mobs.bosses;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityZichile extends EntityMob implements IBossDisplayData
{
    public double targetX;
    public double targetY;
    public double targetZ;
    public double[][] ringBuffer = new double[64][3];
    public int ringBufferIndex = -1;
    public float prevAnimTime = 0.0F;
    public float animTime = 0.0F;
    public boolean forceNewTarget = false;
    public boolean slowed = false;
    private Entity target;
    public int deathTicks = 0;

    public EntityZichile(World var1)
    {
        super(var1);
        this.texture = "/mob/zichile.png";
        this.setSize(5.0F, 8.0F);
        this.noClip = true;
        this.targetY = 100.0D;
    }

    /**
     * Gets the username of the entity.
     */
    public String getEntityName()
    {
        return "Zichile";
    }

    /**
     * Returns the health points of the dragon.
     */
    public int getDragonHealth()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(this.getMaxHealth()));
    }

    public int getAttackStrength(Entity var1)
    {
        return 20;
    }

    public int getMaxHealth()
    {
        return 3400;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        this.prevAnimTime = this.animTime;

        if (!this.worldObj.isRemote)
        {
            this.dataWatcher.updateObject(16, Integer.valueOf(this.health));
        }

        float var1;

        if (this.health <= 0)
        {
            var1 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            float var3 = (this.rand.nextFloat() - 0.5F) * 4.0F;
            float var2 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            this.worldObj.spawnParticle("largeexplode", this.posX + (double)var1, this.posY + 2.0D + (double)var3, this.posZ + (double)var2, 0.0D, 0.0D, 0.0D);
        }
        else
        {
            var1 = 0.2F / (MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ) * 10.0F + 1.0F);
            var1 *= (float)Math.pow(2.0D, this.motionY);

            if (this.slowed)
            {
                this.animTime += var1 * 0.5F;
            }
            else
            {
                this.animTime += var1;
            }

            this.rotationYaw = MathHelper.wrapAngleTo180_float(this.rotationYaw);

            if (this.ringBufferIndex < 0)
            {
                for (int var4 = 0; var4 < this.ringBuffer.length; ++var4)
                {
                    this.ringBuffer[var4][0] = (double)this.rotationYaw;
                    this.ringBuffer[var4][1] = this.posY;
                }
            }

            if (++this.ringBufferIndex == this.ringBuffer.length)
            {
                this.ringBufferIndex = 0;
            }

            this.ringBuffer[this.ringBufferIndex][0] = (double)this.rotationYaw;
            this.ringBuffer[this.ringBufferIndex][1] = this.posY;
            double var6;
            double var8;
            double var10;
            double var27;

            if (this.worldObj.isRemote)
            {
                if (this.newPosRotationIncrements > 0)
                {
                    var10 = this.posX + (this.newPosX - this.posX) / (double)this.newPosRotationIncrements;
                    var27 = this.posY + (this.newPosY - this.posY) / (double)this.newPosRotationIncrements;
                    var6 = this.posZ + (this.newPosZ - this.posZ) / (double)this.newPosRotationIncrements;
                    var8 = MathHelper.wrapAngleTo180_double(this.newRotationYaw - (double)this.rotationYaw);
                    this.rotationYaw = (float)((double)this.rotationYaw + var8 / (double)this.newPosRotationIncrements);
                    this.rotationPitch = (float)((double)this.rotationPitch + (this.newRotationPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
                    --this.newPosRotationIncrements;
                    this.setPosition(var10, var27, var6);
                    this.setRotation(this.rotationYaw, this.rotationPitch);
                }
            }
            else
            {
                var10 = this.targetX - this.posX;
                var27 = this.targetY - this.posY;
                var6 = this.targetZ - this.posZ;
                var8 = var10 * var10 + var27 * var27 + var6 * var6;
                double var13;
                double var15;

                if (this.target != null)
                {
                    this.targetX = this.target.posX;
                    this.targetZ = this.target.posZ;
                    var13 = this.targetX - this.posX;
                    var15 = this.targetZ - this.posZ;
                    double var17 = Math.sqrt(var13 * var13 + var15 * var15);
                    double var19 = 0.4000000059604645D + var17 / 80.0D - 1.0D;

                    if (var19 > 10.0D)
                    {
                        var19 = 10.0D;
                    }

                    this.targetY = this.target.boundingBox.minY + var19;
                }
                else
                {
                    this.targetX += this.rand.nextGaussian() * 2.0D;
                    this.targetZ += this.rand.nextGaussian() * 2.0D;
                }

                if (this.forceNewTarget || var8 < 100.0D || var8 > 22500.0D || this.isCollidedHorizontally || this.isCollidedVertically)
                {
                    this.setNewTarget();
                }

                var27 /= (double)MathHelper.sqrt_double(var10 * var10 + var6 * var6);
                float var12 = 0.6F;

                if (var27 < (double)(-var12))
                {
                    var27 = (double)(-var12);
                }

                if (var27 > (double)var12)
                {
                    var27 = (double)var12;
                }

                this.motionY += var27 * 0.10000000149011612D;
                this.rotationYaw = MathHelper.wrapAngleTo180_float(this.rotationYaw);
                var13 = 180.0D - Math.atan2(var10, var6) * 180.0D / Math.PI;
                var15 = MathHelper.wrapAngleTo180_double(var13 - (double)this.rotationYaw);

                if (var15 > 50.0D)
                {
                    var15 = 50.0D;
                }

                if (var15 < -50.0D)
                {
                    var15 = -50.0D;
                }

                Vec3 var28 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.targetX - this.posX, this.targetY - this.posY, this.targetZ - this.posZ).normalize();
                Vec3 var18 = this.worldObj.getWorldVec3Pool().getVecFromPool((double)MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F), this.motionY, (double)(-MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F))).normalize();
                float var29 = (float)(var18.dotProduct(var28) + 0.5D) / 1.5F;

                if (var29 < 0.0F)
                {
                    var29 = 0.0F;
                }

                this.randomYawVelocity *= 0.8F;
                float var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0F + 1.0F;
                double var21 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0D + 1.0D;

                if (var21 > 40.0D)
                {
                    var21 = 40.0D;
                }

                this.randomYawVelocity = (float)((double)this.randomYawVelocity + var15 * (0.699999988079071D / var21 / (double)var20));
                this.rotationYaw += this.randomYawVelocity * 0.1F;
                float var23 = (float)(2.0D / (var21 + 1.0D));
                float var24 = 0.06F;
                this.moveFlying(0.0F, -1.0F, var24 * (var29 * var23 + (1.0F - var23)));

                if (this.slowed)
                {
                    this.moveEntity(this.motionX * 0.800000011920929D, this.motionY * 0.800000011920929D, this.motionZ * 0.800000011920929D);
                }
                else
                {
                    this.moveEntity(this.motionX, this.motionY, this.motionZ);
                }

                Vec3 var25 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.motionX, this.motionY, this.motionZ).normalize();
                float var26 = (float)(var25.dotProduct(var18) + 1.0D) / 2.0F;
                var26 = 0.8F + 0.15F * var26;
                this.motionX *= (double)var26;
                this.motionZ *= (double)var26;
                this.motionY *= 0.9100000262260437D;
            }
            if (!this.worldObj.isRemote && this.hurtTime == 0)
            {
                this.attackEntitiesInList(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(1.0D, 1.0D, 1.0D)));
            }
            MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F - this.randomYawVelocity * 0.01F);
            MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F - this.randomYawVelocity * 0.01F);
            
            
        }
    }

    private void attackEntitiesInList(List var1)
    {
        Iterator var2 = var1.iterator();

        while (var2.hasNext())
        {
            Entity var3 = (Entity)var2.next();

            if (var3 instanceof EntityLiving)
            {
                var3.attackEntityFrom(DamageSource.causeMobDamage(this), 10);
            }
        }
    }

    private void setNewTarget()
    {
        this.forceNewTarget = false;

        if (this.rand.nextInt(2) == 0 && !this.worldObj.playerEntities.isEmpty())
        {
            this.target = (Entity)this.worldObj.playerEntities.get(this.rand.nextInt(this.worldObj.playerEntities.size()));
        }
        else
        {
            boolean var1 = false;

            do
            {
                this.targetX = 0.0D;
                this.targetY = (double)(70.0F + this.rand.nextFloat() * 50.0F);
                this.targetZ = 0.0D;
                this.targetX += (double)(this.rand.nextFloat() * 120.0F - 60.0F);
                this.targetZ += (double)(this.rand.nextFloat() * 120.0F - 60.0F);
                double var2 = this.posX - this.targetX;
                double var4 = this.posY - this.targetY;
                double var6 = this.posZ - this.targetZ;
                var1 = var2 * var2 + var4 * var4 + var6 * var6 > 100.0D;
            }
            while (!var1);

            this.target = null;
        }
    }

    private float simplifyAngle(double var1)
    {
        return (float)MathHelper.wrapAngleTo180_double(var1);
    }

    /**
     * handles entity death timer, experience orb and particle creation
     */
    protected void onDeathUpdate()
    {
        ++this.deathTicks;

        if (this.deathTicks >= 180 && this.deathTicks <= 200)
        {
            float var1 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            float var2 = (this.rand.nextFloat() - 0.5F) * 4.0F;
            float var3 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            this.worldObj.spawnParticle("hugeexplosion", this.posX + (double)var1, this.posY + 2.0D + (double)var2, this.posZ + (double)var3, 0.0D, 0.0D, 0.0D);
        }

        int var4;
        int var5;

        if (!this.worldObj.isRemote && this.deathTicks > 150 && this.deathTicks % 5 == 0)
        {
            var4 = 1000;

            while (var4 > 0)
            {
                var5 = EntityXPOrb.getXPSplit(var4);
                var4 -= var5;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
            }
        }

        this.moveEntity(0.0D, 0.10000000149011612D, 0.0D);
        this.renderYawOffset = this.rotationYaw += 20.0F;

        if (this.deathTicks == 200 && !this.worldObj.isRemote)
        {
            var4 = 2000;

            while (var4 > 0)
            {
                var5 = EntityXPOrb.getXPSplit(var4);
                var4 -= var5;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
            }

            this.setDead();
        }
    }
    
	 protected void collideWithEntity(Entity var7)
	 {
		if (var7 instanceof EntityLiving)
		{
	        if (var7.riddenByEntity != this && var7.ridingEntity != this)
	        {
	            double var2 = var7.posX - this.posX;
	            double var4 = var7.posZ - this.posZ;
	            double var6 = MathHelper.abs_max(var2, var4);

	            if (var6 >= 0.009999999776482582D)
	            {
	                var6 = (double)MathHelper.sqrt_double(var6);
	                var2 /= var6;
	                var4 /= var6;
	                double var8 = 1.0D / var6;

	                if (var8 > 1.0D)
	                {
	                    var8 = 1.0D;
	                }

	                var2 *= var8;
	                var4 *= var8;
	                var2 *= 0.05000000074505806D;
	                var4 *= 0.05000000074505806D;
	                var2 *= (double)(1.0F - this.entityCollisionReduction);
	                var4 *= (double)(1.0F - this.entityCollisionReduction);
	                this.addVelocity(-var2, 0.0D, -var4);
	                var7.addVelocity(var2, 0.0D, var4);
	                var7.attackEntityFrom(DamageSource.causeMobDamage(this), 10);
	            }
	        }
		}

	}

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.ultimaHead.itemID;
    }

    public void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(this.getDropItemId(), 1);
		
        if (this.rand.nextInt(6) == 0)
        {
        	this.dropItem(DivineRPG.DAZStatue.blockID, 1);
        }
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    /**
     * Makes the entity despawn if requirements are reached
     */
    protected void despawnEntity() {}

	 /**
	  * Returns the sound this mob makes while it's alive.
	  */
	 protected String getLivingSound()
	 {
		 return "mob.RPG.Zichile";
	 }

	 /**
	  * Returns the sound this mob makes when it is hurt.
	  */
	 protected String getHurtSound()
	 {
		 return "mob.RPG.ZichileHit";
	 }

	 /**
	  * Returns the sound this mob makes on death.
	  */
	 protected String getDeathSound()
	 {
		 return null;
	 }
}
