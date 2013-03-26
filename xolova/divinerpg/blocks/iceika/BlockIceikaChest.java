package xolova.blued00r.divinerpg.blocks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPGTwilight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIceikaChest extends BlockContainer
{
	private Random random = new Random();

	public BlockIceikaChest(int var1)
	{
		super(var1, Material.wood);
		this.blockIndexInTexture = 205;
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
	 */
	public int getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
	{
		if (var5 == 1)
		{
			return 204;
		}
		else if (var5 == 0)
		{
			return 204;
		}
		else
		{
			int var6 = var1.getBlockMetadata(var2, var3, var4);
			return var5 != var6 ? this.blockIndexInTexture : this.blockIndexInTexture + 1;
		}
	}

	/**
	 * Returns the block texture based on the side being looked at.  Args: side
	 */
	public int getBlockTextureFromSide(int var1)
	{
		return var1 == 1 ? 204 : (var1 == 0 ? 204 : (var1 == 3 ? this.blockIndexInTexture + 1 : this.blockIndexInTexture));
	}

	/**
	 * ejects contained items into the world, and notifies neighbours of an update, as appropriate
	 */
	public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
	{
		TileEntityIceikaChest var7 = (TileEntityIceikaChest)var1.getBlockTileEntity(var2, var3, var4);
		
		ArrayList list = (ArrayList)MinecraftServer.getServer().getConfigurationManager().playerEntityList;
		Iterator inter = list.iterator();
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
							

							while (inter.hasNext())
							{
								EntityPlayerMP player = (EntityPlayerMP)inter.next();
								
								player.addStat(AchievementPageDivineRPG.frozenGoods, 1);
							}

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
			var5.displayGUIChest((TileEntityIceikaChest)var1.getBlockTileEntity(var2, var3, var4));
			return true;
		}

	}
	
    /**
     * Generate a seed ItemStack for this crop.
     */
    protected int getSeedItem()
    {
        return DivineRPGTwilight.DivineRPGTwilight.blockID;
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    protected int getCropItem()
    {
        return DivineRPGTwilight.DivineRPGTwilight.itemID;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
    }

    @Override 
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

        if (metadata >= 0)
        {
            for (int n = 1; n < 3 + fortune; n++)
            {
                if (world.rand.nextInt(15) <= metadata)
                {
                    ret.add(new ItemStack(this.getSeedItem(), 1, 0));
                }
            }
        }

        return ret;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return par1 == 0 ? this.getCropItem() : this.getSeedItem();
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 */
	public TileEntity createNewTileEntity(World var1)
	{
		return new TileEntityIceikaChest();
	}
}
