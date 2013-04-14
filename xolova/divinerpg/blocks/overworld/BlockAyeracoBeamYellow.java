package xolova.divinerpg.blocks.overworld;
import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.BlockDivineRPGContainer;
import xolova.divinerpg.blocks.overworld.tileentities.TileEntityAyeracoBeamYellow;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAyeracoBeamYellow extends BlockDivineRPGContainer
{
	
    public BlockAyeracoBeamYellow(int par1)
    {
        super(par1, Material.air);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        return null;
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityAyeracoBeamYellow();
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        return false;
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

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (var5.nextInt(100) == 0)
        {
            var1.playSoundEffect((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "mob.RPG.AyeracoPillar", 0.5F, var5.nextFloat() * 0.4F + 0.8F);
        }
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }
}