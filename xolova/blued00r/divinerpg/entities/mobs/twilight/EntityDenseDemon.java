package xolova.blued00r.divinerpg.entities.mobs.twilight;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityDenseDemon extends EntityZombie
{
    public EntityDenseDemon(World var1)
    {
        super(var1);
        this.texture = "/mob/densedemon.png";
        this.moveSpeed = 0.23F;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture's file path as a String.
     */
    public String getTexture()
    {
        return this.isVillager() ? "/mob/densedemon.png" : "/mob/densedemon.png";
    }

    public int getAttackStrength(Entity var1)
    {
        return 30;
    }

    public int getMaxHealth()
    {
        return 900;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 10;
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

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.DemonOfDarkness";
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
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.denseSoul.itemID;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
}
