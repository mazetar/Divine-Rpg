package xolova.blued00r.divinerpg.items;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemTeleporter extends Item
{
    protected Random rand = new Random();
    public double lastX;
    public double lastY;
    public double lastZ;

    public ItemTeleporter(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public boolean onItemUse(ItemStack var1, EntityPlayer var3, World var2, int i, int j, int k, int blockID, float par8, float par9, float par10)
    {
        if (!var2.isRemote)
        {
            /*EntityPlayerMP var4 = MinecraftServer.getServer().getConfigurationManager().getPlayerForUsername(ModLoader.getMinecraftInstance().session.username);
            this.lastX = var3.posX;
            this.lastY = var3.posY;
            this.lastZ = var3.posZ;
            ChunkCoordinates var5 = var4.getSpawnChunk();

            if (var5 != null)
            {
                var2.getChunkProvider().loadChunk(var5.posX, var5.posZ);
                var3.setLocationAndAngles((double)((float)var5.posX), (double)((float)var5.posY), (double)((float)var5.posZ), var3.rotationYaw, var3.rotationPitch);

                for (int var6 = 0; var6 < 500; ++var6)
                {
                    var2.spawnParticle("portal", var3.posX + (this.rand.nextDouble() - 0.5D) * (double)var3.width, var3.posY + this.rand.nextDouble() * (double)var3.height - 1.0D - 0.25D, var3.posZ + (this.rand.nextDouble() - 0.5D) * (double)var3.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D);
                    var2.spawnParticle("portal", this.lastX + (this.rand.nextDouble() - 0.5D) * (double)var3.width, this.lastY + this.rand.nextDouble() * (double)var3.height - 1.0D - 0.25D, this.lastZ + (this.rand.nextDouble() - 0.5D) * (double)var3.width, (this.rand.nextDouble() - 0.5D) * 1.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 1.0D);
                }

                var2.playSoundEffect(var3.posX, var3.posY, var3.posZ, "mob.endermen.portal", 1.0F, 1.0F);
            }*/
        }

        return true;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
