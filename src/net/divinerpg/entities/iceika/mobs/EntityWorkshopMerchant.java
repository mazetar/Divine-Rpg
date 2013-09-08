package net.divinerpg.entities.iceika.mobs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import net.divinerpg.DivineRPGIceika;
import net.divinerpg.lib.GuiRef;
import net.divinerpg.utils.helpers.block.IceikaBlockHelper;
import net.divinerpg.utils.helpers.item.ArcanaItemHelper;
import net.divinerpg.utils.helpers.item.IceikaItemHelper;
import net.divinerpg.utils.helpers.item.OverworldItemHelper;
import net.divinerpg.utils.helpers.item.TwilightItemHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWorkshopMerchant extends EntityVillager implements INpc, IMerchant, IMob
{
    private int randomTickDivider;
    private boolean isMating;
    private boolean isPlaying;
    Village villageObj;
    private EntityPlayer buyingPlayer;
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    private boolean needsInitilization;
    private int wealth;
    private String field_82189_bL;
    private boolean field_82190_bM;
    private float field_82191_bN;
    public static final Map villagerStockList = new HashMap();
    public static final Map blacksmithSellingList = new HashMap();

    public EntityWorkshopMerchant(World var1)
    {
        this(var1, 0);
    }

    public EntityWorkshopMerchant(World var1, int var2)
    {
        super(var1);
        this.randomTickDivider = 0;
        this.isMating = false;
        this.isPlaying = false;
        this.villageObj = null;
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.3F, 0.35F));
        this.tasks.addTask(1, new EntityAITradePlayer(this));
        this.tasks.addTask(1, new EntityAILookAtTradePlayer(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.3F));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        //this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityJackOMan.class, 5.0F, 0.02F)); TODO
        this.tasks.addTask(9, new EntityAIWander(this, 0.3F));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
    }
    @Override
    /**
     * ApplyAttributes.
     */
    protected void func_110147_ax() { 
        super.func_110147_ax();
        
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(1000);
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5F);
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * main AI tick function, replaces updateEntityActionState
     */
    protected void updateAITick()
    {
        if (--this.randomTickDivider <= 0)
        {
            this.worldObj.villageCollectionObj.addVillagerPosition(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
            this.randomTickDivider = 70 + this.rand.nextInt(50);
            this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);

            if (this.villageObj == null)
            {
                this.func_110177_bN();
            }
            else
            {
                ChunkCoordinates var1 = this.villageObj.getCenter();
                this.func_110171_b(var1.posX, var1.posY, var1.posZ, (int)((float)this.villageObj.getVillageRadius() * 0.6F));

                if (this.field_82190_bM)
                {
                    this.field_82190_bM = false;
                    this.villageObj.func_82683_b(5);
                }
            }
        }

        if (!this.isTrading() && this.timeUntilReset > 0)
        {
            --this.timeUntilReset;

            if (this.timeUntilReset <= 0)
            {
                if (this.needsInitilization)
                {
                    if (this.buyingList.size() > 1)
                    {
                        Iterator var3 = this.buyingList.iterator();

                        while (var3.hasNext())
                        {
                            MerchantRecipe var2 = (MerchantRecipe)var3.next();

                            if (var2.func_82784_g())
                            {
                                var2.func_82783_a(this.rand.nextInt(18) + this.rand.nextInt(18) + 2);
                            }
                        }
                    }

                    this.addDefaultEquipmentAndRecipies(1);
                    this.needsInitilization = false;

                    if (this.villageObj != null && this.field_82189_bL != null)
                    {
                        this.worldObj.setEntityState(this, (byte)14);
                        this.villageObj.setReputationForPlayer(this.field_82189_bL, 1);
                    }
                }

                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
            }
        }

        super.updateAITick();
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);
                
                switch (this.rand.nextInt(4))
            	{
            	case 0:
            		var1.addChatMessage("Merchant: Hohoho.");
            		break;
            	case 1:
            		var1.addChatMessage("Merchant: It's cold outside.");
            		break;
            	case 2:
            		var1.addChatMessage("Merchant: It's cold inside.");
            		break;
            	case 3:
            		var1.addChatMessage("Merchant: Burr!");
            		break;
            	}
                
                var1.openGui(DivineRPGIceika.instance, GuiRef.WORKSHOP_MERCHANT, this.worldObj, this.entityId, 0, 0);
            }

            return true;
        }
        else
        {
            return super.interact(var1);
        }
    }

    protected void entityInit()
    {
        super.entityInit();
    }
    
    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setInteger("Profession", this.getProfession());
        var1.setInteger("Riches", this.wealth);

        if (this.buyingList != null)
        {
            var1.setCompoundTag("Offers", this.buyingList.getRecipiesAsTags());
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        this.setProfession(var1.getInteger("Profession"));
        this.wealth = var1.getInteger("Riches");

        if (var1.hasKey("Offers"))
        {
            NBTTagCompound var2 = var1.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(var2);
        }
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return false;
    }

    public void setProfession(int var1)
    {
        this.dataWatcher.updateObject(16, Integer.valueOf(var1));
    }

    public int getProfession()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    public boolean isMating()
    {
        return this.isMating;
    }

    public void setMating(boolean var1)
    {
        this.isMating = var1;
    }

    public void setPlaying(boolean var1)
    {
        this.isPlaying = var1;
    }

    public boolean isPlaying()
    {
        return this.isPlaying;
    }

    public void setRevengeTarget(EntityLivingBase var1)
    {
        super.setRevengeTarget(var1);

        if (this.villageObj != null && var1 != null)
        {
            this.villageObj.addOrRenewAgressor(var1);

            if (var1 instanceof EntityPlayer)
            {
                byte var2 = -1;

                if (this.isChild())
                {
                    var2 = -3;
                }

                this.villageObj.setReputationForPlayer(((EntityPlayer)var1).getCommandSenderName(), var2);

                if (this.isEntityAlive())
                {
                    this.worldObj.setEntityState(this, (byte)13);
                }
            }
        }
    }

    public void setCustomer(EntityPlayer var1)
    {
        this.buyingPlayer = var1;
    }

    public EntityPlayer getCustomer()
    {
        return this.buyingPlayer;
    }

    public boolean isTrading()
    {
        return this.buyingPlayer != null;
    }

    public void useRecipe(MerchantRecipe var1)
    {
        var1.incrementToolUses();

        if (var1.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1)))
        {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null)
            {
                this.field_82189_bL = this.buyingPlayer.getCommandSenderName();
            }
            else
            {
                this.field_82189_bL = null;
            }
        }

        if (var1.getItemToBuy().itemID == ArcanaItemHelper.arcanium.itemID)
        {
            this.wealth += var1.getItemToBuy().stackSize;
        }
    }

    public MerchantRecipeList getRecipes(EntityPlayer var1)
    {
        if (this.buyingList == null)
        {
            this.addDefaultEquipmentAndRecipies(20);
        }

        return this.buyingList;
    }

    private float func_82188_j(float var1)
    {
        float var2 = var1 + this.field_82191_bN;
        return var2 > 0.9F ? 0.9F - (var2 - 0.9F) : var2;
    }

    private void addDefaultEquipmentAndRecipies(int var1)
    {
        if (this.buyingList != null)
        {
            this.field_82191_bN = MathHelper.sqrt_float((float)this.buyingList.size()) * 0.2F;
        }
        else
        {
            this.field_82191_bN = 0.0F;
        }

        MerchantRecipeList var2 = new MerchantRecipeList();

        switch (this.getProfession())
        {
            default:
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 4, 0), new ItemStack(IceikaItemHelper.santaHelmet.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 4, 0), new ItemStack(IceikaItemHelper.santaBody.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 4, 0), new ItemStack(IceikaItemHelper.santaLegs.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 4, 0), new ItemStack(IceikaItemHelper.santaBoots.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 1, 0), new ItemStack(IceikaItemHelper.eggNog.itemID, 2, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 1, 0), new ItemStack(IceikaItemHelper.chocolateLog.itemID, 5, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 1, 0), new ItemStack(IceikaItemHelper.pepperMints.itemID, 15, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 1, 0), new ItemStack(IceikaItemHelper.fruitCake.itemID, 3, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 15, 0), new ItemStack(IceikaItemHelper.icicleBane.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 3, 0), new ItemStack(IceikaBlockHelper.giftBox.blockID, 1, 0)));
                //TODO: Xmas lights and candy canes removed untill we get them working --Maz
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.blueXmasLights.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.greenXmasLights.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.redXmasLights.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.yellowXmasLights.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.purpleXmasLights.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.redCandyCane.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.greenCandyCane.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 0), new ItemStack(IceikaBlockHelper.blueCandyCane.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 1), new ItemStack(IceikaBlockHelper.yellowCandyCane.blockID, 4, 0)));
//                var2.add(new MerchantRecipe(new ItemStack(IceikaItemHelper.snowFlake.itemID, 2, 1), new ItemStack(IceikaBlockHelper.purpleCandyCane.blockID, 4, 0)));
                
                if (this.buyingList == null)
                {
                    this.buyingList = new MerchantRecipeList();
                }

                for (int var3 = 0; var3 < var1 && var3 < var2.size(); ++var3)
                {
                    this.buyingList.addToListWithCheck((MerchantRecipe)var2.get(var3));
                }
        }
    }

    @SideOnly(Side.CLIENT)
    public void setRecipes(MerchantRecipeList var1) {}

    public static void addMerchantItem(MerchantRecipeList var0, int var1, Random var2, float var3)
    {
        if (var2.nextFloat() < var3)
        {
            var0.add(new MerchantRecipe(getRandomSizedStack(var1, var2), OverworldItemHelper.divineShard));
        }
    }

    private static ItemStack getRandomSizedStack(int var0, Random var1)
    {
        return new ItemStack(var0, getRandomCountForItem(var0, var1), 0);
    }

    private static int getRandomCountForItem(int var0, Random var1)
    {
        Tuple var2 = (Tuple)villagerStockList.get(Integer.valueOf(var0));
        return var2 == null ? 1 : (((Integer)var2.getFirst()).intValue() >= ((Integer)var2.getSecond()).intValue() ? ((Integer)var2.getFirst()).intValue() : ((Integer)var2.getFirst()).intValue() + var1.nextInt(((Integer)var2.getSecond()).intValue() - ((Integer)var2.getFirst()).intValue()));
    }

    public static void addBlacksmithItem(MerchantRecipeList var0, int var1, Random var2, float var3)
    {
        if (var2.nextFloat() < var3)
        {
            int var4 = getRandomCountForBlacksmithItem(var1, var2);
            ItemStack var5;
            ItemStack var6;

            if (var4 < 0)
            {
                var5 = new ItemStack(TwilightItemHelper.DraviteShards.itemID, 1, 0);
                var6 = new ItemStack(var1, -var4, 0);
            }
            else
            {
                var5 = new ItemStack(TwilightItemHelper.DraviteShards.itemID, var4, 0);
                var6 = new ItemStack(var1, 1, 0);
            }

            var0.add(new MerchantRecipe(var5, var6));
        }
    }

    private static int getRandomCountForBlacksmithItem(int var0, Random var1)
    {
        Tuple var2 = (Tuple)blacksmithSellingList.get(Integer.valueOf(var0));
        return var2 == null ? 1 : (((Integer)var2.getFirst()).intValue() >= ((Integer)var2.getSecond()).intValue() ? ((Integer)var2.getFirst()).intValue() : ((Integer)var2.getFirst()).intValue() + var1.nextInt(((Integer)var2.getSecond()).intValue() - ((Integer)var2.getFirst()).intValue()));
    }

    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte var1)
    {
        if (var1 == 12)
        {
            this.generateRandomParticles("heart");
        }
        else if (var1 == 13)
        {
            this.generateRandomParticles("angryVillager");
        }
        else if (var1 == 14)
        {
            this.generateRandomParticles("happyVillager");
        }
        else
        {
            super.handleHealthUpdate(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    private void generateRandomParticles(String var1)
    {
        for (int var2 = 0; var2 < 5; ++var2)
        {
            double var3 = this.rand.nextGaussian() * 0.02D;
            double var5 = this.rand.nextGaussian() * 0.02D;
            double var7 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(var1, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 1.0D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, var3, var5, var7);
        }
    }

    public void func_82187_q()
    {
        this.field_82190_bM = true;
    }

    public IMerchant leornaInv()
    {
        return this;
    }
}
