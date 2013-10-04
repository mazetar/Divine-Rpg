package net.divinerpg.items.core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ISpecialArmor;

public class DivineArmor extends ItemArmor implements ISpecialArmor {

    
    boolean isGlowing;
    ArmorProperties armorProperties;
    String name;
    
    public DivineArmor(int ID, EnumArmorMaterial armorMaterial,
            int renderIndex, int armorType, boolean isGlowing, ArmorProperties properties) {
        super(ID, armorMaterial, renderIndex, armorType);
        this.isGlowing = isGlowing;
        this.name = armorMaterial.name();
        this.setCreativeTab(DivineTabs.tabArmor);
        this.armorProperties = properties;
        func_111206_d(name);
        this.setUnlocalizedName(name + getSlotName());
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Reference.MAIN_MOD_ID + ":" + name + getSlotName());
    }

    private String getSlotName() {
        if (armorType == 0)
            return "Helmet";
        else if (armorType == 1)
            return "Body";
        else if (armorType == 2)
            return "Legs";
        else if (armorType == 3)
            return "Boots";
        else 
            return "" +armorType;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player,
            ItemStack armor, DamageSource source, double damage, int slot) {
        return armorProperties;
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        
        return armorProperties.Priority;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack,
            DamageSource source, int damage, int slot) {
        
        
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack, int pass) {
        return isGlowing;
    }

}
