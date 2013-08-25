package net.divinerpg.blocks.twilight;

import java.util.Random;

import net.divinerpg.blocks.core.tileentities.TileEntitySerenityChest;
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
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDraviteChest extends BlockContainer
{
    private Random random = new Random();
    public Icon texture[];

    public BlockDraviteChest(int var1)
    {
        super(var1, Material.wood);
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

    public Icon getBlockTexture(IBlockAccess var1, int var2, int var3, int var4, int var5)
    {
        if (var5 == 1)
        {
            return texture[0];
        }
        else if (var5 == 0)
        {
            return texture[0];
        }
        else
        {
            int var6 = var1.getBlockMetadata(var2, var3, var4);
            return texture[0];
            //return var5 != var6 ? this.blockIndexInTexture : this.blockIndexInTexture + 1; //TODO
        }
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public Icon getBlockTextureFromSideAndMetaData(int var1)
    {
        return (Icon) (var1 == 1 ? texture[0] : (var1 == 0 ? 146 : (var1 == 3 ? texture[1] : texture[0])));
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

            var1.setBlock(var2, var3, var4, var9);
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

        var1.setBlock(var2, var3, var4, var6);
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        TileEntitySerenityChest var7 = (TileEntitySerenityChest)var1.getBlockTileEntity(var2, var3, var4);

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
        Object var10 = (TileEntitySerenityChest)var1.getBlockTileEntity(var2, var3, var4);

        if (var10 == null)
        {
            return true;
        }
        else if (var1.isBlockSolidOnSide(var2, var3 + 1, var4, ForgeDirection.DOWN))
        {
            return true;
        }
        else if (var1.getBlockId(var2 - 1, var3, var4) == this.blockID && var1.isBlockSolidOnSide(var2 - 1, var3 + 1, var4, ForgeDirection.DOWN))
        {
            return true;
        }
        else if (var1.getBlockId(var2 + 1, var3, var4) == this.blockID && var1.isBlockSolidOnSide(var2 + 1, var3 + 1, var4, ForgeDirection.DOWN))
        {
            return true;
        }
        else if (var1.getBlockId(var2, var3, var4 - 1) == this.blockID && var1.isBlockSolidOnSide(var2, var3 + 1, var4 - 1, ForgeDirection.DOWN))
        {
            return true;
        }
        else if (var1.getBlockId(var2, var3, var4 + 1) == this.blockID && var1.isBlockSolidOnSide(var2, var3 + 1, var4 + 1, ForgeDirection.DOWN))
        {
            return true;
        }
        else
        {
            if (var1.getBlockId(var2 - 1, var3, var4) == this.blockID)
            {
                var10 = new InventoryLargeChest("container.chestDouble", (TileEntitySerenityChest)var1.getBlockTileEntity(var2 - 1, var3, var4), (IInventory)var10);
            }

            if (var1.getBlockId(var2 + 1, var3, var4) == this.blockID)
            {
                var10 = new InventoryLargeChest("container.chestDouble", (IInventory)var10, (TileEntitySerenityChest)var1.getBlockTileEntity(var2 + 1, var3, var4));
            }

            if (var1.getBlockId(var2, var3, var4 - 1) == this.blockID)
            {
                var10 = new InventoryLargeChest("container.chestDouble", (TileEntitySerenityChest)var1.getBlockTileEntity(var2, var3, var4 - 1), (IInventory)var10);
            }

            if (var1.getBlockId(var2, var3, var4 + 1) == this.blockID)
            {
                new InventoryLargeChest("container.chestDouble", (IInventory)var10, (TileEntitySerenityChest)var1.getBlockTileEntity(var2, var3, var4 + 1));
            }

            if (var1.isRemote)
            {
                return true;
            }
            else
            {
                var5.displayGUIChest((TileEntitySerenityChest)var1.getBlockTileEntity(var2, var3, var4));
                return true;
            }
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntitySerenityChest();
    }
}
