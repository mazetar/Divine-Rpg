package xolova.divinerpg.items.overworld;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import xolova.divinerpg.utils.helpers.IconHelper;

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
    
    @Override
    public void updateIcons(IconRegister par1IconRegister) {
    	iconIndex = IconHelper.icons[2][(6 * 16) + 5];
    }
    
    /*public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
        {
            return false;
        }
        else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
        {
            int var11 = var3.getBlockId(var4, var5, var6);

            if (var11 == DivineRPGTwilight.DivineRPGTwilight.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPGTwilight.DivineRPGTwilight.blockID);
                return true;
            }
            else if (var11 == DivineRPGTwilight.DivineRPGTwilight.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPGTwilight.DivineRPGTwilight.blockID);
                return true;
            }
            else if (var11 == DivineRPGTwilight.DivineRPGTwilight.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPGTwilight.DivineRPGTwilight.blockID);
                return true;
            }
            else if (var11 == DivineRPGTwilight.DivineRPGTwilight.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPGTwilight.DivineRPGTwilight.blockID);
                return true;
            }
            else if (var11 == DivineRPGTwilight.DivineRPGTwilight.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPGTwilight.DivineRPGTwilight.blockID);
                return true;
            }
            else if (var11 == Block.blockSnow.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, DivineRPGTwilight.DivineRPGTwilight.blockID);
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
    }*/
}
