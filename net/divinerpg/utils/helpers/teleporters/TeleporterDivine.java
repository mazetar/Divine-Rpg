package net.divinerpg.utils.helpers.teleporters;

import net.divinerpg.utils.helpers.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class TeleporterDivine extends Teleporter
{
    protected WorldServer myWorld;

    protected Block frameBlock;
    protected Block portalBlock;
    protected Block platformBlock = TwilightBlockHelper.divineRock;
    
    public TeleporterDivine(WorldServer worldServer, Block frame, Block portal, Block platform)
    {
        super(worldServer);
        this.myWorld = worldServer;
        frameBlock = frame;
        portalBlock = portal;
        platformBlock = platform;
    }

    /**
     * Place an entity in a nearby portal which already exists.
     */
    @Override
    public boolean placeInExistingPortal(Entity entity, double posX, double posY, double posZ, float rotationYaw)
    {
        short var9 = 200;
        double var10 = -1.0D;
        int x = 0;
        int y = 0;
        int z = 0;
        int var15 = MathHelper.floor_double(entity.posX);
        int var16 = MathHelper.floor_double(entity.posZ);
        double zPosNew;

        for (int var17 = var15 - var9; var17 <= var15 + var9; ++var17)
        {
            double var18 = (double)var17 + 0.5D - entity.posX;

            for (int var20 = var16 - var9; var20 <= var16 + var9; ++var20)
            {
                double var21 = (double)var20 + 0.5D - entity.posZ;

                for (int var23 = 128 - 1; var23 >= 0; --var23)
                {
                    if (this.isBlockPortal(this.myWorld, var17, var23, var20))
                    {
                        while (this.isBlockPortal(this.myWorld, var17, var23 - 1, var20))
                        {
                            --var23;
                        }

                        zPosNew = (double)var23 + 0.5D - entity.posY;
                        double var26 = var18 * var18 + zPosNew * zPosNew + var21 * var21;

                        if (var10 < 0.0D || var26 < var10)
                        {
                            var10 = var26;
                            x = var17;
                            y = var23;
                            z = var20;
                        }
                    }
                }
            }
        }

        if (var10 >= 0.0D)
        {
            double xPosNew = (double)x + 0.5D;
            double yPosNew = (double)y + 0.5D;
            zPosNew = (double)z + 0.5D;

            //TODO: Change this to take initial rotation when entering portal into account to decide which direction to exit from and to face. --Maz
            int newRot = 0;
            if (this.isBlockPortal(this.myWorld, x - 1, y, z))
            {
                xPosNew -= 0.5D;
                zPosNew--;
                newRot = 180;
            }

            if (this.isBlockPortal(this.myWorld, x + 1, y, z))
            {
                xPosNew += 0.5D;
                zPosNew--;
                newRot = 180;
            }

            if (this.isBlockPortal(this.myWorld, x, y, z - 1))
            {
                zPosNew -= 0.5D;
                xPosNew++;
                newRot = 270;
                
            }

            if (this.isBlockPortal(this.myWorld, x, y, z + 1))
            {
                zPosNew += 0.5D;
                xPosNew++;
                newRot = 270;
            }
                
            
            entity.setLocationAndAngles(xPosNew, yPosNew, zPosNew, newRot, 0.0F);
            entity.motionX = entity.motionY = entity.motionZ = 0.0D;
            return true;
        }
        else
        {
            return false;
        }
    }

    
    public boolean isBlockPortal(World var1, int var2, int var3, int var4)
    {
        return var1.getBlockId(var2, var3, var4) == this.portalBlock.blockID;
    }
  
    @Override
    public boolean makePortal(Entity var1)
    {
        double var2 = this.myWorld.provider.dimensionId == 0 ? 2.0D : 0.5D;
        byte var4 = 16;
        double var5 = -1.0D;
        int var7 = MathHelper.floor_double(var1.posX);
        int var8 = MathHelper.floor_double(var1.posY * var2);
        int var9 = MathHelper.floor_double(var1.posZ);
        int var10 = var7;
        int var11 = var8;
        int var12 = var9;
        int var13 = 0;
        int var14 = this.myWorld.rand.nextInt(4);
        int var15;
        double var16;
        double var19;
        int var18;
        int var21;
        int var23;
        int var22;
        int var25;
        int var24;
        int var27;
        int var26;
        int var29;
        int var28;
        double var32;
        double var33;

        for (var15 = var7 - var4; var15 <= var7 + var4; ++var15)
        {
            var16 = (double)var15 + 0.5D - var1.posX;

            for (var18 = var9 - var4; var18 <= var9 + var4; ++var18)
            {
                var19 = (double)var18 + 0.5D - var1.posZ;
                label178:

                for (var21 = 127; var21 >= 0; --var21)
                {
                    if (this.myWorld.isAirBlock(var15, var21, var18))
                    {
                        while (var21 > 0 && this.myWorld.isAirBlock(var15, var21 - 1, var18))
                        {
                            --var21;
                        }

                        for (var22 = var14; var22 < var14 + 4; ++var22)
                        {
                            var23 = var22 % 2;
                            var24 = 1 - var23;

                            if (var22 % 4 >= 2)
                            {
                                var23 = -var23;
                                var24 = -var24;
                            }

                            for (var25 = 0; var25 < 3; ++var25)
                            {
                                for (var26 = 0; var26 < 4; ++var26)
                                {
                                    for (var27 = -1; var27 < 4; ++var27)
                                    {
                                        var28 = var15 + (var26 - 1) * var23 + var25 * var24;
                                        var29 = var21 + var27;
                                        int var30 = var18 + (var26 - 1) * var24 - var25 * var23;

                                        if (var27 < 0 && !this.myWorld.getBlockMaterial(var28, var29, var30).isSolid() || var27 >= 0 && !this.myWorld.isAirBlock(var28, var29, var30))
                                        {
                                            continue label178;
                                        }
                                    }
                                }
                            }

                            var32 = (double)var21 + 0.5D - var1.posY * var2;
                            var33 = var16 * var16 + var32 * var32 + var19 * var19;

                            if (var5 < 0.0D || var33 < var5)
                            {
                                var5 = var33;
                                var10 = var15;
                                var11 = var21;
                                var12 = var18;
                                var13 = var22 % 4;
                            }
                        }
                    }
                }
            }
        }

        if (var5 < 0.0D)
        {
            for (var15 = var7 - var4; var15 <= var7 + var4; ++var15)
            {
                var16 = (double)var15 + 0.5D - var1.posX;

                for (var18 = var9 - var4; var18 <= var9 + var4; ++var18)
                {
                    var19 = (double)var18 + 0.5D - var1.posZ;
                    label126:

                    for (var21 = 127; var21 >= 0; --var21)
                    {
                        if (this.myWorld.isAirBlock(var15, var21, var18))
                        {
                            while (var21 > 0 && this.myWorld.isAirBlock(var15, var21 - 1, var18))
                            {
                                --var21;
                            }

                            for (var22 = var14; var22 < var14 + 2; ++var22)
                            {
                                var23 = var22 % 2;
                                var24 = 1 - var23;

                                for (var25 = 0; var25 < 4; ++var25)
                                {
                                    for (var26 = -1; var26 < 4; ++var26)
                                    {
                                        var27 = var15 + (var25 - 1) * var23;
                                        var28 = var21 + var26;
                                        var29 = var18 + (var25 - 1) * var24;

                                        if (var26 < 0 && !this.myWorld.getBlockMaterial(var27, var28, var29).isSolid() || var26 >= 0 && !this.myWorld.isAirBlock(var27, var28, var29))
                                        {
                                            continue label126;
                                        }
                                    }
                                }

                                var32 = (double)var21 + 0.5D - var1.posY * var2;
                                var33 = var16 * var16 + var32 * var32 + var19 * var19;

                                if (var5 < 0.0D || var33 < var5)
                                {
                                    var5 = var33;
                                    var10 = var15;
                                    var11 = var21;
                                    var12 = var18;
                                    var13 = var22 % 2;
                                }
                            }
                        }
                    }
                }
            }
        }

        int var31 = var13 % 2;
        int var20 = 1 - var31;

        if (var13 % 4 >= 2)
        {
            var31 = -var31;
            var20 = -var20;
        }

        this.makePortalAt(this.myWorld, var10, var11, var12);
        return true;
    }

    private void makePortalAt(World world, int x, int y, int z)
    {
        if (y < 30)
        {
            y = 30;
        }

        world.getClass();

        if (y > 118)
        {
            world.getClass();
            y = 118;
        }

        --y;

        world.setBlock(x + 0, y + 0, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 1, y + 0, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 2, y + 0, z + 1, this.frameBlock.blockID);
        world.setBlock(x - 1, y + 0, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 0, y + 0, z + 2, this.frameBlock.blockID);
        world.setBlock(x + 1, y + 0, z + 2, this.frameBlock.blockID);
        world.setBlock(x + 0, y + 0, z + 0, this.frameBlock.blockID);
        world.setBlock(x + 1, y + 0, z + 0, this.frameBlock.blockID);

        for (int var5 = -1; var5 <= 2; ++var5)
        {
            for (int var6 = -1; var6 <= 2; ++var6)
            {
                for (int var7 = 1; var7 <= 5; ++var7)
                {
                    world.setBlock(x + var5, y + var7, z + var6, 0);
                }
            }
        }

        world.setBlock(x + 0, y + 1, z + 1, this.portalBlock.blockID);
        world.setBlock(x + 1, y + 1, z + 1, this.portalBlock.blockID);
        world.setBlock(x + 0, y + 2, z + 1, this.portalBlock.blockID);
        world.setBlock(x + 1, y + 2, z + 1, this.portalBlock.blockID);
        world.setBlock(x + 0, y + 3, z + 1, this.portalBlock.blockID);
        world.setBlock(x + 1, y + 3, z + 1, this.portalBlock.blockID);
        world.setBlock(x - 1, y + 1, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 2, y + 1, z + 1, this.frameBlock.blockID);
        world.setBlock(x - 1, y + 2, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 2, y + 2, z + 1, this.frameBlock.blockID);
        world.setBlock(x - 1, y + 3, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 2, y + 3, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 0, y + 4, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 1, y + 4, z + 1, this.frameBlock.blockID);
        world.setBlock(x + 2, y + 4, z + 1, this.frameBlock.blockID);
        world.setBlock(x - 1, y + 4, z + 1, this.frameBlock.blockID);
    }
}
