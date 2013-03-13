package xolova.blued00r.divinerpg.items;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemVanillaCombination extends ItemBlock
{
    public String[] blockNames = new String[] {"Glass Slab", "Dirt Slab", "Bedrock Slab", "Iron Slab", "Gold Slab", "Diamond Slab", "Mossy Cobblestone Slab", "Obsidian Slab", "Netherbrick Slab", "Netherrack Slab", "Glowstone Slab", "Lapis Lazuli Slab"};

    public ItemVanillaCombination(int var1)
    {
        super(var1);
        this.setHasSubtypes(true);
    }

    public String getItemNameIS(ItemStack var1)
    {
        return super.getItemName() + "." + this.blockNames[var1.getItemDamage()];
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int var1)
    {
        return var1;
    }
}
