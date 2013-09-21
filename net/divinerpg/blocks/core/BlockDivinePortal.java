package net.divinerpg.blocks.core;

import java.util.Random;

import net.divinerpg.entities.particle.EntityFXPortalBase;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.teleporters.TeleporterDivine;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/** Base class meant to be inherited from by portal blocks.
 *  Unless you intend to override the class you have to call setPortalVariables() upon intialization!
 *  
 *  If you extend this calls you HAVE to either call setPortalVariables() or Override all of the following 4 methods:
 *  randomDisplayTick(), onNeighborBlockChange(), onEntityCollidedWithBlock() & tryToCreatePortal()
 *  
 * @author Mazetar
 *
 */
public class BlockDivinePortal extends BlockBreakable {
   

    private int firetick;
    private int firemax = 100;
    
    public Block frameBlock;
    public Block ingitionBlock;
    public Block platformBlock;
    public int dimensionID;
    public String portalSound = "";
    EntityFXPortalBase portalEntityFX;
    
    
    public BlockDivinePortal(int id) {
        super(id, "notUsed", Material.portal, false);
    }

    /**
     * This method MUST be called during the block intilization unless you are extending it and are overriding the following 4 methods:
     *  randomDisplayTick(), onNeighborBlockChange(), onEntityCollidedWithBlock() & tryToCreatePortal(). 
     *  
     * @param frame - The BLOCK used for the frame (not the ID)
     * @param ignitionBlock - the BLOCK for the flame effect when igniting the portal (not the ID) 
     * @param dimID - Dimension ID of the destination dimension.
     * @param sound - the sound the portal makes 
     * @param fxEntity - The particles from the portal.
     * @param platformBlock  - The block to be used to build a platform for the block if it's in mid air.
     * @return 
     */
    public BlockDivinePortal setPortalVariables (Block frame, Block ignitionBlock, int dimID, String sound, EntityFXPortalBase fxEntity) {
        this.frameBlock = frame;
        this.ingitionBlock = ignitionBlock;
        this.dimensionID = dimID;
        this.portalSound = sound;
        this.portalEntityFX = fxEntity;
        return this;
    }
    
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World w, int x, int y, int z, Random rand)
    {

        for (int var6 = 0; var6 < 4; ++var6)
        {
            double var7 = (double)((float)x + rand.nextFloat());
            double var9 = (double)((float)y + rand.nextFloat());
            double var11 = (double)((float)z + rand.nextFloat());
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = 0.0D;
            int var19 = rand.nextInt(2) * 2 - 1;
            var13 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            var15 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            var17 = ((double)rand.nextFloat() - 0.5D) * 0.5D;

            if (w.getBlockId(x - 1, y, z) != this.blockID && w.getBlockId(x + 1, y, z) != this.blockID)
            {
                var7 = (double)x + 0.5D + 0.25D * (double)var19;
                var13 = (double)(rand.nextFloat() * 2.0F * (float)var19);
            }
            else
            {
                var11 = (double)z + 0.5D + 0.25D * (double)var19;
                var17 = (double)(rand.nextFloat() * 2.0F * (float)var19);
            }
            
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(this.portalEntityFX.getNewFX(w, var7, var9, var11, var13, var15, var17));
        }
    }

    
    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    @Override
    public void onNeighborBlockChange(World w, int x, int y, int z, int neighborBlockID)
    {
        return;
//        
//        byte sideFlag1 = 0;
//        byte sideFlag2 = 1;
//
//        if (w.getBlockId(x - 1, y, z) == this.blockID || w.getBlockId(x + 1, y, z) == this.blockID)
//        {
//            sideFlag1 = 1;
//            sideFlag2 = 0;
//        }
//
//        int var8;
//
//        for (var8 = y; w.getBlockId(x, var8 - 1, z) == this.blockID; --var8)
//        {
//            ;
//        }
//
//        if (w.getBlockId(x, var8 - 1, z) != this.frameBlock.blockID)
//        {
//            w.setBlockToAir(x, y, z);
//        }
//        else
//        {
//            int var9;
//
//            for (var9 = 1; var9 < 4 && w.getBlockId(x, var8 + var9, z) == this.blockID; ++var9)
//            {
//                ;
//            }
//
//            if (var9 == 3 && w.getBlockId(x, var8 + var9, z) == this.frameBlock.blockID)
//            {
//                boolean var10 = w.getBlockId(x - 1, y, z) == this.blockID || w.getBlockId(x + 1, y, z) == this.blockID;
//                boolean var11 = w.getBlockId(x, y, z - 1) == this.blockID || w.getBlockId(x, y, z + 1) == this.blockID;
//
//                if (var10 && var11)
//                {
//                    w.setBlockToAir(x, y, z);
//                }
//                else if ((w.getBlockId(x + sideFlag1, y, z + sideFlag2) != this.frameBlock.blockID || w.getBlockId(x - sideFlag1, y, z - sideFlag2) != this.blockID) 
//                        && (w.getBlockId(x - sideFlag1, y, z - sideFlag2) != this.frameBlock.blockID || w.getBlockId(x + sideFlag1, y, z + sideFlag2) != this.blockID))
//                {
//                    w.setBlockToAir(x, y, z);
//                }
//            }
//            else
//            {
//                w.setBlockToAir(x, y, z);
//            }
//        }
    }

    

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    @Override
    @SuppressWarnings("unused")
    public void onEntityCollidedWithBlock(World w, int x, int y, int z, Entity entity)
    {
        if (!w.isRemote)
        {
            if (this.firetick == this.firemax && this.firemax != 0)
            {
                if (entity instanceof EntityPlayerMP)
                {
                    WorldServer worldServer = (WorldServer)w;
                    EntityPlayerMP player = (EntityPlayerMP)entity;

                    if (entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayer)
                    {
                        w.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, portalSound, 0.5F, ((EntityPlayerMP) entity).getRNG().nextFloat() * 0.4F + 0.8F, false);
                        if (player.dimension != this.dimensionID)
                        {
                            player.mcServer.getConfigurationManager().transferPlayerToDimension(player, dimensionID,
                                    new TeleporterDivine(player.mcServer.worldServerForDimension(dimensionID), this.frameBlock, this));
                        }
                        else
                        {
                            player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterDivine(player.mcServer.worldServerForDimension(0), this.frameBlock, this));
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
    }
    
    

    public boolean tryToCreatePortal(World w, int x, int y, int z)
    {
        byte sideFlagX = 0;
        byte sideFlagZ = 0;

        if (w.getBlockId(x - 1, y, z) == this.frameBlock.blockID || w.getBlockId(x + 1, y, z) == this.frameBlock.blockID)
        {
            sideFlagX = 1;
        }

        if (w.getBlockId(x, y, z - 1) == this.frameBlock.blockID || w.getBlockId(x, y, z + 1) == this.frameBlock.blockID)
        {
            sideFlagZ = 1;
        }

        if (sideFlagX == sideFlagZ)
        {
            return false;
        }
        else
        {
            if (w.getBlockId(x - sideFlagX, y, z - sideFlagZ) == 0)
            {
                x -= sideFlagX;
                z -= sideFlagZ;
            }

            int var7;
            int var8;

            // The loop which checks the portal frame.
            for (var7 = -1; var7 <= 2; ++var7)
            {
                for (var8 = -1; var8 <= 3; ++var8)
                {
                    boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;

                    if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3)
                    {
                        int var10 = w.getBlockId(x + sideFlagX * var7, y + var8, z + sideFlagZ * var7);

                        if (var9)
                        {
                            if (var10 != this.frameBlock.blockID)
                            {
                                return false;
                            }
                        }
                        else if (var10 != 0 && var10 != ingitionBlock.blockID)
                        {
                            return false;
                        }
                    }
                }
            }

            // The loop which builds the portal inside the frame.
            w.scheduledUpdatesAreImmediate = true;

            for (var7 = 0; var7 < 2; ++var7)
            {
                for (var8 = 0; var8 < 3; ++var8)
                {
                    w.setBlock(x + sideFlagX * var7, y + var8, z + sideFlagZ * var7, this.blockID);
                }
            }

            w.scheduledUpdatesAreImmediate = false;
            return true;
        }
    }
    
    
    // Methods below does not need changing between portals.
    
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.PATH_TEXTURES + func_111023_E());
    }
    
    public BlockDivinePortal setTextureName(String name) {
        func_111022_d(name);
        return this;
    }
    
    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    @Override
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
    {
        if (blockAccess.getBlockId(x, y, z) == this.blockID)
        {
            return false;
        }
        else
        {
            boolean var6 = blockAccess.getBlockId(x - 1, y, z) == this.blockID && blockAccess.getBlockId(x - 2, y, z) != this.blockID;
            boolean var7 = blockAccess.getBlockId(x + 1, y, z) == this.blockID && blockAccess.getBlockId(x + 2, y, z) != this.blockID;
            boolean var8 = blockAccess.getBlockId(x, y, z - 1) == this.blockID && blockAccess.getBlockId(x, y, z - 2) != this.blockID;
            boolean var9 = blockAccess.getBlockId(x, y, z + 1) == this.blockID && blockAccess.getBlockId(x, y, z + 2) != this.blockID;
            boolean var10 = var6 || var7;
            boolean var11 = var8 || var9;
            return var10 && side == 4 ? true : (var10 && side == 5 ? true : (var11 && side == 2 ? true : var11 && side == 3));
        }
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random rand)
    {
        return 0;
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @Override
    public int getRenderBlockPass()
    {
        return 1;
    }

/**
 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
 * cleared to be reused)
 */
    @Override
public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z)
{
    return null;
}

/**
 * Updates the blocks bounds based on its current state. Args: world, x, y, z
 */
    @Override
public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z)
{
    float var5;
    float var6;

    if (blockAccess.getBlockId(x - 1, y, z) != this.blockID && blockAccess.getBlockId(x + 1, y, z) != this.blockID)
    {
        var5 = 0.125F;
        var6 = 0.5F;
        this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
    }
    else
    {
        var5 = 0.5F;
        var6 = 0.125F;
        this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
    }
}


}

// END OF CLASS



