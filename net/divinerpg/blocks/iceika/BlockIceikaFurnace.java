package net.divinerpg.blocks.iceika;

import java.util.Random;

import net.divinerpg.DivineRPGIceika;
import net.divinerpg.DivineRPGTwilight;
import net.divinerpg.blocks.core.BlockDivineContainer;
import net.divinerpg.blocks.iceika.tileentities.TileEntityCoalStoneFurnace;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockIceikaFurnace extends BlockDivineContainer {

    private Random furnaceRand = new Random();
    private final boolean isActive;
    private static boolean keepFurnaceInventory = false;

    public BlockIceikaFurnace(int par1, boolean par2) {
        super(par1, 0, Material.rock);
        this.isActive = par2;
    }

    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.setDefaultDirection(par1World, par2, par3, par4);
    }

    private void setDefaultDirection(World world, int x, int y, int z) {
        if (!world.isRemote) {
            int blockNegZ = world.getBlockId(x, y, z - 1);
            int blockPosZ = world.getBlockId(x, y, z + 1);
            int blockNegX = world.getBlockId(x - 1, y, z);
            int blockPosX = world.getBlockId(x + 1, y, z);
            byte meta = 3;

            if (Block.opaqueCubeLookup[blockNegZ] && !Block.opaqueCubeLookup[blockPosZ])
            {
                meta = 3;
            }

            if (Block.opaqueCubeLookup[blockPosZ] && !Block.opaqueCubeLookup[blockNegZ])
            {
                meta = 2;
            }

            if (Block.opaqueCubeLookup[blockNegX] && !Block.opaqueCubeLookup[blockPosX])
            {
                meta = 5;
            }

            if (Block.opaqueCubeLookup[blockPosX] && !Block.opaqueCubeLookup[blockNegX])
            {
                meta = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, meta, 2);
        }
    }


    @Override
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (this.isActive) {
            int var6 = par1World.getBlockMetadata(par2, par3, par4);
            float var7 = (float)par2 + 0.5F;
            float var8 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
            float var9 = (float)par4 + 0.5F;
            float var10 = 0.52F;
            float var11 = par5Random.nextFloat() * 0.6F - 0.3F;

            if (var6 == 4)
            {
                par1World.spawnParticle("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            }
            else if (var6 == 5)
            {
                par1World.spawnParticle("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            }
            else if (var6 == 2)
            {
                par1World.spawnParticle("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
            }
            else if (var6 == 3)
            {
                par1World.spawnParticle("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
        	TileEntityCoalStoneFurnace var10 = (TileEntityCoalStoneFurnace)par1World.getBlockTileEntity(par2, par3, par4);

            if (var10 != null)
            {
                par5EntityPlayer.openGui(DivineRPGIceika.instance, GuiRef.COALSTONE_FURNACE, par1World, par2, par3, par4);
            }

            return true;
        }
    }

    /**
     * Update which block ID the furnace is using depending on whether or not it is burning
     */
    public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4)
    {
        int var5 = par1World.getBlockMetadata(par2, par3, par4);
        TileEntity var6 = par1World.getBlockTileEntity(par2, par3, par4);
        keepFurnaceInventory = true;
        
        if (par0)
        {
            par1World.setBlock(par2, par3, par4, IceikaBlockHelper.coalstoneFurnaceActive.blockID, var5, 2);
        }
        else
        {
            par1World.setBlock(par2, par3, par4, IceikaBlockHelper.coalstoneFurnace.blockID, var5, 2);
        }

        keepFurnaceInventory = false;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var5, 2);

        if (var6 != null)
        {
            var6.validate();
            par1World.setBlockTileEntity(par2, par3, par4, var6);
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityCoalStoneFurnace();
    }
    
    /**
     * Called when the block is placed in the world.
     */
    @Override
    public void onBlockPlacedBy(World w, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack)
    {
        int dir = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (dir == 0)
        {
            w.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (dir == 1)
        {
            w.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (dir == 2)
        {
            w.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (dir == 3)
        {
            w.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        if (!keepFurnaceInventory)
        {
        	TileEntityCoalStoneFurnace var7 = (TileEntityCoalStoneFurnace)par1World.getBlockTileEntity(par2, par3, par4);

            if (var7 != null)
            {
                for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
                {
                    ItemStack var9 = var7.getStackInSlot(var8);

                    if (var9 != null)
                    {
                        float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
                        float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
                        float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;

                        while (var9.stackSize > 0)
                        {
                            int var13 = this.furnaceRand.nextInt(21) + 10;

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
                            var14.motionX = (double)((float)this.furnaceRand.nextGaussian() * var15);
                            var14.motionY = (double)((float)this.furnaceRand.nextGaussian() * var15 + 0.2F);
                            var14.motionZ = (double)((float)this.furnaceRand.nextGaussian() * var15);
                            par1World.spawnEntityInWorld(var14);
                        }
                    }
                }
            }
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }
}
