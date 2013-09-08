package net.divinerpg.utils.helpers.teleporters;

import net.divinerpg.utils.helpers.block.ArcanaBlockHelper;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class TeleporterArcana extends Teleporter
{
    protected WorldServer myWorld;

    public TeleporterArcana(WorldServer var1)
    {
        super(var1);
        this.myWorld = var1;
    }

    /**
     * Place an entity in a nearby portal which already exists.
     */
    @Override
    public boolean placeInExistingPortal(Entity entity, double notUsed_entityX, double notUsed_entityY, double notUsed_entityZ, float notUsed_entityRotation)
    {
        short searchRange = 200;
        double var10 = -1.0D;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int entityPosX_floored = MathHelper.floor_double(entity.posX);
        int entityPosY = MathHelper.floor_double(entity.posZ);
        double var24;

        // Searches for an already made portal in the destination dimension:
        for (int searchX = entityPosX_floored - searchRange; searchX <= entityPosX_floored + searchRange; ++searchX)
        {
            double var18 = searchX + 0.5D - entity.posX;

            for (int searchZ = entityPosY - searchRange; searchZ <= entityPosY + searchRange; ++searchZ)
            {
                double var21 = searchZ + 0.5D - entity.posZ;

                for (int searchY = 128 - 1; searchY >= 0; --searchY)
                {
                    if (this.isBlockPortal(this.myWorld, searchX, searchY, searchZ))
                    {
                        while (this.isBlockPortal(this.myWorld, searchX, searchY - 1, searchZ))
                        {
                            --searchY;
                        }

                        var24 = searchY + 0.5D - entity.posY;
                        double var26 = var18 * var18 + var24 * var24 + var21 * var21;

                        if (var10 < 0.0D || var26 < var10)
                        {
                            var10 = var26;
                            var12 = searchX;
                            var13 = searchY;
                            var14 = searchZ;
                        }
                    }
                }
            }
        }

        if (var10 >= 0.0D) // If portal found, adjust player for portal direction.
        {
            double var28 = var12 + 0.5D;
            double var22 = var13 + 0.5D;
            var24 = var14 + 0.5D;

            if (this.isBlockPortal(this.myWorld, var12 - 1, var13, var14))
            {
                var28 -= 0.5D;
            }

            if (this.isBlockPortal(this.myWorld, var12 + 1, var13, var14))
            {
                var28 += 0.5D;
            }

            if (this.isBlockPortal(this.myWorld, var12, var13, var14 - 1))
            {
                var24 -= 0.5D;
            }

            if (this.isBlockPortal(this.myWorld, var12, var13, var14 + 1))
            {
                var24 += 0.5D;
            }

            entity.setLocationAndAngles(var28, var22 + 1.0D, var24 + 1.0D, entity.rotationYaw, 0.0F);
            entity.motionX = entity.motionY = entity.motionZ = 0.0D;
            return true;
        } else 
            return false;
    }

    public boolean isBlockPortal(World var1, int var2, int var3, int var4)
    {
        return var1.getBlockId(var2, var3, var4) == ArcanaBlockHelper.arcanaPortal.blockID;
    }

    public boolean func_85188_a(Entity entity)
    {
        double var2 = this.myWorld.provider.dimensionId == 0 ? 2.0D : 0.5D;
        byte var4 = 16;
        double var5 = -1.0D;
        int var7 = MathHelper.floor_double(entity.posX);
        int var8 = MathHelper.floor_double(entity.posY * var2);
        int var9 = MathHelper.floor_double(entity.posZ);
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
            var16 = var15 + 0.5D - entity.posX;

            for (var18 = var9 - var4; var18 <= var9 + var4; ++var18)
            {
                var19 = var18 + 0.5D - entity.posZ;
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

                                var32 = var21 + 0.5D - entity.posY * var2;
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
                var16 = var15 + 0.5D - entity.posX;

                for (var18 = var9 - var4; var18 <= var9 + var4; ++var18)
                {
                    var19 = var18 + 0.5D - entity.posZ;
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

                                    var32 = var21 + 0.5D - entity.posY * var2;
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

        world.setBlock(x, y, z, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x, y, z + 1, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x, y, z + 2, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 1, y, z + 3, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 2, y, z + 3, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 3, y, z + 3, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 4, y, z, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 4, y, z + 1, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 4, y, z + 2, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 1, y, z - 1, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 2, y, z - 1, ArcanaBlockHelper.arcanaPortalFrame.blockID);
        world.setBlock(x + 3, y, z - 1, ArcanaBlockHelper.arcanaPortalFrame.blockID);


        world.setBlock(x + 1, y, z, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 2, y, z, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 3, y, z, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 1, y, z + 1, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 2, y, z + 1, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 3, y, z + 1, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 1, y, z + 2, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 2, y, z + 2, ArcanaBlockHelper.arcanaPortal.blockID);
        world.setBlock(x + 3, y, z + 2, ArcanaBlockHelper.arcanaPortal.blockID);
    }
}