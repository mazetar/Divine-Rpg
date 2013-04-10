package xolova.divinerpg.blocks.overworld;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import xolova.divinerpg.blocks.BlockDivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredBricks extends BlockDivineRPG
{
    public static final String[] blockStepTypes = new String[0];
    private boolean blockType;

    public BlockColoredBricks(int var1, int var2, Material var3)
    {
        super(var1, var2, Material.rock);
        this.setLightOpacity(255);
    }
    
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
    	return 0;
    }
	
	// Meant to be overrided
	public int getSheet(int side, int metadata) {
		return 0;
	}

    /**
     * Return the color for the specified armor ItemStack.
     */
    public int getColor(ItemStack par1ItemStack)
    {
    	NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

    	if (nbttagcompound == null)
    	{
    		return 10511680;
    	}
    	else
    	{
    		NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
    		return nbttagcompound1 == null ? 10511680 : (nbttagcompound1.hasKey("color") ? nbttagcompound1.getInteger("color") : 10511680);
    	}
    }

    /**
     * Remove the color from the specified armor ItemStack.
     */
    public void removeColor(ItemStack par1ItemStack)
    {
    	NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

    	if (nbttagcompound != null)
    	{
    		NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

    		if (nbttagcompound1.hasKey("color"))
    		{
    			nbttagcompound1.removeTag("color");
    		}
    	}
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("grass_side");
    }

    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = 0.5D;
        double d1 = 1.0D;
        return ColorizerGrass.getGrassColor(d0, d1);
    }

    public void func_82813_b(ItemStack par1ItemStack, int par2)
    {
    	NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

    	if (nbttagcompound == null)
    	{
    		nbttagcompound = new NBTTagCompound();
    		par1ItemStack.setTagCompound(nbttagcompound);
    	}

    	NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

    	if (!nbttagcompound.hasKey("display"))
    	{
    		nbttagcompound.setCompoundTag("display", nbttagcompound1);
    	}

    	nbttagcompound1.setInteger("color", par2);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    public int getRenderColor(int par1)
    {
        return this.getBlockColor();
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int l = 0;
        int i1 = 0;
        int j1 = 0;

        for (int k1 = -1; k1 <= 1; ++k1)
        {
            for (int l1 = -1; l1 <= 1; ++l1)
            {
                int i2 = par1IBlockAccess.getBiomeGenForCoords(par2 + l1, par4 + k1).getBiomeGrassColor();
                l += (i2 & 16711680) >> 16;
                i1 += (i2 & 65280) >> 8;
                j1 += i2 & 255;
            }
        }

        return (l / 9 & 255) << 16 | (i1 / 9 & 255) << 8 | j1 / 9 & 255;
    }
}
