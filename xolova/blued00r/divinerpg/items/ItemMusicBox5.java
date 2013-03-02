package xolova.blued00r.divinerpg.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class ItemMusicBox5 extends Item
{
    private int firetick;
    private int firetick2;
    private int firetick3;
    private int firemax = 904;
    private int snowmax = 5860;
    private int mushroommax = 285;
    private int oceanmax = 705;
    private int junglemax = 6724;
    private int desertmax = 265;
    private int hellmax = 265;
    private int endmax = 383;
    private int swampmax = 382;
    private int dravitemax = 324;
    private int azuritemax = 406;
    private int uvitemax = 265;
    private int mythrilmax = 2882;
    private int augitemax = 3242;

    public boolean hasPlayedForest = false;

    public ItemMusicBox5(int par1)
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

        if (this.firetick2 == this.hellmax && this.hellmax != 0)
        {
            if (currentBiome == currentBiome.hell)
            {
                par2World.playSoundAtEntity(par3Entity, "biomemusic.Nether", 0.4F, 1.0F);
            }

            if (currentBiome == currentBiome.sky)
            {
                par2World.playSoundAtEntity(par3Entity, "biomemusic.Nether", 0.4F, 1.0F);
            }

            this.firetick2 = 0;
        }
        /*if (this.firetick == this.augitemax && this.augitemax != 0)
        {
        	if(currentBiome == DivineRPG.denseBiome)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Augite", 0.4F, 1.0F);
        	}

        	this.firetick = 0;
        }
        if (this.firetick == this.azuritemax && this.azuritemax != 0)
        {
        	if(currentBiome == DivineRPG.azuriteBiome)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Azurite", 0.4F, 1.0F);
        	}

        	this.firetick = 0;
        }
        if (this.firetick == this.dravitemax && this.dravitemax != 0)
        {
        	if(currentBiome == DivineRPG.serenityBiome)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Dravite", 0.4F, 1.0F);
        	}

        	this.firetick = 0;
        }
        if (this.firetick == this.endmax && this.endmax != 0)
        {
        	if(currentBiome == currentBiome.sky)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.End", 0.4F, 1.0F);
        	}

        	this.firetick = 0;
        }
        if (this.firetick2 == this.junglemax && this.junglemax != 0)
        {
        	if(currentBiome == currentBiome.jungle)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Jungle", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick2 == this.junglemax && this.junglemax != 0)
        {
        	if(currentBiome == currentBiome.jungleHills)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Jungle", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick == this.mushroommax && this.mushroommax != 0)
        {
        	if(currentBiome == currentBiome.mushroomIsland)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.MushroomBiomes", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick2 == this.mushroommax && this.mushroommax != 0)
        {
        	if(currentBiome == currentBiome.mushroomIslandShore)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.MushroomBiomes", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick2 == this.mythrilmax && this.mythrilmax != 0)
        {
        	if(currentBiome == DivineRPG.mythilBiome)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Mythril", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick2 == this.hellmax && this.hellmax != 0)
        {
        	if(currentBiome == currentBiome.hell)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Nether", 0.4F, 1.0F);
        	}
        				if(currentBiome == currentBiome.sky)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.End", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick2 == this.oceanmax && this.oceanmax != 0)
        {
        	if(currentBiome == currentBiome.ocean)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Ocean", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick2 == this.oceanmax && this.oceanmax != 0)
        {
        	if(currentBiome == currentBiome.beach)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Ocean", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick2 == this.oceanmax && this.oceanmax != 0)
        {
        	if(currentBiome == currentBiome.frozenOcean)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Ocean", 0.4F, 1.0F);
        	}

        	this.firetick2 = 0;
        }
        if (this.firetick3 == this.snowmax && this.snowmax != 0)
        {
        	if(currentBiome == currentBiome.taiga)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.SnowBiomes", 0.4F, 1.0F);
        	}

        	this.firetick3 = 0;
        }
        if (this.firetick3 == this.snowmax && this.snowmax != 0)
        {
        	if(currentBiome == currentBiome.taigaHills)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.SnowBiomes", 0.4F, 1.0F);
        	}

        	this.firetick3 = 0;
        }
        if (this.firetick3 == this.snowmax && this.snowmax != 0)
        {
        	if(currentBiome == currentBiome.icePlains)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.SnowBiomes", 0.4F, 1.0F);
        	}

        	this.firetick3 = 0;
        }
        if (this.firetick3 == this.snowmax && this.snowmax != 0)
        {
        	if(currentBiome == currentBiome.iceMountains)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.SnowBiomes", 0.4F, 1.0F);
        	}

        	this.firetick3 = 0;
        }
        if (this.firetick3 == this.snowmax && this.snowmax != 0)
        {
        	if(currentBiome == currentBiome.frozenRiver)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.SnowBiomes", 0.4F, 1.0F);
        	}

        	this.firetick3 = 0;
        }
        if (this.firetick3 == this.swampmax && this.swampmax != 0)
        {
        	if(currentBiome == currentBiome.swampland)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Swamp", 0.4F, 1.0F);
        	}

        	this.firetick3 = 0;
        }
        if (this.firetick3 == this.uvitemax && this.uvitemax != 0)
        {
        	if(currentBiome == DivineRPG.energyBiome)
        	{
        		par2World.playSoundAtEntity(par3Entity, "biomemusic.Uvite", 0.4F, 1.0F);
        	}

        	this.firetick3 = 0;
        }*/
        else
        {
            ++this.firetick;
            ++this.firetick2;
            ++this.firetick3;
        }
    }

    public String getTextureFile()
    {
        return "/Xolovon3.png";
    }
}
