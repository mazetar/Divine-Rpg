package xolova.divinerpg.entities.overworld.projectile;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDeathSeranade extends EntityThrowable
{
    private int potionDamage;

    public EntityDeathSeranade(World var1)
    {
        super(var1);
    }

    public EntityDeathSeranade(World var1, EntityLiving var2, int var3)
    {
        super(var1, var2);
        this.potionDamage = var3;
    }

    public EntityDeathSeranade(World var1, double var2, double var4, double var6, int var8)
    {
        super(var1, var2, var4, var6);
        this.potionDamage = var8;
    }

    public int getPotionDamage()
    {
        return this.potionDamage;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 4;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = 4;
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2))
            {
                boolean var15 = true;
            }
        }

        if (!this.worldObj.isRemote)
        {
            List var16 = Item.potion.getEffects(this.potionDamage);

            if (var16 != null && !var16.isEmpty())
            {
                AxisAlignedBB var3 = this.boundingBox.expand(1.0D, 1.0D, 1.0D);
                List var4 = this.worldObj.getEntitiesWithinAABB(EntityLiving.class, var3);

                if (var4 != null && !var4.isEmpty())
                {
                    Iterator var5 = var4.iterator();

                    while (var5.hasNext())
                    {
                        Entity var6 = (Entity)var5.next();
                        double var7 = this.getDistanceSqToEntity(var6);

                        if (var7 < 16.0D)
                        {
                            double var9 = 1.0D - Math.sqrt(var7) / 1.0D;

                            if (var6 == var1.entityHit)
                            {
                                var9 = 1.0D;
                            }

                            Iterator var11 = var16.iterator();

                            while (var11.hasNext())
                            {
                                PotionEffect var12 = (PotionEffect)var11.next();
                                int var13 = var12.getPotionID();

                                if (Potion.potionTypes[var13].isInstant())
                                {
                                    Potion.potionTypes[var13].affectEntity(this.getThrower(), (EntityLiving)var6, var12.getAmplifier(), var9);
                                }
                                else
                                {
                                    int var14 = (int)(var9 * (double)var12.getDuration() + 0.5D);

                                    if (var14 > 20)
                                    {
                                        ((EntityLiving)var6).addPotionEffect(new PotionEffect(var13, var14, var12.getAmplifier()));
                                    }
                                }
                            }
                        }
                    }
                }
            }

            this.setDead();
        }
    }
}
