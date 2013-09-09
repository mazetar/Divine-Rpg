package net.divinerpg.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

@SuppressWarnings("unused")
public class EntityDivineMob extends EntityMob
{
    private static final double spawnLayer = 1;

    private float moveSpeed;
    private float maxHealth;
    private float attackDmg;
    private float followRange;
    public EntityDivineMob(World world, float moveSPEED, float maxHP, float attackDMG)
    {
        this(world, moveSPEED, maxHP, attackDMG, 64.0F);
    }
    public EntityDivineMob(World world, float moveSPEED, float maxHP, float attackDMG, float followRANGE)
    {
        super(world);
        this.moveSpeed = moveSPEED;
        this.maxHealth = maxHP;
        this.attackDmg = attackDMG;
        this.followRange = followRANGE;
        
    }

    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(maxHealth);
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(attackDmg);
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(followRange);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(moveSpeed);
    }
    
    public void setMaxHealth(float health) {
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(health); // SET attribute maxhealth
        this.setEntityHealth(health);
        
    }
    public void setAttackDmg(float dmg) {
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(dmg); // SET attribute attackdmg
    }
    public void setFollowRange(float range) {
        this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(range); // SET attribute FollowRange
        
    }
    public void setKnockbackResistance(float resistance) {
        this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(resistance); // SET attribute knocbackResistance
    }
    public void setMoveSpeed(float speed) {
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(speed); // SET attribute Movespeed
    }
   
    
    public float getHealth() {
        return func_110143_aJ();
    }
    
    public int getMaxHealth()
    {
        return (int) this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111126_e();
    }
    public int getAttackStrength(Entity var1)
    {
        return getAttackStrength();
    }
    public int getAttackStrength()
    {
        return (int) this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111126_e();
    }
    
    public double getFollowRange() {
        return this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111126_e(); // GET attribute FollowRange
        
    }
    public double getKnockbackResistance() {
        return this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111126_e(); // GET attribute knocbackResistance
    }
    public double getMoveSpeed() {
        return this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); // GET attribute Movespeed
    }
    
    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the texture's file path as a String.
     */
    @Deprecated
    public String getTexture()
    {
        return "";
    }


    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        
    }
}
