package xolova.divinerpg.entities.iceika.projectile;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xolova.divinerpg.entities.core.EntityDamageProjectile;
import xolova.divinerpg.renders.RenderBlock.IBlockRender;

public class EntityIce extends EntityDamageProjectile implements IBlockRender {

	public EntityIce(World var1, EntityLiving var2) {
		super(var1, var2, 0);
	}
	
    public EntityIce(World world) {
    	super(world, 16);
    }
    
	@Override
	protected void onImpact(MovingObjectPosition pos) {
		super.onImpact(pos);
		if(pos.entityHit != null && pos.entityHit instanceof EntityLiving && pos.entityHit != getThrower())
			((EntityLiving) pos.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 90, 0));
	}

	@Override
	public int getBlockID() {
		return Block.ice.blockID;
	}

	@Override
	public int getBlockMeta() {
		return 0;
	}

	@Override
	public float getBlockScale() {
		return 0.5F;
	}

}
