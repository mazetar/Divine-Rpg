package net.divinerpg.blocks.arcana;

import java.util.List;
import java.util.Random;

import net.divinerpg.blocks.BlockDivine;
import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockPortalArcanaFrame extends BlockDivine
{
    public BlockPortalArcanaFrame(int par1)
    {
        super(par1, Material.rock);
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
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 0;
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    }

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    @SuppressWarnings("rawtypes")
    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        int var8 = par1World.getBlockMetadata(par2, par3, par4);

        if (isEnderEyeInserted(var8))
        {
            this.setBlockBounds(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
            super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }

        this.setBlockBoundsForItemRender();
    }

    /**
     * checks if an ender eye has been inserted into the frame block. parameters: metadata
     */
    public static boolean isEnderEyeInserted(int par0)
    {
        return (par0 & 4) != 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = ((MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6, 3);
    }

    @Override
    public void onBlockAdded(World w, int x, int y, int z)
    {
        tryCreatePortal(w, x, y, z);
    }
    
    /***
     * Checks the portal and creates it if possible.
     * 
     * @return true if portal was made.
     * 
     * @author Mazetar
     */
    public boolean tryCreatePortal(World w, int x, int y, int z) {
        // This could be made simpler by the use of ForgeDirection and by the use of a for loop in the end --Maz
        
        // Figure out which side we are on (N, S, E, W)
        byte side = 0;
        if (w.getBlockId(x, y, z - 4) == this.blockID) 
            side = 3; // South
        else if (w.getBlockId(x, y, z + 4) == this.blockID) 
            side = 2; // North
        else if (w.getBlockId(x - 4, y, z) == this.blockID) 
            side = 5; // East
        else if (w.getBlockId(x + 4, y, z) == this.blockID) 
            side = 4; // West
        
        if (side == 0)
            return false;

        if (side == 5 || side == 4) {
            if (w.getBlockId(x, y, z - 1) == this.blockID) { // Makes Z align to the north edge of west/east line.
                z--;
                if (w.getBlockId(x, y, z - 1) == this.blockID)
                    z--;
            }
            
            if (side == 5)
                x -= 4; // Aligns us to the top block of west line.
            
            // Move from west side's northmost block, to north side's western most block.
            z--;
            x++;
            
            // We are now in the westernmost block of the north row.
            
        }
        
        if (side == 3 || side == 2) // north or south
        {
            if (w.getBlockId(x - 1, y, z) == this.blockID) { // Makes X align to the west edge.
                x--;
                if (w.getBlockId(x - 1, y, z) == this.blockID)
                    x--;
            }
            
            if (side == 3) // if we are on south side, 
                z -= 4;   //   change our pos to the westernmost block of the north side.
            
        }
        
        boolean createPortal = false;
        // step 3. Check portal frame.
        // We are now in the west most block of the northern side.
        
        if (w.getBlockId(x + 1, y, z) == this.blockID && w.getBlockId(x + 2, y, z) == this.blockID) // is North okay.
            if (w.getBlockId(x + 1, y, z + 4) == this.blockID && 
                w.getBlockId(x + 2, y, z + 4) == this.blockID && w.getBlockId(x, y, z + 4) == this.blockID) // is South okay
            {
                // North and South okay, check East
                if (w.getBlockId(x + 3, y, z + 1) == this.blockID && 
                        w.getBlockId(x + 3, y, z + 2) == this.blockID && w.getBlockId(x + 3, y, z + 3) == this.blockID) // is East okay
                { // Check west side
                    if (w.getBlockId(x - 1, y, z + 1) == this.blockID && 
                            w.getBlockId(x - 1, y, z + 2) == this.blockID && w.getBlockId(x - 1, y, z + 3) == this.blockID)
                        createPortal = true; // East, West, North & South sides verified.
                }
            }
        
        if (createPortal) {
            w.setBlock(x, y, z+1, ArcanaBlockHelper.arcanaPortal.blockID);
            w.setBlock(x+1, y, z+1, ArcanaBlockHelper.arcanaPortal.blockID);
            w.setBlock(x+2, y, z+1, ArcanaBlockHelper.arcanaPortal.blockID);
            
            w.setBlock(x, y, z+2, ArcanaBlockHelper.arcanaPortal.blockID);
            w.setBlock(x+1, y, z+2, ArcanaBlockHelper.arcanaPortal.blockID);
            w.setBlock(x+2, y, z+2, ArcanaBlockHelper.arcanaPortal.blockID);
            
            w.setBlock(x, y, z+3, ArcanaBlockHelper.arcanaPortal.blockID);
            w.setBlock(x+1, y, z+3, ArcanaBlockHelper.arcanaPortal.blockID);
            w.setBlock(x+2, y, z+3, ArcanaBlockHelper.arcanaPortal.blockID);
            
            return true;
        }
        
        return false;
    }
    
    
}
