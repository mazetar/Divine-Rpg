package xolova.blued00r.divinerpg.entities.ai;

import java.util.Random;

import xolova.blued00r.divinerpg.entities.mobs.projectile.EntityFyracryxFireball;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityAIFyracryxFireballAttack extends EntityAIBase
{
    World worldObj;
    EntityLiving entityHost;
    EntityLiving attackTarget;
    int rangedAttackTime = 0;
    float entityMoveSpeed;
    int field_75318_f = 0;
    int rangedAttackID;
    int maxRangedAttackTime;
    Random rand = new Random(1);

    public EntityAIFyracryxFireballAttack(EntityLiving var1, float var2, int var3, int var4)
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
        EntityLiving var1 = this.entityHost.getAttackTarget();

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
        double var3 = this.attackTarget.posX - this.entityHost.posX;
        double var5 = this.attackTarget.boundingBox.minY + (double)(this.attackTarget.height / 2.0F) - (this.entityHost.posY + (double)(this.entityHost.height / 2.0F));
        double var7 = this.attackTarget.posZ - this.entityHost.posZ;
        float var9 = MathHelper.sqrt_float(this.entityHost.getDistanceToEntity(this.attackTarget)) * 0.5F;
        this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.entityHost.posX, (int)this.entityHost.posY, (int)this.entityHost.posZ, 0);

        for (int var10 = 0; var10 < 1; ++var10)
        {
            EntityFyracryxFireball var11 = new EntityFyracryxFireball(this.worldObj, this.entityHost, var3 + this.rand.nextGaussian() * (double)var9, var5, var7 + this.rand.nextGaussian() * (double)var9);
            var11.posY = this.entityHost.posY + (double)(this.entityHost.height / 2.0F) + 0.5D;
            this.worldObj.spawnEntityInWorld(var11);
        }
    }
}
