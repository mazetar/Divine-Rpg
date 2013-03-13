package xolova.blued00r.divinerpg.entities.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class EntityJungleDramcryx extends EntityMob
{
    public EntityJungleDramcryx(World par1World)
    {
        super(par1World);
        this.texture = "/mob/Dramcryx.png";
        this.moveSpeed = 0.7F;
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
        return 100;
    }

    @Override
    public int getAttackStrength(Entity entity)
    {
        return 19;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return DivineRPG.greenShard.itemID;
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
