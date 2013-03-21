package xolova.blued00r.divinerpg.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemPurpleSeeds extends Item
{
    private int blockType;
    private int soilBlockID;

    public ItemPurpleSeeds(int var1, int var2, int var3)
    {
        super(var1);
        this.blockType = var2;
        this.soilBlockID = var3;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
        {
            return false;
        }
        else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
        {
            int var11 = var3.getBlockId(var4, var5, var6);

            if (var11 == this.soilBlockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlockWithNotify(var4, var5 + 1, var6, this.blockType);
                var3.setBlockWithNotify(var4, var5 + 2, var6, DivineRPG.purpleGlowBoneTree.blockID);
                --var1.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
