package xolova.divinerpg.items.arcana;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import xolova.divinerpg.entities.arcana.mobs.EntityGolemOfRejuv;
import xolova.divinerpg.utils.AchievementPageDivineRPG;

public class ItemGolemOfRejuvSpawner extends Item
{
    private World worldObj;

    public ItemGolemOfRejuvSpawner(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par3World.isRemote)
        {
            return true;
        }
        else
        {
            int var11 = par3World.getBlockId(par4, par5, par6);
            par4 += Facing.offsetsXForSide[par7];
            par5 += Facing.offsetsYForSide[par7];
            par6 += Facing.offsetsZForSide[par7];
            double var12 = 0.0D;

            if (par7 == 1 && Block.blocksList[var11] != null && Block.blocksList[var11].getRenderType() == 11)
            {
                var12 = 0.5D;
            }

            if (spawnCreature(par3World, par1ItemStack.getItemDamage(), (double)par4 + 0.5D, (double)par5 + var12, (double)par6 + 0.5D, par2EntityPlayer) != null && !par2EntityPlayer.capabilities.isCreativeMode)
            {
            	par2EntityPlayer.addStat(AchievementPageDivineRPG.littleCreature, 1);
                --par1ItemStack.stackSize;
            }

            return true;
        }
    }

    /**
     * Spawns the creature specified by the egg's type in the location specified by the last three parameters.
     * Parameters: world, entityID, x, y, z.
     */
    public static Entity spawnCreature(World par0World, int par1, double par2, double par4, double par6, EntityPlayer par2EntityPlayer)
    {
    	EntityGolemOfRejuv var10 = new EntityGolemOfRejuv(par0World);
    	var10.setLocationAndAngles(par2, par4, par6, MathHelper.wrapAngleTo180_float(par0World.rand.nextFloat() * 360.0F), 0.0F);
    	var10.rotationYawHead = var10.rotationYaw;
    	var10.renderYawOffset = var10.rotationYaw;
    	var10.initCreature();
    	par0World.spawnEntityInWorld(var10);
    	var10.playLivingSound();

    	return var10;
    }
}