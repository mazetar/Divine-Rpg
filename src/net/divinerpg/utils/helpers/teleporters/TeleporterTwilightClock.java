package net.divinerpg.utils.helpers.teleporters;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class TeleporterTwilightClock extends Teleporter
{
    public TeleporterTwilightClock(WorldServer par1WorldServer)
    {
        super(par1WorldServer);
    }

    private Random random = new Random();

    public void placeInPortal(World var1, Entity var2)
    {
        if (var1.provider.dimensionId != 0)
        {
            int var3 = MathHelper.floor_double(var2.posX);
            int var4 = MathHelper.floor_double(var2.posY) - 1;
            int var5 = MathHelper.floor_double(var2.posZ);
            boolean var6 = true;
            boolean var7 = false;
            var2.setLocationAndAngles((double)var3, (double)var4, (double)var5, var2.rotationYaw, 0.0F);
            var2.motionX = var2.motionY = var2.motionZ = 0.0D;
        }
    }
}
