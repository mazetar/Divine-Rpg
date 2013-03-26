package xolova.divinerpg.items.overworld;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.items.ItemDivineRPG;
import xolova.divinerpg.utils.helpers.block.OverworldBlockHelper;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class ItemTwilightClock extends ItemDivineRPG
{
    protected Random rand = new Random();
    public double lastX;
    public double lastY;
    public double lastZ;
    //public TeleporterTwilightClock teleporter = new TeleporterTwilightClock(null);

    public ItemTwilightClock(int var1, int par2)
    {
        super(var1, par2);
        this.maxStackSize = 1;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
        {
            return false;
        }
        else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
        {
            int var11 = var3.getBlockId(var4, var5, var6);

            if (var11 == OverworldBlockHelper.divineRock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.blueFire.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.DraviteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.blueFire.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.AzuriteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.blueFire.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.UviteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.blueFire.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.MythilBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.blueFire.blockID);
                return true;
            }
            else if (var11 == Block.blockSnow.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.blueFire.blockID);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    public int getSheet()
    {
        return 3;
    }
}
