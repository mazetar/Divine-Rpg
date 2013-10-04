package net.divinerpg.items.overworld;

import java.util.Random;

import net.divinerpg.items.ItemDivine;
import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTwilightClock extends ItemDivine
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
    
    public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
        {
            return false;
        }
        else if (player.canPlayerEdit(x, y, z, var7, item) && player.canPlayerEdit(x, y + 1, z, var7, item))
        {
            int var11 = world.getBlockId(x, y, z);

            if (var11 == TwilightBlockHelper.divineRock.blockID && world.isAirBlock(x, y + 1, z))
            {
                TwilightBlockHelper.DravitePortal.tryToCreatePortal(world, x, y+1, z);
                return true;
            }
            else if (var11 == TwilightBlockHelper.DraviteBlock.blockID && world.isAirBlock(x, y + 1, z))
            {
                portalClosed(player);
               // TwilightBlockHelper.AzuritePortal.tryToCreatePortal(world, x, y+1, z);
              //  return true;
            }
            else if (var11 == TwilightBlockHelper.AzuriteBlock.blockID && world.isAirBlock(x, y + 1, z))
            {
                portalClosed(player);
               // TwilightBlockHelper.UvitePortal.tryToCreatePortal(world, x, y+1, z);
               // return true;
            }
            else if (var11 == TwilightBlockHelper.UviteBlock.blockID && world.isAirBlock(x, y + 1, z))
            { 
                portalClosed(player);
                //TwilightBlockHelper.MythrilPortal.tryToCreatePortal(world, x, y+1, z);
               // return true;
            }
            else if (var11 == TwilightBlockHelper.MythrilBlock.blockID && world.isAirBlock(x, y + 1, z))
            {
                portalClosed(player);
               // TwilightBlockHelper.AugitePortal.tryToCreatePortal(world, x, y+1, z);
               // return true;
            }
            else if (var11 == Block.blockSnow.blockID && world.isAirBlock(x, y + 1, z))
            {

                IceikaBlockHelper.iceikaPortal.tryToCreatePortal(world, x, y+1, z);
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
        return false;
    }
    
    private static boolean portalClosed(EntityPlayer p) {
        p.addChatMessage("The twilight storm blocks the twilight clock from opening such a portal");
        
        return false;
    }
}
