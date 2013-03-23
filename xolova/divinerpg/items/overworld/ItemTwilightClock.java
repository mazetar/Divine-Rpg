package xolova.blued00r.divinerpg.items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.DivineRPG;

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

            if (var11 == DivineRPG.divineRock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPG.blueFire.blockID);
                return true;
            }
            else if (var11 == DivineRPG.serenityBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPG.blueFire.blockID);
                return true;
            }
            else if (var11 == DivineRPG.azuriteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPG.blueFire.blockID);
                return true;
            }
            else if (var11 == DivineRPG.energyBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPG.blueFire.blockID);
                return true;
            }
            else if (var11 == DivineRPG.mythilBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPG.blueFire.blockID);
                return true;
            }
            else if (var11 == Block.blockSnow.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPG.blueFire.blockID);
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
    public String getTextureFile()
    {
        return DivineRPG.textureFile2;
    }
}
