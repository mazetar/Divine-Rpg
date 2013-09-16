package net.divinerpg.items.overworld.NYI;

import net.divinerpg.entities.bosses.EntityAyeracoBlue;
import net.divinerpg.entities.bosses.EntityAyeracoGreen;
import net.divinerpg.entities.bosses.EntityAyeracoPurple;
import net.divinerpg.entities.bosses.EntityAyeracoRed;
import net.divinerpg.entities.bosses.EntityAyeracoYellow;
import net.divinerpg.items.ItemDivine;
import net.divinerpg.utils.helpers.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class ItemAyeracoSpawner extends ItemDivine
{
    private World worldObj;
	private int spawnTick;

    public ItemAyeracoSpawner(int id)
    {
        super(id);
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
	
    public boolean spawnCreature(World world, EntityPlayer player, double x, double y, double z)
    {
    	EntityAyeracoBlue blue = new EntityAyeracoBlue(world);
    	EntityAyeracoGreen green = new EntityAyeracoGreen(world);
    	EntityAyeracoRed red = new EntityAyeracoRed(world);
    	EntityAyeracoYellow yellow = new EntityAyeracoYellow(world);
    	EntityAyeracoPurple purple = new EntityAyeracoPurple(world);

    	blue.setLocationAndAngles(x + 15, y + 4, z, world.rand.nextFloat() * 360.0F, 0.0F);
    	green.setLocationAndAngles(x + 8, y + 4, z + 8, world.rand.nextFloat() * 360.0F, 0.0F);
    	red.setLocationAndAngles(x + 5, y + 4, z - 12, world.rand.nextFloat() * 360.0F, 0.0F);
    	yellow.setLocationAndAngles(x - 5, y + 4, z - 12, world.rand.nextFloat() * 360.0F, 0.0F);
    	purple.setLocationAndAngles(x - 8, y + 4, z + 8, world.rand.nextFloat() * 360.0F, 0.0F);
    	
    	world.setBlock((int)(x + 15), (int)(y),(int)(z), OverworldBlockHelper.ayeracoBeamBlue.blockID);
    	world.setBlock((int)(x + 8), (int)(y),(int)(z + 8), OverworldBlockHelper.ayeracoBeamGreen.blockID);
    	world.setBlock((int)(x + 5), (int)(y),(int)(z - 12), OverworldBlockHelper.ayeracoBeamRed.blockID);
    	world.setBlock((int)(x - 5), (int)(y),(int)(z - 12), OverworldBlockHelper.ayeracoBeamYellow.blockID);
    	world.setBlock((int)(x - 8), (int)(y),(int)(z + 8), OverworldBlockHelper.ayeracoBeamPurple.blockID);
    	
    	blue.initOthers(green, red, yellow, purple);
    	green.initOthers(blue, red, yellow, purple);
    	red.initOthers(blue, green, yellow, purple);
    	yellow.initOthers(blue, green, red, purple);
    	purple.initOthers(blue, green, red, yellow);
    	
    	blue.setBeamLocation((int)(x + 15), (int)(y),(int)(z));
    	green.setBeamLocation((int)(x + 8), (int)(y),(int)(z + 8));
    	red.setBeamLocation((int)(x + 5), (int)(y),(int)(z - 12));
    	yellow.setBeamLocation((int)(x - 5), (int)(y),(int)(z - 12));
    	purple.setBeamLocation((int)(x - 8), (int)(y),(int)(z + 8));

    	world.spawnEntityInWorld(blue);
    	world.spawnEntityInWorld(green);
    	world.spawnEntityInWorld(red);
    	world.spawnEntityInWorld(yellow);
    	world.spawnEntityInWorld(purple);
        return true;
    }
}