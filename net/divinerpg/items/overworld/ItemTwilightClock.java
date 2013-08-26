package net.divinerpg.items.overworld;

import java.util.Random;

import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTwilightClock extends Item
{
    protected Random rand = new Random();
    public double lastX;
    public double lastY;
    public double lastZ;
    //public TeleporterTwilightClock teleporter = new TeleporterTwilightClock(null);

    public ItemTwilightClock(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }
    
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
        {
            return false;
        }
        else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
        {
            int var11 = var3.getBlockId(var4, var5, var6);

            if (var11 == TwilightBlockHelper.divineRock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, TwilightBlockHelper.DravitePortal.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.DraviteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, TwilightBlockHelper.AugitePortal.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.AzuriteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, TwilightBlockHelper.UvitePortal.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.UviteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, TwilightBlockHelper.MythrilPortal.blockID);
                return true;
            }
            else if (var11 == TwilightBlockHelper.MythrilBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, TwilightBlockHelper.AugitePortal.blockID);
                return true;
            }
            else if (var11 == Block.blockSnow.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, IceikaBlockHelper.iceikaPortal.blockID);
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
}
