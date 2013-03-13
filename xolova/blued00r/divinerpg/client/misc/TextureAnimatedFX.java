package xolova.blued00r.divinerpg.client.misc;

import java.io.IOException;

import net.minecraft.client.renderer.RenderEngine;
import net.minecraft.src.ModTextureAnimation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.TextureFXManager;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TextureAnimatedFX extends ModTextureAnimation
{
    public TextureAnimatedFX(String var1, int var2) throws IOException
    {
        super(var2, 1, var1, TextureFXManager.instance().loadImageFromTexturePack(FMLClientHandler.instance().getClient().renderEngine, var1), 5);
    }

    public void bindImage(RenderEngine var1)
    {
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, var1.getTexture("/Xolovon3.png"));
    }
}
