package xolova.blued00r.divinerpg.entities.projectile;

import java.util.List;

import xolova.blued00r.divinerpg.entities.mobs.twilight.EntitySerenityBunny;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFirefly extends EntityThrowable implements IProjectile
{
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private int inTile = 0;
    protected boolean inGround = false;
    public int throwableShake = 0;

    /**
     * Is the entity that throws this 'thing' (snowball, ender pearl, eye of ender or potion)
     */
    public EntityLiving thrower;
    private String field_85053_h = null;
    private int ticksInGround;
    private int ticksInAir = 0;
    private EntityLiving target;

    public EntityFirefly(World par1World)
    {
        super(par1World);
        this.setSize(0.25F, 0.25F);
    }

    protected void entityInit() {}

    @SideOnly(Side.CLIENT)

    /**
     * Checks if the entity is in range to render by using the past in distance and comparing it to its average edge
     * length * 64 * renderDistanceWeight Args: distance
     */
    public boolean isInRangeToRenderDist(double par1)
    {
        double var3 = this.boundingBox.getAverageEdgeLength() * 4.0D;
        var3 *= 64.0D;
        return par1 < var3 * var3;
    }

    public EntityFirefly(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World);
        this.thrower = par2EntityLiving;
        this.setSize(0.25F, 0.25F);
        this.setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY + (double)par2EntityLiving.getEyeHeight(), par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.posY -= 0.10000000149011612D;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0F;
        float var3 = 0.4F;
        this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * var3);
        this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * var3);
        this.motionY = (double)(-MathHelper.sin((this.rotationPitch + this.func_70183_g()) / 180.0F * (float)Math.PI) * var3);
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, this.func_70182_d(), 1.0F);
        this.target = this.getNewTarget();
    }

    public EntityFirefly(World par1World, double par2, double par4, double par6)
    {
        super(par1World);
        this.ticksInGround = 0;
        this.setSize(0.25F, 0.25F);
        this.setPosition(par2, par4, par6);
        this.yOffset = 0.0F;
    }

    protected float func_70182_d()
    {
        return 1.5F;
    }

    protected float func_70183_g()
    {
        return 0.0F;
    }

    /**
     * Similar to setArrowHeading, it's point the throwable entity to a x, y, z direction.
     */
    public void setThrowableHeading(double par1, double par3, double par5, float par7, float par8)
    {
        float var9 = MathHelper.sqrt_double(par1 * par1 + par3 * par3 + par5 * par5);
        par1 /= (double)var9;
        par3 /= (double)var9;
        par5 /= (double)var9;
        par1 += this.rand.nextGaussian() * 0.007499999832361937D * (double)par8;
        par3 += this.rand.nextGaussian() * 0.007499999832361937D * (double)par8;
        par5 += this.rand.nextGaussian() * 0.007499999832361937D * (double)par8;
        par1 *= (double)par7;
        par3 *= (double)par7;
        par5 *= (double)par7;
        this.motionX = par1;
        this.motionY = par3;
        this.motionZ = par5;
        float var10 = MathHelper.sqrt_double(par1 * par1 + par5 * par5);
        this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(par1, par5) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(par3, (double)var10) * 180.0D / Math.PI);
        this.ticksInGround = 0;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    public void setVelocity(double par1, double par3, double par5)
    {
        this.motionX = par1;
        this.motionY = par3;
        this.motionZ = par5;

        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float var7 = MathHelper.sqrt_double(par1 * par1 + par5 * par5);
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(par1, par5) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(par3, (double)var7) * 180.0D / Math.PI);
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();

        if (this.throwableShake > 0)
        {
            --this.throwableShake;
        }

        if (this.inGround)
        {
            int var1 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);

            if (var1 == this.inTile)
            {
                ++this.ticksInGround;

                if (this.ticksInGround == 1200)
                {
                    this.setDead();
                }

                return;
            }

            this.inGround = false;
            this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionZ *= (double)(2F);
            this.ticksInGround = 0;
            this.ticksInAir = 0;
        }
        else
        {
            ++this.ticksInAir;

            if (this.target != null)
            {
                if ((this.posX - this.target.posX) < (0.1 - this.target.width))
                {
                    this.motionX = (double)(0.2F);
                }
                else if ((this.posX - this.target.posX) > (this.target.width - 0.1))
                {
                    this.motionX = (double)(-0.2F);
                }
                else
                {
                    this.motionX = (double)(0F);
                }

                if ((this.posY - this.target.posY + (this.target.height / 2)) < 0.1)
                {
                    this.motionY = (double)(0.2F);
                }
                else if ((this.posY - this.target.posY + (this.target.height / 2)) > this.target.height - 0.1)
                {
                    this.motionY = (double)(-0.2F);
                }
                else
                {
                    this.motionY = (double)(0F);
                }

                if ((this.posZ - this.target.posZ) < (0.1 - this.target.width))
                {
                    this.motionZ = (double)(0.2F);
                }
                else if ((this.posZ - this.target.posZ) > (this.target.width - 0.1))
                {
                    this.motionZ = (double)(-0.2F);
                }
                else
                {
                    this.motionZ = (double)(0F);
                }
            }
            else
            {
                this.target = this.getNewTarget();

                if (this.target == null)
                {
                    this.setDead();
                }
            }
        }

        Vec3 var16 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
        Vec3 var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        MovingObjectPosition var3 = this.worldObj.rayTraceBlocks(var16, var2);
        var16 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
        var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (var3 != null)
        {
            var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(var3.hitVec.xCoord, var3.hitVec.yCoord, var3.hitVec.zCoord);
        }

        if (!this.worldObj.isRemote)
        {
            Entity var4 = null;
            List var5 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double var6 = 0.0D;
            EntityLiving var8 = this.func_85052_h();

            for (int var9 = 0; var9 < var5.size(); ++var9)
            {
                Entity var10 = (Entity)var5.get(var9);

                if (var10.canBeCollidedWith() && (var10 != var8 || this.ticksInAir >= 5))
                {
                    float var11 = 0.3F;
                    AxisAlignedBB var12 = var10.boundingBox.expand((double)var11, (double)var11, (double)var11);
                    MovingObjectPosition var13 = var12.calculateIntercept(var16, var2);

                    if (var13 != null)
                    {
                        double var14 = var16.distanceTo(var13.hitVec);

                        if (var14 < var6 || var6 == 0.0D)
                        {
                            var4 = var10;
                            var6 = var14;
                        }
                    }
                }
            }

            if (var4 != null)
            {
                var3 = new MovingObjectPosition(var4);
            }
        }

        if (var3 != null)
        {
            if (var3.typeOfHit == EnumMovingObjectType.TILE && this.worldObj.getBlockId(var3.blockX, var3.blockY, var3.blockZ) == Block.portal.blockID)
            {
                this.setInPortal();
            }
            else
            {
                this.onImpact(var3);
            }
        }

        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
        float var17 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

        for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var17) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
        {
            ;
        }

        while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
        {
            this.prevRotationPitch += 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw < -180.0F)
        {
            this.prevRotationYaw -= 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
        {
            this.prevRotationYaw += 360.0F;
        }

        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
        float var18 = 0.99F;
        float var19 = this.getGravityVelocity();

        if (this.isInWater())
        {
            for (int var7 = 0; var7 < 4; ++var7)
            {
                float var20 = 0.25F;
                this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)var20, this.posY - this.motionY * (double)var20, this.posZ - this.motionZ * (double)var20, this.motionX, this.motionY, this.motionZ);
            }

            var18 = 0.8F;
        }

        this.motionX *= (double)var18;
        this.motionY *= (double)var18;
        this.motionZ *= (double)var18;
        this.motionY -= (double)var19;
        this.setPosition(this.posX, this.posY, this.posZ);
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    protected float getGravityVelocity()
    {
        return 0.03F;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.func_85052_h()), 10);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        par1NBTTagCompound.setShort("xTile", (short)this.xTile);
        par1NBTTagCompound.setShort("yTile", (short)this.yTile);
        par1NBTTagCompound.setShort("zTile", (short)this.zTile);
        par1NBTTagCompound.setByte("inTile", (byte)this.inTile);
        par1NBTTagCompound.setByte("shake", (byte)this.throwableShake);
        par1NBTTagCompound.setByte("inGround", (byte)(this.inGround ? 1 : 0));

        if ((this.field_85053_h == null || this.field_85053_h.length() == 0) && this.thrower != null && this.thrower instanceof EntityPlayer)
        {
            this.field_85053_h = this.thrower.getEntityName();
        }

        par1NBTTagCompound.setString("ownerName", this.field_85053_h == null ? "" : this.field_85053_h);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        this.xTile = par1NBTTagCompound.getShort("xTile");
        this.yTile = par1NBTTagCompound.getShort("yTile");
        this.zTile = par1NBTTagCompound.getShort("zTile");
        this.inTile = par1NBTTagCompound.getByte("inTile") & 255;
        this.throwableShake = par1NBTTagCompound.getByte("shake") & 255;
        this.inGround = par1NBTTagCompound.getByte("inGround") == 1;
        this.field_85053_h = par1NBTTagCompound.getString("ownerName");

        if (this.field_85053_h != null && this.field_85053_h.length() == 0)
        {
            this.field_85053_h = null;
        }
    }

    @SideOnly(Side.CLIENT)
    public float getShadowSize()
    {
        return 0.0F;
    }

    public EntityLiving func_85052_h()
    {
        if (this.thrower == null && this.field_85053_h != null && this.field_85053_h.length() > 0)
        {
            this.thrower = this.worldObj.getPlayerEntityByName(this.field_85053_h);
        }

        return this.thrower;
    }

    private EntityLiving getNewTarget()
    {
        double par1 = this.posX;
        double par3 = this.posY;
        double par5 = this.posZ;
        double par7 = 16;
        double var9 = -1.0D;
        EntityLiving var11 = null;
        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(16.0D, 16.0D, 16.0D));

        for (int var12 = 0; var12 < list.size(); ++var12)
        {
            Entity var13 = (Entity)list.get(var12);
            double var14 = var13.getDistanceSq(par1, par3, par5);
            boolean var15 = false;
            
            if (var13 == null || var13 == this.thrower)
            {
            	var15 = true;
            }
            
            if ((par7 < 0.0D || var14 < par7 * par7) && (var9 == -1.0D || var14 < var9) && var13 instanceof EntityLiving && !var15)
            {
                var9 = var14;
                var11 = (EntityLiving) var13;
            }
        }

        return var11;
    }
}
