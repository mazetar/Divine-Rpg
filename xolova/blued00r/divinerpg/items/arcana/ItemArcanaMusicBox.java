package xolova.blued00r.divinerpg.items.arcana;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import xolova.blued00r.divinerpg.*;

public class ItemArcanaMusicBox extends Item
{
    private int firetick;
    private int firetick2;
    private int firetick3;
    private int firemax;
    private int arcanamax = 1260;

    public boolean hasPlayedForest = false;

    public ItemArcanaMusicBox(int par1)
    {
        super(par1);
    }

    /**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
        BiomeGenBase currentBiome = par2World.getBiomeGenForCoords(MathHelper.floor_double(par3Entity.posX), MathHelper.floor_double(par3Entity.posZ));

        if (this.firetick == this.arcanamax && this.arcanamax != 0)
        {
            if (currentBiome == DivineRPG.arcanaBiome)
            {
                par2World.playSoundAtEntity(par3Entity, "ambient.Arcana", 0.4F, 1.0F);
            }
            this.firetick = 0;
        }
        else
        {
            ++this.firetick;
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
