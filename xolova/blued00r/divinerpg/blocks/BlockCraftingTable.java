
package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockCraftingTable extends Block
{
    public BlockCraftingTable(int var1)
    {
        super(var1, Material.wood);
        this.blockIndexInTexture = 59;
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        if (!var1.isRemote)
        {
            return true;
        }
        else
        {
            var5.openGui(DivineRPG.instance, 1, var1, var2, var3, var4);
            return true;
        }
    }
}
