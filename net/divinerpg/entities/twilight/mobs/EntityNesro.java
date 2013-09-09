package net.divinerpg.entities.twilight.mobs;

import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityNesro extends EntityZombie
{
    private int slimeJumpDelay = 0;

    public EntityNesro(World var1)
    {
        super(var1);
        this.yOffset = 0.0F;
        this.slimeJumpDelay = this.rand.nextInt(20) + 10;
    }
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(800);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(20);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(64F);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.23F);
    }
    

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 10; //TODO: Fix armor value
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        super.onLivingUpdate();
    }

    protected int getJumpDelay()
    {
        return this.rand.nextInt(20) + 10;
    }

    protected void updateEntityActionState()
    {
        this.despawnEntity();
        EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 16.0D);

        if (var1 != null)
        {
            this.faceEntity(var1, 10.0F, 20.0F);
        }

        if (this.onGround && this.slimeJumpDelay-- <= 0)
        {
            this.slimeJumpDelay = this.getJumpDelay();

            if (var1 != null)
            {
                this.slimeJumpDelay /= 3;
            }

            this.isJumping = true;
            this.moveStrafing = 1.0F - this.rand.nextFloat() * 2.0F;
            this.moveForward = 1.0F;
        }
        else
        {
            this.isJumping = false;

            if (this.onGround)
            {
                this.moveStrafing = this.moveForward = 0.0F;
            }
        }
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.nesro";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.nesroHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.nesroHit";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return TwilightItemHelper.DraviteSoul.itemID;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
}
