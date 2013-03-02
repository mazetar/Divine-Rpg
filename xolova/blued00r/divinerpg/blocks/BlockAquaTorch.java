package xolova.blued00r.divinerpg.blocks;

import java.util.Random;

import net.minecraft.block.BlockTorch;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.client.particles.EntityBlueFlameFX;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAquaTorch extends BlockTorch
{
    public BlockAquaTorch(int var1, int var2)
    {
        super(var1, var2);
        this.blockIndexInTexture = var2;
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        int var6 = var1.getBlockMetadata(var2, var3, var4);
        double var7 = (double)((float)var2 + 0.5F);
        double var9 = (double)((float)var3 + 0.7F);
        double var11 = (double)((float)var4 + 0.5F);
        double var13 = 0.2199999988079071D;
        double var15 = 0.27000001072883606D;
        EntityBlueFlameFX var17;

        if (var6 == 1)
        {
            var1.spawnParticle("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
            var17 = new EntityBlueFlameFX(var1, var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var17, var17);
        }
        else if (var6 == 2)
        {
            var1.spawnParticle("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
            var1.spawnParticle("blueflame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
            var17 = new EntityBlueFlameFX(var1, var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var17, var17);
        }
        else if (var6 == 3)
        {
            var1.spawnParticle("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
            var1.spawnParticle("blueflame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
            var17 = new EntityBlueFlameFX(var1, var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var17, var17);
        }
        else if (var6 == 4)
        {
            var1.spawnParticle("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
            var1.spawnParticle("blueflame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
            var17 = new EntityBlueFlameFX(var1, var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var17, var17);
        }
        else
        {
            var1.spawnParticle("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
            var1.spawnParticle("blueflame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
            var17 = new EntityBlueFlameFX(var1, var7, var9, var11, 0.0D, 0.0D, 0.0D);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var17, var17);
        }
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile;
    }
}
