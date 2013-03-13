package xolova.blued00r.divinerpg.entities.mobs.traders;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
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
import xolova.blued00r.divinerpg.DivineRPG;
import xolova.blued00r.divinerpg.entities.ai.EntityAIDivineLookAtTradePlayer;
import xolova.blued00r.divinerpg.entities.ai.EntityAIDivinePlay;
import xolova.blued00r.divinerpg.entities.ai.EntityAIDivineTradePlayer;
import xolova.blued00r.divinerpg.utils.AchievementPageDivineRPG;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityJackOMan extends EntityMob implements INpc, IMerchant, IMob
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
    private static final ItemStack defaultHeldItem = new ItemStack(DivineRPG.scythe, 1);

    public EntityJackOMan(World var1)
    {
        this(var1, 0);
    }

    public EntityJackOMan(World var1, int var2)
    {
        super(var1);
        this.randomTickDivider = 0;
        this.isMating = false;
        this.isPlaying = false;
        this.villageObj = null;
        this.texture = "/mob/JackOMan.png";
        this.moveSpeed = 0.5F;
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.3F, 0.35F));
        this.tasks.addTask(1, new EntityAIDivineTradePlayer(this));
        this.tasks.addTask(1, new EntityAIDivineLookAtTradePlayer(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTwardsRestriction(this, 0.3F));
        this.tasks.addTask(8, new EntityAIDivinePlay(this, 0.32F));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityJackOMan.class, 5.0F, 0.02F));
        this.tasks.addTask(9, new EntityAIWander(this, 0.3F));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
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
                this.detachHome();
            }
            else
            {
                ChunkCoordinates var1 = this.villageObj.getCenter();
                this.setHomeArea(var1.posX, var1.posY, var1.posZ, (int)((float)this.villageObj.getVillageRadius() * 0.6F));

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
                                var2.func_82783_a(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
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
            		var1.addChatMessage("Jack'O Man: BOO!");
            		break;
            	case 1:
            		var1.addChatMessage("Jack'O Man: I seem to have lost my head.");
            		break;
            	case 2:
            		var1.addChatMessage("Jack'O Man: HURAH!");
            		break;
            	case 3:
            		var1.addChatMessage("Jack'O Man: Have you seen my head?");
            		break;
            	}
                
                var1.openGui(DivineRPG.instance, 9, this.worldObj, this.entityId, 0, 0);
                var1.addStat(AchievementPageDivineRPG.halloweenSpirit, 1);
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
        this.dataWatcher.addObject(16, Integer.valueOf(0));
    }

    public int getMaxHealth()
    {
        return 1000;
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

    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture's file path as a String.
     */
    public String getTexture()
    {
        switch (this.getProfession())
        {
            case 0:
                return "/mob/JackOMan.png";

            case 1:
                return "/mob/JackOMan.png";

            case 2:
                return "/mob/JackOMan.png";

            case 3:
                return "/mob/JackOMan.png";

            case 4:
                return "/mob/JackOMan.png";

            default:
                return VillagerRegistry.getVillagerSkin(this.getProfession(), super.getTexture());
        }
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.JackOMan";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.JackOMan";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.JackOMan";
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

    public void setRevengeTarget(EntityLiving var1)
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
        this.wealth += var1.getItemToBuy().stackSize;
    }

    public MerchantRecipeList getRecipes(EntityPlayer var1)
    {
        if (this.buyingList == null)
        {
            this.addDefaultEquipmentAndRecipies(13);
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
                var2.add(new MerchantRecipe(new ItemStack(Item.bone, 60), new ItemStack(Item.spiderEye, 60), new ItemStack(DivineRPG.skeleManHead.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.bone, 60), new ItemStack(Item.spiderEye, 60), new ItemStack(DivineRPG.skeleManBody.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.bone, 60), new ItemStack(Item.spiderEye, 60), new ItemStack(DivineRPG.skeleManLegs.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.bone, 40), new ItemStack(Item.spiderEye, 60), new ItemStack(DivineRPG.skeleManBoots.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Block.pumpkin, 50), new ItemStack(Item.eyeOfEnder, 10), new ItemStack(DivineRPG.jackOManHead.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Block.pumpkin, 50), new ItemStack(Item.eyeOfEnder, 10), new ItemStack(DivineRPG.jackOManBody.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Block.pumpkin, 50), new ItemStack(Item.eyeOfEnder, 10), new ItemStack(DivineRPG.jackOManLegs.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Block.pumpkin, 50), new ItemStack(Item.eyeOfEnder, 10), new ItemStack(DivineRPG.jackOManBoots.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.skull, 3, 1), new ItemStack(DivineRPG.grimReaperHead.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.skull, 5, 1), new ItemStack(DivineRPG.grimReaperBody.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.skull, 4, 1), new ItemStack(DivineRPG.grimReaperLegs.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.skull, 2, 1), new ItemStack(DivineRPG.grimReaperBoots.itemID, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(Item.skull, 6, 1), new ItemStack(Item.eyeOfEnder, 60), new ItemStack(DivineRPG.scythe.itemID, 1, 0)));

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
            var0.add(new MerchantRecipe(getRandomSizedStack(var1, var2), DivineRPG.yellowShard));
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
                var5 = new ItemStack(DivineRPG.yellowShard.itemID, 1, 0);
                var6 = new ItemStack(var1, -var4, 0);
            }
            else
            {
                var5 = new ItemStack(DivineRPG.yellowShard.itemID, var4, 0);
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

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    public void func_82187_q()
    {
        this.field_82190_bM = true;
    }

    static
    {
        villagerStockList.put(Integer.valueOf(Item.coal.itemID), new Tuple(Integer.valueOf(16), Integer.valueOf(24)));
        villagerStockList.put(Integer.valueOf(Item.ingotIron.itemID), new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
        villagerStockList.put(Integer.valueOf(Item.ingotGold.itemID), new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
        villagerStockList.put(Integer.valueOf(Item.diamond.itemID), new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
        villagerStockList.put(Integer.valueOf(Item.paper.itemID), new Tuple(Integer.valueOf(24), Integer.valueOf(36)));
        villagerStockList.put(Integer.valueOf(Item.book.itemID), new Tuple(Integer.valueOf(11), Integer.valueOf(13)));
        villagerStockList.put(Integer.valueOf(Item.writtenBook.itemID), new Tuple(Integer.valueOf(1), Integer.valueOf(1)));
        villagerStockList.put(Integer.valueOf(Item.enderPearl.itemID), new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
        villagerStockList.put(Integer.valueOf(Item.eyeOfEnder.itemID), new Tuple(Integer.valueOf(2), Integer.valueOf(3)));
        villagerStockList.put(Integer.valueOf(Item.porkRaw.itemID), new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
        villagerStockList.put(Integer.valueOf(Item.beefRaw.itemID), new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
        villagerStockList.put(Integer.valueOf(Item.chickenRaw.itemID), new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
        villagerStockList.put(Integer.valueOf(Item.fishCooked.itemID), new Tuple(Integer.valueOf(9), Integer.valueOf(13)));
        villagerStockList.put(Integer.valueOf(Item.seeds.itemID), new Tuple(Integer.valueOf(34), Integer.valueOf(48)));
        villagerStockList.put(Integer.valueOf(Item.melonSeeds.itemID), new Tuple(Integer.valueOf(30), Integer.valueOf(38)));
        villagerStockList.put(Integer.valueOf(Item.pumpkinSeeds.itemID), new Tuple(Integer.valueOf(30), Integer.valueOf(38)));
        villagerStockList.put(Integer.valueOf(Item.wheat.itemID), new Tuple(Integer.valueOf(18), Integer.valueOf(22)));
        villagerStockList.put(Integer.valueOf(Block.cloth.blockID), new Tuple(Integer.valueOf(14), Integer.valueOf(22)));
        villagerStockList.put(Integer.valueOf(Item.rottenFlesh.itemID), new Tuple(Integer.valueOf(36), Integer.valueOf(64)));
        blacksmithSellingList.put(Integer.valueOf(Item.flintAndSteel.itemID), new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
        blacksmithSellingList.put(Integer.valueOf(Item.shears.itemID), new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
        blacksmithSellingList.put(Integer.valueOf(Item.swordSteel.itemID), new Tuple(Integer.valueOf(7), Integer.valueOf(11)));
        blacksmithSellingList.put(Integer.valueOf(Item.swordDiamond.itemID), new Tuple(Integer.valueOf(12), Integer.valueOf(14)));
        blacksmithSellingList.put(Integer.valueOf(Item.axeSteel.itemID), new Tuple(Integer.valueOf(6), Integer.valueOf(8)));
        blacksmithSellingList.put(Integer.valueOf(Item.axeDiamond.itemID), new Tuple(Integer.valueOf(9), Integer.valueOf(12)));
        blacksmithSellingList.put(Integer.valueOf(Item.pickaxeSteel.itemID), new Tuple(Integer.valueOf(7), Integer.valueOf(9)));
        blacksmithSellingList.put(Integer.valueOf(Item.pickaxeDiamond.itemID), new Tuple(Integer.valueOf(10), Integer.valueOf(12)));
        blacksmithSellingList.put(Integer.valueOf(Item.shovelSteel.itemID), new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
        blacksmithSellingList.put(Integer.valueOf(Item.shovelDiamond.itemID), new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
        blacksmithSellingList.put(Integer.valueOf(Item.hoeSteel.itemID), new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
        blacksmithSellingList.put(Integer.valueOf(Item.hoeDiamond.itemID), new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
        blacksmithSellingList.put(Integer.valueOf(Item.bootsSteel.itemID), new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
        blacksmithSellingList.put(Integer.valueOf(Item.bootsDiamond.itemID), new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
        blacksmithSellingList.put(Integer.valueOf(Item.helmetSteel.itemID), new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
        blacksmithSellingList.put(Integer.valueOf(Item.helmetDiamond.itemID), new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
        blacksmithSellingList.put(Integer.valueOf(Item.plateSteel.itemID), new Tuple(Integer.valueOf(10), Integer.valueOf(14)));
        blacksmithSellingList.put(Integer.valueOf(Item.plateDiamond.itemID), new Tuple(Integer.valueOf(16), Integer.valueOf(19)));
        blacksmithSellingList.put(Integer.valueOf(Item.legsSteel.itemID), new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
        blacksmithSellingList.put(Integer.valueOf(Item.legsDiamond.itemID), new Tuple(Integer.valueOf(11), Integer.valueOf(14)));
        blacksmithSellingList.put(Integer.valueOf(Item.bootsChain.itemID), new Tuple(Integer.valueOf(5), Integer.valueOf(7)));
        blacksmithSellingList.put(Integer.valueOf(Item.helmetChain.itemID), new Tuple(Integer.valueOf(5), Integer.valueOf(7)));
        blacksmithSellingList.put(Integer.valueOf(Item.plateChain.itemID), new Tuple(Integer.valueOf(11), Integer.valueOf(15)));
        blacksmithSellingList.put(Integer.valueOf(Item.legsChain.itemID), new Tuple(Integer.valueOf(9), Integer.valueOf(11)));
        blacksmithSellingList.put(Integer.valueOf(Item.bread.itemID), new Tuple(Integer.valueOf(-4), Integer.valueOf(-2)));
        blacksmithSellingList.put(Integer.valueOf(Item.melon.itemID), new Tuple(Integer.valueOf(-8), Integer.valueOf(-4)));
        blacksmithSellingList.put(Integer.valueOf(Item.appleRed.itemID), new Tuple(Integer.valueOf(-8), Integer.valueOf(-4)));
        blacksmithSellingList.put(Integer.valueOf(Item.cookie.itemID), new Tuple(Integer.valueOf(-10), Integer.valueOf(-7)));
        blacksmithSellingList.put(Integer.valueOf(Block.glass.blockID), new Tuple(Integer.valueOf(-5), Integer.valueOf(-3)));
        blacksmithSellingList.put(Integer.valueOf(Block.bookShelf.blockID), new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
        blacksmithSellingList.put(Integer.valueOf(Item.plateLeather.itemID), new Tuple(Integer.valueOf(4), Integer.valueOf(5)));
        blacksmithSellingList.put(Integer.valueOf(Item.bootsLeather.itemID), new Tuple(Integer.valueOf(2), Integer.valueOf(4)));
        blacksmithSellingList.put(Integer.valueOf(Item.helmetLeather.itemID), new Tuple(Integer.valueOf(2), Integer.valueOf(4)));
        blacksmithSellingList.put(Integer.valueOf(Item.legsLeather.itemID), new Tuple(Integer.valueOf(2), Integer.valueOf(4)));
        blacksmithSellingList.put(Integer.valueOf(Item.saddle.itemID), new Tuple(Integer.valueOf(6), Integer.valueOf(8)));
        blacksmithSellingList.put(Integer.valueOf(Item.expBottle.itemID), new Tuple(Integer.valueOf(-4), Integer.valueOf(-1)));
        blacksmithSellingList.put(Integer.valueOf(Item.redstone.itemID), new Tuple(Integer.valueOf(-4), Integer.valueOf(-1)));
        blacksmithSellingList.put(Integer.valueOf(Item.compass.itemID), new Tuple(Integer.valueOf(10), Integer.valueOf(12)));
        blacksmithSellingList.put(Integer.valueOf(Item.pocketSundial.itemID), new Tuple(Integer.valueOf(10), Integer.valueOf(12)));
        blacksmithSellingList.put(Integer.valueOf(Block.glowStone.blockID), new Tuple(Integer.valueOf(-3), Integer.valueOf(-1)));
        blacksmithSellingList.put(Integer.valueOf(Item.porkCooked.itemID), new Tuple(Integer.valueOf(-7), Integer.valueOf(-5)));
        blacksmithSellingList.put(Integer.valueOf(Item.beefCooked.itemID), new Tuple(Integer.valueOf(-7), Integer.valueOf(-5)));
        blacksmithSellingList.put(Integer.valueOf(Item.chickenCooked.itemID), new Tuple(Integer.valueOf(-8), Integer.valueOf(-6)));
        blacksmithSellingList.put(Integer.valueOf(Item.eyeOfEnder.itemID), new Tuple(Integer.valueOf(7), Integer.valueOf(11)));
        blacksmithSellingList.put(Integer.valueOf(Item.arrow.itemID), new Tuple(Integer.valueOf(-12), Integer.valueOf(-8)));
    }

	public IMerchant leornaInv() {
		return this;
	}
}
