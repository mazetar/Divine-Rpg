package xolova.blued00r.divinerpg.items;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemMiniBricks extends ItemBlock
{
    public String[] blockNames = new String[] {"Glass Slab", "Dirt Slab", "Bedrock Slab", "Iron Slab", "Gold Slab", "Diamond Slab", "Mossy Cobblestone Slab", "Obsidian Slab", "Netherbrick Slab", "Netherrack Slab", "Glowstone Slab", "Lapis Lazuli Slab", "test", "test1", "test2", "test3"};

    public ItemMiniBricks(int var1)
    {
        super(var1);
        this.setMaxDamage(0);
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
