package xolova.blued00r.divinerpg.entities.mobs.bosses;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAyeracoBlue extends EntityAyeraco
{
	private EntityAyeraco aGreen;
	private EntityAyeraco aRed;
	private EntityAyeraco aYellow;
	private EntityAyeraco aPurple;
	
	private int beamX;
	private int beamY;
	private int beamZ;
	
	public EntityAyeracoBlue (World par1World)
	{
		super (par1World, "/mob/AyeracoBlue.png", "Blue");
	}
	
	public void initOthers (EntityAyeraco par2, EntityAyeraco par3, EntityAyeraco par4, EntityAyeraco par5)
	{
		this.aGreen = par2;
		this.aRed = par3;
		this.aYellow = par4;
		this.aPurple = par5;
	}
	
	public void setBeamLocation(int x, int y, int z)
	{
		beamX = x;
		beamY = y;
		beamZ = z;
	}

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource par1DamageSource)
    {
    	super.onDeath(par1DamageSource);
    	this.worldObj.setBlockWithNotify(beamX, beamY, beamZ, 0);
    }

	protected boolean canBlockProjectiles()
	{
		if (this.aGreen != null && this.aGreen.abilityActive())
		{
			return true;
		}
		return false;
	}
	
	
	
	protected void tickAbility()
	{
		this.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
		if (this.aGreen != null && !this.aGreen.isDead)
		{
			aGreen.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
		}
		if (this.aYellow != null && !this.aYellow.isDead)
		{
			aYellow.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
		}
		if (this.aRed != null && !this.aRed.isDead)
		{
			aRed.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
		}
		if (this.aPurple != null && !this.aPurple.isDead)
		{
			aPurple.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
		}
	}
	
	protected boolean canTeleport()
	{
		if (this.aPurple != null && this.aPurple.abilityActive())
		{
			return true;
		}
		return false;
	}
	
    protected void dropRareDrop(int par1) 
    {
		this.dropItem(DivineRPG.enderSwordBlue.itemID, 1);
    }
}