package net.divinerpg.items.overworld;

import net.divinerpg.entities.bosses.EntityAyeracoBlue;
import net.divinerpg.entities.bosses.EntityAyeracoGreen;
import net.divinerpg.entities.bosses.EntityAyeracoPurple;
import net.divinerpg.entities.bosses.EntityAyeracoRed;
import net.divinerpg.entities.bosses.EntityAyeracoYellow;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class ItemAyeracoSpawner extends Item
{
    private World worldObj;
	private int spawnTick;

    public ItemAyeracoSpawner(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.spawnTick = 600;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.bow;
    }
	
	/**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var3.isRemote)
        {
            return true;
        }
        else
        {
            int var11 = var3.getBlockId(var4, var5, var6);
            var4 += Facing.offsetsXForSide[var7];
            var5 += Facing.offsetsYForSide[var7];
            var6 += Facing.offsetsZForSide[var7];
            double var12 = 0.0D;

            if (var7 == 1 && var11 == Block.fence.blockID || var11 == Block.netherFence.blockID)
            {
                var12 = 0.5D;
            }
            
            if (var3.provider.dimensionId == 1)
    		{
    			if (this.spawnTick == 600)
    			{
    				var3.playSoundAtEntity(var2, "mob.RPG.AyeracoSpawn", 20.0F, 1.0F);
    				var2.addChatMessage("The Green Ayeraco had been called upon!");
    			}
    			else if (this.spawnTick == 430)
    			{
    				var2.addChatMessage("The Blue Ayeraco had been called upon!");
    			}
    			else if (this.spawnTick == 280)
    			{
    				var2.addChatMessage("The Red Ayeraco had been called upon!");
    			}
    			else if (this.spawnTick == 210)
    			{
    				var2.addChatMessage("The Yellow Ayeraco had been called upon!");
    			}
    			else if (this.spawnTick == 145)
    			{
    				var2.addChatMessage("The Purple Ayeraco had been called upon!");
    			}
    			else if (this.spawnTick == 0)
    			{
    				if (this.spawnCreature(var3, var2, var4, var5, var6))
    				{
    					var2.addChatMessage("The Ayeraco Horde has arrived!");
    					var2.inventory.consumeInventoryItem(this.itemID);
    		            return true;
    				}
    			}
    			this.spawnTick -= 5;
    		}
    		else
    		{
    	        var2.addChatMessage("The Ayeraco Horde can only be spawned in the End");
    		}
            
            return false;
        }
    }
	
    public boolean spawnCreature(World par1, EntityPlayer par2, double par3, double par4, double par5)
    {
    	EntityAyeracoBlue var1 = new EntityAyeracoBlue(par1);
    	EntityAyeracoGreen var2 = new EntityAyeracoGreen(par1);
    	EntityAyeracoRed var3 = new EntityAyeracoRed(par1);
    	EntityAyeracoYellow var4 = new EntityAyeracoYellow(par1);
    	EntityAyeracoPurple var5 = new EntityAyeracoPurple(par1);

    	var1.setLocationAndAngles(par3 + 15, par4 + 4, par5, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var2.setLocationAndAngles(par3 + 8, par4 + 4, par5 + 8, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var3.setLocationAndAngles(par3 + 5, par4 + 4, par5 - 12, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var4.setLocationAndAngles(par3 - 5, par4 + 4, par5 - 12, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var5.setLocationAndAngles(par3 - 8, par4 + 4, par5 + 8, par1.rand.nextFloat() * 360.0F, 0.0F);
    	
    	par1.setBlock((int)(par3 + 15), (int)(par4),(int)(par5), OverworldBlockHelper.ayeracoBeamBlue.blockID);
    	par1.setBlock((int)(par3 + 8), (int)(par4),(int)(par5 + 8), OverworldBlockHelper.ayeracoBeamGreen.blockID);
    	par1.setBlock((int)(par3 + 5), (int)(par4),(int)(par5 - 12), OverworldBlockHelper.ayeracoBeamRed.blockID);
    	par1.setBlock((int)(par3 - 5), (int)(par4),(int)(par5 - 12), OverworldBlockHelper.ayeracoBeamYellow.blockID);
    	par1.setBlock((int)(par3 - 8), (int)(par4),(int)(par5 + 8), OverworldBlockHelper.ayeracoBeamPurple.blockID);
    	
    	var1.initOthers(var2, var3, var4, var5);
    	var2.initOthers(var1, var3, var4, var5);
    	var3.initOthers(var1, var2, var4, var5);
    	var4.initOthers(var1, var2, var3, var5);
    	var5.initOthers(var1, var2, var3, var4);
    	
    	var1.setBeamLocation((int)(par3 + 15), (int)(par4),(int)(par5));
    	var2.setBeamLocation((int)(par3 + 8), (int)(par4),(int)(par5 + 8));
    	var3.setBeamLocation((int)(par3 + 5), (int)(par4),(int)(par5 - 12));
    	var4.setBeamLocation((int)(par3 - 5), (int)(par4),(int)(par5 - 12));
    	var5.setBeamLocation((int)(par3 - 8), (int)(par4),(int)(par5 + 8));

    	par1.spawnEntityInWorld(var1);
    	par1.spawnEntityInWorld(var2);
    	par1.spawnEntityInWorld(var3);
    	par1.spawnEntityInWorld(var4);
    	par1.spawnEntityInWorld(var5);
        return true;
    }

    public String getTextureFile()
    {
        return "/Xolovon.png";
    }
}