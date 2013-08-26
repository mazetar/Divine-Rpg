package net.divinerpg.items.iceika;

import java.util.List;

import net.divinerpg.entities.overworld.projectile.EntityExplosiveArrow;
import net.divinerpg.items.core.ItemDivineRPGBow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSnowStormBow extends ItemDivineRPGBow {

    public ItemSnowStormBow(int var1) {
        super(var1, -1, 2, 144000, true);
		setIconIndex(3, 10, 14);
    }
    
    @Override
    public EntityArrow spawnArrow(ItemStack stack, World world, EntityPlayer player, float time) {
    	return new EntityExplosiveArrow(world, player, time);
    }
    
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
    	par3List.add("Shoots Explosive Arrows");
    }

}
