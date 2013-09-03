package net.divinerpg.blocks.overworld;

import java.util.Iterator;
import java.util.List;

import net.divinerpg.blocks.BlockDivinePressurePlate;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockElevantium extends BlockDivinePressurePlate
{
    private EnumMobType triggerMobType;
    
    public BlockElevantium(int par1, int par2, String par3Str, Material par4Material)
    {
        super(par1, par2, par4Material, par3Str);
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate(World par1World)
    {
        return 10;
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if (!par1World.isRemote)
        {
            int l = this.func_94350_c(par1World.getBlockMetadata(par2, par3, par4));

            if (l == 0)
            {
                this.setStateIfMobInteractsWithPlate(par1World, par2, par3, par4, l);
            }
        }
        
        par5Entity.addVelocity(0, 2, 0);
    }

    protected int func_94350_c(int par1)
    {
        return par1;
    }

    protected int func_94355_d(int par1)
    {
        return par1;
    }

    protected int func_94351_d(World par1World, int par2, int par3, int par4)
    {
        List list = null;

        if (this.triggerMobType == EnumMobType.everything)
        {
            list = par1World.getEntitiesWithinAABBExcludingEntity((Entity)null, this.getSensitiveAABB(par2, par3, par4));
        }

        if (this.triggerMobType == EnumMobType.mobs)
        {
            list = par1World.getEntitiesWithinAABB(EntityLiving.class, this.getSensitiveAABB(par2, par3, par4));
        }

        if (this.triggerMobType == EnumMobType.players)
        {
            list = par1World.getEntitiesWithinAABB(EntityPlayer.class, this.getSensitiveAABB(par2, par3, par4));
        }

        if (list != null && !list.isEmpty())
        {
            Iterator iterator = list.iterator();

            while (iterator.hasNext())
            {
                Entity entity = (Entity)iterator.next();

                if (!entity.doesEntityNotTriggerPressurePlate())
                {
                    return 15;
                }
            }
        }

        return 0;
    }

	@Override
	protected int getPlateState(World world, int i, int j, int k) {
		return 0;
	}

	@Override
	protected int getPowerSupply(int i) {
		return 0;
	}

	@Override
	protected int getMetaFromWeight(int i) {
		return 0;
	}
}