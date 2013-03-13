package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHeatTraps extends Block
{
    public BlockHeatTraps(int var1, int var2)
    {
        super(var1, var2, Material.sand);
        this.blockIndexInTexture = var2;
        this.setTickRandomly(true);
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate()
    {
        return 30;
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the bounding box of the wired rectangular prism to render.
     */
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)(var3 + 1), (double)((float)(var4 + 1) - var5));
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (this.blockID == DivineRPG.heatTrapsOn.blockID)
        {
            par1World.setBlockWithNotify(par2, par3, par4, DivineRPG.heatTraps.blockID);
        }
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
        if (this.blockID == DivineRPG.heatTraps.blockID)
        {
            var1.setBlockWithNotify(var2, var3, var4, DivineRPG.heatTrapsOn.blockID);
        }

        if (this.blockID == DivineRPG.heatTrapsOn.blockID && var5 instanceof EntityPlayerMP)
        {
            var5.attackEntityFrom(DamageSource.cactus, 16);
            var5.setFire(20);
            ((EntityPlayerMP)var5).addStat(AchievementPageDivineRPG.hoterthanHell, 1);
            //this.blockIndexInTexture = 110;
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
