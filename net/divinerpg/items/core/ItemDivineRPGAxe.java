package net.divinerpg.items.core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


/**
 * @author BossLetsPlays
 *
 * DivineRPG
 *
 * ItemDivineRPGAxe
 *
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ItemDivineRPGAxe extends ItemAxe{
	

	private float weaponDamage;
    private final EnumToolMaterial toolMaterial;

    public ItemDivineRPGAxe(int id, EnumToolMaterial toolMaterial)
    {
        super(id - 256, toolMaterial);
        this.toolMaterial = toolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(toolMaterial.getMaxUses());
        this.weaponDamage = 0 + toolMaterial.getDamageVsEntity();
    }

    @Override
    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct block type, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && par2Block.blockMaterial == Material.wood ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }

    
    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouse over description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Efficiency: " + this.toolMaterial.getEfficiencyOnProperMaterial());
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
    

    
}
