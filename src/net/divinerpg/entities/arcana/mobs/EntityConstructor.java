package net.divinerpg.entities.arcana.mobs;

import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityConstructor extends EntityZombie
{
    int angerLevel;
    public EntityConstructor(World par1World)
    {
        super(par1World);
        this.setSize(0.5F, 1.9F);
        this.angerLevel = 0;
        this.stepHeight = 1.0F;
    }

    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(100);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(25);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.23F);
    }    
    public void setMoveSpeed(float speed) {
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(speed); // SET attribute Movespeed
    }
    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {                    
        setMoveSpeed(0.23F);
        if (this.entityToAttack != null)
        {
            this.faceEntity(this.entityToAttack, 100.0F, 100.0F);
        }

        if (!this.worldObj.isRemote && this.isEntityAlive())
        {
            if (this.entityToAttack != null)
            {
                if (this.entityToAttack instanceof EntityPlayer && this.angerLevel < 3)
                {
                    this.moveStrafing = this.moveForward = 0.0F;
                    setMoveSpeed(0F);
                }
            }
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.dungeonConstructorHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        switch (this.rand.nextInt(4))
        {
        case 0:
        	return ArcanaItemHelper.key1.itemID;
        case 1:
        	return ArcanaItemHelper.key2.itemID;
        case 2:
        	return ArcanaItemHelper.key3.itemID;
        case 3:
        	return ArcanaItemHelper.key4.itemID;
        }
        
        return 0;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    public void teleportToEntity(Entity par1Entity, int x, int y, int z)
    {
        this.setPosition(par1Entity.posX, par1Entity.posY, par1Entity.posZ);
        this.findPlayerToAttack();
    }
    
    @Override
    protected boolean isValidLightLevel()
    {        
        return true;
    }
    
    
    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 40.0D && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty();
    }
    
    public boolean attackEntityAsMob(Entity par1Entity)
    {
		this.worldObj.playSoundAtEntity(this, "mob.RPG.dungeonConstructorPunch", 1.0F, 1.0F);
    	return super.attackEntityAsMob(par1Entity);
    }
}
