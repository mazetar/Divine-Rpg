package xolova.divinerpg.blocks.vethea;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.dispenser.IRegistry;
import net.minecraft.dispenser.PositionImpl;
import net.minecraft.dispenser.RegistryDefaulted;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.entities.vethea.projectile.EntityKarosCannonShot;
import xolova.divinerpg.utils.helpers.block.VetheaBlockHelper;

public class BlockKarosCannon extends BlockContainer
{
    /** Registry for all dispense behaviors. */
    public static final IRegistry dispenseBehaviorRegistry = new RegistryDefaulted(new BehaviorDefaultDispenseItem());
    private Random random = new Random();

    public BlockKarosCannon(int par1, Material par3)
    {
        super(par1, par3);
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate()
    {
        return 4;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return VetheaBlockHelper.karosCannon.blockID;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.setDispenserDefaultDirection(par1World, par2, par3, par4);
    }

    /**
     * sets Dispenser block direction so that the front faces an non-opaque block; chooses west to be direction if all
     * surrounding blocks are opaque.
     */
    private void setDispenserDefaultDirection(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            int var5 = par1World.getBlockId(par2, par3, par4 - 1);
            int var6 = par1World.getBlockId(par2, par3, par4 + 1);
            int var7 = par1World.getBlockId(par2 - 1, par3, par4);
            int var8 = par1World.getBlockId(par2 + 1, par3, par4);
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

            par1World.setBlockMetadataWithNotify(par2, par3, par4, var9, 3);
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityDispenser var10 = (TileEntityDispenser)par1World.getBlockTileEntity(par2, par3, par4);

            if (var10 != null)
            {
                par5EntityPlayer.displayGUIDispenser(var10);
            }

            return true;
        }
    }

    public void dispense(World par1World, int par2, int par3, int par4)
    {
    	this.setDispenserDefaultDirection(par1World, par2, par3, par4);
    	this.func_82486_a(par1World, 0, EnumFacing.getFront(par1World.getBlockMetadata(par2, par3, par4)), par2, par3, par4);
    }

    public void func_82486_a(World par0World, int par2, EnumFacing par3EnumFacing, int par3, int par4, int par5)
    {
        double var5 = par3;
        double var7 = par4;
        double var9 = par5;
        EntityKarosCannonShot var11 = new EntityKarosCannonShot(par0World, var5 + 0.5D + par3EnumFacing.getFrontOffsetX(), var7 + 0.5D, var9 + 0.5D + par3EnumFacing.getFrontOffsetZ());
        double var12 = par0World.rand.nextDouble() * 0.1D + 0.9D;
        var11.motionX = (double)par3EnumFacing.getFrontOffsetX() * var12;
        var11.motionY = 0D;
        var11.motionZ = (double)par3EnumFacing.getFrontOffsetZ() * var12;
        var11.motionX += par0World.rand.nextGaussian() * 0.007499999832361937D * (double)par2;
        var11.motionY += 0;
        var11.motionZ += par0World.rand.nextGaussian() * 0.007499999832361937D * (double)par2;
        par0World.spawnEntityInWorld(var11);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (par5 > 0 && Block.blocksList[par5].canProvidePower())
        {
            boolean var6 = par1World.isBlockIndirectlyGettingPowered(par2, par3, par4) || par1World.isBlockIndirectlyGettingPowered(par2, par3 + 1, par4);

            if (var6)
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate());
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote && (par1World.isBlockIndirectlyGettingPowered(par2, par3, par4) || par1World.isBlockIndirectlyGettingPowered(par2, par3 + 1, par4)))
        {
            this.dispense(par1World, par2, par3, par4);
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityDispenser();
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (var6 == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, this.blockID, 2);
        }

        if (var6 == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, this.blockID, 5);
        }

        if (var6 == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, this.blockID, 3);
        }

        if (var6 == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, this.blockID, 4);
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        TileEntityDispenser var7 = (TileEntityDispenser)par1World.getBlockTileEntity(par2, par3, par4);

        if (var7 != null)
        {
            for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
            {
                ItemStack var9 = var7.getStackInSlot(var8);

                if (var9 != null)
                {
                    float var10 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var11 = this.random.nextFloat() * 0.8F + 0.1F;
                    float var12 = this.random.nextFloat() * 0.8F + 0.1F;

                    while (var9.stackSize > 0)
                    {
                        int var13 = this.random.nextInt(21) + 10;

                        if (var13 > var9.stackSize)
                        {
                            var13 = var9.stackSize;
                        }

                        var9.stackSize -= var13;
                        EntityItem var14 = new EntityItem(par1World, (double)((float)par2 + var10), (double)((float)par3 + var11), (double)((float)par4 + var12), new ItemStack(var9.itemID, var13, var9.getItemDamage()));

                        if (var9.hasTagCompound())
                        {
                            var14.getEntityItem().setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
                        }

                        float var15 = 0.05F;
                        var14.motionX = (double)((float)this.random.nextGaussian() * var15);
                        var14.motionY = (double)((float)this.random.nextGaussian() * var15 + 0.2F);
                        var14.motionZ = (double)((float)this.random.nextGaussian() * var15);
                        par1World.spawnEntityInWorld(var14);
                    }
                }
            }
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

    public static IPosition func_82525_a(IBlockSource par0IBlockSource)
    {
        EnumFacing var1 = EnumFacing.getFront(par0IBlockSource.getBlockMetadata());
        double var2 = par0IBlockSource.getX() + 0.7D * (double)var1.getFrontOffsetX();
        double var4 = par0IBlockSource.getY();
        double var6 = par0IBlockSource.getZ() + 0.7D * (double)var1.getFrontOffsetZ();
        return new PositionImpl(var2, var4, var6);
    }
}