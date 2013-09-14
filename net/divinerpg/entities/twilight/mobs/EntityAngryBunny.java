package net.divinerpg.entities.twilight.mobs;

import java.util.List;

import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAngryBunny extends EntityTameable
{
    public EntityAngryBunny(World var1)
    {
        super(var1);
        this.setSize(1F, 1.5F);
        this.experienceValue = 40;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, this.getMoveSpeed(), true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.getMoveSpeed()));
        this.tasks.addTask(5, new EntityAIFollowOwner(this, this.getMoveSpeed(), 10.0F, 2.0F));
        this.tasks.addTask(6, new EntityAIMate(this, this.getMoveSpeed()));
        this.tasks.addTask(7, new EntityAIWander(this, this.getMoveSpeed()));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntityPlayer.class, 200, false));
        if ( this.func_110148_a(SharedMonsterAttributes.field_111264_e) == null) {
          this.func_110140_aT().func_111150_b(SharedMonsterAttributes.field_111264_e).func_111128_a(10); // Attack dmg
        }
    }

    public EntityAngryBunny(World var1, boolean tamed, String ownerName)
    {
    	this(var1);
    	this.setTamed(tamed);
        this.setOwner(ownerName);
    } 
    public double getMoveSpeed() {
        return this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); // GET attribute Movespeed
    }
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(this.isTamed() ? 60 : 280);
 //       this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(10 /*this.isTamed() ? 10 : 35*/);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(16.0F);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3F);
    }
  
    /**
     * Returns true if the newer Entity AI code should be run
     */
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return !this.isTamed();
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        if (!this.worldObj.isRemote && this.isTamed() && (this.getAttackTarget() == null || this.getAttackTarget().isDead))
        {
            EntitySerenityBunny var2 = new EntitySerenityBunny(this.worldObj, true, this.getOwnerName());
            var2.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(var2);
            this.setDead();
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        int var2 = (int) this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e();
        return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), var2);
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        Entity var3 = var1.getEntity();

        if (var3 instanceof EntityPlayer)
        {
            List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

            for (int var5 = 0; var5 < var4.size(); ++var5)
            {
                Entity var6 = (Entity)var4.get(var5);

                if (var6 instanceof EntityAngryBunny)
                {
                	EntityAngryBunny var7 = (EntityAngryBunny)var6;
                }
            }

            this.becomeAngryAt(var3);
        }

        return super.attackEntityFrom(var1, var2);
    }

    private void becomeAngryAt(Entity var1)
    {
        this.entityToAttack = var1;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.hiss";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.growlhit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.growlhit";
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        if (!this.isTamed())
        {
        	int var3 = this.rand.nextInt(2 + var2);

            for (int var4 = 0; var4 < var3; ++var4)
            {
                this.dropItem(TwilightItemHelper.DraviteSoul.itemID, 1);
            }
        }
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return TwilightItemHelper.AugiteSoul.itemID;
    }

	@Override
	public EntityAgeable createChild(EntityAgeable var1) 
	{
		return null;
	}
}
