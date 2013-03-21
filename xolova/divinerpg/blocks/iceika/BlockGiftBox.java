package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntitySerenityChest;
import xolova.blued00r.divinerpg.entities.tileentities.TileEntitySkeletonChest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGiftBox extends BlockContainer
{
	private Random random = new Random();

	public BlockGiftBox(int var1)
	{
		super(var1, Material.wood);
		this.blockIndexInTexture = 198;
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	public void onBlockAdded(World var1, int var2, int var3, int var4)
	{
		super.onBlockAdded(var1, var2, var3, var4);
		this.setDefaultDirection(var1, var2, var3, var4);
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
	 */
	public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
	{
		if (var5 == 1)
		{
			return 197;
		}
		else if (var5 == 0)
		{
			return 197;
		}
		else
		{
			int var6 = var1.getBlockMetadata(var2, var3, var4);
			return var5 != var6 ? this.blockIndexInTexture : this.blockIndexInTexture;
		}
	}

	/**
	 * Returns the block texture based on the side being looked at.  Args: side
	 */
	public int getBlockTextureFromSide(int var1)
	{
		return var1 == 1 ? 197 : (var1 == 0 ? 197 : (var1 == 3 ? this.blockIndexInTexture : this.blockIndexInTexture));
	}

	private void setDefaultDirection(World var1, int var2, int var3, int var4)
	{
		if (!var1.isRemote)
		{
			int var5 = var1.getBlockId(var2, var3, var4 - 1);
			int var6 = var1.getBlockId(var2, var3, var4 + 1);
			int var7 = var1.getBlockId(var2 - 1, var3, var4);
			int var8 = var1.getBlockId(var2 + 1, var3, var4);
			byte var9 = 3;

			if (Block.opaqueCubeLookup[var5] && !Block.opaqueCubeLookup[var6])
			{
				var9 = 3;
			}

			if (Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var5])
			{
				var9 = 2;
			}

			if (Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var8])
			{
				var9 = 5;
			}

			if (Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var7])
			{
				var9 = 4;
			}

			var1.setBlockMetadataWithNotify(var2, var3, var4, var9);
		}
	}

	/**
	 * Called when the block is placed in the world.
	 */
	 public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
	{
		byte var6 = 0;
		int var7 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (var7 == 0)
		{
			var6 = 2;
		}

		if (var7 == 1)
		{
			var6 = 5;
		}

		if (var7 == 2)
		{
			var6 = 3;
		}

		if (var7 == 3)
		{
			var6 = 4;
		}

		var1.setBlockMetadataWithNotify(var2, var3, var4, var6);
	}

	 /**
	  * ejects contained items into the world, and notifies neighbours of an update, as appropriate
	  */
	 public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
	 {
		 TileEntitySkeletonChest var7 = (TileEntitySkeletonChest)var1.getBlockTileEntity(var2, var3, var4);

		 if (var7 != null)
		 {
			 for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
			 {
				 ItemStack var9 = var7.getStackInSlot(var8);

				 if (var9 != null)
				 {
					 float var10 = this.random.nextFloat() * 0.8F + 0.1F;
					 float var11 = this.random.nextFloat() * 0.8F + 0.1F;
					 EntityItem var12;

					 for (float var13 = this.random.nextFloat() * 0.8F + 0.1F; var9.stackSize > 0; var1.spawnEntityInWorld(var12))
					 {
						 int var14 = this.random.nextInt(21) + 10;

						 if (var14 > var9.stackSize)
						 {
							 var14 = var9.stackSize;
						 }

						 var9.stackSize -= var14;
						 var12 = new EntityItem(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var13), new ItemStack(var9.itemID, var14, var9.getItemDamage()));
						 float var15 = 0.05F;
						 var12.motionX = (double)((float)this.random.nextGaussian() * var15);
						 var12.motionY = (double)((float)this.random.nextGaussian() * var15 + 0.2F);
						 var12.motionZ = (double)((float)this.random.nextGaussian() * var15);

						 if (var9.hasTagCompound())
						 {
							 var12.getEntityItem().setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
						 }
					 }
				 }
			 }
		 }

		 super.breakBlock(var1, var2, var3, var4, var5, var6);
	 }

	 /**
	  * Called upon block activation (right click on the block.)
	  */
	 public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
	 {
		 if (var1.isRemote)
		 {
			 return true;
		 }
		 else
		 {
			 var5.displayGUIChest((TileEntitySkeletonChest)var1.getBlockTileEntity(var2, var3, var4));
			 return true;
		 }

	 }

	 /**
	  * Returns a new instance of a block's tile entity class. Called on placing the block.
	  */
	 public TileEntity createNewTileEntity(World var1)
	 {
		 return new TileEntitySkeletonChest();
	 }
}
