package xolova.divinerpg.entities.overworld.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import xolova.divinerpg.utils.helpers.item.OverworldItemHelper;

public class EntityEnthralledDramcryx extends EntityMob
{
    public EntityEnthralledDramcryx(World par1World)
    {
        super(par1World);
        this.texture = "/mob/CaveDramcryx.png";
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.Dramcryx";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.DramcryxHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.DramcryxHit";
    }

    @Override
    public int getMaxHealth()
    {
        return 250;
    }

    @Override
    public int getAttackStrength(Entity entity)
    {
		if (!this.worldObj.isRemote && this.worldObj.difficultySetting > 0)
		{
			return 24;
		}
        return 24;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Item.ingotIron.itemID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.corruptedShards.itemID, 1);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.corruptedShards.itemID, 2);
        }
    }

    protected void dropRareDrop(int par1)
    {
        switch (this.rand.nextInt(1))
        {
            case 0:
                this.dropItem(OverworldItemHelper.arlemite.itemID, 5);
                break;
        }
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 15.0D && super.getCanSpawnHere();
    }
}
