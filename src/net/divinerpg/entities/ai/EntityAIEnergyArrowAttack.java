package net.divinerpg.entities.ai;

import net.divinerpg.entities.overworld.projectile.EntityMamormeterShot;
import net.divinerpg.entities.twilight.projectile.EntityEnergyArrow;
import net.divinerpg.entities.twilight.projectile.EntityFuryArrow;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;

public class EntityAIEnergyArrowAttack extends EntityAIBase
{
    World worldObj;
    EntityLiving entityHost;
    EntityLivingBase attackTarget;
    int rangedAttackTime = 0;
    float entityMoveSpeed;
    int field_75318_f = 0;
    int rangedAttackID;
    int maxRangedAttackTime;

    public EntityAIEnergyArrowAttack(EntityLiving var1, float var2, int var3, int var4)
    {
        this.entityHost = var1;
        this.worldObj = var1.worldObj;
        this.entityMoveSpeed = var2;
        this.rangedAttackID = var3;
        this.maxRangedAttackTime = var4;
        this.setMutexBits(3);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        EntityLivingBase var1 = this.entityHost.getAttackTarget();

        if (var1 == null)
        {
            return false;
        }
        else
        {
            this.attackTarget = var1;
            return true;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return this.shouldExecute() || !this.entityHost.getNavigator().noPath();
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.attackTarget = null;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        double var1 = 100.0D;
        double var3 = this.entityHost.getDistanceSq(this.attackTarget.posX, this.attackTarget.boundingBox.minY, this.attackTarget.posZ);
        boolean var5 = this.entityHost.getEntitySenses().canSee(this.attackTarget);

        if (var5)
        {
            ++this.field_75318_f;
        }
        else
        {
            this.field_75318_f = 0;
        }

        if (var3 <= var1 && this.field_75318_f >= 20)
        {
            this.entityHost.getNavigator().clearPathEntity();
        }
        else
        {
            this.entityHost.getNavigator().tryMoveToEntityLiving(this.attackTarget, this.entityMoveSpeed);
        }

        this.entityHost.getLookHelper().setLookPositionWithEntity(this.attackTarget, 30.0F, 30.0F);
        this.rangedAttackTime = Math.max(this.rangedAttackTime - 1, 0);

        if (this.rangedAttackTime <= 0 && var3 <= var1 && var5)
        {
            this.doRangedAttack();
            this.rangedAttackTime = this.maxRangedAttackTime;
        }
    }

    private void doRangedAttack()
    {
        if (this.rangedAttackID == 1)
        {
            EntityEnergyArrow var1 = new EntityEnergyArrow(this.worldObj, this.entityHost, this.attackTarget, 1.6F, 12.0F);
            this.worldObj.playSoundAtEntity(this.entityHost, "random.bow", 1.0F, 1.0F / (this.entityHost.getRNG().nextFloat() * 0.4F + 0.8F));
            this.worldObj.spawnEntityInWorld(var1);
        }
        else if (this.rangedAttackID == 2)
        {
            EntityFuryArrow var2 = new EntityFuryArrow(this.worldObj, this.entityHost, this.attackTarget, 1.6F, 12.0F);
            this.worldObj.playSoundAtEntity(this.entityHost, "random.bow", 1.0F, 1.0F / (this.entityHost.getRNG().nextFloat() * 0.4F + 0.8F));
            this.worldObj.spawnEntityInWorld(var2);
        }
        else if (this.rangedAttackID == 3)
        {
            EntityMamormeterShot var3 = new EntityMamormeterShot(this.worldObj, this.entityHost, this.attackTarget, 1.6F, 12.0F, false);
            this.worldObj.playSoundAtEntity(this.entityHost, "random.bow", 1.0F, 1.0F / (this.entityHost.getRNG().nextFloat() * 0.4F + 0.8F));
            this.worldObj.spawnEntityInWorld(var3);
        }
    }
}
