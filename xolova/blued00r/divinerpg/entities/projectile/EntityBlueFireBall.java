package xolova.blued00r.divinerpg.entities.projectile;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityBlueFireBall extends EntityFireball
{
    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    private int inTile = 0;
    private boolean inGround = false;
    public EntityLiving shootingEntity;
    private int ticksAlive;
    private int ticksInAir = 0;
    public double accelerationX;
    public double accelerationY;
    public double accelerationZ;

    public EntityBlueFireBall(World par1World)
    {
        super(par1World);
        this.setSize(0.3125F, 0.3125F);
    }

    public EntityBlueFireBall(World par1World, double par2, double par4, double par6, double par8, double par10, double par12)
    {
        super(par1World);
        this.setSize(1.0F, 1.0F);
        this.setLocationAndAngles(par2, par4, par6, this.rotationYaw, this.rotationPitch);
        this.setPosition(par2, par4, par6);
        double var14 = (double)MathHelper.sqrt_double(par8 * par8 + par10 * par10 + par12 * par12);
        this.accelerationX = par8 / var14 * 0.1D;
        this.accelerationY = par10 / var14 * 0.1D;
        this.accelerationZ = par12 / var14 * 0.1D;
    }

    public EntityBlueFireBall(World par1World, EntityLiving par2EntityLiving, double par3, double par5, double par7)
    {
        super(par1World);
        this.shootingEntity = par2EntityLiving;
        this.setSize(1.0F, 1.0F);
        this.setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY, par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0F;
        this.motionX = this.motionY = this.motionZ = 0.0D;
        double var9 = (double)MathHelper.sqrt_double(par3 * par3 + par5 * par5 + par7 * par7);
        this.accelerationX = par3 / var9 * 0.1D;
        this.accelerationY = par5 / var9 * 0.1D;
        this.accelerationZ = par7 / var9 * 0.1D;
    }

    protected void entityInit() {}

    /**
     * Checks if the entity is in range to render by using the past in distance and comparing it to its average edge
     * length * 64 * renderDistanceWeight Args: distance
     */
    public boolean isInRangeToRenderDist(double var1)
    {
        double var3 = this.boundingBox.getAverageEdgeLength() * 4.0D;
        var3 *= 64.0D;
        return var1 < var3 * var3;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (!this.worldObj.isRemote && (this.shootingEntity != null && this.shootingEntity.isDead || !this.worldObj.blockExists((int)this.posX, (int)this.posY, (int)this.posZ)))
        {
            this.setDead();
        }
        else
        {
            super.onUpdate();
            this.setFire(1);

            if (this.inGround)
            {
                int var1 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);

                if (var1 == this.inTile)
                {
                    ++this.ticksAlive;

                    if (this.ticksAlive == 600)
                    {
                        this.setDead();
                    }

                    return;
                }

                this.inGround = false;
                this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
                this.ticksAlive = 0;
                this.ticksInAir = 0;
            }
            else
            {
                ++this.ticksInAir;
            }
            
            if (this.ticksInAir == 6)
            {
            	this.posY -= 1.0D;
            }

            Vec3 var15 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
            Vec3 var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition var3 = this.worldObj.rayTraceBlocks(var15, var2);
            var15 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
            var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

            if (var3 != null)
            {
                var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(var3.hitVec.xCoord, var3.hitVec.yCoord, var3.hitVec.zCoord);
            }

            Entity var4 = null;
            List var5 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double var6 = 0.0D;

            for (int var8 = 0; var8 < var5.size(); ++var8)
            {
                Entity var9 = (Entity)var5.get(var8);

                if (var9.canBeCollidedWith() && (!var9.isEntityEqual(this.shootingEntity)))
                {
                    float var10 = 0.3F;
                    AxisAlignedBB var11 = var9.boundingBox.expand((double)var10, (double)var10, (double)var10);
                    MovingObjectPosition var12 = var11.calculateIntercept(var15, var2);

                    if (var12 != null)
                    {
                        double var13 = var15.distanceTo(var12.hitVec);

                        if (var13 < var6 || var6 == 0.0D)
                        {
                            var4 = var9;
                            var6 = var13;
                        }
                    }
                }
            }

            if (var4 != null)
            {
                var3 = new MovingObjectPosition(var4);
            }
            else
            {
                var3 = null;
            }

            if (var3 != null)
            {
                this.onImpact(var3);
            }

            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            float var16 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

            for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var16) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
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
            float var17 = 0.95F;

            if (this.isInWater())
            {
                for (int var19 = 0; var19 < 4; ++var19)
                {
                    float var18 = 0.25F;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)var18, this.posY - this.motionY * (double)var18, this.posZ - this.motionZ * (double)var18, this.motionX, this.motionY, this.motionZ);
                }

                var17 = 0.8F;
            }

            this.motionX += this.accelerationX;
            this.motionY += this.accelerationY;
            this.motionZ += this.accelerationZ;
            this.motionX *= (double)var17;
            this.motionY *= (double)var17;
            this.motionZ *= (double)var17;
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (!this.worldObj.isRemote)
        {
            int var2 = par1MovingObjectPosition.blockX;
            int var3 = par1MovingObjectPosition.blockY;
            int var4 = par1MovingObjectPosition.blockZ;

            switch (par1MovingObjectPosition.sideHit)
            {
                case 0:
                    --var3;
                    break;

                case 1:
                    ++var3;
                    break;

                case 2:
                    --var4;
                    break;

                case 3:
                    ++var4;
                    break;

                case 4:
                    --var2;
                    break;

                case 5:
                    ++var2;
            }

            if (this.worldObj.isAirBlock(var2, var3, var4))
            {
                this.worldObj.setBlockWithNotify(var2, var3, var4, Block.fire.blockID);
            }

            this.setDead();
        }
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        var1.setShort("xTile", (short)this.xTile);
        var1.setShort("yTile", (short)this.yTile);
        var1.setShort("zTile", (short)this.zTile);
        var1.setByte("inTile", (byte)this.inTile);
        var1.setByte("inGround", (byte)(this.inGround ? 1 : 0));
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        this.xTile = var1.getShort("xTile");
        this.yTile = var1.getShort("yTile");
        this.zTile = var1.getShort("zTile");
        this.inTile = var1.getByte("inTile") & 255;
        this.inGround = var1.getByte("inGround") == 1;
    }

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return false;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        this.setBeenAttacked();

        if (var1.getEntity() != null)
        {
            Vec3 var3 = var1.getEntity().getLookVec();

            if (var3 != null)
            {
                this.motionX = var3.xCoord;
                this.motionY = var3.yCoord;
                this.motionZ = var3.zCoord;
                this.accelerationX = this.motionX * 0.1D;
                this.accelerationY = this.motionY * 0.1D;
                this.accelerationZ = this.motionZ * 0.1D;
            }

            if (var1.getEntity() instanceof EntityLiving)
            {
                this.shootingEntity = (EntityLiving)var1.getEntity();
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    public float getShadowSize()
    {
        return 0.0F;
    }

    /**
     * Gets how bright this entity is.
     */
    public float getBrightness(float var1)
    {
        return 1.0F;
    }

    public int getBrightnessForRender(float var1)
    {
        return 15728880;
    }
}
