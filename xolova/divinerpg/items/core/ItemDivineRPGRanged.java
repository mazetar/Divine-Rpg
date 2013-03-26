package xolova.divinerpg.items.core;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.items.ItemDivineRPG;

public abstract class ItemDivineRPGRanged extends ItemDivineRPG {

	boolean unbreakable;
	boolean displayDamageMeter = true;
	protected int dmg;
	
	int ammoID = -1;
	
	public ItemDivineRPGRanged(int id, int maxDmg, int weaponDmg) {
		this(id, maxDmg, weaponDmg, false);
	}
	
	public ItemDivineRPGRanged(int id, int maxDmg, int weaponDmg, boolean unbreakable) {
		super(id);
		setMaxDamage(maxDmg);
		setMaxStackSize(1);
		dmg = weaponDmg;
	}
	
	public ItemDivineRPGRanged setAmmoID(int id) {
		ammoID = id;
		return this;
	}
	
	/** Simply sets a boolean that controls if the damage
	 * meter should appear in the tooltip, it shouldn't for
	 * consumable items **/
	public ItemDivineRPGRanged setConsumable() {
		displayDamageMeter = false;
		return this;
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3) {
        if (!var2.isRemote && checkAndConsumeAmmo(var1, var2, var3)) {
        	if(sound(var1, var2, var3) != null)
        		var2.playSoundAtEntity(var3, sound(var1, var2, var3), 1.0F, 1.0F);
           
        	var2.spawnEntityInWorld(projectile(var1, var2, var3));
            if(!unbreakable)
            	var1.damageItem(1, var3);
            
            var1 = consume(var1, var2, var3);
        }

        return var1;
    }
	
	public boolean checkAndConsumeAmmo(ItemStack stack, World world, EntityPlayer player) {
		if(ammoID == -1 || player.capabilities.isCreativeMode)
			return true; // No ammo required
		
		return player.inventory.consumeInventoryItem(ammoID);
	}
	
	// Used for consumable ranged items
	public ItemStack consume(ItemStack var1, World var2, EntityPlayer var3) {
		return var1;
	}
	
	public String sound(ItemStack stack, World world, EntityPlayer player) {
		return null;
	}
	
	public abstract Entity projectile(ItemStack stack, World world, EntityPlayer player);
	
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(dmg + " Ranged Damage");
        if(maxStackSize == 1 && displayDamageMeter) // Check if the item isn't a consumable
        	par3List.add(!unbreakable ? (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
        if(ammoID != -1 )
        	par3List.add("Ammo: " + Item.itemsList[ammoID].getItemDisplayName(new ItemStack(Item.itemsList[ammoID])));
    }
	
}
