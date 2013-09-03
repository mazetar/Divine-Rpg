package net.divinerpg.entities.overworld.mobs;

import net.divinerpg.entities.EntityDivineMob;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.minecraft.world.World;

public class EntityJungleDramcryx extends EntityDivineMob
{
    public EntityJungleDramcryx(World par1World)
    {
        super(par1World, 0.7F, 100, 19);
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

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return OverworldItemHelper.jungleShard.itemID;
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }
}
