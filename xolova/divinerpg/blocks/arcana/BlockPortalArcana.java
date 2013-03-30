package xolova.blued00r.divinerpg.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;
import xolova.divinerpg.utils.AchievementPageDivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPortalArcana extends Block
{

	private int firetick;
	private int firemax = 200;

	public BlockPortalArcana(int par1, Material par2Material)
	{
		super(par1, 0, par2Material);
		this.setLightValue(1.0F);
		this.blockIndexInTexture = 183;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		float var5 = 0.0625F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
	}

	/**
	 * if the specified block is in the given AABB, add its collision bounding box to the given list
	 */
	public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random)
	{
		return 0;
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		if (this.firetick == this.firemax && this.firemax != 0)
		{

			if(par5Entity instanceof EntityPlayerMP)
			{
				if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null && !par1World.isRemote)
				{
					EntityPlayerMP var6 = (EntityPlayerMP)par5Entity;

					var6.addStat(AchievementPageDivineRPG.liesWithin, 1);
                    par1World.playSound((double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, "xolovon.ArcanaPortal", 0.5F, ((EntityPlayerMP) par5Entity).getRNG().nextFloat() * 0.4F + 0.8F, false);
					if (var6.dimension != 10)
					{
						var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, DivineRPGTwilight.arcanaID, new TeleporterArcana(var6.mcServer.worldServerForDimension(DivineRPGTwilight.arcanaID)));
					}
					else
					{
						var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, 0, new TeleporterArcana(var6.mcServer.worldServerForDimension(0)));
					}
				}
			}

			this.firetick = 0;
		}
		else
		{
			++this.firetick;
		}
	}

	@SideOnly(Side.CLIENT)

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{

		double var6 = (double)((float)par2 + par5Random.nextFloat());
		double var8 = (double)((float)par3 + 0.8F);
		double var10 = (double)((float)par4 + par5Random.nextFloat());
		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = 0.0D;
		par1World.spawnParticle("smoke", var6, var8, var10, var12, var14, var16);
	}

	@SideOnly(Side.CLIENT)

	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return 0;
	}

	public String getTextureFile()
	{
		return "/Xolovon3.png";
	}
}
