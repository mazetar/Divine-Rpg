package net.divinerpg.blocks.arcana.plants;

import java.util.Random;

import net.divinerpg.blocks.core.BlockDivine;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPinfly extends BlockDivine implements IPlantable
{
	public BlockPinfly(int ID)
	{
		super(ID, Material.plants);
		float size = 0.375F;
		this.setBlockBounds(0.5F - size, 0.0F, 0.5F - size, 0.5F + size, 1.0F, 0.5F + size);
		this.setTickRandomly(true);
	}

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{

	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if(blockID == ArcanaBlockHelper.pinFly.blockID)
		{
			par1World.setBlock(par2, par3 + 1, par4, ArcanaBlockHelper.pinFly2.blockID);
		}
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{
		this.checkBlockCoordValid(par1World, par2, par3, par4);
	}

	/**
	 * Checks if current block pos is valid, if not, breaks the block as dropable item. Used for reed and cactus.
	 */
	protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4)
	{
		if (!this.canBlockStay(par1World, par2, par3, par4))
		{
			this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
			par1World.setBlock(par2, par3, par4, 0);
		}
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int par1, Random par2Random, int par3)
	{
		if(blockID == ArcanaBlockHelper.pinFly2.blockID)
		{
			return ArcanaItemHelper.pinFlyItem.itemID;
		}
		return 0;
	}
	
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 3;
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
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * The type of render function that is called for this block
	 */
	public int getRenderType()
	{
		return 1;
	}

	@SideOnly(Side.CLIENT)

	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ArcanaItemHelper.pinFlyItem.itemID;
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z)
	{
		return EnumPlantType.Beach;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z)
	{
		return blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z)
	{
		return world.getBlockMetadata(x, y, z);
	}
	
	public int getSheet(int side, int metadata) {
		return 4;
	}
}
