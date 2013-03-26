package xolova.divinerpg.entities.core;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityDivineRPGArrow extends EntityArrow {

	public static String[] TEXTURES = new String[] {
		"/item/arrow.png"
	};
	
	/** Stack to pickup on player collision **/
	ItemStack pickupStack = new ItemStack(Item.arrow, 1);
	
	public EntityDivineRPGArrow(World par1World, int arrowID) {
		super(par1World);
        setID(arrowID);
	}
	
    public EntityDivineRPGArrow(World var1, double var2, double var4, double var6, int arrowID)  {
        super(var1, var2, var4, var6);
        setID(arrowID);
    }
    
    public EntityDivineRPGArrow(World var1, EntityLiving var2, EntityLiving var3, float var4, float var5, int arrowID) {
        super(var1, var2, var3, var4, var5);
        setID(arrowID);
    }
    
    public EntityDivineRPGArrow(World var1, EntityLiving var2, float var3, int arrowID) {
        super(var1, var2, var3);
        setID(arrowID);
    }
    
    @Override
    protected void entityInit() {
    	super.entityInit();
    	dataWatcher.addObject(12, 0);
    	dataWatcher.setObjectWatched(12);
    }
    
    // Set the Index in the TEXTURES array that the texture for this arrow
    // should be loaded for the render
    public void setID(int id) {
    	dataWatcher.updateObject(12, id);
    }
    
    public int getID() {
    	return dataWatcher.getWatchableObjectInt(12);
    }
    
    @Override
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer){
        if (!worldObj.isRemote && isInGround() && arrowShake <= 0) {
            boolean canPickup = canBePickedUp == 1 || canBePickedUp == 2 && par1EntityPlayer.capabilities.isCreativeMode;

            if (canBePickedUp == 1 && !par1EntityPlayer.inventory.addItemStackToInventory(pickupStack));
                canPickup = false;

            if (canPickup) {
                playSound("random.pop", 0.2F, ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
                par1EntityPlayer.onItemPickup(this, 1);
                setDead();
            }
        }
    }
    
    // Reflection method to get the inGround field
    public boolean isInGround() {
    	return ReflectionHelper.getPrivateValue(EntityArrow.class, this, 5);
    }
}
