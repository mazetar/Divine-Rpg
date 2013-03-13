package xolova.blued00r.divinerpg.entities.mobs.bosses;

import xolova.blued00r.divinerpg.DivineRPG;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAyeracoPurple extends EntityAyeraco
{
	private EntityAyeraco aGreen;
	private EntityAyeraco aBlue;
	private EntityAyeraco aRed;
	private EntityAyeraco aYellow;
	
	private int beamX;
	private int beamY;
	private int beamZ;
	
	public EntityAyeracoPurple (World par1World)
	{
		super (par1World, "/mob/AyeracoPurple.png", "Purple");
	}
	
	public void initOthers (EntityAyeraco par2, EntityAyeraco par3, EntityAyeraco par4, EntityAyeraco par5)
	{
		this.aGreen = par2;
		this.aBlue = par3;
		this.aRed = par4;
		this.aYellow = par5;
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
	
	protected boolean canTeleport()
	{
		return true;
	}
	
    protected void dropRareDrop(int par1) 
    {
		this.dropItem(DivineRPG.enderSword.itemID, 1);
    }
}