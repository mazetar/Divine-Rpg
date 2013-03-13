package xolova.blued00r.divinerpg.entities.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.MathHelper;

public class EntityTwinRangedAttack extends EntityAIBase
{
    /** The entity the AI instance has been applied to */
    private final EntityLiving entityHost;

    /**
     * The entity (as a RangedAttackMob) the AI instance has been applied to.
     */
    private final IRangedAttackMob rangedAttackEntityHost;
    private EntityLiving attackTarget;

    /**
     * A decrementing tick that spawns a ranged attack once this value reaches 0. It is then set back to the
     * maxRangedAttackTime.
     */
    private int rangedAttackTime = 0;
    private float entityMoveSpeed;
    private int field_75318_f = 0;

    /**
     * The maximum time the AI has to wait before peforming another ranged attack.
     */
    private int maxRangedAttackTime;
    private float field_82642_h;

    public EntityTwinRangedAttack(IRangedAttackMob par1IRangedAttackMob, float par2, int par3, float par4)
    {
        if (!(par1IRangedAttackMob instanceof EntityLiving))
        {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        else
        {
            this.rangedAttackEntityHost = par1IRangedAttackMob;
            this.entityHost = (EntityLiving)par1IRangedAttackMob;
            this.entityMoveSpeed = par2;
            this.maxRangedAttackTime = par3;
            this.field_82642_h = par4 * par4;
            this.rangedAttackTime = par3 / 2;
            this.setMutexBits(3);
        }
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
        this.field_75318_f = 0;
        this.rangedAttackTime = this.maxRangedAttackTime / 2;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        double var1 = this.entityHost.getDistanceSq(this.attackTarget.posX, this.attackTarget.boundingBox.minY, this.attackTarget.posZ);
        boolean var3 = this.entityHost.getEntitySenses().canSee(this.attackTarget);

        if (!var3)
        {
            ++this.field_75318_f;
        }
        else
        {
            this.field_75318_f = 0;
        }

        if (var1 <= (double)this.field_82642_h && this.field_75318_f >= 20)
        {
            this.entityHost.getNavigator().clearPathEntity();
        }
        else
        {
            this.entityHost.setVelocity(-this.entityHost.motionX, this.entityHost.motionY, -this.entityHost.motionZ);
			float var7 = (float)(Math.atan2(this.entityHost.motionZ, this.entityHost.motionX) * 180.0D / Math.PI) - 90.0F;
			float var8 = MathHelper.wrapAngleTo180_float(var7 - this.entityHost.rotationYaw);
			float var9 = (float)(Math.asin(this.entityHost.motionY) * 180.0D / Math.PI) - 90.0F;
			float var10 = MathHelper.wrapAngleTo180_float(var9 - this.entityHost.rotationPitch);
			this.entityHost.rotationYaw += var8;
			this.entityHost.rotationPitch += var10;
            	
        }

        this.entityHost.getLookHelper().setLookPosition(this.attackTarget.posX + (this.entityHost.posX - this.attackTarget.posX) * 2,this.attackTarget.posY + (this.entityHost.posY - this.attackTarget.posY) * 2,this.attackTarget.posZ + (this.entityHost.posZ - this.attackTarget.posZ) * 2, 150.0F, 150.0F);
        this.rangedAttackTime = Math.max(this.rangedAttackTime - 1, 0);

        if (this.rangedAttackTime <= 0)
        {
            if (var1 <= (double)this.field_82642_h && var3)
            {
                this.rangedAttackEntityHost.attackEntityWithRangedAttack(this.attackTarget);
                this.rangedAttackTime = this.maxRangedAttackTime;
            }
        }
    }
}