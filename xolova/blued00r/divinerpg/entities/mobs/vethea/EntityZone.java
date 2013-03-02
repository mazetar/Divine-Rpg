
package xolova.blued00r.divinerpg.entities.mobs.vethea;

import xolova.blued00r.divinerpg.entities.mobs.projectile.EntityMamormeterShot;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityZone extends EntityMob implements IRangedAttackMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(Item.bow, 1);
	private int special;

    public EntityZone(World par1World)
    {
        super(par1World);
        this.texture = "/mob/aridwarrior.png";
        this.moveSpeed = 0.25F;    
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
        this.tasks.addTask(5, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));  
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 64.0F, 0, true));
    }
    
    protected void updateAITasks()
    {	
    	if (this.special > 0 && this.getAttackTarget() != null)
    	{
    		this.special--;
    		if (this.special % 2 == 0)
    		{
    			this.attackEntityWithRangedAttack(this.getAttackTarget());
                this.rotationYaw += 360 / (25 / 2);
    		}
    	}
    	else
    	{
        	super.updateAITasks();
    	}
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.AridWarrior";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.AridWarriorHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.AridWarriorHit";
    }

    public int getAttackStrength(Entity entity)
    {
        return 0;
    }
    
    public int getMaxHealth()
    {
        return 1;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLiving par1)
    {
    	EntityArrow var1 = new EntityArrow(this.worldObj, this, 1.6F);
    	var1.setDamage(0);
    	
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var1);
    }

    public boolean attackEntityAsMob(Entity par1Entity)
    {
        int var2 = this.getAttackStrength(par1Entity);

        if (this.isPotionActive(Potion.damageBoost))
        {
            var2 += 3 << this.getActivePotionEffect(Potion.damageBoost).getAmplifier();
        }

        if (this.isPotionActive(Potion.weakness))
        {
            var2 -= 2 << this.getActivePotionEffect(Potion.weakness).getAmplifier();
        }

        int var3 = 0;

        if (par1Entity instanceof EntityLiving)
        {
            var2 += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLiving)par1Entity);
            var3 += EnchantmentHelper.getKnockbackModifier(this, (EntityLiving)par1Entity);
            this.special = 25;
        }

        boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), var2);

        if (var4)
        {
            if (var3 > 0)
            {
                par1Entity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F));
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            int var5 = EnchantmentHelper.getFireAspectModifier(this);

            if (var5 > 0)
            {
                par1Entity.setFire(var5 * 4);
            }
        }

        return var4;
    }
}