package xolova.divinerpg.entities.twilight.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.item.TwilightItemHelper;

public class EntityMythrilArcher extends EntityTwilightArcher
{
    private static final ItemStack defaultHeldItem = new ItemStack(TwilightItemHelper.MythrilBow, 1);

    public EntityMythrilArcher(World var1)
    {
        super(var1);
        this.texture = "/mob/mythrilArcher.png";
        this.moveSpeed = 0.25F;
        this.setSize(2.0F, 5.0F);
    }

    public int getAttackStrength(Entity var1)
    {
        return 30;
    }

    public int getMaxHealth()
    {
        return 430;
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
        return "mob.RPG.Archer";
    }

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.highhit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.highhit";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return TwilightItemHelper.MythrilSoul.itemID;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
}
