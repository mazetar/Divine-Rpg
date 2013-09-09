package net.divinerpg.items.core;

import java.util.List;

import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/***
 *  Base class for all Divine Bows.
 *  It expects a call to func_111206_d(textureName) aka. setItemTextureName(String textureName)
 *  The string should be the bow's name. and it will expect to find the following textures for the bow inside assets:
 *  "textureName_0", "textureName_1", "textureName_2" "textureName_3"
 * @author Mazetar
 *
 */
public class DivineBow extends ItemBow {
    
	public static final int DEFAULT_MAX_USE_DURACTION = 72000;
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;
	
	int damage;
	int maxUseDuraction;
	boolean unbreakable;
	
	int arrowID;
	
	public DivineBow(int id, int maxDamage, int damage, boolean unbreakable) {
		this(id, maxDamage, damage, DEFAULT_MAX_USE_DURACTION, unbreakable);
	}
	
	public DivineBow(int id, int maxDamage, int damage, int maxUseDuraction, boolean unbreakable) {
		super(id - 256);
		setMaxDamage(maxDamage);
		this.damage = damage;
		this.maxUseDuraction = maxUseDuraction;
		this.unbreakable = unbreakable;
        this.maxStackSize = 1;
		this.setCreativeTab(DivineTabs.tabRanged);
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(this.func_111208_A() + "_0");
        this.iconArray = new Icon[3];

        this.iconArray[0] = par1IconRegister.registerIcon(this.func_111208_A() + "_1");
        this.iconArray[1] = par1IconRegister.registerIcon(this.func_111208_A() + "_2");
        this.iconArray[2] = par1IconRegister.registerIcon(this.func_111208_A() + "_3");
        
    }    
    
    @SideOnly(Side.CLIENT)
    @Override
    /**
     * used to cycle through icons based on their used duration, i.e. for the bow
     */
    public Icon getItemIconForUseDuration(int par1)
    {
        return this.iconArray[par1];
    }
	
	@Override
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
        int j = getMaxItemUseDuration(par1ItemStack) - par4;

        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
            return;
        j = event.charge;

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(arrowID)){
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;
            
            if ((double)f < 0.1D)
                return;

            if (f > 1.0F)
                f = 1.0F;

            EntityArrow entityarrow = spawnArrow(par1ItemStack, par2World, par3EntityPlayer, f * 2F);

            if (f == 1.0F)
                entityarrow.setIsCritical(true);

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (k > 0)
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (l > 0)
                entityarrow.setKnockbackStrength(l);

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
                entityarrow.setFire(100);

            if(!unbreakable)
            	par1ItemStack.damageItem(1, par3EntityPlayer);
            if(sound(par1ItemStack, par2World, par3EntityPlayer) != null)
            	par2World.playSoundAtEntity(par3EntityPlayer, sound(par1ItemStack, par2World, par3EntityPlayer), 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
                entityarrow.canBePickedUp = 2;
            else par3EntityPlayer.inventory.consumeInventoryItem(arrowID);

            if (!par2World.isRemote)
                par2World.spawnEntityInWorld(entityarrow);
        }
    }
	
	public EntityArrow spawnArrow(ItemStack stack, World world, EntityPlayer player, float time) {
		return new EntityArrow(world, player, time);
	}
	
	public String sound(ItemStack stack, World world, EntityPlayer player) {
		return "random.bow";
	}
	
	public void setArrow(int arrow) {
		this.arrowID = arrow;
	}
	
	// helper method
	public static int getUseLevel(int useDuration) {
		return useDuration >= 18 ? 3 : useDuration > 3 ? 2 : useDuration > 0 ? 1 : 0;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return maxUseDuraction;
	}
	
	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}
	
	@Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(damage + " Ranged Damage");
        double speed = (double) DEFAULT_MAX_USE_DURACTION / (double) getMaxItemUseDuration(par1ItemStack);
        if(speed > 1)
        	par3List.add(speed + " Times Faster");
        if(speed < 1)
        	par3List.add((1 / speed) + " Times Slower");
        par3List.add(!unbreakable ? (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
    }
}
